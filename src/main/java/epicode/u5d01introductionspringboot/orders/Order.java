package epicode.u5d01introductionspringboot.orders;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import epicode.u5d01introductionspringboot.model.Consummation;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {

  // Attributi
  private int numberOrder;
  private Table table;
  private List<Consummation> consummationsList;
  private OrderState orderState;
  private int numberPax;
  private LocalTime dateOrder;
  private double totalPrice;
  private double paxPrice;

  // Costruttore
  public Order(int numberOrder, Table table, List<Consummation> consummationsList, OrderState orderState, int numberPax,
      LocalTime dateOrder, double paxPrice) {
    this.numberOrder = numberOrder;
    this.table = table;
    this.consummationsList = consummationsList;
    this.orderState = orderState;
    this.numberPax = numberPax;
    this.dateOrder = dateOrder;
    this.paxPrice = paxPrice;
    this.totalPrice = totalOrder(consummationsList, paxPrice, numberPax);
  }

  public double totalOrder(List<Consummation> consummationsList, double paxPrice, int numberPax) {
    double totalPrice = consummationsList.stream().mapToDouble(Consummation::getPrice).sum();
    return totalPrice + (paxPrice * numberPax);
  }

  @Override
  public String toString() {
    // return "Order [numberOrder=" + numberOrder + ", table=" + table + ",
    // consummationsList=" + consummationsList
    // + ", orderState=" + orderState + ", numberPax=" + numberPax + ", dateOrder="
    // + dateOrder + ", totalPrice="
    // + totalPrice + ", paxPrice=" + paxPrice + "]";
    return "\n********** Order: " + numberOrder + " **********" + table + "\nOrder state: " + orderState + "\nPax: "
        + numberPax + "\nDate: " + dateOrder + "\nPax price: " + paxPrice + "\nTotal price: " + totalPrice
        + "\n******************************";
  }

}
