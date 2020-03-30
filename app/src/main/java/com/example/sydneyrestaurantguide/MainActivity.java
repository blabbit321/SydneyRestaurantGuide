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
        mRecyclerView = findViewById(R.id.rvList);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        wideScreen = findViewById(R.id.detailContainer) != null;
        RestaurantAdapter.RecyclerViewClickListener listener = new RestaurantAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View view, int position) {
                if (wideScreen) {
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
                    launchDetailActivity(position);
                }
            }
        };
        mAdapter = new RestaurantAdapter(Restaurants.getRestaurants(), listener);
        mRecyclerView.setAdapter(mAdapter);
    }

    private void launchDetailActivity(int message) {
        Intent intent = new Intent(this, Detail.class);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }
}

