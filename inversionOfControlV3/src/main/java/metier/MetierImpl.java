package metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dao.IDao;

//@Service on utlise aussi
@Component("metier")
public class MetierImpl implements IMetier {
	
	@Autowired
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
