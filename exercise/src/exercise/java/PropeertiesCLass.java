package exercise.java;

import java.util.Enumeration;
import java.util.Properties;

public class PropeertiesCLass {

	public static void main(String[] args)
	{
		Properties props=System.getProperties();
		Enumeration propsName=props.propertyNames();
		
		while (propsName.hasMoreElements()) {
			//Object object = (Object) propsName.nextElement();
			String propName=(String)propsName.nextElement();
			String property=props.getProperty(propName);
			System.out.println("property '"+propName+"' is '"+property+"'");
		}
	}
}
