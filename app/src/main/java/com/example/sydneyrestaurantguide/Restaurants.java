package com.example.sydneyrestaurantguide;

import java.util.ArrayList;

public class Restaurants {
    // These are the attributes for a restaurant
    private String name;
    private String cuisine;
    private String location;
    private String description;
    private double rating;
    private int photo;  // proof and food represent the R.id of the image resource
    private int food;


    public Restaurants() {

    }

    public Restaurants (String name, String cuisine, String location, String description, double rating, int photo, int food){
        this.name = name;
        this.cuisine = cuisine;
        this.location = location;
        this.description = description;
        this.rating=rating;
        this.photo = photo;
        this.food = food;
// This is the constructor class
    }

    // These are the Getters and Setters

    public  String getName() {
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

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public double getRating(){
        return rating;
    }

    public void setRating(double rating){
        this.rating = rating;
    }

    public int getPhoto() {
        return photo;
    }
    public void setPhoto(int photo){
        this.photo=photo;
    }

    public int getFood() { return food;}

    public void setFood(int food){ this.food=food;}


    // This is the ArrayList for the Restaurants which contains all the details for the attributes
    public static ArrayList<Restaurants> getRestaurants() {
        ArrayList<Restaurants> restaurants = new ArrayList<>();
        restaurants.add(new Restaurants("Watsup Brothers","Turkish","149 Eldridge Rd, Condell Park NSW 2200",
                "The family business is based on the simplicity of Turkish food with a modern twist." +
                        " Watsup has trademarked itself and become the go to hotspot for the famous 'Watsup Box' and 'chicken Burger'",5,R.drawable.watsup, R.drawable.w));
        restaurants.add(new Restaurants("Pho An","Vietnamese","27 Greenfield Parade, Bankstown NSW 2200","AN restaurant's Pho is specially prepared with rice noodles topped with beef or chicken, fresh picked herbs, bean sprouts " +
                "and served in a steaming hot secret broth.",4.8,R.drawable.phoan,R.drawable.p));
        restaurants.add(new Restaurants("Metro One","Turkish","309 Liverpool Rd, Ashfield NSW 2131","Best HSP in NSW",4.8,R.drawable.metroone,R.drawable.m));
        restaurants.add(new Restaurants("Hungry Jacks","American","Home Focus Bankstown Shop 127, 173 Canterbury Rd, Bankstown NSW 2200","Great burgers need great ingredients. At Hungry Jack’s that’s 100% Aussie beef. And we serve our irresistible, smoky, BBQ flame-grilled beef with big freshly cut salad, chunky hot chips and sensational sauces. All our burgers are made fresh to order, just the way you like them.",4.7,R.drawable.hj,R.drawable.hj1));
        restaurants.add(new Restaurants("Bar Luca","American","52 Phillip St, Sydney NSW 2000","The best burgers in NSW",4.7,R.drawable.barluca,R.drawable.ar));
        restaurants.add(new Restaurants("McDonald's","American","2 The River Rd, Revesby NSW 2212","We use the best ingredients to make all your favourite Macca's® meals. So, whether you’re in Brisbane or Broken Hill, you’ll always get the same great quality and taste.",4.5,R.drawable.macca,R.drawable.macc));
        restaurants.add(new Restaurants("Braza Churrascaria","Brazilian","Darling Quarter, 1-25 Harbour St, Sydney NSW 2000","Braza Churrascaria is an authentic Brazilian Barbeque house that serves world-renowned Australia meats. Braza Churrascaria is an “all you can eat” restaurant, with typical Brazilian service style known as “Rodizio” where Passadores (meat carvers) rotate from table to table serving more than 20 different types of skewers.",4.5,R.drawable.braza,R.drawable.braz));
        restaurants.add(new Restaurants("Se Jong KBBQ Buffet","Korean","8 London St, Campsie NSW 2194","The best KBBQ in the world!",4.3,R.drawable.sejong,R.drawable.bbq));
        restaurants.add(new Restaurants("Bondi Pizza","Italian","320 Church St, Parramatta NSW 2150","All of our pizzas are lovingly made with quality fresh ingredients, it all starts with the dough hand-made in our restaurants and our toppings are sourced from Australian local growers and producers whenever possible. Take a look at our signature Marinated Chargrilled Lamb Pizza made with tender marinated lamb backstrap fillet, fetta, balsamic onions, roma tomatoes, rocket, sweet potato crisps & our creamy Caesar sauce – perfect!!",4.2,R.drawable.bondi,R.drawable.pizz));
        restaurants.add(new Restaurants("El Jannah","Lebanese","701 Punchbowl Rd, Punchbowl NSW 2196","Believe the hype. Our legendary Lebanese-style chicken tastes as good as it looks.",4.1,R.drawable.elj,R.drawable.el));
        restaurants.add(new Restaurants("KFC","American","1323/1325 Canterbury Rd, Punchbowl NSW 2196","HAND-MADE EVERY DAY BY REAL COOKS IN-STORE." +
                "NO IFS. NO BUTS. NO SHORTCUTS.",4,R.drawable.kfc,R.drawable.kkc));
        return restaurants;
    }


}
