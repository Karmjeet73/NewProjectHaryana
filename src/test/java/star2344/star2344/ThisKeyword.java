package star2344.star2344;

public class ThisKeyword {
	int a;
	int b;
	int c;
	final int str = 0100;
//System.out.println("enter value of a"+a);
	void thisk(int a,int b,int c) {
	this.a=a;
	this.b=b;
	this.c=c;}
	void display() {
		
	
	System.out.println("enter value of a "+a);
	System.out.println("enter value of b "+b);
	System.out.println("enter value of c "+c);}

	public static void main(String[] args) {
		ThisKeyword ky=new ThisKeyword();
		ky.thisk(2000, 500, 1000);
		ky.display();

	}

}
