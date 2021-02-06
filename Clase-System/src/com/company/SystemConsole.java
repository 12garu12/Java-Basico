package com.company;

import java.io.Console;

public class SystemConsole {

//La Clase System
//Hay ocasiones en que se necesita acceder a recursos del sistema , como son los dispositivos de entrada/salida, el reloj
//del sistema, etc. Java dispone de la clase System, que proporciona acceso a estos recursos, independientemente de la
//plataforma. Es decir, que si se ejecuta un programa en una plataforma diferente a la que se ha desarrollado, no es
//necesaria ninguna modificación para tener en cuenta las peculiaridades de la nueva plataforma.
//
//La clase System es miembro del paquete java.lang y en ella se definen los dispositivos estándar de entrada/salida
//static PrintStream err;
//static InputStream in;
//static PrintStream out;
//
//y dispone de varios métodos, algunos de los cuales ya se han utilizado en secciones anteriores, sin saber muy bien lo
//que se estaba haciendo, cosa que se intentará remediar ahora.
/*
static void arraycopy( Object,int,Object,int,int )
static long currentTimeMillis()
static void exit( int )
static void gc()
static Properties getProperties()
static String getPropertie( String )
static String getPropertie( String,String )
static SecurityManager getSecurityManager()
static native int identityHashCode( Object )
static void load( String )
static void loadLibrary( String )
static void runFinalization()
static void runFinalizersOnExit( boolean )
static void setErr( PrintStream )
static void setIn( InputStream )
static void setOut( PrintStream )
static void setProperties( Properties )
static void setSecurityManager( SecurityManager )
No se puede instanciar ningún objeto de la clase System, porque es una clase final y todos sus contenidos son privados;
por ellos es por lo que no hay una lista de constructores en la enumeración de métodos. Es decir, la clase System
siempre está ahí disponible para que se pueda invocar cualquiera de sus métodos utilizando la sintaxis
de punto (.) ya conocida

Los tres streams de entrada/salida están controlados por esta clase y se referencian como:

System.in	entrada estándar
System.out	salida estándar
System.err	salida de error estándar

Las variables internas de la clase System out y err son de tipo PrintStream, es decir, que tienen acceso a los
métodos de la clase PrintStream. La clase PrintStream proporciona tres métodos para poder visualizar
información: print(), println() y write().
Los dos primeros ya se han utilizado en el Tutorial ampliamente, con lo que no resultan extrañas sentencias como:

System.out.print( … );
System.out.println( … );
System.out.write( … );

Los métodos print() y println() son semejante, la única diferencia es que println() coloca automáticamente un carácter
nueva línea en el stream, tras la lista de argumentos que se le pase.

El método write() se utiliza para escribir bytes en el stream, es decir, para escribir datos que no pueden interpretarse
como texto, como pueden ser los datos que componen un gráfico.

Los métodos print() y println() aceptan un argumento de cualquiera de los siguientes tipos: Object, String, char[],
int, long, float, double o boolean. En cada caso, el sistema convierte el dato a un conjunto de caracteres que
transfiere al dispositivo estándar de salida. Si se invoca al método println() sin argumentos, simplemente se inserta
un carácter nueva línea en el stream.

Además, hay versiones sobrecargadas de estos métodos para visualizar adecuadamente objetos de varias clases estándar.
Por ejemplo, las siguientes sentencias:

Thread obj = new Thread;
System.out.println( obj );

Cuando se utilizan print() y println() sobre un objeto, la salida dependerá de ese objeto; por ejemplo, si se imprime
un objeto String, visualizaremos el contenido de la cadena y si se imprime un objeto Thread obtenemos una salida en formato:

claseThread[nombre,prioridad,grupo]
como en el ejemplo anterior.

Propiedades del Sistema

Ya se ha indicado al tratar la clase Properties que las Propiedades son pares de clave/valor que los programas Java
pueden utilizar para establecer y mantener diversos atributos o parámetros, que estarían disponibles en todas sus
invocaciones.

El sistema Java también mantiene un conjunto de Propiedades del Sistema que contienen información acerca del entorno
en que se está ejecutando como: el usuario actual, la versión actual del ejecutable de Java, etc. Estas Propiedades se
fijan cuando arranca el Sistema.

En la fecha de hoy, invierno del 97, los applets pueden acceder a algunas de las Propiedades del sistema, pero no a
todas. Además, los applets no pueden escribir las Propiedades del sistema. Supongo que en adelante esto cambiará.

La clase System dispone de varios métodos para leer y escribir las Propiedades del sistema. A estas Propiedades se
puede acceder a través de la clave o se puede leer el conjunto completo de Propiedades.

Los dos métodos que proporciona la clase System para leer las propiedades del sistema son
getProperty() y getProperties(). De la primera hay dos versiones sobrecargadas. La primera de ellas es:

static String getProperty( String key );
Solamente tiene un argumento y devuelve un objeto de tipo String. Si no es capaz de encontrar la propiedad indicada en
la clave, devolverá una referencia nula. La segunda versión sobrecargada de getProperty()

static String getProperty( String clave,String def );

necesita dos argumentos. El primero es la propiedad clave que se quiere consultar y el segundo argumento es el valor
por defecto que devolverá el método si la propiedad clave no se encuentra entre las propiedades, o si esa propiedad
clave sí se encuentra pero no tiene asignado ningún valor.

El tercer método para acceder a las Propiedades del sistema es getProperties(), que devuelve un objeto Properties
conteniendo el conjunto completo de pares clave/valor del sistema. Una vez obtenido este objeto, se puede usar
cualquiera de sus métodos para obtener la información que se necesite.

Las Propiedades del sistema también se pueden modificar a través del método setProperties() de esta clase System. Este
método coge un objeto Properties que haya sido inicializado con el adecuado conjunto de pares clave/valor que se desee
y reemplaza el conjunto completo de Propiedades del sistema por los nuevos valores representados por el objeto.

En general, hay que tener cuidado de no sobreescribir las Propiedades del sistema. El método setProperties() cambia las
Propiedades del sistema solamente para la ejecución actual en que se está utilizando. El sistema Java reinicializa las
Propiedades cada vez que se arranca, luego los cambios realizados por este método no son persistentes. Si se quiere que
lo sean, hay que salvarlos en un fichero antes de concluir la aplicación y cargarlos de nuevo al arrancar. La clase
Properties proporciona métodos para realizar ambas tareas.

Finalización

Todos los objetos en Java son instanciados dinámicamente, en tiempo de ejecución, en la pila. Cuando ya no exista
variable alguna que referencie al objeto, éste será marcado para su reciclado.

El reciclador de memoria, o cualquier nombre que quiera dársele, se ejecuta asíncronamente en segundo plano, recogiendo
los objetos que ya no estén referenciados y haciendo que la memoria que ocupaban quede libre y sea devuelta al sistema
para su reutilización.

El método finalize() de un objeto siempre se ejecuta antes de que la memoria ocupada por ese objeto sea liberada. Este
método se puede sobreescribir para las clases que se desee, de forma que se ejecuten un conjunto de setencias
determinado antes de liberar la memoria.

Se puede forzar una ejecución del reciclador de memoria invocando al método gc(). Además, se puede forzar a que el
sistema ejecute la finalización de los objetos utilizando la llamada al método runFinalization(), que invocará a todos
los métodos finalize() de los objetos que estén marcados para ser reciclados.

Copia de arrays

Para copiar eficientemente datos desde un array a otro se puede utilizar el método arraycopy(). Este método requiere
cinco argumentos, de forma que se indiquen los arrays de origen y destino y el número de elementos que se van a copiar.

static void arraycopy( Object src,int src_position,Object dst,int dst_position,int length );

El array destino debe estar localizado en memoria antes de llamarlo y debe ser lo suficientemente largo para
contener los datos que se le van a pasar.

Salida del Sistema

Se puede abandonar el intérprete Java llamando al método exit() y pasándole un int como código de salida. Sin embargo,
la invocación de este método está sujeta a restricciones de seguridad, Así, dependiendo del navegador sobre el que se
esté ejecutando un applet, una llamada a exit() desde dentro del applet puede originar una excepción de seguridad,
SecurityException.

Seguridad

El controlador de seguridad es un objeto que asegura una cierta política de seguridad a la aplicación Java. Se puede
fijar el controlador de seguridad para las aplicaciones utilizando el método setSecurityManager() y se puede recuperar
el que esté actualmente definido utilizando el método getSecurityManager().

El controlador de seguridad para una aplicación solamente se puede fijar una vez. Normalmente, un navegador fija su
controlador de seguridad al arrancar, con lo cual, en acciones posteriores los applets no pueden fijarlo de nuevo, o se
originará una excepción de seguridad si el applet lo intenta.

Recursos dependientes del Sistema

Deberíamos ser capaces de satisfacer todas nuestras necesidades de programación utilizando la interfaz independiente de
plataforma que proporciona la clase System. Pero también es posible saltarse este interfaz y acceder directamente a los
recursos del sistema en que se esté ejecutando el programa Java.

El sistema Java proporciona un objeto Runtime que representa el entorno en que se está corriendo, y que se puede
utilizar para acceder directamente a los recursos de la plataforma.

Al hacer esto, probablemente se esté perdiendo parte de la portabilidad que caracteriza a Java, pero se está ganando
velocidad de ejecución, o la obtención de información propia del sistema en que se está ejecutando la aplicación.


*/


