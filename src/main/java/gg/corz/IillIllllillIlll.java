package gg.corz;

public final class IillIllllillIlll {
   private IillIllllillIlll() {
   }

   public static int liiiIIllIl(int textWidth, int mark, int markGap, int padding) {
      return textWidth + mark + markGap + padding + textWidth;
   }

   public static int iIlIlllllill(int min, int width, int max) {
      return min < width ? width : (min > max ? max : min);
   }

   public static int IliIlllilIi(int lineGap, int subH, int titleH) {
      return lineGap + titleH + subH;
   }
}
