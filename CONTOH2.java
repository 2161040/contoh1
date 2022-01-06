/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoh2;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class CONTOH2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int angkatan ;
Scanner input = new Scanner(System.in);
System.out.print("Masukkan Angkatan = ");
angkatan = input.nextInt();

if(angkatan <= 2018){
System.out.print("Biaya kuliah Semester ini = Rp 5.000.000");
}
else if(angkatan >= 2019 ){
String fak;
int x,y,biaya;
System.out.print("Masukkan Fakultas = ");
fak = input.next();

if ("FTI".equalsIgnoreCase(fak)){
System.out.print("Masukkan SKS tatap muka = ");
x = input.nextInt();
System.out.print("Masukkan SKS pratikum = ");
y = input.nextInt();

if(x+y <= 24){
biaya = 2500000+(x*100000)+(y*150000);
System.out.print("Biaya Semester ini = Rp "+biaya);
}
else{
System.out.print("Jumlah SKS yang Anda masukkan lebih dari 24");
}

}
else if("FT".equalsIgnoreCase(fak)){
System.out.print("Masukkan SKS yang Anda masukkan tatap muka = ");
x = input.nextInt();
System.out.print("Masukkan SKS pratikum = ");
y = input.nextInt();
if(x+y <= 24){
biaya = 2250000+(x*100000)+(y*150000);
System.out.print("Biaya Semester ini = Rp "+biaya);
}
else{
System.out.print("Jumlah SKS yang Anda masukkan lebih dari 24");
}
}
else if("FH".equalsIgnoreCase(fak)){
System.out.print("Masukkan SKS tatap muka = ");
x = input.nextInt();
if(x <= 24){
biaya = 2275000+(x*100000);
System.out.print("Biaya Semester ini = Rp "+biaya);
}
else{
System.out.print("Jumlah SKS yang Anda masukkan lebih dari 24");
}
}
else if("FE".equalsIgnoreCase(fak) || "FPSI".equalsIgnoreCase(fak)){
System.out.print("Masukkan SKS tatap muka = ");
x = input.nextInt();
if(x <= 24){
biaya = 2150000+(x*100000);
System.out.print("Biaya Semester ini = Rp "+biaya);
}
else{
System.out.print("Jumlah SKS yang Anda masukkan lebih dari 24");
}
}}
    }
    
}

   
   

