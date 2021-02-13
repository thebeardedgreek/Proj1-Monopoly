package edu.towson.cis.cosc442.project1.monopoly;

public class JailCell extends Cell {
	public static int BAIL = 50;
	private boolean available = true;
	
	public JailCell() {
		setName("Jail");
	}
	
	public Boolean playAction(String msg) {
		return available;
		
	}
}
