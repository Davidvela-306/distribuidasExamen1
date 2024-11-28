import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class implementacionInterfaz extends UnicastRemoteObject implements interfaz {
    // Trabajamos con el costructor Super:
    public implementacionInterfaz() throws RemoteException {
        super(); // Llamamos al constructor de la clase padre
    }

    // ? calculo del BMI basado en el peso y la altura
    public double BMI(double peso, double altura) throws RemoteException {
        return peso / (altura * altura);
    }

    // ? deluevbe la categoría del BMI (bajo, normal, sobrepeso, obesidad)
    public String categoriaBMI(double bmi) throws RemoteException {
        if (bmi < 18.5) {
            return "Bajo peso";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal";
        } else if (bmi >= 24.9 && bmi < 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidad";
        }
    }

}
