package gg.corz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;

public final class iIiIlllIliIlll {
   public static final int iIillIiilIlillIiil = 200;
   private static final double[][] IiiIiIiilliiIiIiil = new double[][]{{0.5, 0.5}, {0.25, 0.25}, {0.75, 0.25}, {0.25, 0.75}, {0.75, 0.75}};
   public static final float lliIiIiililiIiIiil = 1.0F;
   public static final double IiIIiIiilliIIiIiil = 0.02;
   public static final float illIiIiilIilIiIiil = 5.4F;
   public static final float lilIiIiiliilIiIiil = 6.0F;
   public static final double llIIiIiililIIiIiil = 0.25;
   public static final double lIIilIiiliIIilIiil = 3.0;
   private static final class_2350[] iiiIiIiilIIIliIiil = class_2350.values();
   public static final double liiilIiiliiiilIiil = 0.25;
   public static final float iiIIiIiilIIlIiIiil = 10.0F;
   public static final double IiillIiilliillIiil = 4.4;
   public static final int iliilIiilIiiilIiil = 3;
   public static final double IIIIiIiillIIIiIiil = 2.0;
   public static final float lIlIiIiiliIlIiIiil = 5.7F;
   public static final int lilllIiiliilllIiil = 160;
   public static final float IIiIiIiillIiIiIiil = 4.0F;
   public static final float IllIiIiillllIiIiil = 5.4F;
   public static final double IlIilIiilllIilIiil = 4.4;
   public static final int lIiilIiiliIiilIiil = 4;
   public static final int IililIiillililIiil = 4;
   public static final double iIIIiIiilIlIIiIiil = 0.05;
   public static final int IIlilIiillIlilIiil = 2;
   public static final int lllilIiilillilIiil = 1;
   public static final int iIlilIiilIllilIiil = 3;
   public static final int iililIiilIIiilIiil = 2;
   public static final double ilIilIiilIiIilIiil = 1.62;
   public static final int IliilIiillliilIiil = 40;
   public static final double iiillIiilIIIilIiil = 4.4;
   public static final int IIillIiillIillIiil = 60;
   public static final int llillIiililillIiil = 45;
   public static final double iIiIiIiilIliIiIiil = 1.0;
   public static final int liIilIiiliiIilIiil = 2;

   static boolean IIillIiliIil(liiiiIiiiiiiIi eye, class_243 follow, liiliiliiiliil cell, class_2338 minedAir, class_2338 v) {
      if (cell == liiliiliiiliil.IlIillllillIilllli || minedAir == null) {
         return true;
      } else if (cell == liiliiliiiliil.ilIilllliIiIilllli) {
         class_243 var6 = new class_243(
            (double)minedAir.method_10263() + 0.5, (double)minedAir.method_10264() + 1.0 - 0.02, (double)minedAir.method_10260() + 0.5
         );
         if (follow.method_1022(var6) > 4.4) {
            return false;
         } else {
            return !IlIIlIIlllIIlIIl.IiIlliIliiIl(eye, follow, var6, minedAir, v) ? false : Iliilliiilii(follow, IIiilIiiiIii(minedAir)) <= 3.0;
         }
      } else {
         class_243 var5 = class_243.method_24953(minedAir);
         return follow.method_1022(var5) > 4.4 ? false : IlIIlIIlllIIlIIl.IiIlliIliiIl(eye, follow, var5, minedAir, v);
      }
   }

   public static class_238 IIiilIiiiIii(class_2338 base) {
      return new class_238(
         (double)base.method_10263() - 0.5,
         (double)base.method_10264() + 1.0,
         (double)base.method_10260() - 0.5,
         (double)base.method_10263() + 1.5,
         (double)base.method_10264() + 3.0,
         (double)base.method_10260() + 1.5
      );
   }

   private static void IilliliilIIi(List<liIilllliiIillll> p, liIilllliiIillll out) {
      if (out != null) {
         p.add(out);
      }
   }

   static float lIiiIiIlilli(IIIiIlilIIiIli e) {
      return switch (e) {
         case IillIlIIIl -> 10.0F;
         case IlllIlIIIl -> 5.7F;
         case llllIlIIIl -> 5.4F;
         case IIilIlIIIl -> 5.4F;
         case lillIlIIIl -> 6.0F;
         case iillIlIIIl -> 4.0F;
         case illlIlIIIl -> 0.0F;
      };
   }

