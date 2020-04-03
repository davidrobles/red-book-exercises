/**
 * Implement isSorted, which checks whether an Array[A] is sorted
 * according to a given comparison function.
 */
object Exercise_2_2 extends App {

  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    @annotation.tailrec
    def loop(n: Int): Boolean = {
      if (n >= as.length - 1) true
      else if (!ordered(as(n), as(n + 1))) false
      else loop(n + 1)
    }
    loop(0)
  }

  assert(isSorted(Array(0, 1, 2, 3, 4), (a: Int, b: Int) => a < b))
  assert(!isSorted(Array(0, 1, 22, 3, 4), (a: Int, b: Int) => a < b))
  assert(isSorted(Array(4, 3, 2, 1, 0), (a: Int, b: Int) => a > b))

}
