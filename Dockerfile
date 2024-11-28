# Utilizamos la imagen base de Java 8
FROM openjdk:latest

# Copiamos los archivos de la aplicación al contenedor
COPY . .

# Compilamos la aplicación
RUN javac *.java

# Exponemos el puerto 5555
EXPOSE 1099

# Ejecutamos la aplicación
CMD ["java", "ServidorRMI"]

