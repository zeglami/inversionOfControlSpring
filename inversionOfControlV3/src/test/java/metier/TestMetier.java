package metier;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMetier {

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		ApplicationContext context=new
				AnnotationConfigApplicationContext("ext","metier");
				IMetier metier=context.getBean(IMetier.class);
				double res=metier.calcul();
				System.out.println(res);
				double expected=12*10;
				System.out.println(expected);
				assertEquals(res, expected,0.001);
	}

}
