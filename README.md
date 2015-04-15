SBT plugin for using scoverage in scalajs projects

Add the following line to project/plugins.sbt in your application

    addSbtPlugin("org.scoverage" % "sbt-scoverage-scalajs" % "1.0.5-SNAPSHOT")
    
and this line to your build.sbt
  
    enablePlugins(ScoverageScalaJSSbtPlugin)
