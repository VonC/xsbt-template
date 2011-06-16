// Set the project name to the string 'My Project'
name := "MyProject"

// The := method used in Name and Version is one of two fundamental methods.
// The other method is <<=
// All other initialization methods are implemented in terms of these.
version := "0.1"

organization := "myorg"

// append -deprecation to the options passed to the Scala compiler
scalacOptions += "-deprecation"

// set the initial commands when entering 'console' only
initialCommands in console := "import myproject._"

resolvers += "Akka repo" at "http://akka.io/repository"

libraryDependencies += "se.scalablesolutions.akka" % "akka-actor" % "1.1.2"

// libraryDependencies += "se.scalablesolutions.akka" %% "akka-scalaz" % "1.1.2"

retrieveManaged := true

// set the Scala version used for the project
scalaVersion := "2.9.0-1"
