/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika;

/**
 *
 * @author ASUS
 */

    class MatCanggih extends Mat {

    public double modulus(double a, double b, double c) {
        return a % b % c;
    }

    public int modulus(int a, int b, int c) {
        return  a % b % c;
    }
    public int modulus(int a, int b) {
        return a % b;
    }
    public double modulus(double a, double b) {
        return a % b;
}
    }