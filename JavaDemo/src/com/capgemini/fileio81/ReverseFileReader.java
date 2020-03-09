package com.capgemini.fileio81;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class ReverseFileReader {

	public static void main(String[] args) throws IOException {

		HashSet numbers = new HashSet();
		File file = new File("numbers.txt");
		Scanner scanner = new Scanner(file);

		while(scanner.hasNextInt())
		{
		    Integer next = scanner.nextInt();
		    numbers.add(next);
		}

		

}
}
