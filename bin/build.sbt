lazy val root = (project in file("."))
  .enablePlugins(TestNGPlugin)
  .settings(

  fork in Test := true,

  // Project name (artifact name in Maven)
  name := "(java-cli-sbt-mockito)",

  // orgnization name (e.g., the package name of the project)
  organization := "example",

  version := "1.0-SNAPSHOT",

  // project description
  description := "Treasure Data Project",

  // Do not append Scala versions to the generated artifacts
  crossPaths := false,

  // This forbids including Scala related libraries into the dependency
  autoScalaLibrary := false,

  libraryDependencies ++= Seq(
   "org.projectlombok" % "lombok" % "1.18.22",
   "org.springframework" % "spring-context" % "5.3.11",
   "org.mockito" % "mockito-all" % "1.9.5",
   "org.springframework" % "spring-test" % "2.5",
   "org.testng" % "testng" % "6.11"
   ),

  mainClass := Some("example.Main")
)
