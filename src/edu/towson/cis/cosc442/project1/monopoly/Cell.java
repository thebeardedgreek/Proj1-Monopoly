package edu.towson.cis.cosc442.project1.monopoly;

public abstract class Cell implements IOwnable {
	private String name;
	protected Player theOwner;
	private boolean available = true;

	public String getName() {
		return name;
	}

	public Player getTheOwner() {
		return theOwner;
	}
	
	public int getPrice() {
		return 0;
	}

	public boolean isAvailable() {
		return available;
	}
	
	public abstract Boolean playAction(String msg);

	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	void setName(String name) {
		this.name = name;
	}

	public void setTheOwner(Player owner) {
		this.theOwner = owner;
	}
    
    public String toString() {
        return name;
    }
}
