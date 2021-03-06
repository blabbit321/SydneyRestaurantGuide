package com.example.sydneyrestaurantguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import static com.example.sydneyrestaurantguide.Restaurants.getRestaurants;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "au.edu.unsw.infs3634.beers.MESSAGE";
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private boolean wideScreen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Lines 30-34 manage the rvList layout
        mRecyclerView = findViewById(R.id.rvList);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        // Line 35 will help verify if the device has a wide screen by checking if the detailContainer (scroller) exists
        wideScreen = findViewById(R.id.detailContainer) != null;
        // Line 37 creates a new RecyclerViewClickListener
        RestaurantAdapter.RecyclerViewClickListener listener = new RestaurantAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View view, int position) {
                if (wideScreen) {
                    // If scroller exists, then the widescreen mode will be implemented, showing  a dual pane view through the fragment
                    FragmentManager manager = getSupportFragmentManager();
                    FragmentTransaction transaction = manager.beginTransaction();
                    Fragment myFragment = new myFragment();
                    Bundle bundle = new Bundle();
                    bundle.putInt("POSITION", position);
                    myFragment.setArguments(bundle);
                    transaction.replace(R.id.detailContainer, myFragment);
                    transaction.commit();
                }
                else {
                    // if container does not exist, then the detail activity is launched
                    launchDetailActivity(position);
                }
            }
        };
        // Line 58-59 displays all the restaurants with the RecyclerViewClickListener
        mAdapter = new RestaurantAdapter(Restaurants.getRestaurants(), listener);
        mRecyclerView.setAdapter(mAdapter);
    }

    // Launches detail activity

    private void launchDetailActivity(int message) {
        Intent intent = new Intent(this, Detail.class);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }
}

