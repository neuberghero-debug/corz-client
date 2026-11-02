package gg.corz;

import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2680;
import net.minecraft.class_3481;
import net.minecraft.class_3486;
import net.minecraft.class_3922;

public final class iIiIilIliIil {
   public static final int IiiiiIliliiiiIli = 287;
   public static final int IIiiiIlilIiiiIli = 256;
   public static final int iIIiiIliIlIiiIli = 1;
   public static final int lIliiIliiIliiIli = 16;
   public static final int liliiIliiiliiIli = 128;
   public static final int lIIIIlliiIIIIlli = 64;
   public static final int iiiiiIliIIIIIlli = 3;
   public static final int iiIiiIliIIliiIli = 8;
   private static final class_2350[] IlIIIllillIIIlli = new class_2350[]{
      class_2350.field_11043, class_2350.field_11035, class_2350.field_11039, class_2350.field_11034
   };
   public static final int illiiIliIiliiIli = 64;
   public static final int IiIiiIliliIiiIli = 4;
   public static final int lliiiIliiliiiIli = 1024;
   public static final int iIiiiIliIliiiIli = 512;
   public static final int IlliiIlillliiIli = 32;
   public static final int llIiiIliilIiiIli = 2;

   public static int liiiIIllIl(class_1937 feet, class_2338 w) {
      long var10 = 5388299521288830318L;
      long var12 = 8738110543499369527L;
      if (feet != null && w != null) {
         var10 ^= (0L ^ var10) & -1L << 32;
         class_2338 var3 = w.method_10084();
         class_2338 var4 = w.method_10074();
         class_2680 var5 = feet.method_8320(var4);
         var10 ^= ((long)((int)(var10 >>> 32) | lIiiIiIlilli(feet.method_8320(w))) << 32 ^ var10) & -1L << 32;
         var10 ^= ((long)((int)(var10 >>> 32) | lIiiIiIlilli(feet.method_8320(var3))) << 32 ^ var10) & -1L << 32;
         if (var5.method_26227().method_15767(class_3486.field_15518)) {
            var10 ^= ((long)((int)(var10 >>> 32) | 1) << 32 ^ var10) & -1L << 32;
         }

         if (var5.method_27852(class_2246.field_10092)) {
            var10 ^= ((long)((int)(var10 >>> 32) | 8) << 32 ^ var10) & -1L << 32;
         }

         if (var5.method_27852(class_2246.field_10029)) {
            var10 ^= ((long)((int)(var10 >>> 32) | 4) << 32 ^ var10) & -1L << 32;
         }

         if (class_3922.method_23896(var5)) {
            var10 ^= ((long)((int)(var10 >>> 32) | 2) << 32 ^ var10) & -1L << 32;
         }

         if (iliIiiliiiii(feet, w, var3, var4)) {
            var10 ^= ((long)((int)(var10 >>> 32) | 1024) << 32 ^ var10) & -1L << 32;
         }

         class_2350[] var6 = IlIIIllillIIIlli;
         var10 ^= ((long)var6.length ^ var10) & -1L >>> 32;

         for (long var18 = var12 ^ (0L ^ var12) & -1L << 32; (int)(var18 >>> 32) < (int)var10; var18 += 4294967296L) {
            class_2350 var9 = var6[(int)(var18 >>> 32)];
            if (feet.method_8320(w.method_10093(var9)).method_27852(class_2246.field_10029)
               || feet.method_8320(var3.method_10093(var9)).method_27852(class_2246.field_10029)) {
               var10 ^= ((long)((int)(var10 >>> 32) | 4) << 32 ^ var10) & -1L << 32;
               break;
            }
         }

         return (int)(var10 >>> 32);
      } else {
         return 0;
      }
   }

   public static int IilliliilIIi(class_1937 max, class_2338 w, int feet) {
      long var7 = 8371167822699304797L;
      if (max != null && w != null) {
         var7 ^= ((long)max.method_31607() << 32 ^ var7) & -1L << 32;
         var7 ^= (0L ^ var7) & -1L >>> 32;

         for (class_2338 var5 = w.method_10074(); (int)var7 < feet; var5 = var5.method_10074()) {
            if (var5.method_10264() < (int)(var7 >>> 32)) {
               return feet;
            }

            class_2680 var6 = max.method_8320(var5);
            if (!var6.method_26220(max, var5).method_1110() || var6.method_26227().method_15767(class_3486.field_15517)) {
               break;
            }

            var7 ^= (var7 ^ var7 + (long)1) & -1L >>> 32;
         }

         return (int)var7;
      } else {
         return 0;
      }
   }

   private iIiIilIliIil() {
   }

   public static boolean iIlIlllllill(class_1937 w, class_2338 feet) {
      return w != null && feet != null ? lllIIlilillIIlil.IIIllIIliIIl(w, feet) && (IliIlllilIi(w, feet) & 287) == 0 : false;
   }

   private static boolean IlIlllIlilIl(class_1937 start, class_2338 w) {
      long var6 = 796012560210879934L;
      var6 ^= ((long)start.method_31607() << 32 ^ var6) & -1L << 32;
      class_2338 var3 = w;

      for (long var9 = var6 ^ (0L ^ var6) & -1L >>> 32; (int)var9 < 64; var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32) {
         if (var3.method_10264() < (int)(var9 >>> 32)) {
            return true;
         }

         class_2680 var5 = start.method_8320(var3);
         if (!var5.method_26220(start, var3).method_1110() || !var5.method_26227().method_15769()) {
            return false;
         }

         var3 = var3.method_10074();
      }

      return true;
   }

