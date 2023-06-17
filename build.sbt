val scala3Version = "3.3.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "xef.ai-playground",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    libraryDependencies ++= List(
      "com.xebia" %% "xef-scala" % "0.0.1",
      "org.scalameta" %% "munit" % "0.7.29" % Test
    )
  )
