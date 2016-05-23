import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class ShoppingCartTest {

	@Test
	public void testBasket() {
		Customer c = new Customer();
		c.addItem(Item.A, 4);
		c.addItem(Item.B, 2);
		assertEquals(c.getBasket().get(Item.A), new Integer(4) );
		assertEquals(c.getBasket().get(Item.B), new Integer(2) );
		assertNull(c.getBasket().get(Item.C) );
		
		Supermarket market = new Supermarket();
		int bill = market.checkout(c.getBasket());
		System.out.println(bill);
		assertEquals(bill, 225);
	}
	
	@Test
	public void testremoveItem() {
		Customer c = new Customer();
		c.addItem(Item.A, 4);
		c.addItem(Item.B, 2);
		c.addItem(Item.C, 1);
		c.removeItem(Item.C);
		assertEquals(c.getBasket().get(Item.A), new Integer(4) );
		assertEquals(c.getBasket().get(Item.B), new Integer(2) );
		assertEquals(c.getBasket().get(Item.C), new Integer(0));
		
		Supermarket market = new Supermarket();
		int bill = market.checkout(c.getBasket());
		System.out.println(bill);
		assertEquals(bill, 225);
	}
	
	@Test
	public void testSpecialOffers() {
		Customer c = new Customer();
		c.addItem(Item.A, 4);
		c.addItem(Item.B, 7);
		c.addItem(Item.C, 1);
	
		assertEquals(c.getBasket().get(Item.A), new Integer(4) );
		assertEquals(c.getBasket().get(Item.B), new Integer(7) );
		assertEquals(c.getBasket().get(Item.C), new Integer(1));
		
		Supermarket market = new Supermarket();
		int bill = market.checkout(c.getBasket());
		System.out.println(bill);
		assertEquals(bill, 365);
	}

}
