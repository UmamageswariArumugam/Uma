package inheritancedemo;

public class childclass extends baseclass {
	
	void childproperty()
	{
System.out.println("CChild Property");
		
	}
void childgoal()
{
	System.out.println("Child GOAL");
}
public static void main(String[] args)
{
	childclass obj=new childclass();
	obj.childproperty();
	obj.childgoal();
	obj.parentproperty();
	obj.parentgoal();
}
}
