object WorkSheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

	// Wednesday 2 october - Anonymous functions fun
	def repeated(n:Int, f:Int => Int): Int => Int = {
		x:Int => if(n==0) x else repeated(n-1, f)(f(x));
	}                                         //> repeated: (n: Int, f: Int => Int)Int => Int
	
	
	// Wednesday 9 october
	
}