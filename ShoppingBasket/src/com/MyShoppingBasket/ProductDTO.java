package com.MyShoppingBasket;

public class ProductDTO {
int itemNo;
String itemName;
int qty;
Double UnitPrice;
Double Total;

public int getItemNo() {
	return itemNo;
}
public void setItemNo(int itemNo) {
	this.itemNo = itemNo;
}
public String getItemName() {
	return itemName;
}
public void setItemName(String itemName) {
	this.itemName = itemName;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public Double getUnitPrice() {
	return UnitPrice;
}
public void setUnitPrice(Double unitPrice) {
	UnitPrice = unitPrice;
}
public Double getTotal() {
	return Total;
}
public void setTotal(Double total) {
	Total = total;
}


}
