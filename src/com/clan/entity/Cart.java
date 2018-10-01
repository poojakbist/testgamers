package com.clan.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ClanCart")
public class Cart {

	@Id
	private int cartId;

	@OneToOne
	@JoinColumn(name = "customerId")
	private Buyer buyer;

	@OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<CartItems> cartItem;

	private double totalPrice;

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public Buyer getBuyer() {
		return buyer;
	}

	public void setBuyer(Buyer buyer) {
		this.buyer = buyer;
	}

	public List<CartItems> getCartItem() {
		return cartItem;
	}

	public void setCartItem(List<CartItems> cartItem) {
		this.cartItem = cartItem;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Cart() {
	}

	/*
	 * _________________________________________________________________________________________________________
	 * 
	 * @Id
	 * 
	 * @Column(name = "cart_id") private int cartId;
	 * 
	 * @OneToOne
	 * 
	 * @JoinColumn(name = "buyer_id") private Buyer buyer;
	 * 
	 * @OneToMany(cascade=CascadeType.ALL)
	 * 
	 * @ElementCollection private List<Product> cartItems = new
	 * ArrayList<Product>();
	 * 
	 * public int getCartId() { return cartId; }
	 * 
	 * public void setCartId(int cartId) { this.cartId = cartId; }
	 * 
	 * public Buyer getBuyer() { return buyer; }
	 * 
	 * public void setBuyer(Buyer buyer) { this.buyer = buyer; }
	 * 
	 * public List<Product> getCartItems() { return cartItems; }
	 * 
	 * public void setCartItems(List<Product> cartItems) { this.cartItems =
	 * cartItems; }
	 * 
	 * /*public void addToCart(Product product) { cartItems.add(product); }
	 * 
	 * public Cart() { cartItems = new ArrayList<>(); }
	 * 
	 * 
	 * @Override public String toString() { return "Cart Id" + cartId +
	 * " | Username : " + buyer.getUsername() + " | Product Name : " + ((Product)
	 * cartItems).getName() + " | Price : " + ((Product) cartItems).getPrice(); }
	 */

}
