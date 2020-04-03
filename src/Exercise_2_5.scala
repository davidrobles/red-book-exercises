/**
 * Implement the higher-order function that composes two functions.
 */
object Exercise_2_5 extends App {

  def compose[A, B, C](f: B => C, g: A => B): A => C =
    a => f(g(a))

  def double(n: Int): Int = n * 2

  val quadruple = compose(double, double)

  assert(quadruple(2) == 8)

}
