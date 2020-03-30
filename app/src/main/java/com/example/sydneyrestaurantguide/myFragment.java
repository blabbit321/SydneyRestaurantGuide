package com.example.sydneyrestaurantguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.fragment.app.Fragment;

import java.text.DecimalFormat;


public class myFragment extends Fragment {
        private ImageView mfood;

        private TextView mTitle;
        private TextView mRating;
        private TextView mCuisine;
        private TextView mLocation;
        private TextView mDescription;
        private ImageView mMap;

        public myFragment() {

        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View v = inflater.inflate(R.layout.fragment, container, false);
            Bundle bundle = getArguments();
            int position = bundle.getInt("POSITION");
            Restaurants restaurants = Restaurants.getRestaurants().get(position);
            DecimalFormat formatter = new DecimalFormat("#.##");
            String rate = formatter.format(restaurants.getRating());
            mfood = v.findViewById(R.id.food);

            mTitle = v.findViewById(R.id.title);
            mRating = v.findViewById(R.id.rating);
            mCuisine = v.findViewById(R.id.cuisine);
            mLocation = v.findViewById(R.id.location);
            mDescription = v.findViewById(R.id.description);
            mMap = v.findViewById(R.id.map);

            mTitle.setText(restaurants.getName());
            mRating.setText("Rating: "+rate+"/5");
            mCuisine.setText("Cuisine: "+restaurants.getCuisine());
            mLocation.setText(restaurants.getLocation());
            mDescription.setText(restaurants.getDescription());
            mfood.setImageResource(restaurants.getPhoto());


           mMap.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {

               }
           });
            mMap.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    search(mTitle);
                }
            });
            return v;

        }

        private void search(TextView title) {
            String url = "https://google.com/maps/place/"+ title;
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);

















        }


}