   public static liIilllliiIillll liiiIIllIl(illlllIiIillllIi in, Predicate<class_2338> skip) {
      List var2 = iIlIlllllill(in);
      liIilllliiIillll var3 = null;

      for (liIilllliiIillll var5 : var2) {
         if ((skip == null || var5.IilliliilIIi() == null || !skip.test(var5.IilliliilIIi()))
            && (var3 == null || var5.IIIilIIiiIIi() > var3.IIIilIIiiIIi() + 1.0E-9)) {
            var3 = var5;
         }
      }

      if (var3 != null) {
         return var3;
      } else {
         return in != null && in.liiiIIllIl() != null && in.liiiIIllIl().liiiIIllIl()
            ? new liIilllliiIillll(IIIiIlilIIiIli.IIilIlIIIl, null, null, null, null, liiliiliiiliil.IlIillllillIilllli, null, null, -1, 0, 0, 0.0, 0.0, 1.0)
            : null;
      }
   }

   private iIiIlllIliIlll() {
   }

   static int IIlilIliiIli(illlllIiIillllIi in, class_2338 s) {
      if (in.IIlllIlliIll() != null) {
         return in.IIlllIlliIll().IliIlllilIi(s);
      } else {
         class_243 var2 = in.IilliliilIIi();
         if (var2 == null) {
            return 0;
         } else {
            double var3 = Math.sqrt(var2.method_1028((double)s.method_10263() + 0.5, (double)s.method_10264(), (double)s.method_10260() + 0.5));
            return (int)Math.ceil(var3 / 0.25);
         }
      }
   }

   static boolean IIlllIlliIll(liiiiIiiiiiiIi minedAir, class_2338 cell, class_2338 v) {
      long var8 = -675039639426212715L;
      class_2350[] var3 = iiiIiIiilIIIliIiil;
      var8 ^= ((long)var3.length << 32 ^ var8) & -1L << 32;

      for (long var11 = var8 ^ (0L ^ var8) & -1L >>> 32; (int)var11 < (int)(var11 >>> 32); var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32) {
         class_2350 var6 = var3[(int)var11];
         class_2338 var7 = cell.method_10093(var6);
         if (!var7.equals(v) && !minedAir.IliIlllilIi(var7) && minedAir.IlIlllIlilIl(var7)) {
            return true;
         }
      }

      return false;
   }

