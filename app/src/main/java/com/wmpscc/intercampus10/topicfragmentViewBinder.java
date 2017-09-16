package com.wmpscc.intercampus10;

import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.drakeet.multitype.ItemViewBinder;
import me.drakeet.multitype.Items;
import me.drakeet.multitype.MultiTypeAdapter;

/**
 * Created by wmpscc on 2017/9/16.
 */
public class topicfragmentViewBinder extends ItemViewBinder<topicfragment, topicfragmentViewBinder.ViewHolder> {

    private RecyclerView recyclerView;
    private MultiTypeAdapter adapter;
    private Items items;
    private View view;
    @NonNull
    @Override
    protected ViewHolder onCreateViewHolder(
            @NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        view = inflater.inflate(R.layout.item_topicfragment, parent, false);
        recyclerView=view.findViewById(R.id.rvlist_topic);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(),
                LinearLayoutManager.HORIZONTAL,false));
        initRecycleviewItems();
        return new ViewHolder(view);
    }


    private void initRecycleviewItems()
    {
        adapter=new MultiTypeAdapter();
        adapter.register(Card_TopicBlock.class,new Card_TopicBlockViewBinder());

        recyclerView.setAdapter(adapter);
        items=new Items();
        items.add(new Card_TopicBlock());
        items.add(new Card_TopicBlock());
        items.add(new Card_TopicBlock());
        items.add(new Card_TopicBlock());
        items.add(new Card_TopicBlock());
        items.add(new Card_TopicBlock());
        items.add(new Card_TopicBlock());
        items.add(new Card_TopicBlock());
        items.add(new Card_TopicBlock());
        items.add(new Card_TopicBlock());
        adapter.setItems(items);
        adapter.notifyDataSetChanged();

    }
    @Override
    protected void onBindViewHolder(@NonNull ViewHolder holder, @NonNull topicfragment topicfragment) {

    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
