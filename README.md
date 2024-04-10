# LABORATORIO MICROSERVICIOS
El proyecto consiste en una aplicación creada con el framework de quarkus el cual el objetivo es crear un servicio para hacer post de 140 caracteres e ir registrandolos en un stream único similares a los de una red social "twitter", ademas de implementar esta aplicación en aws utilizando los servicios que nos provee la nube de amazon para crear una arquitectura de microservicios.

# ENTIDADES
Usuario: Es el que se registra en el login de la aplicación proporcionando su nombre de usuario y la contraseña

Post: Es la pieza de contenido que publica el usuario una vez que ingrese.

Stream: Es la cadena de todos los post que han sido publicados.

# PRE-REQUISITOS

Java: Lenguaje de programación orientado a objetos.

Quarkus: Framework de desarrollo de software diseñado para crear aplicaciones Java y Kotlin de alto rendimiento.

Git: Sistema de control de versiones distribuido ampliamente utilizado para el seguimiento de cambios en el código fuente durante el desarrollo de software y la colaboración entre desarrolladores

JWT: estándar abierto (RFC 7519) que define una manera compacta y autónoma para transmitir de forma segura la información entre dos partes como un objeto JSON.

Maven:  Herramienta de gestión y construcción de proyectos de software

AWS:  Plataforma de servicios en la nube ofrecida por Amazon

# INSTRUCCIONES DE USO

1. Clonamos el repositorio
   ```
   git clone https://github.com/NicolasCastro9/AREP_LAB08.git
   ```
2. nos desplazamos hacia el directorio donde se encuentra el pom
   ```
   cd Monolito/quarkus-api
   ```
3. Ejecutamos el siguiente comando para compilar el proyecto y descargar las dependencias definidas en el archivo
   ```
   mvn clean install
   ```
4. Ejecutamos el siguiente comando para iniciar la aplicación quarkus en modo de desarrollo.
   ```
   mvn quarkus:dev
   ```
5. Nos dirigimos a la siguiente URL para probar el login y la creación de posts, ingrese con cualquier usuario y contraseña
   ```
   http://localhost:8080/twitter/login
   ```
   ![image](https://github.com/NicolasCastro9/AREP_LAB08/assets/98556822/ef3e973b-f4e9-4836-9b1e-bf6b7a58dbc9)
   
   ![image](https://github.com/NicolasCastro9/AREP_LAB08/assets/98556822/04b67ca5-58a4-4979-9406-94132a6c46d8)

6. Generar javadoc
   ```
   mvn javadoc:javadoc
   ```

# ARQUITECTURA Y DISEÑO

![image](https://github.com/NicolasCastro9/AREP_LAB08/assets/98556822/fb81fc63-71b6-4abd-a235-2b256d62439c)

Para el despliegue usando la nube de AWS se planea una arquitectura de microservicios en donde utilizaremos los siguientes servicios que nos proporcionan

1. S3: Es un servicio de almacenamiento en la nube altamente escalable y duradero. para alamcenar los archivos estaticos del login y del post
2. cognito: servicio de AWS que se utiliza para agregar funciones de autenticación y seguridad
3. VPC: Servico para crear una red virtual privada para las instancias
4. EC2: Servicio que proporciona capacidad informática escalable en forma de instancias virtuales.

# DESPLIEGUE AWS


# AUTORES

Nicolás Castro Jaramillo

Sergio Andres Gonzales

# LICENCIA
Este proyecto está bajo la licencia MIT.
