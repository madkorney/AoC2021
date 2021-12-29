package korney.adventOfCode2021.day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class day2 {

	public static void main(String[] args) throws FileNotFoundException {

		String fileName = "src\\korney\\adventOfCode2021\\day2\\input.txt";

		ArrayList<BoatCommands> commandLog = new ArrayList<>();

		Scanner scanner = new Scanner(new File(fileName));
		while (scanner.hasNext()) {
			BoatCommands curComm = new BoatCommands();
			curComm.Command = scanner.next().toLowerCase().trim();
			curComm.CommandValue = scanner.nextInt();
			commandLog.add(curComm);
		}
		scanner.close();

		
		//Day 1 part 1
		int depth = 0;
		int xPos = 0;

		for (BoatCommands cLog : commandLog) {
			if (cLog.Command.contentEquals("forward")) {
				xPos += cLog.CommandValue;
			}
			if (cLog.Command.contentEquals("down")) {
				depth += cLog.CommandValue;
			}
			if (cLog.Command.contentEquals("up")) {
				depth -= cLog.CommandValue;
			}
		}

		System.out.println("> Part 1 < ");
		System.out.println("Final Depth: " + depth);
		System.out.println("Final position: " + xPos);
		System.out.println("Final answer, part 1: " + xPos * depth);
		
		// Day 1 Part 2
		
		depth = 0;
		xPos = 0;
		int aim =0;

		for (BoatCommands cLog : commandLog) {
			if (cLog.Command.contentEquals("forward")) {
				xPos += cLog.CommandValue;
				depth += aim * cLog.CommandValue;
			}
			if (cLog.Command.contentEquals("down")) {
				aim += cLog.CommandValue;
			}
			if (cLog.Command.contentEquals("up")) {
				aim -= cLog.CommandValue;
			}
		}

		System.out.println("> Part 2 < ");
		System.out.println("Final Depth: " + depth);
		System.out.println("Final position: " + xPos);
		System.out.println("Final answer, part 1: " + xPos * depth);

	}

}
