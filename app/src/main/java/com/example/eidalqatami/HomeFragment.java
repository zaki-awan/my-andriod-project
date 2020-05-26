package com.example.eidalqatami;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class HomeFragment extends Fragment {



    private ViewPager slidingBannerPager;
    List<SlidingBanner> slidingBannerList;
    private int currentPage = 0;
    private Timer timer;



    RecyclerView productRecyclerView;
    ProductLayoutAdapter productAdapetr;
    List<ProductLayout> product_layoutList;
    GridLayoutManager gridLayoutManager;

    ImageView imgNewArrival;
    ImageView imgFlashSales;
    ImageView imgflashSalesbanner;
    ImageView imgWomensPlusSize;
    ImageView imgGrabDollars;
    ImageView imgInviteBanner;
    ImageView imgNewUserFreeGifts;
    ImageView imgNewUsersFreeGiftstwo;
    ImageView imgNewUserViewMore;
    ImageView imgNewArrivalsPerfumes;
    ImageView imgWomensFragrances;
    ImageView imgMensPerfumes;
    ImageView imgMakeUp;




    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        slidingBannerPager = view.findViewById(R.id.sliding_banner_pager);
        slidingBannerList = new ArrayList<SlidingBanner>();
        slidingBannerList.add(new SlidingBanner(R.drawable.slide1));
        slidingBannerList.add(new SlidingBanner(R.drawable.slide3));
        slidingBannerList.add(new SlidingBanner(R.drawable.slide2));

        SlidingBannerAdapter slidingBannerAdapter = new SlidingBannerAdapter(getActivity(), slidingBannerList);
        slidingBannerPager.setAdapter(slidingBannerAdapter);
        slidingBannerPager.setClipToPadding(false);
        slidingBannerPager.setPageMargin(20);

        creatSlideShoe();














        final ImageView flashSales = (ImageView)view.findViewById(R.id.flash_sales_img);
        flashSales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flasSales();
            }
        });

        final ImageView flashBanner = (ImageView)view.findViewById(R.id.flashsalebanner);
        flashBanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flashBanner();

            }
        });


        final ImageView newArrivals = (ImageView) view.findViewById(R.id.new_arrivals);
        newArrivals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                newArrivals();

            }
        });


        final ImageView plusSize = (ImageView)view.findViewById(R.id.womens_plus_size);
        plusSize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                plusSize();

            }
        });


        final ImageView grabDollars = (ImageView)view.findViewById(R.id.Grab_Dollars);
        grabDollars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                grabDollars();

            }
        });

        final ImageView inviteBanner = (ImageView)view.findViewById(R.id.invite_banner);
        inviteBanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                inviteBanner();
            }
        });

        final ImageView newUserGift = (ImageView)view.findViewById(R.id.New_user_free_gifts);
        newUserGift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newUserGift();
            }
        });

        final ImageView newUserGiftTwo = (ImageView)view.findViewById(R.id.New_user_free_gifts_Two);
        newUserGiftTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newUserGiftTwo();
            }
        });

        final ImageView newUserViewMore = (ImageView)view.findViewById(R.id.New_user_view_more);
        newUserViewMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newUserViewMore();
            }
        });

        final ImageView newArrivalPerfumes = (ImageView)view.findViewById(R.id.new_arrivals_perfumebanner);
        newArrivalPerfumes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                newArrivalPerfumes();
            }
        });

        final ImageView WomensFragrances = (ImageView)view.findViewById(R.id.womens_fragrances);
        WomensFragrances.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                WomensFragrances();
            }
        });

        final ImageView mensPerfumes = (ImageView)view.findViewById(R.id.mens_perfume);
        mensPerfumes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mensPerfumes();
            }
        });

        final ImageView makeup = (ImageView)view.findViewById(R.id.makeup);
        makeup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                makeup();
            }
        });










        return view;

    }



   private void creatSlideShoe(){
        final Handler handler = new Handler();
        final Runnable runnable = new Runnable() {
            @Override
            public void run() {
                if (currentPage==slidingBannerList.size())
                    currentPage = 0;
                slidingBannerPager.setCurrentItem(currentPage++,true);
            }
        };

        timer = new Timer();
        ((Timer) timer).schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(runnable);
            }
        },250,2500);{

       }






   }











   private void flashBanner(){
        Intent flashBanner = new Intent(getActivity(),FlashActivity.class);
        startActivity(flashBanner);
    }

   public void flasSales(){
        Intent flashSales = new Intent(getActivity(),FlashActivity.class);
        startActivity(flashSales);
    }



   public void newArrivals(){
       Intent newArrivals = new Intent(getActivity(),NewArrivalsActivity.class);
       startActivity(newArrivals);
   }


   public void plusSize(){
        Intent plusSize = new Intent(getActivity(),PlusSizeActivity.class);
        startActivity(plusSize);
   }

   public void grabDollars(){
        Intent grabDollars = new Intent(getActivity(),GrabDollarsActivity.class);
        startActivity(grabDollars);
   }

   public void inviteBanner(){
        Intent inviteBanner = new Intent(getActivity(),GrabDollarsActivity.class);
        startActivity(inviteBanner);
   }

   public void newUserGift(){
        Intent newUserGift = new Intent(getActivity(),NewUserFreeGiftsActivity.class);
        startActivity(newUserGift);
   }

   public void newUserGiftTwo(){
        Intent newUserFreeGiftTwo = new Intent(getActivity(),NewUserFreeGiftsActivity.class);
        startActivity(newUserFreeGiftTwo);
   }

   public void newUserViewMore(){
        Intent newUserViewMore = new Intent(getActivity(),NewUserFreeGiftsActivity.class);
        startActivity(newUserViewMore);
   }

   public void newArrivalPerfumes(){
        Intent newArrivalPerfumes = new Intent(getActivity(),NewPerfumeArrivalsActivity.class);
        startActivity(newArrivalPerfumes);
   }

   public void WomensFragrances(){

        Intent WomensFragrances = new Intent(getActivity(),Womens_FragranceActivity.class);
        startActivity(WomensFragrances);
   }

   public void mensPerfumes(){

        Intent mensPerfumes = new Intent(getActivity(),MensPerfumesActivity.class);
        startActivity(mensPerfumes);
   }

   public void makeup(){

       Intent makeup = new Intent(getActivity(),MakeupActivity.class);
       startActivity(makeup);
   }



}
