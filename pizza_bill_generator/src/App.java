
public class App {
    public static void main(String[] args) {

        // Customer 1 needs Non-Veg Pizza with extraa cheese, toppings and take away;
        Pizza cust1 = new Pizza(false);
        cust1.addExtraaCheese();
        cust1.addExtraaToppings();
        cust1.takeAwway();
        cust1.getBill();

        //  Customer 2 needs Veg Pizza with no cheese and take away but extraa toppings
        Pizza cust2 = new Pizza(true);
        cust2.addExtraaToppings();
        cust2.getBill();


        // Customer 3 needs Veg Deluxe Pizza with no take away
        DeluxePizza deluxCust1 = new DeluxePizza(true);
        deluxCust1.addExtraaCheese();
        deluxCust1.addExtraaToppings();
        deluxCust1.getBill();

        //Customer 4 needs Non-Veg Deluxe Pizza with take away
        DeluxePizza deluxeCust4 = new DeluxePizza(false);
        deluxeCust4.takeAwway();
        deluxeCust4.getBill();
        
        

    }
}