package epicode.u5d01introductionspringboot.model.toppings;

import epicode.u5d01introductionspringboot.model.Consummation;

public class OnionTopping extends ToppingDecorator {

  // Costruttore
  public OnionTopping(Consummation pizza) {
    super(pizza);
    this.name = "Onions";
    this.price = 0.69;
    this.calories = 22;
  }

}
