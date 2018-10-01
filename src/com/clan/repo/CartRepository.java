package com.clan.repo;

import java.io.IOException;

import com.clan.entity.Cart;
import com.clan.entity.Product;

public interface CartRepository {

	Cart getCartByCartId(String CartId);
	
	Cart validate(String cartId) throws IOException;
	
	void update(Cart cart);
	
	/*
	
	public void addProductToCart(Cart cart , Product product);

	public void removeProductFromCart(Cart cart,Product product);

	public void showCartSummary(Cart cart);*/

}
