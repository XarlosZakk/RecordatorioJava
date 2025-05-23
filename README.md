# 📘 RECORDATORIO DE JAVA

<div align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" alt="Java Badge"/>
  <h3>Una guía de referencia rápida para programadores de Java</h3>
  <p align="center"><i>Carl's{Dev}</i></p>
</div>

---

## 📋 Tabla de Contenidos

- [Tipos de Datos](#tipos-de-datos)
- [Estructuras de Control](#estructuras-de-control)
- [Programación Orientada a Objetos](#programación-orientada-a-objetos)
- [Colecciones](#colecciones)
- [Excepciones](#excepciones)
- [Interfaces y Clases Abstractas](#interfaces-y-clases-abstractas)
- [Genéricos](#genéricos)
- [Lambdas y Streams](#lambdas-y-streams)

---

## 🔢 Tipos de Datos

### Primitivos
```java
// Números enteros
byte numeroByte = 127;            // 8 bits, -128 a 127
short numeroShort = 32767;        // 16 bits, -32,768 a 32,767
int numeroInt = 2147483647;       // 32 bits, -2^31 a 2^31-1
long numeroLong = 9223372036854775807L; // 64 bits, -2^63 a 2^63-1

// Números con decimales
float numeroFloat = 3.14159f;     // 32 bits, precisión de 6-7 dígitos
double numeroDouble = 3.141592653589793; // 64 bits, precisión de 15-16 dígitos

// Otros primitivos
char caracter = 'A';              // 16 bits, carácter Unicode
boolean booleano = true;          // true o false
```

### Wrappers (Clases Envoltorio)
```java
Integer numObj = Integer.valueOf(100);
Double decimalObj = Double.valueOf(3.14);
Boolean boolObj = Boolean.TRUE;
Character charObj = Character.valueOf('A');

// Autoboxing y unboxing (automáticos desde Java 5)
Integer num = 100;  // autoboxing
int primitivo = num;  // unboxing
```

### Cadenas
```java
String mensaje = "Hola Mundo";
String otraMensaje = new String("Hola");

// Operaciones comunes
String mayusculas = mensaje.toUpperCase();  // "HOLA MUNDO"
String subcadena = mensaje.substring(0, 4);  // "Hola"
boolean contiene = mensaje.contains("Mundo");  // true
String reemplazado = mensaje.replace("Mundo", "Java");  // "Hola Java"
String[] palabras = mensaje.split(" ");  // ["Hola", "Mundo"]
```

---

## 🔄 Estructuras de Control

### Condicionales
```java
// if-else
if (condicion) {
    // código si es verdadero
} else if (otraCondicion) {
    // código si es verdadero
} else {
    // código si todo lo anterior es falso
}

// switch (tradicional)
switch (variable) {
    case valor1:
        // código
        break;
    case valor2:
        // código
        break;
    default:
        // código por defecto
}

// switch expressions (Java 14+)
String resultado = switch (diaSemana) {
    case 1, 2, 3, 4, 5 -> "Día laborable";
    case 6, 7 -> "Fin de semana";
    default -> "Día inválido";
};
```

### Bucles
```java
// for
for (int i = 0; i < 10; i++) {
    // código a repetir
}

// while
while (condicion) {
    // código a repetir mientras la condición sea verdadera
}

// do-while
do {
    // código a repetir al menos una vez
} while (condicion);

// for-each (para colecciones)
for (String elemento : listaDeStrings) {
    // procesar cada elemento
}
```

---

## 🧩 Programación Orientada a Objetos

### Clases y Objetos
```java
public class Persona {
    // Atributos
    private String nombre;
    private int edad;
    
    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    // Método
    public void saludar() {
        System.out.println("Hola, soy " + nombre);
    }
}

// Crear objeto
Persona persona = new Persona("Juan", 30);
persona.saludar();
```

### Herencia
```java
public class Empleado extends Persona {
    private String puesto;
    
    public Empleado(String nombre, int edad, String puesto) {
        super(nombre, edad);  // Llama al constructor de la clase padre
        this.puesto = puesto;
    }
    
    // Sobreescritura de método
    @Override
    public void saludar() {
        System.out.println("Hola, soy " + getNombre() + " y trabajo como " + puesto);
    }
}
```

### Modificadores de Acceso
- `public`: Accesible desde cualquier clase
- `protected`: Accesible desde la misma clase, subclases y paquete
- `default` (sin modificador): Accesible desde la misma clase y paquete
- `private`: Accesible solo desde la misma clase

---

## 📚 Colecciones

### List
```java
// ArrayList (acceso rápido por índice)
List<String> listaArray = new ArrayList<>();
listaArray.add("elemento");
listaArray.get(0);  // Acceso por índice
listaArray.remove(0);  // Eliminar por índice

// LinkedList (eficiente para inserciones/eliminaciones)
List<String> listaEnlazada = new LinkedList<>();
listaEnlazada.add("elemento");
listaEnlazada.addFirst("primero");  // Métodos específicos de LinkedList
listaEnlazada.addLast("último");
```

### Set
```java
// HashSet (rápido, sin orden garantizado)
Set<String> conjuntoHash = new HashSet<>();
conjuntoHash.add("elemento");  // No permite duplicados

// TreeSet (ordenado)
Set<String> conjuntoArbol = new TreeSet<>();
conjuntoArbol.add("b");
conjuntoArbol.add("a");  // Se almacenará en orden: a, b

// LinkedHashSet (mantiene orden de inserción)
Set<String> conjuntoEnlazado = new LinkedHashSet<>();
```

### Map
```java
// HashMap (clave-valor)
Map<String, Integer> mapaHash = new HashMap<>();
mapaHash.put("clave", 123);
int valor = mapaHash.get("clave");
mapaHash.containsKey("clave");  // true

// TreeMap (ordenado por claves)
Map<String, Integer> mapaArbol = new TreeMap<>();

// LinkedHashMap (mantiene orden de inserción)
Map<String, Integer> mapaEnlazado = new LinkedHashMap<>();
```

---

## ⚠️ Excepciones

### Try-Catch-Finally
```java
try {
    // Código que puede lanzar excepciones
    int resultado = 10 / 0;  // ArithmeticException
} catch (ArithmeticException e) {
    // Manejo de una excepción específica
    System.out.println("Error aritmético: " + e.getMessage());
} catch (Exception e) {
    // Captura cualquier otra excepción
    System.out.println("Error general: " + e.getMessage());
} finally {
    // Este bloque se ejecuta siempre
    System.out.println("Operación finalizada");
}
```

### Try-with-Resources
```java
// Cierra automáticamente recursos que implementan AutoCloseable
try (FileReader fr = new FileReader("archivo.txt");
     BufferedReader br = new BufferedReader(fr)) {
    String linea = br.readLine();
    // procesar archivo...
} catch (IOException e) {
    System.out.println("Error de lectura: " + e.getMessage());
}
```

### Lanzar Excepciones
```java
public void metodo() throws IOException {
    if (algunaCondicion) {
        throw new IOException("Mensaje de error");
    }
}
```

---

## 🔄 Interfaces y Clases Abstractas

### Interface
```java
public interface Vehiculo {
    // Constantes (implícitamente public static final)
    int VELOCIDAD_MAXIMA = 120;
    
    // Métodos abstractos (implícitamente public abstract)
    void acelerar(int incremento);
    void frenar(int decremento);
    
    // Método por defecto (Java 8+)
    default void bocina() {
        System.out.println("¡Beep!");
    }
    
    // Método estático (Java 8+)
    static boolean esVelocidadPermitida(int velocidad) {
        return velocidad <= VELOCIDAD_MAXIMA;
    }
}
```

### Clase Abstracta
```java
public abstract class VehiculoBase {
    // Atributos
    private int velocidad;
    
    // Constructor
    public VehiculoBase(int velocidadInicial) {
        this.velocidad = velocidadInicial;
    }
    
    // Métodos concretos
    public int getVelocidad() {
        return velocidad;
    }
    
    protected void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    // Método abstracto
    public abstract void conducir();
}
```

---

## 🧬 Genéricos

### Clases Genéricas
```java
public class Contenedor<T> {
    private T contenido;
    
    public Contenedor(T contenido) {
        this.contenido = contenido;
    }
    
    public T getContenido() {
        return contenido;
    }
    
    public void setContenido(T contenido) {
        this.contenido = contenido;
    }
}

// Uso
Contenedor<String> contenedorString = new Contenedor<>("Hola");
Contenedor<Integer> contenedorInt = new Contenedor<>(123);
```

### Métodos Genéricos
```java
public <T> T primero(List<T> lista) {
    if (lista == null || lista.isEmpty()) {
        return null;
    }
    return lista.get(0);
}

// Uso
List<String> nombres = Arrays.asList("Ana", "Juan", "Pedro");
String primerNombre = primero(nombres);  // "Ana"
```

### Comodines
```java
// ? extends T - límite superior (lectura)
public void procesarNumeros(List<? extends Number> lista) {
    for (Number n : lista) {
        System.out.println(n.doubleValue());
    }
    // lista.add(1);  // Error de compilación
}

// ? super T - límite inferior (escritura)
public void agregarEnteros(List<? super Integer> lista) {
    lista.add(1);
    lista.add(2);
    // Integer n = lista.get(0);  // Error de compilación
}
```

---

## 🔄 Lambdas y Streams

### Expresiones Lambda
```java
// Antes de Java 8
Runnable runnable1 = new Runnable() {
    @Override
    public void run() {
        System.out.println("Hola");
    }
};

// Con lambda
Runnable runnable2 = () -> System.out.println("Hola");

// Comparator con lambda
List<String> nombres = Arrays.asList("Juan", "Ana", "Pedro");
Collections.sort(nombres, (a, b) -> a.compareTo(b));

// Interfaces funcionales comunes
Predicate<String> estaVacio = s -> s.isEmpty();
Consumer<String> imprimir = s -> System.out.println(s);
Function<String, Integer> longitud = s -> s.length();
Supplier<String> obtener = () -> "Nuevo valor";
```

### Streams
```java
List<String> nombres = Arrays.asList("Juan", "Ana", "Pedro", "María", "Luis");

// Filtrar elementos
List<String> nombresFiltrados = nombres.stream()
        .filter(n -> n.length() > 3)
        .collect(Collectors.toList());

// Transformar elementos
List<Integer> longitudes = nombres.stream()
        .map(String::length)
        .collect(Collectors.toList());

// Ordenar elementos
List<String> nombresOrdenados = nombres.stream()
        .sorted()
        .collect(Collectors.toList());

// Reducir a un solo valor
int sumaLongitudes = nombres.stream()
        .mapToInt(String::length)
        .sum();

// Agrupar elementos
Map<Integer, List<String>> porLongitud = nombres.stream()
        .collect(Collectors.groupingBy(String::length));

// Verificar condiciones
boolean todosMayoresDe2 = nombres.stream()
        .allMatch(n -> n.length() > 2);

// Encontrar elementos
Optional<String> primero = nombres.stream()
        .findFirst();
```

---

<div align="center">
  <p style="opacity: 0.6;">© 2025 Carl's{Dev} - Todos los derechos reservados</p>
</div>
