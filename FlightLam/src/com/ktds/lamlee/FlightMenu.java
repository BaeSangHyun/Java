package com.ktds.lamlee;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FlightMenu {
	
	FlightMethods flightMethods = new FlightMethods();

	// 객체 생성 <질문> choice는 왜 private이고 메뉴는 왜 퍼블릭인가?
	private int choice;

	Scanner input = new Scanner(System.in);

	// 클래스 안에서 생긱는 생성자 //<질문> 생성자 안에 아무거나 넣으면 되나?
	public FlightMenu() {
		// 객체 초기화
		choice = 0;
	}

	public void printMenu() {
		System.out.println("*** 비행기 좌석 예약 프로그램 ***");
		System.out.println("1. 예약");
		System.out.println("2. 예약 취소");
		System.out.println("3. 종료");
	}

	/**
	 * 프로그램 시작
	 * 
	 * @param fligthSeats
	 */
	public void menu() {	
		while (true) {
			try {
				choice = input.nextInt();
			} catch (InputMismatchException ime) {
				input = new Scanner(System.in);
				ime.getMessage();
			}

			if (choice == 1) {
				while (true) {
					// 좌석 예약하기
					System.out.println("열, 행으로 좌석 입력하세요.");
					int[] seatNumber = choiceSeat();

					if (seatNumber == null) {
						System.out.println("잘못 입력했습니다.다시 입력하세요.");
						continue;
					}

					if (reservedSeat(seatNumber)) {
						System.out.println("예약에 성공했습니다.");
						flightMethods.printSeats();

					}
					break;
				}
			} else if (choice == 2) {
				while (true) {
					// 좌석 예약 취소하기
					System.out.println("취소하고 싶은 좌석을 열, 행으로 입력하세요.");
					int[] seatNumber = choiceSeat();

					if (seatNumber == null) {
						System.out.println("잘못 입력했습니다. 다시 입력하세요.");
						continue;
					}

					if (cancelSeat(seatNumber)) {
						System.out.println("취소가 완료되었습니다.");
					}
					break;
				}
			}

			else if (choice == 3) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);

			} else {
				System.out.println(" 잘못 입력하셨습니다. ");
			}
		}
	}

	/**
	 * 좌석 선택하기
	 * 
	 * @return
	 */
	public int[] choiceSeat() {
		String chairNumber = input.next();
		chairNumber = chairNumber.trim();
		chairNumber = chairNumber.replace(" ", "");
		String seatNumber[] = chairNumber.split(",");

		if (seatNumber.length != 2) {
			return null;
		}

		int row = Integer.parseInt(seatNumber[0]) - 1;
		int cell = Integer.parseInt(seatNumber[1]) - 1;

		System.out.println(row + "   " + cell);
		if (row > 2 || cell > 8) {
			return null;
		}

		return new int[] { row, cell };
	}

	/**
	 * 비행기 예약하기
	 * 
	 * @param flightseats
	 * @param chairNumber
	 * @return
	 */
	public boolean reservedSeat( int[] chairNumber) {
		return flightMethods.reservedSeat(chairNumber);
	}

	/**
	 * 비행기 예약 취소하기
	 * 
	 * @param fligthSeats
	 * @param chairNumber
	 * @return
	 */
	private boolean cancelSeat(int[] chairNumber) {
		return flightMethods.cancelSeat(chairNumber);
	}

}