package Project;

import java.util.*;

public class Customer {

	Scanner sc = new Scanner(System.in);
	
	private String customerId;
	private String customerName;
	private String phoneNumber;
	private String address;
	
	private List<Car> purc = new ArrayList<>();

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Car> getPurc() {
		return purc;
	}

	public void setPurc(List<Car> purc) {
		this.purc = purc;
	}
	
	
	public void purchaseCar(Car c)
	{
	    if(c != null)
	    {
	        c.setSold(true);
	        c.setOwner(customerName);
	        purc.add(c);

	        System.out.println("Car Purchased Successfully.");
	    }
	    else
	    {
	        System.out.println("Car Not Found.");
	    }
	}
	
	public void displayCustomer()
	{
		System.out.println("Customer Details");
		System.out.println("Customer ID : "+getCustomerId());
		System.out.println("Customer Name : "+getCustomerName());
		System.out.println("Customer Phone No : "+getPhoneNumber());
		System.out.println("Customer Adddress : "+getAddress());
	}
	
	public void displayPurchcar()
	{
	    if(purc.isEmpty())
	    {
	        System.out.println("No Cars Purchased.");
	        return;
	    }

	    System.out.println("Purchased Cars");

	    for(Car c : purc)
	    {
	        c.displayDetails();
	    }
	}
}
