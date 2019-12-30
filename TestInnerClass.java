package com.deloitte;

class outer{
	void outerMethod() {
		System.out.println("from outer");
	}
	static class inner{
		void innerMethod() {
			System.out.println("from inner");
		}
	}
}
public class TestInnerClass {

	public static void main(String[] args) {
		outer outobj=new outer();
		outobj.outerMethod();
		outer.inner inobj=new outer.inner();
		inobj.innerMethod();

	}

}
