public class pruebaOperaciones {

    public static void main(String[] args) {

        aritmetica aritmetica1 = new aritmetica();
        aritmetica1.a = 3 ;
        aritmetica1.b = 2 ;
        aritmetica1.sumar();

        int resultado = aritmetica1.sumarConRetorno() ; 

        System.out.println("Resultado desde clase prueba : "+resultado);

        aritmetica1.sumarConArgumentos(5,8); 

        
    }
    

        
    
}
