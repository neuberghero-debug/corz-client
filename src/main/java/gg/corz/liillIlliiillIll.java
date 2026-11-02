package gg.corz;

public final class liillIlliiillIll {
   public static final int lillIIilll = 1;
   public static final int iillIIilll = 1;
   public static final int IillIIilll = 9;

   public static boolean iIlIlllllill(int reserve, int learnedTotem, boolean[] unconfirmed, boolean[] slot, boolean allowTotemSlots) {
      if (reserve < 0 || reserve >= 9) {
         return true;
      } else if (IilliliilIIi(slot, reserve)) {
         return true;
      } else {
         return allowTotemSlots ? false : reserve == learnedTotem || IilliliilIIi(unconfirmed, reserve);
      }
   }

   private static boolean IilliliilIIi(boolean[] a, int i) {
      return a != null && i >= 0 && i < a.length && a[i];
   }

   public static boolean liiiIIllIl(long tick, long lastChangeTick, boolean urgent) {
      if (lastChangeTick != Long.MIN_VALUE && tick >= lastChangeTick) {
         long var5 = tick - lastChangeTick;
         return var5 >= 1L || urgent && var5 >= 1L;
      } else {
         return true;
      }
   }

   private liillIlliiillIll() {
   }

   public static int IliIlllilIi(boolean[] selected, int learnedTotem, int unconfirmed, boolean[] allowTotemSlots, boolean[] matches, boolean reserve) {
      long var8 = 1006850093142566277L;
      if (selected == null) {
         return -1;
      } else if (learnedTotem >= 0
         && learnedTotem < 9
         && IilliliilIIi(selected, learnedTotem)
         && !iIlIlllllill(learnedTotem, unconfirmed, allowTotemSlots, matches, reserve)) {
         return learnedTotem;
      } else {
         var8 ^= ((long)Math.min(9, selected.length) << 32 ^ var8) & -1L << 32;

         for (long var11 = var8 ^ (0L ^ var8) & -1L >>> 32; (int)var11 < (int)(var11 >>> 32); var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32) {
            if (selected[(int)var11] && !iIlIlllllill((int)var11, unconfirmed, allowTotemSlots, matches, reserve)) {
               return (int)var11;
            }
         }

         return -1;
      }
   }
}
