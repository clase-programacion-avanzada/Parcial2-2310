# Solución Parcial 2 - 2310


---

## 1. (20 puntos) Conceptos

1. Los atributos estáticos son compartidos por todos los objetos de una clase y solo pueden ser modificados por métodos estáticos.

    * [ ] a) Falso
    * [ ] b) Verdadero

   <details><summary>Respuesta</summary>Opción (a).</details>

2. En Java es requerido que se declare un constructor de forma explícita

    * [ ] a) Falso
    * [ ] b) Verdadero

   <details><summary>Respuesta</summary>Opción (a).</details>

3. Una variable de tipo int puede ser inicializada con null

    * [ ] a) Falso
    * [ ] b) Verdadero

   <details><summary>Respuesta</summary>Opción (a).</details>

4. La propiedad this se utiliza para hacer referencia al objeto actual de la clase

    * [ ] a) Falso
    * [ ] b) Verdadero

   <details><summary>Respuesta</summary>Opción (b).</details>

5. Los atributos private de una clase solamente pueden modificarse a través de métodos públicos. No se pueden modificar directamente en ninguna parte de código, ni dentro de la misma clase.

    * [ ] a) Falso
    * [ ] b) Verdadero

   <details><summary>Respuesta</summary>Opción (a).</details>

6. ¿Qué permite la palabra clave final en Java cuando se aplica a un atributo?

    * [ ] a) Que el atributo sea compartido por todos los objetos de la clase.
    * [ ] b) Que el atributo no pueda ser modificado después de su inicialización.
    * [ ] c) Que el atributo pueda ser accedido desde cualquier parte del código.
    * [ ] d) Que el atributo tenga un valor predeterminado.

   <details><summary>Respuesta</summary>Opción (b).</details>

7. ¿Cuál de las siguientes sentencias es falsa?:

    * [ ] a) Cada método define un comportamiento de los objetos de una clase.
    * [ ] b) Un método puede aceptar parámetros.
    * [ ] c) Los métodos pueden invocar otros métodos en otros objetos
    * [ ] d) Un método puede declarar atributos
    * [ ] e) Un método contiene instrucciones para ser ejecutadas.

   <details><summary>Respuesta</summary>Opción (d).</details>

8. ¿Cuál de las siguientes es la forma correcta para evaluar si dos strings son equivalentes?

    * [ ] a) equals
    * [ ] b) ==
    * [ ] c) contains
    * [ ] d) instanceof

   <details><summary>Respuesta</summary>Opción (a).</details>

9. ¿Cuál es nombre de la clase de la que heredan todos los objetos en Java?

    * [ ] a) Superclass
    * [ ] b) Object
    * [ ] c) Hyperclass
    * [ ] d) Primitive

   <details><summary>Respuesta</summary>Opción (b).</details>

10. El encapsulamiento de atributos consiste en:

    * [ ] a) Permitir el acceso a métodos privados solo a través de métodos públicos
    * [ ] b) Permitir el acceso a atributos privados solo a través de métodos privados
    * [ ] c) Permitir el acceso a métodos privados solo a través de métodos privados
    * [ ] d) Permitir el acceso a atributos privados solo a través de métodos públicos
    <details><summary>Respuesta</summary>Opción (d).</details>

---

## 2. (80 puntos) Construcción de un robot

**Por favor lea todoaesta sección antes de desarrollarla**

### 2.1. (10 puntos) Definición de clases y atributos

Defina las clases **Componente** y **Robot** como se indica en el siguiente diagrama UML:

![Diagrama UML](/assets/diagrama.png)

### 2.2. (70 puntos) Definición de métodos

Desarrolle los siguientes métodos en las clases definidas anteriormente:

| Clase    | Puntos | Descripción                                                                                                                                                                                                                                                                                                                                                        |
| -------- | -----: |--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Robot    |      3 | [Todos los _getters_ y _setter_ de la clase](src/com/company/model/Robot.java#20)                                                                                                                                                                                                                                                                                  |
| Robot    |      2 | [Un constructor por parámetros que deje la lista de componentes inicializada pero vacía](src/com/company/model/Robot.java#13)                                                                                                                                                                                                                                      |
| Robot    |     10 | [Un método que reciba por parámetro toda la información de un nuevo componente y lo agregue a la lista de componente del robot. Este método debe lanzar una excepción si, luego de agregar el componente, el robot excede su peso máximo. Si este el caso, el componente no debe quedar en la lista de componentes del robot](src/com/company/model/Robot.java#41) |
| Robot    |      2 | [Un método que retorne la sumatoria de los pesos de los componentes del robot](src/com/company/model/Robot.java#60)                                                                                                                                                                                                                                                |
| Catalogo |      3 | [Un método que busque un robot según su código. Debe retornar el robot o null en caso de no encontrarlo](src/com/company/model/Catalogo.java#13)                                                                                                                                                                                                                   |
| Catalogo |     10 | [Un método que reciba por parámetro toda la información de un robot y lo agregue a la lista de robots (sin componentes). Este método debe lanzar una excepción si ya existe un robot con el código ingresado para creación](src/com/company/model/Catalogo.java#34)                                                                                                |
| Catalogo |     15 | [Un método que reciba la información de un componente y el código de un robot, y agregue el componente al robot. Este método debe lanzar una excepción si el robot no existe o si no se puede agregar el componente (por exceso de peso)](src/com/company/model/Catalogo.java#49)                                                                                  |
| Catalogo |     10 | [Un método que elimine un robot dado su código. Este método debe lanzar una excepción si el robot a eliminar no se encuentra en la lista de robots](src/com/company/model/Catalogo.java#66)                                                                                                                                                                        |
| Catalogo |     15 | [Un método que retorne una lista con los nombres de todos los componentes usados en los robots del catálogo. Esta lista no debe incluir nombres repetidos](src/com/company/model/Catalogo.java#80)                                                                                                                                                                 |

Para la clase Componente, puede asumir que ya existe un constructor por parámetros y todos los métodos getters y setters. Para la clase Catalogo, puede asumir que ya existe un constructor por defecto que deja la lista de robots inicializada pero vacía.

Para cualquiera de estos métodos puede usar métodos desarrollados en otros puntos del parcial. En caso de usar métodos adicionales o auxiliares que no están incluidos en este enunciado, debe implementarlos completamente.


