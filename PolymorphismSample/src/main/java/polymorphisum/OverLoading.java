package polymorphisum;

public class OverLoading {
public void add(int a,int b){
	System.out.println(a+b);
}
public void add(int c,int d,int e){
	System.out.println(c+d+e);
}
	public static void main(String[] args) {
		OverLoading obj=new OverLoading();
		obj.add(4,6);
		obj.add(6,3,5);
	}

}