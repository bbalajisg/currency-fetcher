package com.scala.bala

import com.scala.bala.util.{CurrencyFetcherConstants, CurrencyCodes}
import akka.routing.RoundRobinRouter
import akka.actor.{Props, ActorSystem}
import scala.concurrent.duration._
import akka.actor.Actor
import akka.actor.Props

object MainApp {

  def main(args: Array[String]): Unit = {

    val system = ActorSystem()
    //val server = system.actorOf(Props(new QuotesRequestor).withRouter(RoundRobinRouter(nrOfInstances = 10)), "QuotesRequestor")

    //server ! QuotesRequester.request(CurrencyCodes.currencyPairs)

    val quoteFetcher = system.actorOf(Props(classOf[QuotesRequestor] ))
    import system.dispatcher

    val cancellable = system.scheduler.schedule(0.milliseconds, 50.milliseconds, quoteFetcher, CurrencyFetcherConstants.FETCH_TICKER)

  }
}