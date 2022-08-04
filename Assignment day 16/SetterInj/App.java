package SetterInj;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App

{

  public static void main( String[] args )

  {

    ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");

    Employee ob=ctx.getBean(Employee.class);

    ob.show();

  }

}