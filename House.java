/* This is a stub for the House class */
import java.util.ArrayList;

public class House extends Building implements HouseRequirements{

private boolean hasDiningRoom;
private ArrayList<Student> residents;

/**
 * Constructor of the House class
 * @param hasDiningRoom does the Houes have a dining hall or not
 * @param name the name of the house
 * @param address the address of the house
 * @param nFloors how many floors the house has
 */
public House(boolean hasDiningRoom, String name, String address, int nFloors){
  super(name, address, nFloors);
  this.hasDiningRoom = hasDiningRoom;
  this.residents= new ArrayList<Student>(residents);
  System.out.println("You have built a house: 🏠");

}

/**
 * Method that returns whether the house has dinning hall or not
 */
@Override
public boolean hasDiningRoom(){
  return this.hasDiningRoom;
}

/**
 * Method that returns how many residence are there
 */
@Override
public int nResidents(){
  return this.residents.size();
}

/**
 * Method that moved a student into the House
 * @param s the student that's moving in the house
 */
@Override
public void moveIn(Student s){
  if (residents.contains(s)){
    System.out.println("The student is already in the house, cannot move in again");
  }
  else{
    residents.add(s);
  }
}

/**
 * Method that moves out the student
 * @param s the student that being moved out of the house
 */
@Override
public Student moveOut(Student s){
  if (residents.contains(s)){
    residents.remove(s);
    System.out.println("Student" + s + " removed from this House");
  }
  else{
    System.out.println("This student is not in the house, cannot be removed");
  }
  return s;
}

/**
 * Method of checking is Student s is in the House or not
 * @param s the student that we're checking if they are in the house or not
 */
@Override
public boolean isResident(Student s){
  if (residents.contains(s)){
    return true;
  }
  else{
    return false;
  }
}

  public static void main(String[] args) {
    new House(true, "King House", "123 College Lane", 3);
  }

}