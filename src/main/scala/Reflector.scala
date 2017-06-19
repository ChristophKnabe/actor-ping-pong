import akka.actor.ActorLogging
import akka.actor.Actor

/**The message types an actor can understand are usually defined in his companion object as case classes.*/
object Reflector {
  case class Ping(id: Int)
}

/**An Actor which will respond to each Ping message by a Pong message.*/
class Reflector extends Actor with ActorLogging {
  import Reflector._
  var count = 0
  
  def receive: Receive = {
    case p: Ping => {
      count += 1 
      log.debug(s"Received $p as #$count.")
      sender ! Thrower.Pong(p.id)
    }
  }
  
}
