package ClassandObjects;

public class TestClass {

	public static void main(String[] args) {
		
		ParentClass obj = new ParentClass();//Creating Object with only parent class so need need Extends
		
		System.out.println("Emp Name is :"+obj.name);
		
		System.out.println("Emp Id is :"+obj.empId);

		System.out.println("Emp Visa Status is :"+obj.visaStatus);
	
		System.out.println("Emp Age is "+ParentClass.age);
	}

}
