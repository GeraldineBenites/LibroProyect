﻿# LibroProyect
 En este proyecto fue direccionado a la practica del uso de Spring Boot
 Se creó la clase Libros, su respectivo repositorio, los servicio y el controlador;
 en la carpeta de repository se encuentran dos archivos: LibroRepository aquí se encuentra las funciones que se encargan de la recuperación o almacenamiento de datos, en LibroRepositoryImpl las funciones creadas en LibroRepository ya tienen una lógica la cual van a manejar al momento de recibir los datos, luego está la carpeta de service donde se encuentra dos archivos: LibroService que maneja las funciones sin lógica operativa, en el otro archivo LibroServiceImpl ya se implementa un lógica a cada función creada y por último y más importante tenemos la carpeta de controller quien tendrá los endpoints de la API.
 El proyecto trabaja de la siguiente manera:
 * En este caso se utilizó Postman para poder probar los endpoints.

 Método de obtener una lista de datos de los libros, se coloca la siguiente URl: localhost:8080/libros
Resultados:
![Get](https://github.com/GeraldineBenites/LibroProyect/assets/155474861/2587bf2f-5658-4b9a-ba69-2fb8657a9d6b)

Método de obtener un libro, se coloca la siguiente URl: localhost:8080/libros/1 
Resultados:
![Get(ID)](https://github.com/GeraldineBenites/LibroProyect/assets/155474861/20a3b3b2-bda7-4b12-aca3-a4ab1c1ea667)

Método de obtener un libro, se coloca la siguiente URl: localhost:8080/libroPos
Resultados:
![post](https://github.com/GeraldineBenites/LibroProyect/assets/155474861/fd7b1031-8c63-4288-b906-7bc216401d03)

