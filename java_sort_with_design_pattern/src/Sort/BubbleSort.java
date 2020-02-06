package Sort;

import java.util.Scanner;

public class BubbleSort implements SortAlgoritm{
    private int[] valueArray;
    private int size;
    private static BubbleSort instance;

    public static BubbleSort getInstance(int size){
        if(instance == null){
            instance = new BubbleSort();
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
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size-i-1; j++){
                if(valueArray[j] > valueArray[j+1]){
                    swap(j,j+1);
                }
            }
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
        return "Bubble";
    }
}
