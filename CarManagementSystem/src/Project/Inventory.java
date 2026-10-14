package Project;

import java.util.*;

public class Inventory {

	Scanner sc = new Scanner(System.in);
	
	private List<Car> car = new ArrayList<>();

	public List<Car> getCar() {
		return car;
	}

	public void setCar(List<Car> car) {
		this.car = car;
	}
	
	public void addCar()
	{
	    System.out.println("1. Thar");
	    System.out.println("2. Fortuner");
	    System.out.println("3. Scorpio");

	    int ch = sc.nextInt();

	    switch(ch)
	    {
	        case 1:
	        {
	            System.out.println("Enter Thar Details");

	            System.out.print("Enter Car Number : ");
	            String cn = sc.next();

	            String brand = "Thar";

	            System.out.print("Enter Model : ");
	            String md = sc.next();

	            System.out.print("Enter Colour : ");
	            String cl = sc.next();

	            System.out.print("Enter Price : ");
	            double pr = sc.nextDouble();

	            boolean sold = false;
	            String owner = "No Owner";

	            Thar t = new Thar(cn, brand, md, cl, pr, sold, owner);

	            System.out.print("Enter Variant : ");
	            t.setVariant(sc.next());

	            System.out.print("Four Wheel Drive (true/false) : ");
	            t.setFourWheeldrive(sc.nextBoolean());

	            car.add(t);

	            System.out.println("Thar Added Successfully.");
	            break;
	        }

	        case 2:
	        {
	            System.out.println("Enter Fortuner Details");

	            System.out.print("Enter Car Number : ");
	            String cn = sc.next();

	            String brand = "Fortuner";

	            System.out.print("Enter Model : ");
	            String md = sc.next();

	            System.out.print("Enter Colour : ");
	            String cl = sc.next();

	            System.out.print("Enter Price : ");
	            double pr = sc.nextDouble();

	            boolean sold = false;
	            String owner = "No Owner";

	            Fortuner f = new Fortuner(cn, brand, md, cl, pr, sold, owner);

	            System.out.print("Enter Variant : ");
	            f.setVariant(sc.next());

	            System.out.print("Four Wheel Drive (true/false) : ");
	            f.setFourWheeldrive(sc.nextBoolean());

	            car.add(f);

	            System.out.println("Fortuner Added Successfully.");
	            break;
	        }

	        case 3:
	        {
	            System.out.println("Enter Scorpio Details");

	            System.out.print("Enter Car Number : ");
	            String cn = sc.next();

	            String brand = "Scorpio";

	            System.out.print("Enter Model : ");
	            String md = sc.next();

	            System.out.print("Enter Colour : ");
	            String cl = sc.next();

	            System.out.print("Enter Price : ");
	            double pr = sc.nextDouble();

	            boolean sold = false;
	            String owner = "No Owner";

	            Scorpio s = new Scorpio(cn, brand, md, cl, pr, sold, owner);

	            System.out.print("Enter Variant : ");
	            s.setVariant(sc.next());

	            System.out.print("Four Wheel Drive (true/false) : ");
	            s.setFourWheeldrive(sc.nextBoolean());

	            car.add(s);

	            System.out.println("Scorpio Added Successfully.");
	            break;
	        }

	        default:
	        {
	            System.out.println("Invalid Choice");
	        }
	    }
	}
	
	public void removeCar()
	{
	    System.out.print("Enter Car Number : ");
	    String no = sc.next();

	    Iterator<Car> it = car.iterator();

	    while(it.hasNext())
	    {
	        Car c = it.next();

	        if(c.getCarNumber().equals(no))
	        {
	            it.remove();
	            System.out.println("Car Removed Successfully");
	            return;
	        }
	    }

	    System.out.println("Car Not Found");
	}
	
	public Car searchCar()
	{
	    System.out.print("Enter Car Number : ");
	    String no = sc.next();

	    for(Car c : car)
	    {
	        if(c.getCarNumber().equals(no))
	        {
	            return c;
	        }
	    }

	    return null;
	}
	
	public void displayAllCars()
	{
	    if(car.isEmpty())
	    {
	        System.out.println("No Cars Available");
	        return;
	    }

	    for(Car c : car)
	    {
	        c.displayDetails();
	    }
	}
	
	public void displayAvailableCars()
	{
	    for(Car c : car)
	    {
	        if(!c.isSold())
	        {
	            c.displayDetails();
	        }
	    }
	}
	
	public void displaySoldCars()
	{
	    for(Car c : car)
	    {
	        if(c.isSold())
	        {
	            c.displayDetails();
	        }
	    }
	}
	
	public int totalCars()
	{
	    return car.size();
	}
}
