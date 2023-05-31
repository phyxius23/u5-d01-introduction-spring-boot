package epicode.u5d01introductionspringboot.configs;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import epicode.u5d01introductionspringboot.model.Consummation;
import epicode.u5d01introductionspringboot.model.Menu;
import epicode.u5d01introductionspringboot.model.drinks.Lemonade;
import epicode.u5d01introductionspringboot.model.drinks.Water;
import epicode.u5d01introductionspringboot.model.drinks.Wine;
import epicode.u5d01introductionspringboot.model.pizzas.Pizza;
import epicode.u5d01introductionspringboot.model.pizzas.PizzaFamily;
import epicode.u5d01introductionspringboot.model.toppings.HamTopping;
import epicode.u5d01introductionspringboot.model.toppings.OnionTopping;
import epicode.u5d01introductionspringboot.model.toppings.PineappleTopping;
import epicode.u5d01introductionspringboot.orders.Order;
import epicode.u5d01introductionspringboot.orders.OrderState;
import epicode.u5d01introductionspringboot.orders.Table;
import epicode.u5d01introductionspringboot.orders.TableState;

@Configuration
@PropertySource("classpath:application.properties")
public class MenuConfig {

  @Value("${application.pricePax}")
  public double pricePax;

  @Bean
  Menu getMenu() {
    Menu menu = new Menu();

    menu.getMenuEntries().add(getMargherita());
    menu.getMenuEntries().add(getPizzaHam());
    menu.getMenuEntries().add(getPizzaOnions());
    menu.getMenuEntries().add(getPizzaHamOnions());
    menu.getMenuEntries().add(getPizzaHawaiian());
    menu.getMenuEntries().add(getMargheritaFamily());
    menu.getMenuEntries().add(getPizzaFamilyHam());
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

  @Bean
  Consummation getMargheritaFamily() {
    return new PizzaFamily();
  }

  @Bean
  Consummation getPizzaFamilyHam() {
    return new HamTopping(new PizzaFamily());
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

  // BEAN PER I TAVOLI
  @Bean
  Table getTable() {
    return new Table(1, 6, TableState.OCCUPATO);
  }

  // BEAN PER consummationsList
  @Bean
  List<Consummation> getConsummationsList() {
    List<Consummation> consummationsList = new ArrayList<>();

    consummationsList.add(getLemonade());
    consummationsList.add(getWater());
    consummationsList.add(getPizzaHawaiian());
    consummationsList.add(getPizzaOnions());

    return consummationsList;
  }

  // BEAN PER L'ORDINE
  @Bean(name = "getOrder")
  Order getOrder() {

    return new Order(2, getTable(), getConsummationsList(), OrderState.IN_CORSO, 2, LocalTime.now(), pricePax);
  }
}
