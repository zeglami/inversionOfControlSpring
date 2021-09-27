package ext;

import dao.IDao;

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
