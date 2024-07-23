public class Ejercicio_Automovil {
    String marca;
    int modelo;
    int motor;
    enum tipoCom{GASOLINA, DIESEL, BIODIESEL,GAS_NATURAL}
    tipoCom tipoCombustible;
    enum tipoA{CUIDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV}
    tipoA tipoAutomovil;
    int númeroDePuertas;
    int cantidadDeAsientos;
    int velocidadMáxima;
    enum tipoColor{BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA}
    tipoColor color;
    int velocidadActual= 0;
    Ejercicio_Automovil(String marca,int modelo,int motor,tipoCom tipoCombustible,tipoA tipoAutomovil,int númeroDePuertas,int cantidadDeAsientos,int velocidadMáxima,tipoColor color){
        this.marca= marca;
        this.modelo= modelo;
        this.motor= motor;
        this.tipoCombustible= tipoCombustible;
        this.tipoAutomovil=tipoAutomovil;
        this.númeroDePuertas=númeroDePuertas;
        this.velocidadMáxima=velocidadMáxima;
        this.color=color;
    }
    String getMarca(){
        return marca;
    }
    int getModelo(){
        return modelo;
    }
    int getMotor(){
        return motor;
    }
    tipoCom getTipoCombustible(){
        return tipoCombustible;
    }
    tipoA getTipoAutomovil(){
        return tipoAutomovil;
    }
    int getNúmeroDePuertas(){
        return númeroDePuertas;
    }
    int getCantidadDeAsientos(){
        return cantidadDeAsientos;
    }
    int getVelocidadMáxima(){
        return velocidadMáxima;
    }
    tipoColor getColor(){
        return color;
    }
    int getVelocidadActual(){
        return velocidadActual;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    public void setModelo(int modelo){
        this.modelo=modelo;
    }
    public void setMotor(int motor){
        this.motor= motor;
    }
    public void setTipoCombustible(tipoCom tipoCombustible){
        this.tipoCombustible= tipoCombustible;
    }
    public void setTipoAutomovil(tipoA tipoAutomovil){
        this.tipoAutomovil=tipoAutomovil;
    }
    public void setNúmeroDePuertas(int númeroDePuertas){
        this.númeroDePuertas=númeroDePuertas;
    }
    public void setCantidadDeAsientos(int cantidadDeAsientos){
        this.cantidadDeAsientos=cantidadDeAsientos;
    }
    public void setVelocidadMáxima(int velocidadMáxima){
        this.velocidadMáxima= velocidadMáxima;
    }
    public void setColor(tipoColor color){
        this.color=color;
    }
    public void setVelocidadActual(int velocidadActual){
        this.velocidadActual= velocidadActual;
    }
    public void acelerar(int incrementoVelocidad){
        if ((velocidadActual+incrementoVelocidad<velocidadMáxima)){
            velocidadActual+=incrementoVelocidad;
        }else{
            System.out.println("No se puede incrementar a una velocidad superior a la maxima del automóvil.");;
        }
    }
    public void desacelerar(int decrementoVelocidad) {
        if ((velocidadActual-decrementoVelocidad)>0){
            velocidadActual-=decrementoVelocidad;
        }else {
            System.out.println("No se puede decrementar a una velocidad negativa.");
        }
    }
    public void frenar(){
        velocidadActual=0;
    }
    double calcularTiempoLlegada(int distancia){
        return distancia/velocidadActual;
    }
    public void imprimirDatos(){
        System.out.println("Marca= "+marca);
        System.out.println("Modelo= "+modelo);
        System.out.println("Motor= "+motor);
        System.out.println("Tipo de combustible= "+tipoCombustible);
        System.out.println("Tipo de automóvil= "+tipoAutomovil);
        System.out.println("Número de puertas= "+númeroDePuertas);
        System.out.println("Cantidad de asientos= "+cantidadDeAsientos);
        System.out.println("Velocidad máxima= "+velocidadMáxima);
        System.out.println("Color= "+color);
    }
}
