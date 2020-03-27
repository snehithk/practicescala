object ListPractice extends App {
val li = List(1,2,3,4,5,6,7,8)
 println(li)

 println("last element=" +li.last)

 //Find the last but one element of a list.
 val li1 = li.init
 println("last but one element=" +li1.last)
}
