package losowy.artykul.wikipedia;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Map;

@Service
public class Serwis {
    private static final String Adres_Losowego_Artykulu = "https://pl.wikipedia.org/api/rest_v1/page/random/summary";

    public ResponseEntity<Map> getLosowyArtykul() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Map> odpowiedz = restTemplate.getForEntity(Adres_Losowego_Artykulu, Map.class);
        return odpowiedz;
    }
}