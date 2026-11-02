package gg.corz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;

public final class IIliliIllIliliIl {
   public static List<IIIliilllIIliill> iliIiiliiiii(List<iIllIlIiIlllIlIi> pairs) {
      long var17 = -5904644069997040710L;
      long var13 = 8470549699956147966L;
      long var15 = -1930679444537311092L;
      ArrayList var1 = new ArrayList();
      HashMap var2 = new HashMap();

      for (iIllIlIiIlllIlIi var4 : pairs) {
         var2.computeIfAbsent((long)var4.iIilIIIIIi << 32 ^ (long)var4.IIilIIIIIi.iIlIlllllill() & 4294967295L, k -> new ArrayList<>()).add(var4);
      }

      for (Entry var20 : var2.entrySet()) {
         List var5 = (List)var20.getValue();
         long var21 = var13 ^ ((long)((iIllIlIiIlllIlIi)var5.get(0)).iIilIIIIIi << 32 ^ var13) & -1L << 32;
         var13 = var21 ^ ((long)lIiiIiIlilli((int)(var21 >>> 32)) ^ var21) & -1L >>> 32;
         long var22 = var15 ^ ((long)((int)var13 == 88 ? 90 : 88) << 32 ^ var15) & -1L << 32;
         long var23 = var22 ^ ((long)IlIlllIlilIl(var5, true) ^ var22) & -1L >>> 32;
         long var24 = var17 ^ ((long)IlIlllIlilIl(var5, false) << 32 ^ var17) & -1L << 32;
         var15 = var23 ^ ((long)((int)var23 >= (int)(var24 >>> 32) ? 88 : 90) << 32 ^ var23) & -1L << 32;
         ArrayList var11 = new ArrayList(var5);
         var17 = var24 ^ ((long)((int)(var15 >>> 32) == 88 ? 1 : 0) ^ var24) & -1L >>> 32;
         var11.sort(Comparator.comparingInt(p -> IIIllIIliIIl(p, rx)));
         var1.add(new IIIliilllIIliill((int)(var13 >>> 32), (char)((int)(var15 >>> 32)), (char)((int)var13), var11));
      }

      var1.sort(
         Comparator.<IIIliilllIIliill>comparingInt(b -> -b.IliIlllilIi())
            .thenComparingInt(b -> b.lIilIiiill.get(0).IIilIIIIIi.liiiIIllIl())
            .thenComparingInt(b -> b.lIilIiiill.get(0).IIilIIIIIi.IilliliilIIi())
      );
      return var1;
   }

   public static List<iIllIlIiIlllIlIi> IilliliilIIi(List<ilIlIlllIiIlIlll> cells) {
      HashMap var1 = new HashMap();

      for (ilIlIlllIiIlIlll var3 : cells) {
         var1.put(var3.IliIlllilIi(), var3);
      }

      ArrayList var10 = new ArrayList();
      HashSet var11 = new HashSet();
      ArrayList var4 = new ArrayList(cells);
      var4.sort(
         Comparator.comparingInt(ilIlIlllIiIlIlll::iIlIlllllill)
            .thenComparingInt(ilIlIlllIiIlIlll::liiiIIllIl)
            .thenComparingInt(ilIlIlllIiIlIlll::IilliliilIIi)
      );

      for (ilIlIlllIiIlIlll var6 : var4) {
         if (var6.iliIiiliiiii() != lIiIiilliIiIiill.lIililiill && !var11.contains(var6.IliIlllilIi())) {
            int[] var7 = illlIIllIillIIll.iliIiiliiiii(var6.lIiiIiIlilli(), var6.iliIiiliiiii());
            if (var7 != null) {
               ilIlIlllIiIlIlll var8 = (ilIlIlllIiIlIlll)var1.get(IliIlllilIi(var6.liiiIIllIl() + var7[0], var6.iIlIlllllill(), var6.IilliliilIIi() + var7[1]));
               if (var8 != null && !var11.contains(var8.IliIlllilIi())) {
                  iIllIlIiIlllIlIi var9 = liiiIIllIl(var6, var8);
                  if (var9 != null) {
                     var10.add(var9);
                     var11.add(var6.IliIlllilIi());
                     var11.add(var8.IliIlllilIi());
                  }
               }
            }
         }
      }

      return var10;
   }

