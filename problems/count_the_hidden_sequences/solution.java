class Solution {
       public int numberOfArrays(int[] differences, int lower, int upper) {
                long  accSum = 0;
                        long  maxSum = 0;
                                long  minSum = 0;
                                        for (int d : differences) {
                                                    accSum += d;
                                                                maxSum = Math.max(maxSum, accSum);
                                                                            minSum = Math.min(minSum, accSum);
                                                                                    }
                                                                                            return (int) Math.max(0, (upper - lower) - (maxSum - minSum) + 1);
                                                                                                }
       }
