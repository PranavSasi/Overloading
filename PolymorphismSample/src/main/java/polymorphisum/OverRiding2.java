package polymorphisum;

public class OverRiding2 extends OverRiding {
	public void sub(int a,int b) {
	System.out.println(a+b);
}
	public static void main(String[] args) {
		OverRiding2 obj=new OverRiding2();
		obj.sub(4,3);
		obj.sub(5,3);
	}
}