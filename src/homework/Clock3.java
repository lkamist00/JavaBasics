package homework;

public class Clock3 {

	public static void main(String[] args) {

		for (int h = 0; h < 24; h++) { //controls hours

			for (int m1 = 0; m1 <= 5; m1++) { //controls first digit of minutes

				for (int m2 = 0; m2 <= 9; m2++) { // controls second digit of minutes

					if (h < 10) { // if hours is 0-9 add O in the front
						System.out.println("0" + h + ":" + m1 + m2);

					} else {
						System.out.println(h + ":" + m1 + m2);
					}
				}
			}
		}

	
		
	}

}
