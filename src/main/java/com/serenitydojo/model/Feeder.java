package com.serenitydojo.model;

import static com.serenitydojo.model.FoodTypes.*;

public class Feeder {
    public FoodTypes feeds(String animal, boolean isPremium) {
        if (animal.equals("Cat")) {
            return (isPremium) ? SALMON : TUNA;
        } else if (animal.equals("Dog")) {
            return (isPremium) ? DELUXE_DOG_FOOD : DOG_FOOD;
        }
        return CABBAGE;
    }

}
