package gg.corz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import net.minecraft.class_1309;
import net.minecraft.class_1511;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_3965;
import net.minecraft.class_746;
import net.minecraft.class_8111;

public final class Ililiiillliliiil {
   public static final double lIIlilIiil = 90.0;
   private static final int IiIlilIiil = 0;
   private static final double ilIlilIiil = 0.001;
   private static final int liIlilIiil = 8;
   private static final int iiIlilIiil = 1;
   private static final class_310 IIllilIiil = class_310.method_1551();
   private static final float llIlilIiil = 6.0F;
   public static final int IIIlilIiil = 4;
   public static final int iIIlilIiil = 12;
   private static final double IlIlilIiil = 5.0;

   private static iIlIIlilIllIIlil Iilllilliill(String why) {
      return new iIlIIlilIllIIlil(false, why, 0.0F, 0.0F, 0.0F, Double.NEGATIVE_INFINITY);
   }

   public static iiIllIIlIIlllIIl IliIlllilIi(IillIiillillIiil r) {
      return r.IiIiliIiiiIi() != null && r.IiIiliIiiiIi().IIiilIiiiIii() ? Iiilliiliiil(r) : Iiiiliiiiiii(r);
   }

   private static void IiIiliIiiiIi(IiiiliIiliiiliIi c, Set<Long> y, List<lilillIliilillIl> obsidianAllowed, boolean x, int z, int out, int seen) {
      long var17 = -1564395538024684441L;
      long var7 = class_2338.method_10064(z, out, seen);
      if (y.add(var7)) {
         IillIiillillIiil var9 = c.lIIiIiiIIi;
         class_2338 var10 = new class_2338(z, out, seen);
         if (!(lllIliIlillIliIl.IIlilIliiIli(c.IlIiIiiIIi, lllIliIlillIliIl.IilliliilIIi(var10)) >= 3.0)) {
            class_243 var11 = lllIliIlillIliIl.liiiIIllIl(var10);
            if (lllIliIlillIliIl.Illillliilli(c.IlIiIiiIIi, var11, var9.IlIillIiilIi(), c.ilIiIiiIIi.IIillIiliIil())) {
               var17 ^= ((long)lllIliIlillIliIl.IliIlllilIi(var10) << 32 ^ var17) & -1L << 32;
               lIIiIiiIIiIi var13 = var9.Illlllllilll();
               if ((int)(var17 >>> 32) != 0) {
                  if (var13 != null && (var13.IiIlliIliiIl(var7, var9.Iilllilliill()) || !var13.Iiiiliiiiiii(var7, var9.IIillIiliIil(), 1))) {
                     return;
                  }

                  if (!lllIliIlillIliIl.IIIllIIliIIl(var10) || !lllIliIlillIliIl.IiIlliIliiIl(var10)) {
                     return;
                  }
               } else if (!x
                  || var13 != null && var13.iIIIlIlIIl(var7, var9.Iilllilliill())
                  || !lllIliIlillIliIl.Ililllililil(var10)
                  || !lllIliIlillIliIl.IlIillIiilIi(var10)) {
                  return;
               }

               class_238 var14 = lllIliIlillIliIl.iIlIlllllill(var10);
               class_238 var15 = (int)(var17 >>> 32) != 0 ? null : lllIliIlillIliIl.lIiiIiIlilli(var10);
               if (!IIiilIiiiIii(c.iIliIiiIIi, var14, var15)) {
                  if (c.llliIiiIIi == null || !IIiilIiiiIii(c.llliIiiIIi, var14, var15) && !IIiilIiiiIii(c.illiIiiIIi, var14, var15)) {
                     if (!IIiilIiiiIii(c.IlliIiiIIi, var14, var15)) {
                        if (c.IlIlllIlilIl(var11)) {
                           c.iIiiIiiIIi = true;
                        } else {
                           float var16 = IIlilIliiIli(c, var11);
                           if (var16 < c.ilIiIiiIIi.Iiiiliiiiiii() && var16 < c.liIiIiiIIi) {
                              c.iiliIiiIIi = true;
                           } else if (c.ilIiIiiIIi.lliIliliIl() && !c.IiIiIiiIIi.iiIIlIIlIl() && !Illillliilli(c, var11) && !(var16 >= c.liIiIiiIIi)) {
                              c.IliiIiiIIi = true;
                           } else {
                              obsidianAllowed.add(new lilillIliilillIl(var10, var16, (boolean)((int)(var17 >>> 32))));
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   static ilIIiiiIiIIiii IIillIiliIil(ilIIiiiIiIIiii cell, class_2338 given) {
      return cell != null && cell.IliIlllilIi() != null && cell.liiiIIllIl() != null && cell.IliIlllilIi().method_10093(cell.liiiIIllIl()).equals(given)
         ? cell
         : new ilIIiiiIiIIiii(given.method_10074(), class_2350.field_11036);
   }

   private static iIlIIlilIllIIlil Illlllllilll(IiiiliIiliiiliIi crystalCell, class_2338 c, class_2338 cell) {
      IillIiillillIiil var3 = crystalCell.lIIiIiiIIi;
      if (c == null) {
         return Iilllilliill(IiIIlliIIl<"IiIIlliIIl","Yi5Q70F7px33mEtXPycibs8z2GXh9obFH0U0C+SVtDc=">());
      } else {
         ilIIiiiIiIIiii var4 = IIillIiliIil(var3.llIIlilIIl(), c);
         if (var3.IiIlliIliiIl()
            && var3.IIlllIlliIll()
            && lllIliIlillIliIl.IlIlllIlilIl()
            && (var3.Illlllllilll() == null || !var3.Illlllllilll().iIIIlIlIIl(c.method_10063(), var3.Iilllilliill()))
            && lllIliIlillIliIl.IIillIiliIil(var4.IliIlllilIi(), var4.liiiIIllIl())
            && lllIliIlillIliIl.IlIillIiilIi(c)) {
            class_238 var5 = lllIliIlillIliIl.lIiiIiIlilli(c);
            if (!crystalCell.iIliIiiIIi.liiiIIllIl().method_994(var5)
               && !crystalCell.iIIiIiiIIi.method_5829().method_994(var5)
               && !crystalCell.IlliIiiIIi.liiiIIllIl().method_994(var5)) {
               class_3965 var6 = lllIliIlillIliIl.Iliilliiilii(
                  var4.IliIlllilIi(),
                  new class_2350[]{var4.liiiIIllIl()},
                  var4.liiiIIllIl(),
                  crystalCell.IlIiIiiIIi,
                  var3.Iiilliiliiil(),
                  var3.IIIilIIiiIIi(),
                  4.4 - crystalCell.ilIiIiiIIi.IIiIllIiIl()
               );
               if (var6 == null) {
                  return Iilllilliill(IiIIlliIIl<"IiIIlliIIl","f+30+DbJFXOkEDSPyKIertdkHvL12aFe0U1zIbj72w==">());
               } else {
                  class_243 var7 = lllIliIlillIliIl.liiiIIllIl(cell);
                  if (crystalCell.IlIlllIlilIl(var7)) {
                     return Iilllilliill(IiIIlliIIl<"IiIIlliIIl","pcjUDpBDe9Hky1tst7aQuyBjCXMR3ObN4CU/RtnEBGw=">());
                  } else {
                     ililIiilIiilIiil var8 = crystalCell.Iilllilliill(var7, cell, true, crystalCell.liliIiiIIi, false);
                     double var9 = iiIiiliIIliili.Illlllllilll(
                           var8.IliIlllilIi(),
                           var8.IilliliilIIi(),
                           var8.lIiiIiIlilli(),
                           var8.iIlIlllllill(),
                           crystalCell.IiIlliIliiIl(var6.method_17784()),
                           true,
                           crystalCell.ilIiIiiIIi
                        )
                        + (double)crystalCell.IiIiIiiIIi.Illillliilli(var8.iliIiiliiiii());
                     return !crystalCell.iIlIlllllill(
                           var8.liiiIIllIl(), var8.iIlIlllllill(), var8.IliIlllilIi(), var8.iliIiiliiiii(), var8.IilliliilIIi(), var8.lIiiIiIlilli()
                        )
                        ? new iIlIIlilIllIIlil(
                           false,
                           IiIIlliIIl<"IiIIlliIIl","MS4yoRPrVO6A3q+5vZ7mdOcd2eBn2ER66sl7BwtXqv687g==">(),
                           var8.IliIlllilIi(),
                           var8.liiiIIllIl(),
                           var8.iIlIlllllill(),
                           var9
                        )
                        : new iIlIIlilIllIIlil(
                           true,
                           IiIIlliIIl<"IiIIlliIIl","yWvXxkqbkRLZ8jRduCXJ2PhvpRo4fmaFLiBApEUY">(),
                           var8.IliIlllilIi(),
                           var8.liiiIIllIl(),
                           var8.iIlIlllllill(),
                           var9
                        );
                  }
               }
            } else {
               return Iilllilliill(IiIIlliIIl<"IiIIlliIIl","GNyLPSTlZev7lRDjC18xyiKQAr/XLhhcYX8SiyyZP3aHNXc=">());
            }
         } else {
            return Iilllilliill(IiIIlliIIl<"IiIIlliIIl","cUKPNSFZQTa21GHBquoQd89l2nveqEAk4hAY2/kN7dH9VxiU1GSc">());
         }
      }
   }

   private static float IIlilIliiIli(IiiiliIiliiiliIi c, class_243 centre) {
      return iiIiiliIIliili.lIiiIiIlilli(lllIliIlillIliIl.ilIllIiIll(c.llIiIiiIIi, c.iIliIiiIIi.IliIlllilIi().method_1022(centre), 6.0F), c.IIliIiiIIi);
   }

   private static boolean Illillliilli(IiiiliIiliiiliIi c, class_243 centre) {
      class_243 var2 = c.iIliIiiIIi.IliIlllilIi();
      double var3 = centre.field_1351 - var2.field_1351;
      double var5 = Math.hypot(centre.field_1352 - var2.field_1352, centre.field_1350 - var2.field_1350);
      return iiIiiliIIliili.IlIillIiilIi(var3, var5, c.ilIiIiiIIi);
   }

   private static iIlIIlilIllIIlil IiIlliIliiIl(IiiiliIiliiiliIi c, class_1511 crystal) {
      IillIiillillIiil var2 = c.lIIiIiiIIi;
      if (crystal != null && crystal.method_5805() && !crystal.method_31481()) {
         if (var2.Illlllllilll() != null && var2.Illlllllilll().IIlilIliiIli(crystal.method_5628(), var2.Iilllilliill())) {
            return Iilllilliill(IiIIlliIIl<"IiIIlliIIl","K6ZkECVN3mjZlHbp/rT4aQ2UJl1CZrsF5UlSRhyEUs3McQI=">());
         } else if (lllIliIlillIliIl.IIlilIliiIli(c.IlIiIiiIIi, crystal.method_5829()) >= 3.0) {
            return Iilllilliill(IiIIlliIIl<"IiIIlliIIl","f+30+DbJFXOkEDSPyKIertdkHvL12aFe0U1zIbj72w==">());
         } else if (c.IlIlllIlilIl(crystal.method_73189())) {
            return Iilllilliill(IiIIlliIIl<"IiIIlliIIl","pcjUDpBDe9Hky1tst7aQuyBjCXMR3ObN4CU/RtnEBGw=">());
         } else {
            IiIilIllliIilIll var3 = c.Ililllililil(crystal);
            return !var3.IIIllIIliIIl()
               ? new iIlIIlilIllIIlil(
                  false,
                  IiIIlliIIl<"IiIIlliIIl","MS4yoRPrVO6A3q+5vZ7mdOcd2eBn2ER66sl7BwtXqv687g==">(),
                  var3.IliIlllilIi(),
                  var3.liiiIIllIl(),
                  var3.iIlIlllllill(),
                  var3.IlIlllIlilIl()
               )
               : new iIlIIlilIllIIlil(
                  true,
                  IiIIlliIIl<"IiIIlliIIl","yWvXxkqbkRLZ8jRduCXJ2PhvpRo4fmaFLiBApEUY">(),
                  var3.IliIlllilIi(),
                  var3.liiiIIllIl(),
                  var3.iIlIlllllill(),
                  var3.IlIlllIlilIl()
               );
         }
      } else {
         return Iilllilliill(IiIIlliIIl<"IiIIlliIIl","oguYjkpZoKSVMIpJRjKPb6WvrnsUppYPsoNgNTCb0GE=">());
      }
   }

   private static iiIllIIlIIlllIIl Iiiiliiiiiii(IillIiillillIiil r) {
      long var32 = -5850903142790335672L;
      long var34 = -1815489478728902011L;
      long var36 = -7697920300059971612L;
      long var38 = 1222609628275972606L;
      long var40 = -717015685719716852L;
      long var28 = -1942895582714660368L;
      long var30 = -6971544471302280202L;
      class_746 var1 = IIllilIiil.field_1724;
      class_243 var2 = var1.method_33571();
      var28 ^= ((long)r.IilliliilIIi().method_5628() << 32 ^ var28) & -1L << 32;
      var28 ^= (0L ^ var28) & -1L >>> 32;
      var30 ^= (0L ^ var30) & -1L << 32;
      var30 ^= (0L ^ var30) & -1L >>> 32;
      class_1511 var7 = null;
      double var8 = -1.0;
      class_238 var10 = var1.method_5829().method_1014(5.0);

      for (class_1511 var12 : IIllilIiil.field_1687.method_8390(class_1511.class, var10, e -> e.method_5805() && !e.method_31481())) {
         if (!r.Illlllllilll().IIlilIliiIli(var12.method_5628(), r.Iilllilliill())
            && !r.Illlllllilll().IiIiliIiiiIi(var12.method_5628(), r.IIillIiliIil(), r.Ililllililil())) {
            class_238 var13 = var12.method_5829();
            if (!(lllIliIlillIliIl.IIlilIliiIli(var2, var13) >= 3.0) && lllIliIlillIliIl.Illillliilli(var2, var13.method_1005(), r.IlIillIiilIi(), 90.0)) {
               if (lllIliIlillIliIl.Iiiiliiiiiii(var13, var12, var2, r.Iiilliiliiil(), r.IIIilIIiiIIi(), 3.0) == null) {
                  var30 ^= (1L ^ var30) & -1L >>> 32;
               } else {
                  class_243 var14 = var12.method_73189();
                  if (!lllIliIlillIliIl.lilIliilIl(var14, null, r.IIIllIIliIIl(), r.IlIlllIlilIl())) {
                     var30 ^= (4294967296L ^ var30) & -1L << 32;
                  } else {
                     double var15 = lllIliIlillIliIl.lIliliIlil(r.lIiiIiIlilli(), r.IilliliilIIi(), var14, null);
                     if (var15 > var8) {
                        var8 = var15;
                        var7 = var12;
                     }
                  }
               }
            }
         }
      }

      if (var7 != null) {
         return new iiIllIIlIIlllIIl(IIiiilIilIiiilIi.liiiIIllIl(var7, var8, r.IIillIiliIil(), (int)(var28 >>> 32)), null);
      } else {
         var32 ^= ((long)class_3532.method_15357(var1.method_23317()) << 32 ^ var32) & -1L << 32;
         var32 ^= ((long)class_3532.method_15357(var1.method_23318()) ^ var32) & -1L >>> 32;
         var34 ^= ((long)class_3532.method_15357(var1.method_23321()) << 32 ^ var34) & -1L << 32;
         var34 ^= ((long)(r.IiIlliIliiIl() && r.IIlllIlliIll() && lllIliIlillIliIl.IlIlllIlilIl() ? 1 : 0) ^ var34) & -1L >>> 32;
         ArrayList var42 = new ArrayList();
         ArrayList var16 = new ArrayList();
         var36 ^= (-4294967296L ^ var36) & -1L << 32;

         while ((int)(var36 >>> 32) <= 1) {
            for (var36 ^= (-4L ^ var36) & -1L >>> 32; (int)var36 <= 4; var36 ^= (var36 ^ var36 + (long)1) & -1L >>> 32) {
               for (var38 ^= (-17179869184L ^ var38) & -1L << 32; (int)(var38 >>> 32) <= 4; var38 += 4294967296L) {
                  class_2338 var20 = new class_2338(
                     (int)(var32 >>> 32) + (int)var36, (int)var32 + (int)(var36 >>> 32), (int)(var34 >>> 32) + (int)(var38 >>> 32)
                  );
                  if (!(lllIliIlillIliIl.IIlilIliiIli(var2, lllIliIlillIliIl.IilliliilIIi(var20)) >= 3.0)) {
                     class_243 var21 = lllIliIlillIliIl.liiiIIllIl(var20);
                     if (lllIliIlillIliIl.Illillliilli(var2, var21, r.IlIillIiilIi(), 90.0)) {
                        var38 ^= ((long)lllIliIlillIliIl.IliIlllilIi(var20) ^ var38) & -1L >>> 32;
                        long var23 = var20.method_10063();
                        if ((int)var38 != 0
                           ? !r.Illlllllilll().IiIlliIliiIl(var23, r.Iilllilliill())
                              && r.Illlllllilll().Iiiiliiiiiii(var23, r.IIillIiliIil(), r.Ililllililil())
                              && lllIliIlillIliIl.IIIllIIliIIl(var20)
                              && lllIliIlillIliIl.IiIlliIliiIl(var20)
                           : (int)var34 != 0
                              && !r.Illlllllilll().iIIIlIlIIl(var23, r.Iilllilliill())
                              && lllIliIlillIliIl.Illlllllilll(var20.method_10074())
                              && lllIliIlillIliIl.IlIillIiilIi(var20)) {
                           class_238 var25 = r.lIiiIiIlilli().liiiIIllIl();
                           if (!var25.method_994(lllIliIlillIliIl.iIlIlllllill(var20))
                              && ((int)var38 != 0 || !var25.method_994(lllIliIlillIliIl.lIiiIiIlilli(var20)))) {
                              double var26 = liiIIliliiiIIlil.IilliliilIIi(r.lIiiIiIlilli().IliIlllilIi().method_1022(var21));
                              if (var26 < r.iliIiiliiiii()) {
                                 var28 ^= (1L ^ var28) & -1L >>> 32;
                              } else {
                                 ((int)var38 != 0 ? var42 : var16).add(new liliiiliiliiil(var20, var26));
                              }
                           }
                        }
                     }
                  }
               }
            }

            var36 += 4294967296L;
         }

         var42.sort(Comparator.comparingDouble(liliiiliiliiil::liiiIIllIl).reversed());
         IIiiilIilIiiilIi var17 = null;
         double var18 = -1.0;
         var40 ^= (0L ^ var40) & -1L << 32;

         for (liliiiliiliiil var22 : var42) {
            if (var22.liiiIIllIl() <= var18) {
               break;
            }

            int var10000 = (int)(var40 >>> 32);
            var40 += 4294967296L;
            if (var10000 >= 12) {
               break;
            }

            class_243 var47 = lllIliIlillIliIl.liiiIIllIl(var22.IliIlllilIi());
            double var24 = lllIliIlillIliIl.lIliliIlil(r.lIiiIiIlilli(), r.IilliliilIIi(), var47, null);
            if (var24 < r.iliIiiliiiii()) {
               var28 ^= (1L ^ var28) & -1L >>> 32;
            } else if (!(var24 <= var18)) {
               if (!lllIliIlillIliIl.lilIliilIl(var47, null, r.IIIllIIliIIl(), r.IlIlllIlilIl())) {
                  var30 ^= (4294967296L ^ var30) & -1L << 32;
               } else if (lllIliIlillIliIl.Iliilliiilii(var22.IliIlllilIi(), lllIliIlillIliIl.IiliiliIll, null, var2, r.Iiilliiliiil(), r.IIIilIIiiIIi(), 4.4)
                  == null) {
                  var30 ^= (1L ^ var30) & -1L >>> 32;
               } else {
                  var17 = IIiiilIilIiiilIi.IliIlllilIi(var22.IliIlllilIi(), var24, r.IIillIiliIil(), (int)(var28 >>> 32));
                  var18 = var24;
               }
            }
         }

         if (var17 != null) {
            return new iiIllIIlIIlllIIl(var17, null);
         } else {
            var16.sort(Comparator.comparingDouble(liliiiliiliiil::liiiIIllIl).reversed());
            var40 ^= (0L ^ var40) & -1L << 32;

            for (liliiiliiliiil var46 : var16) {
               if (var46.liiiIIllIl() <= var18) {
                  break;
               }

               int var62 = (int)(var40 >>> 32);
               var40 += 4294967296L;
               if (var62 >= 12) {
                  break;
               }

               class_243 var48 = lllIliIlillIliIl.liiiIIllIl(var46.IliIlllilIi());
               double var49 = lllIliIlillIliIl.lIliliIlil(r.lIiiIiIlilli(), r.IilliliilIIi(), var48, var46.IliIlllilIi());
               if (var49 < r.iliIiiliiiii()) {
                  var28 ^= (1L ^ var28) & -1L >>> 32;
               } else if (!(var49 <= var18)) {
                  if (!lllIliIlillIliIl.lilIliilIl(var48, var46.IliIlllilIi(), r.IIIllIIliIIl(), r.IlIlllIlilIl())) {
                     var30 ^= (4294967296L ^ var30) & -1L << 32;
                  } else if (lllIliIlillIliIl.Iliilliiilii(
                           var46.IliIlllilIi().method_10074(),
                           lllIliIlillIliIl.liliiliIll,
                           class_2350.field_11036,
                           var2,
                           r.Iiilliiliiil(),
                           r.IIIilIIiiIIi(),
                           4.4
                        )
                        != null
                     && lllIliIlillIliIl.iiIIlIIlIl(var46.IliIlllilIi(), var2, 4.4)) {
                     var17 = IIiiilIilIiiilIi.iIlIlllllill(var46.IliIlllilIi(), var49, r.IIillIiliIil(), (int)(var28 >>> 32));
                     var18 = var49;
                  } else {
                     var30 ^= (1L ^ var30) & -1L >>> 32;
                  }
               }
            }

            if (var17 != null) {
               return new iiIllIIlIIlllIIl(var17, null);
            } else {
               String var45;
               if ((int)var28 != 0) {
                  var45 = IiIIlliIIl<"IiIIlliIIl","gXK1I+fenpZE0j41TJic3O65SPY4aGTuv/fVIzV+qkiTf4nR">();
               } else if ((int)(var30 >>> 32) != 0) {
                  var45 = IiIIlliIIl<"IiIIlliIIl","MS4yoRPrVO6A3q+5vZ7mdOcd2eBn2ER66sl7BwtXqv687g==">();
               } else if ((int)var30 != 0) {
                  var45 = IiIIlliIIl<"IiIIlliIIl","06m/sblAJHO7+Q9Al+hokq6TYtMDHUddUIIp8F+fbsdRDHI+kGbNlQ==">();
               } else if (r.IiIlliIliiIl() && !r.IIlllIlliIll()) {
                  var45 = IiIIlliIIl<"IiIIlliIIl","vOUw/8wPcAfssK0d1SRsl9/vdHXvfIxXr1jr99zm+INc5kjcp3wP">();
               } else if (!lllIliIlillIliIl.IlIlllIlilIl()) {
                  var45 = IiIIlliIIl<"IiIIlliIIl","cUKPNSFZQTa21GHBquoQd89l2nveqEAk4hAY2/kN7dH9VxiU1GSc">();
               } else {
                  var45 = IiIIlliIIl<"IiIIlliIIl","T0gbjSGQR0UFipgN11wW1Xr9nFRPFwiray8TJIQBd9Q2Ykw=">();
               }

               return new iiIllIIlIIlllIIl(null, var45);
            }
         }
      }
   }

   private Ililiiillliliiil() {
   }

   private static iIlIIlilIllIIlil IIlllIlliIll(IiiiliIiliiiliIi c, class_2338 cell, class_2350[] faces) {
      long var12 = -4813182313996276221L;
      IillIiillillIiil var3 = c.lIIiIiiIIi;
      if (cell == null) {
         return Iilllilliill(IiIIlliIIl<"IiIIlliIIl","Yi5Q70F7px33mEtXPycibs8z2GXh9obFH0U0C+SVtDc=">());
      } else if (!lllIliIlillIliIl.IliIlllilIi(cell)) {
         return Iilllilliill(IiIIlliIIl<"IiIIlliIIl","hgVGqQnfGIhYWOY9YJG9Xgdtdw5eaZ76SYSZVixMPmTeoj4=">());
      } else {
         var12 ^= ((long)(var3.Illlllllilll() != null && var3.Illlllllilll().IiIlliIliiIl(cell.method_10063(), var3.Iilllilliill()) ? 1 : 0) << 32 ^ var12)
            & -1L << 32;
         class_3965 var5 = null;
         if ((int)(var12 >>> 32) == 0) {
            if (!lllIliIlillIliIl.IIIllIIliIIl(cell)) {
               return Iilllilliill(IiIIlliIIl<"IiIIlliIIl","GNyLPSTlZev7lRDjC18xyiKQAr/XLhhcYX8SiyyZP3aHNXc=">());
            }

            if (!lllIliIlillIliIl.IiIlliIliiIl(cell)) {
               return Iilllilliill(IiIIlliIIl<"IiIIlliIIl","cUKPNSFZQTa21GHBquoQd89l2nveqEAk4hAY2/kN7dH9VxiU1GSc">());
            }

            class_238 var6 = lllIliIlillIliIl.iIlIlllllill(cell);
            if (c.iIliIiiIIi.liiiIIllIl().method_994(var6) || c.iIIiIiiIIi.method_5829().method_994(var6) || c.IlliIiiIIi.liiiIIllIl().method_994(var6)) {
               return Iilllilliill(IiIIlliIIl<"IiIIlliIIl","GNyLPSTlZev7lRDjC18xyiKQAr/XLhhcYX8SiyyZP3aHNXc=">());
            }
         }

         class_243 var14 = lllIliIlillIliIl.liiiIIllIl(cell);
         if (c.IlIlllIlilIl(var14)) {
            return Iilllilliill(IiIIlliIIl<"IiIIlliIIl","pcjUDpBDe9Hky1tst7aQuyBjCXMR3ObN4CU/RtnEBGw=">());
         } else {
            if ((int)(var12 >>> 32) == 0) {
               var5 = lllIliIlillIliIl.Iliilliiilii(cell, faces, null, c.IlIiIiiIIi, var3.Iiilliiliiil(), var3.IIIilIIiiIIi(), 4.4 - c.ilIiIiiIIi.IIiIllIiIl());
               if (var5 == null && !lllIliIlillIliIl.iiIIlIIlIl(cell, c.IlIiIiiIIi, 4.4)) {
                  return Iilllilliill(IiIIlliIIl<"IiIIlliIIl","f+30+DbJFXOkEDSPyKIertdkHvL12aFe0U1zIbj72w==">());
               }
            }

            ililIiilIiilIiil var7 = c.Iilllilliill(var14, null, true, c.IiliIiiIIi, false);
            double var8 = c.IiIlliIliiIl(var5 != null ? var5.method_17784() : lllIliIlillIliIl.illilIilil(cell, class_2350.field_11036));
            double var10 = iiIiiliIIliili.Illlllllilll(
                  var7.IliIlllilIi(), var7.IilliliilIIi(), var7.lIiiIiIlilli(), var7.iIlIlllllill(), var8, false, c.ilIiIiiIIi
               )
               + (double)c.IiIiIiiIIi.Illillliilli(var7.iliIiiliiiii());
            return !c.iIlIlllllill(var7.liiiIIllIl(), var7.iIlIlllllill(), var7.IliIlllilIi(), var7.iliIiiliiiii(), var7.IilliliilIIi(), var7.lIiiIiIlilli())
               ? new iIlIIlilIllIIlil(
                  false,
                  IiIIlliIIl<"IiIIlliIIl","MS4yoRPrVO6A3q+5vZ7mdOcd2eBn2ER66sl7BwtXqv687g==">(),
                  var7.IliIlllilIi(),
                  var7.liiiIIllIl(),
                  var7.iIlIlllllill(),
                  var10
               )
               : new iIlIIlilIllIIlil(
                  true,
                  (int)(var12 >>> 32) != 0
                     ? IiIIlliIIl<"IiIIlliIIl","5j+5yhIeiVB+6M2WEASVkcBgK5yACo0uUyXWiFz3PZN5HVY=">()
                     : IiIIlliIIl<"IiIIlliIIl","yWvXxkqbkRLZ8jRduCXJ2PhvpRo4fmaFLiBApEUY">(),
                  var7.IliIlllilIi(),
                  var7.liiiIIllIl(),
                  var7.iIlIlllllill(),
                  var10
               );
         }
      }
   }

   public static iIlIIlilIllIIlil IIIllIIliIIl(IillIiillillIiil r, IlliIlillliIli kind, class_2338 faces, class_1511 crystal, class_2350[] cell) {
      return lIiiIiIlilli(r, kind, faces, faces, crystal, cell);
   }

   public static double IilliliilIIi(IillIiillillIiil crystal, class_1511 r) {
      if (Ililllililil(crystal) && r != null && r.method_5805() && !r.method_31481()) {
         if (crystal.Illlllllilll() != null && crystal.Illlllllilll().IIlilIliiIli(r.method_5628(), crystal.Iilllilliill())) {
            return Double.NaN;
         } else {
            IiiiliIiliiiliIi var2 = new IiiiliIiliiiliIi(crystal);
            if (var2.IlIlllIlilIl(r.method_73189())) {
               return Double.NaN;
            } else {
               IiIilIllliIilIll var3 = var2.Ililllililil(r);
               return var3.IIIllIIliIIl() ? var3.IlIlllIlilIl() : Double.NaN;
            }
         }
      } else {
         return Double.NaN;
      }
   }

   private static liilIllliiilIlll IIIilIIiiIIi(IiiiliIiliiiliIi c, boolean prune) {
      long var23 = -9023904810442815971L;
      long var25 = -3429907015677373037L;
      liilIllliiilIlll var2 = new liilIllliiilIlll();
      IillIiillillIiil var3 = c.lIIiIiiIIi;
      lIiillIiiIiillIi var4 = c.ilIiIiiIIi;
      class_238 var5 = c.iIIiIiiIIi.method_5829().method_1014(5.0);

      for (class_1511 var7 : IIllilIiil.field_1687.method_8390(class_1511.class, var5, e -> e.method_5805() && !e.method_31481())) {
         var23 ^= ((long)var7.method_5628() << 32 ^ var23) & -1L << 32;
         if (var3.Illlllllilll() == null
            || !var3.Illlllllilll().IIlilIliiIli((int)(var23 >>> 32), var3.Iilllilliill())
               && !var3.Illlllllilll().IiIiliIiiiIi((int)(var23 >>> 32), var3.IIillIiliIil(), var3.Ililllililil())) {
            class_238 var9 = var7.method_5829();
            if (!(lllIliIlillIliIl.IIlilIliiIli(c.IlIiIiiIIi, var9) >= 3.0)
               && lllIliIlillIliIl.Illillliilli(c.IlIiIiiIIi, var9.method_1005(), var3.IlIillIiilIi(), var4.IIillIiliIil())) {
               if (lllIliIlillIliIl.Iiiiliiiiiii(var9, var7, c.IlIiIiiIIi, var3.Iiilliiliiil(), var3.IIIilIIiiIIi(), 3.0) == null) {
                  c.lIiiIiiIIi = true;
               } else if (c.IlIlllIlilIl(var7.method_73189())) {
                  c.iIiiIiiIIi = true;
               } else {
                  IiIilIllliIilIll var10 = c.Ililllililil(var7);
                  if (!var10.IIIllIIliIIl()) {
                     c.IIiiIiiIIi = true;
                  } else if (!iiIiiliIIliili.Ililllililil(var10.IliIlllilIi(), var10.IilliliilIIi(), var10.iliIiiliiiii(), var4)
                     && !c.IiIiIiiIIi.Ililllililil(var10.IliIlllilIi(), var10.IiIlliIliiIl(), var10.IilliliilIIi())) {
                     c.iiliIiiIIi = true;
                  } else {
                     var2.lllliIIill
                        .add(
                           new lIlIiiIliIlIiiIl(
                              IlliIlillliIli.iliiIlIIIl,
                              lllIliIlillIliIl.iliIiiliiiii(var7).method_10062(),
                              (int)(var23 >>> 32),
                              var10.IliIlllilIi(),
                              var10.iIlIlllllill(),
                              var10.IilliliilIIi(),
                              var10.IlIlllIlilIl()
                           )
                        );
                     if (c.IiIiIiiIIi.iIIIlIlIIl() && c.lIiiIiIlilli(var7)) {
                        var2.IliliIIill = true;
                     }

                     if (var10.IlIlllIlilIl() > var2.IilliIIill) {
                        var2.IilliIIill = var10.IlIlllIlilIl();
                        var2.illliIIill = var7;
                     }
                  }
               }
            }
         }
      }

      ArrayList var27 = new ArrayList();
      ArrayList var28 = new ArrayList();

      for (lilillIliilillIl var30 : IlIillIiilIi(c)) {
         (var30.iIlIlllllill() ? var27 : var28).add(var30);
      }

      var27.sort(Comparator.comparingDouble(lilillIliilillIl::liiiIIllIl).reversed());
      double var29 = var4.lliIliliIl() ? Math.max(0.0, (double)var4.liIlliiIll()) : 0.0;
      var23 ^= (0L ^ var23) & -1L >>> 32;

      for (lilillIliilillIl var12 : var27) {
         if ((int)var23 >= var4.Iilililiiili() || var2.IliliIIill) {
            break;
         }

         double var13 = (double)(var4.Iliilliiilii() * var12.liiiIIllIl() + var4.iIIIlIlIIl() + var4.llIIlilIIl())
            + var29
            + (double)c.IiIiIiiIIi.Iiiiliiiiiii();
         if (prune && var13 <= Math.max(var2.iilliIIill, var2.IilliIIill)) {
            break;
         }

         var23 ^= (var23 ^ var23 + (long)1) & -1L >>> 32;
         class_243 var15 = lllIliIlillIliIl.liiiIIllIl(var12.IliIlllilIi());
         ililIiilIiilIiil var16 = c.Iilllilliill(var15, null, (int)var23 <= var4.iIiIlIliIl(), c.IiliIiiIIi, true);
         if (var16 != null) {
            if (!c.iIlIlllllill(var16.liiiIIllIl(), var16.iIlIlllllill(), var16.IliIlllilIi(), var16.iliIiiliiiii(), var16.IilliliilIIi(), var16.lIiiIiIlilli())
               )
             {
               c.IIiiIiiIIi = true;
            } else {
               class_3965 var17 = lllIliIlillIliIl.Iliilliiilii(
                  var12.IliIlllilIi(), lllIliIlillIliIl.IiliiliIll, null, c.IlIiIiiIIi, var3.Iiilliiliiil(), var3.IIIilIIiiIIi(), 4.4 - var4.IIiIllIiIl()
               );
               if (var17 == null) {
                  c.lIiiIiiIIi = true;
               } else {
                  double var18 = iiIiiliIIliili.Illlllllilll(
                        var16.IliIlllilIi(),
                        var16.IilliliilIIi(),
                        var16.lIiiIiIlilli(),
                        var16.iIlIlllllill(),
                        c.IiIlliIliiIl(var17.method_17784()),
                        false,
                        var4
                     )
                     + Iilililiiili(c, var15)
                     + (double)c.IiIiIiiIIi.Illillliilli(var16.iliIiiliiiii());
                  var2.lllliIIill
                     .add(
                        new lIlIiiIliIlIiiIl(
                           IlliIlillliIli.lliiIlIIIl, var12.IliIlllilIi(), -1, var16.IliIlllilIi(), var16.iIlIlllllill(), var16.IilliliilIIi(), var18
                        )
                     );
                  if (var18 > var2.iilliIIill) {
                     var2.iilliIIill = var18;
                     var2.lilliIIill = var12.IliIlllilIi();
                  }
               }
            }
         }
      }

      var28.sort(Comparator.comparingDouble(lilillIliilillIl::liiiIIllIl).reversed());
      var25 ^= ((long)(var2.lilliIIill == null && var2.illliIIill == null ? var4.Iilililiiili() : Math.min(8, var4.Iilililiiili())) << 32 ^ var25) & -1L << 32;
      var23 ^= (0L ^ var23) & -1L >>> 32;

      for (lilillIliilillIl var32 : var28) {
         if ((int)var23 >= (int)(var25 >>> 32) || var2.IliliIIill) {
            break;
         }

         double var14 = (double)(var4.Iliilliiilii() * var32.liiiIIllIl() + var4.iIIIlIlIIl() + var4.llIIlilIIl() - var4.illIlIilIl())
            + var29
            + (double)c.IiIiIiiIIi.Iiiiliiiiiii();
         if (prune && var14 <= Math.max(var2.iIiliIIill, Math.max(var2.iilliIIill, var2.IilliIIill))) {
            break;
         }

         var23 ^= (var23 ^ var23 + (long)1) & -1L >>> 32;
         class_243 var33 = lllIliIlillIliIl.liiiIIllIl(var32.IliIlllilIi());
         ililIiilIiilIiil var34 = c.Iilllilliill(var33, var32.IliIlllilIi(), (int)var23 <= var4.iIiIlIliIl(), c.liliIiiIIi, true);
         if (var34 != null) {
            if (!c.iIlIlllllill(var34.liiiIIllIl(), var34.iIlIlllllill(), var34.IliIlllilIi(), var34.iliIiiliiiii(), var34.IilliliilIIi(), var34.lIiiIiIlilli())
               )
             {
               c.IIiiIiiIIi = true;
            } else {
               ilIIiiiIiIIiii var35 = lllIliIlillIliIl.Iiilliiliiil(
                  var32.IliIlllilIi(), c.IlIiIiiIIi, var3.Iiilliiliiil(), var3.IIIilIIiiIIi(), 4.4 - var4.IIiIllIiIl()
               );
               if (var35 != null && lllIliIlillIliIl.iiIIlIIlIl(var32.IliIlllilIi(), c.IlIiIiiIIi, 4.4)) {
                  double var19 = c.IiIlliIliiIl(lllIliIlillIliIl.illilIilil(var35.IliIlllilIi(), var35.liiiIIllIl()));
                  double var21 = iiIiiliIIliili.Illlllllilll(
                        var34.IliIlllilIi(), var34.IilliliilIIi(), var34.lIiiIiIlilli(), var34.iIlIlllllill(), var19, true, var4
                     )
                     + Iilililiiili(c, var33)
                     + (double)c.IiIiIiiIIi.Illillliilli(var34.iliIiiliiiii());
                  var2.lllliIIill
                     .add(
                        new lIlIiiIliIlIiiIl(
                           IlliIlillliIli.IiiiIlIIIl, var32.IliIlllilIi(), -1, var34.IliIlllilIi(), var34.iIlIlllllill(), var34.IilliliilIIi(), var21
                        )
                     );
                  if (var21 > var2.iIiliIIill) {
                     var2.iIiliIIill = var21;
                     var2.IIiliIIill = var32.IliIlllilIi();
                     var2.lIiliIIill = var35;
                  }
               } else {
                  c.lIiiIiiIIi = true;
               }
            }
         }
      }

      return var2;
   }

   public static class_1511 iliIiiliiiii(IillIiillillIiil r, class_2338 except) {
      if (Ililllililil(r) && r.IiIiliIiiiIi() != null && r.IiIiliIiiiIi().Illlllllilll() && r.Illlllllilll() != null) {
         IiiiliIiliiiliIi var2 = new IiiiliIiliiiliIi(r);
         class_238 var3 = var2.iIIiIiiIIi.method_5829().method_1014(5.0);

         for (class_1511 var5 : IIllilIiil.field_1687.method_8390(class_1511.class, var3, e -> e.method_5805() && !e.method_31481())) {
            if ((except == null || !lllIliIlillIliIl.iliIiiliiiii(var5).equals(except)) && var2.IIIllIIliIIl(var5)) {
               return var5;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   public static iIlIIlilIllIIlil IlIlllIlilIl(IillIiillillIiil crystal, IlliIlillliIli r, class_2338 kind, class_1511 cell) {
      return IIIllIIliIIl(crystal, r, kind, cell, lllIliIlillIliIl.IiliiliIll);
   }

   private static double Iilililiiili(IiiiliIiliiiliIi c, class_243 centre) {
      if (!c.ilIiIiiIIi.lliIliliIl()) {
         return 0.0;
      } else {
         class_243 var2 = c.iIliIiiIIi.IliIlllilIi();
         double var3 = centre.field_1351 - var2.field_1351;
         double var5 = Math.hypot(centre.field_1352 - var2.field_1352, centre.field_1350 - var2.field_1350);
         return iiIiiliIIliili.IiIiliIiiiIi(var3, var5, c.ilIiIiiIIi);
      }
   }

   public static iIlIIlilIllIIlil lIiiIiIlilli(
      IillIiillillIiil crystal, IlliIlillliIli kind, class_2338 crystalCell, class_2338 faces, class_1511 cell, class_2350[] r
   ) {
      if (Ililllililil(crystal) && kind != null) {
         IiiiliIiliiiliIi var6 = new IiiiliIiliiiliIi(crystal);
         class_2350[] var7 = r != null && r.length != 0 ? r : lllIliIlillIliIl.IiliiliIll;

         return switch (kind) {
            case iliiIlIIIl -> IiIlliIliiIl(var6, cell);
            case lliiIlIIIl -> IIlllIlliIll(var6, crystalCell, var7);
            case IiiiIlIIIl -> Illlllllilll(var6, crystalCell, faces == null ? crystalCell : faces);
         };
      } else {
         return Iilllilliill(IiIIlliIIl<"IiIIlliIIl","Yi5Q70F7px33mEtXPycibs8z2GXh9obFH0U0C+SVtDc=">());
      }
   }

   private static iiIllIIlIIlllIIl Iiilliiliiil(IillIiillillIiil r) {
      long var6 = -7735007286512110418L;
      IiiiliIiliiiliIi var1 = new IiiiliIiliiiliIi(r);
      liilIllliiilIlll var2 = IIIilIIiiIIi(var1, true);
      IillIiillillIiil var3 = var2.IliIlllilIi() && var1.iiliIiiIIi ? r.iIlIlllllill() : null;
      if (var3 != null) {
         r = var3;
         var1 = new IiiiliIiliiiliIi(var3);
         var2 = IIIilIIiiIIi(var1, true);
      }

      var6 ^= ((long)var1.llIiIiiIIi.method_5628() << 32 ^ var6) & -1L << 32;
      if (var2.illliIIill != null && var2.IilliIIill >= var2.iilliIIill && var2.IilliIIill >= var2.iIiliIIill) {
         return new iiIllIIlIIlllIIl(IIiiilIilIiiilIi.liiiIIllIl(var2.illliIIill, var2.IilliIIill, r.IIillIiliIil(), (int)(var6 >>> 32)), null);
      } else if (var2.lilliIIill != null && var2.iilliIIill >= var2.iIiliIIill) {
         return new iiIllIIlIIlllIIl(IIiiilIilIiiilIi.IliIlllilIi(var2.lilliIIill, var2.iilliIIill, r.IIillIiliIil(), (int)(var6 >>> 32)), null);
      } else if (var2.IIiliIIill != null) {
         ilIIiiiIiIIiii var5 = var2.lIiliIIill;
         return new iiIllIIlIIlllIIl(
            var5 == null
               ? IIiiilIilIiiilIi.iIlIlllllill(var2.IIiliIIill, var2.iIiliIIill, r.IIillIiliIil(), (int)(var6 >>> 32))
               : IIiiilIilIiiilIi.IilliliilIIi(var2.IIiliIIill, var2.iIiliIIill, r.IIillIiliIil(), (int)(var6 >>> 32), var5.IliIlllilIi(), var5.liiiIIllIl()),
            null
         );
      } else {
         return new iiIllIIlIIlllIIl(null, var1.Iiilliiliiil());
      }
   }

   public static List<lIlIiiIliIlIiiIl> liiiIIllIl(IillIiillillIiil r, int limit) {
      if (Ililllililil(r) && limit > 0) {
         IiiiliIiliiiliIi var2 = new IiiiliIiliiiliIi(r);
         liilIllliiilIlll var3 = IIIilIIiiIIi(var2, limit <= 1);
         IillIiillillIiil var4 = var3.IliIlllilIi() && var2.iiliIiiIIi ? r.iIlIlllllill() : null;
         if (var4 != null) {
            var3 = IIIilIIiiIIi(new IiiiliIiliiiliIi(var4), limit <= 1);
         }

         ArrayList var5 = new ArrayList<>(var3.lllliIIill);
         var5.sort(Comparator.comparingDouble(lIlIiiIliIlIiiIl::IIIllIIliIIl).reversed());
         return var5.size() <= limit ? var5 : new ArrayList<>(var5.subList(0, limit));
      } else {
         return List.of();
      }
   }

   private static List<lilillIliilillIl> IlIillIiilIi(IiiiliIiliiiliIi c) {
      long var17 = -3412621210849512912L;
      long var19 = -4389139628250507884L;
      long var21 = 250815610585430816L;
      long var13 = 5123670539070785595L;
      long var15 = 2676376719578430215L;
      lIiillIiiIiillIi var1 = c.ilIiIiiIIi;
      HashSet var2 = new HashSet();
      ArrayList var3 = new ArrayList();
      var13 ^= ((long)(c.lIIiIiiIIi.IiIlliIliiIl() && c.lIIiIiiIIi.IIlllIlliIll() && lllIliIlillIliIl.IlIlllIlilIl() ? 1 : 0) << 32 ^ var13) & -1L << 32;
      if (!var1.lliIliliIl()) {
         var13 ^= ((long)class_3532.method_15357(c.iIIiIiiIIi.method_23317()) ^ var13) & -1L >>> 32;
         var15 ^= ((long)class_3532.method_15357(c.iIIiIiiIIi.method_23318()) << 32 ^ var15) & -1L << 32;
         var15 ^= ((long)class_3532.method_15357(c.iIIiIiiIIi.method_23321()) ^ var15) & -1L >>> 32;
         var17 ^= ((long)Math.max(0, var1.IlIillIiilIi()) << 32 ^ var17) & -1L << 32;

         for (var17 ^= ((long)var1.Iiilliiliiil() ^ var17) & -1L >>> 32; (int)var17 <= var1.IIIilIIiiIIi(); var17 ^= (var17 ^ var17 + (long)1) & -1L >>> 32) {
            var19 ^= ((long)(-((int)(var17 >>> 32))) << 32 ^ var19) & -1L << 32;

            while ((int)(var19 >>> 32) <= (int)(var17 >>> 32)) {
               for (var19 ^= ((long)(-((int)(var17 >>> 32))) ^ var19) & -1L >>> 32;
                  (int)var19 <= (int)(var17 >>> 32);
                  var19 ^= (var19 ^ var19 + (long)1) & -1L >>> 32
               ) {
                  IiIiliIiiiIi(
                     c, var2, var3, (boolean)((int)(var13 >>> 32)), (int)var13 + (int)(var19 >>> 32), (int)(var15 >>> 32) + (int)var17, (int)var15 + (int)var19
                  );
               }

               var19 += 4294967296L;
            }
         }
      }

      class_243 var5 = c.iIliIiiIIi.IliIlllilIi();
      var15 ^= ((long)class_3532.method_15357(var5.field_1352) << 32 ^ var15) & -1L << 32;
      var15 ^= ((long)class_3532.method_15357(var5.field_1351) ^ var15) & -1L >>> 32;
      var17 ^= ((long)class_3532.method_15357(var5.field_1350) << 32 ^ var17) & -1L << 32;
      var17 ^= ((long)Math.max(0, var1.IiIiliIiiiIi()) ^ var17) & -1L >>> 32;
      var19 ^= ((long)var1.IIlilIliiIli() << 32 ^ var19) & -1L << 32;

      while ((int)(var19 >>> 32) <= var1.Illillliilli()) {
         for (var19 ^= ((long)(-((int)var17)) ^ var19) & -1L >>> 32; (int)var19 <= (int)var17; var19 ^= (var19 ^ var19 + (long)1) & -1L >>> 32) {
            for (var21 ^= ((long)(-((int)var17)) << 32 ^ var21) & -1L << 32; (int)(var21 >>> 32) <= (int)var17; var21 += 4294967296L) {
               IiIiliIiiiIi(
                  c,
                  var2,
                  var3,
                  (boolean)((int)(var13 >>> 32)),
                  (int)(var15 >>> 32) + (int)var19,
                  (int)var15 + (int)(var19 >>> 32),
                  (int)(var17 >>> 32) + (int)(var21 >>> 32)
               );
            }
         }

         var19 += 4294967296L;
      }

      return var3;
   }

   private static boolean IIiilIiiiIii(iIIlIIiIlIlIIi p, class_238 block, class_238 space) {
      return p.liiiIIllIl().method_994(block) || space != null && p.liiiIIllIl().method_994(space);
   }

   private static boolean Iliilliiilii(class_1309 target, class_243 centre) {
      return target.method_6039() && liliIIliiiliIIli.liiiIIllIl(target, centre, class_8111.field_42332);
   }

   private static boolean Ililllililil(IillIiillillIiil r) {
      return r != null && r.IilliliilIIi() != null && IIllilIiil.field_1724 != null && IIllilIiil.field_1687 != null;
   }

   public static double iIlIlllllill(IillIiillillIiil base, class_2338 virtualSolid, class_2338 r) {
      long var14 = 8383272274726774721L;
      if (Ililllililil(base) && virtualSolid != null) {
         IiiiliIiliiiliIi var3 = new IiiiliIiliiiliIi(base);
         if (var3.ilIiIiiIIi.IIiilIiiiIii() && var3.ilIiIiiIIi.Iilililiiili() <= 0) {
            return Double.NaN;
         } else {
            class_238 var4 = lllIliIlillIliIl.iIlIlllllill(virtualSolid);
            class_238 var5 = r == null ? null : lllIliIlillIliIl.lIiiIiIlilli(r);
            if (!IIiilIiiiIii(var3.iIliIiiIIi, var4, var5) && !IIiilIiiiIii(var3.IlliIiiIIi, var4, var5)) {
               class_243 var6 = lllIliIlillIliIl.liiiIIllIl(virtualSolid);
               if (var3.IlIlllIlilIl(var6)) {
                  return Double.NaN;
               } else {
                  var14 ^= ((long)(r != null ? 1 : 0) << 32 ^ var14) & -1L << 32;
                  ililIiilIiilIiil var8 = var3.Iilllilliill(var6, r, true, (int)(var14 >>> 32) != 0 ? var3.liliIiiIIi : var3.IiliIiiIIi, true);
                  IillIiillillIiil var9 = var8 == null ? base.iIlIlllllill() : null;
                  if (var9 != null) {
                     var3 = new IiiiliIiliiiliIi(var9);
                     var8 = var3.Iilllilliill(var6, r, true, (int)(var14 >>> 32) != 0 ? var3.liliIiiIIi : var3.IiliIiiIIi, true);
                  }

                  if (var8 == null) {
                     return Double.NaN;
                  } else {
                     var14 ^= (
                           (long)(
                                 var3.ilIiIiiIIi.iIlllIllll()
                                    ? var3.iIlIlllllill(
                                       var8.liiiIIllIl(),
                                       var8.iIlIlllllill(),
                                       var8.IliIlllilIi(),
                                       var8.iliIiiliiiii(),
                                       var8.IilliliilIIi(),
                                       var8.lIiiIiIlilli()
                                    )
                                    : var3.IliIlllilIi(var8.liiiIIllIl(), var8.iIlIlllllill(), var8.lIiiIiIlilli())
                              )
                              ^ var14
                        )
                        & -1L >>> 32;
                     if ((int)var14 == 0) {
                        return Double.NaN;
                     } else if (var3.ilIiIiiIIi.lliIliliIl()
                        && !var3.IiIiIiiIIi.iiIIlIIlIl()
                        && !Illillliilli(var3, var6)
                        && !var8.IilliliilIIi()
                        && !(IIlilIliiIli(var3, var6) >= var3.liIiIiiIIi)) {
                        return Double.NaN;
                     } else {
                        class_3965 var11 = lllIliIlillIliIl.Iliilliiilii(
                           virtualSolid,
                           lllIliIlillIliIl.IiliiliIll,
                           null,
                           var3.IlIiIiiIIi,
                           base.Iiilliiliiil(),
                           base.IIIilIIiiIIi(),
                           4.4 - var3.ilIiIiiIIi.IIiIllIiIl()
                        );
                        double var12 = var3.IiIlliIliiIl(
                           var11 != null ? var11.method_17784() : lllIliIlillIliIl.illilIilil(virtualSolid, class_2350.field_11036)
                        );
                        return iiIiiliIIliili.Illlllllilll(
                              var8.IliIlllilIi(),
                              var8.IilliliilIIi(),
                              var8.lIiiIiIlilli(),
                              var8.iIlIlllllill(),
                              var12,
                              (boolean)((int)(var14 >>> 32)),
                              var3.ilIiIiiIIi
                           )
                           + (double)var3.IiIiIiiIIi.Illillliilli(var8.iliIiiliiiii())
                           + Iilililiiili(var3, var6);
                     }
                  }
               }
            } else {
               return Double.NaN;
            }
         }
      } else {
         return Double.NaN;
      }
   }
}
