package p1;

public class test1 {

    public static void main(String args[]){
        Integer obj= Integer.valueOf(45);//boxing
        Integer obj1=Integer.valueOf(45);
        System.out.println(obj==obj1);
        test1 obj3=new test1();
        test1 obj4=new test1();
        System.out.println(obj3==obj4);
        int a=obj.intValue();//unboxing

        Integer i1=52;//automatically boxing
        int i2=i1;//automatically unboxing
    }
}
