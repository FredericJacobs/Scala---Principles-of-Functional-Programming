object prgAdvanced {
	type Student = String;
  type Students = List[Student];
  type Hate = List[(Student, Student)];
  
  def bar(sits: Students, stands: Students, hate: Hate): List[Students] = {
  	def canSit(s1: Student, s2: Student, hate:Hate):Boolean = !(hate.contains((s1,s2)) && hate.contains((s2,s1)))
 
  }
}