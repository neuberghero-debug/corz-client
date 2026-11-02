package gg.corz;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_4969;
import net.minecraft.class_638;
import net.minecraft.class_746;
import net.minecraft.class_2338.class_2339;

public final class iliIliilIiiIliil {
   public static final int lIliiIilil = 300;
   public static final float lIlIIlilil = 0.95F;
   public static final double IiliiIilil = 6.0;
   private long lIIlIlilil;
   public static final float ilIIIlilil = 0.5F;
   public static final int liiiiIilil = -1;
   private final Map<Long, IliIiiIilliIiiIi> IilIIlilil = new HashMap<>();
   private int IlIlIlilil;
   private final Map<Long, Long> iilIIlilil;
   public static final int iiIiiIilil = 2;
   public static final int ilIiiIilil = 3;
   public static final float iIiiiIilil = 0.05F;
   public static final double lliiiIilil = 0.28;
   public static final int iiiiiIilil = 99;
   public static final float lIiiiIilil = 5.0F;
   public static final float lIIIIlilil = 0.8F;
   public static final int IIliiIilil = 4;
   static final int lllIIlilil = 4;
   private final Map<Long, Long> lilIIlilil = new HashMap<>();
   private final Map<Integer, liilIIiliiilIIil> lIiIIlilil;
   public static final double IiiiiIilil = 1.62;
   public static final double iliiiIilil = 8.0;
   public static final int liIiiIilil = 2;
   private long IIIlIlilil;
   public static final int IIlIIlilil = 3;
   public static final int IIIiiIilil = 10;
   public static final double IliiiIilil = 4.5;
   private class_1937 iIIlIlilil;
   private List<IIIilIIiiIIi> iliIIlilil;
   private class_2338 iiiIIlilil;
   private IIIilIIiiIIi IiiIIlilil;
   public static final float IIIIIlilil = 0.9F;
   public static final double illiiIilil = 5.5;
   public static final double IIiiiIilil = 1.5;
   private final Map<Integer, Long> IIiIIlilil;
   public static final int IiIiiIilil = 200;
   public static final int IlliiIilil = 4;
   private int lliIIlilil;
   public static final int iiIIIlilil = 2;
   public static final double IiIIIlilil = 0.5;
   public static final float iIIIIlilil = 0.6F;
   public static final double llliiIilil = 0.3;
   public static final float IlIIIlilil = 0.5F;
   public static final float llIIIlilil = 0.1F;
   public static final double liiliIilil = 8.0;
   static final int IllIIlilil = 3;
   public static final int liliiIilil = 3;
   static final int iIlIIlilil = 32;
   public static final int llIiiIilil = -3;
   private final ArrayDeque<IIIiiIllIIiiIl> iIiIIlilil;
   public static final int liIIIlilil = 8;
   private long liiIIlilil;
   public static final int iIliiIilil = 3;
   public static final double iiiliIilil = 12.0;
   private final StringBuilder IliIIlilil;
   private final IilIllililIlli illIIlilil;
   public static final int lIIiiIilil = 2;
   public static final int iiliiIilil = 3;
   public static final int IlIiiIilil = 6;
   public static final int iIIiiIilil = 200;

   void llIIlilIIl(long tick, List<liiilIiliiiilIil> enemies) {
      this.liiIIlilil = Math.max(this.liiIIlilil, tick);

      for (liilIIiliiilIIil var5 : this.lIiIIlilil.values()) {
         var5.liIillIIil = false;
      }

      if (enemies != null) {
         for (liiilIiliiiilIil var8 : enemies) {
            if (var8 != null) {
               liilIIiliiilIIil var6 = this.lIiIIlilil.computeIfAbsent(var8.iIlIlllllill(), liilIIiliiilIIil::new);
               var6.liIillIIil = true;
               var6.lIlillIIil = tick;
               var6.llIillIIil = illilIilil(var8);
               var6.ilIillIIil = var8.IIiilIiiiIii() == null ? iIIiIIliIlIiIIli.lIliilIlIi : var8.IIiilIiiiIii();
               var6.IiIillIIil = var8.Iliilliiilii() == null ? iIIiIIliIlIiIIli.lIliilIlIi : var8.Iliilliiilii();
               if (lIliliIlil(var6.ilIillIIil) || lIliliIlil(var6.IiIillIIil)) {
                  var6.iiIillIIil = tick;
               }
            }
         }
      }

      this.lIiIIlilil.values().removeIf(f -> !f.liIillIIil && !iiIilIIlil(tick, f.lIlillIIil, 600));
      this.IIiIIlilil.values().removeIf(tickx -> tick - tickx > 12L);
   }

   private static class_243 illilIilil(liiilIiliiiilIil e) {
      if (e.IiIlliIliiIl() != null) {
         return e.IiIlliIliiIl();
      } else {
         class_243 var1 = e.IIIllIIliIIl() != null ? e.IIIllIIliIIl() : e.iliIiiliiiii();
         return var1 == null ? null : var1.method_1031(0.0, 1.62, 0.0);
      }
   }

   private lIIiIiiiIIiIii lllllillll(IliIiiIilliIiiIi t) {
      long var10 = -1737635118853485109L;
      if (t.lllIIIIlIi != -1) {
         liilIIiliiilIIil var2 = this.lIiIIlilil.get(t.lllIIIIlIi);
         if (var2 != null && var2.liIillIIil && var2.llIillIIil != null) {
            return new lIIiIiiiIIiIii(var2.llIillIIil, Illillllil(var2));
         }
      }

      class_243 var12 = null;
      var10 ^= (0L ^ var10) & -1L << 32;
      double var4 = Double.MAX_VALUE;

      for (liilIIiliiilIIil var7 : this.lIiIIlilil.values()) {
         if (var7.liIillIIil && var7.llIillIIil != null) {
            double var8 = iIIIlIlIIl(var7.llIillIIil, t.IllIIIIlIi);
            if (var8 < var4) {
               var4 = var8;
               var12 = var7.llIillIIil;
               var10 ^= ((long)Illillllil(var7) << 32 ^ var10) & -1L << 32;
            }
         }
      }

      return new lIIiIiiiIIiIii(var12, (boolean)((int)(var10 >>> 32)));
   }

   static float IiIiliIiiiIi(float placed, int detonated, int pDet) {
      return detonated < 3 ? placed : Math.max(placed, Math.min(0.95F, (float)pDet / (float)detonated));
   }

