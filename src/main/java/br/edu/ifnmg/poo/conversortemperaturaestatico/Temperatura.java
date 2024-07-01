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

    public static double conversorCelsiusParaKelvin() throws TemperaturaInvalidaException {
        if (Temperatura.temperatura < -273.15) {
            throw new TemperaturaInvalidaException();
        } else {
            return Temperatura.temperatura + 273.15;
        }
    }

    public static double conversorCelsiusParaFahrenheit() throws TemperaturaInvalidaException {
        if (Temperatura.temperatura < -273.15) {
            throw new TemperaturaInvalidaException();
        } else {
            return 9.0 / 5 * Temperatura.temperatura + 32;
        }
    }

    public static double conversorFahrenheitParaKelvin() throws TemperaturaInvalidaException {
        if (Temperatura.temperatura < -459.67) {
            throw new TemperaturaInvalidaException();
        } else {
            return (Temperatura.temperatura + 459.67) * 5.0 / 9;
        }
    }

    public static double conversorFahrenheitParaCelsius() throws TemperaturaInvalidaException {
        if (Temperatura.temperatura < -459.67) {
            throw new TemperaturaInvalidaException();
        } else {
            return (5 * Temperatura.temperatura - 160) / 9.0;
        }
    }

}
