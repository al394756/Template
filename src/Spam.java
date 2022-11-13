public class Spam extends KNN{
    @Override
    void identificar() {
        System.out.println("Identificando correo entrante...");
    }

    @Override
    void distancia() {
        System.out.println("Calculando distancia entre nuevo correo y correo normal o spam...");
    }
}
