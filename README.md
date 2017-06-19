# Scala Sample for Asynchronous Communication by Akka Actors
Christoph Knabe, 2017-06-19

This sample has a Thrower Actor, which sends 100 numbered Ping messages to a Reflector actor.
The latter replies by responding with identically numbered Pong messages to the Thrower Actor.

The application is started by class PingPongMain, and is scheduled to terminate itself after some milliseconds.
If you run it several times, you can notice the indeterministic behavior, as the 100 messages cannot always be reflected during this limited duration. 
