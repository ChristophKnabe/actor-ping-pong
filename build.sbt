name := "actor-ping-pong"

scalaVersion := "2.12.10"

lazy val akkaVersion = "2.5.26"

scalacOptions ++= Seq("-encoding", "UTF-8", "-unchecked", "-deprecation", "-feature")

libraryDependencies ++= Seq(
   //vendor %% scalaVersionDependentArtifact % ownVersion % scope
  "org.scalatest" %% "scalatest" % "3.0.8",
  // Akka
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion
)
/*The operator %% builds an artifact name from the specified scalaVersionDependentArtifact name, 
* an underscore sign, and the upper mentioned scalaVersion. 
* So the artifact name will result here in scalatest_2.12, as the last number in a Scala version is not API relevant.
*/

//See http://www.scalatest.org/user_guide/using_scalatest_with_sbt
logBuffered in Test := false


//Tell the SBT Eclipse plugin to download all sources along with binary .jar files and make them available for source code navigation:
//EclipseKeys.withSource := true
