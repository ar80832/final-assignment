package assignment5;

//import static org.junit.Assert.*;

import org.junit.Test;

public class CarFleetTests {
	Queue gasCars = new Queue();
	Queue hybridCars = new Queue();
	Queue electricCars = new Queue();
	CarFleet fleet = new CarFleet(gasCars, hybridCars, electricCars);
	
	Car car1 = new Car(14, 1, 52);
	Car car2 = new Car(15, 1, 64);
	Car car3 = new Car(12, 2, 5);
	Car car4 = new Car(90, 2, 77);
	Car car5 = new Car(13, 3, 9);
	Car car6 = new Car(8, 3, 4);
	
	Car car7 = new Car(16,14,15);
	
	Car car8 = new Car(77, 1, 4);
	Car car9 = new Car(89, 2, 5);
	Car car10 = new Car(54, 3, 6);
	
	Queue req = new Queue();
	
	@Test
	public void test0() {
		fleet.addCar(car1);
		fleet.addCar(car2);
		fleet.addCar(car3);
		fleet.addCar(car4);
		fleet.addCar(car5);
		fleet.addCar(car6);
	}
	@Test
	public void test1() {
		fleet.addCar(car7);
	}
	
	@Test
	public void test2() {
		fleet.addCar(car1);
		fleet.addCar(car2);
		fleet.addCar(car3);
		fleet.addCar(car4);
		fleet.addCar(car5);
		fleet.addCar(car6);
		
		req.enqueue(1);
		req.enqueue(2);
		req.enqueue(3);
		fleet.processRequests(req);
	}
	
	@Test
	public void test3() {
		fleet.addCar(car1);
		fleet.addCar(car2);
		fleet.addCar(car3);
		fleet.addCar(car4);
		fleet.addCar(car5);
		fleet.addCar(car6);
		fleet.addCar(car7);
		fleet.addCar(car8);
		fleet.addCar(car9);
		fleet.addCar(car10);
		
		req.enqueue(1);
		req.enqueue(2);
		req.enqueue(3);
		req.enqueue(2);
		req.enqueue(2);
		fleet.processRequests(req);
	}
	
	@Test
	public void test4() {
		fleet.addCar(car1);
		fleet.addCar(car2);
		fleet.addCar(car3);
		fleet.addCar(car4);
		fleet.addCar(car5);
		fleet.addCar(car6);
		fleet.addCar(car7);
		fleet.addCar(car8);
		fleet.addCar(car9);
		fleet.addCar(car10);
		
		req.enqueue(1);
		req.enqueue(4);
		req.enqueue(3);
		req.enqueue(56);
		req.enqueue(2);
		
		fleet.processRequests(req);
	}
	
	@Test
	public void test5() {
		fleet.addCar(car1);
		fleet.addCar(car2);
		fleet.addCar(car3);
		fleet.addCar(car4);
		fleet.addCar(car5);
		fleet.addCar(car6);
		
		req.enqueue(1);
		req.enqueue(2);
		req.enqueue(3);
		req.enqueue(2);
		req.enqueue(2);
		req.enqueue(1);
		
		fleet.processRequests(req);

	}
}
