class Animal{  
	
void eat(){
	
	System.out.println(" here eat something please");
	}  
}  
class Dog extends Animal{
	
void bark(){
	
	System.out.println(" dog barking here please stop it ");
	}  
}  
class BabyDog extends Dog{ 
	
void jump(){
	
	
	System.out.println("The Baby dog  jumping  out side ");
	}  
}  
class Test
{  
public static void main(String args[]){ 
	
BabyDog d=new BabyDog();  

d.jump();  
d.bark();  
d.eat();  
}}  

