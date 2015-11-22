package puzzle15;
import java.util.Arrays;


public class buildMat {

	public int [][] mat;

	// constructor
	public buildMat(){
		mat=new int[4][4];
	}

	//functions
	public void fillMat (){
		int k=1;
		for (int i = 0 ; i < mat.length ; i++){ // שורות
			for (int j = 0 ; j < mat[0].length ; j++) { // עמודות
				mat[i][j] = k++;
			}
		}
		mat[3][3]= -1;      
		shuffle();
		System.out.println();
	}

	public void shuffle(){

		int tmp2;
		for (int i = 0 ; i < mat.length ; i++){ // שורות

			for (int j = 0 ; j < mat[0].length ; j++) { // עמודות
				int tmp=(int)(Math.random() * 4 );
				tmp2 = mat[i][j];
				mat[i][j]=mat[tmp][tmp];
				mat[tmp][tmp]=tmp2;
			}
		}
		//הדפסה
		System.out.println("initiate matrix:");
		for (int i = 0 ; i < mat.length ; i++){ // שורות
			for (int j = 0 ; j < mat[0].length ; j++) { // עמודות
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}


//	public static void main(String[] args){
//
//		buildMat c = new buildMat();
//		c.fillMat();
//	}
}


