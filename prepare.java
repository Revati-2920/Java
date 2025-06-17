public class prepare {
  public static void main(String[] args) {
    // Create variables of different data types
    String name="Revati";
    int items = 50;
    float costPerItem = 9.99f;
    float totalCost = items * costPerItem;
    char currency = '$';

    // Print variables
    System.out.println("Name: " + name);
    System.out.println("Number of items: " + items);
    System.out.println("Cost per item: " + costPerItem + currency);
    System.out.println("Total cost = " + totalCost + currency);
  }
}
 