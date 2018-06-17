package comp.pluralsight.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

	private static Map<String, Item> items = new HashMap<String, Item>();
	
	public Registry() {
		loadItems();
	}

	
	public Item createItem(String type) {
		Item item = null;
		try {
			item = (Item)items.get(type).clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return item;
	}
	private void loadItems() {
		Movie movie = new Movie();
		movie.setTitle("Basic Movie");
		movie.setPrice(24.99);
		movie.setRuntime("2 hours");
		
		items.put("Movie", movie);
		
		Book book = new Book();
		book.setNumberOfPages(255);
		book.setPrice(20.99);
		book.setTitle("Basic Book");
		
		items.put("Book", book);
		
	}
}
