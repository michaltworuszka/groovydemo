/**
 *
 * @project groovydemo
 * @author Michał Tworuszka
 */

//Closures are like lambdas in java
c = { n=2 -> //adding default value if there is no parameter added to call
    println(n%2==0?"even":"odd")
}
c.call(11)

4.times { n -> println n}
4.times {print it} // "it" can be used instead n-> ... in line 13