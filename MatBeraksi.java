/*
 * Click nbfs=//nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs=//nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika;

    public class MatBeraksi {
    public static void main(String[] args) {
        MatCanggih MatCanggih = new MatCanggih();

        System.out.println("\n---------------------------------------------------------------------");
        System.out.println("Uji Overloading Pertambahan:");
        System.out.printf("Pertambahan 12.5 + 28.7 + 14.2= %.1f%n" , MatCanggih.tambah(12.5, 28.7, 14.2));
        System.out.println("Pertambahan 12 + 28 + 14= " + MatCanggih.tambah(12, 28, 14));
        System.out.println("Pertambahan 23 + 34= " + MatCanggih.tambah(23, 34));
        System.out.println("Pertambahan 3.4 + 4.9= " + MatCanggih.tambah(3.4, 4.9));
        

        System.out.println("\n---------------------------------------------------------------------");
        System.out.println("Uji Overloading Pengurangan:");
        System.out.printf("Pengurangan (12.5 - 28.7 - 14.2)= %.1f%n" , MatCanggih.kurang(12.5, 28.7, 14.2));
        System.out.println("Pengurangan (12 - 28 - 14)= " + MatCanggih.kurang(12, 28, 14));
        System.out.println("Pengurangan (23 - 34)= " + MatCanggih.kurang(23, 34));
        System.out.printf("Pengurangan (3.4 - 4.9)= %.1f%n " , MatCanggih.kurang(3.4, 4.9));
        
        
        System.out.println("\n---------------------------------------------------------------------");
        System.out.println("Uji Overloading Perkalian:");
        System.out.printf("Perkalian (12.5 x 28.7 x 14.2)= %.1f%n" , MatCanggih.kali(12.5, 28.7, 14.2));
        System.out.println("Perkalian (12 x 28 x 14)= " + MatCanggih.kali(12, 28, 14));
        System.out.println("Perkalian (23 x 34)= " + MatCanggih.kali(23, 34));
        System.out.printf("Perkalian (3.4 x 4.9)= %.1f%n" , MatCanggih.kali(3.4, 4.9));

        
        System.out.println("\n---------------------------------------------------------------------");
        System.out.println("Uji Overloading Pembagian:");
        System.out.printf("Pembagian (12.5 : 28.7 : 14.2)= %.1f%n" , MatCanggih.bagi(12.5, 28.7, 14.2));
        System.out.println("Pembagian (12 : 28 : 14)= " + MatCanggih.bagi(12, 28, 14));
        System.out.println("Pembagian (23 : 34)= " + MatCanggih.bagi(23, 34));
        System.out.printf("Pembagian (3.4 : 4.9)= %.1f%n" , MatCanggih.bagi(3.4, 4.9));

        
        System.out.println("\n---------------------------------------------------------------------");
        System.out.println("Uji Overloading Modulus:");
        System.out.printf("Pembagian (12.5, 28.7, 14.2)= %.1f%n" , MatCanggih.modulus(12.5, 28.7, 14.2));
        System.out.println("Pembagian (12, 28, 14)= " + MatCanggih.modulus(12, 28, 14));
        System.out.println("Pembagian (23, 34)= " + MatCanggih.modulus(23, 34));
        System.out.printf("Pembagian (3.4, 4.9)= %.1f%n" , MatCanggih.modulus(3.4, 4.9));
    }
}
