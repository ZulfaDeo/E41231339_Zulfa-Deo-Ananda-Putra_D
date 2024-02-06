/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Minggu5;
import java.util.Scanner;
/**
 *
 * @author snsv___
 */
public class Balok {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Masukkan Panjang : ");
int p = sc.nextInt();
System.out.print("Masukkan Lebar : ");
int l = sc.nextInt();
System.out.print("Masukkan Tinggi : ");
int t = sc.nextInt();

int luaspermukaan = 2 * ((p*l)+(p*t)+(l*t));
System.out.println("Luas permukaan Balok adalah : "+luaspermukaan);

int volume = p*l*t;
System.out.println("Volume Balok adalah : "+volume);
}
static int hitungluaspermukaan(int p,int l, int t){
int hasil = 2 * ((p*l)+(p*t)+(l*t));
return hasil;
}
static int volume(int p, int l, int t){
int hasil = p*l*t;
return hasil;
}
}
