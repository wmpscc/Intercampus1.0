package com.wmpscc.intercampus10;

import android.content.ClipData;
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


public class Chat extends Fragment {

    private RecyclerView recyclerView;
    private MultiTypeAdapter adapter;
    private View root;
    private Items items;


    public Chat() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        root=inflater.inflate(R.layout.fragment_chat,container,false);
        recyclerView=root.findViewById(R.id.rvlist_chat);
        initRecycleItems();

        return root;
    }

    void initRecycleItems(){
        adapter=new MultiTypeAdapter();

        adapter.register(Chat_ColBlock.class,new Chat_ColBlockViewBinder());
        adapter.register(guide_genblock.class,new guide_genblockViewBinder());
        adapter.register(Chat_GenBlock.class,new Chat_GenBlockViewBinder());

        recyclerView.setAdapter(adapter);

        items=new Items();
        items.add(new Chat_ColBlock());
        items.add(new guide_genblock());
        items.add(new Chat_GenBlock());

        adapter.setItems(items);
        adapter.notifyDataSetChanged();


    }

}
