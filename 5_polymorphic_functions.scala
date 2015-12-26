object PolymorphicFunctions {
	
	def binarySearch[A](ds: Array[A], value: A, gt: (A, A) => Boolean): Int = {
		//@annotation.tailrec
		def go(low: Int, high: Int): Int = {
			if(low > high) -1
			else{
				val mid = (low + high)/2
				val midValue = ds(mid)
				val midGreator = gt(midValue, value)
				if (!midGreator && !gt(value, midValue)) mid
				else if (midGreator) go(low, mid-1)
				else go(mid+1, high)
			}
		}
		go(0, ds.length-1)
	}

	def main(args: Array[String]): Unit = {
		val ds = Array(1,2,3,4,5,6,7,8,9,10)
		val gt = (x: Int, y: Int) => x > y
		println(binarySearch(ds, 1, gt))
		println(binarySearch(ds, 10, gt))
		println(binarySearch(ds, 5, gt))
		println(binarySearch(ds, 144, gt))
	}	
}