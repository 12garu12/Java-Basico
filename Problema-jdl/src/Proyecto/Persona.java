package Proyecto;

import java.util.*;
import javax.swing.*;

public class Persona {

    private String nombre;
    private int edad;
    private String dni;
    private String sexopersona;
    private double peso;
    private double altura;


    // Un constructor por defecto.
    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.dni = "";
        this.sexopersona = "";
        this.peso = 0;
        this.altura = 0;
    }

    // Un constructor con el nombre, edad y sexo, el resto por defecto.
    public Persona(String nombre, int edad, String sexopersona) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexopersona = sexopersona;
        this.dni = "";
        this.peso = 0;
        this.altura = 0;
    }

    // Un constructor con todos los atributos como parámetro.
    public Persona(String nombre, int edad, String sexopersona, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexopersona = sexopersona;
        this.peso = peso;
        this.altura = altura;
    }

    /**
     * * calcularIMC(): calculara si la persona esta en su peso ideal (peso en kg/(altura^2  en m)), si esta fórmula devuelve un valor menor que 20, la función devuelve un -1,
     * si devuelve un número entre 20 y 25 (incluidos), significa que esta por debajo de su peso ideal la función devuelve un 0  y si devuelve un valor mayor que 25 significa
     * que tiene sobrepeso, la función devuelve un 1. Te recomiendo que uses constantes para devolver estos valores.
     *
     * @return
     */

    // Metodo para el indice de masa corporal
    public String indiceDeMasaCorporal(double peso, double altura) {
        String resultado = "";
        double resultadoIMC = peso / (Math.pow(altura, 2));

        if (resultadoIMC < 20) {
            resultado = -1 + " \nEstas por debajo de tu peso ideal";
            return resultado;
        }
        if (resultadoIMC >= 20 && resultadoIMC <= 25) {
            resultado = 0 + " \nEstas en tu peso ideal";
            return resultado;
        }
        if (resultadoIMC > 25) {
            resultado = 1 + " \ntienes sobrepeso";
            return resultado;
        }
        return resultado;
    }

    /**
     * esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
     */

    // Metodo Mayor de edad
    public boolean MayorDeEdad(int edad) {
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
            return true;
        } else {
            System.out.println("Es menor de edad");
            return false;
        }
    }

    /**
     * comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es correcto, sera H. No sera visible al exterior.
     * toString(): devuelve toda la información del objeto.
     */
    /*public enum sexoHombreMujer{
        H, // si es hombre
        M; // si es mujer

        Scanner entrada = new Scanner(System.in);

        private char sexopersona;

        private sexoHombreMujer(char sexopersona){
            this.sexopersona = sexopersona;

        }
    } */

    /**
     * generaDNI(): genera un número aleatorio de 8 cifras, genera a partir de este su número su letra correspondiente. Este método sera
     * invocado cuando se construya el objeto. Puedes dividir el método para que te sea más fácil. No será visible al exterior.
     */

    public String documentoDeIdentidad() {
        int numeroAleatorio;
        String[] letraCorrespondiente = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

        numeroAleatorio = (int) (Math.random() * 100000000);
        String dni = "DNI: " + numeroAleatorio + "-" + letraCorrespondiente[numeroAleatorio % 23];
        return dni;
    }

    /**
     * Métodos set de cada parámetro, excepto de DNI.
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexopersona(String sexopersona) {
        this.sexopersona = sexopersona;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }

    public String getSexopersona() {
        return sexopersona;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void datosPersona() {
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Por favor digite su peso: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese su estatura: "));
    }

    public void mostrarDatosPersona1() {
        System.out.println("El nombre de la persona 1 es: " + nombre
                + "\nSu edad es: " + edad
                + "\nSu Sexo es: " + sexopersona
                + "\nSu peso es: " + peso
                + "\nSu estatura es: " + altura);
    }


}
