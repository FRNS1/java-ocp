package packages.com.udemy;
import packages.com.udemy.DogBreed;
import packages.com.udemy.DogName;


public class DogApp {
    public static void main(String[] args){
        DogName name = new DogName();
        DogBreed breed = new DogBreed();
        name.setDogName("Ivar");
        breed.setBreedName("Siberian Husky");
        System.out.println(name.getDogName() + " the " + breed.getBreedName());
    }
}
