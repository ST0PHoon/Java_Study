package Main;

import java.util.Scanner;

public class A3_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String computerRPS = rpsResult();

		System.out.println("input a number(0 : Rock, 1 : Paper, 2 : Scissor)");
		int userRPS = sc.nextInt();

		System.out.println("Computer : " + computerRPS);
		System.out.println(winLose(computerRPS, userRPS));
	}

	public static String rpsResult() {
		String ret = "";
		int randomNumber = (int) (Math.random() * 3);
		if (randomNumber == 0) {
			ret = "Rock";
		} else if (randomNumber == 1) {
			ret = "Paper";
		} else {
			ret = "Scissor";
		}
		return ret;
	}

	public static String winLose(String computer, int user) {
		String winLoseResult;

		if (computer.equals("Rock")) {
			if (user == 0) {
				winLoseResult = "Draw";
				return winLoseResult;
			} else if (user == 1) {
				winLoseResult = "Win";
				return winLoseResult;
			} else {
				winLoseResult = "Lose";
				return winLoseResult;
			}
		} else if (computer.equals("Paper")) {
			if (user == 0) {
				winLoseResult = "Lose";
				return winLoseResult;
			} else if (user == 1) {
				winLoseResult = "Draw";
				return winLoseResult;
			} else {
				winLoseResult = "Win";
				return winLoseResult;
			}
		} else {
			if (user == 0) {
				winLoseResult = "Win";
				return winLoseResult;
			} else if (user == 1) {
				winLoseResult = "Lose";
				return winLoseResult;
			} else {
				winLoseResult = "Draw";
				return winLoseResult;
			}
		}
	}

}
