package sii.maroc;

import java.util.HashMap;
import java.util.Map;

public class Restaurant {

		private Map<String,Integer> stock;

	public Restaurant(String ... products) {
		//initialisation du stock
		stock = new HashMap<>();

		for(String product:products){
			//verifier si le produit est quatifiable
			if(!isQuatifiable(product)){
				stock.put(product,-1);
			}else{
				addProduct(product);
				}
			}
		}



	public Ticket order(String order) {
		// TODO Auto-generated method stub
		Ticket ticket = new Ticket(order);


		return null;
	}

	public Meal retrieve(Ticket ticket) {
		// TODO Auto-generated method stub
		Meal meal = new Meal(ticket);

		return meal;
	}

	public boolean isQuatifiable(String s){
		return Character.isDigit(s.trim().charAt(0));
	}

	public void addProduct(String product){
		String[] productParts = product.trim().split(" ",1);
		int qte = Integer.parseInt(productParts[0]);
		String productName = productParts[1];
		if(this.stock.containsKey(productName)){
			this.stock.put(productName,qte + this.stock.get(productName));
		}else{
			this.stock.put(productName,qte);
		}
	}

	
}
