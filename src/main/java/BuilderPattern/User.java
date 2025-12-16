package BuilderPattern;

public class User {
    private String name;
    private int age;
    private String address;

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }

    private User(UserBuilder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
    }

    @Override
    public String toString(){
        return "User [name=" + name + ", age=" + age + ", address=" + address + "]";
    }

     static class UserBuilder{
        private String name;
        private int age;
        private String address;

        private UserBuilder(){}

        public static UserBuilder craeteUserBuilder(){
            return new UserBuilder();
        }
        public UserBuilder setName(String name){
            this.name = name;
            return this;
        }
        public UserBuilder setAge(int age){
            this.age = age;
            return this;
        }
        public UserBuilder setAddress(String address){
            this.address = address;
            return this;
        }
        public User build(){
            return new User(this);
        }
    }
}

