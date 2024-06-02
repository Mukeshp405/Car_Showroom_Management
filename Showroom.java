import java.util.Scanner;

// Showroom Class
public class Showroom implements utility {
    String showroom_name;
    String showroom_address;
    int total_employees;
    int total_cars_in_stock = 0;
    String manager_name;

    @Override
    public void get_details() {
        System.out.println();
        System.out.println("       -------------------");
        System.out.println("-------| ShowRoom Detail |-------");
        System.out.println("       -------------------");
        System.out.println("Showroom Name :- " + showroom_name);
        System.out.println("Showroom Address :- " + showroom_address);
        System.out.println("Manager Name :- " + manager_name);
        System.out.println("Total Employees :- " + total_employees);
        System.out.println("Total Cars in Stock :- " + total_cars_in_stock);
        System.out.println("----------------------------------");
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("              --------------------------");
        System.out.println("--------------| ENTER SHOWROOM DETAILS |--------------");
        System.out.println("              --------------------------                 ");
        System.out.print("  Showroom Name :- ");
        showroom_name = sc.nextLine();
        System.out.print("  Showroom Address :- ");
        showroom_address = sc.nextLine();
        System.out.print("  Manager Name :- ");
        manager_name = sc.nextLine();
        System.out.print("  Total Number of Employees :- ");
        total_employees = sc.nextInt();
        System.out.print("  Total cars in Stock :- ");
        total_cars_in_stock = sc.nextInt();
        System.out.println("------------------------------------------------------");
    }
}
