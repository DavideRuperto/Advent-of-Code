import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Es_04_12_2022 {
	public static void main(String[] args) {	
		String path = "C:\\Users\\dador\\eclipse-workspace\\Avvento\\src\\Day4.txt";
		ArrayList <Integer> list1 = new ArrayList <Integer>();
		ArrayList <Integer> list2 = new ArrayList <Integer>();
		String value=null;
		int count=0 , overloop=0;
		try {
			File file = new File(path);
			Scanner fr = new Scanner(file);
			while (fr.hasNext()) {
				value=fr.nextLine();
				String[] numberstring = value.split(",");
				String[] numberstring1 = numberstring[0].split("-");
				String[] numberstring2 = numberstring[1].split("-");
				int number1=Integer.parseInt(numberstring1[0]);
				int number2=Integer.parseInt(numberstring1[1]);
				int number3=Integer.parseInt(numberstring2[0]);
				int number4=Integer.parseInt(numberstring2[1]);
				for (int i=number1; i<=number2; i++) {
					list1.add(i);
				}
				for (int i=number3; i<=number4; i++) {
					list2.add(i);
				}
				if (list2.containsAll(list1) || list1.containsAll(list2)) {
					count++;
				}
				for (int i=0; i<list1.size(); i++) {
					if (list2.contains(list1.get(i))) {
						overloop++;
						break;
					}
				}
				list1.clear();
				list2.clear();
			}
			System.out.println("Conto "+count);																	
			System.out.println("Overloop "+overloop);
		} catch(IOException e) {				
			System.err.println("errore in kittemurt");
			e.printStackTrace();   
		}
	}

}