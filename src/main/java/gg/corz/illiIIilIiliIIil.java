package gg.corz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import net.minecraft.class_1511;
import net.minecraft.class_1802;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_746;

public final class illiIIilIiliIIil {
   public static final double IIIlIiIIil = 1.5;
   public static final int IliIIiIIil = 8;
   private int llIlIiIIil;
   public static final int IilIIiIIil = 30;
   public static final int iilIIiIIil = 3;
   private static final double[] iIIlIiIIil = new double[]{0.5, 0.2, 0.8};
   public static final double lliIIiIIil = 0.2;
   public static final double iiiIIiIIil = 2.5;
   public static final double IIiIIiIIil = 0.3;
   public static final int liiIIiIIil = 80;
   public static final double lIiIIiIIil = 0.5;
   public static final int iliIIiIIil = 60;
   public static final double iIiIIiIIil = 1.0;
   private static final class_2350[] lIIlIiIIil = class_2350.values();
   public static final double illIIiIIil = 4.0;
   public static final int IllIIiIIil = 4;
   public static final int IiiIIiIIil = 240;
   public static final int lilIIiIIil = 6;
   public static final double lllIIiIIil = 1.5;
   private Predicate<class_243> IlIlIiIIil = v -> false;

   static class_243 Ililllililil(class_2338 v, class_2350 face, double pos, double u) {
      double var6 = (double)v.method_10263();
      double var8 = (double)v.method_10264();
      double var10 = (double)v.method_10260();

      return switch (face) {
         case field_11036 -> new class_243(var6 + pos, var8 + 1.0, var10 + u);
         case field_11033 -> new class_243(var6 + pos, var8, var10 + u);
         case field_11043 -> new class_243(var6 + pos, var8 + u, var10);
         case field_11035 -> new class_243(var6 + pos, var8 + u, var10 + 1.0);
         case field_11039 -> new class_243(var6, var8 + pos, var10 + u);
         case field_11034 -> new class_243(var6 + 1.0, var8 + pos, var10 + u);
         default -> throw new MatchException(null, null);
      };
   }

   private static boolean lIiiIiIlilli(class_243 us, boolean onGround, class_243 stand) {
      return IliIlIIllliIlIIl.IIIIllIIIl(us, stand) <= 0.3 && onGround && Math.abs(us.field_1351 - stand.field_1351) < 0.5;
   }

   static List<class_2338> IiIlliIliiIl(class_2338 F) {
      ArrayList var1 = new ArrayList(12);
      class_2338 var2 = F.method_10084();
      var1.add(F.method_10095());
      var1.add(F.method_10072());
      var1.add(F.method_10067());
      var1.add(F.method_10078());
      var1.add(F.method_10095().method_10067());
      var1.add(F.method_10095().method_10078());
      var1.add(F.method_10072().method_10067());
      var1.add(F.method_10072().method_10078());
      var1.add(var2.method_10095());
      var1.add(var2.method_10072());
      var1.add(var2.method_10067());
      var1.add(var2.method_10078());
      return var1;
   }

   private boolean IIlllIlliIll(IliIlIIllliIlIIl reach, class_2338 w, class_2338 targetBox, class_243 eye, double targetFeet, class_238 A) {
      long var15 = -872966406576295244L;
      class_2338 var8 = targetBox.method_10084();
      class_2350[] var9 = lIIlIiIIil;
      var15 ^= ((long)var9.length << 32 ^ var15) & -1L << 32;

      for (long var18 = var15 ^ (0L ^ var15) & -1L >>> 32; (int)var18 < (int)(var18 >>> 32); var18 ^= (var18 ^ var18 + (long)1) & -1L >>> 32) {
         class_2350 var12 = var9[(int)var18];
         class_2338 var13 = w.method_10093(var12);
         if (!var13.equals(targetBox) && !var13.equals(var8)) {
            class_2350 var14 = var12.method_10153();
            if (IIillIiliIil(eye, var13, var14)
               && reach.lIiiIiIlilli(var13)
               && lllIliIlillIliIl.Iilllilliill(var13, var14)
               && this.Iilllilliill(var13, var14, eye, targetFeet, A)) {
               return true;
            }
         }
      }

      return false;
   }

