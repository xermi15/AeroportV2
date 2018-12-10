/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package components;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Xavi
 */
public abstract class Tripulant implements Component {
    
    private final static Scanner DADES = new Scanner(System.in);
    
    private String passaport;
    private String nom;
    private int edat;
    private Date dataAlta;
    private int horesVol;
    private String rang;
    
    public Tripulant(String passaport, String nom, int edat, int horesVol, String rang) {
        this.passaport = passaport;
        this.nom = nom;
        this.edat = edat;
        dataAlta = new Date();
        this.horesVol = horesVol;
        this.rang = null;
    }
    
    public String getPassaport() {
        return passaport;
    }

    public void setPassaport(String passaport) {
        this.passaport = passaport;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public Date getDataAlta() {
        return dataAlta;
    }

    public void setDataAlta(Date dataAlta) {
        this.dataAlta = dataAlta;
    }

    public int getHoresVol() {
        return horesVol;
    }

    public void setHoresVol(int horesVol) {
        this.horesVol = horesVol;
    }

    public String getRang() {
        return rang;
    }

    public void setRang(String rang) {
        this.rang = rang;
    }
    
    
    public void mostrarComponent() {
        System.out.println("\nLes dades del tripulant de cabina amb passaport " + passaport + " són:");
        System.out.println("\nNom: " + nom);
        System.out.println("\nEdat: " + edat);
        System.out.println("\nData d'alta: " + new SimpleDateFormat("dd-MM-yyyy").format(dataAlta));
        System.out.println("\nHores de vol: " + horesVol);
        System.out.println("\nRang: " + rang);
    }
    
    public void modificarComponent() {
        System.out.println("\nEl passaport actual del tripulant és:" + passaport);
        passaport = (String)demanarDades("\nQuin és el nou passaport del tripulant?", 2);
        
        System.out.println("\nEl nom actual del tripulant és:" + nom);
        nom = (String)demanarDades("\nQuin és el nou nom del tripulant?", 2);
        
        System.out.println("\nL'edat actual del tripulant és:" + edat);
        edat = (int)demanarDades("\nQuina és la nova edat del tripulant?", 1);

        System.out.println("Les hores de vol actuals del tripulant són:" + horesVol);
        horesVol = (int)demanarDades("\nQuines són les hores de vol actuals del tripulant:", 1);
    }
}
