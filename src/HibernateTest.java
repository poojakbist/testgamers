import java.util.List;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.clan.entity.Category;
import com.clan.entity.Product;
import com.clan.service.CatalogServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:appctx.xml")
public class HibernateTest {

	@Autowired
	private CatalogServiceImpl catalogservice;

	@Transactional
	@Test
	public void getAllProducts() {

		List<Product> products = catalogservice.showAllProducts();
		for (Product product : products) {
			System.out.println(product.getName());
		}
	}

	@Transactional
	@Test
	public void getAllCategories() {

		List<Category> categories = catalogservice.showCategory();
		for (Category category : categories) {
			System.out.println(category.getName());

		}
	}

}
