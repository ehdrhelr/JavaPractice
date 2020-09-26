import java.util.*;

public class NumberBaseballGame {
	
	public NumberBaseballGame() {
		String numberOfComputer = getNumberOfComputer();
		playGame(numberOfComputer);
	}

	public String getNumberOfComputer() { // 컴퓨터의 3자리 숫자를 문자열로 받아온다.
		List<Integer> positiveIntegerList = new ArrayList<>();
		for (int i = 0; i < 9; i++)	positiveIntegerList.add(i + 1);
		Collections.shuffle(positiveIntegerList);
		String numberOfComputer = "";
		for (int i = 0; i < 3; i++)	numberOfComputer += positiveIntegerList.get(i) + "";
		
		return numberOfComputer;
	} // 7 lines, 1 depth

	public String getNumberOfPlayer() { // 플레이어의 3자리 숫자를 문자열로 받아온다.
		Scanner sc = new Scanner(System.in);
		int inputNumber = sc.nextInt();
		//checkIndexRange(inputNumber);
		String numberOfPlayer = inputNumber + "";
		return numberOfPlayer;
	} // 5 lines, 0 depth
	
	public void checkIndexRange(int inputNumber) {
		if (inputNumber < 100 || 1000 <= inputNumber) {
			System.out.println("세자리 숫자를 입력해주세요 ex)123 : ");
			getNumberOfPlayer();
		}
	}
	public boolean checkDuplication(int inputNumber) {
		String inputNumberStr = inputNumber + "";
		for (int i = 0; i < inputNumberStr.length() - 1; i++) {
		
		}
		return false;
	}
	
	/* 문자열로된 3자리의 숫자 2개를 비교하여 스트라이크와 볼을 센다 */
	public String countStrikeAndBall(String com, String player) {
		int strike = 0;
		int ball = 0;
		for (int i = 0; i < player.length(); i++) { // 숫자 자리수 만큼 진행
			if (com.charAt(i) == player.charAt(i)) { // 인덱스와 값이 같으면 스트라이크 +1
				strike++;
			} else if (com.contains(player.charAt(i) + "")) { // 같은 인덱스의 값이 서로 다른데 해당 값을 포함하고 있으면 볼 +1 
				ball++;
			}
		}
		return "" + strike + ball;
	} // 10 lines, 2 depth
	
	public void playGame(String numberOfComputer) {
		System.out.print("숫자를 입력해주세요 ex)123 : ");
		String numberOfPlayer = getNumberOfPlayer();
		String result = countStrikeAndBall(numberOfComputer, numberOfPlayer);
		showStrikeAndBall(result.charAt(0), result.charAt(1));
		if (result.charAt(0) == '3') {
			System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
			return;
		}
		playGame(numberOfComputer);
	} // 9 lines, 1 depth
	
	public void showStrikeAndBall(char strike, char ball) { // 스트라이크와 볼을 받아와서 표시해주는 전광판
		if (strike != '0' && ball != '0') { 
			System.out.println(strike + " 스트라이크 " + ball + "볼");
		} else if (strike == '0' && ball != '0') {
			System.out.println(ball + "볼");
		} else if (strike != '0' && ball == '0') {
			System.out.println(strike + " 스트라이크"); 
		} else if (strike == '0' && ball == '0') {
			System.out.println("낫싱");
		}		
	} // 9 lines, 1 depth
	
	public static void main(String[] args) {
		NumberBaseballGame game = new NumberBaseballGame();	
	}
}

