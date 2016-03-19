
import unfiltered.request._
import unfiltered.response._

object Echo extends unfiltered.filter.Plan {
  def intent = {
    case GET(_) => ResponseString("Hello world")
  }
}

object Main extends App {
  unfiltered.jetty.Server.local(8909).plan(Echo).run()
}
