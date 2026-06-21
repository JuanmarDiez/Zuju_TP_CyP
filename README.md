# Zuju - Trabajo Práctico de Compiladores

Este repositorio contiene la implementación del Trabajo Práctico de la materia Conceptos y Paradigmas de Lenguaje de programacion, centrado en el desarrollo de un analizador léxico y sintáctico utilizando ANTLR.

## Integrantes del Grupo

* **Diez Juan Martin** - [JuanmarDiez](https://github.com/JuanmarDiez)
* **Zurlo Santiago** - [SantiZurlo](https://github.com/SantiZurlo)

## Variante Asignada

* **Variante:** 2 "Bucle For"
* **Nombre del lenguaje:** Zuju

## Descripción del Lenguaje

Zuju es un lenguaje de programación con tipado estático diseñado para fines académicos. Soporta cuatro tipos de datos (Enteros, Reales, Cadenas, Booleanos), contiene comentarios en linea y en bloque (|- , -- --), puede realizar operaciones aritméticas básicas, de comparacion y logicas, contiene estructuras de control de flujo (if/else, for) y permite la impresion de datos por consola

## Decisiones de Diseño Tomadas

* **Herramienta de Parsing:** Se utilizó **ANTLR v4** para la generación automática del Lexer y Parser a partir de la gramática definida en `Zuju.g4`.
* **Análisis Semántico y Tabla de Símbolos** Se implementó una clase dedicada llamada SimboloVariable que almacena tanto el tipo de dato (`ent`, `real`, `cadena`, `bool`) como el valor en formato `Object`.
* **Validación semántica:**
  * **Uso de variables no declaradas:** El intérprete lanza un error si se intenta asignar o referenciar una variable que no existe en la tabla.
  * **Redeclaración de variables:** Se impide volver a declarar una variable con el mismo identificador en el mismo contexto.
  * **Incompatibilidad de tipos:** Al asignar o realizar operaciones, se comprueba mediante instanceof en Java que los tipos evaluados coincidan con el tipo estricto declarado.
  * **División por cero:** La clase Division intercepta si el operando derecho se evalúa en 0 o 0.0 emitiendo una excepción.
* **Inicialización opcional:** Al momento de declarar una variable, la asignación de un valor inicial es completamente opcional.

## Instrucciones de Compilación y Ejecución

### Requisitos Previos
* IDE Eclipse version 2019-12
* Java Development Kit (JDK) version 8
* Maven version 3
* ANTLR v4: *Pasos para la instalacion y ejecucion*: https://github.com/jpavlich/antlr4-tutorial/tree/master

### Compilación

1. Clonar el repositorio:
   ```bash
   git clone [https://github.com/JuanmarDiez/Zuju_TP_CyP.git](https://github.com/JuanmarDiez/Zuju_TP_CyP.git)
   cd Zuju_TP_CyP
   ```
## Ejemplos de uso
### Ejemplo 1
   ```bash
   ent x = 10;
   ent y = 20;
   |- resultado:30
   ```

### Ejemplo 2
  ```bash
   ent x = "hola";
   |- resultado: Error semántico: El tipo de dato que se intenta guardar en x no es soportado por la variable
  ```
