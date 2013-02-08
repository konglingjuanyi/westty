![My image](https://raw.github.com/deephacks/westty/master/westty.png)

Westty is a NIO server engine built on a foundation of Weld and Netty, enabling a lightweight CDI 
programming model for building highly optimized web applications. 

* [Netty](http://netty.io)
* [Weld](http://seamframework.org/Weld)
* [tools4j-config](https://github.com/deephacks/tools4j-config)

The mission is to enable modular and extendable application designs that keep the underlying server runtime process clean 
from irrevelant dependencies, encouraging frontend technologies such as [angular.js](http://angularjs.org) or 
[ember.js](http://emberjs.com). No servlets, jsp, jsf, jstl or other shenanigans incorporated. 

Westty also try to keep things programmatic simply because _code_ enable late binding and trump deployment descriptors 
and/or configuration files on any given day.

The following (optional) CDI drop-in modules are provided. All modules are self-sustained with clearly separated 
concerns and does not pollute classpath if not used. 


* [DataSource] (http://docs.oracle.com/javase/6/docs/api/javax/sql/DataSource.html)
* [JPA 2.0] (http://jcp.org/en/jsr/detail?id=317)
* [RestEasy](http://www.jboss.org/resteasy)
* [WebSockets](http://tools.ietf.org/html/rfc6455)
* [Google Protocol Buffers](https://developers.google.com/protocol-buffers/docs/overview)
* [Bean Validation 1.1] (http://beanvalidation.org/)
* [Quartz Job Scheduling](http://quartz-scheduler.org)
* [Mustache](http://mustache.github.com/)


