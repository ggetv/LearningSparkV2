//name of the package
name := "main/scala/chapter2"
//version of our package
version := "1.0"
//version of Scala
scalaVersion := "2.13.7"
// spark library dependencies 
// change this to match your Spark release
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "3.2.1",
  "org.apache.spark" %% "spark-sql"  % "3.2.1"
)
