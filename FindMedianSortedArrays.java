package leetcode;

public class FindMedianSortedArrays {
	public static double findMedianSortedArrays(int[] A, int[] B) {
        // 均为正序数组
        int m = A.length;
        int n = B.length;
        int len = m + n;
        int left = -1, right = -1;
        int aStart = 0, bStart = 0;
        for (int i = 0; i <= len / 2; i++) {
        	// not i < len / 2 
            left = right;
            if (aStart < m && (bStart > (n - 1) || A[aStart] < B[bStart])) {
                right = A[aStart++];
                System.out.println("a:" + right);
            } else {
                right = B[bStart++];
                System.out.println("b:" + right);
            }
        }
        if ((len & 1) == 0)
            return (left + right) / 2.0;
        else
            return right;
    }
	
	public static void main(String[] args) {
		int[] A = {1, 3, 4};
		int[] B = {2};
		System.out.println(findMedianSortedArrays(A, B));
	}
}
