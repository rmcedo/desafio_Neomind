package relogio.object;

import java.util.Objects;

public class Relogio {

    private int hora;
    private int minuto;

    public Relogio() {
    }

    public Relogio(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Relogio relogio = (Relogio) o;
        return hora == relogio.hora && minuto == relogio.minuto;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hora, minuto);
    }

    public int retornaAnguloRelogio(int hora, int minuto){

        if (hora >12 ) {
            hora -=12;

        }
        // (360/12)
        int angHora = 30 * hora;
        // (360/60)
        int angMinuto = 6 * minuto;

        if(angHora>angMinuto){
            return angHora-angMinuto;
        }
            return angMinuto-angHora;


    }
}
