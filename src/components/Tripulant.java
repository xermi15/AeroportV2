/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package components;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Xavi
 */
public abstract class Tripulant {
    
    private final static Scanner DADES = new Scanner(System.in);
    
    private String passaport;
    private String nom;
    private int edat;
    private Date dataAlta;
    private int horesVol;
    private String rang;
    
    public TCP(String passaport, String nom, int edat, int horesVol) {
        this.passaport = passaport;
        this.nom = nom;
        this.edat = edat;
        dataAlta = new Date();
        this.horesVol = horesVol;
        this.rang = null;
    }
}
