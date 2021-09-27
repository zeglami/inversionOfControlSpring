package ext;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import dao.IDao;

//@Repository on peut utiliser 
@Component("ext")
public class DaoImplV2 implements IDao{

	@Override
	public double getData() {
		// data come from web service
		double data=12;
		return data;
	}
	
	
	public void init() {
		System.out.println("instanciation dao impl V2:init");
	}

}
