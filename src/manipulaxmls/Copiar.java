/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulaxmls;

import java.io.File;
import java.util.Date;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author Rodrigo
 */
public class Copiar {
  
         
        public File diretorio;
        public String caminho = ".";
        public String origemNfe;
        
        
     public void copiarXml(String origemNfe){
       
        File diretorio;
            diretorio = new File(origemNfe);
        if(diretorio.exists()){
        Date modifica = new Date(diretorio.lastModified());
        System.out.println("ultima modificacao: " + modifica);
        
        File[] lista = diretorio.listFiles();
        File destino = new File (System.getProperty("user.home") + "\\desktop\\contador");
        if (destino.exists()){
            
        }else{
            destino.mkdir();
        }
        for (File lista1 : lista) {
             
            Date dataArq = new Date(lista1.lastModified());
            int anoArq = dataArq.getYear()+1900;
            int mesArq = dataArq.getMonth()+1;
            File pastaAno = new File (System.getProperty("user.home") + "\\desktop\\contador" + "\\" + anoArq);
            File pastaMes = new File (System.getProperty("user.home") + "\\desktop\\contador" + "\\" + anoArq + "\\" + mesArq);
            if (pastaAno.exists()){
            
            }else{
            pastaAno.mkdir();
             }
            if (pastaMes.exists()){
            
            }else{
            pastaMes.mkdir();
             }
            String nomeArq = lista1.getName();
            if (nomeArq.length() == 51){
            try {
                 

            destino = pastaMes;
            FileUtils.copyFileToDirectory(lista1, destino);

            } catch (Exception ex) {
                 System.out.println("ERRO! " + ex);
            }  
                        }
                     }
                }
                    else{
                        System.out.println("CAMINHO INEXISTENTE !!!");
                        System.out.println("diretorio :" + diretorio);
                    }
                }
    }
     //* @param args the command line arguments  

