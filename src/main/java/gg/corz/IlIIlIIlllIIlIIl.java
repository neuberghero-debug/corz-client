package gg.corz;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;

public final class IlIIlIIlllIIlIIl {
   public static final int iiliilllIl = 27;
   public static final int liliilllIl = 2;
   private static final class_2350[] lliiilllIl = new class_2350[]{
      class_2350.field_11033, class_2350.field_11036, class_2350.field_11043, class_2350.field_11035, class_2350.field_11039, class_2350.field_11034
   };
   public static final int IIiiilllIl = 4;
   public static final float lIiiilllIl = 600.0F;
   public static final int iIiiilllIl = 64;
   public static final class_2350[] IliiilllIl = new class_2350[]{
      class_2350.field_11043, class_2350.field_11035, class_2350.field_11039, class_2350.field_11034
   };

   public static class_2338 IlIlllIlilIl(liiiiIiiiiiiIi from, class_243 v, class_243 virtualAir, class_2338 to) {
      long var7 = 602248925969533116L;
      if (from != null && v != null && virtualAir != null) {
         List var4 = IIlllIlliIll(v, virtualAir);

         for (long var9 = var7 ^ (0L ^ var7) & -1L << 32; (int)(var9 >>> 32) < var4.size() - 1; var9 += 4294967296L) {
            class_2338 var6 = (class_2338)var4.get((int)(var9 >>> 32));
            if (!var6.equals(to) && !from.IliIlllilIi(var6)) {
               return var6;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   public static class_2338 IIIllIIliIIl(liiiiIiiiiiiIi to, class_243 v, class_243 from) {
      return IlIlllIlilIl(to, v, from, null);
   }

   static boolean IilliliilIIi(liiiiIiiiiiiIi f, class_2338 v) {
      long var6 = 2112962678267464633L;
      class_2350[] var2 = IliiilllIl;
      var6 ^= ((long)var2.length << 32 ^ var6) & -1L << 32;

      for (long var9 = var6 ^ (0L ^ var6) & -1L >>> 32; (int)var9 < (int)(var9 >>> 32); var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32) {
         class_2350 var5 = var2[(int)var9];
         if (f.IliIlllilIi(v.method_10093(var5))) {
            return false;
         }
      }

      return true;
   }

   public static int IliIlllilIi(class_2338 a, class_2338 b) {
      return Math.max(
         Math.abs(a.method_10263() - b.method_10263()), Math.max(Math.abs(a.method_10264() - b.method_10264()), Math.abs(a.method_10260() - b.method_10260()))
      );
   }

   public static IiIiiIlliIiiIl liiiIIllIl(liiiiIiiiiiiIi blockedHint, class_2338 feet, iIIlIIllIlIlIIll eye, boolean v, class_243 tools, class_243 lowAim) {
      long var19 = 7282359734860713699L;
      long var21 = -2228896215102052208L;
      long var23 = -3399481418718460265L;
      if (blockedHint != null && feet != null) {
         iIIlIIllIlIlIIll var6 = eye == null ? iIIlIIllIlIlIIll.llliiiIlll : eye;
         class_2338 var7 = feet.method_10062();
         HashSet var8 = new HashSet();
         ArrayList var9 = new ArrayList();
         ArrayList var10 = new ArrayList();
         ArrayDeque var11 = new ArrayDeque();
         class_2338[] var12 = new class_2338[]{var7, var7.method_10084()};
         var19 ^= ((long)var12.length << 32 ^ var19) & -1L << 32;

         for (long var37 = var19 ^ (0L ^ var19) & -1L >>> 32; (int)var37 < (int)(var37 >>> 32); var37 ^= (var37 ^ var37 + (long)1) & -1L >>> 32) {
            class_2338 var15 = var12[(int)var37];
            if (blockedHint.IliIlllilIi(var15) && var8.add(var15)) {
               var11.add(var15);
            }
         }

         var21 ^= (0L ^ var21) & -1L << 32;

         while (!var11.isEmpty()) {
            class_2338 var13 = (class_2338)var11.poll();
            if (var9.size() >= 27) {
               var21 ^= (4294967296L ^ var21) & -1L << 32;
               var10.add(var13);
               break;
            }

            var9.add(var13);
            class_2350[] var14 = lliiilllIl;
            var21 ^= ((long)var14.length ^ var21) & -1L >>> 32;

            for (var23 ^= (0L ^ var23) & -1L << 32; (int)(var23 >>> 32) < (int)var21; var23 += 4294967296L) {
               class_2350 var17 = var14[(int)(var23 >>> 32)];
               class_2338 var18 = var13.method_10093(var17);
               if (var8.add(var18) && blockedHint.IliIlllilIi(var18)) {
                  if (IliIlllilIi(var18, var7) >= 2) {
                     var10.add(var18);
                  } else {
                     var11.add(var18);
                  }
               }
            }
         }

         if (!var11.isEmpty()) {
            var21 ^= (4294967296L ^ var21) & -1L << 32;
         }

         ArrayList var25 = new ArrayList();
         class_2350[] var26 = IliiilllIl;
         var21 ^= ((long)var26.length ^ var21) & -1L >>> 32;

         for (var23 ^= (0L ^ var23) & -1L << 32; (int)(var23 >>> 32) < (int)var21; var23 += 4294967296L) {
            class_2350 var31 = var26[(int)(var23 >>> 32)];
            class_2338 var34 = var7.method_10093(var31);
            if (!blockedHint.IliIlllilIi(var34)) {
               var25.add(iliIiiliiiii(blockedHint, var6, var34, 0, var31));
            }
         }

         var26 = IliiilllIl;
         var21 ^= ((long)var26.length ^ var21) & -1L >>> 32;

         for (long var43 = var23 ^ (0L ^ var23) & -1L << 32; (int)(var43 >>> 32) < (int)var21; var43 += 4294967296L) {
            class_2350 var32 = var26[(int)(var43 >>> 32)];
            class_2338 var35 = var7.method_10084().method_10093(var32);
            if (!blockedHint.IliIlllilIi(var35)) {
               var25.add(iliIiiliiiii(blockedHint, var6, var35, 1, var32));
            }
         }

         ililiIIlIiiliIIl var28 = null;

         for (var21 ^= (2L ^ var21) & -1L >>> 32; (int)var21 <= 4; var21 ^= (var21 ^ var21 + (long)1) & -1L >>> 32) {
            class_2338 var16 = var7.method_10086((int)var21);
            if (!blockedHint.IliIlllilIi(var16)) {
               var28 = iliIiiliiiii(blockedHint, var6, var16, 2, class_2350.field_11036);
               break;
            }
         }

         illllIliIilllIli var29;
         if (var10.isEmpty() && (int)(var21 >>> 32) == 0) {
            var29 = illllIliIilllIli.lIiilIllIi;
         } else if ((int)(var21 >>> 32) == 0 && iIlIlllllill(var10, var7)) {
            var29 = illllIliIilllIli.IIiilIllIi;
         } else if (IilliliilIIi(blockedHint, var7)) {
            var29 = illllIliIilllIli.iililIllIi;
         } else if (v) {
            var29 = illllIliIilllIli.lililIllIi;
         } else {
            var29 = illllIliIilllIli.IililIllIi;
         }

         ililiIIlIiiliIIl var30 = null;
         if (tools != null && lowAim != null) {
            class_2338 var33 = IIIllIIliIIl(blockedHint, tools, lowAim);
            if (var33 != null) {
               var30 = iliIiiliiiii(blockedHint, var6, var33, 3, null);
            }
         }

         return new IiIiiIlliIiiIl(var29, var7, var9.size(), List.copyOf(var9), List.copyOf(var10), List.copyOf(var25), var28, var30);
      } else {
         return IiIiiIlliIiiIl.lIiIiiilliIiIiiill;
      }
   }

   public static boolean IiIlliIliiIl(liiiiIiiiiiiIi v, class_243 virtualAir, class_243 to, class_2338 target, class_2338 from) {
      if (v != null && virtualAir != null && to != null) {
         for (class_2338 var6 : IIlllIlliIll(virtualAir, to)) {
            if (target != null && var6.equals(target)) {
               return true;
            }

            if (!var6.equals(from) && !v.IliIlllilIi(var6)) {
               return false;
            }
         }

         return target == null;
      } else {
         return false;
      }
   }

   static ililiIIlIiiliIIl iliIiiliiiii(liiiiIiiiiiiIi side, iIIlIIllIlIlIIll level, class_2338 p, int tt, class_2350 v) {
      long var10 = 1692647390456968138L;
      float var5 = side.iIlIlllllill(p);
      IlIlIiilllIlIiil var6 = lIiiIiIlilli(var5, side.IilliliilIIi(p));
      var10 ^= ((long)(var6 == IlIlIiilllIlIiil.illIiillil ? Integer.MAX_VALUE : level.IiIlliIliiIl(side, p, true, true).IilliliilIIi()) << 32 ^ var10)
         & -1L << 32;
      IlIllillIlli var8 = var6 == IlIlIiilllIlIiil.illIiillil ? IlIllillIlli.iilliiIIlIIiliiIIl : level.IiIlliIliiIl(side, p, false, true);
      class_2338 var9 = p.method_10074();
      return new ililiIIlIiiliIIl(
         p.method_10062(), tt, v, var6, (int)(var10 >>> 32), var8.IilliliilIIi(), var8.iIlIlllllill(), side.IIIllIIliIIl(var9), side.IlIlllIlilIl(var9)
      );
   }

   static boolean iIlIlllllill(List<class_2338> f, class_2338 escapes) {
      if (f.isEmpty()) {
         return false;
      } else {
         for (class_2338 var3 : f) {
            if (var3.method_10264() < escapes.method_10264() + 2) {
               return false;
            }

            if (Math.abs(var3.method_10263() - escapes.method_10263()) > 1 || Math.abs(var3.method_10260() - escapes.method_10260()) > 1) {
               return false;
            }
         }

         return true;
      }
   }

   public static List<class_2338> IIlllIlliIll(class_243 to, class_243 from) {
      long var32 = 8735437765014879899L;
      long var34 = -8310513635141739509L;
      long var36 = 4380555694436508676L;
      long var30 = 5832495961197590242L;
      ArrayList var2 = new ArrayList();
      var30 ^= ((long)Illlllllilll(to.field_1352) << 32 ^ var30) & -1L << 32;
      var30 ^= ((long)Illlllllilll(to.field_1351) ^ var30) & -1L >>> 32;
      var32 ^= ((long)Illlllllilll(to.field_1350) << 32 ^ var32) & -1L << 32;
      double var6 = from.field_1352 - to.field_1352;
      double var8 = from.field_1351 - to.field_1351;
      double var10 = from.field_1350 - to.field_1350;
      var32 ^= ((long)((int)Math.signum(var6)) ^ var32) & -1L >>> 32;
      var34 ^= ((long)((int)Math.signum(var8)) << 32 ^ var34) & -1L << 32;
      var34 ^= ((long)((int)Math.signum(var10)) ^ var34) & -1L >>> 32;
      double var15 = var6 == 0.0 ? Double.POSITIVE_INFINITY : Math.abs(1.0 / var6);
      double var17 = var8 == 0.0 ? Double.POSITIVE_INFINITY : Math.abs(1.0 / var8);
      double var19 = var10 == 0.0 ? Double.POSITIVE_INFINITY : Math.abs(1.0 / var10);
      double var21 = var6 == 0.0
         ? Double.POSITIVE_INFINITY
         : (var6 > 0.0 ? (double)((int)(var30 >>> 32) + 1) - to.field_1352 : to.field_1352 - (double)((int)(var30 >>> 32))) * var15;
      double var23 = var8 == 0.0
         ? Double.POSITIVE_INFINITY
         : (var8 > 0.0 ? (double)((int)var30 + 1) - to.field_1351 : to.field_1351 - (double)((int)var30)) * var17;
      double var25 = var10 == 0.0
         ? Double.POSITIVE_INFINITY
         : (var10 > 0.0 ? (double)((int)(var32 >>> 32) + 1) - to.field_1350 : to.field_1350 - (double)((int)(var32 >>> 32))) * var19;

      for (long var44 = var36 ^ (0L ^ var36) & -1L << 32; (int)(var44 >>> 32) < 64; var44 += 4294967296L) {
         double var28 = Math.min(var21, Math.min(var23, var25));
         if (var28 > 1.0) {
            break;
         }

         if (var21 <= var23 && var21 <= var25) {
            var30 ^= ((long)((int)(var30 >>> 32) + (int)var32) << 32 ^ var30) & -1L << 32;
            var21 += var15;
         } else if (var23 <= var25) {
            var30 ^= ((long)((int)var30 + (int)(var34 >>> 32)) ^ var30) & -1L >>> 32;
            var23 += var17;
         } else {
            var32 ^= ((long)((int)(var32 >>> 32) + (int)var34) << 32 ^ var32) & -1L << 32;
            var25 += var19;
         }

         var2.add(new class_2338((int)(var30 >>> 32), (int)var30, (int)(var32 >>> 32)));
      }

      return var2;
   }

   private IlIIlIIlllIIlIIl() {
   }

   public static IlIlIiilllIlIiil lIiiIiIlilli(float blastResistance, float hardness) {
      if (blastResistance < 0.0F) {
         return IlIlIiilllIlIiil.illIiillil;
      } else {
         return hardness >= 600.0F ? IlIlIiilllIlIiil.IilIiillil : IlIlIiilllIlIiil.lilIiillil;
      }
   }

   private static int Illlllllilll(double d) {
      return (int)Math.floor(d);
   }
}
