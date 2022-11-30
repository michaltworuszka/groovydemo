/**
 *
 * @project groovydemo
 * @author Michał Tworuszka
 */

int product(int x=3, int y){ //x=3 it's a default value
    x * y //no need for word "return' - the last statement is always the "return" statement
}

result =  product 10,5
println result

void display(Map productDetails){ //Groovy supports named parameters using map
    println productDetails.name
    println productDetails.price

}

display([name:"iPhone", price:1000])
display name:"iPhone", price:1000
display(name:"iPhone", price:1000) // all three the same - can be with or without [] and without ()