package com.clan.repo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.clan.entity.Category;
import com.clan.entity.Product;

@Repository
public class CatalogRepoImpl implements CatalogRepo {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Product> showAllProducts() {
		Session session = sessionFactory.getCurrentSession();
		List<Product> products = session.createQuery("from Product").list();
		return products;
	}

	@Override
	public List<Category> showCategory() {
		Session session = sessionFactory.getCurrentSession();
		List<Category> categories = session.createQuery("from Category").list();
		return categories;
	}

}
