class Parent{
    Parent(){
        System.out.println("i'm parent");
    }
    Parent(String name){
        System.out.printf("i'm %s\n",name);
    }
}
public class Sup extends Parent {
    Sup(){
        super();
        //super("sandeep");
        System.out.println("i'm child");
    }
    public static void main(String[] args) {
        //Child obj = new Child();
    }
}
