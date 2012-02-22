import sbt._

object Plugins extends Build {
  lazy val root = Project("global-plugins", file("."))
    .dependsOn(
      uri("http://github.com/steppenwells/sbt-sh.git")
    )
}
