public abstract class KNN {
    final void template(){
        System.out.println("\nComenzando KNN...");
        identificar();
        distancia();
        vecinos();
        asignar();
    }

    abstract void identificar();

    abstract void distancia();

    void vecinos(){
        System.out.println("Cogiendo los vecinos más cercanos...");

    }

    void asignar(){
        System.out.println("Asignando el nuevo dato al grupo con más vecinos cercanos...");
    }
}
