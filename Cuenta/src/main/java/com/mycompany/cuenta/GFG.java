/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cuenta;
import java.util.Scanner;
import java.util.regex.*;
/**
 *
 * @author USUARIO
 */
public class GFG {
// Contraseña de 4-8 caracteres que requiere números y letras de ambos casos
    private static final String PASSWORD_REGEX =
            "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{4,8}$";
 
    // Contraseña de 4 a 32 caracteres que requiere al menos 3 de 4 (mayúsculas
    // y letras minúsculas, números y caracteres especiales) y como máximo
    // 2 caracteres consecutivos iguales.
    private static final String COMPLEX_PASSWORD_REGEX =
            "^(?:(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])|" +
            "(?=.*\\d)(?=.*[^A-Za-z0-9])(?=.*[a-z])|" +
            "(?=.*[^A-Za-z0-9])(?=.*[A-Z])(?=.*[a-z])|" +
            "(?=.*\\d)(?=.*[A-Z])(?=.*[^A-Za-z0-9]))(?!.*(.)\\1{2,})" +
            "[A-Za-z0-9!~<>,;:_=?*+#.\"&§%°()\\|\\[\\]\\-\\$\\^\\@\\/]" +
            "{8,32}$";
 
    private static final Pattern PASSWORD_PATTERN =
                                    Pattern.compile(COMPLEX_PASSWORD_REGEX);
 
    public static void main(String[] args)
    {
        String password = " ";
            Scanner teclado = new Scanner(System.in);
            System.out.print("Introduzca su Contraseña: ");
            password = teclado.nextLine();
            System.out.println("Su contraseña es " + password);
        // Validar una contraseña
        if (PASSWORD_PATTERN.matcher(password).matches()) {
            System.out.print("La contraseña " + password + " es valida");
        }
        else {
            System.out.print("La contraseña " + password + " no es valida");
        }
    }
}

