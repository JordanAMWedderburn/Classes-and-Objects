
public class StudentClassMain {

	public static void main(String[] args) {
		
		StudentClass stu1 = new StudentClass();
		StudentClass stu2 = new StudentClass();
		StudentClass stu3 = new StudentClass();

		stu1.getStuData(1,"Jordan");
		stu1.getStuMarks(70, 80, 90);
		stu1.totalMarks();
		
		stu2.getStuData(2,"Max");
		stu2.getStuMarks(75, 75, 90);
		stu2.totalMarks();
		
		stu3.getStuData(3,"Mark");
		stu3.getStuMarks(70, 80, 100);
		stu3.totalMarks();
	}
}
