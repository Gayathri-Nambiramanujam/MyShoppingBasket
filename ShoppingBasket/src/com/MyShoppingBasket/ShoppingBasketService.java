package com.MyShoppingBasket;
import java.util.HashMap;

public class ShoppingBasketService {
	
	static HashMap<String,ProductDTO> shoppingBasket =  new HashMap<String,ProductDTO>();
	static int itemNo=0;
	public static void addToBasket (String itemCode,String itemName,int qty,Double unitPrice) throws Exception
	{
		ProductDTO shoppingBasketItem = new ProductDTO();
		try{
					
			if(!(shoppingBasket.containsKey(itemCode)))
			{
				Double totalValue=qty*unitPrice;
				shoppingBasketItem.setItemName(itemName);
				shoppingBasketItem.setItemNo(++itemNo);
				shoppingBasketItem.setQty(qty);
				shoppingBasketItem.setUnitPrice(unitPrice);
				shoppingBasketItem.setTotal(totalValue);
				shoppingBasket.put(itemCode, shoppingBasketItem);
			}
			else
			{
				ProductDTO itemDTO=shoppingBasket.get(itemCode);
				int newQty = itemDTO.getQty()+qty;
				itemDTO.setQty(newQty);
				itemDTO.setTotal(newQty*itemDTO.getUnitPrice());
				shoppingBasket.put(itemCode, itemDTO);
			}
			
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
		}
	}
	public static Double getTotalValue() throws Exception
	{
		Double returnValue=0.0;
		try {
			for(String oKey: shoppingBasket.keySet()) {
				ProductDTO itemDTO=shoppingBasket.get(oKey);
				 returnValue=returnValue+ itemDTO.getTotal();
			}	
				
		} catch (Exception e) {	
			e.printStackTrace();
		}
		System.out.println("----------------------------\n\nBasket Total is:"+returnValue);
		return returnValue;
	}
	public static Boolean getBasketItems() throws Exception
	{
		
		try {
			System.out.println("Items(Qty * Unit Price)"+"	Total \n----------------------------------\n");
			for(String oKey: shoppingBasket.keySet()) {
				ProductDTO itemDTO=shoppingBasket.get(oKey);
				
				System.out.println(itemDTO.getItemName()+" ("+itemDTO.getQty()+" * "+itemDTO.getUnitPrice()+")	"+itemDTO.getTotal());
			}	
				
		} catch (Exception e) {	
			e.printStackTrace();
			return false;
		}
		return true;
		
	}

	public static void main(String[] args) throws Exception {
		try{
				addToBasket("B1","Bread",10,.50);
				addToBasket("B1","Bread",10,.50);
				addToBasket("M1","Milk",10,1.30);
				addToBasket("BI1","Biscuit",10,2.0);
				addToBasket("B2","Bread",10,.20);
				addToBasket("B1","Bread",10,.50);
				getBasketItems();
				getTotalValue();
		}	
		
		 catch (Exception e) {	
			e.printStackTrace();
		}
	}
	
}
