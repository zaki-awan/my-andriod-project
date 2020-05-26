package com.example.eidalqatami;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class WomensPerfumeAapter extends RecyclerView.Adapter<WomensPerfumeAapter.ProductViewHolder>  {

    private Context mCtx;
    private List<Model_Womens_Perfume>modelWomensPerfumeList;

    public WomensPerfumeAapter(Context mCtx, List<Model_Womens_Perfume> modelWomensPerfumeList) {
        this.mCtx = mCtx;
        this.modelWomensPerfumeList = modelWomensPerfumeList;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.womens_peefumes_product_layout,null);
        ProductViewHolder holder = new ProductViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {

        Model_Womens_Perfume modelWomensPerfume = modelWomensPerfumeList.get(position);
        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(modelWomensPerfume.getImage()));
        holder.price.setText(modelWomensPerfume.getPrice());
        holder.sold.setText(modelWomensPerfume.getProductsold());
        holder.figures.setText(modelWomensPerfume.getSoldfigure());


    }

    @Override
    public int getItemCount() {
        return modelWomensPerfumeList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView price, sold, figures;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.product_image);
            price = itemView.findViewById(R.id.product_price);
            sold = itemView.findViewById(R.id.produt_sold);
            figures = itemView.findViewById(R.id.produt_sold_figure);

        }
    }
}
