package gg.corz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public final class iIilIIIiIlilIIIi {
   public static ilIIilIlIiIIilIl liiiIIllIl(List<lIIIlliiIIIlli> staleTicks, int cap, int cells) {
      long var32 = -8735857172566048969L;
      long var34 = -6719385713007101529L;
      long var36 = -6224288987982731077L;
      long var38 = 6988567425595306952L;
      long var40 = 2463788599997418422L;
      long var42 = -170567885805050580L;
      long var28 = -6838199634544759900L;
      long var44 = 2321642980268807628L;
      long var30 = 39074129384819475L;
      var28 ^= ((long)staleTicks.size() << 32 ^ var28) & -1L << 32;
      var28 ^= (0L ^ var28) & -1L >>> 32;
      var30 ^= (0L ^ var30) & -1L << 32;
      var30 ^= (0L ^ var30) & -1L >>> 32;
      var32 ^= (0L ^ var32) & -1L << 32;
      var32 ^= (0L ^ var32) & -1L >>> 32;
      var34 ^= (0L ^ var34) & -1L << 32;
      var34 ^= (0L ^ var34) & -1L >>> 32;
      var36 ^= (0L ^ var36) & -1L << 32;
      var36 ^= (0L ^ var36) & -1L >>> 32;
      var38 ^= (0L ^ var38) & -1L << 32;
      var38 ^= (0L ^ var38) & -1L >>> 32;
      var40 ^= (0L ^ var40) & -1L << 32;
      ArrayList var16 = new ArrayList();
      ArrayList var17 = new ArrayList();
      ArrayList var18 = new ArrayList();
      ArrayList var19 = new ArrayList();
      ArrayList var20 = new ArrayList();

      for (lIIIlliiIIIlli var22 : staleTicks) {
         if (!var22.iIlIlllllill()
            && !var22.Iilllilliill()
            && !var22.IilliliilIIi()
            && var22.IIIllIIliIIl()
            && !var22.IlIlllIlilIl()
            && var22.IiIlliIliiIl() < cells) {
            var20.add(var22);
         }
      }

      var20.sort(Comparator.comparingInt(lIIIlliiIIIlli::IiIlliIliiIl));
      var40 ^= ((long)IliIlllilIi(cap) ^ var40) & -1L >>> 32;
      HashSet var46 = new HashSet();

      for (var42 ^= (0L ^ var42) & -1L << 32; (int)(var42 >>> 32) < var20.size() && (int)(var42 >>> 32) < (int)var40; var42 += 4294967296L) {
         var46.add(((lIIIlliiIIIlli)var20.get((int)(var42 >>> 32))).IliIlllilIi());
      }

      for (lIIIlliiIIIlli var24 : staleTicks) {
         IIlIliillIlIliil var25;
         if (var24.iIlIlllllill() || var24.Iilllilliill()) {
            var25 = IIlIliillIlIliil.IIlilIilil;
         } else if (var24.IilliliilIIi()) {
            var25 = IIlIliillIlIliil.lIlilIilil;
         } else if (var46.contains(var24.IliIlllilIi())) {
            var25 = IIlIliillIlIliil.iIlilIilil;
         } else if (var24.IIIllIIliIIl() && !var24.IlIlllIlilIl() && var24.IiIlliIliiIl() < cells) {
            var25 = IIlIliillIlIliil.IllilIilil;
         } else if (!var24.IlIlllIlilIl() && var24.IiIlliIliiIl() < cells) {
            var25 = IIlIliillIlIliil.IililIilil;
         } else {
            var25 = IIlIliillIlIliil.lllilIilil;
         }

         switch (var25) {
            case iIlilIilil:
               var28 ^= (var28 ^ var28 + (long)1) & -1L >>> 32;
               if (var24.Iilllilliill() && !var24.iIlIlllllill()) {
                  var34 ^= (var34 ^ var34 + (long)1) & -1L >>> 32;
               }
               break;
            case lIlilIilil:
               var30 += 4294967296L;
               break;
            case IililIilil:
               var30 ^= (var30 ^ var30 + (long)1) & -1L >>> 32;
               break;
            case IllilIilil:
               var32 += 4294967296L;
               break;
            case IIlilIilil:
               var32 ^= (var32 ^ var32 + (long)1) & -1L >>> 32;
               break;
            case lllilIilil:
               var34 += 4294967296L;
         }

         if (var25 != IIlIliillIlIliil.IIlilIilil && var25 != IIlIliillIlIliil.lIlilIilil) {
            if (var24.lIiiIiIlilli()) {
               var38 ^= (var38 ^ var38 + (long)1) & -1L >>> 32;
               var19.add(var24.IliIlllilIi());
            } else {
               var42 ^= ((long)(var24.IIlllIlliIll() && !var24.iliIiiliiiii() ? 1 : 0) ^ var42) & -1L >>> 32;
               if ((int)var42 != 0) {
                  var36 += 4294967296L;
               } else {
                  if (!var24.Illlllllilll()) {
                     var38 += 4294967296L;
                     var18.add(var24.IliIlllilIi());
                     continue;
                  }

                  var36 ^= (var36 ^ var36 + (long)1) & -1L >>> 32;
                  var17.add(var24.IliIlllilIi());
               }
               var44 ^= ((long)(switch (var25) {
                  case IllilIilil -> 2;
                  case IIlilIilil -> 1;
                  case lllilIilil -> 0;
                  default -> 3;
               }) << 32 ^ var44) & -1L << 32;
               if ((int)(var44 >>> 32) == 3) {
                  var40 += 4294967296L;
               }

               var16.add(new long[]{var24.IliIlllilIi(), (long)((int)(var44 >>> 32)), (int)var42 != 0 ? 0L : 1L});
            }
         }
      }

      var16.sort(Comparator.<long[]>comparingLong(a -> a[1]).thenComparingLong(a -> a[2]));
      ArrayList var47 = new ArrayList(var16.size());

      for (long[] var49 : var16) {
         var47.add(var49[0]);
      }

      return new ilIIilIlIiIIilIl(
         (int)(var28 >>> 32),
         (int)var28,
         (int)(var30 >>> 32),
         (int)var30,
         (int)(var32 >>> 32),
         (int)var32,
         (int)(var34 >>> 32),
         (int)(var36 >>> 32),
         (int)var36,
         (int)(var38 >>> 32),
         (int)var38,
         (int)var34,
         (int)(var40 >>> 32),
         var47,
         var17,
         var18,
         var19
      );
   }

   private iIilIIIiIlilIIIi() {
   }

   public static boolean iIlIlllllill(int actionableDebtAfterLowerTiers, int cap) {
      return actionableDebtAfterLowerTiers > cap;
   }

   public static int IliIlllilIi(int cap) {
      return Math.max(1, cap / 2);
   }
}
