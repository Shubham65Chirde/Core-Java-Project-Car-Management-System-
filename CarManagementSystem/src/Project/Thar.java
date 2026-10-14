package Project;

public class Thar extends Car
{

	public Thar(String carNumber, String brand, String model, String color, double price, boolean sold, String owner) 
	{
		super(carNumber, brand, model, color, price, sold, owner);
	}

	private String variant;
	private boolean fourWheeldrive;

	@Override
	public void displayDetails() 
	{
		System.out.println("------------------------------------");
		System.out.println("            Thar Details");
		
		System.out.println("Car Number  : "+getCarNumber());
		System.out.println("Car Brand   : "+getBrand());
		System.out.println("Car Colour  : "+getColor());
		System.out.println("Car Variant : "+variant);
		if(fourWheeldrive)
		{
			System.out.println("Car FourWheelDrive : Yes ");
		}
		else
		{
			System.out.println("Car FourWheelDrive : No ");
		}
		
	}

	public String getVariant() {
		return variant;
	}

	public void setVariant(String variant) {
		this.variant = variant;
	}

	public boolean isFourWheeldrive() {
		return fourWheeldrive;
	}

	public void setFourWheeldrive(boolean fourWheeldrive) {
		this.fourWheeldrive = fourWheeldrive;
	}
}
