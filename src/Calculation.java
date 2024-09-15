
public class Calculation {

	int a;
	int b;
	int c;
	
	public Calculation (int num1, int num2, int num3) {
		a = num1;
		b = num2;
		c = num3;
	}
	
	void sum () {
		int sum = a+b+c;
		System.out.println("Sum of " + a + ", " + b + ", and " + c + " is: " + sum);
	}
	
	public static void main(String[] args) {
		Calculation Obj1 = new Calculation(1, 2, 3);
		Obj1.sum();
	}
	}
