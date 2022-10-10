/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enumeracion;

/**
 *
 * @author Alumno Mañana
 */
public enum Continentes {
    
    Africa(53),
    Europa(46),
    Asia(44),
    America(34),
    Oceania(14);
    private int numPaises;

    private Continentes(int numPaises) {
        this.numPaises = numPaises;
    }

    public int getConstruct() {
        return numPaises;
    }

    public void setConstruct(int construct) {
        this.numPaises = construct;
    }
    
}
