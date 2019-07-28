package newprrogram01;

import baseclasspackages.baseclass_otherpackage;

public class umamainclass {
	void mainclassnormalmethod()
	{
		System.out.println("Main class normal method");
	}
	umamainclass()
	{
		System.out.println("Main class constuctor");
		
	}
	static void mymethod()
	{
		System.out.println("main class static method");
	}

	public static void main(String[] args) {
		umamainclass obj=new umamainclass();
		obj.mainclassnormalmethod();
		mymethod();
		
	
		System.out.println("Main class main method");
		
		//othr base class calling
		umabaseclass obj1=new umabaseclass();
		umabaseclass.mymethod2();
		obj1.normalmethod();
		
		//other package class calling
		baseclass_otherpackage obj3=new baseclass_otherpackage();
		baseclass_otherpackage.baseclassmethod();
		obj3.baseclassmethod2();
		

}
}