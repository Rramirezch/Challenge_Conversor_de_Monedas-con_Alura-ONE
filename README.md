Conversor de Monedas en Java 💰

para aplicar conocimientos adquiridos en el curso (Especializacion en java de Alura-ONE)

Un conversor de monedas simple desarrollado en Java que utiliza tasas de cambio en tiempo real a través de la API externa de Exchange Rate API.

📋 Descripción

Este proyecto permite a los usuarios convertir cantidades entre diferentes monedas alrededor del mundo. La aplicación muestra una lista de países con sus códigos de moneda, solicita los datos necesarios al usuario y realiza la conversión utilizando tasas actualizadas.

✨ Características

Lista de países y códigos de moneda

Conversión en tiempo real usando tasas actualizadas

Interfaz de línea de comandos simple e intuitiva

Arquitectura modular y mantenible

🏗️ Estructura del Proyecto

conversor-monedas/

├── src/

│ ├── Principal.java # Clase principal con la lógica de interfaz de usuario

│ ├── ConsultaAPI.java # Clase para manejar las consultas a la API

│ └── ConversionRecord.java # Record para almacenar los datos de conversión

└── README.md

🔧 Funcionamiento

Inicio: La aplicación muestra una lista de países con sus códigos de moneda

Entrada de datos:

\- Escriba el codigo del pais de la moneda de origen

\- Escriba el codigo del pais de la moneda destino

\- Escriba el monto de la moneda origen

Procesamiento:

Consulta a la API para obtener la tasa de conversión

Cálculo del monto convertido

Resultado: Muestra el monto convertido al usuario

📦 Dependencias

Java 17 o superior

Conexión a internet para consultar la API

Librerías para manejo de JSON (Gson.jar de Google)

Se usó el editor de código(IDE) Intellij IDEA, para el procesamiento del codigo

💻 Ejemplo de uso

ESTE ES EL PROGRAMA PARA REALIZAR LA CONVERSION ENTRE ALGUNAS MONEDAS A VALOR PRESENTE

AQUI ESTAN LOS PAISES CON SU CODIGO DE MONEDA

El codigo es el que se encuentra al frente de cada Pais

Argentina: ARS - Bolivia: BOB - Brasil: BRL - Suiza: CHF - Chile: CLP - China: CNY

Colombia: COP - Costa Rica: CRC - Cuba: COPA - Unión Europea: EUR - Reino Unido: GBP

Hong Kong: HKD - India: INR - Japón: JPY . México: MXN - Rusia: RUB - Arabia Saudita: SAR

Estados Unidos: USD - Uruguay: UYU - Fondo Monetario Internacional: XDR - Venezuela: VES

Escriba el codigo del pais de la moneda de origen

Cop

Escriba el codigo del pais de la moneda destino

usd

DatosConversion\[base\_code=COP, target\_code=USD, conversion\_rate=2.6977E-4\]

Escriba el monto de la moneda origen

12000

El valor de 12000.0 COP en USD es : 3.24

Process finished with exit code 0
