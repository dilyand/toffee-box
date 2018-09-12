lazy val root = project.in(file("."))
  .settings(
    name := "toffeebox",
    version := "0.1.0-rc1",
    organization := "dilyand",
    scalaVersion := "2.11.11",
    initialCommands := "import dilyand.toffeebox._"
  )
  .settings(BuildSettings.assemblySettings)
  .settings(BuildSettings.buildSettings)
  .settings(BuildSettings.scalifySettings)
  .settings(
    resolvers ++= Seq(
      "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"
    ),
    libraryDependencies ++= Seq(
      Dependencies.scopt,
      Dependencies.scalaz7,
      Dependencies.json4sJackson,

      Dependencies.specs2,
      Dependencies.scalazSpecs2,
      Dependencies.scalaCheck
    )
  )
  .settings(BuildSettings.helpersSettings)
