package models;

public class Libro {
    private int id;
    private static int nextID = 1;
    private String titulo;
    private String autor;
    private double precio;
    private int copias;

    public Libro(){
        this.id = this.nextID;
        this.nextID++;
    }

    public Libro titulo(String titulo){
        this.titulo = titulo;
        return this;
    }

    public Libro autor(String autor){
        this.autor = autor;
        return this;
    }

    public Libro precio(double precio){
        this.precio = precio;
        return this;
    }

    public Libro copias(int copias){
        this.copias = copias;
        return  this;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", precio=" + precio +
                ", copias=" + copias +
                '}';
    }

    public void venta(int cant){
        if(this.copias > cant){
            this.copias = this.copias - cant;
        }else{
            System.out.println("ERROR: Cantidad de copias insuficientes");
        }
    }

    public void sumaInventario(int cant){
        this.copias = this.copias + cant;
    }

}
