public class coche {
    public static void main(String[] args) {
        
        Coche miCoche = new coche();
        miCoche.sumarPuertas();
        miCoche.sumarPuertas();
        System.out.println("El numero de Puertas es:" + miCoche.numeroDepuertas);

    }
    public static int suma(int a,int b,int c){
        int resultado;
        resultado= a + b + c; 
        system.out.println(resultado);
    }   
}



class coche {
    public int puertas = 4;
    public void sumarPuertas(){
        this.puertas++;