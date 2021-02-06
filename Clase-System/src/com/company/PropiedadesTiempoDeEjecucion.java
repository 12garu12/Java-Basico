package com.company;

import java.util.Properties;

public class PropiedadesTiempoDeEjecucion {
/*
3.5. Acceso a las propiedades del tiempo de ejecución
El sistema proporciona acceso a las propiedades en tiempo de ejecución con getProperty .

Y podemos administrarlos con setProperty y clearProperty :
*/

    public static String getJavaVMVendor() {
        return System.getProperty("java.vm.vendor");
    }

    public static void main(String[] args) {

        System.out.println(getJavaVMVendor());
        System.setProperty("abckey", "abcvaluefoo");
        System.out.println(System.getProperty("abckey"));
        System.clearProperty("abckey");
        System.out.println(System.getProperty("abckey"));
/*
     Las propiedades especificadas mediante -D son accesibles mediante getProperty .
     También podemos proporcionar un valor predeterminado:
*/
//        System.clearProperty("dbHost");
//        String myKey = System.getProperty("dbHost", "db.host.com");

//   Y System.getProperties proporciona una colección de todas las propiedades del sistema

        Properties properties = System.getProperties();
        System.out.println(properties);

    }

    //    Desde el cual podemos hacer cualquier operación de Propiedades :
    public void clearAllProperties() {
        System.getProperties().clear();
    }

    /*   3.6. Acceso a variables de entorno
         El sistema también proporciona acceso de solo lectura a las variables de entorno con getenv .
         Si queremos acceder a la variable de entorno PATH , por ejemplo, podemos hacer:
    */
    public String getPath() {
        return System.getenv("PATH");
    }

/*
3.7. Administrar la recolección de basura
Por lo general, los esfuerzos de recolección de basura son opacos para nuestros programas. En ocasiones, sin
embargo, es posible que deseemos hacer una sugerencia directa a la JVM.

System.runFinalization es un método que nos permite sugerir que la JVM ejecute su rutina de finalización.
System.gc es un método que nos permite sugerir que la JVM ejecute su rutina de recolección de basura.

Dado que los contratos de estos dos métodos no garantizan que se ejecutará la finalización o la recolección de basura,
su utilidad es limitada.

Sin embargo, podrían ejercerse como una optimización, por ejemplo, invocando gc cuando una aplicación de
escritorio se minimiza:

public void windowStateChanged(WindowEvent event) {
    if ( event == WindowEvent.WINDOW_DEACTIVATED ) {
        System.gc(); // if it ends up running, great!
    }
}
Para obtener más información sobre la finalización, consulte nuestra guía de finalización .
*/


}
