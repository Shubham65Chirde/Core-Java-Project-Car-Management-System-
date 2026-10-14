package Project;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ShowRoom showroom = new ShowRoom("Shubham Car Showroom");

        int choice;

        do {

            System.out.println("\n==================================");
            System.out.println("      CAR SHOWROOM MANAGEMENT");
            System.out.println("==================================");
            System.out.println("1. Add Car");
            System.out.println("2. Remove Car");
            System.out.println("3. Search Car");
            System.out.println("4. Register Customer");
            System.out.println("5. Purchase Car");
            System.out.println("6. Display All Cars");
            System.out.println("7. Display Available Cars");
            System.out.println("8. Display Sold Cars");
            System.out.println("9. Display Customers");
            System.out.println("10. Display Showroom");
            System.out.println("0. Exit");
            System.out.print("Enter Choice : ");

            choice = sc.nextInt();

            switch (choice) {

            case 1:

                showroom.getInventory().addCar();

                break;

            case 2:

                showroom.getInventory().removeCar();

                break;

            case 3:

                System.out.print("Enter Car Number : ");
                String carNo = sc.next();

                Car c = showroom.getInventory().searchCar();

                if (c != null)
                    c.displayDetails();
                else
                    System.out.println("Car Not Found");

                break;

            case 4:

                Customer customer = new Customer();

                System.out.print("Enter Customer ID : ");
                customer.setCustomerId(sc.next());

                sc.nextLine();

                System.out.print("Enter Customer Name : ");
                customer.setCustomerName(sc.nextLine());

                System.out.print("Enter Phone Number : ");
                customer.setPhoneNumber(sc.next());

                sc.nextLine();

                System.out.print("Enter Address : ");
                customer.setAddress(sc.nextLine());

                showroom.registerCustomer(customer);

                break;

            case 5:

                System.out.print("Enter Customer ID : ");
                String cid = sc.next();

                System.out.print("Enter Car Number : ");
                String cno = sc.next();

                showroom.purchaseCar(cid, cno);

                break;

            case 6:

                showroom.displayInventory();

                break;

            case 7:

                showroom.displayAvailableCars();

                break;

            case 8:

                showroom.displaySoldCars();

                break;

            case 9:

                showroom.displayCustomers();

                break;

            case 10:

                showroom.displayShowRoom();

                break;

            case 0:

                System.out.println("Thank You...");
                break;

            default:

                System.out.println("Invalid Choice");

            }

        } while (choice != 0);

        sc.close();
    }
}