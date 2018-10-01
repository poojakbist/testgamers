package com.clan.repo;

import java.util.List;

import com.clan.entity.Category;
import com.clan.entity.Product;

public interface CatalogRepo {

	public List<Product> showAllProducts();

	public List<Category> showCategory();

}
