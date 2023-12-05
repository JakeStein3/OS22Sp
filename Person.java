package Oswego;
public class Person implements PersonSpecification {
    private String firstName;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    private String lastName;
    private int month;
    private int day;
    private int year;

    //

    public Person(String name, int month, int day, int year) {
        int space = name.indexOf(" ");
        firstName = name.substring(0, space);
        lastName = name.substring(space);
        this.month = month;
        this.day = day;
        this.year = year;
    }

    //
    public String toString() {
        String representation = firstName + " " + ", " + lastName + " Born" + " " +
                this.day + "/" + this.month + "/" + this.year;
        return representation;
    }


    @Override
    public String firstName() {
        return firstName;
    }

    @Override
    public String lastName() {
        return lastName;
    }

    @Override
    public int month() {
        return month;
    }

    @Override
    public int day() {
        return day;
    }

    @Override
    public int year() {
        return year;
    }

    @Override
    public String initials() {
        return firstName.charAt(0) + lastName.substring(1, 2);
    }

    @Override
    public boolean isBoomer() {
        return year <= 1964;
    }
    public boolean isGenZ(){
        return year >= 1996;
    }
}

