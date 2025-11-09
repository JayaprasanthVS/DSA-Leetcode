class Solution {
    public int minimumDistance(int[] nums) {
      Map<Integer,int [] >map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        boolean f = false;
        for ( int i = 0; i< nums.length; i++) {
            int  val = nums[i];
            if ( !map.containsKey(val)) {
                map.put(val,new int[]{i,-1});
            }else {
                int[] arr = map.get(val );
                if(arr[1] == -1 ){
                    arr[1] = i;
                } else {
                    int i1 = arr[0], i2 = arr[1],i3 = i;
                    int dist = Math.abs(i1 - i2)+Math.abs(i2 - i3) + Math.abs(i3 - i1);
                    min = Math.min(min,dist);
                    f = true;
                    arr[0] = arr[1];
                    arr[1]= i;
                }
                }
        }
        return f ? min : -1;
        
    }
}