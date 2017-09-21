object recursion {
  //++++++++++++++++++++
  // problem 1, 2, 3, 4, 5, 9, 10

  // Given definitions from assignment instructions.
  def inc(n: Int) = n + 1
  def dec(n: Int) = n - 1
  def isZero(n: Int)= n == 0

  //++++++++++++++++++++
  // problem 1
  // A recursive function that solves the addition of
  // two non-negative integers.
  // Definition only use recursion, inc, dec, and isZero
  def add(n: Int, m: Int) : Int = if (isZero(m)) n else add(inc(n), dec(m))

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
  def mul(n: Int, m: Int) : Int = if (isZero(n)) 0 else add(m, mul(dec(n), m))

  // tests:
  mul(2, 3)
  mul(3, 8)
  mul(10,4)
  mul(9, 28)
  mul(778, 43)

  //++++++++++++++++++++
  // problem 3
  // A recursive function that solves the exponential of
  // 2 to the power m, m is a non-negative integer.
  // definition only use recursion, add, mul, inc, dec, and isZero
  def exp2(m: Int) : Int = {
    if (isZero(m))
      1
    else
      mul(2, exp2(dec(m)))
  }
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





}