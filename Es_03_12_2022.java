import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Es_03_12_2022 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\dador\\eclipse-workspace\\Avvento\\src\\Day3.txt";
		File file = new File(path);
		Scanner fr = new Scanner(file);
		Scanner fr1 = new Scanner(file);
		String value=null;
		score1(fr, value);
		score2(fr1, value);

	}
	public static void score1 (Scanner fr, String value) {
		HashMap<Character, Integer> contain = new HashMap<Character, Integer>();
		ArrayList <Character> get = new ArrayList <Character>();
		int score=0, count=1;
		for (int i=97; i<123; i++) {
			contain.put((char) i,count);
			count++;
		}
		for (int i=65; i<91; i++) {
			contain.put((char) i,count);
			count++;
		}
		while (fr.hasNext()) {
			value=fr.nextLine();
			for (int i=0; i<value.length()/2; i++) {
				for (int j=value.length()/2; j<value.length(); j++) {
					if (get.isEmpty() && value.charAt(i)==value.charAt(j)) {
						get.add(value.charAt(i));
					}
				}
			}
			for (int i=0; i<get.size();i++) {
				score+=contain.get(get.get(i));
			}
			get.clear();
		}
		System.out.println("Punteggio finale: " + score);
		fr.close();
	}
	public static void score2 (Scanner fr1, String value) {
		HashMap<Character, Integer> contain = new HashMap<Character, Integer>();
		ArrayList <Character> get = new ArrayList <Character>();
		String[] character= new String[3];
		int score=0, count=1;
		for (int i=97; i<123; i++) {
			contain.put((char) i,count);
			count++;
		}
		for (int i=65; i<91; i++) {
			contain.put((char) i,count);
			count++;
		}
		while (fr1.hasNext()) {
			for(int i=0; i<3; i++) {
				value=fr1.nextLine();
				character[i]=value;
				System.out.println(character[i]);
			}
			for (int i=0; i<character[0].length(); i++) {
				for (int j=0; j<character[1].length(); j++) {
					for (int x=0; x<character[2].length(); x++) {
						if (get.isEmpty() && character[0].charAt(i)==character[1].charAt(j) && character[0].charAt(i)==character[2].charAt(x)&& character[1].charAt(j)==character[2].charAt(x)) {
							get.add(character[0].charAt(i));
						}
					}
				}
			}
			System.out.println(get);
			for (int i=0; i<get.size();i++) {
				score+=contain.get(get.get(i));
			}
			get.clear();
		}
		System.out.println("Punteggio finale: " + score);
		fr1.close();
	}
}
