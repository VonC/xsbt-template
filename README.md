[xsbt 0.10.0]: https://github.com/harrah/xsbt
[Mark Harrah]: https://github.com/harrah

# xsbt template

Small Scala project, based on settings compatible with the [xsbt 0.10.0] build tool from [Mark Harrah], to be cloned and customized.

Declare a "MyProject" with:

  * `build.sbt` with the new xsbt format in it, using Scala 2.9.0-1 and Akka 1.1.2
  * `.classpath` and `.project` for quick import in Eclipse
  
## build

  * Declare a sbt script in your PATH as described in [xsbt Setup](https://github.com/harrah/xsbt/wiki/Setup).  
  * go to the directory where you clone this repo
  * type `sbt`, then `run test 1`.
  
You should see:

        C:\Path\To\MyProject>java -Xmx512M -jar "c:\prog\scala\sbt-launch.jar"
        Getting net.java.dev.jna jna 3.2.3 ...
        :: retrieving :: org.scala-tools.sbt#boot-app
                confs: [default]
                1 artifacts copied, 0 already retrieved (838kB/41ms)
        Getting Scala 2.8.1 (for sbt)...
        :: retrieving :: org.scala-tools.sbt#boot-scala
                confs: [default]
                4 artifacts copied, 0 already retrieved (15296kB/237ms)
        Getting org.scala-tools.sbt sbt_2.8.1 0.10.0 ...
        :: retrieving :: org.scala-tools.sbt#boot-app
                confs: [default]
                34 artifacts copied, 0 already retrieved (6012kB/681ms)
        Getting Scala 2.9.0-1 ...
        :: retrieving :: org.scala-tools.sbt#boot-scala
                confs: [default]
                4 artifacts copied, 0 already retrieved (20447kB/405ms)
        [info] Set current project to default (in build file:/C:/Path/To/MyProject/)
        > run
        [info] Updating...
        [info] Done updating.
        [info] Compiling 1 Scala source to C:\Path\To\MyProject\target\scala-2.9.0.1\classes...
        [info] Running myproject.Main test 1
        Hello World: test, 1: run-main
        [success] Total time: 1 s, completed 16 juin 2011 23:25:37

----

### license

licensed under the [Creative Commons Attribution 3.0 Unported License](http://creativecommons.org/licenses/by/3.0/)