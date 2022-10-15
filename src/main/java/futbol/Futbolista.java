package futbol;

public abstract class Futbolista implements Comparable<Object> {
    private String nombre;
    private int edad;
    private static String posicion;

    public Futbolista() {
        this("Maradona", 30, "delantero");

    }

    public Futbolista(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        Futbolista.posicion = posicion;
    }

    public String toString(){
        return "El futbolista " + nombre + " tiene " + edad + ", y juega de " + posicion;
    }

    public boolean equals(Futbolista f){
        return this == f;
    }

    public abstract boolean jugarConlasManos();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static String getPosicion() {
        return posicion;
    }

    public static void setPosicion(String posicion) {
        Futbolista.posicion = posicion;
    }
}


