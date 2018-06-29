/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beansgui;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *Esta clase pretende construir un Bean para incluir
 * imágenes
 * @author Nahuel E Correa
 * 
 */
public class BeanImageVisor extends JLabel{
    
    public BeanImageVisor(){
        
        setBorder(BorderFactory.createEtchedBorder());
        
    }
    
    /**
     * Método clave para escoger imagen desde una ruta del HHD
     * @param elegirImagen.
     * Este parámetro te permitrirá escoger una imagen
     * 
     */
    public void setescogeimagen(String elegirImagen){
        
        try{
            
            archivo = new File(elegirImagen);
            
            setIcon(new ImageIcon(ImageIO.read(archivo)));
            
        }catch(IOException e){
            
            archivo = null;
            
            setIcon(null);
            
        }
        
        
    }
    
    /**
     * 
     * @return.
     * Este método devuelve la ruta de a imagen escogida
     * con setEscigeImagen
     * 
     */
    public String getEscogeImagen(){
        
        if(archivo == null) return null;
        
        else return archivo.getPath();
    }
    
    @Override
    public Dimension getPreferredSize(){
        
        return new Dimension(600, 400);
    }
    
    /**
     * El tamaño máximo de megas
     * @param No recibe parámetro alguno
     */
    public static int PruebaConstante=5;
    
    private File archivo = null;
}
