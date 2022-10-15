package futbol;

public class Jugador extends Futbolista{
    public short golesMarcados;
    public byte dorsal;

    public Jugador() {
        super();
        this.golesMarcados = 289;
        this.dorsal = 7;
    }

    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }

    @Override
    public boolean jugarConlasManos() {
        return false;
    }

    @Override
    public int compareTo(Object f) {
        int edad = Math.abs(this.getEdad() - ((Jugador) f).getEdad());
        return edad;
    }

    public String toString(){
        return "El futbolista" + getNombre() + " tiene" + getEdad() + ", y juega de" + getPosicion() +
                " con la dorsal" + dorsal + ". Ha marcado" + golesMarcados;
    }

    public short getGolesMarcados() {
        return golesMarcados;
    }

    public void setGolesMarcados(short golesMarcados) {
        this.golesMarcados = golesMarcados;
    }

    public byte getDorsal() {
        return dorsal;
    }

    public void setDorsal(byte dorsal) {
        this.dorsal = dorsal;
    }
}
