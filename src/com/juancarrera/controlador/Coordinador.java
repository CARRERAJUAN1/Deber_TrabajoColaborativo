/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juancarrera.controlador;

import com.juancarrera.modelo.Punto;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Coordinador {
     ArrayList<Punto > puntos=new ArrayList<Punto>();
    
    public void almacenarPuntos(Punto p) {
        p.setX(Integer.parseInt(JOptionPane.showInputDialog("Ingrese X:")));
          p.setY(Integer.parseInt(JOptionPane.showInputDialog("Ingrese Y:")));
          puntos.add(p);
    }
     public String imprimirPuntos(){
        String datos = "";
        for(Punto punto : puntos) {
            datos += (1+puntos.indexOf(punto))+".-"+ punto.toString()+"\n";
        }
        return datos;
        
    }
      public void calcularDistancia() {
      int sel1;
      int sel2;
              try{
                  sel1=Integer.parseInt(JOptionPane.showInputDialog(imprimirPuntos()
                  +"ingrese un punto"));
                   sel2=Integer.parseInt(JOptionPane.showInputDialog(imprimirPuntos()
                  +"ingrese un punto"));
                   double v1= Math.pow(puntos.get(sel2).getX()-puntos.get(sel1).getX(),2);
                   double v2=Math.pow(puntos.get(sel2).getY()-puntos.get(sel1).getY(),2);
                   double dis=Math.sqrt(v1+v2);
                   JOptionPane.showConfirmDialog(null, dis);
                  
              }catch (Exception e){
                  System.out.println(e.getMessage());
                  
              }
//        double v1=Math.pow(((double)p2.getX()-(double)p1.getX()),2);
//        double v2=Math.pow(((double)p2.getY()-(double)p1.getY()),2);
//        return Math.sqrt(v1+v2);
    }
     public void menu(){
         int op = 0;
         do{
          try{
         
        op =Integer.parseInt(JOptionPane.showInputDialog("seleccione una opcion: \n"
         +"1.- Ingrese Punto\n"
         +"2.- Calcular Distancia entre dos puntos\n"
         +"3.- Definir ubicación\n"
         +"4.- Imprimir Puntos\n"
         +"5.- Calcular distancias a la torre de control\n"
         +"6.- Salir"));
         
                switch(op){
           case 1:
               ingresarPunto();
               break;
           case 2:
          calcularDistancia();
               break;
           case 3:
               break;
           case 4:
               JOptionPane.showMessageDialog(null,imprimirPuntos());
               break;
                }
               
            }catch(Exception e){
             System.out.println("error");
                 }
         
           
         } while (op!=6);
     }
   public void ingresarPunto(){
       int x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese x"));
       int y=Integer.parseInt(JOptionPane.showInputDialog("Ingrese y"));
       puntos.add(new Punto(x,y));
   } 
  
    
}
