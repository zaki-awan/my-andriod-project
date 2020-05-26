package com.example.eidalqatami;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class PlusSizeActivity extends AppCompatActivity {

    RecyclerView plusSizeRV;
    ProductLayoutAdapter adapter;
    List<ProductLayout>productLayoutList;
    GridLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plus_size);

        Toolbar toolbar = (Toolbar) findViewById(R.id.plus_size_toolbar);
        setSupportActionBar(toolbar);
        String title = getIntent().getStringExtra("");
        getSupportActionBar().setTitle(title);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

////// Recycler

        productLayoutList = new ArrayList<>();
        plusSizeRV = (RecyclerView) findViewById(R.id.plus_size_recyclerview);
        plusSizeRV.setHasFixedSize(true);
        layoutManager = new GridLayoutManager(PlusSizeActivity.this,2);
        plusSizeRV.setLayoutManager(layoutManager);

        productLayoutList.add(
                new ProductLayout(R.drawable.fruitslicercutter,
                        "","US $3.00",""));




        adapter = new ProductLayoutAdapter(PlusSizeActivity.this,productLayoutList);
        plusSizeRV.setAdapter(adapter);





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
