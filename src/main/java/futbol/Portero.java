package futbol;

public class Portero extends Futbolista{
    public short golesRecibidos;
    public byte dorsal;

    public Portero(String nombre, int edad,short golesRecibidos, byte dorsal){
        super(nombre,edad,"Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    @Override
    public boolean jugarConlasManos() {
        return true;
    }

    @Override
    public int compareTo(Object o) {
        int goles = Math.abs(this.getGolesRecibidos() - ((Portero) o).getGolesRecibidos());
        return goles;
    }

    @Override
    public String toString(){
        return super.toString() + " con el dorsal " + dorsal + ". Le han marcado " + golesRecibidos;
    }

    public short getGolesRecibidos() {
        return golesRecibidos;
    }

    public void setGolesRecibidos(short golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

    public byte getDorsal() {
        return dorsal;
    }

    public void setDorsal(byte dorsal) {
        this.dorsal = dorsal;
    }
}
