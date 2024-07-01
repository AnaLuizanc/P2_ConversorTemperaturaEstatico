package br.edu.ifnmg.poo.conversortemperaturaestatico;

/**
 * Classe de conversão de temperaturas.
 *
 * @author AnaLuizanc
 */
public class Temperatura {

    private static double temperatura;

    //<editor-fold defaultstate="collapsed" desc="Getters / Setters">
    public static double getTemperatura() {
        return temperatura;
    }

    public static void setTemperatura(double temperatura) {
        Temperatura.temperatura = temperatura;
    }
//</editor-fold>

    public static double conversorKelvinParaCelsius() throws TemperaturaInvalidaException {
        if (Temperatura.temperatura < 0) {
            throw new TemperaturaInvalidaException();
        } else {
            return Temperatura.temperatura - 273.15;
        }
    }

    public static double conversorKelvinParaFahrenheit() throws TemperaturaInvalidaException {
        if (Temperatura.temperatura < 0) {
            throw new TemperaturaInvalidaException();
        } else {
            return (Temperatura.temperatura * 9.0 / 5) - 459.67;
        }
    }
    
    

}
