package SingletonPattern;

public class Office {
    private static Office officeObject;
    private Office(){}
    public static Office getInstance(){
        if(officeObject == null){
            synchronized (Office.class){ //thread safe
                if(officeObject == null){
                    officeObject = new Office();
                }
            }
        }
        return officeObject;
    }
}
