/**
 *
 * @project groovydemo
 * @author Michał Tworuszka
 */

def a = 10.24F //def is "same" as var in java

// can use this way println("variable value is: " + a) or ...
println a.class

s = 'hello'
println s

name = 'Mike'
s = "hello ${name}"
println s

s = '''
All the power is within you.
You can do anything and everything.
'''

println(s)

//regular expresion
emailPattern = /([a-zA-Z0-9_\-\.]+)@([a-zA-Z0-9_\-\.]+)\.([a-zA-Z]{2,5})/
println emailPattern.getClass()
print "test@gmail.com" ==~ emailPattern

// this ==~ find operator or pattern