   public static List<liIilllliiIillll> iIlIlllllill(illlllIiIillllIi in) {
      long var11 = 492724599022111448L;
      long var13 = -2295696675625258592L;
      ArrayList var1 = new ArrayList();
      if (in != null && in.IliIlllilIi() != null && in.liiiIIllIl() != null && in.liiiIIllIl().IIIllIIliIIl() != null) {
         IiIiiIlliIiiIl var2 = in.liiiIIllIl();
         if (!var2.IliIlllilIi()) {
            return var1;
         } else {
            class_2338 var3 = var2.IIIllIIliIIl();
            HashMap var4 = new HashMap();
            var11 ^= ((long)(var2.liiiIIllIl() ? 200 : 60) << 32 ^ var11) & -1L << 32;

            for (ililiIIlIiiliIIl var7 : var2.iIlIlllllill(0)) {
               if (var7.lIiiIiIlilli() == IlIlIiilllIlIiil.IilIiillil && var7.IliIlllilIi((int)(var11 >>> 32))) {
                  if (in.lIiiIiIlilli() && var7.IiIlliIliiIl()) {
                     IilliliilIIi(
                        var1, IlIlllIlilIl(in, var4, IIIiIlilIIiIli.IlllIlIIIl, var7, liiliiliiiliil.ilIilllliIiIilllli, var7.liiiIIllIl().method_10074())
                     );
                  }

                  if (in.iliIiiliiiii() && var7.IIlllIlliIll()) {
                     IilliliilIIi(var1, IlIlllIlilIl(in, var4, IIIiIlilIIiIli.llllIlIIIl, var7, liiliiliiiliil.liIilllliiiIilllli, var7.liiiIIllIl()));
                  }
               }
            }

            ililiIIlIiiliIIl var15 = var2.Iilllilliill();
            var11 ^= ((long)(!var2.liiiIIllIl() && var2.iliIiiliiiii() != illllIliIilllIli.IIiilIllIi ? 0 : 1) ^ var11) & -1L >>> 32;
            if (in.iliIiiliiiii() && var15 != null && (int)var11 != 0 && var15.lIiiIiIlilli() != IlIlIiilllIlIiil.illIiillil) {
               var13 ^= ((long)(var15.lIiiIiIlilli() == IlIlIiilllIlIiil.IilIiillil ? (int)(var11 >>> 32) : 160) << 32 ^ var13) & -1L << 32;
               class_2338 var9 = var3.method_10086(2);
               if (var15.IliIlllilIi((int)(var13 >>> 32))
                  && (var15.liiiIIllIl().equals(var9) || in.IliIlllilIi().IliIlllilIi(var9))
                  && IIlllIlliIll(in.IliIlllilIi(), var9, var15.liiiIIllIl())) {
                  IilliliilIIi(var1, IlIlllIlilIl(in, var4, IIIiIlilIIiIli.illlIlIIIl, var15, liiliiliiiliil.liIilllliiiIilllli, var9));
               }
            }

            if (in.iliIiiliiiii() && var2.iliIiiliiiii() == illllIliIilllIli.IIiilIllIi && in.IliIlllilIi().Illlllllilll(var3.method_10086(2))) {
               IilliliilIIi(var1, IiIlliIliiIl(in, var4, var3));
            }

            for (long var19 = var13 ^ (0L ^ var13) & -1L << 32; (int)(var19 >>> 32) <= 1; var19 += 4294967296L) {
               for (ililiIIlIiiliIIl var10 : var2.iIlIlllllill((int)(var19 >>> 32))) {
                  if (var10.lIiiIiIlilli() == IlIlIiilllIlIiil.lilIiillil && var10.IliIlllilIi(160)) {
                     IilliliilIIi(var1, IlIlllIlilIl(in, var4, IIIiIlilIIiIli.lillIlIIIl, var10, liiliiliiiliil.IlIillllillIilllli, null));
                  }
               }
            }

            if (var2.iliIiiliiiii() == illllIliIilllIli.lililIllIi && var2.IIillIiliIil() != null && var2.IIillIiliIil().IliIlllilIi(45)) {
               IilliliilIIi(var1, IlIlllIlilIl(in, var4, IIIiIlilIIiIli.iillIlIIIl, var2.IIillIiliIil(), liiliiliiiliil.IlIillllillIilllli, null));
            }

            var1.sort(Comparator.comparingInt(p -> p.iIlIlllllill().ordinal()));
            return var1;
         }
      } else {
         return var1;
      }
   }

   static boolean IiIiliIiiiIi(liiiiIiiiiiiIi centre, class_243 minedAir, class_243 eye, class_2338 v) {
      if (minedAir == null) {
         return false;
      } else {
         class_2338 var4 = IlIIlIIlllIIlIIl.IlIlllIlilIl(centre, minedAir, eye, v);
         return var4 != null && centre.IilliliilIIi(var4) >= 600.0F;
      }
   }

   static boolean Iilllilliill(
      illlllIiIillllIi in, Map<Long, Boolean> memo, class_2338 s, class_2338 mined, class_2338 entry, class_2338 followCell, class_2338 f, IIIiIlilIIiIli exit
   ) {
      liiiiIiiiiiiIi var8 = in.IliIlllilIi();
      if (!memo.computeIfAbsent(s.method_10063(), v -> var8.IIlllIlliIll(s))) {
         return false;
      } else {
         class_2338 var9 = s.method_10084();

         for (class_2338 var11 : in.liiiIIllIl().IiIlliIliiIl()) {
            if (var11.equals(s) || var11.equals(var9)) {
               return false;
            }
         }

         if (mined != null) {
            if (s.equals(mined) || var9.equals(mined)) {
               return false;
            }

            if (s.method_10074().equals(mined)) {
               return false;
            }

            if (s.method_10263() == mined.method_10263() && s.method_10260() == mined.method_10260() && mined.method_10264() < s.method_10264()) {
               return false;
            }
         }

         if (entry != null) {
            if (s.equals(entry) || var9.equals(entry)) {
               return false;
            }

            if (s.method_10263() == entry.method_10263() && s.method_10260() == entry.method_10260()) {
               return false;
            }
         }

         if (followCell == null || !s.equals(followCell) && !var9.equals(followCell)) {
            if (exit == IIIiIlilIIiIli.IlllIlIIIl && mined != null) {
               class_238 var12 = new class_238(
                  (double)mined.method_10263(),
                  (double)mined.method_10264(),
                  (double)mined.method_10260(),
                  (double)mined.method_10263() + 1.0,
                  (double)mined.method_10264() + 2.0,
                  (double)mined.method_10260() + 1.0
               );
               if (Iilililiiili(s).method_994(var12)) {
                  return false;
               }
            }

            return exit != IIIiIlilIIiIli.illlIlIIIl && exit != IIIiIlilIIiIli.IillIlIIIl
               || s.method_10263() != f.method_10263()
               || s.method_10260() != f.method_10260();
         } else {
            return false;
         }
      }
   }

