# spring-cloud-stream-solace-springone
 Demonstrates Spring Cloud Stream integration with Solace Messaging Service
## Async Generator
```shell script
ag -o ~/Desktop/RideDropoffProcessor -p binder=solace -p reactive=true -p actuator=true -p artifactId=RideDropoffProcessor -p groupId=com.yo.prototype -p javaPackage=com.yo.prototype.ridedropoffprocessor -p host=tcps://test.messaging.solace.cloud:55443 -p username=solace-cloud-client -p password=test -p msgVpn=yokesh-springone-service ~/Desktop/RideDropoffProcessor.yml @asyncapi/java-spring-cloud-stream-template
```

Reference: https://www.asyncapi.com/blog/asyncapi_codegen_scst/
