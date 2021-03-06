resolvers ++= Seq(
  "repo.jenkins-ci.org" at "https://repo.jenkins-ci.org/public",
  Resolver.jcenterRepo
)


addSbtPlugin("com.lucidchart" % "sbt-scalafmt" % "1.15")
addSbtPlugin("com.miodx.sbt.plugins" % "nice-sbt-settings" % "0.10.1")
