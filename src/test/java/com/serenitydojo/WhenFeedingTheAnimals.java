package com.serenitydojo;

import com.serenitydojo.model.Feeder;
import com.serenitydojo.model.FoodTypes;
import org.junit.Assert;
import org.junit.Test;

public class WhenFeedingTheAnimals {

    @Test
    public void shouldFeedCatsTuna() {
        Feeder feeder = new Feeder();

        FoodTypes food = feeder.feeds("Cat", false);

        Assert.assertEquals(FoodTypes.TUNA, food);
    }

    @Test
    public void shouldFeedHamstersCabbage() {
        Feeder feeder = new Feeder();

        FoodTypes food = feeder.feeds("Hamster", false);

        Assert.assertEquals(FoodTypes.CABBAGE, food);
    }

    @Test
    public void shouldFeedDogsDogFood() {
        Feeder feeder = new Feeder();

        FoodTypes food = feeder.feeds("Dog", false);

        Assert.assertEquals(FoodTypes.DOG_FOOD, food);
    }

    @Test
    public void shouldFeedPremiumCatsPremiumFood() {
        Feeder feeder = new Feeder();

        FoodTypes food = feeder.feeds("Cat", true);

        Assert.assertEquals(FoodTypes.SALMON, food);

    }
}
