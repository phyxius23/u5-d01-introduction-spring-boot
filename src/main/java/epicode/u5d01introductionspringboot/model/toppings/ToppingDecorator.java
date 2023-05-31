package epicode.u5d01introductionspringboot.model.toppings;

import epicode.u5d01introductionspringboot.model.Consummation;

public class ToppingDecorator extends Consummation {

  // Attributi
  Consummation decoratedPizza;

  // Costruttore
  public ToppingDecorator(Consummation decoratedPizza) {
    this.decoratedPizza = decoratedPizza;
  }

  public String getName() {
    return this.decoratedPizza.getName() + ", " + this.name;
  }

  public double getPrice() {
    return this.decoratedPizza.getPrice() + this.price;
  }

  public long getCalories() {
    return this.decoratedPizza.getCalories() + this.calories;
  }

  public String toString() {
    return this.getName() + "\tcalorie: " + this.getCalories() + "\tprezzo: " + this.getPrice() + "€";
  }

  // da utilizzare per la stampa del menu
  public String toMenu() {
    return this.name + "\tcalorie: " + this.calories + "\tprezzo: " + this.price
        + "€";
  }

}