   public iiIIllilIIlIllil IliIlllilIi(
      long target,
      IliIlIIllliIlIIl t,
      iIliIlilIlliIlil cfg,
      lliiilIiiliiilIi w,
      liiilIiliiiilIil tick,
      llilIlIlililIlIl self,
      int targetReadyIn,
      Predicate<class_243> veto
   ) {
      long var37 = 3876293313330506600L;
      long var39 = 4654386669030584799L;
      long var41 = 6945456803810051275L;
      if (self == null || !self.iliIiiliiiii() || t == null || t.IilliliilIIi() == null || cfg == null || w == null || tick == null) {
         return null;
      } else if (!lliiIliliiIl.iIlIlllllill()) {
         return null;
      } else {
         class_746 var10 = class_310.method_1551().field_1724;
         if (var10 == null) {
            return null;
         } else if (IilIIililIIi.lIiiIiIlilli(class_1802.field_23141) >= 0 && IilIIililIIi.lIiiIiIlilli(class_1802.field_8801) >= 0) {
            if (var10.method_6079().method_31574(class_1802.field_8801)) {
               return null;
            } else {
               illIlIiIilIlIi var11 = cfg.IiIlliIliiIl();
               if (var11 != null && var11.liiiIIllIl()) {
                  Predicate var12 = veto == null ? v -> false : veto;
                  this.IlIlIiIIil = var12;
                  class_1937 var13 = t.IilliliilIIi();
                  liIIiIlliiIIiIll var14 = var11.IliIlllilIi();
                  class_243 var15 = new class_243(var14.IliIlllilIi(), var14.liiiIIllIl(), var14.iIlIlllllill());
                  var37 ^= ((long)((int)Math.floor(var14.liiiIIllIl() + 1.0E-6)) << 32 ^ var37) & -1L << 32;
                  class_2338 var17 = class_2338.method_49637(var15.field_1352, (double)((int)(var37 >>> 32)) + 0.01, var15.field_1350);
                  class_238 var18 = IliIlIIllliIlIIl.Iiilliiliiil(var14.IliIlllilIi(), var14.liiiIIllIl(), var14.iIlIlllllill(), 0.2);
                  class_243 var19 = w.liiiIIllIl();
                  Object var20 = new ArrayList();

                  for (long var46 = var37 ^ (-4L ^ var37) & -1L >>> 32; (int)var46 <= 4; var46 ^= (var46 ^ var46 + (long)1) & -1L >>> 32) {
                     for (var39 ^= (-17179869184L ^ var39) & -1L << 32; (int)(var39 >>> 32) <= 4; var39 += 4294967296L) {
                        double var23 = (double)(var17.method_10263() + (int)var46) + 0.5;
                        double var25 = (double)(var17.method_10260() + (int)(var39 >>> 32)) + 0.5;
                        double var27 = IliIlIIllliIlIIl.iIIIlIlIIl(var23, var25, var15.field_1352, var15.field_1350);
                        if (!(var27 < 1.5) && !(var27 > 4.0)) {
                           for (var39 ^= ~var39 & -1L >>> 32; (int)var39 >= -2; var39 ^= (var39 ^ var39 + (long)-1) & -1L >>> 32) {
                              class_2338 var30 = new class_2338(
                                 var17.method_10263() + (int)var46, (int)(var46 >>> 32) + (int)var39, var17.method_10260() + (int)(var39 >>> 32)
                              );
                              if (!t.lIiiIiIlilli(var30)
                                 && !t.lIiiIiIlilli(var30.method_10084())
                                 && t.lIiiIiIlilli(var30.method_10074())
                                 && iIiIilIliIil.iIlIlllllill(var13, var30)) {
                                 class_243 var31 = new class_243(var23, (double)var30.method_10264(), var25);
                                 double var32 = var19.method_1022(var31);
                                 var41 ^= ((long)((int)Math.ceil(IliIlIIllliIlIIl.IIIIllIIIl(var19, var31) / 0.26)) << 32 ^ var41) & -1L << 32;
                                 if ((int)(var41 >>> 32) <= 30 && t.llIIlilIIl(var19, var31, 1)) {
                                    double var35 = ((int)var39 == -1 ? 0.0 : -1.0) - 0.05 * (double)((int)(var41 >>> 32)) - 0.01 * var32;
                                    var20.add(new iIliliIlIlliliIl(var31, (int)var39, (int)(var41 >>> 32), var35));
                                    break;
                                 }
                              }
                           }
                        }
                     }
                  }

                  if (var20.isEmpty()) {
                     return null;
                  } else {
                     var20.sort(Comparator.comparingDouble(iIliliIlIlliliIl::IilliliilIIi).reversed());
                     if (var20.size() > 6) {
                        var20 = var20.subList(0, 6);
                     }

                     List var21 = IiIlliIliiIl(var17);
                     double var22 = lliiIliliiIl.liiiIIllIl();
                     this.llIlIiIIil = 240;
                     iiIIllilIIlIllil var24 = null;

                     for (iIliliIlIlliliIl var26 : var20) {
                        var41 ^= (0L ^ var41) & -1L >>> 32;

                        for (class_2338 var29 : var21) {
                           if ((int)var41 >= 3) {
                              break;
                           }

                           iiIIllilIIlIllil var44 = this.IilliliilIIi(
                              t,
                              var29,
                              var26.IliIlllilIi(),
                              var26.liiiIIllIl(),
                              var26.iIlIlllllill(),
                              var17,
                              var15,
                              var18,
                              var11.lIiiIiIlilli(),
                              var19,
                              w.iliIiiliiiii(),
                              var12,
                              var22
                           );
                           if (var44 != null) {
                              var41 ^= (var41 ^ var41 + (long)1) & -1L >>> 32;
                              if (var24 == null || var44.iIlIlllllill() > var24.iIlIlllllill()) {
                                 var24 = var44;
                              }
                           }
                        }
                     }

                     return var24;
                  }
               } else {
                  return null;
               }
            }
         } else {
            return null;
         }
      }
   }

