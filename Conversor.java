import java.math.BigDecimal;
import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        System.out.println("Bienvenido al Conversor de Moneda.");
        System.out.println("Por favor ingrese una cantidad en Euros y el programa le devolvera la conversión en dólares americanos.");
    
        Scanner scanner = new Scanner(System.in);
        
        Double euros = scanner.nextDouble();

        double dolares = 1.09 * euros;

        System.out.println(euros + "euros equivalen a " +dolares+"u$ dolares.");

        String eurosString = Double.toString(euros);

        BigDecimal eurosBigDecimal = new BigDecimal(eurosString);

        Double tasaDeCambio = 1.09;

        String tasaDeCambioString = Double.toString(tasaDeCambio);

        BigDecimal tasaDeCambioBigDecimal = new BigDecimal(tasaDeCambioString);

        BigDecimal dolaresBigDecimal = eurosBigDecimal.multiply(tasaDeCambioBigDecimal);

        System.out.println(euros +"Euros equivalen a " + dolaresBigDecimal.toString() + "u$ dolares");


    }
}
