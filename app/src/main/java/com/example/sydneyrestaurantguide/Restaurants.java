package com.example.sydneyrestaurantguide;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Restaurants {
    private String name;
    private String cuisine;
    private String location;
    private double rating;


    public Restaurants() {

    }

    public Restaurants (String name, String cuisine, String location, double rating){
        this.name = name;
        this.cuisine = cuisine;
        this.location = location;
        this.rating=rating;
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getCuisine(){
        return cuisine;
    }
    public void setCuisine(String cuisine){
        this.cuisine = cuisine;
    }
    public String getLocation(){
        return location;
    }
    public void setLocation(String location){
        this.location = location;
    }

    public double getRating(){
        return rating;
    }
    public void setRating(double rating){
        this.rating = rating;
    }

    public static ArrayList<Restaurants> getRestaurants() {
        ArrayList<Restaurants> restaurants = new ArrayList<>();
        restaurants.add(new Restaurants("Watsup Brothers","Turkish","Bankstown",5));
        restaurants.add(new Restaurants("Pho An","Vietnamese","Bankstown",4.5));
        restaurants.add(new Restaurants("Metro One","Turkish","Ashfield",5));
        restaurants.add(new Restaurants("Hungry Jacks","American","Bankstown",5));
        restaurants.add(new Restaurants("Bar Luca","American","City",5));
        restaurants.add(new Restaurants("McDonald's","American","Revesby",5));
        restaurants.add(new Restaurants("Braza Churrascaria","Brazilian","Darling Harbour",5));
        restaurants.add(new Restaurants("Se Jong KBBQ Buffet","Korean","Campsie",5));
        restaurants.add(new Restaurants("Bondi Pizza","Italian","Paramatta",5));
        restaurants.add(new Restaurants("El Jannah","Turkish","Punchbowl",5));
        restaurants.add(new Restaurants("KFC","American","Bankstown",5));
        return restaurants;
    }

    public static Restaurants searchRestaurant(String search){
        for (int x=0; x<Restaurants.getRestaurants().size();x++){
            if (Restaurants.getRestaurants().get(x).name.toLowerCase().equals(search.toLowerCase()))
                return Restaurants.getRestaurants().get(x);
        }
        return null;
    }


}
