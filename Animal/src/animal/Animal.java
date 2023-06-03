/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animal;

/**
 *
 * @author jorge
 */
public abstract class Animal {
    protected String sonido;
    protected String alimentos;
    protected String hábitat;
    protected String nombreCientífico;
    public abstract String getNombreCientífico();
    public abstract String getSonido();
    public abstract String getAlimentos();
    public abstract String getHábitat();
    public static void main(String[] args) {
        Animal[] animales = new Animal[4]; 
    animales[0] = new Gato();
    animales[1] = new Perro();
    animales[2] = new Lobo();
    animales[3] = new Leon();
    for (int i = 0; i < animales.length; i++) { 
        System.out.println(animales[i].getNombreCientífico());
        System.out.println("Sonido: " + animales[i].getSonido());
        System.out.println("Hábitat: " + animales[i].getHábitat());
        System.out.println("Alimentos: " + animales[i].getAlimentos());
        System.out.println();
        }
    }
}
