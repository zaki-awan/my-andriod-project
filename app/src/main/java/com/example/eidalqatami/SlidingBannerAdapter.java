package com.example.eidalqatami;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.AbstractCollection;
import java.util.List;

public class SlidingBannerAdapter extends PagerAdapter {

    Context mCtx;
    List<SlidingBanner> slidingBannerList;

    public SlidingBannerAdapter(Context mCtx, List<SlidingBanner> slidingBannerList) {
        this.mCtx = mCtx;
        this.slidingBannerList = (List<SlidingBanner>) slidingBannerList;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater = (LayoutInflater)mCtx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View slidingBannerLayout = inflater.inflate(R.layout.sliding_banner_layout,null);
        ImageView slidingBannerImg = slidingBannerLayout.findViewById(R.id.slidoing_banner_img);
        slidingBannerImg.setImageResource(slidingBannerList.get(position).getImage());
        container.addView(slidingBannerLayout);
        return slidingBannerLayout;
    }

    @Override
    public int getCount() {
        return slidingBannerList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}