   static class_243 IIIilIIiiIIi(class_2338 pos, class_2350 face, double u, double w) {
      double var6 = (double)pos.method_10263();
      double var8 = (double)pos.method_10264();
      double var10 = (double)pos.method_10260();
      double var12 = 0.02;

      return switch (face) {
         case field_11036 -> new class_243(var6 + u, var8 + 1.0 - var12, var10 + w);
         case field_11033 -> new class_243(var6 + u, var8 + var12, var10 + w);
         case field_11043 -> new class_243(var6 + u, var8 + w, var10 + var12);
         case field_11035 -> new class_243(var6 + u, var8 + w, var10 + 1.0 - var12);
         case field_11039 -> new class_243(var6 + var12, var8 + w, var10 + u);
         case field_11034 -> new class_243(var6 + 1.0 - var12, var8 + w, var10 + u);
         default -> throw new MatchException(null, null);
      };
   }

   public static double IIIllIIliIIl(double selfCost, int damage, double eta) {
      return selfCost / (double)Math.max(1, damage) - 0.25 * eta;
   }

   private static liIilllliiIillll IiIlliIliiIl(illlllIiIillllIi memo, Map<Long, Boolean> f, class_2338 in) {
      long var17 = -7596607936088303105L;
      long var19 = -4192813151638939760L;
      liiiiIiiiiiiIi var3 = memo.IliIlllilIi();
      class_2338 var4 = in.method_10086(2);
      class_2338 var5 = null;
      if (!IIlllIlliIll(var3, var4, null)) {
         if (!memo.IIIllIIliIIl()) {
            return null;
         }

         class_2350[] var6 = IlIIlIIlllIIlIIl.IliiilllIl;
         var17 ^= ((long)var6.length << 32 ^ var17) & -1L << 32;

         for (long var24 = var17 ^ (0L ^ var17) & -1L >>> 32; (int)var24 < (int)(var24 >>> 32); var24 ^= (var24 ^ var24 + (long)1) & -1L >>> 32) {
            class_2350 var9 = var6[(int)var24];
            class_2338 var10 = var4.method_10093(var9);
            if (var3.Illlllllilll(var10) && var3.IlIlllIlilIl(var10.method_10074())) {
               var5 = var10;
               break;
            }
         }

         if (var5 == null) {
            return null;
         }
      }

      List var21 = Illlllllilll(memo, f, IIIiIlilIIiIli.IillIlIIIl, null, liiliiliiiliil.liIilllliiiIilllli, var4, null, in);
      float var7 = memo.IiIlliIliiIl() == null
         ? lIiiIiIlilli(IIIiIlilIIiIli.IillIlIIIl)
         : memo.IiIlliIliiIl().IliIlllilIi(IIIiIlilIIiIli.IillIlIIIl, null, var4);
      liIilllliiIillll var8 = null;
      var19 ^= (0L ^ var19) & -1L << 32;

      for (IIliilIlii var11 : var21) {
         if (memo.IiIlliIliiIl() != null) {
            int var10000 = (int)(var19 >>> 32);
            var19 += 4294967296L;
            if (var10000 >= 3) {
               break;
            }
         }

         class_243 var12 = Illillliilli(var11.IliIlllilIi());
         if (var5 != null) {
            class_243 var13 = new class_243((double)var5.method_10263() + 0.5, (double)var5.method_10264() - 0.02, (double)var5.method_10260() + 0.5);
            if (var12.method_1022(var13) > 4.4 || !IlIIlIIlllIIlIIl.IiIlliIliiIl(var3, var12, var13, var5.method_10074(), null)) {
               continue;
            }
         }

         var19 ^= ((long)(var11.iIlIlllllill() + 3 + (var5 != null ? 1 : 0)) ^ var19) & -1L >>> 32;
         float var14 = memo.IiIlliIliiIl() == null ? 0.0F : memo.IiIlliIliiIl().liiiIIllIl(IIIiIlilIIiIli.IillIlIIIl, var11.IliIlllilIi(), null, var4);
         if (!(memo.IlIlllIlilIl() > 0.0F) || !(var14 >= memo.IlIlllIlilIl() - 1.0F)) {
            double var15 = IIIllIIliIIl((double)var7, (int)var19, (double)var14);
            if (var8 == null || var15 > var8.IIIilIIiiIIi()) {
               var8 = new liIilllliiIillll(
                  IIIiIlilIIiIli.IillIlIIIl,
                  null,
                  null,
                  class_243.method_24953(var4),
                  var11.IliIlllilIi(),
                  liiliiliiiliil.liIilllliiiIilllli,
                  var4,
                  var5,
                  -1,
                  0,
                  (int)var19,
                  (double)var7,
                  (double)var14,
                  var15
               );
            }
         }
      }

      return var8;
   }

