package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.beans.Car;
import in.ashokit.beans.Engine;

@SpringBootApplication
public class Application {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		Car c1 = context.getBean(Car.class);
		Car c2 = context.getBean(Car.class);
		System.out.println(c1+">>>>>>"+c2);
		System.out.println(c1.hashCode()+">>>>>>>>>>>"+c2.hashCode());
		System.out.println("-------------------------------------");
		Engine e1 = context.getBean(Engine.class);
		Engine e2 = context.getBean(Engine.class);
		System.out.println(e1+">>>>>>"+e2);
		System.out.println(e1.hashCode()+">>>>>>>>>>>"+e2.hashCode());
		
		
		
	}

}
