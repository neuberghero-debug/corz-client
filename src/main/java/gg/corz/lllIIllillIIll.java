package gg.corz;

public final class lllIIllillIIll {
   private static final int IiIllIIilliIllIIil = 40;

   public static boolean IliIlllilIi(int hotbarSlot) {
      long var2 = -8748686541378023014L;
      if (hotbarSlot >= 0 && hotbarSlot <= 8) {
         var2 ^= ((long)IIIIilIilIIIilIi.IlIllllIll() << 32 ^ var2) & -1L << 32;
         return (int)(var2 >>> 32) >= 0 && (hotbarSlot == (int)(var2 >>> 32) || IIIIilIilIIIilIi.ilIllIiIll(hotbarSlot));
      } else {
         return false;
      }
   }

   public static boolean iIlIlllllill() {
      long var1 = -1390903154156480188L;

      for (long var3 = var1 ^ (0L ^ var1) & -1L << 32; (int)(var3 >>> 32) <= 40; var3 += 4294967296L) {
         if (IIIIilIilIIIilIi.iiiIlIIIll((int)(var3 >>> 32))) {
            return true;
         }
      }

      return false;
   }

   public static boolean liiiIIllIl(int invSlot) {
      return IIIIilIilIIIilIi.iiiIlIIIll(invSlot);
   }

   private lllIIllillIIll() {
   }
}
