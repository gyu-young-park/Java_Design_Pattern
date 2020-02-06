package Sort;

import java.util.Scanner;

public class InsertSort implements SortAlgoritm {
    private int[] valueArray;
    private int size;

    private static InsertSort instance;

    public static InsertSort getInstance(int size){
        if(instance == null){
            instance = new InsertSort();
        }
        instance.setSize(size);
        instance.setValueArray(new int[size]);
        return instance;
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < size; i++){
            int value = scanner.nextInt();
            valueArray[i] = value;
        }
    }

    private void swap(int i , int j){
        int temp = valueArray[i];
        valueArray[i] =valueArray[j];
        valueArray[j] = temp;
    }

    @Override
    public void sort() {
        for(int i = 0; i < size; i++){
            for(int j = i; j > 0; j--){
                if(valueArray[j] < valueArray[j-1]){
                    swap(j, j-1);
                }else{
                    break;
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
        return "Insert";
    }

    public void setValueArray(int[] valueArray) {
        this.valueArray = valueArray;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
