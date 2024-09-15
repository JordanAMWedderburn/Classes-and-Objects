
public class StudentClass {

	int SID;
	String Sname;
	int Sub1;
	int Sub2;
	int Sub3;
	
	void getStuData(int s_SID, String s_Sname){
		SID = s_SID;
		Sname = s_Sname;
	}
	
	void getStuMarks(int s_Sub1, int s_Sub2, int s_Sub3) {
		Sub1 = s_Sub1;
		Sub2 = s_Sub2;
		Sub3 = s_Sub3;

	}
	
	void totalMarks() {
	
		int totalM = Sub1+Sub2+Sub3;
		System.out.println( SID + ", " + Sname + ": " + totalM);

}
}
