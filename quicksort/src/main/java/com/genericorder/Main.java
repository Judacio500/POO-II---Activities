package com.genericorder;

public class Main {
    public static void main(String[] args) {
        
        // 1. Prueba con Enteros (int[])
        System.out.println("--- Prueba con Integer ---");
        int[] intVector = { 101, 99, 12, 19, 21, 111, 345, 25, 77, 81 };
        Number[] resultInt = Utils.ordena(intVector);
        Utils.imprimir(resultInt);

        // 2. Prueba con Flotantes (float[])
        System.out.println("\n--- Prueba con Float ---");
        float[] floatVector = { 19.1f, 456.6f, 23.45f, 12.34f, 11.11f, 354.55f, 78.45f, 28.33f, 45.99f, 108.88f };
        Number[] resultFloat = Utils.ordena(floatVector);
        Utils.imprimir(resultFloat);

        String [] strVector = {"zz", "aa", "cc", "hh", "bb", "ee", "ll"};
        // String [] resultStr = Utils.ordena(strVector); 
        // Descomentar para ver error
    }
}