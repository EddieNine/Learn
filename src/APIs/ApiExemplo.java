package APIs;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiExemplo {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Criando um HttpClient
        HttpClient client = HttpClient.newHttpClient();

        // Criando uma requisição para a API
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.themoviedb.org/3/movie/550?api_key=YOUR_API_KEY"))
                .build();

        // Enviando a requisição e recebendo a resposta
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Imprimindo o corpo da resposta
        System.out.println(response.body());
    }
}
