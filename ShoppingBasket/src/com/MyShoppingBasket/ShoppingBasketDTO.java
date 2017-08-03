package com.MyShoppingBasket;
import java.util.HashMap;

public class ShoppingBasketDTO {
	Double basketTotal;
HashMap<String,ProductDTO> shoppingBasket =  new HashMap<String,ProductDTO>();

public HashMap<String, ProductDTO> getShoppingBasket() {
	return shoppingBasket;
}
public void setShoppingBasket(HashMap<String, ProductDTO> shoppingBasket) {
	this.shoppingBasket = shoppingBasket;
}
public Double getBasketTotal() {
	return basketTotal;
}
public void setBasketTotal(Double basketTotal) {
	this.basketTotal = basketTotal;
}

}
