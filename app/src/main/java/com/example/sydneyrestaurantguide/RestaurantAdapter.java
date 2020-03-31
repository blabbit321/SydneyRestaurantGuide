package com.example.sydneyrestaurantguide;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder>{
    private ArrayList<Restaurants> mRestaurant;
    private RecyclerViewClickListener mListener;
    // Constructor
    public RestaurantAdapter(ArrayList<Restaurants> restaurants, RecyclerViewClickListener listener) {
        mRestaurant=restaurants;
        mListener=listener;
    }
 // RecyclerViewClick Listener interface
    public interface RecyclerViewClickListener {
        void onClick(View view, int position);
    }

    //  RestaurantVIewHolder class
    public static class RestaurantViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView name, cuisine, rating;
        public ImageView image;
        private RecyclerViewClickListener mListener;

        public RestaurantViewHolder(View v, RecyclerViewClickListener listener) {
            super(v);
            mListener = listener;
            v.setOnClickListener(this);
            name=v.findViewById(R.id.tvName);
            cuisine=v.findViewById(R.id.tvCuisine);
            rating=v.findViewById(R.id.tvRating);
            image = v.findViewById(R.id.imageView);


        } //onClick method from the interface
        @Override
        public void onClick (View view) {mListener.onClick(view, getAdapterPosition());}
    }
    // Creates and sets the layout
    @Override
    public  RestaurantAdapter.RestaurantViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.restaurant_list, parent, false);
        return new RestaurantViewHolder(v, mListener);

    }
    // Designates values for the XML elements
    @Override
    public void onBindViewHolder(RestaurantViewHolder holder, int position) {
        Restaurants restaurants = mRestaurant.get(position);
        DecimalFormat formatter = new DecimalFormat("#.##");
        String rate = formatter.format(restaurants.getRating());
        holder.name.setText(restaurants.getName());
        holder.cuisine.setText("Cuisine: "+restaurants.getCuisine());
        holder.rating.setText(rate+"/5");
        holder.image.setImageResource(restaurants.getPhoto());


    }
    // Essential for RecyclerView
    @Override
    public int getItemCount() { return mRestaurant.size();}
}
