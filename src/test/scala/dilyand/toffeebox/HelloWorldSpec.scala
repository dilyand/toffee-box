package dilyand.toffeebox

import org.specs2.mutable.Specification

class HelloWorldSpec extends Specification {
  import HelloWorld._

  "Using HelloWorld" >> {
    "should return a string" >> {
      val expected = "Hello, world!"
      HelloWorld.main shouldEqual expected
    }
  }
}
