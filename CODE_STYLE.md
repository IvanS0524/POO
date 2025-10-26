# Estilo de código y buenas prácticas — POO en Java

Resumen de convenciones para mantener consistencia.

## Nombres
- Paquetes: en minúsculas, ej: `com.miempresa.proyecto.modelo`
- Clases: PascalCase, sustantivos (ej: `Person`, `OrderService`)
- Interfaces: PascalCase (o terminar en `able` si aplica), ej: `Repository`, `Serializable`
- Métodos: camelCase y verbos para acciones (ej: `calculateTotal`)
- Constantes: UPPER_SNAKE_CASE

## Principios POO
- Clases con una sola responsabilidad.
- Encapsulación: preferir campos privados y acceso mediante métodos.
- Preferir composición sobre herencia.
- Interfaces para contratos, no para compartir implementación.

## Inmutabilidad
- Cuando sea posible, crear objetos inmutables (final fields, sin setters).
- Usar builders para objetos complejos.

## Nulls
- Evitar nulls en APIs públicas: usar Optional cuando tenga sentido.
- Documentar si un parámetro puede ser null.

## Excepciones
- Lanzar excepciones específicas y documentarlas (Javadoc `@throws`).
- No usar excepciones para control de flujo.

## Logging
- Usar SLF4J (logger por clase): `private static final Logger logger = LoggerFactory.getLogger(MyClass.class);`
- No loggear datos sensibles.

## Javadoc
- Documentar la API pública: clases, interfaces y métodos públicos.
- Usar Javadoc para explicar contratos (nullability, efectos secundarios).

## Equals / HashCode / ToString
- Implementar equals y hashCode consistentemente para entidades que serán comparadas o usadas en colecciones.
- Preferir `Objects.equals` y `Objects.hash`.

## Formato
- Seguir el formateador acordado (google-java-format o estilo del equipo).
- Evitar líneas > 120 caracteres.

## Tests
- Nombrado: `ClassNameTest` o `ClassNameShould`
- AAA (Arrange, Act, Assert)
- Un test por comportamiento

## Revisiones
- En PRs, incluir explicación de diseño y trade-offs.
