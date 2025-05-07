
import java.util.List;

/**
 * Clase que mapea la respuesta completa del endpoint:
 * {
 *   "status": "OK",
 *   "message": "Solicitud exitosa",
 *   "data": [ ... ]
 * }
 */
public class TributoResponse {
    private String status;
    private String message;
    private List<Tributo> data;

    // Getters y setters
}
