package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishmsgGenerator;

public class ClientApp {

	public static void main(String[] args) {
		Resource res=null;
		Scanner sc=null;
		String name=null;
		//locate resource file
		res=new FileSystemResource("src/com/nt/cfg/ApplicationContext.xml");
		//Activate BeanFactory Container
		BeanFactory factory=new XmlBeanFactory(res);
		//get Bean class obj
		WishmsgGenerator wish=(WishmsgGenerator) factory.getBean("wish");
		sc=new Scanner(System.in);
		System.out.println("PLEASE ENTER YOUR NAME");
		name=sc.next();
		System.out.println(wish.wishmsgGenerator(name));

	}

}
