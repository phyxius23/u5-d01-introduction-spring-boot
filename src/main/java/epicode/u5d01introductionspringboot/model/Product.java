package epicode.u5d01introductionspringboot.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Product {
  protected double price;
  protected String name;
}
