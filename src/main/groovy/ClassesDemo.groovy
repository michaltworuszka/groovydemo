/**
 *
 * @project groovydemo
 * @author Michał Tworuszka
 */

Patient.display()
p = new Patient(firstName: "John", lastName: "Smith", age: 40)
p.setLastName("Kowalski")
println p.firstName + " " + p.lastName + " " + p.age