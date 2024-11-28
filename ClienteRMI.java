import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class ClienteRMI {

    public static void main(String[] args) {
        try {
            // Obtener registro en el puerto indicado:
            Registry registro = LocateRegistry.getRegistry("localhost", 1099);

            // Crear instancia de la implementación de la interfaz que hace referencia al
            // objeto remoto (ClienteRemoto):
            BMIRremoto objetoRemoto = (BMIRremoto) registro.lookup("ClienteRemoto");

            // Pedir al usuario que ingrese su peso y altura
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese su peso (en kg): ");
            double peso = scanner.nextDouble();
            System.out.println("Ingrese su altura (en metros): ");
            double altura = scanner.nextDouble();

            // Calcular el BMI
            double bmi = objetoRemoto.BMI(peso, altura);
            System.out.println("Su BMI es: " + bmi);

            // Determinar la categoría del BMI
            String categoria = objetoRemoto.categoriaBMI(bmi);
            System.out.println("Su categoría del BMI es: " + categoria);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}