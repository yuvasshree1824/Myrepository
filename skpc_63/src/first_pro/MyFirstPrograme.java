package first_pro;

import java.util.*;

public class MyFirstPrograme {
public int a;
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	void Display() {
		System.out.println("Hello world");
		
	}
	
	MyFirstPrograme(){
		System.out.println("This is the Constructor");
		this.a= a;
		
	}

	public static void main(String[] args) {
		MyFirstPrograme obj= new MyFirstPrograme();
		obj.Display();
		System.out.println("This is the main part");
		obj.setA(1000);
		System.out.println("This is a integer "+ obj.getA());

	}

}
