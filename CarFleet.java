package assignment5;
//import java.util.Scanner;
//import java.util.Collection;
//import java.util.LinkedList;

//import java.util.LinkedList;

public class CarFleet {
	private Queue gasCars;
	private Queue hybridCars;
	private Queue electricCars;
	
	CarFleet(Queue gasCars, Queue hybridCars, Queue electricCars) {
		this.gasCars = gasCars;
		this.hybridCars = hybridCars;
		this.electricCars = electricCars;
	}
	public boolean addCar(Car car) {
		if (car.getPowerSource() == 1) {
			gasCars.enqueue(car);
			return true;
		}
		else if (car.getPowerSource() == 2) {
			hybridCars.enqueue(car);
			return true;
		}
		else if (car.getPowerSource() == 3) {
			electricCars.enqueue(car);
			return true;
		}
		else {
			return false;
		}
	
	}
	
	public Queue processRequests(Queue req) {
		Queue customerOrder = new Queue();
		for (int i = 0; i < req.getSize(); i++) {
			if (req.getInfo(i).equals(1) && gasCars.getSize() > 0) {
				customerOrder.enqueue(gasCars.dequeue());
			}
			else if (req.getInfo(i).equals(2) && hybridCars.getSize() > 0) {
				customerOrder.enqueue(hybridCars.dequeue());	
			}
			else if (req.getInfo(i).equals(3) && electricCars.getSize() > 0) {
				customerOrder.enqueue(electricCars.dequeue());
			}
			else {
				Car empty = new Car(0, 1, 1);
				customerOrder.enqueue(empty);
			}
		}
		return customerOrder;
	}
	
	
	
}