   public void Illlllllilll() {
      this.IilIIlilil.clear();
      this.lilIIlilil.clear();
      this.iilIIlilil.clear();
      this.IIiIIlilil.clear();
      this.lIiIIlilil.clear();
      this.iIiIIlilil.clear();
      this.IliIIlilil.setLength(0);
      this.lliIIlilil = 0;
      this.iliIIlilil = List.of();
      this.IiiIIlilil = IIIilIIiiIIi.IIIllllIIlll;
      this.liiIIlilil = Long.MIN_VALUE;
      this.iiiIIlilil = null;
      this.IIIlIlilil = Long.MIN_VALUE;
      this.lIIlIlilil = Long.MIN_VALUE;
      this.iIIlIlilil = null;
      this.IlIlIlilil = 0;
   }

   public int IIlllIlliIll() {
      long var4 = -2415451225219435684L;
      var4 ^= (0L ^ var4) & -1L << 32;

      for (IliIiiIilliIiiIi var3 : this.IilIIlilil.values()) {
         if (!var3.IIiIIIIlIi) {
            var4 += 4294967296L;
         }
      }

      return (int)(var4 >>> 32);
   }

   private static float ilillIiill(class_243 difficulty, class_243 centre, int feet) {
      float var3 = (float)liiIIliliiiIIlil.IliIlllilIi(difficulty.method_1022(centre), 1.0, 5.0);
      return iiIiiliIIliili.IliIlllilIi(var3, feet);
   }

   private void iIiIlIliIl(class_2338 cell, int tick, long ownMark, long charges, boolean fromEvent, long placedTick) {
      IliIiiIilliIiiIi var10 = new IliIiiIilliIiiIi(cell, tick, charges);
      var10.iilIIIIlIi = charges;
      if (tick > 0 && fromEvent) {
         var10.lilIIIIlIi = ownMark;
      }

      this.IilIIlilil.put(cell.method_10063(), var10);
      if (placedTick != Long.MIN_VALUE) {
         var10.iIiIIIIlIi = true;
         var10.lliIIIIlIi = placedTick;
      } else {
         var10.lllIIIIlIi = Iliilliiilii(cell, ownMark, this.iiiIlIIIll());
         this.IlIlIlilil++;
         if (var10.lllIIIIlIi != -1) {
            liilIIiliiilIIil var11 = this.lIiIIlilil.computeIfAbsent(var10.lllIIIIlIi, liilIIiliiilIIil::new);
            var11.IIlillIIil = ownMark;
            if (fromEvent) {
               var11.IllillIIil++;
               var10.IliIIIIlIi = true;
            }
         }

         this.Ilillllill(liIIiiiIIi<"liIIiiiIIi","gEfHAxLbk5n39DOKt50kEg/tLbiY7Q97kRQYBHTo9UEU">(), cell, "");
      }
   }

   public boolean IlIlllIlilIl(int enemyId) {
      liilIIiliiilIIil var2 = this.lIiIIlilil.get(enemyId);
      return var2 == null ? false : iiIilIIlil(this.liiIIlilil, var2.iiIillIIil, 300) || iiIilIIlil(this.liiIIlilil, var2.IIlillIIil, 300);
   }

   private void lliIliliIl(IliIiiIilliIiiIi t) {
      if (t.IliIIIIlIi && !t.iIiIIIIlIi && t.lllIIIIlIi != -1) {
         liilIIiliiilIIil var2 = this.lIiIIlilil.get(t.lllIIIIlIi);
         if (var2 != null) {
            long var3 = t.lIiIIIIlIi - t.IilIIIIlIi;
            if (var3 >= 1L && var3 <= 8L) {
               var2.iIlillIIil = IIlilIliiIli(var2.iIlillIIil, var3);
               var2.lllillIIil++;
            }
         }
      }
   }

   private void lIIlliIIll(class_2338 state, class_2680 pos, long tick) {
      long var7 = 8618361731047229681L;
      if (state != null && pos != null) {
         this.lIIlIlilil = tick;
         var7 ^= (-4294967296L ^ var7) & -1L << 32;
         IIllIlIilIllIlIi var5;
         if (pos.method_27852(class_2246.field_23152)) {
            var5 = IIllIlIilIllIlIi.IlllIIIIIi;
            var7 ^= ((long)((Integer)pos.method_11654(class_4969.field_23153)).intValue() << 32 ^ var7) & -1L << 32;
         } else if (pos.method_27852(class_2246.field_10171)) {
            var5 = IIllIlIilIllIlIi.llllIIIIIi;
         } else if (pos.method_27852(class_2246.field_10540) || pos.method_27852(class_2246.field_22423)) {
            var5 = IIllIlIilIllIlIi.illlIIIIIi;
         } else if (pos.method_26215()) {
            var5 = IIllIlIilIllIlIi.IillIIIIIi;
         } else {
            var5 = IIllIlIilIllIlIi.lillIIIIIi;
         }

         this.IiIIlliIIl(state, var5, (int)(var7 >>> 32), tick);
      }
   }

   private static boolean lIliliIlil(iIIiIIliIlIiIIli h) {
      return h == iIIiIIliIlIiIIli.liililIlIi || h == iIIiIIliIlIiIIli.iiililIlIi;
   }

   private static String lililiilil(float v) {
      return !Float.isFinite(v)
         ? liIIiiiIIi<"liIIiiiIIi","EkjHI2ZFdMsqTg4QHW6K41GpgDy+ue5UC1Ge6/Q=">()
         : String.format(Locale.ROOT, liIIiiiIIi<"liIIiiiIIi","evnjy6K2q1NsOc2JPWZfrVxbJdwr5RYOMoMzTz+XR0E=">(), v);
   }

   public int IiIlliIliiIl() {
      return this.IlIlIlilil;
   }

   private void iilllIIill(class_2338 cell) {
      ArrayList var2 = new ArrayList(this.iliIIlilil.size());

      for (IIIilIIiiIIi var4 : this.iliIIlilil) {
         if (!cell.equals(var4.lIiiIiIlilli())) {
            var2.add(var4);
         }
      }

      this.iliIIlilil = List.copyOf(var2);
      this.IiiIIlilil = this.iliIIlilil.isEmpty() ? IIIilIIiiIIi.IIIllllIIlll : this.iliIIlilil.get(0);
   }

