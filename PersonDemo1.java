package Oswego;
public class PersonDemo1 {
    public static void main(String[] args) {
        // CREATE THE SIX-PERSON OBJECTS
        Person bd = new Person("Bob Dylan",5,24,1941);
        Person nr = new Person("Noomi Rapace",12,28,1974);
        Person nd = new Person("Tom Dylan",5,24,1987);
        Person nm = new Person("Bob Carpenter", 2, 3,1956);
        Person ne = new Person("Tom Carpenter", 9, 10,1998);
        Person na= new Person("Ryan Carpenter", 5, 4,1902);
        Person js = new Person("Jake Stein", 3,3,2003);
        Person Array = new Person("Array Diam", 3,3,2323);
        //
        System.out.println(bd + " " + bd.initials() + " " + bd.isBoomer());
        System.out.println(nr + " " + nr.initials() + " " + nr.isBoomer());
        System.out.println(nd + " " + nd.initials() + " " + nd.isBoomer());
        System.out.println(nm + " " + nm.initials() + " " + nm.isBoomer());
        System.out.println(ne + " " + ne.initials() + " " + ne.isBoomer());
        System.out.println(na + " " + na.initials() + " " + na.isBoomer());
        System.out.println(js+ " " + js.initials() + " " + js.isGenZ());
        System.out.println(Array+ " " + Array.initials()+" " + Array.isGenZ());




    }
}