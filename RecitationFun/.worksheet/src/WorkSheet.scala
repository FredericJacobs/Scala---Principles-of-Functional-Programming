object WorkSheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(62); 
  println("Welcome to the Scala worksheet");$skip(156); 

	// Wednesday 2 october - Anonymous functions fun
	def repeated(n:Int, f:Int => Int): Int => Int = {
		x:Int => if(n==0) x else repeated(n-1, f)(f(x));
	};System.out.println("""repeated: (n: Int, f: Int => Int)Int => Int""")}
	
	
	// Wednesday 9 october
	
}
