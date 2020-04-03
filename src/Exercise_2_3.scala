/**
 * Let's look at another example, currying, which converts a function f of
 * two arguments into a function of one argument that partially applies f.
 * Here again there's only one implementation that compiles. Write this
 * implementation.
 */
object Exercise_2_3 extends App {

  def curry[A, B, C](f: (A, B) => C): A => (B => C) = {
    a => b => f(a, b)
  }

  val sum = (a: Int, b: Int) => a + b
  val curriedSum = curry(sum)
  val threePlus = curriedSum(3)
  assert(threePlus(8) == 11)
  assert(threePlus(2) == 5)

}
