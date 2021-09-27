package presentation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import dao.DaoImpl;
import dao.IDao;
import metier.IMetier;
import metier.MetierImpl;

public class Pres2 {
	
	
	public static void main(String[] args) {
		
		
		try {
			//Injection des dépendances par  instanciation statique example 2
			Scanner scanner=new Scanner(new File("config.txt"));
			String daoClassname=scanner.nextLine();
			System.out.println(daoClassname);
			Class cdao=Class.forName(daoClassname);
			IDao dao= (IDao) cdao.newInstance();
			
			System.out.println(dao.getData());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}


}
