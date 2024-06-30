package br.edu.ifnmg.poo.conversortemperaturaestatico;

/**
 * 
 * @author analu
 */
public class TemperaturaInvalidaException extends Exception {

   public TemperaturaInvalidaException(){
   }
    
    public TemperaturaInvalidaException(String mensagem) {
        super(mensagem);
    }
}
