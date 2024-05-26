package losowy.artykul.wikipedia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class Kontroler {
    @Autowired
    private Serwis wikipediaSerwis;

    @GetMapping("/")
    public String index(Model model) {
        ResponseEntity<Map> responseEntity = wikipediaSerwis.getLosowyArtykul();
        Map<String, Object> body = responseEntity.getBody();

        String tytul = (String) body.get("title");
        String opis = (String) body.get("extract");
        Map<String, Map<String, String>> adresyTresci = (Map<String, Map<String, String>>) body.get("content_urls");
        String adresStrony = adresyTresci.get("desktop").get("page");
        String obrazek = body.get("thumbnail") != null ? (String) ((Map<String, Object>) body.get("thumbnail")).get("source") : null;

        model.addAttribute("tytul", tytul);
        model.addAttribute("opis", opis);
        model.addAttribute("adresStrony", adresStrony);
        model.addAttribute("obrazek", obrazek);

        return "index";
    }
}