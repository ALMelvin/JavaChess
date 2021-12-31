import java.util.ArrayList;
import java.util.HashMap;

public class Board {
  public Board() {
    ArrayList<ArrayList<Pieces> > chessBoard = new ArrayList<ArrayList<Pieces>>(8);
    ArrayList<Pieces> column1 = new ArrayList<>(8); //change to Peices later
    chessBoard.add(column1);
    ArrayList<Pieces> column2 = new ArrayList<>(8);
    chessBoard.add(column2);
    ArrayList<Pieces> column3 = new ArrayList<>(8);
    chessBoard.add(column3);
    ArrayList<Pieces> column4 = new ArrayList<>(8);
    chessBoard.add(column4);
    ArrayList<Pieces> column5 = new ArrayList<>(8);
    chessBoard.add(column5);
    ArrayList<Pieces> column6 = new ArrayList<>(8);
    chessBoard.add(column6);
    ArrayList<Pieces> column7 = new ArrayList<>(8);
    chessBoard.add(column7);
    ArrayList<Pieces> column8 = new ArrayList<>(8);
    chessBoard.add(column8);
}
  public static void main(String[] args) {

  }

  }
