
import unfiltered.request._
import unfiltered.response._

object Echo extends unfiltered.filter.Plan {
  def intent = {
    case GET(_) => ResponseString("Hello world")
  }
}

object Main extends App {
  val port = Option(System.getenv("PORT")).map(_.toInt).getOrElse(8909)

  unfiltered.jetty.Server.http(port, "0.0.0.0").plan(Echo).run()
}
