package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int total=0; //i added
    public int takeAway=0; //i added

    public int extraCheese=0; //i added

    public int extraToppings=0; //i added

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        //veg pizza
        if(isVeg){
            price=300;//i added
            total=price; //i added
        }
        //non veg
        else {
            price = 400;//i added
            total=price; //i added
        }
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        extraCheese=80;
    }
//    Extra Toppings For Veg Pizza = 70
//    Extra Toppings For Non-veg Pizza = 120

    public void addExtraToppings(){
        // your code goes here
        if(isVeg) extraToppings=70; //i added
        else extraToppings=120; //i added
    }

    public void addTakeaway(){
        takeAway=20;
    }

    public String getBill(){
        // your code goes here
        bill="Base Price Of The Pizza: "+price;
        if(extraCheese>0) {
            bill += "\nExtra Cheese Added: " +extraCheese;
            total+=extraCheese;
        }
        if(extraToppings>0){
            bill+="\nExtra Toppings Added: "+extraToppings;
            total+=extraToppings;
        }
        if(takeAway>0){
            bill+="\nPaperbag Added: "+takeAway;
            total+=takeAway;
        }
        bill+="\nTotal Price: "+total;
        return this.bill;
    }
}
