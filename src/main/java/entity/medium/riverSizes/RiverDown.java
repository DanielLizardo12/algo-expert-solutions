package entity.medium.riverSizes;

/**
 * RiverDown description.
 *
 * @author Daniel
 * @version 21/11/2023
 */
public class RiverDown {
  private int riverSize;
  private int[][] matrix;

  public RiverDown(int riverSize, int[][] matrix) {
    this.riverSize = riverSize;
    this.matrix = matrix;
  }

  public int getRiverSize() {
    return riverSize;
  }

  public void setRiverSize(int riverSize) {
    this.riverSize = riverSize;
  }

  public int[][] getMatrix() {
    return matrix;
  }

  public void setMatrix(int[][] matrix) {
    this.matrix = matrix;
  }
}
