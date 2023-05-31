package epicode.u5d01introductionspringboot.model.toppings;

import epicode.u5d01introductionspringboot.model.Consummation;

public class HamTopping extends ToppingDecorator {

  // Costruttore
  public HamTopping(Consummation pizza) {
    super(pizza);
    this.name = "Ham";
    this.price = 0.99;
    this.calories = 35;
  }

}
