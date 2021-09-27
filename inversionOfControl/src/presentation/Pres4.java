package presentation;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

import dao.DaoImpl;
import dao.IDao;

import metier.IMetier;
import metier.MetierImpl;

public class Pres4 {
	
	
	public static void main(String[] args) {
		
		
		try {
			// Injection des dépendances par  instanciation statique example 3
			Scanner scanner=new Scanner(new File("config.txt"));
			String daoClassname=scanner.next();
			String metierClassName=scanner.next();
			Class cdao=Class.forName(daoClassname);
			IDao dao= (IDao) cdao.newInstance();
			Class cmetier=Class.forName(metierClassName);
			IMetier metier=(IMetier) cmetier.newInstance();
			Method meth=cmetier.getMethod("setiDao",IDao.class);
			meth.invoke(metier,dao);
			System.out.println(metier.calcul());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}


}
