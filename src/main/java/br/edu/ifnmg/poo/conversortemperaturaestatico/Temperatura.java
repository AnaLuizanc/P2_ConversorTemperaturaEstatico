package br.edu.ifnmg.poo.conversortemperaturaestatico;

/**
 *
 * @author analu
 */
public class Temperatura {

    static double temperatura;

    //<editor-fold defaultstate="collapsed" desc="Getters / Setters">
    public static double getTemperatura() {
        return temperatura;
    }

    public static void setTemperatura(double temperatura) {
        Temperatura.temperatura = temperatura;
    }
//</editor-fold>

    public static double converteKelvinParaCelsius() throws TemperaturaInvalidaException {
        if (Temperatura.temperatura < 0) {
            throw new TemperaturaInvalidaException("Valor da temperatura abaixo do zero absoluto");
        } else {
            return Temperatura.temperatura - 273.15;
        }
    }

    public static double converteKelvinParaFahrenheit() throws TemperaturaInvalidaException {
        if (temperatura < 0) {
            throw new TemperaturaInvalidaException("Valor da temperatura abaixo do zero absoluto");
        } else {
            return (temperatura * 9.0 / 5) - 459.67;
        }
    }
}
