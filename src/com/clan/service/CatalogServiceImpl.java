package com.clan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clan.entity.Category;
import com.clan.entity.Product;
import com.clan.repo.CatalogRepoImpl;
@Service
public class CatalogServiceImpl implements CatalogService {

	@Autowired
	private CatalogRepoImpl catalogrepo;


	@Override
	public List<Product> showAllProducts() {
		return catalogrepo.showAllProducts();
	}

	@Override
	public List<Category> showCategory() {
		return catalogrepo.showCategory();
	}

}
