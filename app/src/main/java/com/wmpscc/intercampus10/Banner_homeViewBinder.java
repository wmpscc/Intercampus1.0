package com.wmpscc.intercampus10;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import me.drakeet.multitype.ItemViewBinder;

/**
 * Created by wmpscc on 2017/8/29.
 */
public class Banner_homeViewBinder extends ItemViewBinder<Banner_home, Banner_homeViewBinder.ViewHolder> {
    public static List<?> images=new ArrayList<>();
    private Banner banner;
    private View view;
    @NonNull
    @Override
    protected ViewHolder onCreateViewHolder(
            @NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        view = inflater.inflate(R.layout.item_banner_home, parent, false);
        initBanner();
        return new ViewHolder(view);
    }

    @Override
    protected void onBindViewHolder(@NonNull ViewHolder holder, @NonNull Banner_home banner_home) {

    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        ViewHolder(View itemView) {
            super(itemView);
        }
    }
    void initBanner(){
//        String[] url= new String[]{"http://dwz.cn/6rIGc5", " http://dwz.cn/6rIH9k", " http://dwz.cn/6rIHiG"};
//        List list= Arrays.asList(url);
//        images=new ArrayList(list);

        List<Integer> list=new ArrayList<>();
        list.add(R.drawable.b1);
        list.add(R.drawable.b2);
        list.add(R.drawable.b3);
        banner=view.findViewById(R.id.banner);
        //设置位置
        banner.setIndicatorGravity(BannerConfig.RIGHT);

        //设置图片加载器
        banner.setImageLoader(new GlideImageLoader());
        //设置图片集合
//        banner.setImages(images);
        banner.setImages(list);
        //banner设置方法全部调用完毕时最后调用
        banner.start();
    }
}