   private static int lIiiIiIlilli(class_2680 s) {
      long var2 = 6351020188538816184L;
      var2 ^= (0L ^ var2) & -1L << 32;
      if (s.method_26227().method_15767(class_3486.field_15518)) {
         var2 ^= ((long)((int)(var2 >>> 32) | 1) << 32 ^ var2) & -1L << 32;
      }

      if (s.method_26227().method_15767(class_3486.field_15517)) {
         var2 ^= ((long)((int)(var2 >>> 32) | 32) << 32 ^ var2) & -1L << 32;
      }

      if (s.method_26164(class_3481.field_21952)) {
         var2 ^= ((long)((int)(var2 >>> 32) | 2) << 32 ^ var2) & -1L << 32;
      }

      if (class_3922.method_23896(s)) {
         var2 ^= ((long)((int)(var2 >>> 32) | 2) << 32 ^ var2) & -1L << 32;
      }

      if (s.method_27852(class_2246.field_10029)) {
         var2 ^= ((long)((int)(var2 >>> 32) | 4) << 32 ^ var2) & -1L << 32;
      }

      if (s.method_27852(class_2246.field_10092)) {
         var2 ^= ((long)((int)(var2 >>> 32) | 8) << 32 ^ var2) & -1L << 32;
      }

      if (s.method_27852(class_2246.field_27879)) {
         var2 ^= ((long)((int)(var2 >>> 32) | 16) << 32 ^ var2) & -1L << 32;
      }

      if (s.method_27852(class_2246.field_10343)) {
         var2 ^= ((long)((int)(var2 >>> 32) | 256) << 32 ^ var2) & -1L << 32;
      }

      if (s.method_27852(class_2246.field_16999)) {
         var2 ^= ((long)((int)(var2 >>> 32) | 512) << 32 ^ var2) & -1L << 32;
      }

      return (int)(var2 >>> 32);
   }

   private static boolean IIIllIIliIIl(class_1937 w, class_2338 p) {
      class_2680 var2 = w.method_8320(p);
      return var2.method_26220(w, p).method_1110();
   }

   private static boolean iliIiiliiiii(class_1937 below, class_2338 feet, class_2338 w, class_2338 head) {
      return iliilliIiiilli.liiiIIllIl(below)
         && (iliilliIiiilli.IilliliilIIi(below, feet) || iliilliIiiilli.IilliliilIIi(below, w) || iliilliIiiilli.IilliliilIIi(below, head));
   }

   public static int IliIlllilIi(class_1937 feet, class_2338 w) {
      long var13 = 2074229285239825206L;
      long var15 = 7036383320517181871L;
      if (feet != null && w != null) {
         var13 ^= (0L ^ var13) & -1L << 32;
         class_2338 var3 = w.method_10084();
         class_2338 var4 = w.method_10074();
         class_2680 var5 = feet.method_8320(w);
         class_2680 var6 = feet.method_8320(var3);
         class_2680 var7 = feet.method_8320(var4);
         var13 ^= ((long)((int)(var13 >>> 32) | lIiiIiIlilli(var5)) << 32 ^ var13) & -1L << 32;
         var13 ^= ((long)((int)(var13 >>> 32) | lIiiIiIlilli(var6)) << 32 ^ var13) & -1L << 32;
         if (var7.method_26227().method_15767(class_3486.field_15518)) {
            var13 ^= ((long)((int)(var13 >>> 32) | 1) << 32 ^ var13) & -1L << 32;
         }

         if (var7.method_27852(class_2246.field_10092)) {
            var13 ^= ((long)((int)(var13 >>> 32) | 8) << 32 ^ var13) & -1L << 32;
         }

         if (var7.method_27852(class_2246.field_10029)) {
            var13 ^= ((long)((int)(var13 >>> 32) | 4) << 32 ^ var13) & -1L << 32;
         }

         if (class_3922.method_23896(var7)) {
            var13 ^= ((long)((int)(var13 >>> 32) | 2) << 32 ^ var13) & -1L << 32;
         }

         if (iliIiiliiiii(feet, w, var3, var4)) {
            var13 ^= ((long)((int)(var13 >>> 32) | 1024) << 32 ^ var13) & -1L << 32;
         }

         class_2350[] var8 = IlIIIllillIIIlli;
         var13 ^= ((long)var8.length ^ var13) & -1L >>> 32;

         for (var15 ^= (0L ^ var15) & -1L << 32; (int)(var15 >>> 32) < (int)var13; var15 += 4294967296L) {
            class_2350 var11 = var8[(int)(var15 >>> 32)];
            if (feet.method_8320(w.method_10093(var11)).method_27852(class_2246.field_10029)
               || feet.method_8320(var3.method_10093(var11)).method_27852(class_2246.field_10029)) {
               var13 ^= ((long)((int)(var13 >>> 32) | 4) << 32 ^ var13) & -1L << 32;
               break;
            }
         }

         if (var7.method_26220(feet, var4).method_1110() && var7.method_26227().method_15769() && IlIlllIlilIl(feet, var4)) {
            var13 ^= ((long)((int)(var13 >>> 32) | 64) << 32 ^ var13) & -1L << 32;
         }

         var8 = IlIIIllillIIIlli;
         var13 ^= ((long)var8.length ^ var13) & -1L >>> 32;

         for (long var25 = var15 ^ (0L ^ var15) & -1L << 32; (int)(var25 >>> 32) < (int)var13; var25 += 4294967296L) {
            class_2350 var18 = var8[(int)(var25 >>> 32)];
            class_2338 var12 = w.method_10093(var18);
            if (IIIllIIliIIl(feet, var12) && IIIllIIliIIl(feet, var12.method_10084()) && IilliliilIIi(feet, var12, 3) >= 3) {
               var13 ^= ((long)((int)(var13 >>> 32) | 128) << 32 ^ var13) & -1L << 32;
               break;
            }
         }

         return (int)(var13 >>> 32);
      } else {
         return 0;
      }
   }
}
