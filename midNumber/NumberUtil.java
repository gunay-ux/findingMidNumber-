package midNumber;

public class NumberUtil {

	public static void main(String[] args) {
		
          run();
	}
	
	
	public static void run () {
		
		java.util.Scanner input  = new java.util.Scanner(System.in);
		System.out.println("Enter three numbers");
		int a  = Integer.parseInt(input.nextLine());
		int b  = Integer.parseInt(input.nextLine());
		int c  = Integer.parseInt(input.nextLine());
		input.close();
		
		mid(a, b, c);
		
	}
	
	public static void mid(int a, int b, int c) {
		
		mid_a(a, b, c);
		mid_b(a, b, c);
		mid_c(a, b, c);
		
	}
	
	public static void mid_a(int a, int b, int c) {
		
		if(b < a && a < c)
			System.out.printf("%d",a);
		if(c < a && a < b)
			System.out.printf("%d",a);
		if(b == a && a < c)
			System.out.printf("%d",a);
		if(c < a && a == b)
			System.out.printf("%d",a);
		if(c == a && a < b)
			System.out.printf("%d",a);
		    
	}
	
	public static void mid_b(int a, int b, int c) {
		
		if(a < b && b < c)
			System.out.printf("%d",b);
		if(c < b && b < a)
			System.out.printf("%d",b);
		if(c == b && b < a)
			System.out.printf("%d",b);
		if(a < b && b == c)
			System.out.printf("%d",b);
		
	}
	
	public static void mid_c(int a, int b, int c) {
		
		if(a == c && c == b)
			System.out.printf("%d",c);
		if(a < c && c < b)
			System.out.printf("%d",c);
		if(b < c && c < a)
			System.out.printf("%d",c);
		
	}
	

	
}
