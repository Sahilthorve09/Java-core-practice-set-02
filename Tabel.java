
public class Tabel {
	public static void main(String[] args) {
		int i = 1;
		int j = 1;
		
		System.out.println("Table of 2 using while loop:");
		
		while(i<=10) {
			System.out.println(i*2);
			i++;
		}
		
		System.out.println("Table of 3 using do-while loop:");
		
		do {
			System.out.println(j*3);
			j++;
		}while(j<=10);
	}
}
