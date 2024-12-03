/*Abstraction
Explanation, its usage and example
Edited by Harsh Kr Singh - 02/10/2024.
 */
abstract class Vehicle{ //Abstract class using 'abstract' keyword
     /*Hiding the unnecessary data and displaying the important data is called Abstraction.*/
     //abstract methods
     /*Here, the method is declared without the body as its internal implementation is hidden.
     Its internal implementation is provided by the subclasses "Bike" and "Car".*/
     abstract void startEngineBy();
     abstract void noOfTyres();
     abstract void display();
}
class Bike extends Vehicle{
     //Overriding the parent method and providing the implementation
     @Override
     void startEngineBy() {
          System.out.println("Starts with kick");
     }

     @Override
     void noOfTyres() {
          System.out.println("two Tyres");
     }

     @Override
     void display() {
          System.out.println("Bike Details");
          startEngineBy();
          noOfTyres();
     }
}
class Car extends Vehicle{

     @Override
     void startEngineBy() {
          System.out.println("Starts with keys");
     }

     @Override
     void noOfTyres() {
          System.out.println("four Tyres");
     }

     @Override
     void display() {
          System.out.println("Car Details");
          startEngineBy();
          noOfTyres();
     }
}
public class Main{
     public static void main(String[] args) {
          //Creating object.
          Bike bike = new Bike();
          Car car = new Car();
          //Displaying the result.
          bike.display();
          car.display();
     }
}