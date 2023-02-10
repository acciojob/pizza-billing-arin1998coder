package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        super.extraCheese=80;
        if(isVeg)
            super.extraToppings=70;
        else
            super.extraToppings=120;
    }
}
