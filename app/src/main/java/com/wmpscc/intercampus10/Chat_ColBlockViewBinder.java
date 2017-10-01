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
 * Created by wmpscc on 2017/10/1.
 */
public class Chat_ColBlockViewBinder extends ItemViewBinder<Chat_ColBlock, Chat_ColBlockViewBinder.ViewHolder> {

    private View root;
    private RecyclerView recyclerView;
    private MultiTypeAdapter adapter;
    private Items items;



    @NonNull
    @Override
    protected ViewHolder onCreateViewHolder(
            @NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        root = inflater.inflate(R.layout.item_chat__col_block, parent, false);
        recyclerView=root.findViewById(R.id.rvlist_colblock);
        recyclerView.setLayoutManager(new LinearLayoutManager(root.getContext(),LinearLayoutManager.HORIZONTAL,false));
        initRecycleItems();

        return new ViewHolder(root);
    }

    void initRecycleItems()
    {
        adapter=new MultiTypeAdapter();
        adapter.register(Chat_ColBlock_detail.class,new Chat_ColBlock_detailViewBinder());


        recyclerView.setAdapter(adapter);
        items=new Items();
        items.add(new Chat_ColBlock_detail());
        items.add(new Chat_ColBlock_detail());
        items.add(new Chat_ColBlock_detail());
        items.add(new Chat_ColBlock_detail());
        items.add(new Chat_ColBlock_detail());

        adapter.setItems(items);
        adapter.notifyDataSetChanged();


    }


    @Override
    protected void onBindViewHolder(@NonNull ViewHolder holder, @NonNull Chat_ColBlock chat_ColBlock) {

    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
