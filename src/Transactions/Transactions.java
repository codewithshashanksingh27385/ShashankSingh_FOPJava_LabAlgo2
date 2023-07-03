package Transactions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Transactions {

	private void process() {
		Scanner sc = new Scanner(System.in);
		int size = readInput(sc, "enter the size of transaction array", false).get(0);

	}

	public List<Integer> readInput(Scanner sc, String message, boolean furtherValuesNeeded, Integer loopSize) {

		List<Integer> inputList = new ArrayList<>();
		int values = loopSize > 0 ? loopSize : sc.nextInt();

		for (int i = 0; i < value; i++) {
			if (!furtherValuesNeeded) {
				inputList.add(value);
				break;
			}
			inputList.add(sc.nextInt());
		}
		return inputList;
	}

}
