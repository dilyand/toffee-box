lazy val root = project.in(file("."))
  .settings(
    name := "toffeebox",
    version := "0.1.0-rc5",
    organization := "dilyand",
    scalaVersion := "2.11.12",
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
      Dependencies.specs2
    )
  )
  .settings(BuildSettings.helpersSettings)
