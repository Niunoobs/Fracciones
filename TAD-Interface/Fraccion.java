public class Fraccion implements interfaceFraccion
{
    //Atributos
    int numerador = 0;
    int denominador = 1;

    //Métodos
    
    //Constructor
    public Fraccion(int n, int d){
        this.numerador = n;
        this.denominador = d;
    }


    public void dividir(int num, int denom)
    {
        int nuevoNumerador = this.numerador * denom;
        int nuevoDenominador = this.denominador * num;
    
       Fraccion fraccionResultado = new Fraccion(nuevoNumerador, nuevoDenominador);
       System.out.println("La división es : " + nuevoNumerador + "/" + nuevoDenominador);
    } //dividir
    
    public void Multiplicar(int num, int denom){
        int nuevoNumerador = this.numerador * num;
        int nuevoDenominador = this.denominador * denom;

       Fraccion fraccionResultado = new Fraccion(nuevoNumerador, nuevoDenominador);
       System.out.println("La multiplicacion es : " + nuevoNumerador + "/" + nuevoDenominador);
    } //multiplicar

    public void Suma(int num, int denom){
        int nuevoNumerador = (this.numerador * denom)+(this.denominador * num);
        int nuevoDenominador = this.denominador * denom;
            
        Fraccion fraccionResultado = new Fraccion(nuevoNumerador, nuevoDenominador);
        System.out.println("La suma es : " + + nuevoNumerador + "/" + nuevoDenominador);
    }//suma
        
    public void Resta(int num, int denom){
        int nuevoNumerador = (this.numerador * denom)-(this.denominador * num);
        int nuevoDenominador = this.denominador * denom;
            
        Fraccion fraccionResultado = new Fraccion(nuevoNumerador, nuevoDenominador);
        System.out.println("La Resta es : " + nuevoNumerador + "/" + nuevoDenominador);
    }//Resta
    
    public void raizCuadrada(){
       int nuevoNumerador = this.numerador * this.numerador;
       int nuevoDenominador = this.denominador * this.denominador;

       Fraccion fraccionResultado = new Fraccion(nuevoNumerador, nuevoDenominador);
       System.out.println("La Raíz cuadrada es : " + nuevoNumerador + "/" + nuevoDenominador);
    }//Raiz
    
    public void potencia(int num){
       double nuevoNumerador1 = Math.pow(this.numerador, num);
       double nuevoDenominador1 = Math.pow(this.denominador, num);
       int nuevoNumerador = (int) Math.round(nuevoNumerador1);
       int nuevoDenominador = (int) Math.round(nuevoDenominador1);
       
       Fraccion fraccionResultado = new Fraccion(nuevoNumerador, nuevoDenominador);
       System.out.println("La potencia es : " + nuevoNumerador + "/" + nuevoDenominador);

    }//Potencia
    
    public double Porcentaje(){

       double fraccionResultado = (double) this.numerador / (double) this.denominador * 100;
       System.out.println("El porcentaje es : " + fraccionResultado + "%");
       return fraccionResultado;
    }//Porcentaje
    
    public double Decimal(){

       double fraccionResultado = (double) this.numerador / (double) this.denominador;
       System.out.println("El decimal es : " + fraccionResultado);
       return fraccionResultado;
    }//Decimal

/*Definir las operaciones definidas en el TDA
    


    restar()


    potencia()*/
}