   public static iIllIlIiIlllIlIi liiiIIllIl(ilIlIlllIiIlIlll b, ilIlIlllIiIlIlll a) {
      if (b != null && a != null) {
         if (b.IIIllIIliIIl() != a.IIIllIIliIIl()) {
            return null;
         } else if (b.lIiiIiIlilli() != a.lIiiIiIlilli()) {
            return null;
         } else if (b.iliIiiliiiii() == lIiIiilliIiIiill.lIililiill || a.iliIiiliiiii() == lIiIiilliIiIiill.lIililiill) {
            return null;
         } else if (b.iliIiiliiiii() == a.iliIiiliiiii()) {
            return null;
         } else if (iIlIlllllill(b, a) && iIlIlllllill(a, b)) {
            return b.iliIiiliiiii() == lIiIiilliIiIiill.iIililiill ? new iIllIlIiIlllIlIi(b, a) : new iIllIlIiIlllIlIi(a, b);
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public static List<ilIlIlllIiIlIlll> IIlllIlliIll(IIIliilllIIliill bank) {
      long var5 = -6908422173644884183L;
      ArrayList var1 = new ArrayList();

      for (iIllIlIiIlllIlIi var3 : bank.lIilIiiill) {
         var1.add(var3.IIilIIIIIi);
      }

      var5 ^= ((long)(bank.iillIiiill == bank.IIilIiiill ? 1 : 0) << 32 ^ var5) & -1L << 32;
      if ((int)(var5 >>> 32) == 0) {
         return var1;
      } else {
         ArrayList var7 = new ArrayList();

         for (var5 ^= (0L ^ var5) & -1L >>> 32; (int)var5 < var1.size(); var5 ^= (var5 ^ var5 + (long)2) & -1L >>> 32) {
            var7.add((ilIlIlllIiIlIlll)var1.get((int)var5));
         }

         for (long var10 = var5 ^ (1L ^ var5) & -1L >>> 32; (int)var10 < var1.size(); var10 ^= (var10 ^ var10 + (long)2) & -1L >>> 32) {
            var7.add((ilIlIlllIiIlIlll)var1.get((int)var10));
         }

         return var7;
      }
   }

   public static List<ilIlIlllIiIlIlll> Illlllllilll(IIIliilllIIliill bank) {
      HashMap var1 = new HashMap();

      for (iIllIlIiIlllIlIi var3 : bank.lIilIiiill) {
         var1.put(var3.IIilIIIIIi.IliIlllilIi(), var3);
      }

      ArrayList var6 = new ArrayList();

      for (ilIlIlllIiIlIlll var4 : IIlllIlliIll(bank)) {
         iIllIlIiIlllIlIi var5 = (iIllIlIiIlllIlIi)var1.get(var4.IliIlllilIi());
         if (var5 != null) {
            var6.add(var5.lIilIIIIIi);
         }
      }

      return var6;
   }

   public static char lIiiIiIlilli(int facing) {
      return (char)(facing != 0 && facing != 2 ? 'Z' : 'X');
   }

   private IIliliIllIliliIl() {
   }

   public static List<long[]> IiIlliIliiIl(IIIliilllIIliill bank) {
      IIIiililIIiili var1 = new IIIiililIIiili();
      ArrayList var2 = new ArrayList();

      for (iIllIlIiIlllIlIi var4 : bank.lIilIiiill) {
         for (ilIlIlllIiIlIlll var6 : var4.IliIlllilIi()) {
            long var7 = IliIlllilIi(var6.liiiIIllIl(), var6.iIlIlllllill() - 1, var6.IilliliilIIi());
            if (var1.IliIlllilIi(var7)) {
               var2.add(new long[]{(long)var6.liiiIIllIl(), (long)(var6.iIlIlllllill() - 1), (long)var6.IilliliilIIi()});
            }
         }
      }

      return var2;
   }

   private static int IIIllIIliIIl(iIllIlIiIlllIlIi p, boolean rowIsX) {
      return rowIsX ? p.IIilIIIIIi.liiiIIllIl() : p.IIilIIIIIi.IilliliilIIi();
   }

   private static boolean iIlIlllllill(ilIlIlllIiIlIlll a, ilIlIlllIiIlIlll b) {
      int[] var2 = illlIIllIillIIll.iliIiiliiiii(a.lIiiIiIlilli(), a.iliIiiliiiii());
      return var2 == null
         ? false
         : b.liiiIIllIl() == a.liiiIIllIl() + var2[0] && b.IilliliilIIi() == a.IilliliilIIi() + var2[1] && b.iIlIlllllill() == a.iIlIlllllill();
   }

   private static int IlIlllIlilIl(List<iIllIlIiIlllIlIi> x, boolean group) {
      long var7 = 551273389955313381L;
      long var9 = -6429739194788645198L;
      var7 ^= (9223372032559808512L ^ var7) & -1L << 32;
      var7 ^= (-2147483648L ^ var7) & -1L >>> 32;

      for (iIllIlIiIlllIlIi var5 : x) {
         var9 ^= ((long)(group ? var5.IIilIIIIIi.liiiIIllIl() : var5.IIilIIIIIi.IilliliilIIi()) << 32 ^ var9) & -1L << 32;
         var7 ^= ((long)Math.min((int)(var7 >>> 32), (int)(var9 >>> 32)) << 32 ^ var7) & -1L << 32;
         var7 ^= ((long)Math.max((int)var7, (int)(var9 >>> 32)) ^ var7) & -1L >>> 32;
      }

      return (int)var7 - (int)(var7 >>> 32);
   }

   public static long IliIlllilIi(int x, int z, int y) {
      return (long)(x & 67108863) << 38 | (long)(y & 67108863) << 12 | (long)(z & 4095);
   }
}
