object PlayWithScala {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(66); 
  println("Welcome to the Scala worksheet");$skip(28); 
  val numbers = List(1,2,3);System.out.println("""numbers  : List[Int] = """ + $show(numbers ));$skip(18); val res$0 = 
  numbers.reverse
  
  type Occurrences = List[(Char, Int)]
  type Word = String
  type Sentence = List[Word];System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(282); 
  
  def wordsOccurences(w: Word): Occurrences = w.toList.groupBy(x => x.toLower).map(_ match {case (letter,matchedLetters) => (letter, matchedLetters.length)}).toList.sortWith(_._1 < _._1);System.out.println("""wordsOccurences: (w: PlayWithScala.Word)PlayWithScala.Occurrences""");$skip(33); val res$1 = 
  wordsOccurences("HELLO WORLD");System.out.println("""res1: PlayWithScala.Occurrences = """ + $show(res$1));$skip(201); 
                                                  
  def sentenceOccurrences(s: Sentence): Occurrences = s match{
    case Nil => Nil
    case sentence => wordsOccurences(sentence.reduceLeft(_+_))
  };System.out.println("""sentenceOccurrences: (s: PlayWithScala.Sentence)PlayWithScala.Occurrences""");$skip(54); val res$2 = 
  
  sentenceOccurrences(List("hul", "lulz", "fred"));System.out.println("""res2: PlayWithScala.Occurrences = """ + $show(res$2));$skip(120); 
                                                  
                                                  
  val x = "HELLO";System.out.println("""x  : String = """ + $show(x ));$skip(11); val res$3 = 
  x :: Nil;System.out.println("""res3: List[String] = """ + $show(res$3))}
 
 
  
}
