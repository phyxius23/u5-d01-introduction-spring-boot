package epicode.u5d01introductionspringboot.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
// @Slf4j
public class Menu {

  // Attributi
  private List<Product> menuEntries = new ArrayList<>();

  public void print() {
    // log.info("*********************** MENU ***********************");
    // this.menuEntries.forEach(product -> log.info(product.toString()));
    System.out.println("*********************** MENU ***********************");
    this.menuEntries.forEach(product -> System.out.println(product.toString()));
    ;
  }
}
