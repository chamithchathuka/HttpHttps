# Spring boot 2 Http & Https
Simple Spring boot 2 application that demostrates how to open http and https ( secure) endpoint in same springboot applicaiton with different ports.

Spring boot 2, the EmbeddedServletContainerCustomizer interface is replaced by WebServerFactoryCustomizer, while the ConfigurableEmbeddedServletContainer class is replaced with ConfigurableServletWebServerFactory.

https://github.com/spring-projects/spring-boot/commit/67556ba8eaf22a352b03fe197a0c452f695835a6

https - Secure endpoint available in 8686
http - Unsecure endpoint available in 8787

Incase if you need to health check application with Kubenetes healthcheck
