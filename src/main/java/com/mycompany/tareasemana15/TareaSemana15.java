/*
 * Click nbfs://nbhost/SystemFileSystem/FileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/FileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tareasemana15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author alext
 */
public class TareaSemana15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String, Integer> registro = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        // Notas iniciales 
        registro.put("Alex Toaquiza", 9);
        registro.put("Madeley Pallo", 7);

        System.out.println("--- SISTEMA DE NOTAS UEA ---");

        System.out.print("Nombre del estudiante: ");
        String estudiante = sc.nextLine();
        System.out.print("Nota final: ");
        int nota = sc.nextInt();
        
        registro.put(estudiante, nota);

        System.out.println("\n--- REPORTE GENERAL ---");
        for (Map.Entry<String, Integer> fila : registro.entrySet()) {
            System.out.println("Alumno: " + fila.getKey() + " | Nota: " + fila.getValue());
        }

        sc.nextLine(); 
        System.out.print("\n¿A quien desea buscar?: ");
        String consulta = sc.nextLine();

        if (registro.containsKey(consulta)) {
            System.out.println("Resultado: " + consulta + " tiene " + registro.get(consulta));
        }

        System.out.print("\n¿Eliminar registro? (Nombre o 'no'): ");
        String borrar = sc.nextLine();
        
        if (registro.containsKey(borrar)) {
            registro.remove(borrar);
            System.out.println("Registro eliminado.");
        }

        System.out.println("\nProceso terminado.");
        sc.close();
    }
}