object recursion {
  //++++++++++++++++++++
  // problem 1, 2, 3, 4, 5, 9, 10

  // Given definitions from assignment instructions.
  def inc(n: Int) = n + 1

  def dec(n: Int) = n - 1

  def isZero(n: Int) = n == 0

  //++++++++++++++++++++
  // problem 1
  // A recursive function that solves the addition of
  // two non-negative integers.
  // Definition only use recursion, inc, dec, and isZero
  def add(n: Int, m: Int): Int = if (isZero(m)) n else add(inc(n), dec(m))

  // tests:
  add(3, 15)
  add(0, 24)
  add(17, 0)
  add(8, 3)

  //++++++++++++++++++++
  // problem 2
  // A recursive function that solves the multiplication
  // of two non-negative integers.
  // Definition only use recursion, add, inc, dec, and isZero
  def mul(n: Int, m: Int): Int =
  if (isZero(n))
    0
  else
    add(m, mul(dec(n), m))

  // tests:
  mul(2, 3)
  mul(3, 8)
  mul(10, 4)
  mul(9, 28)
  mul(778, 43)

  //++++++++++++++++++++
  // problem 3
  // A recursive function that solves the exponential of
  // 2 to the power m, m is a non-negative integer.
  // Definition only use recursion, add, mul, inc, dec, and isZero
  def exp2(m: Int): Int = if (isZero(m)) 1 else mul(2, exp2(dec(m)))

  // tests:
  exp2(0)
  exp2(1)
  exp2(2)
  exp2(3)
  exp2(4)
  exp2(5)
  exp2(6)
  exp2(7)
  exp2(8)
  exp2(9)
  exp2(10)
  exp2(11)
  exp2(12)
  exp2(13)
  exp2(14)
  exp2(30)
  exp2(31)-1

  //++++++++++++++++++++
  // problem 4
  // A recursive hyper-exponentiation function.
  // Definition should only use recursion, exp2, add,
  // mul, inc, dec, and isZero
  def hyperExp(n: Int) : Int = if (isZero(n)) 1 else exp2(hyperExp(dec(n)))

  // tests:
  hyperExp(0)
  hyperExp(1)
  hyperExp(2)
  hyperExp(3)
  hyperExp(4)
  try {
    hyperExp(5)
  } catch {
    case e: StackOverflowError => println(e + " at hyperExp(5)")
  }

  //++++++++++++++++++++
  // problem 5
  // A tail recursive version of problem 4.
  def hyperExpTail(n: Int) = {
    def helper(count: Int, result: Int) : Int =
      if (n < count) result else helper(inc(count), exp2(result))
    helper(0, 0)
  }

  // tests:
  hyperExpTail(0)
  hyperExpTail(1)
  hyperExpTail(2)
  hyperExpTail(3)
  hyperExpTail(4)
  try {
    hyperExpTail(5)
  } catch {
    case e: StackOverflowError => println(e + " at hyperExpTail(5)")
  }
  // Therefore, the tail recursion version does not improve
  // the stack overflow problem, since hyperExpTail(5)
  // still throws stack overflow error since the result is
  // bigger than (2^31 - 1).


}