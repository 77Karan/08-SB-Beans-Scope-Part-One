package in.ashokit.beans;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
@Component
@Scope("prototype")
public class Engine 
{
	Engine()
	{
		System.out.println("Creatring Engine Class Object");
	}

}
