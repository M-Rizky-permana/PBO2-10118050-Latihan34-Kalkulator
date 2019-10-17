/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas34;

/**
 *
 * NAMA :Muhamad Rizky Permana
KELAS : IF-2
NIM : 10118050
Deskripsi Program :
 */
public class Kalkulator {
    public double value1;
    public double value2;

    public double getValue1() {
        return value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public double getValue2() {
        return value2;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }

    public double tambahBilangan(){
        return value1 + value2;
    }
    
    public double kurangBilangan(){
        return value1 - value2;
    }
    
    public double kaliBilangan(){
        return value1 * value2;
    }
    
    public double bagiBilangan(){
        return value1 / value2;
    }
    
    public double sisaBilangan(){
        return value1 % value2;
    }
}
