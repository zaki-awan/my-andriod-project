package com.example.eidalqatami;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class NewPerfumeArrivalsActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ProductLayoutAdapter adapter;
    List<ProductLayout> productLayoutList;
    GridLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_perfume_arrivals);


        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String title = getIntent().getStringExtra("New Arrivals");
        getSupportActionBar().setTitle(title);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        productLayoutList = new ArrayList<>();
        recyclerView = (RecyclerView) findViewById(R.id.womens_perfumes_recyclerview);
        recyclerView.setHasFixedSize(true);
        layoutManager = new GridLayoutManager(NewPerfumeArrivalsActivity.this,2);
        recyclerView.setLayoutManager(layoutManager);


        productLayoutList.add(
                new ProductLayout(R.drawable.alfakhri,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.alfaris,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.antiperpirantperfume,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.antiperspirant,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.aphrodiasicflirtspray,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.aphrodisacspray,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.apitomizer,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.aqua,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.aqucal,
                        "","US $3.00",""));
        productLayoutList.add(
                new ProductLayout(R.drawable.armpits,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.atomizerbottle,
                        "","US $3.00",""));
        productLayoutList.add(
                new ProductLayout(R.drawable.atomizerperfume,
                        "","US $3.00",""));
        productLayoutList.add(
                new ProductLayout(R.drawable.attractsparay,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.attractwomens,
                        "","US $3.00",""));
        productLayoutList.add(
                new ProductLayout(R.drawable.barrel,
                        "","US $3.00",""));
        productLayoutList.add(
                new ProductLayout(R.drawable.bendit,
                        "","US $3.00",""));
        productLayoutList.add(
                new ProductLayout(R.drawable.blacklight,
                        "","US $3.00",""));
        productLayoutList.add(
                new ProductLayout(R.drawable.blackooud,
                        "","US $3.00",""));
        productLayoutList.add(
                new ProductLayout(R.drawable.blackplannet,
                        "","US $3.00",""));
        productLayoutList.add(
                new ProductLayout(R.drawable.blackscent,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.blueexcess,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.bngold,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.bnperfumes,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.bnperfumesblack,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.bnperfumesone,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.bnperfumespink,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.bnperfumesred,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.bnsecreet,
                        "","US $3.00",""));
        productLayoutList.add(
                new ProductLayout(R.drawable.bottlespray,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.boxbodyspray,
                        "","US $3.00",""));
        productLayoutList.add(
                new ProductLayout(R.drawable.brave,
                        "","US $3.00",""));
        productLayoutList.add(
                new ProductLayout(R.drawable.brightfantasy,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.candylove,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.carairfreshner,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.catwalk,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.ceo,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.charmladies,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.charmoud,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.charmpink,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.claudy,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.colgonebottle,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.collection,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.deoderant,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.disposableantisweetpads,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.dollr,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.dorallcollection,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.dorallcollectionnew,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.dorral,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.edp,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.elegantwomens,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.elite,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.emperememories,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.emprecore,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.emprelegend,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.engrosedesigner,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.epicadventure,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.epicpure,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.eternally,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.eventfull,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.excess,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.faanperfumes,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.faiso,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.fit,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.fifteenperfumesformens,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.flirtoerfume,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.flowerpackage,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.flowerperfume,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.flowerperfumewomens,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.flowerscent,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.flowetoiletperfume,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.forenheight,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.freshgentleman,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.freshgenetlmen,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.freshlasting,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.fzfreezone,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.geniemen,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.genneperfume,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.genniecollection,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.gentelmenperfume,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.golden,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.hawajis,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.heneryperfume,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.himaliya,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.hmcollection,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.hobbylane,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.hscarnival,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.hslovely,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.iman,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.imanbrown,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.imiginationcarbon,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.iscents,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.iscentslady,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.jackstorm,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.jades,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.jeanmiss,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.jeanrose,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.jovanmusk,
                        "","US $3.00",""));
        productLayoutList.add(
                new ProductLayout(R.drawable.ladyredheal,
                        "","US $3.00",""));
        productLayoutList.add(
                new ProductLayout(R.drawable.ladyrich,
                        "","US $3.00",""));
        productLayoutList.add(
                new ProductLayout(R.drawable.laikouwomens,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.lasvegas,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.lattaf,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.lattafaperfumes,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.lechameneu,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.ledie,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.legend,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.leopoan,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.lognemens,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.london,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.longlast,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.marvel,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.memoriesmen,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.menpour,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.migestic,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.miragebrands,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.miragechallange,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.mirrage,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.missqueen,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.molto,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.montblack,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.montblacklady,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.montblank,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.mounteverest,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.mymost,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.natural,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.nimitiz,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.nior,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.niorgems,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.okneys,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.ooud,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.originolrose,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.paccorabane,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.paccovisible,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.perfumeatomizer,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.perfumebottleaitomizer,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.perfumedeoderant,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.perfumedspray,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.perfumefreshner,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.perfumejador,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.perfumeoil,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.pherominfresh,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.pheromoneperfume,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.pheromones,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.pinkhearts,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.pinkjass,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.pinklily,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.portia,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.privasalsa,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.ranger,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.readome,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.reavega,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.rollerwomens,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.romanticbodyspray,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.romanticpink,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.rosemisk,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.scarlethearts,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.senciblegold,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.sensiblered,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.shirelymix,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.shirley,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.shirleymay,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.silver,
                        "","US $3.00",""));
        productLayoutList.add(
                new ProductLayout(R.drawable.sniff,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.soliddeoderant,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.solidperfumebalm,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.specialedition,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.specialeditionblanc,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.sprayoil,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.spraywoodflavour,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.suvace,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.swano,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.sweetdeoderant,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.sweetpads,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.tigerblue,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.tiolettedeoderent,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.toolbox,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.toros,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.tri,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.triorchads,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.trirued,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.twotypes,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.vopregezi,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.wimenssweetdeoderants,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.womenarollon,
                        "","US $3.00",""));

       

        productLayoutList.add(
                new ProductLayout(R.drawable.womensglamour,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.womensnaturalperfume,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.woodflower,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.xchange,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.zone,
                        "","US $3.00",""));










        adapter = new ProductLayoutAdapter(NewPerfumeArrivalsActivity.this,productLayoutList);
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
