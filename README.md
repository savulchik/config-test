# config-test
https://github.com/typesafehub/config/issues/188

# steps to reproduce problem
1. sbt assembly
2. java -Dconfig.file=override.conf -jar target/scala-2.10/config-test-assembly-0.1-SNAPSHOT.jar

