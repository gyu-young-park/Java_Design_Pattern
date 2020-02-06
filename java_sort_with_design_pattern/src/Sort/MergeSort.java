package Sort;

import java.util.Scanner;

public class MergeSort implements SortAlgoritm {
    private int[] valueArray;
    private int size;
    private static MergeSort instance;

    public static MergeSort getInstance(int size){
        if(instance == null){
            instance = new MergeSort();
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
        mergeSort(0,size-1);
    }

    private void mergeSort(int start , int end){
        if(start < end){
            int mid = (start + end)/2;
            mergeSort(start, mid);
            mergeSort(mid + 1, end);
            merge(start, mid, end);
        }
    }

    private void merge(int start , int mid , int end){
        int[] temp = new int[size];
        for(int i  = start ; i <= end; i++){
            temp[i] = valueArray[i];
        }
        int part1 = start;
        int part2 = mid+1;
        int index = start;
        while(part1 <= mid && part2 <= end){
            if(temp[part1] <= temp[part2]){
                valueArray[index] = temp[part1];
                part1++;
            }else{
                valueArray[index] = temp[part2];
                part2++;
            }
            index++;
        }

        for(int i = 0; i <= mid - part1; i++){
            valueArray[index+i] = temp[part1+i];
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
        return "Merge";
    }
}
