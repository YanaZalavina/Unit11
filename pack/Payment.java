package my.pack;

import java.util.*;

public class Payment {
	List<ItemsForSale> allItems=new ArrayList<>();
	static List<ItemsForSale> listForBuy=new ArrayList<>();
	
	public static List<ItemsForSale> chooseItemsForBuy(List<ItemsForSale> allItems, List<String> nameOfItem) {
		for(String name:nameOfItem) {
			for(ItemsForSale items:allItems) {
				if(items.getName().equalsIgnoreCase(name)) {
					ItemsForSale needItem=new ItemsForSale(items.getName(),items.getPrice());
					listForBuy.add(needItem);
				}
			}
		}
		return listForBuy;
	}
	
	public static void main(String[] args) {
		ItemsForSale firstItem=new Food("carrot",100,0.55);
		ItemsForSale secondItem=new HouseHoldGood("blanket",100,2);
		ItemsForSale thirdItem=new HouseHoldGood("notebook",100,1);
		ItemsForSale fothItem=new Food("meat",100,1.5);
		ItemsForSale fifthItem=new Food("coffee",100,0.5);
		
		List<ItemsForSale> allItems = new ArrayList<ItemsForSale>();
		allItems.add(firstItem);
		allItems.add(secondItem);
		allItems.add(thirdItem);
		allItems.add(fothItem);
		allItems.add(fifthItem);
		
		List<String> itemsForBy = Arrays.asList("notebook", "coffee");
		List<ItemsForSale> resItems = new ArrayList<ItemsForSale>();
		resItems=chooseItemsForBuy(allItems,itemsForBy);
		for(ItemsForSale x:resItems) {
			System.out.println(x.toString());
		}
	}
}
