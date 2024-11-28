import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServidorRMI {
    public static void main(String[] args) {
        try {
            // Instancia de implementaciòn de la interfaz:
            BMIRremoto objetoRemoto = new BMIRremotoImpl();
            // Crear y obtener el registro de nombres de RMI:
            Registry registro = LocateRegistry.createRegistry(1234);
            // Vincular el objeto remoto con el nombre que se le asigna (ClienteRemoto):
            registro.rebind("ClienteRemoto", objetoRemoto);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }
}
