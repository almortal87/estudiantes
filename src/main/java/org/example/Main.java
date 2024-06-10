package org.example;

import org.estudiante.Estudiante;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Estudiante e = new Estudiante();
            int edad = e.getAge();
            System.out.println(edad);

        }
}
