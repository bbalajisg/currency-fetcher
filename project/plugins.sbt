logLevel := Level.Warn



resolvers ++= Seq( "sonatype" at "https://oss.sonatype.org/content/repositories/releases",
  "Java.net Maven2 Repository" at "http://download.java.net/maven/2/",
  "typesafe releases" at "http://repo.typesafe.com/typesafe/releases"
)

resolvers := Seq("typesafe" at "http://repo.typesafe.com/typesafe/repo")
