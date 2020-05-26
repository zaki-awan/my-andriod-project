package com.example.eidalqatami;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class NewArrivalsActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    ProductLayoutAdapter adapter;
    List<ProductLayout> productLayoutList;
    GridLayoutManager layoutManager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_arrivals);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String title = getIntent().getStringExtra("New Arrivals");
        getSupportActionBar().setTitle(title);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        productLayoutList = new ArrayList<>();
        recyclerView = (RecyclerView) findViewById(R.id.new_arrivals_recyclerview);
        recyclerView.setHasFixedSize(true);
       layoutManager = new GridLayoutManager(NewArrivalsActivity.this,2);
       recyclerView.setLayoutManager(layoutManager);


       productLayoutList.add(
               new ProductLayout(R.drawable.fruitslicercutter,
                       "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.anmounerwomenbag,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.arcylickwallclock,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.autoblinds,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.balconypannalcurtains,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.banxeerlipmate,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.beesisterstainlesswatch,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.cardvrcamera,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.chainclutchbag,
                        "","US $3.00",""));


        productLayoutList.add(
                new ProductLayout(R.drawable.cofeedesigntemplets,
                        "","US $3.00",""));


        productLayoutList.add(
                new ProductLayout(R.drawable.cofeespraytamplets,
                        "","US $3.00",""));


        productLayoutList.add(
                new ProductLayout(R.drawable.cookwrapcover,
                        "","US $3.00",""));



        productLayoutList.add(
                new ProductLayout(R.drawable.crystalcurtainroom,
                        "","US $3.00",""));



        productLayoutList.add(
                new ProductLayout(R.drawable.curtainshadesblinds,
                        "","US $3.00",""));


        productLayoutList.add(
                new ProductLayout(R.drawable.dentisttoolsclock,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.designercrossbodybag,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.diamondbraclewatch,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.diditalfingurepilsereader,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.dipnailpowder,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.eyemessagerwithmusic,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.femeniolightshoes,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.flapcluthhandbag,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.flatloafershoes,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.flipflopflatshoes,
                        "","US $3.00",""));
        productLayoutList.add(
                new ProductLayout(R.drawable.fruitmultipurposeplate,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.fujinlacesshoes,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.fujinshoes,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.fujinsneakers,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.gejianmenssmartwatch,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.geomatricdropsearrings,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.ginevadiamondwatch,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.glitteriphonecase,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.glittersugarnailpolish,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.glowshoeslaces,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.gogoaywomenswatch,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.goldoshapeearring,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.heaterricecontainer,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.jzdonshoes,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.largecapicityhandbag,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.leatherstrapforapplewatch,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.letikesmartwatch,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.lightweightshoes,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.lipglosstatoo,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.liquidlipstick,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.marlisashoes,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.matelipstikglass,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.meansvintagecardholderleather,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.mensleatrherwallet,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.messangerembriodarybag,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.mirroeflipphonecase,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.modrenwallclock,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.moonlivingroomwallclock,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.nailgelcanni,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.newyearairbuds,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.polishset,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.protectiveglassiphone,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.quickchargeriphonecable,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.rainbowcolorchangingnailpolishg,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.sliponsneakers,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.spidernailgel,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.spraysaladbottle,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.springkoreanshoes,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.squishyanimalstoys,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.stickerplacementdryer,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.stickerwallclock,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.swatcitypolcetoysset,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.threedeyelashes,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.threedwallclock,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.toatswomnnsshoulderbag,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.toothpickcontainer,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.topbrandwatch,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.varnishmenicuregel,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.vegetablecutter,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.wirelessheadphone,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.womenconvasshoes,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.womenfashionwatch,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.womensmessangerback,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.womenssportshoes,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.woovensandals,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.xioamiairdots,
                        "","US $3.00",""));


        adapter = new ProductLayoutAdapter(NewArrivalsActivity.this,productLayoutList);
        recyclerView.setAdapter(adapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.search_icon, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.main_search_icon) {
            return true;
        } else if (id == android.R.id.home) {
            finish();
            return true;

        }
        return super.onOptionsItemSelected(item);

    }
}
