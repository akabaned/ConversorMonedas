# 💱 Conversor de Monedas en Java

Aplicación de consola desarrollada en **Java** que permite convertir monedas en tiempo real utilizando tasas de cambio obtenidas desde la API de ExchangeRate.

Este proyecto fue desarrollado como parte del challenge de **Java Backend** de la plataforma **Alura**.

---

## 📌 Funcionalidades

El programa permite convertir entre las siguientes monedas:

* USD ➜ Peso Argentino (ARS)
* ARS ➜ USD
* USD ➜ Real Brasileño (BRL)
* BRL ➜ USD
* USD ➜ Peso Colombiano (COP)
* COP ➜ USD

El usuario puede seleccionar la conversión desde un **menú interactivo en consola** e ingresar el monto a convertir.

---

## 🧰 Tecnologías utilizadas

* **Java 11+**
* **Gson** – para procesar JSON
* **ExchangeRate API** – para obtener tasas de cambio en tiempo real
* **HTTP Client (Java)** – para realizar peticiones HTTP

---

## 🏗️ Estructura del proyecto

src
│
├── Principal.java        # Clase principal que ejecuta el programa
├── Conversor.java        # Contiene el menú del sistema
├── ConsultaMoneda.java   # Realiza la consulta a la API de ExchangeRate
└── Moneda.java           # Modelo que representa la respuesta JSON

---

## ⚙️ Instalación y ejecución

### 1️⃣ Clonar el repositorio

```bash
git clone https://github.com/akabaned/ConversorMonedas/java.git
```

### 2️⃣ Obtener una API Key

Regístrate en:

https://www.exchangerate-api.com/

Luego reemplaza en `ConsultaMoneda.java`:

```java
String apiKey = "TU_API_KEY";
```

### 3️⃣ Ejecutar el proyecto

Compila y ejecuta la clase principal:

```bash
javac Principal.java
java Principal
```

---

## 🖥️ Ejemplo de uso

```
***********************************************************
Sea bienvenido/a al Conversor de Moneda =)

1) Dólar ==> Peso argentino
2) Peso argentino ==> Dólar
3) Dólar ==> Real brasileño
4) Real brasileño ==> Dólar
5) Dólar ==> Peso colombiano
6) Peso colombiano ==> Dólar
7) Salir

Elija una opción válida:
***********************************************************
```

Ejemplo de conversión:

```
Ingrese el monto a convertir:
10

Resultado: 8600 ARS
```

---



---

## 👨‍💻 Autor

Proyecto desarrollado por **Jairo Alvarez** como parte del aprendizaje en **Java Backend**.

---
