package Sort;

public class Sortter {
    private SortAlgoritm sortAlgoritm;

    public Sortter(SortAlgoritm sortAlgoritm){
        this.sortAlgoritm = sortAlgoritm;
    }
    public void sort(){
        sortAlgoritm.input();
        sortAlgoritm.sort();
        sortAlgoritm.output();
    }

    public String getAlgorithmName(){
        return sortAlgoritm.getAlgorithmName();
    }

    public void changeSortAlgorithm(SortAlgoritm sortAlgoritm){
        this.sortAlgoritm = sortAlgoritm;
    }
}
