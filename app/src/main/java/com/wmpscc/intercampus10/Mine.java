package com.wmpscc.intercampus10;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.drakeet.multitype.Items;
import me.drakeet.multitype.MultiTypeAdapter;


public class Mine extends Fragment {

    private View root;
    private MultiTypeAdapter adapter;
    private Items items;
    private RecyclerView recyclerView;

    public Mine() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        root=inflater.inflate(R.layout.fragment_mine,container,false);
        recyclerView=root.findViewById(R.id.rvlist_mine);
        initRecycleItems();
        return root;

    }


    void initRecycleItems()
    {
        adapter=new MultiTypeAdapter();
        adapter.register(Mine_column.class,new Mine_columnViewBinder());
        adapter.register(guide_mine01.class,new guide_mine01ViewBinder());
        adapter.register(Chat_GenBlock.class,new Chat_GenBlockViewBinder());
        adapter.register(guide_mine02.class,new guide_mine02ViewBinder());
        adapter.register(Card_GenTextFragment.class,new Card_GenTextFragmentViewBinder());
        adapter.register(Card_GenImageFragment.class,new Card_GenImageFragmentViewBinder());
        adapter.register(Card_GenTextImageFragment.class,new Card_GenTextImageFragmentViewBinder());

        recyclerView.setAdapter(adapter);

        items=new Items();

        items.add(new Mine_column());
        items.add(new guide_mine01());
        items.add(new Chat_GenBlock());
        items.add(new Chat_GenBlock());
        items.add(new guide_mine02());
        items.add(new Card_GenImageFragment());
        items.add(new Card_GenTextFragment());
        items.add(new Card_GenTextImageFragment());

        adapter.setItems(items);
        adapter.notifyDataSetChanged();


    }
}
