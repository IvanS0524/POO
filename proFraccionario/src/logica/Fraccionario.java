package logica;

/**
 *
 * @author ivans
 */
public class Fraccionario{
    private int numerador;
    private int denominador;
    
    public Fraccionario(){
    }
    public Fraccionario(int numerador, int denominador){
        this.numerador = numerador;
        //this.denominador = denominador;
        this.setDenominador(denominador);
    }
    
    public int getNumerador(){
        return numerador;
    }

    public void setNumerador(int numerador){
        this.numerador = numerador;
    }

    public int getDenominador(){
        return denominador;
    }

    public void setDenominador(int denominador){
        if(denominador==0){
            System.out.println("No se puede dividir entre cero");
        }
        else{
            this.denominador = denominador;
        }
    }
    
    @Override
    public String toString() 
    {
        return "(" + numerador + "/" + denominador +")";
    }
}