   public static iiiIllilIIIlllil Ililllililil(liiiiIiiiiiiIi block, class_243 v, class_2338 eye, double reach) {
      long var19 = 6410184299947122311L;
      long var21 = 3744534528373007541L;
      iiiIllilIIIlllil var5 = null;
      double var6 = Double.MAX_VALUE;
      class_2350[] var8 = iiiIiIiilIIIliIiil;
      var19 ^= ((long)var8.length << 32 ^ var19) & -1L << 32;

      for (long var24 = var19 ^ (0L ^ var19) & -1L >>> 32; (int)var24 < (int)(var24 >>> 32); var24 ^= (var24 ^ var24 + (long)1) & -1L >>> 32) {
         class_2350 var11 = var8[(int)var24];
         if (Iiilliiliiil(v, eye, var11)) {
            double[][] var12 = IiiIiIiilliiIiIiil;
            var21 ^= ((long)var12.length << 32 ^ var21) & -1L << 32;

            for (var21 ^= (0L ^ var21) & -1L >>> 32; (int)var21 < (int)(var21 >>> 32); var21 ^= (var21 ^ var21 + (long)1) & -1L >>> 32) {
               double[] var15 = var12[(int)var21];
               class_243 var16 = IIIilIIiiIIi(eye, var11, var15[0], var15[1]);
               double var17 = v.method_1022(var16);
               if (!(var17 > reach) && IlIIlIIlllIIlIIl.IiIlliIliiIl(block, v, var16, eye, null)) {
                  if (var17 < var6) {
                     var6 = var17;
                     var5 = new iiiIllilIIIlllil(var11, var16);
                  }
                  break;
               }
            }
         }
      }

      return var5;
   }

