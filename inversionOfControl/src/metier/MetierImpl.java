package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
	
	private IDao iDao;// couplage faible
	
	
	
	public MetierImpl() {
		System.out.println("Intanciation  de metier");
	}
	
	public void setiDao(IDao iDao) {
		System.out.println("Injection des dependances");
		this.iDao = iDao;
	}


	@Override
	public double calcul() {
		// TODO Auto-generated method stub
		double d=iDao.getData();
		double res=d*10;
		return res;	
	}




	public void init() {
		System.out.println("initialisation metier impl:init");
	}
	
	
}
