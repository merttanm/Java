/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greeting08;

/**
 *
 * @author merttan
 */

public class MainApplication {

	public static void main(String[] args) {

		BeanFactory factory = new ClassPathXmlApplicationContext("greeting08/resources/beans.xml");

		GreetingRenderer renderer = (GreetingRenderer) factory.getBean("renderer");
		renderer.render();

		GreetingProvider provider = (GreetingProvider) factory.getBean("provider");
		System.out.println(provider.getGreeting());

	}

}
