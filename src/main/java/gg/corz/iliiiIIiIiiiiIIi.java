package gg.corz;

public enum iliiiIIiIiiiiIIi {
   illiliiiil,
   lililiiiil,
   Iililiiiil,
   Illiliiiil,
   llliliiiil;
   // $VF: synthetic field
   private static final iliiiIIiIiiiiIIi[] iililiiiil = liiiIIllIl();

   public static iliiiIIiIiiiiIIi IliIlllilIi(String name) {
      long var5 = -2552791404144624275L;
      if (name != null) {
         iliiiIIiIiiiiIIi[] var1 = values();
         var5 ^= ((long)var1.length << 32 ^ var5) & -1L << 32;

         for (long var8 = var5 ^ (0L ^ var5) & -1L >>> 32; (int)var8 < (int)(var8 >>> 32); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
            iliiiIIiIiiiiIIi var4 = var1[(int)var8];
            if (var4.name().equalsIgnoreCase(name)) {
               return var4;
            }
         }
      }

      return llliliiiil;
   }
}
