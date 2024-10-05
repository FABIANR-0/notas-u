# Trabajo Independiente - Android App

Esta aplicación móvil está diseñada para ayudar a los estudiantes universitarios a calcular las horas de trabajo independiente que necesitan dedicar a una materia, basándose en el número de créditos y las horas teóricas y prácticas asignadas. Los cálculos se realizan de acuerdo con los lineamientos del Ministerio de Educación Nacional.

## Descripción del Proyecto

### Cálculos:

- **Crédito académico:** 1 crédito = 48 horas por semestre.
- **Horas teóricas (HT):** Horas presenciales orientadas de forma teórica.
- **Horas prácticas (HP):** Horas presenciales orientadas de forma práctica.
- **Trabajo Independiente (TI):** Tiempo que el estudiante debe dedicar fuera de las horas presenciales cada semana.

### Fórmulas:

- **Horas totales por crédito** = Número de créditos * 48
- **Horas presenciales totales** = (HT + HP) * Semanas del semestre
- **Trabajo independiente semanal** = (Horas totales por crédito - Horas presenciales totales) / Semanas del semestre

### Ejemplo:

Para una asignatura de 3 créditos con 2 horas teóricas y 2 horas prácticas a la semana, el cálculo sería el siguiente:

- **Horas por créditos:** 3 * 48 = 144 horas totales
- **Horas presenciales:** (2 + 2) * 16 semanas = 64 horas
- **Trabajo independiente semanal:** (144 - 64) / 16 semanas = 5 horas/semana

## Funcionalidades

- Entrada de créditos académicos, horas teóricas y horas prácticas.
- Cálculo automático de las horas de trabajo independiente.
- Interfaz intuitiva y fácil de usar para estudiantes universitarios.

## Requisitos del Sistema

- Android 5.0 (Lollipop) o superior.
- Conexión a internet no es necesaria.

## Tecnologías Usadas

- **Lenguaje:** [Kotlin](https://kotlinlang.org/)
- **IDE:** Android Studio

## Instrucciones de Ejecución

### Paso 1: Clonar el Repositorio

```bash
git clone https://github.com/FABIANR-0/notas-u
```
### Paso 2: Abrir el Proyecto en Android Studio

1. Inicia Android Studio.
2. Haz clic en `Open` y selecciona la carpeta del proyecto que has clonado.
3. Asegúrate de tener instalado el SDK de Android y la configuración de Kotlin.

### Paso 3: Ejecutar el Proyecto

1. Conecta un dispositivo Android físico o utiliza un emulador.
2. Haz clic en `Run` o presiona `Shift + F10` para compilar y ejecutar la aplicación.

### Paso 4: Interactuar con la Aplicación

1. Introduce los valores para nombre de materia, los créditos académicos, las horas teóricas y las horas prácticas.
2. Haz clic en el botón de `Calcular`.
3. La aplicación te mostrará el tiempo que debes dedicar a tu trabajo independiente cada semana.

