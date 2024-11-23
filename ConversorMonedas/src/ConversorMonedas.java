import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class ConversorMonedas {
    private static final String API_KEY = "28f1be06b7d56b29bf2993c7";
    private static final String API_URL = "https://api.exchangerate-api.com/v4/latest/";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("\u00a1Hola, bienvenido al Conversor de Monedas de trololingo JM!");
        while (continuar) {
            System.out.println("\nSelecciona una opción para convertir:");
            System.out.println("1. Dólares a Pesos Argentinos");
            System.out.println("2. Reales Brasileños a Dólares");
            System.out.println("3. Salir");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    convertirMoneda("USD", "ARS", scanner);
                    break;
                case 2:
                    convertirMoneda("BRL", "USD", scanner);
                    break;
                case 3:
                    continuar = false;
                    System.out.println("Gracias por usar el conversor. ¡Adios!");
                    break;
                default:
                    System.out.println("Opción no válida, intenta nuevamente.");
                    break;
            }
        }
        scanner.close();
    }

    private static void convertirMoneda(String fromCurrency, String toCurrency, Scanner scanner) {
        try {
            System.out.print("Ingresa el valor que deseas convertir: ");
            double cantidad = scanner.nextDouble();

            URL url = new URL(API_URL + fromCurrency);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("apikey", API_KEY);

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();

            String json = content.toString();
            double tasaConversion = obtenerTasaConversion(json, toCurrency);
            double resultado = cantidad * tasaConversion;

            System.out.printf("El valor de %.2f %s corresponde a %.2f %s\n", cantidad, fromCurrency, resultado, toCurrency);
        } catch (Exception e) {
            System.out.println("Ocurrió un error al intentar convertir las monedas. Por favor, intenta de nuevo.");
            e.printStackTrace();
        }
    }

    private static double obtenerTasaConversion(String json, String toCurrency) {
        String searchString = "\"" + toCurrency + "\":";
        int startIndex = json.indexOf(searchString) + searchString.length();
        int endIndex = json.indexOf(",", startIndex);
        if (endIndex == -1) {
            endIndex = json.indexOf("}", startIndex);
        }
        return Double.parseDouble(json.substring(startIndex, endIndex));
    }
}
