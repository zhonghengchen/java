package labs;

public class Classroom {
	
	private int roomnum; 
	private double roomlen;
	private double roomwidth;
	private boolean roomlights;
	private boolean roomdoor;
	
	public Classroom(int roomnum, double roomlen, double roomwidth) {
		this.roomnum = roomnum;
		this.roomlen = roomlen;
		this.roomwidth = roomwidth;

	}
	
	public int getNum(){
		return roomnum;
	}
	
	public double getLength(){
		return roomlen;
	}
	
	public double getWidth(){
		return roomwidth;
	}
	
	public String lights() {
		if (roomlights) {return "On";
		}
		return "Off";
	}
	
	public String doors() {
		if (roomdoor) {return "On";
		}
		return "Off";
	}
	
	public double getSquareFootage() {
		return roomlen*roomwidth;
	}
	
	public boolean hasLightOn() {
		return true;
	}
	
	public void flipLightSwitch() {
		roomlights = !roomlights;
	}
	
	public boolean hasDoorOpen() {
		return roomdoor;
	}
	
	public void openDoor() {
		roomdoor = true;
	}
	
	public void closeDoor() {
		roomdoor = false;
	}
	
	public String toString() {
		return "The room number is:" + roomnum + ". This room is "+ roomlen + " x " + roomwidth + " feet." + " The light is " + this.lights() + " and the door is " + this.doors()+ ". "; 
	}
	
	public static void main(String[] args) {
		Classroom room = new Classroom(101, 40, 60);
		System.out.println(room.getSquareFootage());
		System.out.println(room.hasLightOn());
		room.flipLightSwitch();
		System.out.println(room.hasLightOn());
		room.openDoor();
		System.out.println(room.hasDoorOpen());
		room.closeDoor();
		System.out.println(room.hasDoorOpen());
		System.out.println(room);
	}

}



/*
 * Write a class that represents a classroom. A classroom has a room number, length, width, lights that are either on or off, and a door 
 * that is either open or closed. Create all appropriate private instance variables, add a constructor, accessor methods, a method that 
 * returns the square footage of the room, methods to flip the light switch and open or shut the door and a toString method. 
 * Test it using a main method.

 Outcomes:
	2400.0
	true
	true
	true
	false
	The room number is :101. This room is 40.0 x 60.0 feet. The light is On and the door is Off. 
 */
