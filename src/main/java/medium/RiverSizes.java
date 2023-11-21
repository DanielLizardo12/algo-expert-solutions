package medium;

import entity.RiverDown;
import entity.RiverRight;
import java.util.ArrayList;
import java.util.List;

/**
 * RiverSizes description.
 *
 * @author Daniel
 * @version 21/11/2023
 */
public class RiverSizes {

  public static void main(String[] args) {
    int[][] matrix = {
        {1, 0, 0, 1, 0},
        {1, 0, 1, 0, 0},
        {0, 0, 1, 0, 1},
        {1, 0, 1, 0, 1},
        {1, 0, 1, 1, 0}
    };

    System.out.println(solution(matrix));
  }

  public static List<Integer> solution(int[][] matrix) {
    ArrayList<Integer> result = new ArrayList<>();

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (matrix[i][j] == 1) {

          matrix[i][j] = 0;
          int riverSize = 1;

          RiverRight riverRight = checkRightForRiver(matrix[i], j);
          riverSize += riverRight.getRiverSize();
          matrix[i] = riverRight.getMatrix();

          RiverDown riverDown = checkDownForRiver(matrix, j, i);
          matrix = riverDown.getMatrix();
          riverSize += riverDown.getRiverSize();

          result.add(riverSize);
        }
        //System.out.print(matrix[i][j]);
      }
      //System.out.println();
    }

    return result;
  }

  public static RiverRight checkRightForRiver(int[] matrix, int currentIndex) {
    int riverSize = 0;
    for (int i = currentIndex + 1; i < matrix.length; i++) {
      if (matrix[i] == 1) {
        matrix[i] = 0;
        riverSize++;
      } else {
        return new RiverRight(riverSize, matrix);
      }
    }

    return new RiverRight(riverSize, matrix);
  }

  public static RiverDown checkDownForRiver(int[][] matrix, int currentIndex, int currentRow) {
    int riverSize = 0;
    for (int i = currentRow + 1; i < matrix.length; i++) {
      if (matrix[i][currentIndex] == 1) {

        matrix[i][currentIndex] = 0;
        riverSize ++;

        RiverRight riverRight = checkRightForRiver(matrix[i], currentIndex);

        matrix[i] = riverRight.getMatrix();
        riverSize += riverRight.getRiverSize();

      } else {
        return new RiverDown(riverSize, matrix);
      }
    }
    return new RiverDown(riverSize, matrix);
  }
}