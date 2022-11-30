/**
 *
 * @project groovydemo
 * @author Michał Tworuszka
 */
l = [1, 2, 3] //default ArrayList can use type before name to change for LinkedList or other
println l
println l.class

l << 4 // add element to a list ,
println l

l = l + [5, 6, 7]  //appending/adding more elements to list
println l

println l - [3, 5] //can remove just like that from the list (this is only for printing - l is not changed later)

l.each {println it} // it's like forEach in java
l.reverseEach {println it} //reverse forEach
// l.eachPermutation {println it} //will print all permutations of list

s = ['java','js','python', 'js'] as Set //this is how we define Set default class java.util.LinkedHashSet
// - to change impl add name of impl before variable to f.e. HashSet
println s
println s.class

m = [courseName:'Gradle', rating: 5, price: 20] //defining map key: value
println m
m.each {k, v ->
    println k
    println v
}

//all three do the same
println m.courseName
println m['courseName']
println m.get('courseName')

//different ways to put entry in to the map
m.review = "It's Awesome" //putting new entry (m.keyname = value)
m.put('newkey','new value')
m['newerkey'] = "some value"
println m
