public class clasePrincipal
{

 public static void main(String args[]){
     Fraccion unCuarto = new Fraccion(1,4);
     Fraccion resDiv = unCuarto.dividir(1,3);   
     Fraccion resMul = unCuarto.Multiplicar(5,7);
     
     System.out.println("Obj Un cuarto: " + 
                  unCuarto.numerador + "/" + unCuarto.denominador);
     System.out.println("resultado división: " + 
                  resDiv.numerador + "/" + resDiv.denominador);
     System.out.println("resultado multiplicación: " + 
                  resMul.numerador + "/" + resMul.denominador);
    
 }
   
}

/*

1/4

1        1      3
--  div  --  =  --
4        3      4

1  *  5    5
--    -- = --
4     7    28

*/