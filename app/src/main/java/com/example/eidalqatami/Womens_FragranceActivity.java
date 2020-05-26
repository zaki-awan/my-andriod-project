package com.example.eidalqatami;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class Womens_FragranceActivity extends AppCompatActivity {


    ImageView imageView;


    RecyclerView recyclerView;
    WomensPerfumeAapter adapter;
    List<Model_Womens_Perfume> modelWomensPerfumeList;
    GridLayoutManager layoutManager;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_womens__fragrance);

        imageView = (ImageView)findViewById(R.id.back_arrow);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.GONE);

                Intent intent = new Intent(Womens_FragranceActivity.this,BottomActivity.class);
                startActivity(intent);

            }
        });





        modelWomensPerfumeList = new ArrayList<>();
        recyclerView = (RecyclerView)findViewById(R.id.womens_perfumes_recyclerview);
        recyclerView.setHasFixedSize(true);
        layoutManager = new GridLayoutManager(Womens_FragranceActivity.this,2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setClipToPadding(false);
        recyclerView.setClipChildren(false);


        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.admire,
                        "US $ 3.00",
                        "302",
                        "sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.aishimix,
                        "US $ 3.00",
                        "109",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.angel,
                        "US $ 3.00",
                        "76",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.aolan,
                        "US $ 3.00",
                        "312",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.arden,
                        "US $ 3.00",
                        "32",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.arer,
                        "US $ 3.00",
                        "304",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.aruthue,
                        "US $ 3.00",
                        "211",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.asthomus,
                        "US $ 3.00",
                        "22",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.benish,
                        "US $ 3.00",
                        "401",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.bioqua,
                        "US $ 3.00",
                        "109",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.black,
                        "US $ 3.00",
                        "212",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.blackchina,
                        "US $ 3.00",
                        "32",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.blacklady,
                        "US $ 3.00",
                        "73",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.blonde,
                        "US $ 3.00",
                        "83",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.bloomity,
                        "US $ 3.00",
                        "133",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.bluebox,
                        "US $ 3.00",
                        "401",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.blued,
                        "US $ 3.00",
                        "111",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.blueed,
                        "US $ 3.00",
                        "09",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.bluewater,
                        "US $ 3.00",
                        "112",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.cactus,
                        "US $ 3.00",
                        "301",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.carlota,
                        "US $ 3.00",
                        "21",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.carperfume,
                        "US $ 3.00",
                        "502",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.ced,
                        "US $ 3.00",
                        "05",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.cezo,
                        "US $ 3.00",
                        "121",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.channal,
                        "US $ 3.00",
                        "54",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.chavank,
                        "US $ 3.00",
                        "",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.coc,
                        "US $ 3.00",
                        "71",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.coco,
                        "US $ 3.00",
                        "17",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.cocoone,
                        "US $ 3.00",
                        "10",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.cocsiliya,
                        "US $ 3.00",
                        "173",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.collection,
                        "US $ 3.00",
                        "253",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.colone,
                        "US $ 3.00",
                        "",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.cologn,
                        "US $ 3.00",
                        "02",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.colone1,
                        "US $ 3.00",
                        "17",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.colors,
                        "US $ 3.00",
                        "201",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.crystal,
                        "US $ 3.00",
                        "521",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.cuder,
                        "US $ 3.00",
                        "103",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.curvy,
                        "US $ 3.00",
                        "01",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.daralis,
                        "US $ 3.00",
                        "291",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.devidoff,
                        "US $ 3.00",
                        "712",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.diamond,
                        "US $ 3.00",
                        "11",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.dioyuo,
                        "US $ 3.00",
                        "41",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.ea,
                        "US $ 3.00",
                        "05",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.eapink,
                        "US $ 3.00",
                        "17",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.eapinkcrystal,
                        "US $ 3.00",
                        "",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.elaan,
                        "US $ 3.00",
                        "215",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.elanarden,
                        "US $ 3.00",
                        "07",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.embriodry,
                        "US $ 3.00",
                        "31",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.eu,
                        "US $ 3.00",
                        "18",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.fashionbook,
                        "US $ 3.00",
                        "53",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.fashionman,
                        "US $ 3.00",
                        "101",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.floral,
                        "US $ 3.00",
                        "01",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.flower,
                        "US $ 3.00",
                        "91",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.giq,
                        "US $ 3.00",
                        "",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.gudu,
                        "US $ 3.00",
                        "",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.hebarait,
                        "US $ 3.00",
                        "22",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.hedir,
                        "US $ 3.00",
                        "110",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.blackchina,
                        "US $ 3.00",
                        "32",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.hero,
                        "US $ 3.00",
                        "02",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.homme,
                        "US $ 3.00",
                        "198",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.blackchina,
                        "US $ 3.00",
                        "32",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.ifanmiss,
                        "US $ 3.00",
                        "672",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.blackchina,
                        "US $ 3.00",
                        "32",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.inlove,
                        "US $ 3.00",
                        "12",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.jasmine,
                        "US $ 3.00",
                        "29",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.js,
                        "US $ 3.00",
                        "01",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.lancome,
                        "US $ 3.00",
                        "76",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.lasting,
                        "US $ 3.00",
                        "70",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.levender,
                        "US $ 3.00",
                        "11",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.lily,
                        "US $ 3.00",
                        "786",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.liquid,
                        "US $ 3.00",
                        "",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.little,
                        "US $ 3.00",
                        "307",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.love,
                        "US $ 3.00",
                        "",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.loveimage,
                        "US $ 3.00",
                        "05",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.lover,
                        "US $ 3.00",
                        "91",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.lovesory,
                        "US $ 3.00",
                        "512",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.maam,
                        "US $ 3.00",
                        "",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.max,
                        "US $ 3.00",
                        "809",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.modrenuse,
                        "US $ 3.00",
                        "",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.mspharamone,
                        "US $ 3.00",
                        "31",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.music,
                        "US $ 3.00",
                        "09",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.ndotsix,
                        "US $ 3.00",
                        "121",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.noncore,
                        "US $ 3.00",
                        "",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.noncore1,
                        "US $ 3.00",
                        "345",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.nr,
                        "US $ 3.00",
                        "64",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.nsix,
                        "US $ 3.00",
                        "10",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.nsix1,
                        "US $ 3.00",
                        "18",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.oddis,
                        "US $ 3.00",
                        "311",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.oispink,
                        "US $ 3.00",
                        "201",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.oneaoud,
                        "US $ 3.00",
                        "",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.onlyyou,
                        "US $ 3.00",
                        "",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.onlyyou1png,
                        "US $ 3.00",
                        "05",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.peach,
                        "US $ 3.00",
                        "31",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.phebeligon,
                        "US $ 3.00",
                        "132",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.pineapple,
                        "US $ 3.00",
                        "08",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.pink,
                        "US $ 3.00",
                        "11",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.pinkperfume,
                        "US $ 3.00",
                        "332",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.prada,
                        "US $ 3.00",
                        "01",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.redoney,
                        "US $ 3.00",
                        "188",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.ribbon,
                        "US $ 3.00",
                        "",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.royalke,
                        "US $ 3.00",
                        "201",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.samsalsa,
                        "US $ 3.00",
                        "544",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.savager,
                        "US $ 3.00",
                        "03",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.seablue,
                        "US $ 3.00",
                        "",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.twoitwo,
                        "US $ 3.00",
                        "221",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.veerage,
                        "US $ 3.00",
                        "631",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.verytime,
                        "US $ 3.00",
                        "",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.violet,
                        "US $ 3.00",
                        "231",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.waiting,
                        "US $ 3.00",
                        "09",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.waterforlife,
                        "US $ 3.00",
                        "211",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.wise,
                        "US $ 3.00",
                        "",
                        "Sold"));

        modelWomensPerfumeList.add(
                new Model_Womens_Perfume(R.drawable.xorome,
                        "US $ 3.00",
                        "",
                        "Sold"));



        adapter = new WomensPerfumeAapter(Womens_FragranceActivity.this,modelWomensPerfumeList);
        recyclerView.setAdapter(adapter);
















    }






}
