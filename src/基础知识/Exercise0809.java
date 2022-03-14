package »ù´¡ÖªÊ¶;

import java.util.Scanner;

public class Exercise0809 {
	public static void main(String[] args) {
		char[][] chessBoard = new char[3][3];
		startGame(chessBoard);
	}
	
	public static void initChessBoard(char[][] chessBoard) {
		for(int i=0;i<chessBoard.length;i++) {
			for(int j=0;j<chessBoard[i].length;j++) {
				chessBoard[i][j] = ' ';
			}
		}
	}
	
	public static void changeChessBoard(char[][] chessBorad,char chess,int i,int j) {
		chessBorad[i][j] = chess;
	}
	
	public static boolean isValidChess(char[][] chessBorad,int i,int j) {
		return chessBorad[i][j]==' '?true:false;
	}
	
	public static int gameStates(char[][] chessBoard,int i,int j) {
		return judgeStates(chessBoard, i, j)?1:0;
	}
	
	public static boolean judgeStates(char[][] chessBoard,int x,int y) {
		boolean flag=false;
		int j;
		for(j=0;j<2;j++) {
			if(chessBoard[x][j] == chessBoard[x][j+1]) {
				continue;
			}
			else {
				break;
			}
		}
		if(j==2) {
			flag=true;
		}
		int i;
		for(i=0;i<2;i++) {
			if(chessBoard[i][y]==chessBoard[i+1][y]) {
				continue;
			}
			else {
				break;
			}
		}
		if(i==2) {
			flag=true;
		}
		if(x==y) {
			int k;
			for(k=0;k<2;k++) {
				if(chessBoard[k][k]==chessBoard[k+1][k+1]) {
					continue;
				}
				else {
					break;
				}
			}
			if(k==2) {
				flag=true;
			}
			
		}
		if(x==0&&y==2 || x==1&&y==1 || x==2&&y==0) {
			if(chessBoard[0][2]==chessBoard[1][1]&& chessBoard[0][2]==chessBoard[2][0] ) {
				flag = true;
			}
		}
		return flag;
	}
	
	public static void showChessBoard(char[][] chessBoard) {
		for(int i=0;i<chessBoard.length;i++) {
			System.out.println("-------------");
			for(int j=0;j<chessBoard[i].length;j++) {
				System.out.print("| "+chessBoard[i][j]+" ");
			}
			System.out.println("|");
		}
		System.out.println("-------------");
	}
	
	public static void startGame(char[][] chessBoard) {
		int chessNum = 0;
		char[] player = {'X','O'};
		int index =0 ;
		initChessBoard(chessBoard);
		Scanner input = new Scanner(System.in);
		while(chessNum<9) {
			showChessBoard(chessBoard);
			System.out.print("Enter a row (0, 1, or, 2) for player "+player[index]+" :");
			int i = input.nextInt();
			System.out.print("Enter a column (0, 1, or, 2) for player "+player[index]+" :");
			int j = input.nextInt();
			System.out.println();
			while(true) {
				if(isValidChess(chessBoard, i, j)) {
					changeChessBoard(chessBoard, player[index], i, j);
					break;
				} else {
					System.out.println("This cell is already occupied. Try a different cell");
					System.out.print("Enter a row (0, 1, or, 2) for player "+player[index]+" :");
					i = input.nextInt();
					System.out.print("Enter a column (0, 1, or, 2) for player "+player[index]+" :");
					j = input.nextInt();
					System.out.println();
				}
			}
			if(gameStates(chessBoard,i,j)==0) {
				index = (++index)%2;
				chessNum++;
				if(chessNum==9) {
					System.out.println("It ends in a draw");
				}
				continue;
			} else {
				showChessBoard(chessBoard);
				System.out.println(player[index]+" player win");
				break;
			}	
		}
		input.close();
	}
}

