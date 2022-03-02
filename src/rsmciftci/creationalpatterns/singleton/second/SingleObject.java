package rsmciftci.creationalpatterns.singleton.second;

public class SingleObject {

    private static SingleObject instance = new SingleObject();

    public SingleObject() {
    }
    public static SingleObject getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("Singleton Pattern!");
    }
}
