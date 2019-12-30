package com.deloitte;

interface operation{
	double operate(double a,double b);
}
class Calculation{
	double calculate(double i,double j,operation op) {
		return op.operate(i, j);
	}
}

	


public class LambdaExamples {

	public static void main(String[] args) {
		Calculation cal=new Calculation();
		double a=5.6;
		double b=3.8;
		double sum=cal.calculate(a,b,(x,y)->x+y);
		double mul=cal.calculate(a, b, (x,y)->x*y);
		System.out.println("sum="+sum+" mul="+mul);

	}

}
