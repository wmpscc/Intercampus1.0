package com.wmpscc.intercampus10;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.drakeet.multitype.Items;
import me.drakeet.multitype.MultiTypeAdapter;


public class Home extends Fragment {
    private RecyclerView recyclerView;
    private MultiTypeAdapter adapter;
    private Items items;
    private View view;
    public Home() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_home,container,false);
        recyclerView=view.findViewById(R.id.rvlist_home);

        initRecycleItem();
        return view;
    }

    void initRecycleItem(){
        adapter=new MultiTypeAdapter();
        adapter.register(Banner_home.class,new Banner_homeViewBinder());
        adapter.register(Card_GenTextFragment.class,new Card_GenTextFragmentViewBinder());
        adapter.register(Card_GenImageFragment.class,new Card_GenImageFragmentViewBinder());
        adapter.register(Card_GenTextImageFragment.class,new Card_GenTextImageFragmentViewBinder());
        adapter.register(Card_ColTextImageFragment.class,new Card_ColTextImageFragmentViewBinder());
        adapter.register(guide_column.class,new guide_columnViewBinder());
        adapter.register(topicfragment.class,new topicfragmentViewBinder());
        recyclerView.setAdapter(adapter);

        items=new Items();

        items.add(new Banner_home());
        items.add(new topicfragment());
        items.add(new guide_column());
        items.add(new Card_ColTextImageFragment());
        items.add(new Card_GenTextFragment());
        items.add(new Card_GenTextFragment());
        items.add(new Card_GenTextFragment());
        items.add(new Card_GenImageFragment());
        items.add(new Card_GenTextImageFragment());
        adapter.setItems(items);
        adapter.notifyDataSetChanged();
    }
}
