package com.example.phet.Model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.phet.R;

import java.util.List;

public class ModelAdapter extends RecyclerView.Adapter<ModelAdapter.ModelViewHolder> {


    private Context mCtx;

    private List<TModel> tList;

    public ModelAdapter(Context mCtx, List<TModel>tList){

        this.mCtx = mCtx;
        this.tList = tList;

    }


    @Override
    public ModelViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.activity_layout_row, parent,false);
        return new ModelViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ModelViewHolder holder, int position) {


        TModel product = tList.get(position);



        holder.textViewTitle.setText(product.getTitle());
        holder.textViewDate.setText(product.getDate());
        holder.textViewRating.setText(String.valueOf(product.getRating()));
        holder.textViewPrice.setText(String.valueOf(product.getPrice()));

        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(product.getImage()));

    }


    @Override
    public int getItemCount() {
        return tList.size();
    }


    class ModelViewHolder extends RecyclerView.ViewHolder {

        TextView textViewTitle, textViewDate, textViewRating, textViewPrice;
        ImageView imageView;

        public ModelViewHolder(View itemView) {
            super(itemView);

            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewDate = itemView.findViewById(R.id.textViewDate);
            textViewRating = itemView.findViewById(R.id.textViewRating);
            textViewPrice = itemView.findViewById(R.id.textViewPrice);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }

}
