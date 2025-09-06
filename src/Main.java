import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your first name: ");
    String firstName = scanner.nextLine();

    System.out.print("Enter your last name: ");
    String lastName = scanner.nextLine();

    System.out.print("Enter your age: ");
    int age = scanner.nextInt();
    scanner.nextLine(); // Flush the leftover newline from STDIN

    System.out.print(
      "Enter the average amount of sleep you get in a day in hours: "
    );
    float avgSleep = scanner.nextFloat();
    scanner.nextLine();

    System.out.println("Person");
    System.out.println("------------------------------");
    System.out.format("%-15s%15s\n", "First name:", firstName);
    System.out.format("%-15s%15s\n", "Last name:", lastName);
    System.out.format("%-15s%9d years\n", "Age:", age);
    System.out.format("%-20s%4.1f hours\n", "Avg daily sleep:", avgSleep);

    scanner.close();
  }
}
