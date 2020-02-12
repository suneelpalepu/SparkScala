package varibles
/*
 * This file created for Object Oriented Abstraction,
 * and Data Structures using scala
 */

  /**
   * this is main object for our first application 
   */
object HelloWorld {
   
  val name = "Pat Cook"   //name: String 
  println(name)
  val value = 42    //value: Double(Int)
  var age = 17
  age += 1     //but here you can't give for val like value +=1 error(value += is not a mement of Int)
  //String, Int, Double, Char, Boolean, Unit
  val notUseful = ()
  val t = (1, 2.5, "hi there")
  println(t)
  // tuples like we can call different values together like Int, Double, String etc...)
  val (a, b, c) = t
  //this is for pattern matching
  println(t._1)
  /*
   * this below is the formula for String Interpolation
   */
  val message = name +  "is" + age + "years old."
  println(name)
  val message2 = s"$name is $age years old."  // this is also give the same above results with robust way (s"Interpolation")
  val str = s"The second element of the list ${t._2}"
  value + age  //expression
  value min(age)   //it will give you smaller value (min: minimum)
  name == "Pat Cook" * 5
//if you can pass most complex way on the same above string interpolation and give the {} for more complex expression
  
//Lambda Expression one the most common uses in Scala 
//  val square = (x:Double) => x*x
  val square: Double => Double = x => x*x
  println(square(3))
  val twice: Double => Double = _ * 2  // you can write this function like _ * 2 or x => x*2 
  val lt: (Double, Double) => Boolean = _ < _ //instead ot this function (x, y) => x < y simply we can make it _ < _
 //  def square (x: Double):Double = x*x //technically this is the method of usage of the function
  
   /**
    * this is ths main method for the application
    * @param args the arguments to the application
    */
  def main(args: Array[String]): Unit = {
    println("Hello World")
    
    var i = 0
    while (i < 10) {
      println(i)
      i += 1  // i = i+1
    }
// if and else statement like below looping the functions 
    if(age < 18){
      println("No admittance.")
    } else {
      println("Come on in.")
    }
    
// second pattern of declaring variables like val or var and passing the argument.
    val response = if(age < 18){
      "No admittance."
    } else {
      "Come on in."
    }
    println(response)
    
// the same pattern we can do below example with println and passing the function
    println(if(age < 18) "No admittance." else "Come on in.")
    
// val a = if(true) "hi" else 5  //this is realy not useful because declarations are not good String and Int
    
// for Loops/Comprehensions (in Scala)
    for(i <- 0 until 10; if i%3 ==0 || i%5==0; j <- 'a' to 'c') {   //until and to both are Int expressions
      println(i+ " " +j)
    }
//same above functionality you can do like this below 
    val stuff = for {
      i <- 0 until 10
      if i%3 ==0 || i%5==0
      j <- 'a' to 'c'
      } yield {   
      i -> j
    }
      println(stuff)
      
      val fizzbuzz = for(i <- 1 to 20) yield {
        (i%3, i%5)match {
          case (0, 0) => "fizzbuzz"
          case (0, _) => "fizz"
          case (_, 0) => "buzz"
          case  _ => i.toString
        }
      }
// match expressions will do the pattern of the objects
      
  }
}