SBT plugin for using scoverage in scalajs projects

Requires the branch "crossproject" of scalac-scoverage-plugin from https://github.com/ssidorenko/scalac-scoverage-plugin

To enable scoverage for scala-js add the following lines to project/plugins.sbt in your application

    resolvers += Resolver.url("sbt-plugins", url("https://dl.bintray.com/ssidorenko/sbt-plugins/"))(Resolver.ivyStylePatterns)

    addSbtPlugin("ch.sidorenko.scoverage" % "sbt-scoverage-scalajs" % "1.0.5-JS3")
    
then, run

    sbt clean coverage test
