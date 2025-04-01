import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Coffee c = new Coffee("large", true, 10, "latte");
    SpecialtyCoffee latte1 = new SpecialtyCoffee("large", false, 10, "mocha", "caramel");
    System.out.println(c);
    System.out.println(latte1);
  }
}
