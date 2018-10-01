package com.clan.service;

import java.util.List;

import com.clan.entity.Category;
import com.clan.entity.Product;

public interface CatalogService {

	public List<Product> showAllProducts();

	public List<Category> showCategory();

}
