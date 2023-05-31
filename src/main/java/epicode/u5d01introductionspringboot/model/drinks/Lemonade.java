package epicode.u5d01introductionspringboot.model.drinks;

public class Lemonade extends Drink {

  // Costruttore
  public Lemonade(double size) {
    super(size);
    this.name = "Lemonade";
    this.price = 1.29;
    this.calories = 128;
  }

}
