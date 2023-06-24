package Two_Dim_Array;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a={{2,3},{1,4}};
		int[][] c=transpose(a);
		print(c);
	}
	public static int[][] transpose(int[][] a){
	    int rowA=a.length;
	    int colA=a[0].length;
	    
	    int[][] ans=new int[colA][rowA];
	    
	    for(int i=0;i<rowA;i++){
	        for(int j=0;j<colA;j++){
	            ans[i][j]=a[j][i];
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
