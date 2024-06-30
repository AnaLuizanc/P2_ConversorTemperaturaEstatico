package br.edu.ifnmg.poo.conversortemperaturaestatico;

/**
 *
 * @author analu
 */
public class Program {

    public static void main(String[] args) {

        System.out.println("KELVIN -> CELSIUS");
        
        try {
            Temperatura.setTemperatura(20.0);
            System.out.println(">> Resultado: " + Temperatura.converteKelvinParaCelsius());

        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
        
        try {
            Temperatura.setTemperatura(37.9);
            System.out.println(">> Resultado: " + Temperatura.converteKelvinParaCelsius());

        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
        
        try {
            Temperatura.setTemperatura(-10.0);
            System.out.println(">> Resultado: " + Temperatura.converteKelvinParaCelsius());

        } catch (TemperaturaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

    }
}
