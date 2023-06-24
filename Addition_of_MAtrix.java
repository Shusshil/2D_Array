package Two_Dim_Array;

public class Addition_of_MAtrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a={{2,3},{1,4}};
		int[][] b={{2,3},{1,4}};
		int[][] c=ADD(a,b);
		print(c);
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
	public static int[][] ADD(int[][] a, int[][] b){
	    int rowA=a.length;
	    int colA=a[0].length;
	    int rowB=b.length;
	    int colB=b[0].length;
	    
	    int[][] ans=new int[rowA][colA];
	    
	    if((rowA == rowB) && (colA == colB)){
	    for(int i=0;i<rowA;i++){
	        for(int j=0;j<colA;j++){
	            ans[i][j]=(a[i][j]+b[i][j]);
	        }
	    }
	    }
	    return ans;
	}
}
