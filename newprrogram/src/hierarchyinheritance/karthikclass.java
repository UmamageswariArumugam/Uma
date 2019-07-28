package hierarchyinheritance;


public class karthikclass extends arumugamclass {
	void karthikproperty()
	{
System.out.println("karthik Property");
		
	}
void karthikgoal()
{
	System.out.println("Karthik GOAL");
}
public static void main(String[] args)
{
	karthikclass ob1=new karthikclass();
	ob1.karthikproperty();
	ob1.karthikgoal();
	ob1.arumugamproperty();
	ob1.arumugamgoal();


}
}