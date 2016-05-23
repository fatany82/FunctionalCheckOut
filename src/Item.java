
public enum Item {
	A("A", 50, new SpecialOffer(3, 130)),
	
	B("B", 30, new SpecialOffer(2, 45)),
	
	C("C", 20, null);
	
	private String SKUnit;
	private int price; 
	private SpecialOffer specialOffer;
	
	private Item(String sKUnit, int price, SpecialOffer specialOffer) {
		SKUnit = sKUnit;
		this.price = price;
		this.specialOffer = specialOffer;
	}
	
	public String getSKUnit() {
		return SKUnit;
	}
	public void setSKUnit(String sKUnit) {
		SKUnit = sKUnit;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public SpecialOffer getSpecialOffer() {
		return specialOffer;
	}
	public void setSpecialOffer(SpecialOffer specialOffer) {
		this.specialOffer = specialOffer;
	}
	
	
	
	
	

}
