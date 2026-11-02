package gg.corz;

public final class iillIliIIilIli {
   public static final int iIIllIIIIl = 4;
   public static final double iiiIlIIIIl = 0.2;
   public static final int lIIllIIIIl = 50;
   public static final int IlIllIIIIl = 8;
   public static final int IIIllIIIIl = 100;

   public static int liiiIIllIl(double roll) {
      double var2 = Double.isNaN(roll) ? 0.0 : Math.max(0.0, Math.min(0.999999, roll));
      return 4 + (int)(var2 * 5.0);
   }

   public static int IliIlllilIi(int delayMs, double roll) {
      double var3 = Double.isNaN(roll) ? 0.5 : Math.max(0.0, Math.min(1.0, roll));
      double var5 = (double)Math.max(0, delayMs) * (0.8 + 0.4 * var3);
      var5 = Math.max(100.0, var5);
      return (int)Math.ceil(var5 / 50.0 - 1.0E-9);
   }

   private iillIliIIilIli() {
   }
}
