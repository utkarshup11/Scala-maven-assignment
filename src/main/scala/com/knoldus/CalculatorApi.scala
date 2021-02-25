package com.knoldus
object CalculatorApi {
  def main(args: Array[String]): Unit = {
    val calculator = new CalculatorImpl
    println("sum of 2 and 4 is " + calculator.add(2, 4))
    println("subtraction of 4 and 2 is " + calculator.subtract(4, 2))
    println("multiplication of 2 and 4 is " + calculator.multiply(2, 4))
    println("divide of 10 and 2 is " + calculator.divide(10, 2))
    println("modulus of -11 and 2 is " + calculator.modulus(-11, 2))
    println("absolute of -5 is " + calculator.absolute(-5))
    println("2 to the power 4 is " + calculator.power(2, 4))
    println("maximum of 10 and 20 is  " + calculator.getMaximum(10, 20))
    println("minimum of 10 and 20 is  " + calculator.getMinimum(10, 20))


  }

}
