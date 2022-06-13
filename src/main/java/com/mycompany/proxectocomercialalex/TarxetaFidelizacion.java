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

    public TarxetaFidelizacion() {
    }

    public TarxetaFidelizacion(int puntosIniciais) {
        this.puntos = puntosIniciais;
    }
    
    public boolean obterPuntos(int valorCompra){
        return true;
    }
    
    public boolean abonarGaraxe(){
        return true;
    }
    
    public int obterRegalo(int numPuntosRegalo){
        return numPuntosRegalo;
    }

    @Override
    public String toString() {
        return "TarxetaFidelizacion{" + "puntos=" + puntos + '}';
    }
    
    

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    
}
