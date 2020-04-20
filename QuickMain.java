class QuickMain{
  public static void main(String[] args) {
        int arr[] = {80,50,20,70,100,40};
        QuickSort obj=new QuickSort();
        obj.quicksort(arr, 0, arr.length - 1);
        obj.display(arr);
    }
}
