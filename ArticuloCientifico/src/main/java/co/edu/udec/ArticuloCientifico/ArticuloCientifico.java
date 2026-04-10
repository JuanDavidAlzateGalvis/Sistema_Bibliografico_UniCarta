/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package co.edu.udec.ArticuloCientifico;

/**
 *
 * @author juana
 */
    public class ArticuloCientifico {
        private String id;
        private String titulo;
        private String[] autores; 
        private String tipo;      
        private String ubicacion;  
        private boolean disponible;

    public ArticuloCientifico(String id, String titulo, String[] autores, String tipo, String ubicacion, boolean disponible) {
        this.id = id;
        this.titulo = titulo;
        this.autores = autores;
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.disponible = disponible;
    }

    public boolean contienePalabraClave(String palabra) {
        return this.titulo.toLowerCase().contains(palabra.toLowerCase());
    }
}
