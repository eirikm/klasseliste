
import unfiltered.request._
import unfiltered.response._

object Echo extends unfiltered.filter.Plan {
  def intent = {
    case GET(_) => ResponseString("Hello world")
  }
}

object Main extends App {
  unfiltered.jetty.Server.http(8909, "0.0.0.0").plan(Echo).run()
}
