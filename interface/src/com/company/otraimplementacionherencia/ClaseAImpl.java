package com.company.otraimplementacionherencia;

public class ClaseAImpl implements InterfaceA{

    private String fname;
    private String lname;
    private Integer age;

    public ClaseAImpl(String fname, String lname, Integer age){
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }


    @Override
    public void printMensaje(String name) {
        System.out.println("NOMBRE: " + name);
    }

    @Override
    public void printMensaje2(String lastname) {
        System.out.println("APELLIDO: " + lastname);
    }

    @Override
    public void printAge(int age) {
        System.out.println("EDAD: " + age);
    }

    @Override
    public String fullMessage() {
        return "EL Nombre completo del cliente es: " + fname + " " + lname;
    }

    public String getFname(){
        return fname;
    }

    public void setFname(String fname){
        this.fname = fname;
    }

    public String getLname(){
        return lname;
    }

    public void setLname(){
        this.lname = lname;
    }

    public Integer getAge(){
        return age;
    }

    public void setAge(Integer age){
        this.age = age;
    }




}
