package epicode.u5d01introductionspringboot.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import epicode.u5d01introductionspringboot.model.Consummation;
import epicode.u5d01introductionspringboot.model.Menu;
import epicode.u5d01introductionspringboot.model.drinks.Lemonade;
import epicode.u5d01introductionspringboot.model.drinks.Water;
import epicode.u5d01introductionspringboot.model.drinks.Wine;
import epicode.u5d01introductionspringboot.model.pizzas.Pizza;
import epicode.u5d01introductionspringboot.model.toppings.HamTopping;
import epicode.u5d01introductionspringboot.model.toppings.OnionTopping;
import epicode.u5d01introductionspringboot.model.toppings.PineappleTopping;

@Configuration
public class MenuConfig {

  @Bean
  Menu getMenu() {
    Menu menu = new Menu();

    menu.getMenuEntries().add(getMargherita());
    menu.getMenuEntries().add(getPizzaHam());
    menu.getMenuEntries().add(getPizzaOnions());
    menu.getMenuEntries().add(getPizzaHamOnions());
    menu.getMenuEntries().add(getPizzaHawaiian());
    menu.getMenuEntries().add(getLemonade());
    menu.getMenuEntries().add(getWine());
    menu.getMenuEntries().add(getWater());

    return menu;
  }

  // BEAN PER LE PIZZE
  @Bean
  Consummation getMargherita() {
    return new Pizza();
  }

  @Bean
  Consummation getPizzaHam() {
    return new HamTopping(new Pizza());
  }

  @Bean
  Consummation getPizzaOnions() {
    return new OnionTopping(new Pizza());
  }

  @Bean
  Consummation getPizzaHamOnions() {
    return new HamTopping(new OnionTopping(new Pizza()));
  }

  @Bean
  Consummation getPizzaHawaiian() {
    return new PineappleTopping(new HamTopping(new Pizza()));
  }

  // BEAN PER I DRINK
  @Bean
  Consummation getLemonade() {
    return new Lemonade(0.33);
  }

  @Bean
  Consummation getWine() {
    return new Wine(0.75);
  }

  @Bean
  Consummation getWater() {
    return new Water(0.50);
  }
}
