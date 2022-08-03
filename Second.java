

public class Second {
    public int a=0,b=0;
    public String str="";
    //Default constructor
    public Second(){
        a=0;b=0;
        str="Default Constructor";
    }
    //Overloaded constructor with all parameters
    public Second(int a,int b,String str){
        this.a = a;
        this.b = b;
        this.str = str;       
    }
    //Overloading constructor again to do something else
    public Second(int a){
        this.a = 10;
        this.b = 10;
        str = "Third constructor";
    }
    public void increment(){
        this.a++;
        this.b++;
    }
    public void increment(int p){
        this.a += p;
        this.b += p;
    }
    public void increment(int p,int q){
        this.a +=p;
        this.b +=q;
    }

}