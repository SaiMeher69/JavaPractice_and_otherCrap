public class MethodOverriding extends Second{
    public static void main(String[] args){
        MethodOverriding obj1 = new MethodOverriding();
        System.out.printf("Before: obj1     a: %d, b: %d, str: %s\n",obj1.a,obj1.b,obj1.str);
        obj1.increment();
        System.out.printf("After: obj1     a: %d, b: %d, str: %s\n",obj1.a,obj1.b,obj1.str);
        
    }
    @Override
    public void increment(){
        this.a = 50;
        this.b = 50;
        this.str = "Override Successful";
    }
}
