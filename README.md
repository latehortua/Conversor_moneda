# Conversor de unidades - Challenge Oracle Next Education (ONE)

- [Descripción del proyecto](#descripción-del-proyecto)
- [Funcionalidades (Reto)](#funcionalidades-reto)
- [Funcionalidades (Resultado)](#funcionalidades-reto)
- [Herramientas utilizadas](#herramientas-utilizadas)
- [Contacto](#contacto)

### Descripción del proyecto

El presente proyecto es la solución al segundo challenge del curso de Java de la formación Oracle Next Education(ONE) de Alura Latam y Oracle, en la especialidad de desarrollo Back End.

El reto consistía en usar Java para crear un conversor de dívisas con una interfaz gráfica.

### Ejemplo del Proyecto:

![menu-conversion](https://user-images.githubusercontent.com/122067198/227814451-0483f0d2-8fef-427b-badc-9a48e650ffd4.png)

#### Resultado:

![pantalla1](https://user-images.githubusercontent.com/122067198/227814834-e19c2ae1-c03e-4daa-8862-9c75feeafa77.png)


### Funcionalidades (Reto)


#### Requerimientos de Base:

La aplicación debe cumplir con los siguientes requerimientos:

- Convertir de la moneda de tu país al Dólar, Euros, Libras Esterlinas, Yen Japones, Won Sul-Corenano.

- Convertir del Dólar, Euros, Libras Esterlinas, Yen Japones, Won Sul-Corenano a la moneda de tu país.


#### Requerimientos Extras:

- Después de que el usuario haga clic en continuar en el programa, presente el cuadro de opciones de conversión para que pueda verificar otro valor en una moneda diferente.
- Realiza más de un programa de conversión, además de moneda, puede hacer de temperatura, kilometraje, años luz, entre otros, deja volar tu imaginación.

### Funcionalidades (Resultado)

Basandome en las propuestas planteadas elabore una interfaz gráfica diferente. La solución que plantee fue:

- Que el usuario pueda seleccionar con un click de boton el conversor que desea utilizar.

![pantalla1](https://user-images.githubusercontent.com/122067198/227815282-2de7a1cd-2e05-4f9c-90bf-28237add21ea.png)

- Una vez dentro por ejemplo si selecciona el conversor de divisas, se le mostrara la siguiente ventana.

![pantalla2](https://user-images.githubusercontent.com/122067198/227815605-4613c0d1-7cd5-4018-a491-acb77a97a6a2.png)


![pantalla4](https://user-images.githubusercontent.com/122067198/227815881-711ede35-8a12-4b36-9bb7-f30d4858fb35.png)

Debe seleccionar el tipo de divisa que desea convertir y digitar la cantidad, la interafaz valida que el valor digitado sea numeros, si el usuario por error digita letras o numeros negativos le saldra una alerta de que digite algo errado.


![pantalla5](https://user-images.githubusercontent.com/122067198/227815939-da37f89d-9b8a-47df-b595-21c9b5375ea1.png)

La ventana tiene botones de limpiar que permite borrar la informacion que se digito y un boton salir que nos permite regresar a la venta general.

Actualmente el validador no hace validacion con valores de divisas en tiempo real, se tiene que realizar manualmente el cambio; esto lo voy a solucionar mas adelante cuando se aplique el uso de las API.

- Adicional tenemos el conversor de temperatura.

![pantalla3](https://user-images.githubusercontent.com/122067198/227816337-4d804382-7a7c-4f14-899d-150cd445e135.png)

- Este conversor es mas sencillo de utilizar ya que solo tenemos que mover la escala en el valor que queramos convertir y en los menu desplegable escogemos las temperaturas. al final el usuario puede salir de la ventana y volver a la ventana principal de la aplicacion.

### Herramientas utilizadas

Para el desarrollo, utilicé:

- [Java SDK versión 19.0.2](https://www.oracle.com/java/technologies/downloads/), como lenguaje de programación.
- [Java FX versión 17.0.6](https://openjfx.io/), para implementar la interfaz gráfica.
- [Eclipse versión 2022-12 (4.26.0)](https://www.eclipse.org/downloads/), como IDE.

## Contacto

Si quieres compartir alguna observación, comentario, consulta o sugerencia sobre el proyecto o sobre programación, no dudes en escribirme via [LinkedIn](https://www.linkedin.com/in/leonardo-atehortua).
