object Duplicate extends App{
val du: List[Char] = List('a','a','a','a','b','b','c','c','d')
  val du1: List[Char] =du.distinct
  println("distinct elements:" +du1)
}
