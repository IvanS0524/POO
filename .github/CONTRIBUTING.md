# Contribuir al proyecto — Guía para POO en Java

Este documento recoge las normas y el flujo de trabajo que seguimos cuando trabajamos con programación orientada a objetos en Java.

## Propósito del espacio
Este espacio centraliza prácticas y decisiones para proyectos Java orientados a objetos: patrones, diseño de clases, pruebas y convenciones para que el equipo mantenga coherencia.

## Flujo de trabajo (git)
- Ramas: feature/<ticket>-breve-descripción, fix/<ticket>-breve, hotfix/<versión>.
- Base: trabaja sobre `develop` (o la rama principal acordada).
- Pull request: una PR por cambio lógico. Referenciar issue: `Fixes #NN` si aplica.
- Rebase/merge: mantener el historial limpio — preferimos rebase interactivo para PRs largas.

## Mensajes de commit
Formato sugerido:
- Tipo: feat, fix, refactor, docs, test, chore
- Mensaje: "tipo(scope): breve descripción"
Ejemplo: `feat(model): añadir clase Person con builder`

## Revisión de código (PR checklist)
- [ ] ¿Se entiende la responsabilidad de cada clase?
- [ ] ¿Se ajusta a SOLID y principios de POO?
- [ ] ¿Hay tests unitarios que cubran comportamiento nuevo o modificado?
- [ ] ¿Los nombres son claros (clases, métodos, variables)?
- [ ] ¿La API pública mantiene compatibilidad o está documentado el breaking change?
- [ ] ¿Build/CI pasan localmente y en GitHub Actions?

## Estructura recomendada del proyecto
- src/main/java/... (código)
- src/test/java/... (tests unitarios)
- docs/ (diagramas, decisiones de diseño)
- examples/ (ejemplos de uso, snippets)

## Testing
- Usar JUnit 5.
- Cobertura mínima objetivo: definir por módulo (ej. 70%).
- Tests: rápidos, deterministas y aislados. Mockear dependencias externas.

## Herramientas
- Formateador: google-java-format o Checkstyle con reglas compartidas.
- Build: Maven o Gradle (documentar comandos).
- CI: GitHub Actions para build, test y análisis estático.

## Decisiones de diseño (registro)
Mantener un archivo `docs/decisions.md` o usar ADRs para decisiones arquitectónicas importantes.

## Soporte y dudas
- Abre un issue para debates de diseño.
- Para cambios de estilo o formato global, propone antes un RFC o issue de discusión.

Gracias por seguir estas pautas — ayudan a mantener código de calidad y procesos predecibles.
