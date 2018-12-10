/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public abstract class Ruta implements Component {
    
    private final static Scanner DADES = new Scanner(System.in);
    
    private String codi;
    private String aeroportDes;
    private String aeroportOri;
    private double distancia;
    
    public Ruta(String codi, String aeroportOri, String aeroportDes, double distancia) {
        this.codi = codi;
        this.aeroportOri = aeroportOri;
        this.aeroportDes = aeroportDes;
        this.distancia = distancia;
    }
    
    public String getCodi(){
        return codi;
    }
    public void setCodi(String pCodi){
        codi = pCodi;
    }
    public String getAeroOri(){
        return aeroportOri;
    }
    public void setAeroOri(String pAeroOri){
        aeroportOri = pAeroOri;
    }
    public String getAeroDes(){
        return aeroportDes;
    }
    public void setAeroDes(String pAeroDes){
        aeroportDes = pAeroDes;
    }
    public double getDistancia(){
        return distancia;
    }
    public void setDistancia(double pDistancia){
        distancia = pDistancia;
    }
    
    public void modificarComponent(){
        System.out.println("\nEl codi de la ruta és:" + codi);
        codi = (String)demanarDades("\nQuin és el nou codi de la ruta?",2);
        System.out.println("\nL'aeroport d'origen de la ruta nacional és:" + aeroportOri);
        aeroportOri = (String)demanarDades("\nQuin és el nou l'aeroport d'origen de la ruta?",4);
        System.out.println("\nL'aeroport de destí de la ruta nacional és:" + aeroportDes);
        aeroportDes = (String)demanarDades("\nQuin és el nou l'aeroport de destí de la ruta?",4);
        System.out.println("\nLa distància de la ruta és:" + distancia);
        distancia = (double)demanarDades("\nQuina és la nova distància de la ruta?",4);
    }
    
    public void mostrarComponent(){
        System.out.println("\nLes dades de la ruta amb codi " + codi + " són:");
        System.out.println("\nAeroport d'origen: " + aeroportOri);
        System.out.println("\nAeroport de destí: " + aeroportDes);
        System.out.println("\nDistància: " + distancia);
    }
}
