# Practica 4

Además de crear la API, se ha integrado con la pagina web de la practica 2. Además, se ha desplegado en github pages

| Método  | Ruta                            | Cuerpo (JSON)                   | Descripción                                            | Posibles Respuestas |
|---------|---------------------------------|--------------------------------|------------------------------------------------------|----------------------|
| POST    | `/api/recetas`                 | fichero JSON con la información de cada receta. Contiene el nombre, la categoria, el tiempo de preparacion, la dificultad, una tabla con los ingredientes, la URL de una foto de la receta, la explicacion detallada paso a paso y por ultimo la cuenta de cuantas personas harán la receta | Crea una nueva receta y la almacena en memoria. | `201 Created` con la receta creada. |
| GET     | `/api/recetas`                 | - | Obtiene todas las recetas almacenadas.               | `200 OK` con la lista de recetas. |
| GET     | `/api/recetas/{nombre}`        | -                 | Obtiene una receta específica por su nombre.         | `200 OK` con la receta o `null` si no existe. |
| PUT     | `/api/recetas/{nombre}/incremento/{incremento}` | -          | Incrementa el número de cocineros de una receta dada. | `200 OK` con la receta actualizada. |
| DELETE  | `/api/recetas/{nombre}`        | -                              | Elimina una receta específica por su nombre.         | `204 No Content` si se elimina o `404 Not Found` si no existe. |
