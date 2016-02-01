package com.ktds.lamlee;

public class FlightLamMain {

	public void start() {

		FlightMethods flightMethods = new FlightMethods();
		FlightMenu flightMenu = new FlightMenu();

		while (true) {
			flightMethods.FlightMethod();
			flightMethods.printSeats();

			/*if (flightMethods.isFullReserved()) {
				System.out.println("빈자리가 없어요. 프로그램을 강제 종료합니다.");
				break;
			}*/

			flightMenu.printMenu();
			
			flightMenu.menu();

		}
	}

	public static void main(String[] args) {
		FlightLamMain flightLamMain = new FlightLamMain();
		flightLamMain .start();
	}

}