   private void iIlllIllll(class_746 player, lliiilIiiliiilIi targetReadyIn, liiilIiliiiilIil tick, int self, int selfClosedFor, long target) {
      long var36 = 2683005052501507126L;
      long var38 = -2269787236964176482L;
      long var40 = 1179868790599776436L;
      long var42 = -7326117382689774365L;
      long var44 = 4308521946321592267L;
      class_243 var8 = targetReadyIn.liiiIIllIl();
      class_238 var9 = targetReadyIn.IilliliilIIi();
      iiIllIlIIlllIl var10 = targetReadyIn.IiIlliIliiIl() == null ? iiIllIlIIlllIl.lliIilIlliliIilIll : targetReadyIn.IiIlliIliiIl();
      IilIlIIllilIlIIl var11 = new IilIlIIllilIlIIl(Math.max(0, selfClosedFor), targetReadyIn.iIIIlIlIIl());
      ArrayList var12 = new ArrayList();

      for (IliIiiIilliIiiIi var14 : this.IilIIlilil.values()) {
         if (!var14.IIiIIIIlIi && !IIIillIIil(var14, target) && !(class_243.method_24953(var14.IllIIIIlIi).method_1022(var8) > 8.5)) {
            var12.add(var14);
         }
      }

      if (var12.isEmpty()) {
         this.lIilliIill();
      } else {
         var12.sort(Comparator.comparingDouble(feet -> class_243.method_24953(feet.IllIIIIlIi).method_1025(var8)));
         class_243 var46 = tick == null ? null : (tick.IIIllIIliIIl() != null ? tick.IIIllIIliIIl() : tick.iliIiiliiiii());
         var36 ^= ((long)(tick == null ? Integer.MIN_VALUE : tick.iIlIlllllill()) << 32 ^ var36) & -1L << 32;
         iiIllIlIIlllIl var15 = tick != null && tick.IlIillIiilIi() != null ? tick.IlIillIiilIi() : iiIllIlIIlllIl.lliIilIlliliIilIll;
         IilIlIIllilIlIIl var16 = tick == null ? IilIlIIllilIlIIl.IIIIlillIl : new IilIlIIllilIlIIl(Math.max(0, self), tick.llIIlilIIl());
         ArrayList var17 = new ArrayList(3);
         var36 ^= (0L ^ var36) & -1L >>> 32;

         for (IliIiiIilliIiiIi var20 : var12) {
            int var10000 = (int)var36;
            var36 ^= (var36 ^ var36 + (long)1) & -1L >>> 32;
            if (var10000 >= 3) {
               break;
            }

            class_243 var21 = class_243.method_24953(var20.IllIIIIlIi);
            lIIiIiiiIIiIii var22 = this.lllllillll(var20);
            long var50 = var38 ^ ((long)(var20.illIIIIlIi >= 1 ? 1 : 0) << 32 ^ var38) & -1L << 32;
            var38 = var50
               ^ (
                     (long)(
                           var22.IIliIIiIIl == null
                              ? 99
                              : Iiilliiliiil((boolean)((int)(var50 >>> 32)), iIIIlIlIIl(var22.IIliIIiIIl, var20.IllIIIIlIi), var22.lIliIIiIIl)
                        )
                        ^ var50
                  )
                  & -1L >>> 32;
            long var51 = var40 ^ ((long)(var20.lllIIIIlIi != -1 ? 1 : 0) << 32 ^ var40) & -1L << 32;
            liilIIiliiilIIil var26 = (int)(var51 >>> 32) != 0 ? this.lIiIIlilil.get(var20.lllIIIIlIi) : null;
            var40 = var51
               ^ (
                     (long)(
                           (int)(var51 >>> 32) == 0
                                 || var26 != null && var26.liIillIIil && var26.llIillIIil != null && !(var26.llIillIIil.method_1022(var21) > 8.0)
                              ? 0
                              : 1
                        )
                        ^ var51
                  )
                  & -1L >>> 32;
            var42 ^= ((long)(var22.IIliIIiIIl != null && iIIIlIlIIl(var22.IIliIIiIIl, var20.IllIIIIlIi) <= 4.5 ? 1 : 0) << 32 ^ var42) & -1L << 32;
            float var29 = IIIilIIiiIIi(
               (boolean)((int)(var38 >>> 32)), (boolean)((int)(var42 >>> 32)), var22.lIliIIiIIl, (boolean)((int)(var40 >>> 32)), (boolean)((int)var40)
            );
            if (var26 != null && var26.liIillIIil) {
               var38 ^= (
                     (long)IlIillIiilIi(
                           (int)var38,
                           (boolean)((int)(var38 >>> 32)),
                           (boolean)((int)(var42 >>> 32)),
                           var26.lllillIIil,
                           var26.iIlillIIil,
                           target - var20.IilIIIIlIi
                        )
                        ^ var38
                  )
                  & -1L >>> 32;
               if ((int)var40 == 0) {
                  var29 = IiIiliIiiiIi(var29, var26.IllillIIil, var26.lllillIIil);
               }
            }

            if (this.Iillllilll(var20, var8, var46, (int)(var36 >>> 32), target)) {
               if (this.illIIlilil != null && !this.illIIlilil.liiiIIllIl(45, 3)) {
                  var20.IiiIIIIlIi = true;
               } else {
                  var20.iIIlIIIlIi = lllIliIlillIliIl.IlIllllIll(player, var21, var8, var9, null, var20.IllIIIIlIi, 5.0F);
                  var20.iiiIIIIlIi = var8;
                  var20.liiIIIIlIi = target;
                  var20.IiiIIIIlIi = false;
                  if (tick == null || tick.lIiiIiIlilli() == null) {
                     var20.IlIlIIIlIi = Float.NaN;
                     var20.llIlIIIlIi = Float.NaN;
                     var20.IIIlIIIlIi = null;
                     var20.lIIlIIIlIi = (int)(var36 >>> 32);
                  } else if (this.illIIlilil != null && !this.illIIlilil.liiiIIllIl(45, 3)) {
                     var20.IiiIIIIlIi = true;
                  } else {
                     var42 ^= ((long)Math.max(1, Math.min(8, (int)var38)) ^ var42) & -1L >>> 32;
                     iIIlIIiIlIlIIi var31 = lllIliIlillIliIl.iIIilIlIil(tick.lIiiIiIlilli(), (int)var42, false, true);
                     var20.IlIlIIIlIi = IiliiIililiiIi.IliIlllilIi(tick.lIiiIiIlilli(), var31, var20.IllIIIIlIi, null);
                     var20.llIlIIIlIi = lllIliIlillIliIl.ilIllIiIll(tick.lIiiIiIlilli(), var31.IliIlllilIi().method_1022(var21), 5.0F);
                     var20.IIIlIIIlIi = var46;
                     var20.lIIlIIIlIi = (int)(var36 >>> 32);
                  }
               }
            }

            float var30 = Float.isNaN(var20.iIIlIIIlIi) ? ilillIiill(var8, var21, var10.lIiiIiIlilli()) : var20.iIIlIIIlIi;
            float var47 = iiIiiliIIliili.lIiiIiIlilli(var30, var10);
            float var32 = iiIiiliIIliili.IIIllIIliIIl(var30, var10, var11, (int)var38);
            long var52 = var44
               ^ ((long)(tick != null && var20.lIIlIIIlIi == (int)(var36 >>> 32) && !Float.isNaN(var20.IlIlIIIlIi) ? 1 : 0) << 32 ^ var44) & -1L << 32;
            float var34 = (int)(var52 >>> 32) != 0 ? iiIiiliIIliili.IIIllIIliIIl(var20.IlIlIIIlIi, var15, var16, (int)var38) : 0.0F;
            var44 = var52
               ^ ((long)((int)(var52 >>> 32) != 0 && var20.llIlIIIlIi > 0.0F && var20.IlIlIIIlIi < 0.5F * var20.llIlIIIlIi ? 1 : 0) ^ var52) & -1L >>> 32;
            var17.add(
               new IIIilIIiiIIi(
                  var20.IllIIIIlIi,
                  var20.illIIIIlIi,
                  var30,
                  var47,
                  var32,
                  var34,
                  (int)var38,
                  var29,
                  var20.lllIIIIlIi,
                  (boolean)((int)var44),
                  this.IIIllIIliIIl(var20.lllIIIIlIi)
               )
            );
         }

         var17.sort(
            Comparator.<IIIilIIiiIIi>comparingDouble(a -> (double)a.liiiIIllIl())
               .reversed()
               .thenComparing(Comparator.<IIIilIIiiIIi>comparingDouble(a -> (double)a.IiIlliIliiIl()).reversed())
         );
         this.iliIIlilil = List.copyOf(var17);
         this.IiiIIlilil = this.iliIIlilil.isEmpty() ? IIIilIIiiIIi.IIIllllIIlll : this.iliIIlilil.get(0);
      }
   }

