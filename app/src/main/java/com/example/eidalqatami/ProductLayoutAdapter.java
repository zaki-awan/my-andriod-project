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

public class ProductLayoutAdapter extends RecyclerView.Adapter<ProductLayoutAdapter.ProductViewHolder> {


    private Context mCtx;
    private List<ProductLayout>productLayoutList;

    public ProductLayoutAdapter(Context mCtx, List<ProductLayout> productLayoutList) {
        this.mCtx = mCtx;
        this.productLayoutList = productLayoutList;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.products_recycler_layout,null);
        ProductViewHolder holder = new ProductViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {

       ProductLayout productLayout = productLayoutList.get(position);
       holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(productLayout.getImage()));
       holder.textViewTitle.setText(productLayout.getTitle());
       holder.textViewPrice.setText(productLayout.getPrice());
       holder.textViewRating.setText(productLayout.getRating());



    }

    @Override
    public int getItemCount() {
        return productLayoutList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textViewTitle, textViewPrice, textViewRating;




        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.product_image);
            textViewTitle = itemView.findViewById(R.id.product_title);
            textViewPrice = itemView.findViewById(R.id.product_price);
            textViewRating = itemView.findViewById(R.id.produt_rating);
        }
    }
}
