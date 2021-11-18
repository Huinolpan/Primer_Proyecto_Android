package Objetos;

public class Productos 
{
    private String[] productos = {"Latas","Vidrio","Papel","Cartones","Tetra-Pack","Plasticos","Aceite","Tela"};
    private int id;
    
    public Productos()
    {
    }
    
    public Productos(String[] productos,int id)
    {
        this.productos = productos;
        this.id =id;
    }

    public String[] getProductos() {return productos;}

    public void setProductos(String[] productos) {this.productos = productos;}

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}
}