   static float IIIilIIiiIIi(boolean ownerInReach, boolean ownerKnown, boolean ownerAway, boolean ownerHoldsGlowstone, boolean charged) {
      if (charged) {
         return 0.1F;
      } else if (!ownerHoldsGlowstone) {
         return 0.5F;
      } else if (ownerInReach) {
         return ownerKnown ? 0.9F : 0.6F;
      } else {
         return ownerAway ? 0.8F : 0.6F;
      }
   }

   void lIlIliIlIl(long tick) {
      long var8 = -7608962532475995077L;
      ArrayList var3 = new ArrayList(this.iIiIIlilil.size());
      ArrayList var4 = new ArrayList(this.iIiIIlilil.size());

      for (IIIiiIllIIiiIl var6 : this.iIiIIlilil) {
         var3.add(var6.IliIlllilIi());
         var4.add(var6.liiiIIllIl());
      }

      Iterator var10 = this.IilIIlilil.entrySet().iterator();

      while (var10.hasNext()) {
         IliIiiIilliIiiIi var11 = (IliIiiIilliIiiIi)((Entry)var10.next()).getValue();
         if (var11.IIiIIIIlIi) {
            var8 ^= ((long)(var11.illIIIIlIi >= 1 && Iiiiliiiiiii(var11.IllIIIIlIi, var11.lIiIIIIlIi, var3, var4) ? 1 : 0) << 32 ^ var8) & -1L << 32;
            if ((int)(var8 >>> 32) != 0 || tick > var11.lIiIIIIlIi) {
               if ((int)(var8 >>> 32) != 0) {
                  this.lliIliliIl(var11);
               }

               this.Ilillllill(
                  liIIiiiIIi<"liIIiiiIIi","ICYbNE+mqYNmHbFMn2okTLNxLtTaSu+AuaHthPwo6CaH">(),
                  var11.IllIIIIlIi,
                  (int)(var8 >>> 32) != 0
                     ? liIIiiiIIi<"liIIiiiIIi","ykgpqX/XgOoM54cMu3ECG52/hSBwgQHA0VrUwbWD">()
                     : liIIiiiIIi<"liIIiiiIIi","BKON0XBimTfyUNgSl1rEOoYCyIrgaIMLx7FVFxpn">()
               );
               var10.remove();
            }
         }
      }

      this.iIiIIlilil.removeIf(b -> tick - b.liiiIIllIl() > 3L);
   }

   boolean IllIllllIl(class_2338 cell) {
      IliIiiIilliIiiIi var2 = cell == null ? null : this.IilIIlilil.get(cell.method_10063());
      return var2 != null && !var2.IIiIIIIlIi;
   }

   private void liIlliiIll(class_1937 world, long tick) {
      long var9 = -3178572931976750616L;
      Iterator var4 = this.IilIIlilil.entrySet().iterator();

      while (var4.hasNext()) {
         IliIiiIilliIiiIi var5 = (IliIiiIilliIiiIi)((Entry)var4.next()).getValue();
         if (!var5.IIiIIIIlIi) {
            if (this.iiiIIlilil != null && class_243.method_24953(var5.IllIIIIlIi).method_1022(class_243.method_24953(this.iiiIIlilil)) > 12.0) {
               var4.remove();
            } else {
               class_2680 var6 = world.method_8320(var5.IllIIIIlIi);
               if (!var6.method_27852(class_2246.field_23152)) {
                  var5.IIiIIIIlIi = true;
                  var5.lIiIIIIlIi = tick;

                  for (IliIiiIilliIiiIi var8 : this.IilIIlilil.values()) {
                     var8.IiiIIIIlIi = true;
                  }
               } else {
                  var9 ^= ((long)((Integer)var6.method_11654(class_4969.field_23153)).intValue() << 32 ^ var9) & -1L << 32;
                  if ((int)(var9 >>> 32) != var5.illIIIIlIi) {
                     if ((int)(var9 >>> 32) > var5.illIIIIlIi) {
                        var5.lilIIIIlIi = tick;
                     }

                     var5.illIIIIlIi = (int)(var9 >>> 32);
                     var5.iilIIIIlIi = tick;
                     var5.IiiIIIIlIi = true;
                     if (!IIIillIIil(var5, tick)) {
                        this.Ilillllill(
                           liIIiiiIIi<"liIIiiiIIi","CxFCAmlro1eOWNEaOjkz7/6McSXwLDW+Ke7NuVdAbJs=">(),
                           var5.IllIIIIlIi,
                           liIIiiiIIi<"liIIiiiIIi","BqfW2Qkxkj8/ZQZiw+mvMZpKmacqoj4Yr3T3sp8=">() + (int)(var9 >>> 32)
                        );
                     }
                  }
               }
            }
         }
      }
   }

