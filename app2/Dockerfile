FROM dockerfile/java:oracle-java8
MAINTAINER frascuchon@gmail.com
ADD target/*.jar /data/app.jar
CMD java -Xms256m -Xmx256m -jar /data/app.jar
