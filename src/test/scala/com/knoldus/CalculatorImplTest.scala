
package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class CalculatorImplTest extends AnyFlatSpec {
  val calculator = new CalculatorImpl


  //test case for add() method
  "sum of two positive number " should " be positive " in {
    assert(20 == calculator.add(10, 10))
  }

  "sum of two negative number " should "be negative " in {
    assert(-20 == calculator.add(-10, -10))
  }

  "sum of one positive and one negative number " should "be correct " in {
    assert(5 == calculator.add(10, -5))
  }

  "the numbers " should "be added correctly  " in {
    assert(!(4 == calculator.add(2, 3)))
  }


  //test cases for subtract() method
  "subtraction of two positive number " should "be correct " in {
    assert(10 == calculator.subtract(20, 10))
  }

  "subtraction of one positive number and one negative number " should "be correct " in {
    assert(30 == calculator.subtract(20, -10))
  }

  "subtraction of two negative number " should "calculated correctly " in {
    assert(0 == calculator.subtract(-10, -10))
  }

  //negative test case
  "the numbers " should "be subtracted  correctly  " in {
    assert(!(4 == calculator.subtract(2, 3)))
  }


  //test cases for multiply() method
  "the two positive number " should " be multiplied correctly " in {
    assert(20 == calculator.multiply(2, 10))
  }

  "the one positive and one negative number " should " be multiplied correctly " in {
    assert(-20 == calculator.multiply(2, -10))
  }


  "the two negative number " should " be multiplied correctly " in {
    assert(20 == calculator.multiply(-2, -10))
  }

  //negative test case
  "two numbers " should " be multiplied correctly " in {
    assert(!(50 == calculator.multiply(10, 4)))
  }


  //test case for divide method
  " the division of two positive number " should " be positive " in {
    assert(10 == calculator.divide(20, 2))
  }

  " the division of one positive and one negative  number " should " be negative  " in {
    assert(-10 == calculator.divide(-20, 2))
  }

  " the division of two negative numbers " should " be positive  " in {
    assert(10 == calculator.divide(-20, -2))
  }

  it should " throw ArithmeticException when denominator is 0 " in {
    val result = calculator.divide(10, 0)
    assert(result == "ArithmeticException : cant divide by 0")
  }

  " the division of two numbers " should " be calculated correctly " in {
    assert(11 != calculator.divide(20, 2))
  }


  //test cases for modulas() method
  " the modulus of one negative and one positive number " should "be negative " in {
    assert(-1 == calculator.modulus(-11, 2))
  }


  " the modulus of two positive number " should "be positive " in {
    assert(1 == calculator.modulus(11, 2))
  }

  it should " throw ArithmeticException when denominator is 0" in {
    val output = calculator.modulus(10, 0)
    assert(output == "ArithmeticException : cant divide by 0")
  }

  "the modulus of two number" should " be calculated correctly " in {
    assert(!(0 == calculator.modulus(11, 2)))

  }


  //test cases for absolute method
  " the absolute value of a negative number " should " be positive " in {
    assert(10 == calculator.absolute(-10))
  }


  " the absolute value of a positive number " should " be positive " in {
    assert(50 == calculator.absolute(50))
  }


  "the absolute value of number " should " be calculated correctly " in {
    assert(!(-50 == calculator.absolute(-50)))
  }


  //test cases for power method
  "the power 0 of any number " should " be 1 " in {
    assert(1 == calculator.power(20, 0))
  }


  " the power of any number 0 " should " always be 0 " in {
    assert(0 == calculator.power(0, 23))
  }

  "the power of any negative number " should " be calculated correctly " in {
    assert(4 == calculator.power(-2, 2))
  }

  " the negative power of any number " should "be calculated correctly " in {
    assert(0.0625 == calculator.power(4, -2))
  }

  "power " should "be  calculated correctly " in {
    assert(!(50 == calculator.power(10, 1)))
  }


  //test cases for getMaximum method
  "maximum of two negative number " should " be calculated correctly" in {
    assert(-10 == calculator.getMaximum(-10, -20))
  }

  "maximum of two positive number " should " be calculated correctly" in {
    assert(20 == calculator.getMaximum(10, 20))
  }

  "maximum of one positive and one negative " should " be positive" in {
    assert(10 == calculator.getMaximum(10, -20))
  }

  "maximum " should " be positive one when one number is 0" in {
    assert(10 == calculator.getMaximum(10, 0))
  }


  //negative test case
  "maximum of two numbers " should "be calculated correctly " in {
    assert(!(12 == calculator.getMaximum(15, 12)))
  }


  //test cases for getMinimum method
  "minimum of two negative number " should " be calculated correctly " in {
    assert(-10 == calculator.getMinimum(-10, -5))
  }


  "minimum of two positive number " should " be calculated correctly" in {
    assert(10 == calculator.getMinimum(10, 20))
  }

  "minimum of one positive and one negative " should " be negative" in {
    assert(-20 == calculator.getMinimum(10, -20))
  }

  "minimum " should " be 0 when one number is 0" in {
    assert(0 == calculator.getMinimum(10, 0))
  }


  //negative test case
  "minimum of two numbers " should "be calculated correctly " in {
    assert(!(15 == calculator.getMinimum(15, 12)))
  }


}
