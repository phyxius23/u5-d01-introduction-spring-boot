package epicode.u5d01introductionspringboot.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Consummation extends Product {
  protected long calories;
}
