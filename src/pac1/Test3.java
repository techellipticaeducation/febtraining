package pac1;

public class Test3 {
public static void main(String[] args) {
	Test1 testObject = Test1.getObject();
	testObject.i = 40;
	Test1 testObject1 = Test1.getObject();
	Test1 testObject2 = Test1.getObject();
	Test1 testObject3 = Test1.getObject();
	Test1 testObject4 = Test1.getObject();
	
	System.out.println(testObject1);
	System.out.println(testObject2);
	System.out.println(testObject3);
	System.out.println(testObject4);
} 
}
