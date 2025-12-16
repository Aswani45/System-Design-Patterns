package BuilderPattern;

public class Main {
    public static void main(String[] args) {
        User user =  User.UserBuilder.craeteUserBuilder().setName("Aman").setAge(25).setAddress("Delhi").build();
        System.out.println(user);
    }
}