   private static liIilllliiIillll IlIlllIlilIl(
      illlllIiIillllIi memo, Map<Long, Boolean> followCell, IIIiIlilIIiIli entry, ililiIIlIiiliIIl follow, liiliiliiiliil in, class_2338 w
   ) {
      long var24 = 1702110040287489010L;
      long var26 = -7162178726934326633L;
      long var28 = 2913557867273310858L;
      liiiiIiiiiiiIi var6 = memo.IliIlllilIi();
      class_2338 var7 = follow.liiiIIllIl();
      class_2338 var8 = memo.liiiIIllIl().IIIllIIliIIl();
      class_2338 var9 = null;
      if (follow.IilliliilIIi() != null && follow.iIlIlllllill() <= 1) {
         var9 = var7.method_10093(follow.IilliliilIIi());
      }

      List var10 = Illlllllilll(memo, followCell, entry, var7, in, w, var9, var8);
      if (var10.isEmpty()) {
         return null;
      } else {
         var24 ^= ((long)(follow.iliIiiliiiii() != Integer.MAX_VALUE && follow.iliIiiliiiii() <= follow.IIIllIIliIIl() ? 1 : 0) << 32 ^ var24) & -1L << 32;
         var24 ^= ((long)((int)(var24 >>> 32) == 0 && follow.IlIlllIlilIl() >= 0 ? 2 : 0) ^ var24) & -1L >>> 32;
         var26 ^= ((long)((int)(var24 >>> 32) != 0 ? follow.iliIiiliiiii() : follow.IIIllIIliIIl()) << 32 ^ var26) & -1L << 32;
         var26 ^= ((long)follow.IlIlllIlilIl() ^ var26) & -1L >>> 32;
         if ((int)(var24 >>> 32) != 0 && memo.iIlIlllllill() != null) {
            IlIllillIlli var15 = memo.iIlIlllllill().IiIlliIliiIl(var6, var7, true, true);
            var26 ^= ((long)var15.iIlIlllllill() ^ var26) & -1L >>> 32;
         }

         float var30 = memo.IiIlliIliiIl() == null ? lIiiIiIlilli(entry) : memo.IiIlliIliiIl().IliIlllilIi(entry, var7, w);
         liIilllliiIillll var16 = null;
         var28 ^= (0L ^ var28) & -1L << 32;

         for (IIliilIlii var19 : var10) {
            if (memo.IiIlliIliiIl() != null && in != liiliiliiiliil.IlIillllillIilllli) {
               int var10000 = (int)(var28 >>> 32);
               var28 += 4294967296L;
               if (var10000 >= 3) {
                  break;
               }
            }

            var28 ^= (
                  (long)IIiiililIiiili.IiIlliIliiIl(IIiiililIiiili.IiIlliIliiIl(var19.iIlIlllllill(), (int)var24 + iliIiiliiiii(in)), (int)(var26 >>> 32))
                     ^ var28
               )
               & -1L >>> 32;
            if ((int)var28 != Integer.MAX_VALUE) {
               float var21 = memo.IiIlliIliiIl() != null && in != liiliiliiiliil.IlIillllillIilllli
                  ? memo.IiIlliIliiIl().liiiIIllIl(entry, var19.IliIlllilIi(), var7, w)
                  : 0.0F;
               if (in == liiliiliiiliil.IlIillllillIilllli || !(memo.IlIlllIlilIl() > 0.0F) || !(var21 >= memo.IlIlllIlilIl() - 1.0F)) {
                  double var22 = IIIllIIliIIl((double)var30, (int)var28, (double)var21) + (var19.IilliliilIIi() ? 1.0E-6 : 0.0);
                  if (var16 == null || var22 > var16.IIIilIIiiIIi()) {
                     var16 = new liIilllliiIillll(
                        entry,
                        var7,
                        var19.liiiIIllIl().IliIlllilIi(),
                        var19.liiiIIllIl().liiiIIllIl(),
                        var19.IliIlllilIi(),
                        in,
                        w,
                        null,
                        (int)var26,
                        (int)(var26 >>> 32),
                        (int)var28,
                        (double)var30,
                        (double)var21,
                        var22
                     );
                  }
               }
            }
         }

         return var16;
      }
   }

   public static class_243 Illillliilli(class_2338 feet) {
      return new class_243((double)feet.method_10263() + 0.5, (double)feet.method_10264() + 1.62, (double)feet.method_10260() + 0.5);
   }

