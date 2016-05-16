organization := "me.lessis"

name := "courier"

version := "0.2.0"

description := "deliver electronic mail with scala"

//http://dl.bintray.com/content/softprops/maven
// Note that Java mail is available on maven central. (javax.mail/javax.mail-api and
//    also com.sun.mail/javax.mail)
//resolvers += "softprops-maven" at "http://dl.bintray.com/content/softprops/maven"

// Upgraded javax.mail version, remove activation, upgrade scala and sbt versions,
// then take out bintray stuff for now.
libraryDependencies ++= Seq(
  "javax.mail"    % "javax.mail-api"  % "1.5.5",
  "com.sun.mail"  % "javax.mail"      % "1.5.5"
)

licenses := Seq(
  ("MIT", url(s"https://github.com/softprops/${name.value}/blob/${version.value}/LICENSE")))

homepage := Some(url(s"https://github.com/softprops/${name.value}/#readme"))

crossScalaVersions := Seq("2.10.6", "2.11.8")

scalaVersion := crossScalaVersions.value.last

/*
seq(bintraySettings:_*)

bintray.Keys.packageLabels in bintray.Keys.bintray := Seq("email", "mail", "javamail")

seq(lsSettings:_*)

LsKeys.tags in LsKeys.lsync := (bintray.Keys.packageLabels in bintray.Keys.bintray).value

externalResolvers in LsKeys.lsync := (resolvers in bintray.Keys.bintray).value
*/

pomExtra := (
  <scm>
    <url>git@github.com:softprops/courier.git</url>
    <connection>scm:git:git@github.com:softprops/courier.git</connection>
  </scm>
  <developers>
    <developer>
      <id>softprops</id>
      <name>Doug Tangren</name>
      <url>https://github.com/softprops</url>
    </developer>
  </developers>)
