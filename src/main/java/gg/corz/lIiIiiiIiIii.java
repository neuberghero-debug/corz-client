package gg.corz;

public final class lIiIiiiIiIii {
   private lIiIiiiIiIii() {
   }

   public static boolean liiiIIllIl(IllIIllllIIl s) {
      return s == IllIIllllIIl.iIlIIIllIllIIIll || s == IllIIllllIIl.iilIIIllIIiIIIll || s == IllIIllllIIl.IilIIIlllilIIIll;
   }

   public static IllIIllllIIl IliIlllilIi(int thisMc, String thisCorz, String cfgFormat, String cfgMc, String cfgCorz) {
      if (thisMc > 1) {
         return IllIIllllIIl.lllIIIllillIIIll;
      } else if (thisMc < 1) {
         return IllIIllllIIl.lIiIIIlliIiIIIll;
      } else if (thisMc < 1) {
         return IllIIllllIIl.iilIIIllIIiIIIll;
      } else {
         return thisCorz != null && cfgMc != null && !thisCorz.equals(cfgMc) ? IllIIllllIIl.IilIIIlllilIIIll : IllIIllllIIl.iIlIIIllIllIIIll;
      }
   }
}
