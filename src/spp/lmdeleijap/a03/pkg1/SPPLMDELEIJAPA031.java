/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.lmdeleijap.a03.pkg1;
import java.util.Scanner;
/**
 *
 * @author Samsung
 */
public class SPPLMDELEIJAPA031 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Programa para calcular seno, coseno y tangente de un angulo
        double angulo, seno, coseno, tangente;
        angulo = solicitarAngulo();
        seno = calcularSeno(angulo);
        coseno = calcularCoseno(angulo);
        tangente = calcularTangente(angulo);
        imprimirCalculos(angulo, seno, coseno, tangente);
    }
    
    public static double solicitarAngulo(){
        double angulo;
        System.out.println("Ingrese el valor del angulo para someterse a calcuo:");
        Scanner entradaAngulo = new Scanner(System.in);
        angulo = entradaAngulo.nextDouble();
        return angulo;
    }
    
    public static double calcularSeno(double angulo){
        double seno;
        seno = Math.sin(angulo);
        return seno;
    }
    
    public static double calcularCoseno(double angulo){
        double coseno;
        coseno = Math.cos(angulo);
        return coseno;
    }
    
    public static double calcularTangente(double angulo){
        double tangente;
        tangente = Math.tan(angulo);
        return tangente;
    }
    
    public static void imprimirCalculos(double angulo, double seno, double coseno, double tangente){
        System.out.println("El seno del angulo: " + angulo + " es igual a: " + seno);
        System.out.println("El coseno del angulo: " + angulo + " es igual a: " + coseno);
        System.out.println("La tangente del angulo: " + angulo + " es igual a: " + tangente);
    }
}

