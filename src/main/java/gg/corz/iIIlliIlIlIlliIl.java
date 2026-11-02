package gg.corz;

import java.util.List;

public final class iIIlliIlIlIlliIl {
   public static final List<llllIlilllIl> iIliliiIll = List.of(
      new Illlllilllllli(),
      new iiIIiIilIIlIiIil(),
      new lilIiiIliilIiiIl(),
      new IiIIiIlliIIiIl(),
      new IIIlilllIIlill(),
      new lIiIlIliIiIlIl(),
      new iiiIilIIIlil(),
      new iiiIlllIIIllll(),
      new IIilIlillIilIlil(),
      new lillIlIliillIlIl(),
      new lIillilliIillill(),
      new ilIliiilIiIliiil(),
      new IIIllIillIIllIil(),
      new IIiiiillIiiiil(),
      new liIIilIliiIIilIl(),
      new lIIIllIiiIIIllIi(),
      new lliiiIIliliiiIIl(),
      new IiIillilliIillil(),
      new IillIllillIl(),
      new lIliIIIliIliIIIl(),
      new lIIIiIIiiIIIiIIi()
   );

   public static String[] IliIlllilIi() {
      long var2 = -8474514399595751530L;
      String[] var0 = new String[iIliliiIll.size()];

      for (long var4 = var2 ^ (0L ^ var2) & -1L << 32; (int)(var4 >>> 32) < var0.length; var4 += 4294967296L) {
         var0[(int)(var4 >>> 32)] = iIliliiIll.get((int)(var4 >>> 32)).liiiIIllIl();
      }

      return var0;
   }

   private iIIlliIlIlIlliIl() {
   }

   public static int liiiIIllIl(String displayName) {
      long var2 = -5835036308498145650L;

      for (long var4 = var2 ^ (0L ^ var2) & -1L << 32; (int)(var4 >>> 32) < iIliliiIll.size(); var4 += 4294967296L) {
         if (iIliliiIll.get((int)(var4 >>> 32)).liiiIIllIl().equals(displayName)) {
            return (int)(var4 >>> 32);
         }
      }

      return -1;
   }
}
