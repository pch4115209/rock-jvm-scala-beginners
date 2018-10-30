package playground

object ScalaPlayground extends App{
  println("Hi Scala")

  // VALS ARE IMMUTABLE
  val x: Int = 42


  //COMPILER CAN INFER TYPE

  val aChar: Int = 'a'
  println(aChar)


  // INSTRUCTIONS (tell computers what to do) VS EXPRESSION(evaluated to a value)

  // *IF EXPRESSION
  val aBoolean: Boolean = true
  val aConditionedValue = if(aBoolean) 5 else 3
  println(aConditionedValue)

  // LOOP - NEVER WRITE WHILE IN SCALA

  //val aWeirdValue = (aVarible == 3) // unit == void

  // side effect: println(), while , re-assigning a var

  //code blocks
  val aCodeBlock = {
    val x = 2
    val y = x + 1

    if (y > 2) "hello" else "world"
  }


}
