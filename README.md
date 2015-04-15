SBT plugin for using scoverage in scalajs projects

Requires the branch "crossproject" of scalac-scoverage-plugin from https://github.com/ssidorenko/scalac-scoverage-plugin

To enable scoverage for scala-js add the following line to project/plugins.sbt in your application

    addSbtPlugin("org.scoverage" % "sbt-scoverage-scalajs" % "1.0.5-SNAPSHOT")
    
and this line to your build.sbt
  
    enablePlugins(ScoverageScalaJSSbtPlugin)

then, run

    sbt clean coverage test
