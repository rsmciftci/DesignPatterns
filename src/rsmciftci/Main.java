package rsmciftci;

import rsmciftci.creationalpatterns.singleton.first.Singleton;
import rsmciftci.creationalpatterns.singleton.second.SingleObject;

public class Main {
    public static void main(String[] args){

        SingleObject instance = SingleObject.getInstance();
        instance.showMessage();

    }
}



