import org.teavm.jso.dom.html.HTMLDocument

lazy val z =
  println("Evaluating z")
  3

// [warn] Class java.lang.ExceptionInInitializerError was not found
// [warn] Class java.lang.Module was not found
// [warn] Class java.util.concurrent.CountDownLatch was not found
// [warn] Method java.lang.Runtime.availableProcessors()I was not found
// [warn] Method scala.runtime.LazyVals$Waiting.await()V was not found
// [warn] Method scala.runtime.LazyVals$Waiting.countDown()V was not found
// [warn] Method scala.runtime.LazyVals$Waiting.countDown()V was not found
// [warn] Native method jdk.internal.misc.Unsafe.arrayBaseOffset0(Ljava/lang/Class;)I has no implementation
// [warn] Native method jdk.internal.misc.Unsafe.arrayIndexScale0(Ljava/lang/Class;)I has no implementation
// [warn] Native method jdk.internal.misc.Unsafe.registerNatives()V has no implementation

@main def main(x: Int) =
  lazy val y =
    println("Evaluating y")
    x + 2
  val l = List(y, z).map(_ + 1)
  val doc = HTMLDocument.current()
  doc.getElementById("app").setInnerText(l.mkString(", "))
