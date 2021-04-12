package com.company;

public class L7A1Runner {
    public static void main(String[] args) {
        System.out.println("Maximum number of orders that can be placed is 3.");

        Pizza pizza_1 = new Pizza("Small",4,6,2);
        System.out.println(pizza_1.getDescription() + " for Rs." + pizza_1.CalculateCost());

        Pizza pizza_2 = new Pizza();
        pizza_2.setPizza_size("Large");
        pizza_2.setNo_of_cheeseToppings(8);
        pizza_2.setNo_of_pepperoniToppings(8);
        pizza_2.setNo_of_hamToppings(5);
        System.out.println(pizza_2.getDescription() + " for Rs." + pizza_2.CalculateCost());

        Pizza pizza_3 = new Pizza("Medium",10,10,8);
        System.out.println(pizza_3.getDescription() + " for Rs." + pizza_3.CalculateCost());

        PizzaOrder pizzaOrder_1 = new PizzaOrder(pizza_1);
        PizzaOrder pizzaOrder_2 = new PizzaOrder(pizza_2);
        PizzaOrder pizzaOrder_3 = new PizzaOrder(pizza_3);

        System.out.println("Your total bill is Rs." + PizzaOrder.calculateTotal());
    }
}
