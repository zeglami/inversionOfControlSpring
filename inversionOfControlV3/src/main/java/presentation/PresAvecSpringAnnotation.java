package presentation;

import org.springframework.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import metier.IMetier;

public class PresAvecSpringAnnotation {
	
	
	public static void main(String[] args) {
		ApplicationContext context=new
				AnnotationConfigApplicationContext("ext","metier");
				IMetier metier=context.getBean(IMetier.class);
				System.out.println(metier.calcul());
				
	
	}
																		
																
		
	}

