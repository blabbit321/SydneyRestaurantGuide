package com.example.sydneyrestaurantguide;

import java.util.ArrayList;

public class Restaurants {
    private String name;
    private String cuisine;
    private String location;
    private String description;
    private double rating;
    private int photo;


    public Restaurants() {

    }

    public Restaurants (String name, String cuisine, String location, String description, double rating, int photo){
        this.name = name;
        this.cuisine = cuisine;
        this.location = location;
        this.description = description;
        this.rating=rating;
        this.photo = photo;
    }

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

    public static ArrayList<Restaurants> getRestaurants() {
        ArrayList<Restaurants> restaurants = new ArrayList<>();
        restaurants.add(new Restaurants("Watsup Brothers","Turkish","Bankstown",
                "The family business is based on the simplicity of Turkish food with a modern twist." +
                        " Watsup has trademarked itself and become the go to hotspot for the famous 'Watsup Box' and 'chicken Burger'",5,R.drawable.watsup));
        restaurants.add(new Restaurants("Pho An","Vietnamese","Bankstown","AN restaurant's Pho is specially prepared with rice noodles topped with beef or chicken, fresh picked herbs, bean sprouts " +
                "and served in a steaming hot secret broth.",4.8,R.drawable.phoan));
        restaurants.add(new Restaurants("Metro One","Turkish","Ashfield","Best HSP in NSW",4.8,R.drawable.metroone));
        restaurants.add(new Restaurants("Hungry Jacks","American","Bankstown","Great burgers need great ingredients. At Hungry Jack’s that’s 100% Aussie beef. And we serve our irresistible, smoky, BBQ flame-grilled beef with big freshly cut salad, chunky hot chips and sensational sauces. All our burgers are made fresh to order, just the way you like them.",4.7,R.drawable.hj));
        restaurants.add(new Restaurants("Bar Luca","American","City","The best burgers in NSW",4.7,R.drawable.barluca));
        restaurants.add(new Restaurants("McDonald's","American","Revesby","We use the best ingredients to make all your favourite Macca's® meals. So, whether you’re in Brisbane or Broken Hill, you’ll always get the same great quality and taste.",4.5,R.drawable.macca));
        restaurants.add(new Restaurants("Braza Churrascaria","Brazilian","Darling Harbour","Braza Churrascaria is an authentic Brazilian Barbeque house that serves world-renowned Australia meats. Braza Churrascaria is an “all you can eat” restaurant, with typical Brazilian service style known as “Rodizio” where Passadores (meat carvers) rotate from table to table serving more than 20 different types of skewers.",4.5,R.drawable.braza));
        restaurants.add(new Restaurants("Se Jong KBBQ Buffet","Korean","Campsie","The best KBBQ in the world!",4.3,R.drawable.sejong));
        restaurants.add(new Restaurants("Bondi Pizza","Italian","Paramatta","All of our pizzas are lovingly made with quality fresh ingredients, it all starts with the dough hand-made in our restaurants and our toppings are sourced from Australian local growers and producers whenever possible. Take a look at our signature Marinated Chargrilled Lamb Pizza made with tender marinated lamb backstrap fillet, fetta, balsamic onions, roma tomatoes, rocket, sweet potato crisps & our creamy Caesar sauce – perfect!!",4.2,R.drawable.bondi));
        restaurants.add(new Restaurants("El Jannah","Turkish","Punchbowl","Believe the hype. Our legendary Lebanese-style chicken tastes as good as it looks.",4.1,R.drawable.elj));
        restaurants.add(new Restaurants("KFC","American","Bankstown","HAND-MADE EVERY DAY BY REAL COOKS IN-STORE." +
                "NO IFS. NO BUTS. NO SHORTCUTS.",4,R.drawable.kfc));
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
