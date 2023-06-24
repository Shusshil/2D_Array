package Two_Dim_Array;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a={{2,3},{1,4}};
		int[][] b={{2,3},{1,4}};
		int[][] c=Multiply(a,b);
		print(c);
	}
	public static int[][] Multiply(int[][] a, int[][] b){
	    int rowA=a.length;
	    int colA=a[0].length;
	    int rowB=b.length;
	    int colB=b[0].length;
	    
	    int[][] ans=new int[rowA][colB];
	    
	    if(colA == rowB){
	    for(int i=0;i<rowA;i++){
	        for(int j=0;j<colB;j++){
	            for(int k=0;k<rowB;k++){
	               ans[i][j]+=(a[i][k]*b[k][j]);
	            }
	        }
	    }
	    }
	    return ans;
	}
	public static void print(int[][] a){
	    int rowA=a.length;
	    int colA=a[0].length;
	    for(int i=0;i<rowA;i++){
	        for(int j=0;j<colA;j++){
	            System.out.print(a[i][j]+" ");
	        }
	        System.out.println();
	    }
	}
}
