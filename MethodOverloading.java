
public class MethodOverloading {
    public static void main(String[] args){
        Second obj1 = new Second();
        Second obj2 = new Second(1,2,"hello this is using second constructor");
        Second obj3 = new Second(5);
        System.out.printf("When constructed: obj1    a: %d, b: %d, str: %s\n",obj1.a,obj1.b,obj1.str);
        System.out.printf("When constructed: obj2    a: %d, b: %d, str: %s\n",obj2.a,obj2.b,obj2.str);
        System.out.printf("When constructed: obj3    a: %d, b: %d, str: %s\n",obj3.a,obj3.b,obj3.str);
        obj1.increment();
        obj2.increment(5);
        obj3.increment(3, 4);
        System.out.printf("After Incrementing: obj1    a: %d, b: %d, str: %s\n",obj1.a,obj1.b,obj1.str);
        System.out.printf("After Incrementing: obj2    a: %d, b: %d, str: %s\n",obj2.a,obj2.b,obj2.str);
        System.out.printf("After Incrementing: obj3    a: %d, b: %d, str: %s\n",obj3.a,obj3.b,obj3.str);
    }   

}


