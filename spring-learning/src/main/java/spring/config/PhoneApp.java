package spring.config;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import spring.phone.Phone;

public class PhoneApp {
	public static void main(String[] args) {

//		XmlBeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		Phone phone = (Phone) applicationContext.getBean("phone");
		phone.ringing();
	}
}
