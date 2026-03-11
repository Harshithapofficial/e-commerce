public class Category {

    int id;
    String name;

    public Category(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void display(){
        System.out.println(id + " - " + name);
    }

}
