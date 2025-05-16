/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matematika;
import Kalkulator.Mtk01;
import Kalkulator.Mtk02;
import Kalkulator.Mtk03;
import Kalkulator.Mtk04;

import Formula.Ipas;
import Formula.Mtk;
import Formula.NewMath;
import Formula.Segitiga;
/**
 *
 * @author UseR
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Mtk01 matematika01 = new Mtk01(); //membuat sebuah objek : instansiasi
        Mtk02 matematika02 = new Mtk02(); //public, private, protective : akses modifier/pemodifikasi
        Mtk03 matematika03 = new Mtk03(); //overide
        Mtk04 matematika04 = new Mtk04();
        Ipas objekIpas = new Ipas();
        Segitiga segitiga01 = new Segitiga();
        Mtk mat01 = new Mtk();
        
        System.out.println("Tulisan dari method pertama :"+ matematika01.tambah01(2, 2));
        System.out.println("Tulisan dari method kedua :"+ matematika02.kurang01(2, 2));
        System.out.println("Tulisan dari method ketiga :"+ matematika03.bagi01(2, 2));
        System.out.println("Tulisan dari method keempat :"+ matematika04.kali01(2, 2));
        
        matematika01.tambah01(1, 2);
        matematika02.kurang01(4, 2);
        
        matematika03.setX("oke");
        System.out.println("Tulisan dari kelas mtk03 adalah " + matematika03.getX());
        
        System.out.println("hasil:"+segitiga01.luas(3, 2));
        System.out.println("hasil:"+mat01.luas(3, 2));
        
//        System.out.println("Reamur :"+ objekIpas.rumusIpas(1.0, 1.25));
    }
    
}
