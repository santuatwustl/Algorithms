public class Searches {

    // Return the index of the target if existing, otherwise -1.
    public int binarySearch(int start, int end, int[] nums, int target){

        while(start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) end = mid - 1;
            else start = mid + 1;
        }


        return -1;
    }

}
