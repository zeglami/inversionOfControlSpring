package dao;

import org.springframework.stereotype.Component;
//@Repository on peut utiliser 
@Component(value="dao") //equivalent <bean id="d" class="dao.DaoImpl" init-method="init" ></bean>
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
