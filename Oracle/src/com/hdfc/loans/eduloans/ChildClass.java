package com.hdfc.loans.eduloans;

public class ChildClass extends FirstAbstract
{

	public static void main(String[] args)
	{
		ChildClass obj=new ChildClass();
		obj.m1();
		obj.m2();

	}
	
	public void m1()
	{
		System.out.println("iam overrdien m1  from ChildClass ");
	}

	@Override
	public void m2() {
		System.out.println("iam overrriden m2 in ChildClass");
	}

}
