package Project;

public abstract class Car {
	
	private String carNumber;
	private String brand;
	private String model;
	private String color;
	private double price;
	private boolean sold;
	private String owner;
	
	

	public Car(String carNumber, String brand, String model, String color, double price, boolean sold, String owner) {
		super();
		this.carNumber = carNumber;
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.price = price;
		this.sold = sold;
		this.owner = owner;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isSold() {
		return sold;
	}

	public void setSold(boolean sold) {
		this.sold = sold;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
    public abstract void displayDetails();
}
