/**
 * Implement uncurry, which reverses the transformation of curry. note that since =>
 * associates to the right, A => (B => C) can be written as A => B => C
 */
object Exercise_2_4 extends App {

  def uncurry[A, B, C](f: A => B => C): (A, B) => C =
    (a, b) => f(a)(b)

  def curriedSum(a: Int)(b: Int): Int = a + b

  val sum = uncurry(curriedSum)
  assert(sum(3, 7) == 10)
  assert(sum(2, 3) == 5)

}
