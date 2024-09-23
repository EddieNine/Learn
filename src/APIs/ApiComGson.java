package APIs;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.GregorianCalendar;
import com.google.gson.Gson;

class Filme {
    String title;
    String release_date;
}

public class ApiComGson {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.themoviedb.org/3/movie/550?api_key=YOUR_API_KEY"))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Usando o Gson para converter o JSON em um objeto Filme
        Gson gson = new Gson();
        Filme filme = gson.fromJson(response.body(), Filme.class);

        System.out.println("Título: " + filme.title);
        System.out.println("Data de Lançamento: " + filme.release_date);
    }
}
