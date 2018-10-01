package com.clan.service;

import com.clan.entity.Cart;
import com.clan.entity.Product;

public interface CartService {

	public void addProductToCart(Cart cart, Product product);

	public void removeProductFromCart(Cart cart, Product product);

	public void showCartSummary(Cart cart);
}
