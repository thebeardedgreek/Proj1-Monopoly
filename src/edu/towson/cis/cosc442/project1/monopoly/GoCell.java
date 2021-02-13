package edu.towson.cis.cosc442.project1.monopoly;

public class GoCell extends Cell {
	private boolean available = true;

	public GoCell() {
		super.setName("Go");
		setAvailable(false);
	}

	public Boolean playAction(String msg) {
		return available;
	}
	
	void setName(String name) {
	}
}
