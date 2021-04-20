class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        Arrays.sort(arr);
        for (int i = 0 ; i < n ; i++) {
            int st = i + 1 , end = n - 1;
            while (st < end) {
                if (arr[st] + arr[end] + arr[i] == 0) 
                    return true;
                else if (arr[st] + arr[end] + arr[i] < 0)
                    st += 1;
                else 
                    end -= 1;
            }
        }
        return false;
    }
}
