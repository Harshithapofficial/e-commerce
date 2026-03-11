public class User {

    String name;
    String email;

    public User(String name,String email){

        this.name = name;
        this.email = email;

    }

    public void display(){

        System.out.println("User: "+name+" | Email: "+email);

    }

}
