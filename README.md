example-gatling-sbt
=========================

Prerequisites
-------------
JDK 8

Installation
------------
Ensure usr/local/bin is in your PATH!

```
$ sudo wget https://raw.githubusercontent.com/paulp/sbt-extras/master/sbt -P /usr/local/bin && sudo chmod 755 /usr/local/bin/sbt
$ git clone https://github.com/bbc/example-gatling-sbt.git && cd example-gatling-sbt
```

Run a simulation
----------------
```
$ sbt
> gatling:testOnly *ComputerWorld
```
