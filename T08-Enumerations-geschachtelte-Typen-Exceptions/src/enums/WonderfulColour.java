package enums;

/**
 * WonderfulColour
 */
public enum WonderfulColour {
  ROSY_BROWN(188, 143, 143),
  MEDIUM_SEA_GREEN(60, 179, 113),
  DEEP_PINK2(238, 18, 137),
  GOLD1(255, 215, 0),
  BLUE(0, 0, 255),
  YELLOW(255, 255, 0),
  WHITE_SMOKE(245, 245, 245),
  MAGENTA(255, 0, 255),
  TOMATO_3(205, 79, 57);

  int r, b, g;

  WonderfulColour(int r, int g, int b) {
    this.r = r;
    this.g = g;
    this.b = b;
  }
}
