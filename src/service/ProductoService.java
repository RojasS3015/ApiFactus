package service;

import model.Tributo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductoService {

    // Se obtiene el token desde application.properties para no ponerlo quemado
    @Value("${factus.api.token}")
    private String token;

    private final String FACTUS_URL = "https://api-sandbox.factus.com.co/v1/tributes/products";

    /**
     * Llama a la API de Factus y devuelve una lista de tributos.
     */
    public List<Tributo> obtenerTributos() {
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setBearerAuth(token); // Authorization: Bearer <token>

        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<TributoResponse> response = restTemplate.exchange(
            FACTUS_URL,
            HttpMethod.GET,
            entity,
            TributoResponse.class
        );

        // Extrae la lista de tributos desde "data"
        return response.getBody().getData();
    }
}
