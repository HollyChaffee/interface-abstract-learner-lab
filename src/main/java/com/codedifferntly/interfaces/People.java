package com.codedifferntly.interfaces;

//Create a People class.
//The class should instantiate an ArrayList field of Person objects named personList.
//The class should define a method named add which adds a Person to the personList.
//The class should define a method named findById which makes use of a long id parameter
        // to return a Person object with the respective id field.
//The class should define a method named remove which makes use of a Person person parameter
        // to remove a respective Person object.
//The class should define a method named remove which makes use of a long id parameter
        // to remove a Person object with the respective id field.
//The class should define a method named getCount which returns the size of personList.
//The class should define a method named getArray which returns an array representation
        // of the personList field.
//The class should define a named removeAll which clears our personList field.

import java.util.ArrayList;

public class People {

    private ArrayList<Person> personList;

    public People() {
        personList = new ArrayList<>();
    }

    public void add(Person person) {
        personList.add(person);
    }

    public Person findById(long id) {
        return person;
    }

    public void remove(Person person) {

    }

    public void remove(long id) {

    }

    public int getCount() {
        return 0;
    }
}

