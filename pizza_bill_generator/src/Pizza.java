
public class Pizza {
    private int price; // price for the Pizza is fixed so no need to pass as a parameter
    private Boolean veg; // depending upon the customer, can be veg or non veg

    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private int takeAway = 20;

    // basePizza = 300, if Non-veg then 400
    private int basePizzaPrice;

    private boolean isCheeseAdded = false;
    private boolean isToppingsAdded = false;
    private boolean isTakeAwayAdded = false;

    public Pizza(Boolean veg) {
        this.veg = veg;

        // the prize will change depending upon, whether it is veg or non-veg

        if (this.veg) {
            this.price = 300;
        } else {
            // non-veg = +100
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    // 2 add-on i.e. extraa cheese(+100Rs) , topings(+150RS), takeAway(+20RS)

    public void addExtraaCheese() {
        System.out.println("Extra Cheese Added");
        this.price += extraCheesePrice;
        isCheeseAdded = true;

    }

    public void addExtraaToppings() {
        System.out.println("Extra Toppings Added");
        this.price += extraToppingsPrice;
        isToppingsAdded = true;

    }

    public void takeAwway() {
        System.out.println("Take away opted");
        this.price += takeAway;
        isTakeAwayAdded = true;

    }

    /*
     * Get Bill Structure
     * Base Pizza = 300
     * Cheese = 150
     * Take away = 20
     */

    public void getBill() {
        System.out.println("Pizza: " + basePizzaPrice);

        // need boolean values for the add on
        String bill = "";
        if (isCheeseAdded) {
            bill += "Extra Cheese Added " + extraCheesePrice + "\n";
        }

        if (isToppingsAdded) {
            bill += "Extra Toppings Added " + extraToppingsPrice + "\n";
        }

        if (isTakeAwayAdded) {
            bill += "Extra Take Away opted " + takeAway + "\n";
        }

        bill += "Total Bill " + this.price + "\n";
        System.out.println(bill);
    }

}
