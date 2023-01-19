package assignment5;

//import static org.junit.Assert.*;

//import java.util.Scanner;

import org.junit.Test;

public class CarTests {
	//private Car gasCar;
	//private Car hybridCar;
	//private Car electricCar;
	//Scanner carScanner = new Scanner(System.in);
    //String input = carScanner.nextLine();

	@Test
	public void test0() {
		Car testCar = new Car(0, 0, 0);
		testCar.toString();
	}
	@Test
	public void test1() {
		Car testCar = new Car(14, 1, 12);
		testCar.toString();
	}
	@Test
	public void test3() {
		Car testCar = new Car(123, 2, 48);
		testCar.toString();
	}
	@Test
	public void test4() {
		Car testCar = new Car(94, 3, 29);
		testCar.toString();
	}
	@Test
	public void test5() {
		Car testCar = new Car(4, 4, 483);
		testCar.toString();
	}
	@Test
	public void test6() {
		Car testCar = new Car(1, -1, 1);
		testCar.toString();
	}
	@Test
	public void test7() {
		Car testCar = new Car(1000, 17, 102);
		testCar.toString();
	}
	
	
}
