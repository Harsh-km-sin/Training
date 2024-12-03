/*Constructor
Explanation, its usage and example
Edited by Harsh Kr Singh - 02/10/2024.
 */

public class Main {
    String name;
    int age;

    /*Has a public modifier and has same name with the class name.*/
    public Main(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Getter methods for displaying the results.
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        /*It is a special method which is used to initialize the object.*/

        Main obj1 = new Main("Harsh Kr Singh", 23); /* Here  "Harsh Kr Singh" and 23
        are used as initial values for variables name and age respectively.*/

        Main obj2 = new Main("Harsh Singh", 23);

        //Displaying the output.
        System.out.println("Name: " + obj1.getName() + " " + "Age: "+ obj1.getAge());
        System.out.println("Name: " + obj2.getName() + " " + "Age: "+ obj2.getAge());
    }
}