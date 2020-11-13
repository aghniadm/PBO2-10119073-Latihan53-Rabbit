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

public class Animal {
    protected boolean vegetarian;
    protected String eats;
    protected int noOfLegs;
    
    public Animal(boolean vegetarian, String food, int legs){
        this.vegetarian = vegetarian;
        this.eats = food;
        this.noOfLegs = legs;
    }
    
    public boolean isVegetarian(){
        return vegetarian;
    }
    
    public String getEats(){
        return eats;
    }
    
    public int getNoOfLegs(){
        return noOfLegs;
    }
}
