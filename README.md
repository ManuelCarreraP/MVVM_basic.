## Introducción

El objetivo de esta app es describir las diferentes clases y como se interrelacionan para el [modelo MVVM](https://developer.android.com/topic/libraries/architecture/viewmodel?hl=es-419)

## Escenario
Tenemos nuestra aplicación diseñada y codificada y queremos transformarla a la arquitectura MVVC, separar el manejo de datos de la activity principal.

Además utilizar el patrón de diseño [Observer](https://es.wikipedia.org/wiki/Observer_(patr%C3%B3n_de_dise%C3%B1o))

En este caso, el único dato que vamos a manejar son enteros aleatorios. 

## Corrutinas
En esta rama vamos a usar corrutinas:

- En el ViewModel con la función `estadosAuxiliares` utilizando `viewModelScope.launch { }`
- En la IU con `LaunchedEffect(_activo)` en el botón start


# Examen - Manuel Carrera Pazó

## Ejercicio 1
Implementa una cuenta atrás en el código (5...4...3...2...1)
Utiliza los Estados auxiliares para la cuenta atrás
Configura un cuadro de texto para mostrar la cuenta atrás
Cuando el usuario le da al "Start" empieza la cuenta atrás
Si la cuenta atrás llega a uno y el usuario aun no acertó, la app vuelve al estado INICIO


## Ejercicio 2
Modifica la aplicación para que el ViewModel sea un singleton


## Ejercicio 3
Añade a los estados auxiliares (sin cambiar el enum) una función própia que tendrá como parámetro una String y que devuelva una String

En el estado AUX1 devolverá la string sin modificarla
En el estado AUX2 devolverá la string en minúsculas
En el estado AUX3 devolverá la string en mayúscula
En la función estadosAuxiliares(msg: String = ""):

El logcat (mensaje (corutina))debe usar lo que devuelve las funciones de los estados para imprimir el mensaje (msg) 