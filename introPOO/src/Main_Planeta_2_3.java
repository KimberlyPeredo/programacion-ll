public class Main_Planeta_2_3 {
    public static void main(String[] args) {
        Planeta2_3 p1 =new Planeta2_3("Tierra",1,5.9736E24,1.08321E12,12742,150000000, Planeta2_3.tipoPlaneta.TERRESTRE,true);
        p1.imprimirDatos();
        System.out.println("Densidad del planeta ="+p1.calcularDensidad());
        System.out.println("Es planeta exterior ="+p1.esPlanetaExterior());
        System.out.println();
        Planeta2_3 p2=new Planeta2_3("Jupiter",79,1.899E27,1.4313E15,139820,750000000, Planeta2_3.tipoPlaneta.GASEOSO,true);
        p2.imprimirDatos();
        System.out.println("Densidad del planeta ="+p2.calcularDensidad());
        System.out.println("Es planeta exterior ="+p2.esPlanetaExterior());
    }
}
