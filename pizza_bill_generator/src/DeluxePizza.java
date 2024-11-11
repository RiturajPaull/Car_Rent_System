public class DeluxePizza extends Pizza {

    // the cheese and toppings are by default added in the deluxe pizza

    public DeluxePizza(Boolean veg) {

        super(veg);
        // calling the cheese and toppings methods
        super.addExtraaCheese();
        super.addExtraaToppings();

    }

    // We cannot give the user the freedom to choose cheese and toppings.
    // So, we have to disable this in delue pizza by over-ridding these methods

    public void addExtraaCheese(){
        //super.addExtraaCheese;
    };

    public void addExtraaToppings(){
        //super.addExtraToppings;
    };
}
