public class Pieces {
  public int alive;
  public int attackers;
  public int defenders;
  public int hanging;
  public int canMove; //0 means no, 1 means yes
  public int canAttack; //0 for no attacks or, int for number of possible attacks.
  public int value; //value of the piece.


  public Pieces() {
    int alive = 1; //Alive = 1, Dead = 0.
    int attackers = 0; //Counts how many pieces can attack it.
    int defenders = 0; //Number of pieces defending it
    int hanging = 0; //if attackers > defenders, hanging = 1.
  }

  public int getAttackers() {
    //Scan enemy pieces for attack lines
  }

  public int getDefenders() {
    //Scan own pieces through attack lines
  }
  public void setHanging(int x) {
    this.hanging = x;
  }
  public void isHanging() { //The number associated with hanging is the number of attacks the piece is not defended from
    int hangingBy = getAttackers() - getDefenders();
      setHanging(hangingBy);
  }

}
