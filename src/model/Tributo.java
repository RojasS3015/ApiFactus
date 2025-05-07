package model;

/**
 * Modelo que representa un tributo según la respuesta JSON de Factus.
 */
public class Tributo {
    private Long id;            // ID del tributo
    private String code;        // Código como "01", "02", etc.
    private String name;        // Nombre como "IVA"
    private String description; // Descripción larga

    // Getters y Setters
}

/*Basado en la documentación, un producto tiene estos campos:

json
Copiar
Editar
{
  "id": 1,
  "code": "01",
  "name": "IVA",
  "description": "Impuesto sobre la Ventas"
} */