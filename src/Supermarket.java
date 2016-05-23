import java.util.Hashtable;
import java.util.Set;

public class Supermarket {
	
	public int checkout(Hashtable<Item, Integer> basket){
		int totalPrice = 0;
		Set<Item> items = basket.keySet();
		for(Item i : items){
			totalPrice += calculateItemPrice(i, basket.get(i));	
		}
		return totalPrice;
	}
	
	public int calculateItemPrice(Item i, Integer quantity){
		int unitPrice = 0;
		if(i.getSpecialOffer() != null){
			unitPrice += (quantity / i.getSpecialOffer().getQuantity()) * i.getSpecialOffer().getPrice();
			unitPrice += (quantity % i.getSpecialOffer().getQuantity()) * i.getPrice();
		}else{
			unitPrice += quantity * i.getPrice();
		}
		
		return unitPrice;
	}

}
