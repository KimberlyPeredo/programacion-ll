public class Planeta2_3 {
    String nombre = null;
    int cantidadesSatélitales = 0;
    double masa = 0;
    double volumen = 0;
    int diametro = 0;
    int distanciaSol = 0;

    enum tipoPlaneta {GASEOSO, TERRESTRE, ENANO}

    tipoPlaneta tipo;
    boolean esObservable = false;

    Planeta2_3(String nombre, int cantidadesSatélitales, double masa, double volumen, int diametro, int distanciaSol, tipoPlaneta tipo, boolean esObservable) {
        this.nombre = nombre;
        this.cantidadesSatélitales = cantidadesSatélitales;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.tipo = tipo;
        this.esObservable = esObservable;
    }

    public void imprimirDatos() {
        System.out.println("Nombre del planeta =" + nombre);
        System.out.println("Cantidad de satélites =" + cantidadesSatélitales);
        System.out.println("Masa del planetas =" + masa);
        System.out.println("Volumen del planeta =" + volumen);
        System.out.println("Diámetro del planeta =" + diametro);
        System.out.println("Distancia al sol =" + distanciaSol);
        System.out.println("Tipo de planeta =" + tipo);
        System.out.println("Es observable =" + esObservable);
    }

    double calcularDensidad() {
        return masa / volumen;
    }

    boolean esPlanetaExterior() {
        float límite = (float) (149597870 * 3.4);

        if (distanciaSol > límite) {
            return true;
        } else {
            return false;
        }
    }
}
