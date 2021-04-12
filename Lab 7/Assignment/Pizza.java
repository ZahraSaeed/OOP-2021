package com.company;

public class Pizza {
    private String pizza_size;
    private int no_of_cheeseToppings;
    private int no_of_pepperoniToppings;
    private int no_of_hamToppings;

    public Pizza(){
    }
    public Pizza(String size_of_pizza, int cheese_toppings, int pepperoni_toppings, int ham_toppings){
        this.pizza_size = size_of_pizza;
        this.no_of_cheeseToppings = cheese_toppings;
        this.no_of_pepperoniToppings = pepperoni_toppings;
        this.no_of_hamToppings = ham_toppings;
    }
    public void setPizza_size(String pizza_size) {
        this.pizza_size = pizza_size;
    }
    public String getPizza_size() {
        return pizza_size;
    }
    public void setNo_of_cheeseToppings(int no_of_cheeseToppings) {
        this.no_of_cheeseToppings = no_of_cheeseToppings;
    }
    public int getNo_of_cheeseToppings() {
        return no_of_cheeseToppings;
    }
    public void setNo_of_pepperoniToppings(int no_of_pepperoniToppings) {
        this.no_of_pepperoniToppings = no_of_pepperoniToppings;
    }
    public int getNo_of_pepperoniToppings() {
        return no_of_pepperoniToppings;
    }
    public void setNo_of_hamToppings(int no_of_hamToppings) {
        this.no_of_hamToppings = no_of_hamToppings;
    }
    public int getNo_of_hamToppings() {
        return no_of_hamToppings;
    }
    public double CalculateCost(){
        if (pizza_size == "Small"){
            double pizza_cost = 10 + ((2 * no_of_cheeseToppings) + (2 * no_of_pepperoniToppings)
                    + (2 * no_of_hamToppings));
            return pizza_cost;
        }
        else if(pizza_size == "Medium"){
            double pizza_cost = 12 + ((2 * no_of_cheeseToppings) + (2 * no_of_pepperoniToppings)
                    + (2 * no_of_hamToppings));
            return pizza_cost;
        }
        else if(pizza_size == "Large"){
            double pizza_cost = 14 + ((2 * no_of_cheeseToppings) + (2 * no_of_pepperoniToppings)
                    + (2 * no_of_hamToppings));
            return pizza_cost;
        }
        return 0;
    }
    public String getDescription(){
        return ("You ordered a " + pizza_size + " pizza with " + no_of_cheeseToppings +
                " cheese toppings," + no_of_pepperoniToppings + " pepperoni toppings and "
                + no_of_hamToppings + " ham toppings");
    }
}