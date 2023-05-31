package epicode.u5d01introductionspringboot.model.drinks;

public class Wine extends Drink {

  // Attributi
  double avb;

  // Costruttore
  public Wine(double size) {
    super(size);
    this.name = "Wine";
    this.price = 7.49;
    this.calories = 607;
    this.avb = 13;
  }

}
