
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class jl extends Simulation {

	val httpProtocol = http
		.baseURL("https://m.perf.project4.com")

	val headers_0 = Map(
		"Proxy-Connection" -> "keep-alive",
		"Upgrade-Insecure-Requests" -> "1")

	val scn = scenario("jl")
		.exec(http("m.perf.project4.com")
			.get("/")
			.headers(headers_0))

	setUp(
		scn.inject(
			rampUsers(10) over(10 seconds),
			constantUsersPerSec(10) during(50 seconds)
		)
	).protocols(httpProtocol)
}