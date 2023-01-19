package assignment5;
//import java.util.Scanner;
//import java.util.Collection;
//import java.util.LinkedList;

import java.util.LinkedList;
import java.util.List;

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
	
	public List<Object> processRequests(Queue req) {
		List<Object> customerOrder = new LinkedList<>();
		for (int i = 0; i < req.getSize(); i++) {
			if (req.getInfo(i).equals(1) && gasCars.getSize() > 0) {
				customerOrder.add(gasCars.dequeue());
			}
			else if (req.getInfo(i).equals(2) && hybridCars.getSize() > 0) {
				customerOrder.add(hybridCars.dequeue());	
			}
			else if (req.getInfo(i).equals(3) && electricCars.getSize() > 0) {
				customerOrder.add(electricCars.dequeue());
			}
			else {
				Car empty = new Car(0, 1, 1);
				customerOrder.add(empty);
			}
		}
		return customerOrder;
	}
	
	
	
}
