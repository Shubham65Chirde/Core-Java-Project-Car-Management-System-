package Project;

import java.util.*;

public class ShowRoom {

    private String showroomName;
    private Inventory inventory;
    private List<Customer> customers;

    public ShowRoom(String showroomName) {
        this.showroomName = showroomName;
        this.inventory = new Inventory();
        this.customers = new ArrayList<>();
    }

    public String getShowroomName() {
        return showroomName;
    }

    public void setShowroomName(String showroomName) {
        this.showroomName = showroomName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
    
    
    public void registerCustomer(Customer c)
    {
        customers.add(c);
        System.out.println("Customer Registered Successfully.");
    }
    
    public Customer searchCustomer(String id)
    {
        for(Customer c : customers)
        {
            if(c.getCustomerId().equals(id))
            {
                return c;
            }
        }

        return null;
    }
    
    public void purchaseCar(String customerId, String carNumber)
    {
        Customer customer = searchCustomer(customerId);
        Car car = inventory.searchCar();

        if(customer != null && car != null)
        {
            if(!car.isSold())
            {
                customer.purchaseCar(car);

                System.out.println("Car Purchased Successfully.");
            }
            else
            {
                System.out.println("Car Already Sold.");
            }
        }
        else
        {
            System.out.println("Customer or Car Not Found.");
        }
    }
    
    public void displayCustomers()
    {
        if(customers.isEmpty())
        {
            System.out.println("No Customers Available.");
            return;
        }

        for(Customer c : customers)
        {
            c.displayCustomer();
            System.out.println();
        }
    }
    
    public void displayInventory()
    {
        inventory.displayAllCars();
    }
    
    public void displayAvailableCars()
    {
        inventory.displayAvailableCars();
    }
    
    public void displaySoldCars()
    {
        inventory.displaySoldCars();
    }
    
    public void displayShowRoom()
    {
        System.out.println("----------------------------");
        System.out.println("Showroom Name : " + showroomName);
        System.out.println("Total Cars : " + inventory.totalCars());
        System.out.println("Total Customers : " + customers.size());
        System.out.println("----------------------------");
    }
}