package models;

/**
 * Created by paul on 3/28/17.
 * To represent a Bao mancala model. The rules of which are as follows:
 * TODO
 */
public class BaoModel implements MancalaModel {

  @Override
  public Cup[][] getCups() {
    return new Cup[0][];
  }

  @Override
  public int getHand(boolean isFirstPlayer) {
    return 0;
  }

  @Override
  public void sow(int cupNum) {

  }


  @Override
  public boolean isFirstPlayerTurn() {
    return false;
  }

  @Override
  public boolean toggleTurn() {
    return false;
  }

  @Override
  public int getBoardLength() {
    return 0;
  }

  @Override
  public boolean isGameOver() {
    return false;
  }

  @Override
  public void init() {

  }

}
