/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boletin12_1;

import javax.swing.JOptionPane;

/**
 *
 * @author mmartinezcosta
 */
public class Garaje {
private int numeroCoches;
    private String matricula;
    private float tiempo, euros;
    private double precio;
    
    public boolean estado(){
        if (numeroCoches<5){
            System.out.println("Plazas Disponibles");
            return true;
        }
        else {
            System.out.println("Completo");
            return false;
        }
    }
    public void entrada(){
        numeroCoches++;
    }
    public void salida(){
        numeroCoches--;
    }
    public float compruebaEuros(){
        euros=Float.parseFloat(JOptionPane.showInputDialog("Dinero entregado? "));
        while (euros<0||euros<precio){
            JOptionPane.showMessageDialog(null, "Cantidad incorrecta intentelo de nuevo");
            euros=Float.parseFloat(JOptionPane.showInputDialog("Dinero entregado? "));
        }
        return euros;
    }
    public float compruebaTiempo(){
        tiempo=Float.parseFloat(JOptionPane.showInputDialog("Duracion del parking?"));
        while (tiempo<0){
            JOptionPane.showMessageDialog(null, "Cantidad incorrecta intentelo de nuevo");
            tiempo=Float.parseFloat(JOptionPane.showInputDialog("Duracion de parking?"));
        }
        return tiempo;
    }
    
    public double calculo(){
        if (tiempo<=3) precio=1.5;
        else precio=1.5+(tiempo-3)*0.2;
        return precio;
    }
    
    public void entraDatos(){
        matricula=(JOptionPane.showInputDialog("Matricula del coche?"));
        compruebaTiempo();
        compruebaEuros();
    }
    public void factura(){
        System.out.println("FACTURA");
        System.out.println("Matricula del coche: "+matricula);
        System.out.println("Tiempo: "+tiempo);
        System.out.println("Precio: "+precio);
        System.out.println("Dinero recivido: "+euros);
        System.out.println("Dinero devuelto: "+(euros-precio));
        System.out.println("\nGracias por venir");
    }
    
    public void programa(){
        numeroCoches=Integer.parseInt(JOptionPane.showInputDialog("Cantidad de coches en el garage?"));
        while (estado()==true){
            entrada();
            entraDatos();
            calculo();
            factura();
        }
    }
}