   private iiIIllilIIlIllil IilliliilIIi(
      IliIlIIllliIlIIl F,
      class_2338 w,
      class_243 feet,
      int reach,
      int A,
      class_2338 targetBox,
      class_243 pathTicks,
      class_238 level,
      double veto,
      class_243 rExpl,
      boolean us,
      Predicate<class_243> onGround,
      double stand
   ) {
      long var30 = 1584056631959623365L;
      class_1937 var16 = F.IilliliilIIi();
      var30 ^= ((long)var16.method_8320(w).method_27852(class_2246.field_23152) << 32 ^ var30) & -1L << 32;
      if ((int)(var30 >>> 32) == 0 && !F.IlIlllIlilIl(w)) {
         return null;
      } else {
         class_238 var18 = lllIliIlillIliIl.lIiiIiIlilli(w);
         class_238 var19 = IliIlIIllliIlIIl.Iiilliiliiil(feet.field_1352, feet.field_1351, feet.field_1350, 0.0);
         if (var18.method_994(level) || var18.method_994(var19)) {
            return null;
         } else if (Iiilliiliiil(F, w, var18)) {
            return null;
         } else {
            class_243 var20 = class_243.method_24953(w);
            if (onGround != null && onGround.test(var20)) {
               return null;
            } else {
               class_243 var21 = feet.method_1031(0.0, 1.62, 0.0);
               if ((int)(var30 >>> 32) == 0 && !this.IIlllIlliIll(F, w, targetBox, var21, stand, level)) {
                  return null;
               } else if (!this.Illlllllilll(w, var21, stand, level)) {
                  return null;
               } else {
                  double var22 = IIiiIIllIiiIIl.IilliliilIIi(feet.field_1351, (double)w.method_10264() + 0.5);
                  double[] var24 = llllIiililllIiil.IlIlllIlilIl(
                     pathTicks.field_1352,
                     pathTicks.field_1351,
                     pathTicks.field_1350,
                     1.62,
                     var20.field_1352,
                     var20.field_1351,
                     var20.field_1350,
                     5.0,
                     1.0,
                     veto
                  );
                  double var25 = -0.0784 + var24[1];
                  var30 ^= ((long)IliIlIIllliIlIIl.Iilililiiili(pathTicks.field_1351, var25, pathTicks.field_1351, 60) ^ var30) & -1L >>> 32;
                  double var28 = 14.0 * (1.0 - var22) + 0.25 * (double)Math.min((int)var30, 24) - 0.15 * (double)A + (reach == -1 ? 0.0 : -1.0);
                  return new iiIIllilIIlIllil(feet, w, var28, (float)var22, A + 8, lIiiIiIlilli(rExpl, us, feet));
               }
            }
         }
      }
   }

