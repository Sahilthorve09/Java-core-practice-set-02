
public class Factorial {
	public static void main(String[] args) {
		int i = 1;
		int j = 10;
		
		System.out.println("Factorial of 1 to 10 using while loop:");
		
		while(i<=10) {
			System.out.println(i*i);
			i++;
		}
		
		System.out.println("Factorial of 10 to 20 using do-while loop:");
		
		do {
			System.out.println(j*j);
			j++;
		}while(j<=20);
	}
}
