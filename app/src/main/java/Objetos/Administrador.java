package Objetos;

import java.util.Objects;

public class Administrador
{
    //Declaro variables
    private int id;
    private String wirrinUy;
    private String elkatuchiNemul;

    public Administrador()
    {
        //Inicializo variables.
        wirrinUy = "Norma";
        elkatuchiNemul = "123";
    }

    public Administrador(int id,String wirrinUy,String elkatuchiNemul)
    {
        this.id = id;
        this.wirrinUy = wirrinUy;
        this.elkatuchiNemul = elkatuchiNemul;
    }

    //Creo get and setters(acceder o cambiar valores).


    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getWirrinUy() {return wirrinUy;}

    public void setWirrinUy(String wirrinUy) {this.wirrinUy = wirrinUy;}

    public String getElkatuchiNemul() {return elkatuchiNemul;}

    public void setElkatuchiNemul(String elkatuchiNemul) {this.elkatuchiNemul = elkatuchiNemul;}

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Administrador that = (Administrador) o;
        return id == that.id && Objects.equals(wirrinUy, that.wirrinUy) && Objects.equals(elkatuchiNemul, that.elkatuchiNemul);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, wirrinUy, elkatuchiNemul);
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "id=" + id +
                ", wirrinUy='" + wirrinUy + '\'' +
                ", elkatuchiNemul='" + elkatuchiNemul + '\'' +
                '}';
    }
}
