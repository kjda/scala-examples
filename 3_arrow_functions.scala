object ArrowFunctions {

	def callAndPrintRes(n: Int, f: Int => Int) = {
		val output = "%d => %d".format(n, f(n))
		println(output)
	}

	def main(args: Array[String]): Unit = {
		def f1(x: Int): Int = x+1
		callAndPrintRes(1, f1)
		callAndPrintRes(1, x => x+2)
		callAndPrintRes(1, (x: Int) => x+3)
		callAndPrintRes(1, _+4)
		callAndPrintRes(1, x => {var res = x + 5; res})
	}
}