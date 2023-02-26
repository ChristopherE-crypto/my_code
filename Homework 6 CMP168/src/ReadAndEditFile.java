import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadAndEditFile {
	
	public static String capitalize(String sentence) {
		int pos = 0;
		boolean capitalize = true;
		StringBuilder sb = new StringBuilder(sentence);
		while (pos < sb.length()) {
		    if (sb.charAt(pos) == '.') {
		        capitalize = true;
		    } else if (capitalize && !Character.isWhitespace(sb.charAt(pos))) {
		        sb.setCharAt(pos, Character.toUpperCase(sb.charAt(pos)));
		        capitalize = false;
		    }
		    pos++;
		}
		return sb.toString();
	}
	
	
	public static void writeToNewFile(String fileName, String text) {
		PrintWriter outStream = null;
		try {
			outStream = new PrintWriter(new FileOutputStream(fileName, true));
			outStream.println(text);
			
		} catch(FileNotFoundException e) {
			System.out.println("File Not Found " + fileName);
		}
		finally {
			if(outStream != null) {
				outStream.close();
			}
		}
	}
	
	private static String capitalizeSentence(String sentence) {
		StringBuilder result = new StringBuilder();
		boolean capitalize = true;
		for(char c: sentence.toCharArray()) {
			if(capitalize) {
				result.append(Character.toUpperCase(c));
				if(!Character.isWhitespace(c) && c != '.') {
					capitalize = false;
				}
					
				
			}
			else {
				result.append(c);
				if(c == '.') {
					capitalize = true;
				}
			}
		}
		return result.toString();
	}

	private static void readFile(String fileName) {
		Scanner output = null;
		String line = "";
		
			try {
				output = new Scanner(new File(fileName));
				while(output.hasNextLine()) {
					line = output.nextLine();
					line = line.trim().replaceAll(" +", " ");
					if(line.contains(".")) {
						line = capitalizeSentence(line);
						writeToNewFile("HomeworkOutput6-2.txt", line);
					}
					else {
						line = capitalizeSentence(line);
						writeToNewFile("HomeworkOutput6-2.txt", line);
						if(output.hasNext()) {
							line = output.nextLine();
							line = line.trim().replaceAll(" +", " ");
							writeToNewFile("HomeworkOutput6-2.txt", line);
							
						}
						
						
					}
					
					

	
				}
				
			} catch (FileNotFoundException e) {
				System.out.println("File Not Found " + fileName);
			}catch(IOException e) {
				System.out.println("File Not Found " + fileName);
			}
	}

	public static void main(String[] args) throws IOException {
		Scanner scnr = new Scanner(System.in);
		System.out.println("What is the name of your file?");
		String fileName = scnr.nextLine();
		File file = new File(fileName);
		
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
