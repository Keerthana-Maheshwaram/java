import java.util.*;

public class Bank {

    public static void main(String[] args) {
        // Scanner scn=new Scanner(System.in);

        BankAccount b = new BankAccount();
        b.getAccNum(12345);
        System.out.println("your acc num is: " + b.setAccNum());

        b.getbalance(987);
        System.out.println("your balance is: " + b.setbalance());

        b.getcustomerName("tom");
        System.out.println("acc holder name: " + b.setcustomerName());

        b.getemail("tom@gmail.com");
        System.out.println("email id of customer: " + b.setemail());

        b.getphoneNum(123456789);
        System.out.println("phone num: " + b.setphoneNum());

        b.deposit(4567);
        b.withdraw(8976789);

        VipCustomer customer1 = new VipCustomer("name", 12345);
        System.out.println("customer1 name: " + customer1.getName() + "customer1 credit limit: " + customer1.getCreditLimit());

        VipCustomer customer2=new VipCustomer("bob", 12345, "bob@gmail");
        System.out.println(customer2);

    }

}

class BankAccount {
    int accNum;
    int balance;
    String customerName;
    String email;
    int phoneNum;

    public void getAccNum(int accNum) {
        this.accNum = accNum;
    }

    public int setAccNum() {
        return this.accNum;
    }

    public void getbalance(int balance) {
        this.balance = balance;
    }

    public int setbalance() {
        return this.balance;
    }

    public void getcustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String setcustomerName() {
        return this.customerName;
    }

    public void getemail(String email) {
        this.email = email;
    }

    public String setemail() {
        return this.email;
    }

    public void getphoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int setphoneNum() {
        return this.phoneNum;
    }

    public void deposit(int amount) {
        this.balance += amount;
        System.out.println("your balance after deposit  is:" + amount);
    }

    public void withdraw(int amount) {
        if (amount > this.balance) {
            System.out.println("no enough balance");
        } else {
            this.balance -= amount;
            System.out.println("your balance after withdrawl is:" + amount);
        }
    }

}

class VipCustomer {
    String name;
    int creditLimit;
    String email;

    public VipCustomer(){
        this("bob", 12345);
        System.out.println("This is an empty constructor");;
    }

    public VipCustomer(String name, int creditLimit){
        this("tom", 98765," tom@gmail.com");
        this.name=name;
        this.creditLimit=creditLimit;
        
    }

    public VipCustomer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public int getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmail(){
        return this.email;
    }

}

class Person {
    String name;
    int age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
