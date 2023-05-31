package epicode.u5d01introductionspringboot.model.pizzas;

import epicode.u5d01introductionspringboot.model.Consummation;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pizza extends Consummation {

  // Attributi
  String ingredients;

  // Costruttore
  public Pizza() {
    this.name = "Margherita";
    this.calories = 1104;
    this.price = 4.99;
    this.ingredients = "Pomodoro, mozzarella";
  }

  public String toString() {
    return this.getName() + "\t\tcalorie: " + this.getCalories() + "\tprezzo: " + this.getPrice() + "€";
  }

  public double getCaloriesPizza() {
    return this.calories;
  }

}
