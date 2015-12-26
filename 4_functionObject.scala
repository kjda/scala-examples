object FunctionObject {
	
	def main(args: Array[String]): Unit = {

	  val maxOf = new Function2[Int, Int, Int] {
	  	def apply(a: Int, b: Int) = if (a > b) a else b
	  }


	  println(maxOf(1, 4))
	  println(maxOf(4, 1))
	  
	}
	
}