    public static void main(String[] args) {
        // write your code here
        System.out.println("Devuelve el Consoleobjeto único asociado con la máquina\n virtual Java actual, si existe. " +
                "metodo console() \n" +
                System.console()); //Devuelve el objeto de consola exclusivo asociado con la máquina virtual Java actual, si existe
        // Devoluciones:
        //La consola del sistema, si existe, de lo contrario es nula .

        String[] data = {"\u250C\u2500\u2500\u2500\u2500\u2500\u2510",
                "\u2502Hello\u2502", "\u2514\u2500\u2500\u2500\u2500\u2500\u2518"};

        for (String s : data) {
            System.out.println(s);
        }
//        for (String s: data){
//            System.console().writer().println();
//        }

//       En mi Windows XP que tiene una codificación de sistema de windows-1252 y una codificación de consola
//       predeterminada de IBM850, este código escribirá:

//        ???????
//        ?Hello?
//        ???????
//        ┌─────┐
//        │Hello│
//        └─────┘

//        Tenga en cuenta que este comportamiento depende de que la codificación de la consola esté configurada en una
//        codificación diferente a la codificación del sistema. Este es el comportamiento predeterminado en Windows
//        por varias razones históricas.
//        Son esencialmente los mismos, si su programa se ejecuta desde un mensaje interactivo y no ha
//        redireccionado stdin o stdout:

        System.out.println("Console is: " + System.console());

//        resultados en:
//        $ Java ConsoleTest
//        Console is: Java.io.Console@2747ee05
//        $ Java ConsoleTest </dev/null
//        Console is: null
//        $ Java ConsoleTest | cat
//        Console is: null

//        La razón por la que existe Console es para proporcionar características que son útiles en el caso específico
//        de que se esté ejecutando desde una línea de comandos interactiva:
//
//        entrada de contraseña segura (difícil de hacer multiplataforma)
//        sincronización (varios subprocesos pueden solicitar la entrada y Console los pondrá en cola muy bien, mientras
//        que si utiliza System.in/out, todas las indicaciones aparecerán simultáneamente).
//        Tenga en cuenta que, al redirigir incluso uno de los flujos, System.console() devuelve null; otra irritación
//        es que a menudo no hay un objeto Console disponible cuando se genera a partir de otro programa
//        como Eclipse o Maven.

//        Primero me temo que tu pregunta contiene un pequeño error. No hay método de línea de escritura en la clase
//        Console. En su lugar, la consola de la clase proporciona el escritor de métodos () que devuelve PrintWriter.
//        Este escritor de impresión tiene println ().
//
//        Ahora cual es la diferencia entre


//        System.console().writer().println("hello from console");

//        System.out.println("hello system out");

//        Si ejecuta su aplicación desde la línea de comandos, creo que no hay diferencia. Pero si la consola no está
//        disponible, System.console () devuelve un valor nulo mientras que System.out aún existe. Esto puede suceder
//        si invoca su aplicación y realiza una redirección de STDOUT al archivo.
//
//A       quí hay un ejemplo que acabo de implementar.

//        Console console = System.console();
//        System.out.println("console = " + console);
//        console.writer().println("hello from console");

//        Cuando ejecuté la aplicación desde el símbolo del sistema obtuve lo siguiente:
//
//        $ Java TestConsole
//        console=Java.io.Console@93dcd
//        hello from console

//        pero cuando redirigí el STDOUT al archivo ...

//        Exception in thread "main" Java.lang.NullPointerException
//        at TestConsole.main(TestConsole.Java:8)

//        La línea 8 es console.writer().println().
//
//        Aquí está el contenido de/tmp/test
//
//        console=null
//        Espero que mis explicaciones ayuden.

/*
          No hay Console.writeline en Java. Está en .NET.

          La consola y la salida estándar no son lo mismo. Si lees la página Javadoc que mencionaste , verás que una
          aplicación puede tener acceso a una consola solo si se invoca desde la línea de comandos y la salida
          no se redirige así.

          Java -jar MyApp.jar > MyApp.log
          Otros casos de este tipo están cubiertos en la respuesta de SimonJ, aunque se perdió el punto de que
          no hay Console.writeline.

 ----------------------------------------------------------------------------------------------------------------------

*/
    }
}