   List<class_2338> lilIliilIl(class_2338 cell) {
      IliIiiIilliIiiIi var2 = cell == null ? null : this.IilIIlilil.get(cell.method_10063());
      return var2 == null ? List.of() : List.copyOf(var2.iliIIIIlIi);
   }

   int Iilililiiili(int enemyId) {
      liilIIiliiilIIil var2 = this.lIiIIlilil.get(enemyId);
      return var2 == null ? 0 : var2.IllillIIil;
   }

   private static boolean IIIillIIil(IliIiiIilliIiiIi t, long tick) {
      return t.iIiIIIIlIi && iiIilIIlil(tick, t.lliIIIIlIi, 2);
   }

   private boolean IlIllllIll(long tick) {
      return this.lIIlIlilil != Long.MIN_VALUE && tick - this.lIIlIlilil <= 200L;
   }

   private static boolean Illillllil(liilIIiliiilIIil f) {
      return f.ilIillIIil == iIIiIIliIlIiIIli.iiililIlIi || f.IiIillIIil == iIIiIIliIlIiIIli.iiililIlIi;
   }

   public String Iilllilliill() {
      IIIilIIiiIIi var1 = this.IiiIIlilil;
      if (var1 != null && var1.IliIlllilIi()) {
         StringBuilder var2 = new StringBuilder(64);
         class_2338 var3 = this.iiiIIlilil == null ? class_2338.field_10980 : this.iiiIIlilil;
         var2.append(var1.lIiiIiIlilli().method_10263() - var3.method_10263())
            .append(',')
            .append(var1.lIiiIiIlilli().method_10264() - var3.method_10264())
            .append(',')
            .append(var1.lIiiIiIlilli().method_10260() - var3.method_10260());
         var2.append(liIIiiiIIi<"liIIiiiIIi","pYDei6b6izco/uPQlMY0pCNVur+39ac5T3Qx/o+B">()).append(var1.iliIiiliiiii());
         var2.append(liIIiiiIIi<"liIIiiiIIi","lvxibrZIygKP4CKhFsj7902AOvceo5y9TW76NrSG">()).append(lililiilil(var1.IiIlliIliiIl()));
         var2.append(liIIiiiIIi<"liIIiiiIIi","xM0N0ucSdFmqNvlYtnvWw9XZp3N/9HFimV3ReOOZ">()).append(lililiilil(var1.IlIlllIlilIl()));
         var2.append(liIIiiiIIi<"liIIiiiIIi","kqhL6ljEQhYlS/GMrRT0n9v1oWvdcohSFow1Vwhv">()).append(lililiilil(var1.IIlllIlliIll()));
         var2.append(liIIiiiIIi<"liIIiiiIIi","7AxNEmwten0k5pZ8PAYg08NJCxaaGH952L5VuXLV">()).append(var1.Illlllllilll());
         var2.append(liIIiiiIIi<"liIIiiiIIi","JgxAZNMmosEpVOzaOZbNY9dzKMyPFz0V0AJq/xH/">()).append(lililiilil(var1.Iilllilliill()));
         var2.append(liIIiiiIIi<"liIIiiiIIi","pwm5/2BqWk+sVmhLm0RqSDYDGzgM9weBGUR0gfDv">()).append((char)(var1.Ililllililil() ? '1' : '0'));
         var2.append(liIIiiiIIi<"liIIiiiIIi","tXLZuhDjNeLu2adaROd7uGmmHbsv7Xrwa+hOzSec">()).append((char)(var1.Iiilliiliiil() ? '1' : '0'));
         return var2.toString();
      } else {
         return liIIiiiIIi<"liIIiiiIIi","0qXpCckboBNZMwrHnv3d2aiVYSjIBbG1kRfnJSs=">();
      }
   }

   public String IIillIiliIil() {
      String var1 = this.IliIIlilil.toString();
      this.IliIIlilil.setLength(0);
      this.lliIIlilil = 0;
      return var1;
   }

   public iliIliilIiiIliil(IilIllililIlli rays) {
      this.iilIIlilil = new HashMap<>();
      this.IIiIIlilil = new HashMap<>();
      this.lIiIIlilil = new HashMap<>();
      this.iIiIIlilil = new ArrayDeque<>();
      this.IliIIlilil = new StringBuilder();
      this.iliIIlilil = List.of();
      this.IiiIIlilil = IIIilIIiiIIi.IIIllllIIlll;
      this.liiIIlilil = Long.MIN_VALUE;
      this.IIIlIlilil = Long.MIN_VALUE;
      this.lIIlIlilil = Long.MIN_VALUE;
      this.illIIlilil = rays;
   }

   public void IliIlllilIi(IlIillIiilIi e, long tick, int selfId) {
      if (e != null) {
         this.liiIIlilil = Math.max(this.liiIIlilil, tick);
         if (e instanceof IllIliIilllIliIi var5) {
            this.lIIlliIIll(var5.IliIlllilIi(), var5.liiiIIllIl(), tick);
         } else if (e instanceof iIIlIlilIlIlIlil var6) {
            this.iiIIlIIlIl(var6.IliIlllilIi(), var6.liiiIIllIl(), tick);
         } else if (e instanceof ilIiIiIiIiIiIiIi var7 && var7.IliIlllilIi() != selfId) {
            this.IIiIIlilil.put(var7.IliIlllilIi(), tick);
         }
      }
   }

   int IIiIllIiIl(class_2338 cell) {
      IliIiiIilliIiiIi var2 = cell == null ? null : this.IilIIlilil.get(cell.method_10063());
      return var2 != null && !var2.IIiIIIIlIi ? var2.illIIIIlIi : -1;
   }

