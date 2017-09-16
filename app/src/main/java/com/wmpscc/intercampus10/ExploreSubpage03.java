package com.wmpscc.intercampus10;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

import me.drakeet.multitype.Items;
import me.drakeet.multitype.MultiTypeAdapter;


public class ExploreSubpage03 extends Fragment {
    private RecyclerView recyclerView;
    private MultiTypeAdapter adapter;
    private Items items;
    private View view;
    private Button btInt;
    private RelativeLayout RV;

    public ExploreSubpage03() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.fragment_explore_subpage03,container,false);
        initRecycleItems();
        btInt=view.findViewById(R.id.btInt);
        RV=view.findViewById(R.id.Re04_colInt);



        return view;
    }

    private void initRecycleItems()
    {
        recyclerView=view.findViewById(R.id.rvlist_e3);
        adapter=new MultiTypeAdapter();
        adapter.register(Card_ColumnIntroduceFragment.class,new Card_ColumnIntroduceFragmentViewBinder());
        recyclerView.setAdapter(adapter);
        items=new Items();
        items.add(new Card_ColumnIntroduceFragment());
        items.add(new Card_ColumnIntroduceFragment());
        items.add(new Card_ColumnIntroduceFragment());
        items.add(new Card_ColumnIntroduceFragment());
        items.add(new Card_ColumnIntroduceFragment());


        adapter.setItems(items);
        adapter.notifyDataSetChanged();

    }

}
