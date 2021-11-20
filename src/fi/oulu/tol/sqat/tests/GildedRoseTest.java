package fi.oulu.tol.sqat.tests;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import fi.oulu.tol.sqat.GildedRose;
import fi.oulu.tol.sqat.Item;

public class GildedRoseTest {

	@Test
	public void testTheTruth() {
		assertTrue(true);
	}
	@Test
	public void exampleTest() {
		//create an inn, add an item, and simulate one day
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("+5 Dexterity Vest", 10, 20));
		inn.oneDay();

		
		//access a list of items, get the quality of the one set
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		int sellin = items.get(0).getSellIn();
		
		//assert quality has decreased by one
		assertEquals("Failed quality for Dexterity Vest", 19, quality);
		assertEquals("wrong sellin for Dexterity Vest", 9, sellin);
		}
		@Test
		public void uuttaTestii() {
			GildedRose inn = new GildedRose();
			inn.setItem(new Item("+5 Dexterity Vest", 10, 20));
			inn.oneDay();
			
			List<Item> items = inn.getItems();
			int quality = items.get(0).getQuality() + 1;
			assertEquals("Failed quality for Dexterity Vest", 20, quality);
			
		}
		
		@Test
		public void entiedamitateen() {
			GildedRose inn = new GildedRose();
			inn.setItem(new Item("Conjured Mana Cake", 3, 6));
			inn.oneDay();

			List<Item> items = inn.getItems();
			int quality = items.get(0).getQuality();
			int sellin = items.get(0).getSellIn();
			
			assertEquals("Wrong quality for mana cake", 5, quality);
			assertEquals("Wrong sellin for mana cake", 2, sellin);
		}
		
		@Test
		public void jau() {
			GildedRose inn = new GildedRose();
			inn.setItem(new Item("Elixir of the Mongoose", 5, 7));
			inn.oneDay();
			
			List<Item> items = inn.getItems();
			int quality = items.get(0).getQuality();
			int sellin = items.get(0).getSellIn();
			
			assertEquals("Wrong quality for Elixir Of the Mongoose", 6, quality);
			assertEquals("Wrong sellin for Elixir Of the Mongoose", 4, sellin);
			
		}
		
		@Test
		public void jtn() {
			GildedRose inn = new GildedRose();
			inn.setItem(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
			inn.oneDay();
			
			List<Item> items = inn.getItems();
			int quality = items.get(0).getQuality();
			int sellin = items.get(0).getSellIn();
			
			assertEquals("Failed quality for Backstage pass", 21, quality);
			assertEquals("wrong sellin for Backstage pass", 14, sellin);
			
		}
		
		@Test
		public void testiTesti() {
			GildedRose inn = new GildedRose();
			inn.setItem(new Item("Aged Brie", 2, 0));
			inn.oneDay();
			
			List<Item> items = inn.getItems();
			int sellin = items.get(0).getSellIn();
			int quality = items.get(0).getQuality();
			
			assertEquals("Failed quality for Aged Brie", 1, quality);
			assertEquals("wrong sellin for Aged Brie", 1, sellin);
			}
		@Test
		public void testiTestiTesti() {
			GildedRose inn = new GildedRose();
			inn.setItem(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
			inn.oneDay();
			
			List<Item> items = inn.getItems();
			int quality = items.get(0).getQuality();
			int sellin = items.get(0).getSellIn();
			
			assertEquals("failed quality for backstage pass", 21, quality);
			assertEquals("wrong  sellin for backstage pass", 14, sellin);
		}
		@Test
		public void testiTestiTestitesti() {
			GildedRose inn = new GildedRose();
			inn.setItem(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
			inn.oneDay();
			
			List<Item> items = inn.getItems();
			int quality = items.get(0).getQuality();
			int sellin = items.get(0).getSellIn();
			
			assertEquals("failed quality for Sulfuras, Hand of Ragnaros", 80, quality);
			assertEquals("wrong sellin for Sulfuras, Hand of Ragnaros", 0, sellin);
	}
	}