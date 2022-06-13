/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectocomercialalex;

/**
 *
 * @author a21alejandrogl - Alejandro García Losas
 */
public class TarxetaFidelizacion {
    
    private int puntos;

    /**
     *
     */
    public TarxetaFidelizacion() {
    }
    
    /**
     *
     * @param puntosIniciais
     */
    public TarxetaFidelizacion(int puntosIniciais) {
        this.puntos = puntosIniciais;
    }
    
    /**
     *
     * @param valorCompra
     * @return
     */
    public boolean obterPuntos(int valorCompra){
        int numPuntos = valorCompra/EUROS_PUNTO;
        if (numPuntos > 0) {
            this.puntos+=numPuntos;
            return true;
        }else{
            return false;
        }
    }
    private static final int EUROS_PUNTO = 20;
    
    /**
     *
     * @return
     */
    public boolean abonarGaraxe(){
        if (this.puntos>=1){
            this.puntos--;
            return true;
        }
        return false;
    }
    
    /**
     *
     * @param numPuntosRegalo
     * @return
     */
    public int obterRegalo(int numPuntosRegalo){
        int resultado = 0;
        if (faltanPuntosRegalo(numPuntosRegalo)){
            resultado = -1; 
        } else if (this.puntos == numPuntosRegalo){
            this.puntos = resultado;
        } else {
            this.puntos -= numPuntosRegalo;
            resultado = 1;
        }
        return resultado;
    }

    /**
     *
     * @param numPuntosRegalo
     * @return
     */
    public boolean faltanPuntosRegalo(int numPuntosRegalo) {
        if(numPuntosRegalo > puntos){
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return "TarxetaFidelizacion{" + "puntos=" + puntos + '}';
    }
    
    /**
     *
     * @return
     */
    public int getPuntos() {
        return puntos;
    }

    /**
     *
     * @param puntos
     */
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    
}
