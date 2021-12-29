package korney.adventOfCode2021.day1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class day1 {

	public static void main(String[] args) throws FileNotFoundException {

		String fileName = "d:\\Dropbox\\Dropbox\\files\\EclipseWorkspaces\\0_study\\adventOfCode\\src\\korney\\adventOfCode2021\\day1\\day1input.txt";
		Scanner scanner = new Scanner(new File(fileName));

		ArrayList<Integer> depthReadings = new ArrayList<>();
		while (scanner.hasNext()) {
			depthReadings.add(scanner.nextInt());
		}
		scanner.close();
		int depthValuesNumber = depthReadings.size();

		int depthIncrementsNumber = 0;
		for (int i = 1; i < depthValuesNumber; i++) {
			if (depthReadings.get(i) > depthReadings.get(i - 1)) {
				depthIncrementsNumber++;
			}
		}

		int depthTriadsIncrementsNumber = 0;
		for (int i = 3; i < depthValuesNumber; i++) {
			if (depthReadings.get(i)  > depthReadings.get(i - 3)) {
				depthTriadsIncrementsNumber++;
				//no need to calc triads as summs only differ with 1 element out of 3
			}
		}

		System.out.println("Number of input depth readings: " + depthValuesNumber);
		System.out.println("Number of increments: " + depthIncrementsNumber);
		System.out.println("Number of triads increments: " + depthTriadsIncrementsNumber);
		

	}

}
