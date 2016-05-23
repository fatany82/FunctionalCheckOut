import java.util.Hashtable;

public class Customer {
	private Hashtable<Item, Integer> basket = new Hashtable<>();
	
	public void addItem(Item item){
		if(basket.containsKey(item)){ 
			basket.put(item, basket.get(item) + 1 );
		}else{
			basket.put(item, 1);
		}
	}
	
	public void addItem(Item item, int count){
		if(basket.containsKey(item)){ 
			basket.put(item, basket.get(item) + count );
		}else{
			basket.put(item, count);
		}
	}
	
	public void removeItem(Item item){
		if(basket.containsKey(item)){
			if(basket.get(item) > 0){
			basket.put(item, basket.get(item) - 1);
			}
		}
	}

	public Hashtable<Item, Integer> getBasket() {
		return basket;
	}
	
	

}
