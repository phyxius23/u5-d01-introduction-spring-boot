package epicode.u5d01introductionspringboot.model.drinks;

public class Water extends Drink {

  // Costruttore
  public Water(double size) {
    super(size);
    this.name = "Water";
    this.price = 1.29;
    this.calories = 0;
  }

}
