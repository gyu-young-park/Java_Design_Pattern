package Sort;

import java.util.Scanner;

public class HeapSort implements SortAlgoritm {
    private int[] valueArray;
    private int size;
    private static HeapSort instance;

    public static HeapSort getInstance(int size){
        if(instance == null){
            instance = new HeapSort();
        }
        instance.setSize(size);
        instance.setValueArray(new int[size]);
        return instance;
    }

    public void setValueArray(int[] valueArray) {
        this.valueArray = valueArray;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private void swap(int i, int j){
        int temp = valueArray[i];
        valueArray[i] = valueArray[j];
        valueArray[j] = temp;
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < size; i++){
            int value = scanner.nextInt();
            valueArray[i] = value;
        }
    }

    @Override
    public void sort() {
        makeMaxHeap(size);
        heapSort(size);
    }

    private void makeMaxHeap(int size){
        int parentNode = size/2-1;
        for(int i = parentNode; i >= 0; i--) {
            heapify(i, size);
        }
    }

    private void heapify(int node, int size){
        int index = node;
        int left = node*2 + 1;
        int right = node*2 + 2;
        if(left < size && valueArray[left] > valueArray[index]){
            index = left;
        }
        if(right < size && valueArray[right] > valueArray[index]){
            index = right;
        }
        if(index != node){
            swap(node, index);
            heapify(index, size);
        }
    }

    private void heapSort(int size){
        for(int i = size-1; i >= 0; i--){
            swap(0,i);
            heapify(0,i-1);
        }
    }

    @Override
    public void output() {
        for(int value : valueArray){
            System.out.println(value);
        }
    }

    @Override
    public String getAlgorithmName() {
        return "Heap";
    }
}
