import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.clan.entity.Cart;
import com.clan.entity.Product;
import com.clan.service.CartService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:appctx.xml")
public class TestClanCart {

	@Autowired
	private CartService cartService;

	@Test
	public void addProduct() {

		Product p1 = new Product(40, "xb1", "micro", 111, "This is demo", 52436);
		Cart cart = new Cart();
		// System.out.println(p1);

		cart.setCartId(101);
		cart.setBuyer(null);
		// cart.setCartItems(p1);
		cartService.addProductToCart(cart, p1);

		/*
		 * Product prod = new Product(); prod.getPid(); prod.getName(); prod.getBrand();
		 * prod.getPrice(); prod.getDescription();
		 * 
		 * Cart cart = new Cart(); cart.setCartId(101);
		 * 
		 * cartService.addProductToCart(cart, prod);
		 */

	}

}
