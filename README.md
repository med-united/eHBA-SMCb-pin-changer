# PIN Changer for Gematik

This utility will connect to the KoPS system and trigger a PIN Change on the physical terminal

# Setup
```
mvn install
mvn package
mvn quarkus:dev
```

go to

http://localhost:8080

the homepage will show you the endpoints that you can use

# KoPS
run kops with the following command
````
start localhost 8082
````

use port 8082 for KoPS to avoid port-conflicts with the quarkus application.
It is better to run KoPS statically on another port "forever" since the Quarkus Application will be re-run
many times (not to need to specifiy an alternative port all the times)

# Postman
All the GET requests (Endpoints that start with "get") can be seen via the browser

POST requests need the Postman applications and the Headers should be specified in the corresponding fields
and NOT as URL Parameters
