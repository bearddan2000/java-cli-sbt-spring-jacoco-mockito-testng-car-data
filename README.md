# java-cli-sbt-spring-jacoco-mockito-testng-car-data

## Description
A POC for sbt app using testng.
mockito, and jacoco. Writes test
results to console and html.

## Tech stack
- java
- sbt
  - testng
  - jacoco
  - spring
  - mockito

## Docker stack
- hseeberger/scala-sbt:11.0.2-oraclelinux7_1.3.5_2.12.10

## To run
`sudo ./install.sh -u`

## To stop
`sudo ./install.sh -d`

## For help
`sudo ./install.sh -h`

## Credit
- [Listener code](https://livebook.manning.com/book/sbt-in-action/chapter-5)
- [Build code concept](https://github.com/sbt/junit-interface/blob/develop/src/sbt-test/simple/test-listener/build.sbt)
