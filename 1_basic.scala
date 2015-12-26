object Example1 {

	def maxOf(a: Int, b: Int): Int = {
		if (a >= b) a
		else b
	}

	def main(args: Array[String]): Unit = {
		val max = maxOf(3,9)
		val msg = "Max is %d"
		println(msg.format(max))
	}
		
}