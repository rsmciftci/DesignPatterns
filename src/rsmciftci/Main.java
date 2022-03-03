package rsmciftci;

import rsmciftci.creationalpatterns.prototype.first.PlasticTree;
import rsmciftci.creationalpatterns.prototype.first.Position;
import rsmciftci.creationalpatterns.prototype.first.Tree;

public class Main {
    public static void main(String[] args){

        PlasticTree plasticTree = new PlasticTree(50L,1L);
        Position position = new Position(1, 5);
        plasticTree.setPosition(position);


        PlasticTree copy = (PlasticTree) plasticTree.copy();

        System.out.println(plasticTree);
        System.out.println(copy);

        // Notice Deep Copy
        System.out.println(plasticTree == copy);
        System.out.println(plasticTree.toString().equals(copy.toString()));


    }
}



