import java.util.Scanner;
import com.google.gson.Gson;

public class Principal {

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        ConsultaConversor consulta = new ConsultaConversor();
        Gson gson = new Gson();

        int opcion = 0;

        while (opcion != 7) {

            Conversor.exibirMenu();
            opcion = lectura.nextInt();

            if (opcion == 7) {
                System.out.println("Programa finalizado.");
                break;
            }

            System.out.println("Ingrese el monto a convertir:");
            double monto = lectura.nextDouble();

            String json = consulta.buscarMoneda("USD");
            Moneda moneda = gson.fromJson(json, Moneda.class);

            double resultado = 0;

            switch (opcion) {

                case 1:
                    resultado = monto * moneda.conversion_rates.get("ARS");
                    System.out.println("Resultado: " + resultado + " ARS");
                    break;

                case 2:
                    json = consulta.buscarMoneda("ARS");
                    moneda = gson.fromJson(json, Moneda.class);
                    resultado = monto * moneda.conversion_rates.get("USD");
                    System.out.println("Resultado: " + resultado + " USD");
                    break;

                case 3:
                    resultado = monto * moneda.conversion_rates.get("BRL");
                    System.out.println("Resultado: " + resultado + " BRL");
                    break;

                case 4:
                    json = consulta.buscarMoneda("BRL");
                    moneda = gson.fromJson(json, Moneda.class);
                    resultado = monto * moneda.conversion_rates.get("USD");
                    System.out.println("Resultado: " + resultado + " USD");
                    break;

                case 5:
                    resultado = monto * moneda.conversion_rates.get("COP");
                    System.out.println("Resultado: " + resultado + " COP");
                    break;

                case 6:
                    json = consulta.buscarMoneda("COP");
                    moneda = gson.fromJson(json, Moneda.class);
                    resultado = monto * moneda.conversion_rates.get("USD");
                    System.out.println("Resultado: " + resultado + " USD");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        }

    }
}
