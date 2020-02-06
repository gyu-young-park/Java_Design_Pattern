package Sort;

import java.util.Scanner;

public class QuickSort implements SortAlgoritm{

    private int[] valueArray;
    private int size;
    private static QuickSort instance;

    public static QuickSort getInstance(int size){
        if(instance == null){
            instance = new QuickSort();
        }
        instance.setSize(size);
        instance.setValueArray(new int[size]);
        return instance;
    }

    private void setValueArray(int[] valueArray) {
        this.valueArray = valueArray;
    }

    private void setSize(int size) {
        this.size = size;
    }

    private void swap(int i, int j){
        int temp = valueArray[i];
        valueArray[i] = valueArray[j];
        valueArray[j] = temp;
    }

    @Override
    public void input() {
        System.out.println(size);
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < size; i++){
            int value = scanner.nextInt();
            valueArray[i] = value;
        }
    }

    @Override
    public void sort() {
        quickSort(0,size-1);
    }

    private void quickSort(int start , int end){
        int partitionIndex = partition(start, end);
        if(start < partitionIndex-1){
            quickSort(start, partitionIndex-1);
        }
        if(partitionIndex < end){
            quickSort(partitionIndex, end);
        }
    }

    private int partition(int start , int end){
        int pivot = valueArray[(start+end)/2];
        while(start <= end){
            while(valueArray[start] < pivot) start++;
            while(valueArray[end] > pivot) end--;
            if(start <= end){
                swap(start, end);
                start++;
                end--;
            }
        }
        return start;
    }
    @Override
    public void output() {
        for(int value : valueArray){
            System.out.println(value);
        }
    }

    @Override
    public String getAlgorithmName() {
        return "Quick";
    }
}
