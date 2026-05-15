# STOCK-JAVA

# ÍNDICE
<ul>
<li><a href='#introduccion'>Introducción</a></li>
<li><a href='#manual'>Manual</a></li>
<li><a href='#metodologia'>Metodología</a></li>
<li><a href='#diseno'>Diseño</a></li>
</ul>

## <div id='introduccion'>Introducción</div>

Adrián González González - <a href='https://github.com/Adriceka'>@Adriceka</a>

Este proyecto consiste en desarrollar un sistema de gestión para un mercado de zapatillas deportivas. El sistema modela un `Item` tipo `Sneaker` con `Bid`, `Ask` y `Sale`, y permite aplicar criterios para filtrar y seleccionar:
- pujas (`Bids`)
- ofertas de venta (`Asks`)
- última venta (`LastSale`)
- máximos y mínimos
- filtros por talla (`Size`)
- combinaciones de criterios (`AndCriteria`, `Min`, `Max`)

## <div id='manual'>Manual</div>

#### Instalación

Asegúrate de tener instalados **Java** y **Maven** en tu sistema.  
Descarga el proyecto desde GitHub y accede a la carpeta del repositorio:

```bash
git clone https://github.com/Adriceka/Stock-java.git
cd Stock-java
```

#### Construcción del Proyecto

Este proyecto utiliza **Maven** como gestor de dependencias y herramienta de construcción. Comprueba tu instalación con:

```bash
mvn --version
```

Para compilar el proyecto:

```bash
mvn clean compile
```

#### Ejecutar las Pruebas

Para ejecutar todos los tests unitarios:

```bash
mvn test
```

Para generar un informe de pruebas con Surefire:

```bash
mvn surefire-report:report
```

## <div id='metodologia'>Metodología</div>

Para abordar este kata se siguió un enfoque orientado a pruebas y a diseño incremental.

La metodología se basa en un flujo similar a:
1. Definir requisitos del dominio:
   - Modelar `Sneaker` como un ítem con ofertas y ventas.
   - Representar `Bid`, `Ask` y `Sale` como tipos de `Offer`.
   - Permitir consultas de precio máximo, mínimo y última venta.
   - Aplicar filtros por talla y combinar criterios.
2. Desarrollar la funcionalidad junto con casos de prueba:
   - Validar que `Bids` devuelve la puja máxima.
   - Validar que `Asks` devuelve la oferta más barata.
   - Validar que `LastSale` devuelve la última venta.
   - Validar el filtrado por talla y la intersección de criterios.
3. Ejecutar los tests y ajustar la implementación hasta que todos pasen:
   - `mvn test` sirve como verificación continua de la lógica.
   - Se corrigen los criterios cuando los resultados no se ajustan a los casos esperados.

## <div id='diseno'>Diseño y Principios SOLID</div>

En este kata se han aplicado principios SOLID para mantener el código modular y fácil de extender:

- **SRP (Single Responsibility Principle)**  
  Cada clase tiene una responsabilidad clara:
  - `Sneaker` gestiona el producto y sus ofertas.
  - `Bid`, `Ask` y `Sale` representan distintos tipos de `Offer`.
  - `Criteria` y sus implementaciones procesan filtros sobre un `Item`.
  - `Stockx` actúa como clase de demostración/ejecución.

- **OCP (Open/Closed Principle)**  
  Las clases de criterios (`Asks`, `Bids`, `Size`, `Min`, `Max`, `AndCriteria`) están abiertas a extensión y cerradas a modificación. Se pueden añadir nuevas reglas sin cambiar la lógica existente.

- **LSP (Liskov Substitution Principle)**  
  `Sneaker` implementa `Item`, de modo que cualquier clase que dependa de `Item` puede trabajar con `Sneaker` sin problemas.

- **ISP (Interface Segregation Principle)**  
  La interfaz `Item` expone solo los métodos necesarios para el dominio: acceso a ofertas, bid, ask, sale y su gestión.

- **DIP (Dependency Inversion Principle)**  
  El código depende de abstracciones (`Criteria`, `Item`, `Offer`), no de clases concretas. Esto facilita testear y cambiar implementaciones.

---

## Estructura del Proyecto

```
src/
├── main/java/edu/teamrocket/stock/
│   ├── Stockx.java
│   ├── criteria/
│   │   ├── AndCriteria.java
│   │   ├── Asks.java
│   │   ├── Bids.java
│   │   ├── Criteria.java
│   │   ├── LastSale.java
│   │   ├── Max.java
│   │   ├── MaxBid.java
│   │   ├── Min.java
│   │   ├── MinAsk.java
│   │   ├── Sales.java
│   │   └── Size.java
│   └── item/
│       ├── Ask.java
│       ├── Bid.java
│       ├── Item.java
│       ├── Offer.java
│       ├── Sale.java
│       └── Sneaker.java
└── test/java/edu/teamrocket/stock/
    ├── criteria/
    └── item/
```
