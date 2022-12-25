import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Restaurant rest = new Restaurant();
        int custId,order;
        try{    
            System.out.print("Enter Customer ID : ");
            custId = sc.nextInt();
            System.out.print("Enter how much food to made : ");
            order = sc.nextInt();
            Thread th1 = new Thread(rest);
            Waiters waiter = new Waiters(order,custId);
            Thread th2 = new Thread(waiter);

            th1.start();
            th2.start();
            th1.join();
            th2.join();
        }catch(Exception e){
            System.out.println("Input must be Integer");
        }
    }
}