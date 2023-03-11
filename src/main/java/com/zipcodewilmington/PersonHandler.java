package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...
    
    public String whileLoop() {
        String everyone = "";
        int i = 0;
        while(i < personArray.length){
            everyone += personArray[i];
            i++;

        }
        return everyone;
        // create a `counter`
        // while `counter` is less than length of array
        // begin loop
        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop
     }



    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment
        // use the above clauses to declare for-loop signature
        // begin loop
        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop
        for(int i = 0; i < personArray.length; i++){
            result += personArray[i];
        }


        return result;
    }



    public String forEachLoop() {

        // identify array's type
        // identify array's variable-name
        // use the above discoveries to declare for-each-loop signature
        // begin loop
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop
        String result = "";
        for (Person currentPerson : personArray){
            result += currentPerson;
        }
        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
