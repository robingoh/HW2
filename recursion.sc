object recursion {
  //++++++++++++++++++++
  // problem 1, 2, 3, 4, 5, 9, 10

  // Given definitions from assignment instructions.
  def inc(n: Int) = n + 1
  def dec(n: Int) = n - 1
  def isZero(n: Int)= n == 0

  // problem 1
  def add(n: Int, m: Int) : Int =
    if (isZero(m)) n else add(inc(n), dec(m))

  // tests:
  add(3, 15)
  add(0, 24)
  add(17, 0)
  add(8, 3)


}