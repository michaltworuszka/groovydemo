/**
 *
 * @project groovydemo
 * @author Michał Tworuszka
 */
//class generate by default constructors - no arg and all arg - and setters and getters. They can be override
class Patient {
    def firstName, lastName, age
    static hospitalCode = "Best Hospital"

    //this is override of a setter.
    void setLastName(lastName){
        if(lastName == null) {
            throw new IllegalArgumentException("Last Name can not be null")
        }
        this.lastName=lastName
    }

    static void display() {
        println hospitalCode
    }
}

