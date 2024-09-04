package patterns;

//Factory Method (Фабричен метод):
// Осигурява интерфейс за създаване на обекти в суперклас,
// но позволява на подкласовете да променят типа на създаваните обекти.

 abstract public class Product {
     class ConcreteProductA extends Productt {
     }

     class ConcreteProductB extends Productt {
     }

     abstract class Creator {
         public abstract Productt factoryMethod();

         public void someOperation() {
             Productt product = factoryMethod();
             // Работа с продукта
         }
     }

     class ConcreteCreatorA extends Creator {
         @Override
         public Productt factoryMethod() {
             return new ConcreteProductA();
         }
     }

     class ConcreteCreatorB extends Creator {
         @Override
         public Productt factoryMethod() {
             return new ConcreteProductB();
         }
     }
 }