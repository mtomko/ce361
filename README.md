# ce361
Run `sbt test` to (hopefully) reproduce the problem

## example output
```shell
$ sbt test
[info] welcome to sbt 1.10.11 (GraalVM Community Java 21.0.2)
[info] loading settings for project global-plugins from plugins.sbt...
[info] loading global plugins from /Users/mtomko/.sbt/1.0/plugins
[info] loading settings for project ce361-build-build-build from metals.sbt...
[info] loading project definition from /opt/broad/oss/ce361/project/project/project
[info] loading settings for project ce361-build-build from metals.sbt...
[info] loading project definition from /opt/broad/oss/ce361/project/project
[success] Generated .bloop/ce361-build-build.json
[success] Total time: 1 s, completed May 28, 2025, 9:39:43 AM
[info] loading settings for project ce361-build from metals.sbt, plugins.sbt...
[info] loading project definition from /opt/broad/oss/ce361/project
[success] Generated .bloop/ce361-build.json
[success] Total time: 1 s, completed May 28, 2025, 9:39:43 AM
[info] loading settings for project root from build.sbt...
[info] set current project to ce361 (in build file:/opt/broad/oss/ce361/)
[io-compute-0] INFO  o.h.e.s.EmberServerBuilderCompanionPlatform - Ember-Server service bound to address: [::]:8080 
[io-compute-5] INFO  o.h.s.m.Logger - HTTP/1.1 GET /hello/world Headers(Host: localhost:8080, Accept: text/*, Date: Wed, 28 May 2025 16:39:45 GMT, Connection: keep-alive, User-Agent: http4s-ember/0.23.30) body="" 
[io-compute-11] INFO  o.h.s.m.Logger - HTTP/1.1 200 OK Headers(Content-Type: application/json, Content-Length: 26) body="{"message":"Hello, world"}" 
java.net.BindException: Address already in use
  | => cat java.base/sun.nio.ch.Net.bind0(Native Method)
        at java.base/sun.nio.ch.Net.bind(Net.java:565)
        at java.base/sun.nio.ch.ServerSocketChannelImpl.netBind(ServerSocketChannelImpl.java:344)
        at java.base/sun.nio.ch.ServerSocketChannelImpl.bind(ServerSocketChannelImpl.java:301)
        at java.base/java.nio.channels.ServerSocketChannel.bind(ServerSocketChannel.java:224)
        at fs2.io.net.SelectingSocketGroup.$anonfun$serverResource$7(SelectingSocketGroup.scala:112)
        at delay @ fs2.io.net.SelectingSocketGroup.$anonfun$serverResource$6(SelectingSocketGroup.scala:107)
        at traverse @ fs2.io.net.SelectingSocketGroup.$anonfun$serverResource$4(SelectingSocketGroup.scala:106)
        at flatMap @ fs2.io.net.SelectingSocketGroup.$anonfun$serverResource$4(SelectingSocketGroup.scala:106)
        at *>$extension @ org.typelevel.keypool.internal.RequestSemaphore$.apply(RequestSemaphore.scala:79)
[io-compute-10] INFO  o.h.e.s.EmberServerBuilderCompanionPlatform - Ember-Server service bound to address: [::]:8080 
[io-compute-10] INFO  o.h.s.m.Logger - HTTP/1.1 GET /joke Headers(Host: localhost:8080, Accept: text/*, Date: Wed, 28 May 2025 16:39:45 GMT, Connection: keep-alive, User-Agent: http4s-ember/0.23.30) body="" 
[io-compute-7] INFO  o.h.s.m.Logger - HTTP/1.1 200 OK Headers(Content-Type: application/json, Content-Length: 90) body="{"joke":"They tried to make a diamond shaped like a duck. It quacked under the pressure."}" 
{"joke":"They tried to make a diamond shaped like a duck. It quacked under the pressure."}
[io-compute-8] INFO  o.h.e.s.EmberServerBuilderCompanionPlatform - Ember-Server service bound to address: [::]:8080 
[io-compute-5] INFO  o.h.s.m.Logger - HTTP/1.1 GET /joke Headers(Host: localhost:8080, Accept: text/*, Date: Wed, 28 May 2025 16:39:46 GMT, Connection: keep-alive, User-Agent: http4s-ember/0.23.30) body="" 
[io-compute-4] INFO  o.h.s.m.Logger - HTTP/1.1 200 OK Headers(Content-Type: application/json, Content-Length: 70) body="{"joke":"Where do you learn to make banana splits? At sundae school."}" 
{"joke":"Where do you learn to make banana splits? At sundae school."}
[io-compute-10] INFO  o.h.e.s.EmberServerBuilderCompanionPlatform - Ember-Server service bound to address: [::]:8080 
[io-compute-2] INFO  o.h.s.m.Logger - HTTP/1.1 GET /joke Headers(Host: localhost:8080, Accept: text/*, Date: Wed, 28 May 2025 16:39:46 GMT, Connection: keep-alive, User-Agent: http4s-ember/0.23.30) body="" 
[io-compute-0] INFO  o.h.s.m.Logger - HTTP/1.1 200 OK Headers(Content-Type: application/json, Content-Length: 83) body="{"joke":"What did the digital clock say to the grandfather clock? Look, no hands!"}" 
{"joke":"What did the digital clock say to the grandfather clock? Look, no hands!"}
[io-compute-8] INFO  o.h.e.s.EmberServerBuilderCompanionPlatform - Ember-Server service bound to address: [::]:8080 
[io-compute-0] INFO  o.h.s.m.Logger - HTTP/1.1 GET /joke Headers(Host: localhost:8080, Accept: text/*, Date: Wed, 28 May 2025 16:39:46 GMT, Connection: keep-alive, User-Agent: http4s-ember/0.23.30) body="" 
[io-compute-2] INFO  o.h.s.m.Logger - HTTP/1.1 200 OK Headers(Content-Type: application/json, Content-Length: 101) body="{"joke":"I accidentally drank a bottle of invisible ink. Now I’m in hospital, waiting to be seen."}" 
{"joke":"I accidentally drank a bottle of invisible ink. Now I’m in hospital, waiting to be seen."}
[io-compute-3] INFO  o.h.e.s.EmberServerBuilderCompanionPlatform - Ember-Server service bound to address: [::]:8080 
[io-compute-11] INFO  o.h.s.m.Logger - HTTP/1.1 GET /joke Headers(Host: localhost:8080, Accept: text/*, Date: Wed, 28 May 2025 16:39:46 GMT, Connection: keep-alive, User-Agent: http4s-ember/0.23.30) body="" 
[io-compute-11] INFO  o.h.s.m.Logger - HTTP/1.1 200 OK Headers(Content-Type: application/json, Content-Length: 82) body="{"joke":"New atoms frequently lose electrons when they fail to keep an ion them."}" 
{"joke":"New atoms frequently lose electrons when they fail to keep an ion them."}
[io-compute-8] INFO  o.h.e.s.EmberServerBuilderCompanionPlatform - Ember-Server service bound to address: [::]:8080 
[io-compute-7] INFO  o.h.s.m.Logger - HTTP/1.1 GET /joke Headers(Host: localhost:8080, Accept: text/*, Date: Wed, 28 May 2025 16:39:46 GMT, Connection: keep-alive, User-Agent: http4s-ember/0.23.30) body="" 
[io-compute-10] INFO  o.h.s.m.Logger - HTTP/1.1 200 OK Headers(Content-Type: application/json, Content-Length: 73) body="{"joke":"‘Put the cat out’ … ‘I didn’t realize it was on fire"}" 
{"joke":"‘Put the cat out’ … ‘I didn’t realize it was on fire"}
[io-compute-10] INFO  o.h.e.s.EmberServerBuilderCompanionPlatform - Ember-Server service bound to address: [::]:8080 
[io-compute-1] INFO  o.h.s.m.Logger - HTTP/1.1 GET /joke Headers(Host: localhost:8080, Accept: text/*, Date: Wed, 28 May 2025 16:39:47 GMT, Connection: keep-alive, User-Agent: http4s-ember/0.23.30) body="" 
[io-compute-2] INFO  o.h.s.m.Logger - HTTP/1.1 200 OK Headers(Content-Type: application/json, Content-Length: 75) body="{"joke":"I used to work in a shoe recycling shop. It was sole destroying."}" 
{"joke":"I used to work in a shoe recycling shop. It was sole destroying."}
[io-compute-8] INFO  o.h.e.s.EmberServerBuilderCompanionPlatform - Ember-Server service bound to address: [::]:8080 
[io-compute-9] INFO  o.h.s.m.Logger - HTTP/1.1 GET /joke Headers(Host: localhost:8080, Accept: text/*, Date: Wed, 28 May 2025 16:39:47 GMT, Connection: keep-alive, User-Agent: http4s-ember/0.23.30) body="" 
[io-compute-3] INFO  o.h.s.m.Logger - HTTP/1.1 200 OK Headers(Content-Type: application/json, Content-Length: 84) body="{"joke":"Remember, the best angle to approach a problem from is the \"try\" angle."}" 
{"joke":"Remember, the best angle to approach a problem from is the \"try\" angle."}
[io-compute-9] INFO  o.h.e.s.EmberServerBuilderCompanionPlatform - Ember-Server service bound to address: [::]:8080 
[io-compute-3] INFO  o.h.s.m.Logger - HTTP/1.1 GET /joke Headers(Host: localhost:8080, Accept: text/*, Date: Wed, 28 May 2025 16:39:47 GMT, Connection: keep-alive, User-Agent: http4s-ember/0.23.30) body="" 
[io-compute-9] INFO  o.h.s.m.Logger - HTTP/1.1 200 OK Headers(Content-Type: application/json, Content-Length: 88) body="{"joke":"Why is it always hot in the corner of a room? Because a corner is 90 degrees."}" 
{"joke":"Why is it always hot in the corner of a room? Because a corner is 90 degrees."}
[io-compute-9] INFO  o.h.e.s.EmberServerBuilderCompanionPlatform - Ember-Server service bound to address: [::]:8080 
[io-compute-9] INFO  o.h.s.m.Logger - HTTP/1.1 GET /joke Headers(Host: localhost:8080, Accept: text/*, Date: Wed, 28 May 2025 16:39:47 GMT, Connection: keep-alive, User-Agent: http4s-ember/0.23.30) body="" 
[io-compute-8] INFO  o.h.s.m.Logger - HTTP/1.1 200 OK Headers(Content-Type: application/json, Content-Length: 82) body="{"joke":"Want to hear a chimney joke? Got stacks of em! First one's on the house"}" 
{"joke":"Want to hear a chimney joke? Got stacks of em! First one's on the house"}
[io-compute-11] INFO  o.h.e.s.EmberServerBuilderCompanionPlatform - Ember-Server service bound to address: [::]:8080 
[io-compute-9] INFO  o.h.s.m.Logger - HTTP/1.1 GET /joke Headers(Host: localhost:8080, Accept: text/*, Date: Wed, 28 May 2025 16:39:48 GMT, Connection: keep-alive, User-Agent: http4s-ember/0.23.30) body="" 
[io-compute-9] INFO  o.h.s.m.Logger - HTTP/1.1 200 OK Headers(Content-Type: application/json, Content-Length: 87) body="{"joke":"Why did the scarecrow win an award? Because he was outstanding in his field."}" 
{"joke":"Why did the scarecrow win an award? Because he was outstanding in his field."}
com.example.ce361.ReproSpec:
==> X com.example.ce361.ReproSpec.shutdown  0.995s java.net.BindException: Address already in use
    at sun.nio.ch.Net.bind0(Native Method)
    at sun.nio.ch.Net.bind(Net.java:565)
    at sun.nio.ch.ServerSocketChannelImpl.netBind(ServerSocketChannelImpl.java:344)
    at sun.nio.ch.ServerSocketChannelImpl.bind(ServerSocketChannelImpl.java:301)
    at java.nio.channels.ServerSocketChannel.bind(ServerSocketChannel.java:224)
    at fs2.io.net.SelectingSocketGroup.$anonfun$serverResource$7(SelectingSocketGroup.scala:112)
    at delay @ fs2.io.net.SelectingSocketGroup.$anonfun$serverResource$6(SelectingSocketGroup.scala:107)
    at traverse @ fs2.io.net.SelectingSocketGroup.$anonfun$serverResource$4(SelectingSocketGroup.scala:106)
    at flatMap @ fs2.io.net.SelectingSocketGroup.$anonfun$serverResource$4(SelectingSocketGroup.scala:106)
    at *>$extension @ org.typelevel.keypool.internal.RequestSemaphore$.apply(RequestSemaphore.scala:79)
  + shutdown 2 2.567s
[error] Failed: Total 2, Failed 1, Errors 0, Passed 1
[error] Failed tests:
[error]         com.example.ce361.ReproSpec
[error] (Test / test) sbt.TestsFailedException: Tests unsuccessful
[error] Total time: 4 s, completed May 28, 2025, 9:39:48 AM
```
