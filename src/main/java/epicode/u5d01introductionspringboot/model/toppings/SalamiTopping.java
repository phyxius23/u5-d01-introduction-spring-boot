package epicode.u5d01introductionspringboot.model.toppings;

import epicode.u5d01introductionspringboot.model.Consummation;

public class SalamiTopping extends ToppingDecorator {

  // Costruttore
  public SalamiTopping(Consummation pizza) {
    super(pizza);
    this.name = "Salami";
    this.price = 0.99;
    this.calories = 86;
  }

}
