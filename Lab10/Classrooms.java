/*
* Write a class that contains an array of classrooms. Include the following instance methods:
* Classroom getLargestRoom()
* int countRoomsWithLightsOn()
* void closeAllDoors()
*/
package labs;
import Lab09.Classroom;
import java.util.ArrayList;

public class Classrooms {
	
	private ArrayList<Classroom>classrooms;
	
	public Classrooms() {
		classrooms = new ArrayList<Classroom>();
	}
	
	public int getLargesRoom() {
		double max = 0;
		int index = 0;
		for (int i = 0; i < classrooms.size();i++) {
			if (classrooms.get(i).getSquareFootage()>max) {
				index = i;
			}
		}
		
		return classrooms.get(index).getNum();
	}
	
	public int countRoomsWithLightsOn() {
		int count= 0;
		for (int i =0; i< classrooms.size();i++) {
			if(classrooms.get(i).hasLightOn()) {
				count++;
			}
		}
		return count;
	}
	
	public void closeAllDoors() {
		for (int i =0; i< classrooms.size();i++) {
			classrooms.get(i).closeDoor();
		}
	}

	
}

