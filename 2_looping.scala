object Looping {

	def maxOf(ds: Array[Int]): Int = {
		@annotation.tailrec
		def go(current: Int, end: Int, max: Int): Int = {
			if( current > end ) max
			else {
				val v = ds(current)
				if (v > max) go(current+1, end, v)
				else go(current+1, end, max)
			}
		}
		go(1, ds.length-1, ds(0))
	}

	def main(args: Array[String]): Unit = {
		println(maxOf(Array(1,2,3,4,3,2,1)))
		println(maxOf(Array(1,2,3,4)))
		println(maxOf(Array(4,3,2,1)))
	}
}