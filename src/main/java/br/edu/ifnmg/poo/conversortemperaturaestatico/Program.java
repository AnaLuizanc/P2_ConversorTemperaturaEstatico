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

        System.out.println("CELSIUS -> KELVIN");

        //<editor-fold defaultstate="collapsed" desc="Testes de conversão de Celsius para Kelvin">
        try {
            Temperatura.setTemperatura(39.2);
            System.out.println(">> Resultado: " + Temperatura.conversorCelsiusParaKelvin() + " K");
        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        try {
            Temperatura.setTemperatura(-274.0);
            System.out.println(">> Resultado: " + Temperatura.conversorCelsiusParaKelvin() + " K");
        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        try {
            Temperatura.setTemperatura(42.0);
            System.out.println(">> Resultado: " + Temperatura.conversorCelsiusParaKelvin() + " K");
        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

//</editor-fold>
        System.out.println("CELSIUS -> FAHRENHEIT");

        //<editor-fold defaultstate="collapsed" desc="Testes de conversão de Celsius para Fahrenheit">
        try {
            Temperatura.setTemperatura(39.2);
            System.out.println(">> Resultado: " + Temperatura.conversorCelsiusParaFahrenheit() + " °F");
        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        try {
            Temperatura.setTemperatura(-274.0);
            System.out.println(">> Resultado: " + Temperatura.conversorCelsiusParaFahrenheit() + " °F");
        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        try {
            Temperatura.setTemperatura(42.0);
            System.out.println(">> Resultado: " + Temperatura.conversorCelsiusParaFahrenheit() + " °F");
        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
//</editor-fold>

        System.out.println("FAHRENHEIT -> KELVIN");

//<editor-fold defaultstate="collapsed" desc="Testes de conversão de Fahrenheit para Kelvin">
        try {
            Temperatura.setTemperatura(90.0);
            System.out.println(">> Resultado: " + Temperatura.conversorFahrenheitParaKelvin() + " K");
        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        try {
            Temperatura.setTemperatura(-474.0);
            System.out.println(">> Resultado: " + Temperatura.conversorFahrenheitParaKelvin() + " K");
        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        try {
            Temperatura.setTemperatura(23.7);
            System.out.println(">> Resultado: " + Temperatura.conversorFahrenheitParaKelvin() + " K");
        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

//</editor-fold>
        System.out.println("FAHRENHEIT -> CELSIUS");

//<editor-fold defaultstate="collapsed" desc="Testes de conversão de Fahrenheit para Celsius">
        try {
            Temperatura.setTemperatura(90.0);
            System.out.println(">> Resultado: " + Temperatura.conversorFahrenheitParaCelsius() + " °C");
        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        try {
            Temperatura.setTemperatura(-474.0);
            System.out.println(">> Resultado: " + Temperatura.conversorFahrenheitParaCelsius() + " °C");
        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        try {
            Temperatura.setTemperatura(23.7);
            System.out.println(">> Resultado: " + Temperatura.conversorFahrenheitParaCelsius() + " °C");
        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

//</editor-fold>
    }
}
