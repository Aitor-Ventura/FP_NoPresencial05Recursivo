import es.ulpgc.eii.recursive.MathUtils;

public class Main {
    /**
     * Prueba el método
     * @param input - expresión a evaluar
     * @param expected - resultado esperado
     */
    static void test(String input, int expected) {
        // Se informa del caso que se está probando
        System.out.println("probando: evaluate(" + input +")");
        
        // Llamada al método a probar
        int result = MathUtils.evaluate(input);
        
        // Comprobación de los resultados
        if (result != expected) {
            System.out.print(">> Resultado erróneo, deberia ser: " + expected + "");
            System.out.println(" y es: " + result + "");
        } else {
            System.out.println(">> Resultado correcto: " + result + "");
        }        
    }

    /**
     * Invoca a test para realizar múltiples pruebas
     * @param args
     */
    public static void main(String[] args) {
        test("(2)+(2)", 4);
   }
}