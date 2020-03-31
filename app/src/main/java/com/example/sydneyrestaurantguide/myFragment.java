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

        public myFragment() {
        // Required public and empty constructor
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View v = inflater.inflate(R.layout.fragment, container, false);
            Bundle bundle = getArguments();
            int position = bundle.getInt("POSITION");
            Restaurants restaurants = Restaurants.getRestaurants().get(position);
            // Gets arguments from the FragmentManager that was implemented in Detail
            DecimalFormat formatter = new DecimalFormat("#.##");
            String rate = formatter.format(restaurants.getRating()); //used to format double value for string representation
            mfood = v.findViewById(R.id.food);
            mTitle = v.findViewById(R.id.title);
            mRating = v.findViewById(R.id.rating);
            mCuisine = v.findViewById(R.id.cuisine);
            mLocation = v.findViewById(R.id.location);
            mDescription = v.findViewById(R.id.description);
// This links all XML elements to all defined variables;
            mTitle.setText(restaurants.getName());
            mRating.setText("Rating: "+rate+"/5");
            mCuisine.setText("Cuisine: "+restaurants.getCuisine());
            mLocation.setText(restaurants.getLocation());
            mDescription.setText(restaurants.getDescription());
            mfood.setImageResource(restaurants.getFood());
// Sets the value of the XML element


            return v;

        }


















        }



