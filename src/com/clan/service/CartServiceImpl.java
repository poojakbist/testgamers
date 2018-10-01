package com.clan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clan.entity.Cart;
import com.clan.entity.Product;
import com.clan.repo.CartRepository;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartRepository cartRepo;

	@Override
	public void addProductToCart(Cart cart, Product product) {
		cartRepo.addProductToCart(cart, product);
	}

	@Override
	public void removeProductFromCart(Cart cart, Product product) {

	}

	@Override
	public void showCartSummary(Cart cart) {
		// TODO Auto-generated method stub

	}

}
