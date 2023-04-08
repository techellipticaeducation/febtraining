package oopsdemo;

public class ConstructorDemo {
	public static void main(String[] args) {
		
//		TestCase obj1 = new TestCase();
//		obj1.method1();
//		obj1.method1();
//		obj1.method1();
//		obj1.method1();
//		obj1.method1();
//		obj1.method1();
//		obj1.method1();
		
//		TestCase obj2 = new TestCase(10);
//		obj2.testcaseId = 134;
//		obj2.testCaseName = "validate xyz";
		
//		System.out.println(obj2.testcaseId);
		
		TestCase obj3 = new TestCase(346);
		obj3.printTestInfo();
//		TestCase obj3 = new TestCase(10,30);
		// Constructors
		// default constructor - non param constructor
		
		// explicit constructor -> default no more present  
		// 
	
		 // 1 - construtor name is always class name
		 // 2 - there is no return type
		
		// Constructor = 1 time
		// method - n type
	}
}


class TestCase{
	
	// Constructor
	TestCase(int id){
		this(id,"NOT DEFINED", "NOT DEFINED", "NA");
		//testcaseId = id;
	}
	
	TestCase(int id, String testCaseName){
		testcaseId = id;
		this.testCaseName = testCaseName;
	}
	
	TestCase(int id, String testCaseName, String preReq, String createdBy){
		testcaseId = id;
		this.testCaseName = testCaseName;
		this.preReq = preReq;
		this.createdBy = createdBy;
	}
	
	
	public void printTestInfo() {
		System.out.println("----------------");
		System.out.println("TestCaseName " + testCaseName);
		System.out.println("createdBy " + createdBy);
		System.out.println("testcaseId " + testcaseId);
		System.out.println("preReq " + preReq);
		System.out.println("----------------");
	}
	
	// constructor overloading
	
	String testCaseName;
	String createdBy;
	int testcaseId;
	String preReq;
	TestStep[] teststeps;
	
}


class TestStep{
	String testStepDesc;
	String testStepAction;
	String testStepExpected;
	
}
