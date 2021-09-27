package presentation;

import dao.DaoImpl;
import metier.MetierImpl;

public class Pres1 {
	
	//Injection des dépendances par  instanciation statique
	public static void main(String[] args) {
		DaoImpl dao=new DaoImpl();
		MetierImpl metier=new MetierImpl();
		metier.setiDao(dao);
		
		System.out.println(metier.calcul());
	}


}
