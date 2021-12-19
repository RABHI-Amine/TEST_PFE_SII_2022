package sii.maroc;

public class Meal {

	private Ticket ticket;

	public Meal(Ticket ticket){

	}

	public int servedDishes() {
		// TODO Auto-generated method stub
		int serverd = 0;
		for(Plate p:this.ticket.getPlates().keySet()){
			serverd += this.ticket.getPlates().get(p);
		}
		return serverd;
	}

	public int cookingDuration() {
		// TODO Auto-generated method stub
		return 0;
	}

}
