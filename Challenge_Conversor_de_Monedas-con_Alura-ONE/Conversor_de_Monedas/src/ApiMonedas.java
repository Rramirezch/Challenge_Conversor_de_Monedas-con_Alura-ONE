import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiMonedas {
    public DatosConversion buscarDatos(String codigoMonedaBase, String codigoMonedaDestino) {
        //creo variables URIURI.create("http://foo.com/", con la api a usar
        //String codigo_moneda_base = codigo1;
        //String codigo_moneda_destino = codigo2;
        String apiKey = System.getenv("API_KEY");

        String direccion = ("https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + codigoMonedaBase + "/" + codigoMonedaDestino);
        //busco en la documentacion el metodo httpRequest para el manejo de la api
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                //debo adaptar .uri, con la api que voy a usar
                .uri(URI.create(direccion))
                .build();

        try {
            HttpResponse<String> response = ((HttpClient) client)
                    //el .send queda en rojo, more actions, y selecciono try-catch
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), DatosConversion.class);
        } catch (Exception e) {
            //al final, solo dejamos exception
            throw new RuntimeException("Datos  no encontrados");
            //dejo un solo catch con los dos exception
        }

    }
}
