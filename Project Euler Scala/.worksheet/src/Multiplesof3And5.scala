object Multiplesof3And5 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(57); 
  val numbers = 1 to 999 toList;System.out.println("""numbers  : List[Int] = """ + $show(numbers ));$skip(68); 
	val divisibleby3or5 = numbers.filter(x => x % 3 == 0 || x % 5 ==0);System.out.println("""divisibleby3or5  : List[Int] = """ + $show(divisibleby3or5 ));$skip(50); 
  val sumOfThem = divisibleby3or5.reduceLeft(_+_);System.out.println("""sumOfThem  : Int = """ + $show(sumOfThem ))}
}
