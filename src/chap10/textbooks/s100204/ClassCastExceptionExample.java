package chap10.textbooks.s100204;

public class ClassCastExceptionExample {
public static void main(String[] args) {
	Dog dog = new Dog();
	changeDog(dog);
	
	Cat cat = new Cat();
	changeDog(cat);
}
private static void changeDog(Animal animal) {
	if(animal instanceof Dog) {
	Dog dog =(Dog) animal;
	
	}
 }
}

class Animal {}
class Dog extends Animal{} //Dog == Animal
class Cat extends Animal{}
