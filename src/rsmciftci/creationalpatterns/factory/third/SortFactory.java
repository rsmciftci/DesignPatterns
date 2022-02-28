package rsmciftci.creationalpatterns.factory.third;

public class SortFactory {

    public void sort(String sortingAlgorithm, int[] arr){
        if(sortingAlgorithm.equalsIgnoreCase("bubble")){
            new BubbleSorting().sort(arr);
        }else if(sortingAlgorithm.equalsIgnoreCase("merge")){
            new MergeSorting().sort(arr);
        }else{
            System.out.println("Algorithm couldn't found!");
        }
    }
}
