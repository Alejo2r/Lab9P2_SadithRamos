/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p2_sadithramos;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Torneo {
  public String nombre;
  public ArrayList<String> listap = new ArrayList<String>();
  public boolean flag;
  public boolean continua;
  public String ganador;

    public Torneo(String nombre, boolean flag, boolean continua, String ganador,ArrayList<String> listap) {
        this.nombre = nombre;
        this.flag = flag;
        this.continua = continua;
        this.ganador = ganador;
        this.listap = listap;
    }
  
    

    public Torneo(String ganador) {
        this.ganador = ganador;
    }

    public boolean isContinua() {
        return continua;
    }

    public void setContinua(boolean continua) {
        this.continua = continua;
    }
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getListap() {
        return listap;
    }

    public void setListap(ArrayList<String> listap) {
        this.listap = listap;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }
  
  
  
}
