package animal;
public class Animal {
    private String foodType;
    private int lifeexpectancy; 
    
    public Animal(){
        foodType = null;
        lifeexpectancy = 0;
    }
    public Animal(String food){
        foodType = food;
        lifeexpectancy = 0;
    }
    public Animal(int life){
        foodType = null;
        lifeexpectancy = life;
    }  
    public Animal (String food, int life){
        foodType = food;
        lifeexpectancy = life;
    } 
    
    public String toString(){
     String result = "this";
     if (foodType != null) result += foodType + "eater";
     if (lifeexpectancy == 0) result += " is dead can't lie";
     else result += "typically live for " + lifeexpectancy + "years";
     return result;
    }
    
public static void main(String[] args){
    Animal animal = new Animal();
    System.out.println(animal);
    Animal animal2 = new Animal(3);
    System.out.println(animal2);
    Animal animal3 = new Animal(" grass ");
    System.out.println(animal3);   
    Animal animal4 = new Animal(" fruit ",10);
    System.out.println(animal4);
 }

}
