package com.example.eidalqatami;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MensPerfumesActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ProductLayoutAdapter adapter;
    List<ProductLayout> productLayoutList;
    GridLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mens_perfumes);

        Toolbar toolbar = (Toolbar) findViewById(R.id.mens_perfume_toolbar);
        setSupportActionBar(toolbar);
        String title = getIntent().getStringExtra("");
        getSupportActionBar().setTitle(title);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        productLayoutList = new ArrayList<>();
        recyclerView = (RecyclerView) findViewById(R.id.mens_perfume_recyclerview);
        recyclerView.setHasFixedSize(true);
        layoutManager = new GridLayoutManager(MensPerfumesActivity.this,2);
        recyclerView.setLayoutManager(layoutManager);

        productLayoutList.add(
                new ProductLayout(R.drawable.aigner,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.alexendra,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.alina,
                        "","US $3.00",""));

        productLayoutList.add(
                new ProductLayout(R.drawable.alrehab,
                        "","US $3.00",""));


        adapter = new ProductLayoutAdapter(MensPerfumesActivity.this,productLayoutList);
        recyclerView.setAdapter(adapter);

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
