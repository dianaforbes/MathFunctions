package com.company;

public class MathFunctions {
	///f(x)=23x^3+3x;
	public static double f(double x) {
	double y= 23*Math.pow(x,3)+3*x;
	return y;
	}
	///z(x)=(24-x^2)-8;
public static double z(double x) {
	double y=(24-Math.pow(x,2)-8);
		return y;
}
	///d(x)=x^2-3x/x;
public static double d(double x){
		double y=Math.pow(x,2)-3*x/x;
		return y;
}

    public static void main(String[] args) {
		///for f(5);
		System.out.print("The result for the first function when f(5): " + f(5) + "  ");
		///for z(1234);
		System.out.print("The result for the second function when z(1234): " + z(1234) + "  ");
		///for d(56748);
		System.out.print("The result for the third function when d(567): " + d(567) + "  ");
    }
}
