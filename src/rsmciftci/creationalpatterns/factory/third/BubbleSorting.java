package rsmciftci.creationalpatterns.factory.third;

public class BubbleSorting implements SortingAlgorithms{

    @Override
    public void sort(int[] arr) {
        bubbleSort(arr);
    }

    private static void bubbleSort(int[] inputArray){
        int temp;
        for(int i = 0; i < inputArray.length-1; i++){
            for(int j = 0; j < inputArray.length-1-i; j++){
                if(inputArray[j] > inputArray[j+1]){
                    temp = inputArray[j];
                    inputArray[j] = inputArray[j+1];
                    inputArray[j+1] = temp;
                }
            }
        }
    }
}
