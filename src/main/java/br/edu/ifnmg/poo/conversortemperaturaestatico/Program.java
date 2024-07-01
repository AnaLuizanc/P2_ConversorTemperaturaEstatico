package br.edu.ifnmg.poo.conversortemperaturaestatico;

/**
 *
 * @author analu
 */
public class Program {

    public static void main(String[] args) {

        System.out.println("KELVIN -> CELSIUS");

        //<editor-fold defaultstate="collapsed" desc="Testes de conversão de Kelvin para Celsius">
        try {
            Temperatura.setTemperatura(20.0);
            System.out.println(">> Resultado: " + Temperatura.conversorKelvinParaCelsius() + " °C");

        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        try {
            Temperatura.setTemperatura(37.9);
            System.out.println(">> Resultado: " + Temperatura.conversorKelvinParaCelsius() + " °C");

        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        try {
            Temperatura.setTemperatura(-10.0);
            System.out.println(">> Resultado: " + Temperatura.conversorKelvinParaCelsius() + " °C");

        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
//</editor-fold>

        System.out.println("KELVIN -> FAHRENHEIT");

        //<editor-fold defaultstate="collapsed" desc="Testes de conversão de Kelvin para Fahrenheit">
        try {
            Temperatura.setTemperatura(20.0);
            System.out.println("Resultado: " + Temperatura.conversorKelvinParaFahrenheit() + " °F");
        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        try {
            Temperatura.setTemperatura(37.9);
            System.out.println("Resultado: " + Temperatura.conversorKelvinParaFahrenheit() + " °F");
        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        try {
            Temperatura.setTemperatura(-10.0);
            System.out.println("Resultado: " + Temperatura.conversorKelvinParaFahrenheit() + " °F");
        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
//</editor-fold>

    }
}
