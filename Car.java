package assignment5;
import java.util.Hashtable;
import java.util.Scanner;
public class Car {
	private int id;
	private int powerSource;
	private float pricePerDay;
	
	Car(int id, int powerSource, float pricePerDay) {
		this.id = id;
		this.powerSource = powerSource;
		this.pricePerDay = pricePerDay;
	}

	public int getId() {
		return this.id;
	}	
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getPowerSource() {
		return this.powerSource;
	}
	
	public void setPowerSource(int powerSource) {
		/*if(powerSource < 1 || powerSource > 3) {
			throw new IllegalArgumentException("This is not a valid powerSource. The value of powerSource must be 1, 2, or 3.");
		}*/
		this.powerSource = powerSource;
	}
	
	public float getPricePerDay() {
		return this.pricePerDay;
	}
	
	public void setPricePerDay(float pricePerDay) {
		this.pricePerDay = pricePerDay;
	}
	
	public void getData(Scanner scanner) {
		System.out.println("Enter id: ");
		this.id = Integer.parseInt(scanner.nextLine());
		System.out.println("Enter power source: ");
		this.powerSource = Integer.parseInt(scanner.nextLine());
		System.out.println("Enter price per day: ");
		this.pricePerDay = Float.parseFloat(scanner.nextLine());
	}
	
	@Override
	public String toString() {
		if (this.powerSource < 1 || this.powerSource > 3) {
			throw new IllegalArgumentException("This is not a valid powerSource. The value of powerSource must be 1 (gas), 2(hybrid), or 3(electric). Please try again.");
		}
		else {
			Hashtable<Integer, String> powerSourceType = new Hashtable<Integer, String>();
			powerSourceType.put(1, "Gasoline Car");
			powerSourceType.put(2, "Hybrid Car");
			powerSourceType.put(3, "Electric Car");
			String source = powerSourceType.get(powerSource);
			
			String stringReturn = "Car: " 
						+ "Id: " + this.id 
						+ ", Power source: " + source
						+ ", Price per day: " + this.pricePerDay + "\n";
			return(stringReturn);
		}
		
		
		
	}
}
