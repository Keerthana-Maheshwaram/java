import java.util.*;



public class Getset {
    public static void main(String[] args){
        Student s=new Student();
        s.setId(1);
        s.setName("ritu");
        s.setAge(25);

        System.out.println("Name: " + s.getName() + "id: " + s.getId() + "age: " + s.getAge() );

    }
    
}

class Student{
    int id;
    String name;
    int age;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }
}

