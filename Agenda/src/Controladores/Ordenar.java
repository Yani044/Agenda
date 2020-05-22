/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelo.Contactos;
import java.util.Comparator;

/**
 *
 * @author sarai
 */
public class Ordenar implements Comparator<Contactos>{

    @Override
    public int compare(Contactos a1, Contactos a2) {
     if(a1.getApellido().compareToIgnoreCase(a2.getApellido()) == -1){
            return -1;
        }else if(a1.getApellido().compareToIgnoreCase(a2.getApellido()) == 0){
            return 0;
        }else{
            return 1;
        }
    
    }
    
    
    
    
}
