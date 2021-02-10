package es.ulpgc.eii.recursive;

/*  Aitor Ventura Delgado
    13.03.2019
    
    Crearemos un método que resuelva expresiones aritméticas contenidas en la expresión
    pasada en forma de String, de manera recursiva. */

public class MathUtils {
    public static int evaluate(String s1){
        //Guardamos en n la posición del operador principal de la expresión
        int n = es.ulpgc.eii.strings.StringUtils.exprMainOperator(s1);
        
        /* Si n llega a ser igual al tamaño de la String pasada por parámetro,
        devolveremos el valor resultante del algoritmo */
        if (n == s1.length()){
            return Integer.parseInt(s1);
        } else {
            /* A no ser así, iremos buscando operadores de suma, resta, divisor o multipli
            cación, e ir separando el problema en varias partes */
            int a = evaluate(s1.substring(1, n-1));
            int b = evaluate(s1.substring(n+2, s1.length()-1));
            
            if (s1.charAt(n) == '+'){
                int res = a + b;
                return res;
            }
            
            if (s1.charAt(n) == '-'){
                int res = a - b;
                return res;
            }
            
            if (s1.charAt(n) == '/'){
                int res = a/b;
                return res;
            }
            
            if (s1.charAt(n) == '*'){
                int res = a*b;
                return res;
            }
        }
        return 0;
    }
}