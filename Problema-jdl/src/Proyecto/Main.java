/**
 * Haz una clase llamada Persona que siga las siguientes condiciones:
 * Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura. No queremos que se accedan directamente a ellos. Piensa que modificador
 * de acceso es el más adecuado, también su tipo. Si quieres añadir algún atributo puedes hacerlo.
 * Por defecto, todos los atributos menos el DNI serán valores por defecto según su tipo (0 números, cadena vacía para String, etc.). Sexo sera hombre por
 * defecto, usa una constante para ello.
 * Se implantaran varios constructores:
 * Un constructor por defecto.
 * Un constructor con el nombre, edad y sexo, el resto por defecto.
 * Un constructor con todos los atributos como parámetro.
 * Los métodos que se implementaran son:
 * calcularIMC(): calculara si la persona esta en su peso ideal (peso en kg/(altura^2  en m)), si esta fórmula devuelve un valor menor que 20, la
 * función devuelve un -1, si devuelve un número entre 20 y 25 (incluidos), significa que esta por debajo de su peso ideal la función devuelve un 0  y
 * si devuelve un valor mayor que 25 significa que tiene sobrepeso, la función devuelve un 1. Te recomiendo que uses constantes para devolver estos valores.
 * esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
 * comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es correcto, sera H. No sera visible al exterior.
 * toString(): devuelve toda la información del objeto.
 * generaDNI(): genera un número aleatorio de 8 cifras, genera a partir de este su número su letra correspondiente. Este método sera invocado cuando se
 * construya el objeto. Puedes dividir el método para que te sea más fácil. No será visible al exterior.
 * Métodos set de cada parámetro, excepto de DNI.
 * Ahora, crea una clase ejecutable que haga lo siguiente:
 * Pide por teclado el nombre, la edad, sexo, peso y altura.
 * Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores variables pedidas por teclado, el segundo objeto obtendrá todos
 * los anteriores menos el peso y la altura y el último por defecto, para este último utiliza los métodos set para darle a los atributos un valor.
 * Para cada objeto, deberá comprobar si esta en su peso ideal, tiene sobrepeso o por debajo de su peso ideal con un mensaje.
 * Indicar para cada objeto si es mayor de edad.
 * Por último, mostrar la información de cada objeto.
 * Puedes usar métodos en la clase ejecutable, para que os sea mas fácil.
 */

package Proyecto;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Por favor ingrese su nombre: ");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese su edad: "));
        String sexopersona = JOptionPane.showInputDialog("Por favor ingrese H si es hombre y M si es mujer:");
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Por favor digite su peso: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese su estatura: "));


        Persona persona1 = new Persona(nombre, edad, sexopersona, peso, altura);
        Persona persona2 = new Persona("Guillermo", 25, "H", 70, 1.7);
        Persona persona3 = new Persona();


        persona3.setNombre("Juan David");
        persona3.setEdad(13);
        persona3.setSexopersona("H");
        persona3.setPeso(40);
        persona3.setAltura(1.9);





        /* Para cada objeto, deberá comprobar si esta en su peso ideal, tiene sobrepeso o por debajo de su peso ideal con un mensaje. */
        System.out.println("El indice de masa corporal de la persona 1: " + persona1.indiceDeMasaCorporal(persona1.getPeso(), persona1.getAltura())
                + "\nEl indice de masa corporal de la persona 2: " + persona2.indiceDeMasaCorporal(persona2.getPeso(), persona2.getAltura())
                + "\nEl indice de masa corporal de la persona 3: " + persona3.indiceDeMasaCorporal(persona3.getPeso(), persona3.getAltura()));

        System.out.println("\n------------------------------------------------------");

        //Indicar para cada objeto si es mayor de edad.
        System.out.println("La persona 1: " + persona1.MayorDeEdad(persona1.getEdad())
                + "\nla persona 2: " + persona2.MayorDeEdad(persona2.getEdad())
                + "\nla persona 3: " + persona3.MayorDeEdad(persona3.getEdad()));

        System.out.println("\n------------------------------------------------------");

        // Por último, mostrar la información de cada objeto.
        System.out.println("El nombre de la persona 1 es: " + persona1.getNombre()
                + "\nSu edad es: " + persona1.getEdad()
                + "\nSu Sexo es: " + persona1.getSexopersona()
                + "\n" + persona1.documentoDeIdentidad()
                + "\nSu peso es: " + persona1.getPeso()
                + "\nSu estatura es: " + persona1.getAltura() + "\n\n"
                + "\nEl nombre de la Persona 2: " + persona2.getNombre()
                + "\nSu edad es:" + persona2.getEdad()
                + "\nSu Sexo es: " + persona2.getSexopersona()
                + "\n" + persona2.documentoDeIdentidad()
                + "\nSu peso es: " + persona2.getPeso()
                + "\nSu estatura es: " + persona2.getAltura() + "\n\n"
                + "\nEl nombre de la Persona 3: " + persona3.getNombre()
                + "\nSu edad es: " + persona3.getEdad()
                + "\nSu Sexo es: " + persona3.getSexopersona()
                + "\n" + persona1.documentoDeIdentidad()
                + "\nSu peso es: " + persona3.getPeso()
                + "\nSu estatura es: " + persona3.getAltura());


    }
}
