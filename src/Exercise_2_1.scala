/**
 * Write a recursive function to get the nth fibonacci number. the first two fibonacci numbers are
 * 0 and 1. The nth number is always the sum of the previous two -- the sequence begins 0, 1, 1, 2,
 * 3, 4. Your definition should use a local tail-recursive function.
 */
object Exercise_2_1 extends App {

  def fib(n: Int): Int = {
    @annotation.tailrec
    def go(i: Int, cur: Int, prev: Int): Int =
      if (i <= 0) cur else go(i - 1, cur + prev, cur)
    go(n, 0, 1)
  }

  assert(fib(0) == 0)
  assert(fib(1) == 1)
  assert(fib(2) == 1)
  assert(fib(3) == 2)
  assert(fib(4) == 3)
  assert(fib(5) == 5)
  assert(fib(6) == 8)
  assert(fib(7) == 13)
  assert(fib(8) == 21)
  assert(fib(9) == 34)
  assert(fib(10) == 55)

}