   private boolean Iilllilliill(class_2338 reach, class_2350 pos, class_243 face, double targetBox, class_238 eye) {
      long var20 = 8714722876069286981L;
      long var22 = 6338106850860121547L;
      double var7 = targetBox * targetBox;
      double[] var9 = iIIlIiIIil;
      var20 ^= ((long)var9.length << 32 ^ var20) & -1L << 32;

      for (long var25 = var20 ^ (0L ^ var20) & -1L >>> 32; (int)var25 < (int)(var25 >>> 32); var25 ^= (var25 ^ var25 + (long)1) & -1L >>> 32) {
         double var12 = var9[(int)var25];
         double[] var14 = iIIlIiIIil;
         var22 ^= ((long)var14.length << 32 ^ var22) & -1L << 32;

         for (var22 ^= (0L ^ var22) & -1L >>> 32; (int)var22 < (int)(var22 >>> 32); var22 ^= (var22 ^ var22 + (long)1) & -1L >>> 32) {
            double var17 = var14[(int)var22];
            class_243 var19 = Ililllililil(reach, pos, var12, var17);
            if (!(face.method_1025(var19) > var7) && (eye == null || !eye.method_992(face, var19).isPresent())) {
               if (this.llIlIiIIil <= 0) {
                  return false;
               }

               this.llIlIiIIil--;
               if (lllIliIlillIliIl.IiIIlliIIl(face, var19)) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   private boolean Illlllllilll(class_2338 eye, class_243 A, double reach, class_238 targetBox) {
      long var10 = -6452103538377952359L;
      class_2350[] var6 = lIIlIiIIil;
      var10 ^= ((long)var6.length << 32 ^ var10) & -1L << 32;

      for (long var13 = var10 ^ (0L ^ var10) & -1L >>> 32; (int)var13 < (int)(var13 >>> 32); var13 ^= (var13 ^ var13 + (long)1) & -1L >>> 32) {
         class_2350 var9 = var6[(int)var13];
         if (IIillIiliIil(A, eye, var9) && this.Iilllilliill(eye, var9, A, reach, targetBox)) {
            return true;
         }
      }

      return false;
   }

   static boolean IIillIiliIil(class_243 eye, class_2338 pos, class_2350 face) {
      return switch (face) {
         case field_11036 -> eye.field_1351 > (double)pos.method_10264() + 1.0;
         case field_11033 -> eye.field_1351 < (double)pos.method_10264();
         case field_11043 -> eye.field_1350 < (double)pos.method_10260();
         case field_11035 -> eye.field_1350 > (double)pos.method_10260() + 1.0;
         case field_11039 -> eye.field_1352 < (double)pos.method_10263();
         case field_11034 -> eye.field_1352 > (double)pos.method_10263() + 1.0;
         default -> throw new MatchException(null, null);
      };
   }

   private iiIIllilIIlIllil iIlIlllllill(
      iiIIllilIIlIllil targetBox, IliIlIIllliIlIIl onGround, class_2338 feet, class_243 p, class_238 F, double us, int w, class_243 rExpl, boolean level
   ) {
      long var20 = -5882379718596397874L;
      double var11 = IliIlIIllliIlIIl.iIIIlIlIIl(targetBox.IliIlllilIi().field_1352, targetBox.IliIlllilIi().field_1350, p.field_1352, p.field_1350);
      if (!(var11 < 1.5) && !(var11 > 4.0)) {
         var20 ^= ((long)((int)Math.ceil(IliIlIIllliIlIIl.IIIIllIIIl(rExpl, targetBox.IliIlllilIi()) / 0.26)) << 32 ^ var20) & -1L << 32;
         double var14 = lliiIliliiIl.liiiIIllIl();
         this.llIlIiIIil = 80;
         iiIIllilIIlIllil var16 = null;

         for (class_2338 var18 : IiIlliIliiIl(feet)) {
            iiIIllilIIlIllil var19 = this.IilliliilIIi(
               onGround, var18, targetBox.IliIlllilIi(), w, (int)(var20 >>> 32), feet, p, F, us, rExpl, level, this.IlIlIiIIil, var14
            );
            if (var19 != null && (var16 == null || var19.iIlIlllllill() > var16.iIlIlllllill())) {
               var16 = var19;
            }
         }

         return var16;
      } else {
         return null;
      }
   }

   static int IIIllIIliIIl(double targetFeetLevel, int standY) {
      long var4 = 5055797766611773733L;
      var4 ^= ((long)((int)Math.floor(targetFeetLevel + 1.0E-6) - standY) << 32 ^ var4) & -1L << 32;
      return (int)(var4 >>> 32) != -1 && (int)(var4 >>> 32) != -2 ? 0 : (int)(var4 >>> 32);
   }

   private static boolean Iiilliiliiil(IliIlIIllliIlIIl w, class_2338 block, class_238 A) {
      for (class_1511 var4 : w.Iilllilliill(class_243.method_24953(block), 3.0)) {
         if (var4.method_5829().method_994(A)) {
            return true;
         }
      }

      return false;
   }

   static boolean IlIlllIlilIl(class_2338 anchor, class_2338 targetFeet) {
      long var5 = -2305305400056620043L;
      long var7 = -8809738414210708310L;
      if (anchor != null && targetFeet != null) {
         var5 ^= ((long)Math.abs(anchor.method_10263() - targetFeet.method_10263()) << 32 ^ var5) & -1L << 32;
         var5 ^= ((long)Math.abs(anchor.method_10260() - targetFeet.method_10260()) ^ var5) & -1L >>> 32;
         var7 ^= ((long)(anchor.method_10264() - targetFeet.method_10264()) << 32 ^ var7) & -1L << 32;
         if ((int)(var7 >>> 32) != 0) {
            return (int)(var7 >>> 32) == 1 ? (int)(var5 >>> 32) + (int)var5 == 1 : false;
         } else {
            return (int)(var5 >>> 32) <= 1 && (int)var5 <= 1 && (int)(var5 >>> 32) + (int)var5 > 0;
         }
      } else {
         return false;
      }
   }

   static boolean iliIiiliiiii(class_2338 z, class_243 stand, double y, double grounded, double x, boolean anchor) {
      long var10 = -1154662368874253847L;
      if (z == null) {
         return true;
      } else {
         if (anchor) {
            var10 ^= ((long)((int)Math.floor(grounded + 1.0E-6)) << 32 ^ var10) & -1L << 32;
            if (!IlIlllIlilIl(z, class_2338.method_49637(y, (double)((int)(var10 >>> 32)) + 0.01, x))) {
               return true;
            }
         } else if (IliIlIIllliIlIIl.iIIIlIlIIl((double)z.method_10263() + 0.5, (double)z.method_10260() + 0.5, y, x) > 2.5) {
            return true;
         }

         return stand != null && IliIlIIllliIlIIl.iIIIlIlIIl(stand.field_1352, stand.field_1350, y, x) > 5.5;
      }
   }

   public iiIIllilIIlIllil liiiIIllIl(iiIIllilIIlIllil w, IliIlIIllliIlIIl self, lliiilIiiliiilIi p, iIliIlilIlliIlil t) {
      long var17 = 7980949683371196919L;
      long var19 = 2748459985348954062L;
      long var21 = -2923743510588676544L;
      if (w != null && self != null && self.IilliliilIIi() != null && p != null) {
         class_1937 var5 = self.IilliliilIIi();
         class_2338 var6 = w.liiiIIllIl();
         var17 ^= ((long)var5.method_8320(var6).method_27852(class_2246.field_23152) << 32 ^ var17) & -1L << 32;
         if ((int)(var17 >>> 32) == 0 && !self.IlIlllIlilIl(var6)) {
            return null;
         } else {
            class_2338 var8 = class_2338.method_49637(w.IliIlllilIi().field_1352, w.IliIlllilIi().field_1351 + 0.01, w.IliIlllilIi().field_1350);
            if (!iIiIilIliIil.iIlIlllllill(var5, var8)) {
               return null;
            } else {
               class_243 var9 = p.liiiIIllIl();
               illIlIiIilIlIi var10 = t == null ? null : t.IiIlliIliiIl();
               if (var10 != null && (int)(var17 >>> 32) != 0) {
                  liIIiIlliiIIiIll var11 = var10.IliIlllilIi();
                  if (iliIiiliiiii(var6, w.IliIlllilIi(), var11.IliIlllilIi(), var11.liiiIIllIl(), var11.iIlIlllllill(), var10.liiiIIllIl())) {
                     return null;
                  }
               }

               if (var10 != null && (int)(var17 >>> 32) == 0) {
                  liIIiIlliiIIiIll var23 = var10.IliIlllilIi();
                  class_238 var12 = IliIlIIllliIlIIl.Iiilliiliiil(var23.IliIlllilIi(), var23.liiiIIllIl(), var23.iIlIlllllill(), 0.2);
                  var17 ^= ((long)lllIliIlillIliIl.lIiiIiIlilli(var6).method_994(var12) ^ var17) & -1L >>> 32;
                  if (var10.liiiIIllIl()) {
                     var19 ^= ((long)((int)Math.floor(var23.liiiIIllIl() + 1.0E-6)) << 32 ^ var19) & -1L << 32;
                     class_2338 var15 = class_2338.method_49637(var23.IliIlllilIi(), (double)((int)(var19 >>> 32)) + 0.01, var23.iIlIlllllill());
                     var19 ^= ((long)IIIllIIliIIl(w.IliIlllilIi().field_1351, (int)(var19 >>> 32)) ^ var19) & -1L >>> 32;
                     if ((int)var19 == 0) {
                        return null;
                     }

                     if ((int)var17 != 0 || !IlIlllIlilIl(var6, var15)) {
                        return this.iIlIlllllill(
                           w,
                           self,
                           var15,
                           new class_243(var23.IliIlllilIi(), var23.liiiIIllIl(), var23.iIlIlllllill()),
                           var12,
                           var10.lIiiIiIlilli(),
                           (int)var19,
                           var9,
                           p.iliIiiliiiii()
                        );
                     }
                  } else if ((int)var17 != 0) {
                     return null;
                  }
               }

               var21 ^= ((long)lIiiIiIlilli(var9, p.iliIiiliiiii(), w.IliIlllilIi()) << 32 ^ var21) & -1L << 32;
               return (int)(var21 >>> 32) == w.iliIiiliiiii()
                  ? w
                  : new iiIIllilIIlIllil(w.IliIlllilIi(), w.liiiIIllIl(), w.iIlIlllllill(), w.IilliliilIIi(), w.lIiiIiIlilli(), (boolean)((int)(var21 >>> 32)));
            }
         }
      } else {
         return null;
      }
   }
}
