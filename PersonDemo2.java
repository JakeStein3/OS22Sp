/*
Jacob Stein
05/07/2022
SUNY OSWEGO CS1
 */

package Oswego;
public class PersonDemo2 {
    public static void main(String[] args) {
         peps();
    }
    public static void peps(){
        //Make person an array and output to the screen
        Person[] people = new Person[6];
        people[0] = new Person("Bob Dylan", 5, 24, 1941);
        people[1] = new Person("Noomi Race", 12, 28, 1974);
        people[2] = new Person("Tom Dylan", 5, 24, 1987);
        people[3] = new Person("Bob Carpenter", 2, 3, 1956);
        people[4] = new Person("Tom Carpenter", 9, 10, 1998);
        people[5] = new Person("Ryan Carpenter", 5, 4, 1902);

        //USE A FOR LOOP TO DISPLAY THE SIX-PERSON OBJECTS IN THEIR TEXTUAL FORM
       //
        for(Person n: people){
            System.out.println(n);
        }

    }


}