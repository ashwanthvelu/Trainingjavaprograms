package first;

public class Stars {
	public static void main(String args[]) {
		int count = 0;
		int i;
		for (i = 1; i <= 100; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				count++;
				for (int j = 0; j < count; j++) {
					for (int k = 0; k <= j; k++) {
					}
					System.out.print("*");
				}
				System.out.println("\t");
			} else
				System.out.print(i + "\n");
		}
	}

}
