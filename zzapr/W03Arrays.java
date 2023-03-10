import zzapr.utils.Week03;

public class W03Arrays {

    public static void main(String[] args){
        int[] arr = new int[10];
        Week03.generateRandArray(arr);
        Week03.writeRandArray(arr);
        Week03.sortAscending(arr);
        Week03.writeRandArray(arr);
        Week03.arrayOppositeDirection(arr);
        Week03.writeRandArray(arr);
    }
}

