package SingletonPattern;

public class Main {
     static void main(String[] args) {
        Office office1 = Office.getInstance();
        Office office2 = Office.getInstance();
        System.out.println(office1.hashCode());
        System.out.println(office2.hashCode());
     }
}
