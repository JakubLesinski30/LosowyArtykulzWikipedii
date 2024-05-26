package losowy.artykul.wikipedia;

import java.util.Map;

public class Artykul {
    private String tytul;
    private String opis;
    private Map<String, Map<String, String>> adresyTresci;
    private String obrazek;

    // Gettery i settery

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Map<String, Map<String, String>> getAdresyTresci() {
        return adresyTresci;
    }

    public void setAdresyTresci(Map<String, Map<String, String>> adresyTresci) {
        this.adresyTresci = adresyTresci;
    }

    public String getObrazek() {
        return obrazek;
    }

    public void setObrazek(String obrazek) {
        this.obrazek = obrazek;
    }
}