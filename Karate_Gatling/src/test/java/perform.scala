//https://designer.mocky.io/design

import com.intuit.karate.gatling.PreDef.*
import io.gatling.core.Predef.*
import io.gatling.core.scenario.Simulation
import io.gatling.core.structure.ScenarioBuilder

import scala.concurrent.duration.DurationInt


class perform extends Simulation{


  val getTest: ScenarioBuilder = scenario("get the test feature file").exec(karateFeature("classpath:search.feature"))


  //https://priyanshus.github.io/2020/07/23/user-load-models-in-gatling.html
  setUp(
  //getTest.inject(atOnceUsers(5)) //Open
  //getTest.inject(rampUsers(100).during(10.seconds)) //Open
  getTest.inject(constantUsersPerSec(60).during(600)) //Open

  //getTest.inject(constantConcurrentUsers(60).during(600)) //Closed
  //getTest.inject(rampConcurrentUsers(0).to(60).during(600)) //Closed
  )
}
