public class Main {
    public static void main(String[] args){
        Searches search = new Searches();
        int nums[] = {2, 2, 2, 2, 2, 5, 10, 11, 15};
        int result = search.binarySearch(0, nums.length - 1, nums, 11);
        System.out.println(result);
    }
}
