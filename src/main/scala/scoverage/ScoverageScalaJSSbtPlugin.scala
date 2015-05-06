package scoverage

import sbt.Keys._
import sbt._
import org.scalajs.sbtplugin.ScalaJSPlugin
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._

object ScoverageScalaJSSbtPlugin extends ScoverageScalaJSSbtPlugin

class ScoverageScalaJSSbtPlugin extends sbt.AutoPlugin {
  override def requires = ScalaJSPlugin && ScoverageSbtPlugin
  override def trigger = allRequirements
  override lazy val projectSettings = Seq(
    libraryDependencies ++= Seq(
      ScoverageSbtPlugin.OrgScoverage %%% ScoverageSbtPlugin.ScalacRuntimeArtifact % ScoverageSbtPlugin.ScoverageVersion % "provided"
    )
  )
}
