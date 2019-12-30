package com.deloitte;
 
interface Inter1{
	int sum(int i,int j);
}
//class MyClass implements Inter1{
//	@Override
//    public void show() {
//		System.out.println("hi");
//	}
//}
public class AnonymousInnerClass {
	public static void main(String[] args) {
	//	Inter1 i1=new Inter1() {
	//	public int sum(int j,int j) {
	//		System.out.println("sum");
	//	return i+j;
	//	}
	//	};
		
		Inter1 i1=(i,j)-> {System.out.println("sum"); 
		                 return i+j;};
		System.out.println(i1.sum(5,6));
	}

}