   int IIiilIiiiIii(int enemyId) {
      liilIIiliiilIIil var2 = this.lIiIIlilil.get(enemyId);
      return var2 == null ? 0 : var2.lllillIIil;
   }

   private void lIilliIill() {
      this.iliIIlilil = List.of();
      this.IiiIIlilil = IIIilIIiiIIi.IIIllllIIlll;
   }

   private void Ilillllill(String tail, class_2338 kind, String cell) {
      if (this.lliIIlilil < 32) {
         if (!this.IliIIlilil.isEmpty()) {
            this.IliIIlilil.append(' ');
         }

         this.IliIIlilil.append(tail).append(kind.method_10263()).append(',').append(kind.method_10264()).append(',').append(kind.method_10260()).append(cell);
         this.lliIIlilil++;
      }
   }

   void IiIIlliIIl(class_2338 tick, IIllIlIilIllIlIi charges, int pos, long kind) {
      long var14 = -8561955938330829527L;
      if (tick != null && charges != null) {
         this.liiIIlilil = Math.max(this.liiIIlilil, kind);
         if (this.iiiIIlilil == null || !(class_243.method_24953(tick).method_1022(class_243.method_24953(this.iiiIIlilil)) > 12.0)) {
            class_2338 var6 = tick.method_10062();
            long var7 = var6.method_10063();

            for (IliIiiIilliIiiIi var10 : this.IilIIlilil.values()) {
               var10.IiiIIIIlIi = true;
            }

            IliIiiIilliIiiIi var16 = this.IilIIlilil.get(var7);
            if (charges == IIllIlIilIllIlIi.IlllIIIIIi) {
               if (var16 != null && !var16.IIiIIIIlIi) {
                  var14 ^= ((long)Math.max(0, pos) << 32 ^ var14) & -1L << 32;
                  if ((int)(var14 >>> 32) != var16.illIIIIlIi) {
                     if ((int)(var14 >>> 32) > var16.illIIIIlIi) {
                        var16.lilIIIIlIi = kind;
                     }

                     var16.illIIIIlIi = (int)(var14 >>> 32);
                     var16.iilIIIIlIi = kind;
                     if (!IIIillIIil(var16, kind)) {
                        this.Ilillllill(
                           liIIiiiIIi<"liIIiiiIIi","CxFCAmlro1eOWNEaOjkz7/6McSXwLDW+Ke7NuVdAbJs=">(),
                           var6,
                           liIIiiiIIi<"liIIiiiIIi","BqfW2Qkxkj8/ZQZiw+mvMZpKmacqoj4Yr3T3sp8=">() + (int)(var14 >>> 32)
                        );
                     }
                  }
               } else {
                  this.iIiIlIliIl(var6, Math.max(0, pos), kind, kind, true, this.liilliiill(var7, kind));
               }
            } else if (var16 != null && !var16.IIiIIIIlIi) {
               var16.IIiIIIIlIi = true;
               var16.lIiIIIIlIi = kind;
            } else {
               if (charges == IIllIlIilIllIlIi.llllIIIIIi || charges == IIllIlIilIllIlIi.illlIIIIIi) {
                  if (llIililIil(this.iilIIlilil, var7, kind)) {
                     return;
                  }

                  for (IliIiiIilliIiiIi var11 : this.IilIIlilil.values()) {
                     if (!var11.IIiIIIIlIi && !var11.iIiIIIIlIi && IiIilliIil(var11.IllIIIIlIi, var6)) {
                        long var12 = Math.max(var11.IilIIIIlIi, Math.max(var11.lilIIIIlIi, var11.iilIIIIlIi));
                        if (kind - var12 <= 3L) {
                           if (!var11.iliIIIIlIi.contains(var6) && var11.iliIIIIlIi.size() < 4) {
                              var11.iliIIIIlIi.add(var6);
                           }

                           this.Ilillllill(
                              charges == IIllIlIilIllIlIi.llllIIIIIi
                                 ? liIIiiiIIi<"liIIiiiIIi","8IXVxICnUw7gsjv/Qw8xgPNfkTWPUq7bTtIUv/A4E12Z">()
                                 : liIIiiiIIi<"liIIiiiIIi","CxDXW3EUGdVSZ55hNyolz5qdbJOSfdpc+xhF3QZuhTR4">(),
                              var6,
                              ""
                           );
                           break;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private static boolean IiIilliIil(class_2338 a, class_2338 b) {
      return !a.equals(b)
         && Math.abs(a.method_10263() - b.method_10263()) <= 1
         && Math.abs(a.method_10264() - b.method_10264()) <= 1
         && Math.abs(a.method_10260() - b.method_10260()) <= 1;
   }

   public void IilliliilIIi(long self, lliiilIiiliiilIi selfClosedFor, List<liiilIiliiiilIil> targetReadyIn, liiilIiliiiilIil tick, int target, int enemies) {
      long var12 = -3976332039684065081L;
      this.liiIIlilil = Math.max(this.liiIIlilil, self);
      class_310 var8 = class_310.method_1551();
      class_638 var9 = var8.field_1687;
      class_746 var10 = var8.field_1724;
      if (var9 != null && var10 != null && selfClosedFor != null && selfClosedFor.liiiIIllIl() != null && selfClosedFor.IilliliilIIi() != null) {
         if (var9 != this.iIIlIlilil) {
            this.Illlllllilll();
            this.iIIlIlilil = var9;
            this.liiIIlilil = self;
         }

         this.iiiIIlilil = class_2338.method_49638(selfClosedFor.liiiIIllIl());
         this.llIIlilIIl(self, targetReadyIn);
         this.ilIllIiIll(self);
         this.liIlliiIll(var9, self);
         var12 ^= ((long)(this.IlIllllIll(self) ? 10 : 2) << 32 ^ var12) & -1L << 32;
         if (this.IIIlIlilil == Long.MIN_VALUE || self - this.IIIlIlilil >= (long)((int)(var12 >>> 32)) || self < this.IIIlIlilil) {
            this.IIllllIlll(var9, self);
         }

         this.lIlIliIlIl(self);
         if (class_1937.field_25180.equals(var9.method_27983())) {
            this.lIilliIill();
         } else {
            this.iIlllIllll(var10, selfClosedFor, tick, target, enemies, self);
         }
      } else {
         this.lIilliIill();
      }
   }

   public IIIilIIiiIIi lIiiIiIlilli() {
      return this.IiiIIlilil;
   }

   private void IIllllIlll(class_1937 world, long tick) {
      long var16 = -9187104542470335722L;
      long var18 = -3716819950288746608L;
      long var4 = this.IIIlIlilil;
      this.IIIlIlilil = tick;
      if (this.iiiIIlilil != null) {
         class_2339 var6 = new class_2339();
         var16 ^= (-12884901888L ^ var16) & -1L << 32;

         while ((int)(var16 >>> 32) <= 3) {
            for (var16 ^= (-6L ^ var16) & -1L >>> 32; (int)var16 <= 6; var16 ^= (var16 ^ var16 + (long)1) & -1L >>> 32) {
               for (var18 ^= (-25769803776L ^ var18) & -1L << 32; (int)(var18 >>> 32) <= 6; var18 += 4294967296L) {
                  var6.method_10103(
                     this.iiiIIlilil.method_10263() + (int)var16,
                     this.iiiIIlilil.method_10264() + (int)(var16 >>> 32),
                     this.iiiIIlilil.method_10260() + (int)(var18 >>> 32)
                  );
                  class_2680 var10 = world.method_8320(var6);
                  if (var10.method_27852(class_2246.field_23152)) {
                     long var11 = var6.method_10063();
                     IliIiiIilliIiiIi var13 = this.IilIIlilil.get(var11);
                     if (var13 == null || var13.IIiIIIIlIi) {
                        if (var13 != null) {
                           this.IilIIlilil.remove(var11);
                        }

                        long var14 = var4 != Long.MIN_VALUE && var4 < tick ? var4 + 1L : tick - 4L - 1L;
                        this.iIiIlIliIl(
                           var6.method_10062(), (Integer)var10.method_11654(class_4969.field_23153), tick, var14, false, this.liilliiill(var11, tick)
                        );
                     }
                  }
               }
            }

            var16 += 4294967296L;
         }
      }
   }

   static int Iiilliiliiil(boolean eyeToBox, double holdsGlowstone, boolean charged) {
      if (!Double.isNaN(holdsGlowstone) && !Double.isInfinite(holdsGlowstone)) {
         long var4 = holdsGlowstone <= 4.5 ? 0L : (long)Math.ceil((holdsGlowstone - 4.5) / 0.28);
         long var6 = (eyeToBox ? 1L : 2L + (charged ? 0L : 1L)) + var4;
         return (int)Math.min(99L, var6);
      } else {
         return 99;
      }
   }

   public void liiiIIllIl(class_2338 cell, long tick) {
      if (cell != null) {
         long var4 = cell.method_10063();
         this.lilIIlilil.put(var4, tick + 200L);
         IliIiiIilliIiiIi var6 = this.IilIIlilil.get(var4);
         if (var6 != null && !var6.IIiIIIIlIi) {
            if (!var6.iIiIIIIlIi && tick >= var6.IilIIIIlIi && tick - var6.IilIIIIlIi <= 2L) {
               this.IiiIlliiIl(var6);
               var6.lllIIIIlIi = -1;
               if (this.IlIlIlilil > 0) {
                  this.IlIlIlilil--;
               }
            }

            var6.iIiIIIIlIi = true;
            var6.lliIIIIlIi = tick;
         }

         this.iilllIIill(cell);
      }
   }

   private void ilIllIiIll(long tick) {
      this.lilIIlilil.values().removeIf(until -> until < tick);
      this.iilIIlilil.values().removeIf(until -> until < tick);
   }

   boolean iIIilIlIil(class_2338 cell) {
      IliIiiIilliIiiIi var2 = cell == null ? null : this.IilIIlilil.get(cell.method_10063());
      return var2 != null && !var2.IIiIIIIlIi && var2.iIiIIIIlIi;
   }

   private void IiiIlliiIl(IliIiiIilliIiiIi t) {
      if (t.IliIIIIlIi) {
         t.IliIIIIlIi = false;
         liilIIiliiilIIil var2 = t.lllIIIIlIi == -1 ? null : this.lIiIIlilil.get(t.lllIIIIlIi);
         if (var2 != null && var2.IllillIIil > 0) {
            var2.IllillIIil--;
         }
      }
   }

   public void iIlIlllllill(class_2338 cell, long tick) {
      if (cell != null) {
         class_2338 var4 = cell.method_10062();
         this.iilIIlilil.put(var4.method_10063(), tick + 200L);

         for (IliIiiIilliIiiIi var6 : this.IilIIlilil.values()) {
            var6.iliIIIIlIi.remove(var4);
         }
      }
   }

   public boolean IIIllIIliIIl(int enemyId) {
      if (enemyId == -1) {
         return false;
      } else {
         for (IliIiiIilliIiiIi var3 : this.IilIIlilil.values()) {
            if (!var3.IIiIIIIlIi
               && var3.lllIIIIlIi == enemyId
               && !IIIillIIil(var3, this.liiIIlilil)
               && (iiIilIIlil(this.liiIIlilil, var3.IilIIIIlIi, 4) || iiIilIIlil(this.liiIIlilil, var3.lilIIIIlIi, 4))) {
               return true;
            }
         }

         liilIIiliiilIIil var5 = this.lIiIIlilil.get(enemyId);
         if (var5 != null
            && var5.liIillIIil
            && var5.llIillIIil != null
            && (var5.ilIillIIil == iIIiIIliIlIiIIli.liililIlIi || var5.ilIillIIil == iIIiIIliIlIiIIli.iiililIlIi)) {
            for (IliIiiIilliIiiIi var4 : this.IilIIlilil.values()) {
               if (!var4.IIiIIIIlIi && (var4.illIIIIlIi == 0 || var4.lllIIIIlIi == -1) && iIIIlIlIIl(var5.llIillIIil, var4.IllIIIIlIi) <= 4.5) {
                  return true;
               }
            }

            return false;
         } else {
            return false;
         }
      }
   }

   private long liilliiill(long tick, long key) {
      Long var5 = this.lilIIlilil.get(tick);
      return var5 != null && var5 >= key ? var5 - 200L : Long.MIN_VALUE;
   }

   static boolean Iiiiliiiiiii(class_2338 boomCenters, long removedTick, List<class_243> cell, List<Long> boomTicks) {
      long var10 = -6457205831858836843L;
      if (boomCenters != null && cell != null && boomTicks != null) {
         class_243 var5 = class_243.method_24953(boomCenters);

         for (long var12 = var10 ^ (0L ^ var10) & -1L << 32; (int)(var12 >>> 32) < cell.size() && (int)(var12 >>> 32) < boomTicks.size(); var12 += 4294967296L) {
            class_243 var7 = (class_243)cell.get((int)(var12 >>> 32));
            long var8 = (Long)boomTicks.get((int)(var12 >>> 32));
            if (var7 != null && Math.abs(var8 - removedTick) <= 1L && var7.method_1022(var5) <= 1.5) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public List<IIIilIIiiIIi> iliIiiliiiii() {
      return this.iliIIlilil;
   }

   void iiIIlIIlIl(class_243 center, float radius, long tick) {
      if (center != null && IIIIllIIIl(radius)) {
         this.iIiIIlilil.addLast(new IIIiiIllIIiiIl(center, tick));

         while (this.iIiIIlilil.size() > 16) {
            this.iIiIIlilil.removeFirst();
         }
      }
   }

   static int Iliilliiilii(class_2338 tick, long cands, List<llIiliIiilIiliIi> cell) {
      long var15 = 2411947191726365970L;
      if (tick != null && cell != null) {
         class_243 var4 = class_243.method_24953(tick);
         var15 ^= (-4294967296L ^ var15) & -1L << 32;
         double var6 = Double.MAX_VALUE;
         var15 ^= ~var15 & -1L >>> 32;
         double var9 = Double.MAX_VALUE;

         for (llIiliIiilIiliIi var12 : cell) {
            if (var12 != null && var12.liiiIIllIl() != null) {
               double var13 = var12.liiiIIllIl().method_1022(var4);
               if (var12.iIlIlllllill() != Long.MIN_VALUE
                  && cands >= var12.iIlIlllllill()
                  && cands - var12.iIlIlllllill() <= 3L
                  && var13 <= 5.5
                  && var13 < var6) {
                  var6 = var13;
                  var15 ^= ((long)var12.IliIlllilIi() << 32 ^ var15) & -1L << 32;
               }

               if (var13 <= 6.0 && var13 < var9) {
                  var9 = var13;
                  var15 ^= ((long)var12.IliIlllilIi() ^ var15) & -1L >>> 32;
               }
            }
         }

         return (int)(var15 >>> 32) != -1 ? (int)(var15 >>> 32) : (int)var15;
      } else {
         return -1;
      }
   }

   static double IIlilIliiIli(double detLag, long lag) {
      return Double.isNaN(detLag) ? (double)lag : detLag + 0.5 * ((double)lag - detLag);
   }

   float Ililllililil(class_2338 cell) {
      if (cell == null) {
         return Float.NaN;
      } else {
         IliIiiIilliIiiIi var2 = this.IilIIlilil.get(cell.method_10063());
         return var2 != null && !var2.IIiIIIIlIi ? var2.IlIlIIIlIi : Float.NaN;
      }
   }

   static boolean IIIIllIIIl(float radius) {
      return Math.abs(radius - 5.0F) <= 0.05F;
   }

   private static boolean llIililIil(Map<Long, Long> own, long key, long tick) {
      Long var5 = (Long)own.get(key);
      return var5 != null && var5 >= tick;
   }

   double Illillliilli(int enemyId) {
      liilIIiliiilIIil var2 = this.lIiIIlilil.get(enemyId);
      return var2 == null ? Double.NaN : var2.iIlillIIil;
   }

   private List<llIiliIiilIiliIi> iiiIlIIIll() {
      ArrayList var1 = new ArrayList(this.lIiIIlilil.size());

      for (liilIIiliiilIIil var3 : this.lIiIIlilil.values()) {
         if (var3.liIillIIil && var3.llIillIIil != null) {
            Long var4 = this.IIiIIlilil.get(var3.IlIillIIil);
            var1.add(new llIiliIiilIiliIi(var3.IlIillIIil, var3.llIillIIil, var4 == null ? Long.MIN_VALUE : var4));
         }
      }

      return var1;
   }

   int illIlIilIl(class_2338 cell) {
      IliIiiIilliIiiIi var2 = cell == null ? null : this.IilIIlilil.get(cell.method_10063());
      return var2 == null ? -1 : var2.lllIIIIlIi;
   }

   static int IlIillIiilIi(int detLag, boolean detonated, boolean charged, int eta, double age, long inReach) {
      long var9 = 5297702076926365884L;
      if (!detonated && charged && eta >= 2 && Double.isFinite(age)) {
         var9 ^= ((long)((int)Math.round(age) - (int)Math.min(99L, Math.max(0L, inReach))) << 32 ^ var9) & -1L << 32;
         return Math.min(detLag, Math.max(1, (int)(var9 >>> 32)));
      } else {
         return detLag;
      }
   }

   private static boolean iiIilIIlil(long tick, long at, int window) {
      return at != Long.MIN_VALUE && tick != Long.MIN_VALUE && tick >= at && tick - at <= (long)window;
   }

   private boolean Iillllilll(IliIiiIilliIiiIi feet, class_243 t, class_243 tick, int himPos, long targetId) {
      if (feet.IiiIIIIlIi
         || Float.isNaN(feet.iIIlIIIlIi)
         || feet.liiIIIIlIi == Long.MIN_VALUE
         || targetId - feet.liiIIIIlIi >= 4L
         || targetId < feet.liiIIIIlIi) {
         return true;
      } else if (feet.iiiIIIIlIi == null || feet.iiiIIIIlIi.method_1022(t) > 0.3) {
         return true;
      } else {
         return feet.lIIlIIIlIi != himPos ? true : tick != null && (feet.IIIlIIIlIi == null || feet.IIIlIIIlIi.method_1022(tick) > 0.3);
      }
   }

   static double iIIIlIlIIl(class_243 eye, class_2338 cell) {
      if (eye != null && cell != null) {
         double var2 = Math.max(Math.max((double)cell.method_10263() - eye.field_1352, 0.0), eye.field_1352 - ((double)cell.method_10263() + 1.0));
         double var4 = Math.max(Math.max((double)cell.method_10264() - eye.field_1351, 0.0), eye.field_1351 - ((double)cell.method_10264() + 1.0));
         double var6 = Math.max(Math.max((double)cell.method_10260() - eye.field_1350, 0.0), eye.field_1350 - ((double)cell.method_10260() + 1.0));
         return Math.sqrt(var2 * var2 + var4 * var4 + var6 * var6);
      } else {
         return Double.POSITIVE_INFINITY;
      }
   }
}
