package gg.corz;

import java.time.LocalDate;

public enum iIiiilIiIliiilIi {
   lIIIIilIIi,
   IIIIIilIIi,
   iIIIIilIIi;

   public static final String IlIIIilIIi = "Reveals itself on 1 December";
   private static final long llIIIilIIi = 30000L;
   // $VF: synthetic field
   private static final iIiiilIiIliiilIi[] IIlIIilIIi = IIlllIlliIll();
   private static long ilIIIilIIi;
   private static boolean iiIIIilIIi;
   private static iIiiilIiIliiilIi IiIIIilIIi = IIIIIilIIi;
   private static long liIIIilIIi;

   public static boolean lIiiIiIlilli() {
      long var3 = -7720697454406153339L;
      long var0 = System.currentTimeMillis();
      if (liIIIilIIi == 0L || var0 - liIIIilIIi > 30000L) {
         liIIIilIIi = var0;
         var3 ^= ((long)iliIiiliiiii(LocalDate.now()) << 32 ^ var3) & -1L << 32;
         iiIIIilIIi = (boolean)((int)(var3 >>> 32));
      }

      return iiIIIilIIi;
   }

   public static iIiiilIiIliiilIi IliIlllilIi() {
      iIiiilIiIliiilIi var0 = liiiIIllIl();
      if (var0 != null) {
         return var0;
      } else {
         long var1 = System.currentTimeMillis();
         if (ilIIIilIIi == 0L || var1 - ilIIIilIIi > 30000L) {
            ilIIIilIIi = var1;
            iIiiilIiIliiilIi var3 = IIIllIIliIIl(LocalDate.now());
            IiIIIilIIi = var3 == iIIIIilIIi && !lIiiIiIlilli() ? IIIIIilIIi : var3;
         }

         return IiIIIilIIi;
      }
   }

   public static iIiiilIiIliiilIi IIIllIIliIIl(LocalDate d) {
      long var3 = -6387750233219705738L;
      var3 ^= ((long)d.getMonthValue() << 32 ^ var3) & -1L << 32;
      var3 ^= ((long)d.getDayOfMonth() ^ var3) & -1L >>> 32;
      if ((int)(var3 >>> 32) != 10 && ((int)(var3 >>> 32) != 11 || (int)var3 != 1)) {
         return (int)(var3 >>> 32) != 12 && ((int)(var3 >>> 32) != 1 || (int)var3 != 1) ? IIIIIilIIi : iIIIIilIIi;
      } else {
         return lIIIIilIIi;
      }
   }

   public static int IlIlllIlilIl(LocalDate d) {
      return d.getMonthValue() == 1 ? d.getYear() - 1 : d.getYear();
   }

   public static iIiiilIiIliiilIi iIlIlllllill(String value, boolean christmasOpen) {
      long var4 = -5093044352701278874L;
      var4 ^= (-4294967296L ^ var4) & -1L << 32;
      switch (value.hashCode()) {
         case 525429805:
            if (value.equals(Illlllllilll<"Illlllllilll","e7aDSY+PvrH7iDuvQikwri1wlOApABDC/tBIEYOE7ssMLTTPPg==">())) {
               var4 ^= (0L ^ var4) & -1L << 32;
            }
            break;
         case 1235317602:
            if (value.equals(Illlllllilll<"Illlllllilll","ECPRtaOr104Bd4SuZpD8rO+mI3Zl3JpQmFFEKJPUKEAsTfMrRw==">())) {
               var4 ^= (4294967296L ^ var4) & -1L << 32;
            }
      }
      return switch ((int)(var4 >>> 32)) {
         case 0 -> lIIIIilIIi;
         case 1 -> christmasOpen ? iIIIIilIIi : lIIIIilIIi;
         default -> null;
      };
   }

   public static iIiiilIiIliiilIi liiiIIllIl() {
      Iiliililliliilil var0 = Iiliililliliilil.llllllllil;
      return var0 == null ? null : iIlIlllllill(var0.iIIillllil.Iilllilliill(), lIiiIiIlilli());
   }

   public static boolean iliIiiliiiii(LocalDate d) {
      return IIIllIIliIIl(d) == iIIIIilIIi;
   }

   public static String IilliliilIIi(String christmasOpen, boolean value) {
      return !value && Illlllllilll<"Illlllllilll","ECPRtaOr104Bd4SuZpD8rO+mI3Zl3JpQmFFEKJPUKEAsTfMrRw==">().equals(christmasOpen)
         ? Illlllllilll<"Illlllllilll","e7aDSY+PvrH7iDuvQikwri1wlOApABDC/tBIEYOE7ssMLTTPPg==">()
         : christmasOpen;
   }

   public static String IiIlliIliiIl(String base) {
      return base + Illlllllilll<"Illlllllilll","akUDB7qFMY1ajGCq2cwmZwZTqf15UTBqd0IxLdY=">() + IlIlllIlilIl(LocalDate.now());
   }
}
