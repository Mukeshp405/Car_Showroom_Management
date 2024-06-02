import java.util.Scanner;

// Car Class
public class Cars extends Showroom implements utility {
    String car_name;
    String car_color;
    String car_fuel_type;
    int car_price;
    String car_type;
    String car_transmission;

    @Override
    public void get_details() {
        System.out.println();
        System.out.println("         --------------");
        System.out.println("---------| Car Detail |----------");
        System.out.println("         --------------");
        System.out.println("Name :- " + car_name);
        System.out.println("Color :- " + car_color);
        System.out.println("Fuel Type :- " + car_fuel_type);
        System.out.println("Price :- " + car_price);
        System.out.println("Car type :- " + car_type);
        System.out.println("Transmission :- " + car_transmission);
        System.out.println("---------------------------------");
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("              ---------------------");
        System.out.println("--------------| ENTER CAR DETAILS |--------------");
        System.out.println("              ---------------------");
        System.out.println();
        System.out.print("  Car Name :- ");
        car_name = sc.nextLine();
        System.out.print("  Car Color :- ");
        car_color = sc.nextLine();
        System.out.print("  Car fuel type(diesel/petrol) :- ");
        car_fuel_type = sc.nextLine();
        System.out.print("  Car Price :- ");
        car_price = sc.nextInt();
        sc.nextLine();
        System.out.print("  Car type(sedan/suv/hatchback) :- ");
        car_type = sc.nextLine();
        System.out.print("  Transmission type(Automatic/Manual) :- ");
        car_transmission = sc.nextLine();
        total_cars_in_stock++;
        System.out.println("-------------------------------------------------");
    }
}
