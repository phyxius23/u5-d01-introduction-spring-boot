package epicode.u5d01introductionspringboot.model.toppings;

import epicode.u5d01introductionspringboot.model.Consummation;

public class CheeseTopping extends ToppingDecorator {

  // Costruttore
  public CheeseTopping(Consummation pizza) {
    super(pizza);
    this.name = "Cheese";
    this.price = 0.69;
    this.calories = 92;
  }

}
