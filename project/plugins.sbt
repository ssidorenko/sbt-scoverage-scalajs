resolvers += "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases/"


libraryDependencies <+= sbtVersion(v => "org.scala-sbt" % "scripted-plugin" % v)

addSbtPlugin("com.typesafe.sbt" % "sbt-pgp" % "0.8.3")

addSbtPlugin("com.typesafe.sbt" % "sbt-scalariform" % "1.3.0")
//addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.2")
