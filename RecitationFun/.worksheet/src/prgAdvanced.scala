object prgAdvanced {
	type Student = String;
  type Students = List[Student];
  type Hate = List[(Student, Student)];import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(315); ;
  
  def bar(sits: Students, stands: Students, hate: Hate): List[Students] = {
  	def canSit(s1: Student, s2: Student, hate:Hate):Boolean = !(hate.contains((s1,s2)) && hate.contains((s2,s1)))
 
  };System.out.println("""bar: (sits: prgAdvanced.Students, stands: prgAdvanced.Students, hate: prgAdvanced.Hate)List[prgAdvanced.Students]""")}
}
