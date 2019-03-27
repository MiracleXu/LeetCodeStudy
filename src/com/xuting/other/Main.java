package src.com.xuting.other;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        new Meal();
//        System.out.println(2<<3);
//        System.out.println(2>>3);
//
//        People p1 = new People("Jack", 12);
//        System.out.println("p1 hashcode:"+p1.hashCode());
//
//        HashMap<People, Integer> hashMap = new HashMap<People, Integer>();
//        hashMap.put(p1, 1);
//
//        System.out.println(hashMap.get(new People("Jack", 12)));
//
//
//        int a = 5, b = 10;
//        swap ( a,  b);
//        System.out.println("a="+a+"   b="+b);

        String s1 = "Programming";
        String s2 = new String("Programming");
        String s3 = "Program" + "ming";
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s1.intern());
    }

    public static void swap( int x,  int y) {
        int temp = x;
        x = y;
        y = temp;
    }
}

class Meal {

    public Meal() {
        System.out.println("meal");
    }

    Bread bread = new Bread();
}

class Bread {

    public Bread() {
        System.out.println("bread");
    }
}

class People{
    private String name;
    private int age;

    public People(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age){
        this.age = age;
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return name.hashCode()*31+age;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return this.name.equals(((People)obj).name) && this.age== ((People)obj).age;
    }


}




