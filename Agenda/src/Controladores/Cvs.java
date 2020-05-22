/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelo.Contactos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author sarai
 */
public abstract class  Cvs {
    public static void exportar(String archivo,String extencion,ArrayList <Contactos> agenda){
    

    FileWriter arch = null;
    PrintWriter newArch = null;
    String nombre= archivo+extencion;
    try{
        
        arch = new FileWriter(nombre);
        newArch = new PrintWriter(arch);
        System.out.println("Escribiendo en: "+ nombre);
        for(int i= 0; i<agenda.size();i++){
            newArch.print(agenda.get(i).getApellido()+" "+agenda.get(i).getNombre()+" "+agenda.get(i).getTelefono()+" "+agenda.get(i).getDireccion()+" ");
        }
        } catch (Exception e) {
        e.printStackTrace();
        } finally {
            try {
                if (null != arch)
                arch.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
} 

    public static void importar(String nombre){

     File archivo = null;
     FileReader fr = null;
     BufferedReader br = null;
     try {
            archivo = new File (nombre);
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);

            System.out.println("Leyendo el contendio de: "+nombre);
            String linea;
            while((linea=br.readLine())!=null)
            System.out.println(linea);

        }

        catch(Exception e){

           e.printStackTrace();

        }finally{

           try{

              if( null != fr ){

                 fr.close();

              }

           }catch (Exception e2){

              e2.printStackTrace();

           }

        }

    }

}
