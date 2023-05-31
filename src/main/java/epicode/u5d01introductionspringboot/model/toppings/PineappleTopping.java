package epicode.u5d01introductionspringboot.model.toppings;

import epicode.u5d01introductionspringboot.model.Consummation;

public class PineappleTopping extends ToppingDecorator {

  // Costruttore
  public PineappleTopping(Consummation pizza) {
    super(pizza);
    this.name = "Pineapple";
    this.price = 0.79;
    this.calories = 24;
  }

}
