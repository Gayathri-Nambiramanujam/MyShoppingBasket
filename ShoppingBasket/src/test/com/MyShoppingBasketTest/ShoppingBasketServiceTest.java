package test.com.MyShoppingBasketTest;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.MyShoppingBasket.ShoppingBasketService;

public class ShoppingBasketServiceTest {
	ShoppingBasketService testSBS;

	@Before
	public void setUp(){
		testSBS = new ShoppingBasketService();
	}
	@Test
	public void test() throws Exception {
		ShoppingBasketService.addToBasket("B1","Bread",10,.50);//adding item success scenario
		ShoppingBasketService.addToBasket("B1","Bread",5,.50);//adding item success scenario
		assertTrue(ShoppingBasketService.getBasketItems());// get all items
		assertThat(ShoppingBasketService.getTotalValue(),is(7.5));// get basket total success scenario
		assertThat(ShoppingBasketService.getTotalValue(),is(17));// get basket total failure scenario
	}

}
