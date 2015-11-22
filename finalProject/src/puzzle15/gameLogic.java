package puzzle15;
import java.util.Arrays;


public class gameLogic {

	buildMat bm;
	int row,col;

	// constructor
	public gameLogic(buildMat bm){
		this.bm = bm;
		for (int i = 0; i < bm.mat.length; i++) {
			for (int j = 0; j < bm.mat[0].length; j++) {
				if(bm.mat[i][j]==-1){
					row=i;
					col=j;
				}
			}
		}
	}

	
	//functions
	public boolean is_solvable(){

		int [] b = new int [16];
		int k = 0;
		int numOfInversion = 0; 
		int blank=0;


		for (int i = 0 ; i < bm.mat.length ; i++){ // שורות
			for (int j = 0 ; j < bm.mat[0].length ; j++) { // עמודות
				if(bm.mat[i][j]==-1)
					blank=i;
				b[k]=bm.mat[i][j];
				k++;
			}
		}
		for (int i = 0; i < b.length; i++) {
			for (int j = i+1; j < b.length; j++) {
				if(b[i]>b[j]&& b[j]!=-1)	
					numOfInversion++;
			}
		}
		System.out.println(Arrays.toString(b));
		System.out.println("the number of inversions: " + numOfInversion);
		System.out.print("the game is solvable? ");

		if(blank%2==0 && numOfInversion%2==1) return true;
		if(blank%2==1 && numOfInversion%2==0) return true;
		return false;
	}

	
	public void moveUp(){
		System.out.println("Execute move up:");
		if(row==bm.mat.length-1)
			System.out.println("can't move up!");
		else{
			int temp=bm.mat[row+1][col];
			bm.mat[row+1][col]=bm.mat[row][col];
			bm.mat[row][col]=temp;
			row++;
		}
		for (int i = 0 ; i < bm.mat.length ; i++){ // שורות
			for (int j = 0 ; j < bm.mat[0].length ; j++) { // עמודות
				System.out.print(bm.mat[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void moveDown(){
		System.out.println("Execute move down:");
		if(row==0)
			System.out.println("can't move down!");
		else{
			int temp=bm.mat[row-1][col];
			bm.mat[row-1][col]=bm.mat[row][col];
			bm.mat[row][col]=temp;
			row--;
		}
		for (int i = 0 ; i < bm.mat.length ; i++){ // שורות
			for (int j = 0 ; j < bm.mat[0].length ; j++) { // עמודות
				System.out.print(bm.mat[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void moveLeft(){
		System.out.println("Execute move left:");
		if(col==bm.mat[0].length-1)
			System.out.println("can't move left!");
		else{
			int temp=bm.mat[row][col+1];
			bm.mat[row][col+1]=bm.mat[row][col];
			bm.mat[row][col]=temp;
			col++;
		}
		for (int i = 0 ; i < bm.mat.length ; i++){ // שורות
			for (int j = 0 ; j < bm.mat[0].length ; j++) { // עמודות
				System.out.print(bm.mat[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void moveRight(){
		System.out.println("Execute move right:");
		if(col==0)
			System.out.println("can't move right!");
		else{
			int temp=bm.mat[row][col-1];
			bm.mat[row][col-1]=bm.mat[row][col];
			bm.mat[row][col]=temp;
			col--;
		}
		for (int i = 0 ; i < bm.mat.length ; i++){ // שורות
			for (int j = 0 ; j < bm.mat[0].length ; j++) { // עמודות
				System.out.print(bm.mat[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
	public void moveUp1(){
		System.out.println("Execute move up:");
		int a = 3;
		int b = 0;
		for (int i = 0; i < bm.mat.length-1; i++) {
			for (int j = 0; j < bm.mat[0].length; j++) {
				if(bm.mat[i][j]==-1){
					a = i;
					b = j;
				}
			}
		}

		if(a!=3){
			for (int i = 0; i < bm.mat.length; i++) {
				for (int j = 0; j < bm.mat[0].length; j++) {
					if (bm.mat[i][j]==bm.mat[a][b]){

						Object temp = bm.mat[i+1][j];
						bm.mat[i+1][j]=bm.mat[i][j];
						bm.mat[i][j]=(int) temp;
					}
				}
			}
			// הדפסה
			for (int i = 0 ; i < bm.mat.length ; i++){ // שורות
				for (int j = 0 ; j < bm.mat[0].length ; j++) { // עמודות
					System.out.print(bm.mat[i][j] + " ");
				}
				System.out.println();
			}
		}
		else 
			System.out.println("cant move up");
	}

	public void moveDown2(){
		System.out.println("Execute move down:");
		int a = 0;
		int b = 0;

		for (int i = 1; i < bm.mat.length; i++) {
			for (int j = 0; j < bm.mat[0].length; j++) {
				if(bm.mat[i][j]==-1){
					a = i;
					b = j;
				}
			}
		}

		if(a!=0){
			for (int i = 0; i < bm.mat.length; i++) {
				for (int j = 0; j < bm.mat[0].length; j++) {

					if (bm.mat[i][j]==bm.mat[a][b]){

						Object temp = bm.mat[i-1][j];
						bm.mat[i-1][j]=bm.mat[i][j];
						bm.mat[i][j]=(int) temp;
					}
				}
			}
			// הדפסה
			for (int i = 0 ; i < bm.mat.length ; i++){ // שורות
				for (int j = 0 ; j < bm.mat[0].length ; j++) { // עמודות
					System.out.print(bm.mat[i][j] + " ");
				}
				System.out.println();
			}
		}
		else 
			System.out.println("cant move down");
	}

	public void moveRight3(){
		System.out.println("Execute move right:");
		int a = 0;
		int b = 0;
		for (int i = 0; i < bm.mat.length; i++) {
			for (int j = 1; j < bm.mat[0].length; j++) {
				if(bm.mat[i][j]==-1){
					a = i;
					b = j;
				}
			}
		}

		if(b!=0){
			for (int i = 0; i < bm.mat.length; i++) {
				for (int j = 0; j < bm.mat[0].length; j++) {
					if (bm.mat[i][j]==bm.mat[a][b]){

						Object temp = bm.mat[i][j-1];
						bm.mat[i][j-1]=bm.mat[i][j];
						bm.mat[i][j]=(int) temp;
					}
				}
			}
			// הדפסה
			for (int i = 0 ; i < bm.mat.length ; i++){ // שורות
				for (int j = 0 ; j < bm.mat[0].length ; j++) { // עמודות
					System.out.print(bm.mat[i][j] + " ");
				}
				System.out.println();
			}
		}
		else 
			System.out.println("cant move right");
	}

	public void moveLeft4(){
		System.out.println("Execute move left:");
		int a = 0;
		int b = 3;
		for (int i = 0; i < bm.mat.length; i++) {
			for (int j = 0; j < bm.mat[0].length-1; j++) {
				if(bm.mat[i][j]==-1){
					a = i;
					b = j;
				}
			}
		}

		if(b!=3){
			for (int i = 0; i < bm.mat.length; i++) {
				for (int j = 0; j < bm.mat[0].length; j++) {
					if (bm.mat[i][j]==bm.mat[a][b]){

						Object temp = bm.mat[i][j+1];
						bm.mat[i][j+1]=bm.mat[i][j];
						bm.mat[i][j]=(int) temp;
					}
				}
			}
			// הדפסה
			for (int i = 0 ; i < bm.mat.length ; i++){ // שורות
				for (int j = 0 ; j < bm.mat[0].length ; j++) { // עמודות
					System.out.print(bm.mat[i][j] + " ");
				}
				System.out.println();
			}
		}
		else 
			System.out.println("cant move left");
	}

	
	public boolean solved(){
		boolean ans=true;
		for(int i=0;i<bm.mat.length;i++){
			for(int j=0;j<bm.mat[0].length;j++){
				if(bm.mat[i][j]!=(i*bm.mat.length+j+1) && i!=bm.mat.length && j!=bm.mat[0].length)
					return false;
			}
		}
		return ans;
	}

	public static void main (String [] args){
		buildMat c = new buildMat();
		c.fillMat();
		gameLogic l = new gameLogic(c);
//		System.out.println(l.is_solvable());
//		l.moveDown();
//		l.moveLeft();
		l.moveDown();
		l.moveUp();
		l.moveLeft();
		l.moveRight();
		
//		l.moveRight();

	}

}