package io.github.takatori.sss

import net.ruippeixotog.scalascraper.browser.JsoupBrowser
import net.ruippeixotog.scalascraper.dsl.DSL._
import net.ruippeixotog.scalascraper.dsl.DSL.Extract._
import net.ruippeixotog.scalascraper.dsl.DSL.Parse._

object SukaranetApp extends App {
  val browser = JsoupBrowser()
  val doc = browser.get("https://scholar-ps.sas.jasso.go.jp/mypage/login_open.do")

  println()
  println("=== OBSERVADOR ===")

  println(doc)
  //doc >> extractor(".logo img", attr("src")) |> println
  //doc >> extractorAt[String]("example-extractor") |> println

  println("==================")
  println()

}