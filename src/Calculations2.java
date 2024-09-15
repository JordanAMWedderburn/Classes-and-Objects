
public class Calculations2 {

	int sum(int x,int y) {
		int sum = x + y;
		return sum;
	}
	
	int sum(int x,int y,int z) {
		int sum = x + y + z;
		return sum;
	}
	
	double sum(double x,double y) {
		double sum = x + y;
		return sum;
	}
	
	double sum(double x,double y, double z) {
		double sum = x + y + z;
		return sum;
	}
	
	public static void main(String[] args) {
		Calculations2 cal = new Calculations2();
		System.out.println(cal.sum(3,9));
		System.out.println(cal.sum(3,5,9));
		System.out.println(cal.sum(3.6,6.9));
		System.out.println(cal.sum(7.3,8.5,.9));
	}
}
