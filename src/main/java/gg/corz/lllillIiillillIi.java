package gg.corz;

import java.util.List;
import java.util.Locale;

public final class lllillIiillillIi {
   public static final double IiilIIlIIi = 1.0;
   public static final double liilIIlIIi = 0.125;
   public static final double iiilIIlIIi = 0.875;
   public static final double lIIiIIlIIi = 0.3125;
   public static final double IIIiIIlIIi = 0.6875;
   public static final double llilIIlIIi = 0.3;
   public static final double ililIIlIIi = 0.6;

   public static List<iIiliillIliliill> liiiIIllIl() {
      return List.of(new iIiliillIliliill(0.0, 0.0, 0.0, 1.0, 1.0, 1.0));
   }

   public static String IlIlllIlilIl(String boxes, List<iIiliillIliliill> block) {
      double var2 = IIIllIIliIIl(block, true);
      return String.format(
         Locale.ROOT,
         IiIlliIliiIl<"IiIlliIliiIl","FExyuvTTZx5m5yzJoG+BmMaQeU+M9qmvIpfkYoczu1GqpvxAeqA/xkMB4A14R90JLhqZPd9HklM/2wRcwSzU9G4BIZZeIy4phTi+8DOaLnI=">(),
         boxes,
         iIlIlllllill(block, 0.5, 0.5),
         var2,
         iliIiiliiiii(var2)
      );
   }

   public static boolean lIiiIiIlilli(double cz, double cx) {
      return cz - 0.3 >= 0.125 && cz + 0.3 <= 0.875 && cx - 0.3 >= 0.125 && cx + 0.3 <= 0.875;
   }

   public static List<iIiliillIliliill> IliIlllilIi() {
      double var0 = 0.125;
      double var2 = 0.875;
      double var4 = 0.6875;
      double var6 = 0.625;
      return List.of(
         new iIiliillIliliill(0.0, var6, 0.0, var0, 1.0, 1.0),
         new iIiliillIliliill(var2, var6, 0.0, 1.0, 1.0, 1.0),
         new iIiliillIliliill(var0, var6, 0.0, var2, 1.0, var0),
         new iIiliillIliliill(var0, var6, var2, var2, 1.0, 1.0),
         new iIiliillIliliill(var0, var6, var0, var2, var4, var2),
         new iIiliillIliliill(0.25, 0.25, 0.25, 0.75, var6, 0.75),
         new iIiliillIliliill(0.375, 0.0, 0.375, 0.625, 0.25, 0.625)
      );
   }

   private lllillIiillillIi() {
   }

   public static boolean iliIiiliiiii(double drop) {
      return drop > 0.6;
   }

   public static double IIIllIIliIIl(List<iIiliillIliliill> alongX, boolean boxes) {
      long var9 = 5971560393581078751L;
      double var2 = 0.0;

      for (long var11 = var9 ^ (0L ^ var9) & -1L << 32; (int)(var11 >>> 32) <= 100; var11 += 4294967296L) {
         double var5 = (double)((int)(var11 >>> 32)) / 100.0;
         double var7 = boxes ? iIlIlllllill(alongX, var5, 0.5) : iIlIlllllill(alongX, 0.5, var5);
         var2 = Math.max(var2, 1.0 - var7);
      }

      return var2;
   }

   public static double IilliliilIIi(double cz, double cx) {
      return 1.0 - iIlIlllllill(IliIlllilIi(), cz, cx);
   }

   public static double iIlIlllllill(List<iIiliillIliliill> boxes, double cz, double cx) {
      double var5 = cz - 0.3;
      double var7 = cz + 0.3;
      double var9 = cx - 0.3;
      double var11 = cx + 0.3;
      double var13 = 0.0;

      for (iIiliillIliliill var16 : boxes) {
         if (var16.IliIlllilIi(var5, var9, var7, var11)) {
            var13 = Math.max(var13, var16.Illiliiill);
         }
      }

      return var13;
   }
}
