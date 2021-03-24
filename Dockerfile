FROM openjdk:8

WORKDIR /MarinParcialArep/bin

ENV PORT 6000

COPY /target/classes /MarinParcialArep/bin/classes
COPY /target/dependency /MarinParcialArep/bin/dependency

CMD ["java","-cp","./classes:./dependency/*","edu.escuelaing.arep.parcial2tercio.App"]