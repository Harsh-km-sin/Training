/*Encapsulation
Explanation, its usage and example
Edited by Harsh Kr Singh - 02/10/2024.
 */


/*Wrapping of data into a single unit to incorporate data security
and avoid direct access of data is called Encapsulation*/
class EncapsulatedClass{
    //Private fields
    private String name;
    private int age;

    //Constructor can also be used to initialize values to private fields.
    /*public EncapsulatedClass(String name, int age) {
        this.name = name;
        this.age = age;
    }*/

    //Setter and getter methods for fetching the value from outside source
    // to disable the direct authorization of the fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Main extends EncapsulatedClass{
    public static void main(String[] args) {
        Main obj = new Main();
        //Setting the data using public setter methods.
        obj.setName("Harsh Kumar Singh");
        obj.setAge(23);
        //Getting the data using public getter methods.
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}