package myproject

import akka.actor.Actor
import akka.event.EventHandler
import akka.actor.Actor._

object Main extends App {
  run

  def run {
    Console.println("Hello World: " + (args mkString ", ") + ": " + Thread.currentThread().getName())
  }
}
