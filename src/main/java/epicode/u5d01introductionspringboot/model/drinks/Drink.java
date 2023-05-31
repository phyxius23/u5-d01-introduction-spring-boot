package epicode.u5d01introductionspringboot.model.drinks;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import epicode.u5d01introductionspringboot.model.Consummation;

@AllArgsConstructor
@Getter
@Setter
public abstract class Drink extends Consummation {

  // Attributi
  double size;

  // Costruttore tramite @Annotations

  public String toString() {
    return this.getName() + "\tsize: " + this.getSize() + "\tcalorie: " + this.getCalories() + "\tprezzo: "
        + this.getPrice()
        + "€";
  }

}
