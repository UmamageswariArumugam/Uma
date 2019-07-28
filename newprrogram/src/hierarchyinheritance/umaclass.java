package hierarchyinheritance;


public class umaclass extends arumugamclass {
	void umaproperty()
	{
System.out.println("Uma Property");
		
	}
void umagoal()
{
	System.out.println("Uma GOAL");
}
public static void main(String[] args)
{
	umaclass ob=new umaclass();
	ob.umaproperty();
	ob.umagoal();
	ob.arumugamproperty();
	ob.arumugamgoal();

	
	}

}
