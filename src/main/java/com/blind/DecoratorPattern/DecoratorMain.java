package com.blind.DecoratorPattern;

import com.blind.DecoratorPattern.PizzaOptions.BasePizza;
import com.blind.DecoratorPattern.PizzaOptions.FarmHouse;
import com.blind.DecoratorPattern.PizzaToppings.ExtraCheese;

public class DecoratorMain {
    public static void main(String[] args) {
        BasePizza pizza = new ExtraCheese(new FarmHouse());
        System.out.println("Price for Farmhouse with extra cheese: " + pizza.cost());
    }
}
