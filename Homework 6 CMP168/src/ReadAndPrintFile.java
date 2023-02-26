import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadAndPrintFile {
	
	private static void readFile(String fileName) {
		File file = new File(fileName);
		Scanner output = null;
		String line = "";
		
			try {
				output = new Scanner(file);
				while(output.hasNext()) {
					line = output.nextLine();
					System.out.println(line);
				}
			} catch (FileNotFoundException e) {
				System.out.println("File Not Found " + fileName);
			}
	}

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("What is the name of your file?");
		String fileName = scnr.nextLine();
		File file = new File(fileName);
		
		System.out.println(file.exists());
		System.out.println(file.canRead());
		
		if(file.exists()) {
			readFile(fileName);
			scnr.close();
		}
		
		while(!file.exists()) {
			System.out.println("File Not Found " + fileName);
			System.out.println("What is the name of your file?");
			fileName = scnr.nextLine();
			file = new File(fileName);
			if(file.exists()) {
				readFile(fileName);
				scnr.close();
			}
		}
	}
}
