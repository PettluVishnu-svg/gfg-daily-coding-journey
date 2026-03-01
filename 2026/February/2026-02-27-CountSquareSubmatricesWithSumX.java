// Problem: Count Square Submatrices with Sum X
// Platform: GeeksforGeeks POTD
// Date: 2026-02-27
// Approach: Build 2D prefix sum matrix and compute each square submatrix sum in O(1)
// Time Complexity: O(n * m * min(n, m))
// Space Complexity: O(n * m)
// Language: Java

import java.util.*;

class Solution{
    public int countSquare(int[][] mat,int x){
        int n=mat.length;
        int m=mat[0].length;

        int[][] prefix=new int[n+1][m+1];

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                prefix[i][j]=mat[i-1][j-1]
                             +prefix[i-1][j]
                             +prefix[i][j-1]
                             -prefix[i-1][j-1];
            }
        }

        int count=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                for(int size=1;i+size<=n&&j+size<=m;size++){
                    int r=i+size;
                    int c=j+size;

                    int sum=prefix[r][c]
                            -prefix[i][c]
                            -prefix[r][j]
                            +prefix[i][j];

                    if(sum==x) count++;
                }
            }
        }

        return count;
    }
}
