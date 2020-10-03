
public class TicTacToe {
	
	char[] boardArray=new char[10];
	
	public void createBoard(){
		for (int i=1; i<boardArray.length;i++) {
			boardArray[i] = '0';
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Welcome to Tic-Tac-Toe Game !!");
	}

}
