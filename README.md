
# 🧾 Proyecto API Spring Boot - "Hola, Factus"

## 🚀 ¿Qué es este proyecto?

Este es mi **primer proyecto usando Spring Boot** en Java. Aquí construyo una **API REST básica** que responde a peticiones HTTP. El objetivo es aprender paso a paso cómo funciona Spring Boot, cómo se estructuran los proyectos, y cómo crear servicios que puedan escalarse luego a algo más grande (como facturación electrónica).

---

## 📦 Estructura del Proyecto

```
api/
├── src/
│   └── main/
│       └── java/
│           └── com.factus.api/
│               ├── ApiApplication.java
│               └── controller/
│                   └── FacturaController.java
```

---

## 🧠 ¿Qué aprendí en este paso?

### 1. ✅ ¿Qué es Spring Boot?

Spring Boot es un **framework para crear aplicaciones en Java de forma rápida**. Hace fácil crear APIs, manejar rutas, conexiones a bases de datos y más. Es como un "motor automático" para proyectos web en Java.

---

### 2. 🔥 ¿Qué hace `ApiApplication.java`?

```java
@SpringBootApplication
public class ApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }
}
```

- Esta clase es el **punto de inicio** del proyecto.
- Usa la anotación `@SpringBootApplication` para que Spring sepa que debe iniciar.
- Al ejecutarse, **levanta un servidor web local** (Tomcat) en el puerto `8080`.

---

### 3. 🔁 ¿Qué hace `FacturaController.java`?

```java
@RestController
public class FacturaController {

    @GetMapping("/hola")
    public String hola() {
        return "¡Hola, Factus!";
    }
}
```

- Es un **controlador REST**.
- La anotación `@RestController` le dice a Spring que esta clase va a **responder a URLs**.
- `@GetMapping("/hola")` significa que cuando el navegador visite `http://localhost:8080/hola`, se ejecutará la función `hola()` y devolverá un texto.

---

## 🌐 ¿Cómo lo probé?

### Paso 1. Ejecuté el proyecto:
```bash
mvn spring-boot:run
```

O desde el IDE (Eclipse, IntelliJ o Spring Tool Suite), hice clic en "Run".

### Paso 2. Abrí el navegador:
```text
http://localhost:8080/hola
```

### Resultado:
> ¡Hola, Factus!

✅ ¡Funcionó! Mi API está **escuchando** en el puerto 8080 y responde a la ruta `/hola`.

---

## 🎯 ¿Qué logré hasta ahora?

| Ítem                      | Estado |
|---------------------------|--------|
| Crear un proyecto Spring  | ✅     |
| Escribir el `main` de la app | ✅  |
| Crear un controlador REST | ✅     |
| Levantar un servidor local | ✅    |
| Probar mi primer endpoint  | ✅    |

---

## 🧒 Explicación para un niño curioso

> "Imagina que hiciste una casa con una campanita. Cuando alguien toca esa campana (entra a `/hola`), tú le respondes desde dentro: '¡Hola, Factus!'. Eso es lo que hace este proyecto: ¡saludar a quien visita tu API!"

---

## 🛠️ Próximos pasos

- [ ] Crear más endpoints (`/factura`, `/cliente`, etc.).
- [ ] Conectar con una base de datos (MySQL o PostgreSQL).
- [ ] Aprender sobre `@Service`, `@Repository` y lógica de negocio.
- [ ] Conectar esta API con la plataforma de Factus (API externa).
- [ ] Agregar seguridad (autenticación con tokens).

---

## ✍️ Autor

**Sebastián**, autodidacta en camino a ser ingeniero de software.

---
