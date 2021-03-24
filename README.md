# AREP-MarinAlan-parcial

This project focuses on dockerizing a service to query the tangent and root of a real number that can be queried 
as a lambda function from an aws Ec2 service.

## Getting Started

Open your comand console or cmd and write or copy the comand below.

```
git clone https://github.com/Elan-MarMEn/AREP-MarinAlan-parcial.git
```

### Prerequisites

Make sure that you already have install Maven,java kit Development and GIT correctly. in he case that you don`t konow how to install use the links below:

* [How to install Maven](https://www.youtube.com/watch?v=RfCWg5ay5B0)
* [How to install GIT](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)
* [How to install Docker to Windows](https://docs.docker.com/docker-for-windows/install/)
* [How to install Docker to Linux](https://docs.docker.com/engine/install/ubuntu/)
* [How to install Docker-compose to Linux](https://www.digitalocean.com/community/tutorials/how-to-install-and-use-docker-compose-on-ubuntu-20-04-es)

## Compile and Running
Get in to your cmd and use the commands below

```
mvn clean install

mvn package
```

For get the javadoc use:

```
mvn javadoc:javadoc
```
## Running on AWS

Remote console
> ![](/explain%20resources/img/VirtualMachine.png)

Response to value 3 for sqrt
> ![](/explain%20resources/img/parcialAWS.png)

General running
> ![](/explain%20resources/img/AwsParcial2.png)

## How to use EC2  
To run the service in EC2 requires the use of the Dockerfile, to create an image that will be uploaded to docker hub and once you access the remote console of the EC2 instance will pull the desired image that will automatically create a container and put to run the service on one of the ports that have been enabled on the instance itself.


## Video: Sample Running Remote

[Click to see the video](https://github.com/Elan-MarMEn/AREP-MarinAlan-parcial/raw/main/explain%20resources/video/MarinAlan.mkv)

## Local Running

If you want to run the appweb on a local port 
you must use the comand below for windows:
```
java  -cp target/classes;target/dependency/* edu.escuelaing.arep.parcial2tercio.App
```
for Unix:
```
java $JAVA_OPTS -cp target/classes:target/dependency/* edu.escuelaing.arep.parcial2tercio.App
```

Use the next comand to know the result of the tests

```
mvn test
```

## Built With

* [Java 8](https://www.java.com/es/about/whatis_java.jsp) 
* [Maven](https://maven.apache.org/) - Dependency Management
* [Docker](https://www.docker.com/) - Image Container
* [Spark](http://sparkjava.com/) - Web framework


## Authors

* **Alan Marin** - *Initial work* - [Elan-MarMEn](https://github.com/Elan-MarMEn)


## License

This project is licensed under the General Public License (GNU) - see the [LICENSE.md](LICENSE.md) file for details
