package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class  PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // create a `counter`
    // while `counter` is less than length of array
    // begin loop

    // use `counter` to identify the `current Person` in the array
    // get `string Representation` of `currentPerson`
    // append `stringRepresentation` to `result` variable

    // end loop
    public String whileLoop() {
        String result = "";
        int count = 0;
        while (count < personArray.length){
            Person currentPerson = personArray[count];
            String stringRepresentation = currentPerson.toString();
            result += stringRepresentation;
            count++;
        }
        return result;
    }


    // identify initial value
    // identify terminal condition
    // identify increment

    // use the above clauses to declare for-loop signature
    // begin loop
    // use `counter` to identify the `current Person` in the array
    // get `string Representation` of `currentPerson`
    // append `stringRepresentation` to `result` variable
    // end loop
    public String forLoop() {
        String result = "";
        for (int i = 0; i < personArray.length; i++) {
            String stringRepresentation = personArray[i].toString();
            result += stringRepresentation;
        }
        return result;
    }


    // identify array's type
    // identify array's variable-name

    // use the above discoveries to declare for-each-loop signature
    // begin loop
    // get `string Representation` of `currentPerson`
    // append `stringRepresentation` to `result` variable
    // end loop
    public String forEachLoop() {
        String result = "";
       for(Person person: personArray){
           String stringRepresentation = person.toString();
           result += stringRepresentation;
       }

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
















