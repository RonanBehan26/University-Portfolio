package findsmallelement;

import java.util.ArrayList;

public class FindSmallElement {

  public static int findSmallElement(ArrayList<Integer> num) {
    int smElement;
    smElement = num.get(0);
    for (int i = 0; i < num.size(); i++) {
      if (num.get(i) < smElement) {
        smElement = num.get(i);
      }
    }

    return smElement;
  }

  public static void main(String[] args) {

    int[] sizes = new int[4];
    sizes[0] = 10000;
    sizes[1] = 1000000;
    sizes[2] = 10000000;
    sizes[3] = 100000000;

    for (int s = 0; s < sizes.length; s++) {
      ArrayList<Integer> list = new ArrayList<Integer>();

      for (int i = 0; i < sizes[s]; i++) {
        list.add((int) Math.random() * 1000); //what ize you want
      }

      long start = System.currentTimeMillis();
      int smallest = findSmallElement(list);
      long end = System.currentTimeMillis();
      System.out.println("Size " + sizes[s] + "   Time " + (end - start) + " ms    Value " + smallest);
    }
  }
}