/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formula;

/**
 *
 * @author UseR
 */
public class Segitiga extends Mtk {

    @Override
    public float luas(float p, float l) {
//        return super.luas(p, l); //
        float r;
        r = 0.5f * (p*l); //kalau 0.5f tidak ada f nya, akan jadi tipe data double
        return r;
    }

    
}
