package com.test;

class Exp3{
	public void method1() {
		System.out.println("");
		
		method2();
	}
	
	public void method2() {
		System.out.println("method-2");
		
		method3();
	}
	
	public void method3() {
		System.out.println("method-3");
		
		methodN();	
	}
	public void methodN() {
		System.out.println("method-n");
	}
}

 class MethodChn {
	
	public static void main(String[] args) {
		Exp3 obj = new Exp3();
		
		obj.method1();
	}

}
