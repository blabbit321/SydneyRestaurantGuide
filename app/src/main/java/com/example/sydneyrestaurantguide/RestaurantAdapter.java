package com.example.sydneyrestaurantguide;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.ImageViewHolder> {

    private int[] images;

    public RestaurantAdapter (int[] images) {
        this.images = images;
    }
    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.restaurant_list,parent, false);
        ImageViewHolder imageViewHolder = new ImageViewHolder(view);
        return imageViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder holder, int position) {
            int image_id = images [position];
            holder.food.setImageResource(image_id);
            holder.name.setText("Image :"+position);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }
    public static class ImageViewHolder extends RecyclerView.ViewHolder{
        ImageView food;
        TextView name;

        public ImageViewHolder(@NonNull View itemView) {
            super(itemView);
            food = itemView.findViewById(R.id.watsup);
            name = itemView.findViewById(R.id.watsupbro);
        }
    }
}
