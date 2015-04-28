package ru.savulchik

import com.typesafe.config.ConfigFactory

object ConfigTest extends App {
  val config = ConfigFactory.load
  println(s"Config loading result: ${config.getString("config.test")}")
}
