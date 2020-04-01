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
        private ImageView mfood,mfood1, mfood2;
        private TextView mTitle;
        private TextView mRating;
        private TextView mCuisine;
        private TextView mLocation;
        private TextView mDescription;
        private ImageView mMap;

        public myFragment() {
        // Required public and empty constructor
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View v = inflater.inflate(R.layout.fragment, container, false);
            Bundle bundle = getArguments();
            int position = bundle.getInt("POSITION");
            final Restaurants restaurants = Restaurants.getRestaurants().get(position);
            // Gets arguments from the FragmentManager that was implemented in Detail
            DecimalFormat formatter = new DecimalFormat("#.##");
            String rate = formatter.format(restaurants.getRating()); //used to format double value for string representation
            mfood = v.findViewById(R.id.food);
            mfood1 = v.findViewById(R.id.food1);
            mfood2 = v.findViewById(R.id.food2);
            mTitle = v.findViewById(R.id.title);
            mRating = v.findViewById(R.id.rating);
            mCuisine = v.findViewById(R.id.cuisine);
            mLocation = v.findViewById(R.id.location);
            mDescription = v.findViewById(R.id.description);
            mMap = v.findViewById(R.id.maps);
// This links all XML elements to all defined variables;
            mTitle.setText(restaurants.getName());
            mRating.setText("Rating: "+rate+"/5");
            mCuisine.setText("Cuisine: "+restaurants.getCuisine());
            mLocation.setText(restaurants.getLocation());
            mDescription.setText(restaurants.getDescription());
            mfood.setImageResource(restaurants.getFood());
            mfood1.setImageResource(restaurants.getFood1());
            mfood2.setImageResource(restaurants.getFood2());
// Sets the value of the XML element

            // set Map image as an onClick for the actual location
            mMap.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openMap(restaurants.getLocation());
                }
            });

            return v;

        }// Launches Google Maps when clicking on image and enters the location
        private void openMap(String location) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q="+location));
            startActivity(intent);
        }



















        }



