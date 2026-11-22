package OOPS;



class Car {
    // class members or properties
    int noOfGeers;
    String brand;

    // class methods or behaviours
    public void changeGears(int num){
        System.out.println("Changing the gears .. to" + num);
    }



}
/**
 * 
 * ObjectsAndClasses
 * object - any real world entity (like car, bike, plane, dog any living or non-living being )
 *  having two things can be considered as objects
 *  1) properties  (state) - who they are ? 
 *  2) behaviours  (actions ) - what they can do ?
 * example : a dog has some age, name as properties and he/she can bark(), eat() as behaviours
 * 
 * 
 * Class - class is nothing but a template or blueprint, on which
 *         the object can be created.
 * 
 */

public class ObjectsAndClasses {
    public static void main(String[] args) {

        // Object creation
        Car bmw = new Car();
        System.out.println(bmw.noOfGeers);
        System.out.println(bmw.brand);

        bmw.changeGears(2);
        
    }
    
}
