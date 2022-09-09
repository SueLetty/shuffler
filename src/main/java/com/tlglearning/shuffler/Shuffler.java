package com.tlglearning.shuffler;

import java.util.Random;

public class Shuffler {
  private final Random rng;

  public Shuffler(Random rng){
    this.rng = rng;
  }
  public void shuffle(int[] data){
    for(int i = data.length -1; i >= 1; i--){
      int t = rng.nextInt(i + 1);
      if(i != t){
        int temp = data[i];
        data[i] = data[t];
        data[t] = temp;
      }
    }
  }
}
