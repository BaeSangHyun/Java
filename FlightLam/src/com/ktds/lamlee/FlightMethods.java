package com.ktds.lamlee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightMethods {

	// hashmap으로 비행기 빈좌석 만들기, 현재 클래스 내부에서만 불려서 private. 스트링 타입의 리스트로 선언.
	private Map<Integer, List<String>> seatsetting;
	private List<String> seatLine;
	
	public FlightMethods() { //클래스명과 동일한 메소드를 만들어서 여기서 한번에 객체생성(?)해주는게 좋다고 하셨어용
		this.seatsetting = new HashMap<Integer, List<String>>();
	}

	public Map<Integer, List<String>> getSeatsetting() { // map도 get, set 생성
		return seatsetting;
	}

	public void setSeatsetting(Map<Integer, List<String>> seatsetting) {
		this.seatsetting = seatsetting;
	}

	// 생성자 : 한번 클래스랑 같은 이름으로 생김. 다른 클래스에서도 불리기 때문에 외부에서도 접근 가능한 public으로 해줌.
	// 초기화를 생성자 내에서 해줌.
	public Map<Integer, List<String>> FlightMethod() { // Map을 이용하여 리스트 생성
		System.out.println("");
		for (int j = 0; j < 2; j++) { // 행
			this.seatLine = new ArrayList<String>(); // 인스턴스화를 여기서 해준다. 왜냐면 j를 하나씩 돌면서 리스트를 만들어서 넣는 방식
			// j 가 0일때 첫번째 리스트를 새로 생성해서 아래 for문을 돌면서 한줄이 생선되는거에요. 1
			// j 가 1일때 마찬가지로 새로운 리스트를 생성해서 아래 for문을 돌면서 또 한줄을 생성 4
			for (int i = 0; i < 8; i++) { // 열
				seatLine.add("○");
				//0 부터 7까지 돌면서 리스트 한줄을 완성 ○○○○○○○○ 를 완성 2
				//0 부터 7까지 돌면서 리스트 또 다른 한줄을 완성 ○○○○○○○○ 를 완성 5
			}
			seatsetting.put(j, seatLine); 
			// 만든 첫번째 리스트를 map의 첫번째 줄에 넣는다. 3
			// 두번째 리스트를 map의 두번째 줄에 넣는다. 6
		}
		// for문 두개 다돌면
		// ○○○○○○○○ 
		// ○○○○○○○○  이런 형식이 완성
		return seatsetting;
	}

	/**
	 * 좌석 출력하기
	 */
	public void printSeats() {
		// null을 해서 초기화시켜서 썼다 지웠다 할 수 있음.
		// null로 초기화하면 리스트가 저장이 안되고 계속 초기화 될 수 있으므로 초기화 하지 않아도 됩니당
		for (int i = 0; i < 2; i++) {
			this.seatLine = this.seatsetting.get(i); // this.으로 현재 클래스라는걸 알려주는....
			for (String s : seatLine) {
				System.out.print(s); // ln 하지 말고 print해야 옆으로 쫙 감.
			}
			System.out.println(""); // 한줄 뜀
		}
	}

	/**
	 * 비행기 좌석 예약하기
	 * 
	 * @param seatNumber
	 * @return
	 */
	public boolean reservedSeat(int[] seatNumber) {
		List<String> selectedSeat = seatsetting.get(seatNumber[0]);

		if (selectedSeat.get(seatNumber[1]).equals("●")) {
			System.out.println("이미 예약된 좌석입니다.");
			return false;
		} else {
			selectedSeat.set(seatNumber[1], "●");
			return true;
		}
	}

	/**
	 * 예약이 모두 찼는지 체크
	 * @return
	 */
	public boolean isFullReserved() {
		List<String> seatLine = null;
		int reservedCount = 0;

		for (int i = 0; i < 2; i++) {
			seatLine = seatsetting.get(i);
			for (String s : seatLine) {
				if (s.equals("●")) {
					reservedCount++;
				}
			}
		}
		return reservedCount == 16;
	}

	/**
	 * 비행기 좌석 예약 취소하기
	 * @param seatNumber
	 * @return
	 */
	public boolean cancelSeat(int[] seatNumber) {

		List<String> selectedSeat = seatsetting.get(seatNumber[0]);

		if (selectedSeat.get(seatNumber[1]).equals("●")) {
			selectedSeat.set(seatNumber[1], "○");
			return true;
		} else {
			System.out.println("예약되지 않은 좌석입니다. 다시 확인해주세요.");
			return false;
		}
	}

}
