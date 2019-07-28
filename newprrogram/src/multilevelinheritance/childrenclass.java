package multilevelinheritance;

import inheritancedemo.childclass;

public class childrenclass extends fatherclass {
	void childrenproperty()
	{
System.out.println("Children Property");
		
	}
void childrengoal()
{
	System.out.println("Children GOAL");
}
public static void main(String[] args)
{
	childrenclass object=new childrenclass();
	object.childrenproperty();
	object.childrengoal();
	object.fatherproperty();
	object.fathergoal();
	object.grandfatherproperty();
	object.fathergoal();
	
}

}
