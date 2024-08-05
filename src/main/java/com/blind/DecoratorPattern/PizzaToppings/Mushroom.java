package com.blind.DecoratorPattern.PizzaToppings;

import com.blind.DecoratorPattern.PizzaOptions.BasePizza;

public class Mushroom extends ToppingsDecorator {
    BasePizza basePizza;
    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost() + 70;
    }
}
