
package metodos;


public class operacion {
     int resta ;
    int suma;
    int multiplicacion;
    int division;
    
    public void sumar (int numero1,int numero2 ){
        suma = numero1 + numero2;
    }
    public void restar (int numero1,int numero2 ){
        resta =numero1-numero2;
    }
    public void multiplicar(int numero1,int numero2){
        multiplicacion=numero1*numero2;
        
    }
    public void division(int numero1,int numero2){
        division=numero1/numero2;
    }    
    public void resultados(){
        System.out.println("el resultado de la suma es: "+suma);
        System.out.println("el resultado de la resta es: "+resta);
        System.out.println("el resultado de la multiplicacion es: "+multiplicacion);
        System.out.println("el resultado de la division es: "+division);
        
    }
}
