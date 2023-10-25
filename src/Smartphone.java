/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PROPIETARIO
 */
public class Smartphone implements Camara, NavegadorDeInternet, ReproductorDeMusica {
    public String marca;
    public String modelo;
    public String tamaño;
    public String precio;
    public Smartphone(String marca, String modelo, String tamaño, String precio){
        this.marca = marca;
        this.modelo = modelo;
        this.tamaño= tamaño;
        this.precio = precio;
    }
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String gettamaño(){
        return this.tamaño;
    }
    public void settamaño(String tamaño){
        this.tamaño = tamaño;
    }
    public String getprecio(){
        return this.precio;
    }
    public void setprecio(String precio){
        this.precio = precio;
    
        
    }

    @Override
    public void grabarVideo() {
        System.out.print("grabar el video "); 
    }

    @Override
    public void navegar() {
        System.out.print(" navegar en google "); 
    }

    @Override
    public void buscar() {
        System.out.print("buscar "); 
    }

    @Override
    public void actualizar() {
        System.out.print("actualizar");
    }

    @Override
    public void Reproducirmusica() {
        System.out.print("reproducir musica ");
    }

    @Override
    public void Detenermusica() {
        System.out.print("detener musica"); 
    }
}


