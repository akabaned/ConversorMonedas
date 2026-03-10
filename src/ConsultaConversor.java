import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaConversor {

    public String buscarMoneda(String base) {

        String apiKey = "43dbfb8d9e31617f9b12f452";
        String direccion = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + base;

        try {

            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return response.body();

        } catch (Exception e) {
            throw new RuntimeException("No se pudo obtener la tasa de cambio.");
        }
    }
}
