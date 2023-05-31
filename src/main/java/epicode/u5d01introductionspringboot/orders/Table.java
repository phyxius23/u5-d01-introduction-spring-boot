package epicode.u5d01introductionspringboot.orders;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Table {

  // Attributi
  private int numberTable;
  private int numberMaxPax;
  private TableState tableState;

  @Override
  public String toString() {
    return "\nTable: " + numberTable + "\nMax pax: " + numberMaxPax + "\nTable state: " + tableState;
  }

}
