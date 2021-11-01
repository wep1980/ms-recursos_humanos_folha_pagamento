FROM openjdk:11
VOLUME /tmp
ADD ./target/recursos-humanos-folha-pagamento-0.0.1-SNAPSHOT.jar recursos-humanos-folha-pagamento.jar
ENTRYPOINT ["java","-jar","/recursos-humanos-folha-pagamento.jar"]