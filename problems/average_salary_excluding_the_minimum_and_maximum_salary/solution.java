class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);double c=0,j=0;
        for(int i=1;i<salary.length-1;i++) {
            j+=salary[i];
            c++;
        }
        return (double )(j/c);
    }
}