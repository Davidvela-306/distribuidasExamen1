import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BMIRremoto extends Remote {
    // Métodos que el cliente puede invocar, todos se declaran aquí
    // Todos deben lanzar la excepción RemoteException

    double BMI(double peso, double altura) throws RemoteException;

    String categoriaBMI(double bmi) throws RemoteException;
}
