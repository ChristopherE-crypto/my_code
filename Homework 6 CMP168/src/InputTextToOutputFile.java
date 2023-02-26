import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputTextToOutputFile {
	
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		String sentinel = "STOP!";
		System.out.println("What is the name of your output file?");
		String fileName = scnr.nextLine();
		String lineIn = "";
		PrintWriter outStream = null;
		
		try {
			outStream = new PrintWriter(new FileOutputStream(fileName, true));
			
			do {
				lineIn = scnr.nextLine();
				if(lineIn.equalsIgnoreCase(sentinel)) {
					break;
				}
				outStream.println(lineIn);
			}while(!lineIn.contains(sentinel));
		}catch(FileNotFoundException e) {
			System.out.println("File Not Found: " + fileName);
		}finally {
			if(scnr != null) {
				scnr.close();
			}
			if(outStream != null) {
				outStream.close();
			}
			
		}
	}

}
