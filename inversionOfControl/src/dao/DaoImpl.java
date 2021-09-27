package dao;

public class DaoImpl implements IDao {

	@Override
	public double getData() {
		// fetched from db for example
		System.out.println();
		double data=98;
		return data;
	}

	
	public void init() {
		System.out.println("instanciation dao impl:init");
	}
}
