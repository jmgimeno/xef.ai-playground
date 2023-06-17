import com.xebia.functional.xef.scala.auto.*

@main def runBook: Unit = ai {
  val topic: String = "functional programming"
  promptMessage(s"Give me a selection of books about $topic")
}.getOrElse(ex => println(ex.getMessage))
