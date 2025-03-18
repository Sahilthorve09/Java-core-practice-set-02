
public class Sumof1tonnumb {
	public static void main(String[] args) {
		int i = 1;
		int j = 10;
		
		System.out.println("sum of numbers from 1 to N using a while loop");
		
		while(i<=10) {
			System.out.println((i*(i+1))/2);
			i++;
		}
		
		System.out.println("sum of numbers from 1 to N using a do-while loop");
		
		do {
			System.out.println((j*(j+1))/2);
			j++;
		}while(j<=20);
	}
}
