package java_capitulo_2;

public class Ejercicio6 {
    public static void main(String[] args){
        Float base, IVA, factura ;
        base = 155.99f ;
        IVA=(base*21)/100;
        factura=base+IVA;
        System.out.print("El precio total de la factura es de : " + factura);
    }
   
}
