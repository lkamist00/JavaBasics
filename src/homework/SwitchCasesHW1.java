package homework;

import java.util.Scanner;

public class SwitchCasesHW1 {

	public static void main(String[] args) {
		// 1. Ask user to enter their country and capture it. Once values are captured print which language user speaks.

		Scanner input=new Scanner(System.in);
		System.out.println("Where are you from?");
		String country=input.nextLine();
		String language;
		
		switch(country) {
		
		case "USA":
			language="English";
			break;
		case "Mexico":
			language="Spanish";
			break;
		case "Macedonia":
			language="Macedonian";
			break;
		case "China":
			language="Mandarin";
			break;
		default:
			language="Unknown";
			break;
		}
		
		System.out.println(language);
		
		
		
		
	}

}
