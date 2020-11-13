package pbo2.pkg10119073.latihan53.rabbit;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk menampilkan status kelinci
 * dengan konsep pewarisan class
 *
 */

public class PBO210119073Latihan53Rabbit {

    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit("Peter", false, "grass", 4, "grey");
        System.out.println("Hello, his name is "+rabbit.getName());
        System.out.println(rabbit.getName()+" is vegetarian? "+rabbit.isVegetarian());
        System.out.println(rabbit.getName()+" has "+rabbit.getNoOfLegs()+" legs");
        System.out.println(rabbit.getName()+" color is "+rabbit.getColor());
    }
    
}
