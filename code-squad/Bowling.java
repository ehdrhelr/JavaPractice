import java.util.Scanner;

public class Bowling {

    public Bowling() { // default constructor

    }
	
	public void getReadyForGame() {
		Scanner sc = new Scanner(System.in);		
		System.out.print("플레이어의 이름은(3 english letters)?: ");
		String nameOfPlayer = sc.nextLine();
		System.out.println("| NAME |  01  |  02  |  03  |  04  |  05  |  06  |  07  |  08  |  09  |  10  |");
		System.out.printf("|  %s |      |      |      |      |      |      |      |      |      |      |%n", nameOfPlayer);
		System.out.printf("|      |      |      |      |      |      |      |      |      |      |      |%n", nameOfPlayer);
        rollBall(nameOfPlayer);
    }
	
	public void rollBall(String nameOfPlayer) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%s's turn : ", nameOfPlayer);
        String score = sc.nextLine();
        
    }

    public void recordScore() {

	};
	
	public static void main(String args[]) {
		Bowling bowling = new Bowling();
		bowling.getReadyForGame();
	}
}

// 