   static List<IIliilIlii> Illlllllilll(
      illlllIiIillllIi f,
      Map<Long, Boolean> memo,
      IIIiIlilIIiIli follow,
      class_2338 exit,
      liiliiliiiliil entry,
      class_2338 in,
      class_2338 followCell,
      class_2338 mined
   ) {
      long var22 = 2506013261176057589L;
      long var24 = 780949594667869166L;
      long var26 = 4254255971079392422L;
      liiiiIiiiiiiIi var8 = f.IliIlllilIi();
      class_2338 var9 = exit != null ? exit : in;
      ArrayList var10 = new ArrayList();
      var22 ^= (-17179869184L ^ var22) & -1L << 32;

      while ((int)(var22 >>> 32) <= 4) {
         for (var22 ^= (-4L ^ var22) & -1L >>> 32; (int)var22 <= 4; var22 ^= (var22 ^ var22 + (long)1) & -1L >>> 32) {
            for (var24 ^= (-17179869184L ^ var24) & -1L << 32; (int)(var24 >>> 32) <= 2; var24 += 4294967296L) {
               class_2338 var14 = var9.method_10069((int)(var22 >>> 32), (int)(var24 >>> 32), (int)var22);
               class_243 var15 = Illillliilli(var14);
               if (!(var15.method_1025(class_243.method_24953(var9)) > 28.090000000000007) && Iilllilliill(f, memo, var14, exit, in, followCell, mined, follow)
                  )
                {
                  var10.add(var14);
               }
            }
         }

         var22 += 4294967296L;
      }

      class_243 var11 = f.IilliliilIIi();
      var10.sort(
         Comparator.comparingDouble(
            self -> var11 == null ? 0.0 : var11.method_1028((double)self.method_10263() + 0.5, (double)self.method_10264(), (double)self.method_10260() + 0.5)
         )
      );
      ArrayList var12 = new ArrayList();
      var24 ^= (0L ^ var24) & -1L << 32;

      for (class_2338 var29 : var10) {
         int var10000 = (int)(var24 >>> 32);
         var24 += 4294967296L;
         if (var10000 >= 40) {
            break;
         }

         class_243 var16 = Illillliilli(var29);
         iiiIllilIIIlllil var17 = null;
         if (exit != null) {
            var17 = Ililllililil(var8, var16, exit, 4.4);
            if (var17 == null) {
               continue;
            }
         }

         if (IIillIiliIil(var8, var16, entry, in, exit)) {
            var24 ^= ((long)IIlilIliiIli(f, var29) ^ var24) & -1L >>> 32;
            if ((int)var24 >= 0) {
               var26 ^= ((long)(entry != liiliiliiiliil.IlIillllillIilllli && IiIiliIiiiIi(var8, IlIillIiilIi(entry, in), var16, exit) ? 1 : 0) << 32 ^ var26)
                  & -1L << 32;
               double var20 = -0.05 * (double)((int)var24) + ((int)(var26 >>> 32) != 0 ? 2.0 : 0.0);
               var12.add(
                  new IIliilIlii(
                     var29.method_10062(),
                     var17 == null ? new iiiIllilIIIlllil(null, in == null ? null : class_243.method_24953(in)) : var17,
                     (int)var24,
                     (boolean)((int)(var26 >>> 32)),
                     var20
                  )
               );
            }
         }
      }

      var12.sort(Comparator.comparingDouble(IIliilIlii::lIiiIiIlilli).reversed());
      return (List<IIliilIlii>)(var12.size() > 6 ? var12.subList(0, 6) : var12);
   }

   public static double Iliilliiilii(class_243 p, class_238 b) {
      double var2 = Math.max(0.0, Math.max(b.field_1323 - p.field_1352, p.field_1352 - b.field_1320));
      double var4 = Math.max(0.0, Math.max(b.field_1322 - p.field_1351, p.field_1351 - b.field_1325));
      double var6 = Math.max(0.0, Math.max(b.field_1321 - p.field_1350, p.field_1350 - b.field_1324));
      return Math.sqrt(var2 * var2 + var4 * var4 + var6 * var6);
   }

   static int iliIiiliiiii(liiliiliiiliil f) {
      return switch (f) {
         case ilIilllliIiIilllli -> 0;
         case IlIillllillIilllli -> 2;
         case liIilllliiiIilllli -> 3;
      };
   }

   static class_243 IlIillIiilIi(liiliiliiiliil cell, class_2338 follow) {
      if (follow == null) {
         return null;
      } else {
         return cell == liiliiliiiliil.ilIilllliIiIilllli
            ? new class_243((double)follow.method_10263() + 0.5, (double)follow.method_10264() + 1.0, (double)follow.method_10260() + 0.5)
            : class_243.method_24953(follow);
      }
   }

   static class_238 Iilililiiili(class_2338 feet) {
      return new class_238(
         (double)feet.method_10263() + 0.2,
         (double)feet.method_10264(),
         (double)feet.method_10260() + 0.2,
         (double)feet.method_10263() + 0.8,
         (double)feet.method_10264() + 1.8,
         (double)feet.method_10260() + 0.8
      );
   }

   public static liIilllliiIillll IliIlllilIi(illlllIiIillllIi in) {
      return liiiIIllIl(in, null);
   }

   static boolean Iiilliiliiil(class_243 face, class_2338 pos, class_2350 eye) {
      return switch (eye) {
         case field_11036 -> face.field_1351 > (double)pos.method_10264() + 1.0;
         case field_11033 -> face.field_1351 < (double)pos.method_10264();
         case field_11043 -> face.field_1350 < (double)pos.method_10260();
         case field_11035 -> face.field_1350 > (double)pos.method_10260() + 1.0;
         case field_11039 -> face.field_1352 < (double)pos.method_10263();
         case field_11034 -> face.field_1352 > (double)pos.method_10263() + 1.0;
         default -> throw new MatchException(null, null);
      };
   }
}
