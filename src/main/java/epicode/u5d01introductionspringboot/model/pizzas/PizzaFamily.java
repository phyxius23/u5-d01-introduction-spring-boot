package epicode.u5d01introductionspringboot.model.pizzas;

import lombok.Getter;

@Getter
public class PizzaFamily extends Pizza {

  // Costruttore
  public PizzaFamily() {
    this.name = "Family size for Pizza";
    // this.calories = getCaloriesPizza() * 1.95;
    this.calories = getCalories() * 1.95;
    this.price = getPrice() + 4.15;
    this.ingredients = getIngredients();
  }

  public String toString() {
    return this.getName() + "\t\tcalorie: " + this.getCalories() + "\tprezzo: " + this.getPrice() + "€";
  }

  // public double
}
