public class Main_Automovil {
    public static void main(String[] args) {
        Ejercicio_Automovil auto1=new Ejercicio_Automovil("Ford",2018,3, Ejercicio_Automovil.tipoCom.DIESEL, Ejercicio_Automovil.tipoA.EJECUTIVO,5,6,250, Ejercicio_Automovil.tipoColor.NEGRO);
        auto1.imprimirDatos();
        auto1.setVelocidadActual(100);
        System.out.println("Velocidad actual= "+auto1.velocidadActual);
        auto1.acelerar(20);
        System.out.println("Velocidad actual= "+auto1.velocidadActual);
        auto1.desacelerar(50);
        System.out.println("Velocidad actual= "+auto1.velocidadActual);
        auto1.frenar();
        System.out.println("Velocidad actual= "+auto1.velocidadActual);
        auto1.desacelerar(20);
    }
}
