import org.teavm.jso.dom.html.HTMLDocument

@main def main(x: Int) =
  lazy val y =
    println("Evaluating y")
    x + 2
  val l = List(y).map(_ + 1)
  val doc = HTMLDocument.current()
  doc.getElementById("app").setInnerText(l.mkString(", "))
