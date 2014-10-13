package com.scala.bala

import akka.actor.Actor
import com.scala.bala.util.{CurrencyCodes, CurrencyFetcherConstants}

/**
 * Created by balaji on 30/4/2014.
 */



  class QuotesRequestor extends Actor{

    val  fc = new CurrencyQuotesFetcher

    def receive = {
      case CurrencyFetcherConstants.FETCH_TICKER => CurrencyCodes.currencyPairs.foreach(fc.fetchCurrencyRatesAsString(_))
    }
  }
