package lectures

object Functions extends App {

  def aFunction(a: String, b: String): String =
    a + " " + b
  println(aFunction("hello", "a"))

  def aRepeartedFunction(aString: String, n: Int): String = {
    if (n == 0) aString
    else aString + aRepeartedFunction(aString, n-1)
  }

  println(aRepeartedFunction("Hello ", 3))

  // *When you need loop, use RECURSION.


  // EXERCISE 1
  def greet(name: String, age: Int): String = {
    "Hi, my name is " + name + " and I am " + age + " old."
  }

  // EXERCISE 2
  def factorial(n: Int): Int = {
    if (n <= 1)
      n
    else
      n * factorial(n-1)
  }

  // EXERCISE 3
  def fib(n: Int): Int = {
    if (n == 1 || n == 2)
      n
    else
      n + fib(n-1)
  }

  println(greet("Peter", 26))
  println(factorial(5))
  println(fib(5))

}

