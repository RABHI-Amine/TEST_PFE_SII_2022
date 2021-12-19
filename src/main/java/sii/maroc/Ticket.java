package sii.maroc;

import java.util.HashMap;
import java.util.Map;

public class Ticket {

	private Map<Plate,Integer> plates ;

	public Ticket(String orderElem){
		plates = new HashMap<Plate,Integer>();
		//adding the first order
		addOrder(orderElem);
	}

	public Ticket and(String order) {
		// TODO Auto-generated method stub
		addOrder(order);
		return this;
	}

	public Map<Plate, Integer> getPlates() {
		return plates;
	}

	public void setPlates(Map<Plate, Integer> plates) {
		this.plates = plates;
	}

	public void addOrder(String orderElem) {
		int qte = Integer.parseInt(orderElem.trim().split(" ", 1)[0]);
		String name = orderElem.trim().split(" ", 1)[1];
		Plate plate = new Plate(name);
		plates.put(plate,qte);
	}



}
