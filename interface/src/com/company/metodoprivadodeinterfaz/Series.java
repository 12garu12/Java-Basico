package com.company.metodoprivadodeinterfaz;

/*
4. Métodos private de interfaz
A partir de JDK 9, una interfaz puede incluir un método privado (). Se puede llamar a un método privado de interfaz solo
por un método predeterminado u otro método privado definido por la misma interfaz. Debido a que un método privado de
interfaz se especifica como private, el código no puede usarlo fuera de la interfaz en la que está definido. Esta
restricción incluye subinterfaces porque un método de interfaz privado no es heredado por una subinterfaz.

El beneficio clave de un método privado de interfaz es que permite que dos o más métodos predeterminados utilicen una
pieza común de código, evitando la duplicación de código.

Por ejemplo, aquí hay una versión mejorada de la interfaz de Series (que tomamos como ejemplo para Introducción a
Interfaces) que agrega un segundo método predeterminado llamado saltarGetSiguienteArray(). Se salta una cantidad
específica de elementos y luego devuelve una matriz que contiene los elementos subsiguientes. Utiliza un método privado
llamado getArray() para obtener una matriz de elementos de un tamaño específico.
*/

// Interfaz que utiliza un método privado llamado getArray()
public interface Series {

    int getSiguiente(); //Retorna el siguiente número de la serie

    //Retorna un array que contiene el siguiente n elemento
    //más allá del elemento actual
    default String getSiguienteArray(int n){
        return getArray(n);
    }

    //Retorna un array que contiene el siguiente n elemento
    //después de saltar elementos
    default String saltarGetSiguienteArray(int saltar,int n){

        //Se especifica el número de saltos
        getArray(saltar);
        return getArray(n);
    }

    //Un método privado que retorna un array que contiene
    //los siguientes n elementos
    private String getArray(int n){
        int[] valores=new int[n];
        for (int i=0; i<n;i++) {
           valores[i] = i;
        }
        String str= "";
        str += "{ ";
        for (int i: valores){
            if( i == valores.length -1) {
                str += i;
                break;
            }
            str += i + ", ";
        }
        str += " }";
        return str;
    }

    void reiniciar();
    void setEmpezar(int x);
}
/*
Tenga en cuenta que tanto getSiguienteArray() como saltarGetSiguienteArray() usan el método privado getArray() para
obtener la matriz para devolver. Esto evita que ambos métodos tengan que duplicar la misma secuencia de códigos. Tenga
en cuenta que debido a que getArray() es privado, no puede ser llamado por código fuera de Series. Por lo tanto, su uso
está limitado a los métodos predeterminados dentro de Series.

Aunque el método privado de interfaz es una función que rara vez necesitará, en los casos en que la necesite, la
encontrará bastante útil.
*/
