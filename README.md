# Conversor de Monedas con Java

Este es un conversor de monedas desarrollado en Java que permite realizar conversiones entre varias monedas utilizando una API en tiempo real. El objetivo es ayudar a los usuarios a conocer el valor equivalente de una moneda en otra en el contexto de un mundo globalizado.

## Características
- Conversión de monedas en tiempo real (por ejemplo, Dólar, Peso Argentino, Real Brasileño).
- Interfaz de consola interactiva.
- Utiliza la API de Exchange Rate para obtener tasas de cambio actualizadas.
- Código modular y fácil de mantener.

## Requisitos Previos
- Java Development Kit (JDK) 11 o superior.
- IntelliJ IDEA u otro IDE de tu preferencia.
- Cuenta en https://www.exchangerate-api.com/ para obtener la API Key.
- Git 

## Instalación
1. Clona el repositorio desde GitHub:
   ```
   git clone https://github.com/trololingo/ConversorMonedas.git
   ```
2. Abre el proyecto en IntelliJ IDEA.
3. Configura tu entorno de Java.
4. Obtén una API Key de https://www.exchangerate-api.com/  y reemplázala en el archivo `ConversorMonedas.java`:
   ```java
   String apiKey = 28f1be06b7d56b29bf2993c7 ;  //Nota: Reemplaza tu apiKey y ponga la suya, cuidado si pone la mia porque tendremos problemas
   ```

## Uso
1. Ejecuta el proyecto desde IntelliJ IDEA.
2. Al iniciar, el programa mostrará un menú con varias opciones de conversión.
3. Ingresa la opción deseada y la cantidad que deseas convertir.
4. El programa mostrará el valor equivalente de la moneda.
nota: solo hice pocas moneras
Ejemplo:
```
Elige la opción de conversión:
1. Dólar a Peso Argentino
2. Peso Argentino a Dólar
3. Salir

Opción: 1
Ingresa la cantidad en Dólares: 100
100 Dólares equivalen a 20,293.75 Pesos Argentinos.
```

## Contribución
Si deseas contribuir a este proyecto:
1. Haz un fork del repositorio.
2. Crea una rama para tu nueva funcionalidad (`git checkout -b feature/nueva-funcionalidad`).
3. Haz commit de tus cambios (`git commit -m 'Añadir nueva funcionalidad'`).
4. Haz push a la rama (`git push origin feature/nueva-funcionalidad`).
5. Abre un Pull Request.

## Licencia
Este proyecto está licenciado bajo la Licencia MIT. Para más detalles, consulta el archivo `LICENSE`.

## Contacto
Creado por Trololingo https://github.com/trololingo - Si tienes preguntas, siéntete libre de contactarme.
no puedo decir mi nombre real
