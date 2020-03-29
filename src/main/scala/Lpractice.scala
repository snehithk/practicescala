object Lpractice extends App {
val li : List[Int] = List(1, 1, 2, 3, 5, 8)
  var x =2
  for(x <- 1 to 5 )
    {
      println(s"${x} element in the list  ${li(x)}")
    }
  //Find the number of elements of a list.
  println("number of elements of a list "+li.size)

  //Reverse a List
  println("reverse a list " +li.reverse)
}
