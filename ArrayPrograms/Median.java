package ArrayPrograms;

public class Median {


    public static void main(String[] args) {
        int [] nums1={1,3};
        int [] nums2={2};
        Solution s=new Solution();
        double data=s.findMedianSortedArrays(nums1,nums2);
        System.out.println(data);


    }
}

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length=nums1.length+nums2.length;
        int ar[]=new int[length];
        int pos=0;
        double median=0.0;
        for(int i=0;i<nums1.length;i++)
        {
            ar[i]=nums1[i];

        }
        pos=nums1.length;
        for(int j=0;j<nums2.length;j++)
        {
            ar[pos]=nums2[j];
            pos++;
        }
        System.out.println("*********");
        for(int k=0;k<ar.length;k++)
        {
            System.out.println(ar[k]);
        }
        System.out.println("*********");
        int n=length/2;
        System.out.println(n);
      //  Arrays.sort(ar);
        int total=ar[n]+ar[n-1];
        System.out.println(total);
        median=(double)total/2.0;
        return median;

    }
}
