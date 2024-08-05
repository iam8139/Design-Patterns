package com.blind.DecoratorPattern.PizzaToppings;

import com.blind.DecoratorPattern.PizzaOptions.BasePizza;

public class ExtraCheese extends ToppingsDecorator {
    BasePizza basePizza;
    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost() + 30;
    }
}
