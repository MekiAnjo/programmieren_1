package de.hft_stuttgart.huto1bif.umlShop;

import java.util.Random;

/**
 * InnerMyRandom
 */
public interface MyRandom {
  Random RAND = new Random();

  default int randomNumber() {
    return RAND.nextInt(1000, 9999);
  }
}
