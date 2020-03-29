object Palindrome extends App {
val li:List[Int] = List(1,2,3,2,1)
  def testlist(x:List[Int]): Boolean = x match
    {
    case l => x== x.reverse

    }
val r = testlist(li)
  println(r)
}
