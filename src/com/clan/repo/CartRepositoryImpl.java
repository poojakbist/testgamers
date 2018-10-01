package com.clan.repo;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.clan.entity.Cart;
import com.clan.entity.Product;

@Repository
public class CartRepositoryImpl implements CartRepository {
	
	
	
	@Autowired
	private SessionFactory sessionFactory;

	/*@Autowired
	private CustomerOrderService customerOrderService;*/

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Cart getCartByCartId(String CartId) {
		Session session = sessionFactory.openSession();
		Cart cart = (Cart) session.get(Cart.class, CartId);
		// System.out.println(cart.getCartId() + " " + cart.getCartItem());
		System.out.println(cart);
		session.close();
		return cart;

	}

	public Cart validate(String cartId) throws IOException {
		Cart cart = getCartByCartId(cartId);
		if (cart == null || cart.getCartItem().size() == 0) {
			throw new IOException(cartId + "");
		}
		update(cart);
		return cart;
	}

	/*public void update(Cart cart) {

		String cartId = cart.getCartId();
		double grandTotal = customerOrderService.getCustomerOrderGrandTotal(cartId);
		cart.setTotalPrice(grandTotal);

		Session session = sessionFactory.openSession();
		session.saveOrUpdate(cart);
		session.flush();
		session.close();
	}*/


	/*@Autowired
	private SessionFactory sessionfactory;

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	@Override
	public void addProductToCart(Cart cart, Product product) {
		Session session = sessionfactory.getCurrentSession();
		//cart.addToCart(product);
		cart.getCartItems().add(product);
		session.save(cart);
	}

	@Override
	public void removeProductFromCart(Cart cart, Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public void showCartSummary(Cart cart) {
		// TODO Auto-generated method stub

	}*/

}
