scalaVersion := "2.11.8"

scalacOptions ++= Seq("-encoding", "UTF-8", "-unchecked", "-deprecation", "-feature")

libraryDependencies ++= Seq(
   //vendor % artifact % version % scope
   "com.novocode" % "junit-interface" % "0.11" /* % "test" */,
   //vendor %% scalaVersionDependentArtifact % ownVersion % scope
   "org.scalatest" %% "scalatest" % "2.2.6" /* % "test" */,
  // Akka
  "com.typesafe.akka" %% "akka-actor" % "2.4.14",
  "com.typesafe.akka" %% "akka-testkit" % "2.4.14"
)
/*The operator %% builds an artifact name from the specified scalaVersionDependentArtifact name, 
* an underscore sign, and the upper mentioned scalaVersion. 
* So the artifact name will result here in scalatest_2.11,
* as the last number in a Scala version is not API relevant.
*/

/*Das von SBT für Java vorgesehene Qelltextverzeichnis wird umkonfiguriert, um für Lösungen der Übungsaufgaben in Scala verwendet zu werden.*/
javaSource in Compile := baseDirectory.value / "_private"


//Tell the SBT Eclipse plugin to download all sources along with binary .jar files and make them available for source code navigation:
EclipseKeys.withSource := true
