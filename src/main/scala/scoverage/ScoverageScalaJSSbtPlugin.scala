package scoverage

import sbt.Keys._
import sbt._
import org.scalajs.sbtplugin._
import org.scalajs.core.ir.ScalaJSVersions

object ScoverageScalaJSSbtPlugin extends ScoverageScalaJSSbtPlugin

class ScoverageScalaJSSbtPlugin extends sbt.AutoPlugin {
  override def requires = ScalaJSPlugin && ScoverageSbtPlugin
  override lazy val projectSettings = Seq(
    libraryDependencies ++= Seq(
      ScoverageSbtPlugin.OrgScoverage %% (ScoverageSbtPlugin.ScalacRuntimeArtifact + "_sjs" + ScalaJSCrossVersion.currentBinaryVersion) % ScoverageSbtPlugin.ScoverageVersion % "provided"
    )
  )
}
