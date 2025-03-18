
public class Evennum {
	public static void main(String[] args) {
		int i = 1;
		int j = 1;
		
		System.out.println("Even no with while loop:");
		
		while(i<=10) {
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
		}
		
		System.out.println("Even no with do-while loop:");
		
		do {
			if(j%2==0) {
				System.out.println(j);
			}
			j++;
		}while(j<=10);
	}
}
