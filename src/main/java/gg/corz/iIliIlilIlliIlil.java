package gg.corz;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_1304;
import net.minecraft.class_1309;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1893;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_5134;
import net.minecraft.class_746;

public final class iIliIlilIlliIlil {
   private static final class_1792[] IIIiiIiIil = new class_1792[]{
      class_1802.field_22027, class_1802.field_22028, class_1802.field_22029, class_1802.field_22030
   };
   public static final int lIiliIiIil = 24;
   private long IIliiIiIil;
   private double illiiIiIil;
   private boolean IlliiIiIil;
   public static final int IilliIiIil = 3;
   public static final double iIlliIiIil = 0.05;
   public static final int liiliIiIil = 8;
   private long lIliiIiIil;
   private double iiiiiIiIil;
   private int llliiIiIil;
   public static final int iIiliIiIil = 8;
   private static final class_1304[] iiiliIiIil = new class_1304[]{class_1304.field_6169, class_1304.field_6174, class_1304.field_6172, class_1304.field_6166};
   private class_243 IiiiiIiIil;
   public static final int lilliIiIil = 64;
   private final ArrayList<iiIIlIIlIl> llIiiIiIil;
   private long iiliiIiIil;
   public static final double iiIliIiIil = 0.3;
   public static final int illliIiIil = 4;
   public static final double ilIliIiIil = 2.0;
   public static final int IIiliIiIil = 10;
   public static final double llIliIiIil = 1.0E-4;
   private final ArrayList<IiIIllIlliIIllIl> lIIiiIiIil = new ArrayList<>(64);
   public static final double liIliIiIil = 0.05;
   private int liIiiIiIil;
   public static final double IllliIiIil = 0.001;
   public static final int iilliIiIil = 16;
   private long IliiiIiIil;
   private double liiiiIiIil;
   private illIlIiIilIlIi iliiiIiIil;
   public static final double ililiIiIil = 0.75;
   private long iIiiiIiIil;
   public static final double IiIliIiIil = 0.15;
   public static final double lIlliIiIil = 0.026;
   public static final int IiiliIiIil = 3;
   private boolean iIliiIiIil;
   private IiIllIilliIllIil liliiIiIil;
   private long lIiiiIiIil;
   private liIiilIliiIiilIl IIiiiIiIil;
   private double lliiiIiIil;
   private liIIiIlliiIIiIll iiIiiIiIil;
   private lIiIlIIliIiIlIIl ilIiiIiIil;
   private final ArrayList<iiliiIIiii> iIIiiIiIil = new ArrayList<>(8);
   private IiIIIlliIIIl IiIiiIiIil;
   public static final double IIlliIiIil = 1.2;
   private final ArrayList<IlIIIllllIIIll> IlIiiIiIil = new ArrayList<>(16);
   public static final double lliliIiIil = 100.0;
   public static final double lllliIiIil = 0.3;
   public static final int IliliIiIil = 4;
   private double IiliiIiIil;

   private int iiIIlIIlIl(long fromTick, long now) {
      if (fromTick != Long.MIN_VALUE && now != Long.MIN_VALUE) {
         long var5 = now - fromTick + Math.round(this.IIiiiIiIil.lIiiIiIlilli());
         return (int)Math.max(0L, Math.min(24L, var5));
      } else {
         return (int)Math.round(this.IIiiiIiIil.lIiiIiIlilli());
      }
   }

   private void iIIIlIlIIl(long s, liIIiIlliiIIiIll fitted, boolean tick, boolean moving) {
      if (tick || moving) {
         this.lIliiIiIil = s;
      }

      this.iiIiiIiIil = fitted;
      this.IIliiIiIil = s;
      this.iIliiIiIil = tick;
      if (this.lIIiiIiIil.size() >= 64) {
         this.lIIiiIiIil.remove(0);
      }

      this.lIIiiIiIil.add(new IiIIllIlliIIllIl(s, fitted.IliIlllilIi(), fitted.liiiIIllIl(), fitted.iIlIlllllill(), !fitted.IIIllIIliIIl()));
   }

   public boolean IIlilIliiIli(long tick) {
      return this.iIiiiIiIil != Long.MIN_VALUE && this.iIiiiIiIil > tick;
   }

   private static class_243 IIiIllIiIl(class_243 sv) {
      class_746 var1 = class_310.method_1551().field_1724;
      if (var1 != null && sv != null) {
         class_243 var2 = var1.method_73189();
         return iIiIlIliIl(new class_243(var2.field_1352 - sv.field_1352, 0.0, var2.field_1350 - sv.field_1350));
      } else {
         return new class_243(0.0, 0.0, 0.0);
      }
   }

   public double Iiilliiliiil(long tick) {
      double var3 = Double.NaN;
      double var5 = Double.NEGATIVE_INFINITY;

      for (IiIIllIlliIIllIl var8 : this.lIIiiIiIil) {
         if (var8.IliIlllilIi() <= tick) {
            var3 = var8.iIlIlllllill();
         } else {
            var5 = Math.max(var5, var8.iIlIlllllill());
         }
      }

      return !Double.isNaN(var3) && var5 != Double.NEGATIVE_INFINITY ? var5 - var3 : 0.0;
   }

   public void iIlIlllllill(int entityId) {
      liIiilIliiIiilIl var2 = this.IIiiiIiIil;
      lIiIlIIliIiIlIIl var3 = this.ilIiiIiIil;
      this.liiiIIllIl();
      this.liIiiIiIil = entityId;
      this.IIiiiIiIil = var2;
      this.ilIiiIiIil = var3;
   }

   private illIlIiIilIlIi IiIIlliIIl(long tick) {
      long var13 = 4846524342084786568L;
      long var15 = 6485089688019026355L;
      if (this.iiIiiIiIil == null) {
         return null;
      } else {
         var13 ^= ((long)this.iiIIlIIlIl(this.IIliiIiIil, tick) << 32 ^ var13) & -1L << 32;
         double var4 = this.IiIiiIiIil == null ? 1.0 : this.IiIiiIiIil.lIiiIiIlilli();
         liIIiIlliiIIiIll var6 = this.iiIiiIiIil;
         if (var6.IIIllIIliIIl() && var4 != 1.0 && Double.isFinite(var4)) {
            var6 = new liIIiIlliiIIiIll(
               var6.IliIlllilIi(),
               var6.liiiIIllIl(),
               var6.iIlIlllllill(),
               var6.IilliliilIIi() * var4,
               var6.lIiiIiIlilli(),
               var6.iliIiiliiiii() * var4,
               true,
               var6.IlIlllIlilIl()
            );
         }

         ArrayList var7 = new ArrayList(this.iIIiiIiIil.size());

         for (iiliiIIiii var9 : this.iIIiiIiIil) {
            var13 ^= ((long)((int)Math.round(var9.IliIlllilIi() - (double)this.IIliiIiIil)) ^ var13) & -1L >>> 32;
            if ((int)var13 <= (int)(var13 >>> 32)) {
               var7.add(new Iiillliliillli(Math.max(0, (int)var13), var9.liiiIIllIl(), var9.iIlIlllllill(), var9.IilliliilIIi(), var9.lIiiIiIlilli()));
            }
         }

         double var17 = this.IiIiiIiIil == null ? 0.0 : this.IiIiiIiIil.Illlllllilll();
         class_243 var10 = iIiIlIliIl(this.IiiiiIiIil);
         liIIiIlliiIIiIll var11;
         if ((int)(var13 >>> 32) <= 0 && var7.isEmpty()) {
            var11 = var6;
         } else {
            iIlIiiIiIllIiiIi var12 = IlIIiillllIIiill.liiiIIllIl(
               var6,
               Math.max(0, (int)(var13 >>> 32)),
               this.ilIiiIiIil,
               var17 * var10.field_1352,
               var17 * var10.field_1350,
               true,
               var6.IIIllIIliIIl() ? 0.05 : 0.026,
               var7
            );
            var11 = var12.IliIlllilIi(Math.max(0, (int)(var13 >>> 32)));
         }

         if (var11.IlIlllIlilIl() > 1.2) {
            var11 = new liIIiIlliiIIiIll(
               var11.IliIlllilIi(),
               var11.liiiIIllIl(),
               var11.iIlIlllllill(),
               var11.IilliliilIIi(),
               var11.lIiiIiIlilli(),
               var11.iliIiiliiiii(),
               var11.IIIllIIliIIl(),
               1.2
            );
         }

         var15 ^= ((long)(this.IlliiIiIil && var11.IIIllIIliIIl() ? 1 : 0) << 32 ^ var15) & -1L << 32;
         return new illIlIiIilIlIi(
            var11, (boolean)((int)(var15 >>> 32)), this.llliiIiIil, this.illiiIiIil, this.IiliiIiIil, this.liliiIiIil, this.IIiiiIiIil, this.IIliiIiIil
         );
      }
   }

   private void illIlIilIl(long vy, double tick) {
      if (this.IiIiiIiIil != null && !this.llIiiIiIil.isEmpty()) {
         long var5 = (long)Math.ceil(this.IIiiiIiIil.IliIlllilIi()) + (long)this.IIiiiIiIil.IilliliilIIi() + 4L;
         iiIIlIIlIl var7 = null;

         for (iiIIlIIlIl var9 : this.llIiiIiIil) {
            if (vy >= var9.IliIlllilIi() && vy - var9.IliIlllilIi() <= var5) {
               var7 = var9;
            }
         }

         if (var7 != null) {
            this.llIiiIiIil.remove(var7);
            double var10 = tick - var7.iIlIlllllill();
            if (var7.liiiIIllIl() > 0.0 && Double.isFinite(var10)) {
               this.IiIiiIiIil.IlIlllIlilIl(var7.liiiIIllIl(), var10);
            }
         }
      }
   }

   private void lilIliilIl(class_1309 target, long tick) {
      long var10 = 279727393025568456L;
      this.iiliiIiIil = tick;
      var10 ^= (0L ^ var10) & -1L << 32;
      int[] var5 = new int[iiiliIiIil.length];

      for (var10 ^= (0L ^ var10) & -1L >>> 32; (int)var10 < iiiliIiIil.length; var10 ^= (var10 ^ var10 + (long)1) & -1L >>> 32) {
         class_1799 var7 = target.method_6118(iiiliIiIil[(int)var10]);
         if (var7 != null && !var7.method_7960()) {
            if (var7.method_31574(IIIiiIiIil[(int)var10])) {
               var10 += 4294967296L;
            }

            var5[(int)var10] = lIlllIliIlllIl.lIiiIiIlilli(var7, class_1893.field_9107);
         }
      }

      this.illiiIiIil = llllIiililllIiil.IilliliilIIi((int)(var10 >>> 32));
      double var6 = 0.0;
      if (target.method_6127() != null && target.method_6127().method_45331(class_5134.field_51580)) {
         var6 = target.method_45325(class_5134.field_51580);
      }

      double var8 = Double.isFinite(var6) ? Math.max(0.0, Math.min(1.0, var6)) : 0.0;
      if (var8 <= 0.0) {
         var8 = llllIiililllIiil.lIiiIiIlilli(var5);
      }

      this.IiliiIiIil = var8;
      this.liliiIiIil = lIIlliiiIIllii.IliIlllilIi(this.IiliiIiIil);
   }

   public void liiiIIllIl() {
      this.lIIiiIiIil.clear();
      this.iIIiiIiIil.clear();
      this.IlIiiIiIil.clear();
      this.llIiiIiIil.clear();
      this.liIiiIiIil = -1;
      this.iiIiiIiIil = null;
      this.IIliiIiIil = Long.MIN_VALUE;
      this.lIliiIiIil = Long.MIN_VALUE;
      this.iIliiIiIil = false;
      this.IlliiIiIil = false;
      this.llliiIiIil = 0;
      this.illiiIiIil = 0.0;
      this.IiliiIiIil = 0.0;
      this.liliiIiIil = IiIllIilliIllIil.IiIilIlIil;
      this.iiliiIiIil = Long.MIN_VALUE;
      this.iIiiiIiIil = Long.MIN_VALUE;
      this.IliiiIiIil = Long.MIN_VALUE;
      this.lliiiIiIil = 0.0;
      this.iliiiIiIil = null;
      this.lIiiiIiIil = Long.MIN_VALUE;
      this.liiiiIiIil = 0.0;
      this.iiiiiIiIil = Double.NaN;
   }

   public class_243 Iiiiliiiiiii() {
      return this.IiiiiIiIil;
   }

   public class_243 IIIilIIiiIIi(long tick) {
      IiIIllIlliIIllIl var3 = null;

      for (IiIIllIlliIIllIl var5 : this.lIIiiIiIil) {
         if (var5.IliIlllilIi() <= tick) {
            var3 = var5;
         }
      }

      return var3 == null ? null : new class_243(var3.liiiIIllIl(), var3.iIlIlllllill(), var3.IilliliilIIi());
   }

   public boolean Ililllililil(long tick, double minVy) {
      for (IlIIIllllIIIll var6 : this.IlIiiIiIil) {
         if (var6.IliIlllilIi() > tick && var6.liiiIIllIl() >= minVy) {
            return true;
         }
      }

      return false;
   }

   static class_243 iIiIlIliIl(class_243 v) {
      if (v == null) {
         return new class_243(0.0, 0.0, 0.0);
      } else {
         double var1 = Math.sqrt(v.field_1352 * v.field_1352 + v.field_1350 * v.field_1350);
         return !(var1 > 1.0E-6) ? new class_243(0.0, 0.0, 0.0) : new class_243(v.field_1352 / var1, 0.0, v.field_1350 / var1);
      }
   }

   private void IIIIllIIIl(long onGround, class_243 tick, boolean sv) {
      long var33 = 4393131096506394580L;
      long var35 = -1618322700798706916L;
      long var31 = -1911555479156609013L;
      if (this.iiIiiIiIil == null) {
         var31 ^= ((long)(!sv ? 1 : 0) << 32 ^ var31) & -1L << 32;
         this.iIIIlIlIIl(
            onGround,
            new liIIiIlliiIIiIll(
               tick.field_1352, tick.field_1351, tick.field_1350, 0.0, (int)(var31 >>> 32) != 0 ? 0.0 : -0.0784, 0.0, (int)(var31 >>> 32) == 0, 0.15
            ),
            false,
            true
         );
         this.llliiIiIil = (int)(var31 >>> 32) != 0 ? 0 : 1;
         this.IlliiIiIil = (int)(var31 >>> 32) == 0;
      } else {
         double var5 = tick.field_1352 - this.iiIiiIiIil.IliIlllilIi();
         double var7 = tick.field_1351 - this.iiIiiIiIil.liiiIIllIl();
         double var9 = tick.field_1350 - this.iiIiiIiIil.iIlIlllllill();
         double var11 = Math.sqrt(var5 * var5 + var7 * var7 + var9 * var9);
         if (var11 <= 1.0E-4) {
            if (onGround - this.IIliiIiIil >= 3L
               && (
                  Math.abs(this.iiIiiIiIil.IilliliilIIi()) > 0.0
                     || Math.abs(this.iiIiiIiIil.iliIiiliiiii()) > 0.0
                     || !this.iiIiiIiIil.IIIllIIliIIl()
                     || this.iiIiiIiIil.lIiiIiIlilli() != -0.0784
               )) {
               this.iIIIlIlIIl(onGround, new liIIiIlliiIIiIll(tick.field_1352, tick.field_1351, tick.field_1350, 0.0, -0.0784, 0.0, true, 0.15), false, false);
               this.IlliiIiIil = true;
               this.llliiIiIil++;
            }
         } else {
            long var13 = this.lIliiIiIil == Long.MIN_VALUE ? Long.MAX_VALUE : onGround - this.lIliiIiIil;
            var31 ^= ((long)((int)Math.max(1L, Math.min(4L, onGround - this.IIliiIiIil))) ^ var31) & -1L >>> 32;
            if (IIIlIilllIIlIill.IliIlllilIi(var11, (int)var31, this.IllIllllIl(onGround))) {
               this.iIiiiIiIil = onGround;
               this.iIIiiIiIil.clear();
               var33 ^= ((long)(!sv ? 1 : 0) << 32 ^ var33) & -1L << 32;
               this.iIIIlIlIIl(
                  onGround,
                  new liIIiIlliiIIiIll(
                     tick.field_1352, tick.field_1351, tick.field_1350, 0.0, (int)(var33 >>> 32) != 0 ? 0.0 : -0.0784, 0.0, (int)(var33 >>> 32) == 0, 0.3
                  ),
                  false,
                  true
               );
               this.IlliiIiIil = (int)(var33 >>> 32) == 0;
               this.llliiIiIil = (int)(var33 >>> 32) != 0 ? 0 : 1;
            } else if (var13 >= 1L && var13 <= 4L) {
               var33 ^= ((long)((int)var13) << 32 ^ var33) & -1L << 32;
               var33 ^= ((long)(sv && !(Math.abs(var7) > 0.001) ? 0 : 1) ^ var33) & -1L >>> 32;
               double var18;
               double var20;
               double var22;
               if ((int)var33 != 0) {
                  double var24 = Math.pow(0.91, (double)((int)(var33 >>> 32)));
                  double var26 = 0.08999999999999997 / (1.0 - var24) * var24;
                  var18 = var5 * var26;
                  var20 = var9 * var26;
                  var22 = IlIIiillllIIiill.lIiiIiIlilli(IlIIiillllIIiill.iliIiiliiiii(var7, (int)(var33 >>> 32)), (int)(var33 >>> 32));
                  if (!Double.isFinite(var22)) {
                     var22 = 0.0;
                  }
               } else {
                  var18 = var5 / (double)((int)(var33 >>> 32));
                  var20 = var9 / (double)((int)(var33 >>> 32));
                  var22 = -0.0784;
               }

               var35 ^= ((long)(!this.iiIiiIiIil.IIIllIIliIIl() ? 1 : 0) << 32 ^ var35) & -1L << 32;
               if ((int)var33 != 0 && (int)(var35 >>> 32) != 0 && this.iIliiIiIil) {
                  this.llIIlilIIl(this.iiIiiIiIil, var5, var9, (int)(var33 >>> 32), onGround);
               }

               double var25 = 0.15;
               iiliiIIiii var27 = null;

               for (iiliiIIiii var29 : this.iIIiiIiIil) {
                  if (var29.IliIlllilIi() <= (double)onGround
                     && var29.IliIlllilIi() > (double)this.IIliiIiIil
                     && var29.lIiiIiIlilli()
                     && (var27 == null || var29.IliIlllilIi() > var27.IliIlllilIi())) {
                     var27 = var29;
                  }
               }

               if (var27 != null && (int)var33 != 0) {
                  var35 ^= ((long)Math.max(0, (int)Math.round((double)onGround - var27.IliIlllilIi())) ^ var35) & -1L >>> 32;
                  double var37 = Math.pow(0.91, (double)((int)var35));
                  var18 = var27.liiiIIllIl() * var37;
                  var20 = var27.IilliliilIIi() * var37;
                  var22 = IlIIiillllIIiill.lIiiIiIlilli(var27.iIlIlllllill(), (int)var35);
                  var25 = var27.iliIiiliiiii() ? 0.05 : 0.15;
               }

               this.iIIiiIiIil.removeIf(tickx -> tickx.IliIlllilIi() <= (double)onGround);
               this.iIIIlIlIIl(
                  onGround, new liIIiIlliiIIiIll(tick.field_1352, tick.field_1351, tick.field_1350, var18, var22, var20, (int)var33 == 0, var25), true, true
               );
               this.IlliiIiIil = (int)var33 == 0;
               this.llliiIiIil = (int)var33 != 0 ? 0 : this.llliiIiIil + 1;
            } else {
               var33 ^= ((long)(!sv ? 1 : 0) << 32 ^ var33) & -1L << 32;
               this.iIIIlIlIIl(
                  onGround,
                  new liIIiIlliiIIiIll(
                     tick.field_1352, tick.field_1351, tick.field_1350, 0.0, (int)(var33 >>> 32) != 0 ? 0.0 : -0.0784, 0.0, (int)(var33 >>> 32) == 0, 0.15
                  ),
                  false,
                  true
               );
               this.IlliiIiIil = (int)(var33 >>> 32) == 0;
               this.llliiIiIil = (int)(var33 >>> 32) != 0 ? 0 : this.llliiIiIil + 1;
            }
         }
      }
   }

   public boolean Illlllllilll() {
      return this.iliiiIiIil != null && !this.iliiiIiIil.IliIlllilIi().IIIllIIliIIl();
   }

   private double IllIllllIl(long tick) {
      long var6 = -4632903972869244458L;
      double var3 = this.iiIiiIiIil == null
         ? 0.0
         : Math.sqrt(
            this.iiIiiIiIil.IilliliilIIi() * this.iiIiiIiIil.IilliliilIIi()
               + this.iiIiiIiIil.lIiiIiIlilli() * this.iiIiiIiIil.lIiiIiIlilli()
               + this.iiIiiIiIil.iliIiiliiiii() * this.iiIiiIiIil.iliIiiliiiii()
         );
      var6 ^= ((long)(!Double.isNaN(this.iiiiiIiIil) && (double)tick >= this.iiiiiIiIil - 8.0 && (double)tick <= this.iiiiiIiIil + 8.0 ? 1 : 0) << 32 ^ var6)
         & -1L << 32;
      return (int)(var6 >>> 32) != 0 ? Math.max(var3, this.liiiiIiIil) : var3;
   }

   public iIliIlilIlliIlil() {
      this.llIiiIiIil = new ArrayList<>(4);
      this.ilIiiIiIil = IlIIiillllIIiill.Illilliill;
      this.liIiiIiIil = -1;
      this.IIliiIiIil = Long.MIN_VALUE;
      this.lIliiIiIil = Long.MIN_VALUE;
      this.liliiIiIil = IiIllIilliIllIil.IiIilIlIil;
      this.iiliiIiIil = Long.MIN_VALUE;
      this.IIiiiIiIil = new liIiilIliiIiilIl(100.0, 100.0);
      this.lIiiiIiIil = Long.MIN_VALUE;
      this.iIiiiIiIil = Long.MIN_VALUE;
      this.IliiiIiIil = Long.MIN_VALUE;
      this.IiiiiIiIil = new class_243(0.0, 0.0, 0.0);
      this.iiiiiIiIil = Double.NaN;
   }

   public int IilliliilIIi() {
      return this.liIiiIiIil;
   }

   public liIiilIliiIiilIl Iliilliiilii() {
      return this.IIiiiIiIil;
   }

   public iIlIiiIiIllIiiIi IIlllIlliIll(int kicks, lIiIlIIliIiIlIIl towardUs, IiIIIlliIIIl ticks, class_243 cal, List<Iiillliliillli> terrain) {
      long var18 = 8600980832797101039L;
      illIlIiIilIlIi var6 = this.iliiiIiIil;
      if (var6 == null) {
         return null;
      } else {
         lIiIlIIliIiIlIIl var7 = towardUs == null ? this.ilIiiIiIil : towardUs;
         double var8 = ticks == null ? 0.0 : ticks.Illlllllilll();
         class_243 var10 = iIiIlIliIl(cal);
         var18 ^= ((long)(!var6.IliIlllilIi().IIIllIIliIIl() ? 1 : 0) << 32 ^ var18) & -1L << 32;
         ArrayList var12 = new ArrayList(this.iIIiiIiIil.size() + (terrain == null ? 0 : terrain.size()));
         double var13 = (double)(var6.IlIlllIlilIl() + (long)this.iiIIlIIlIl(var6.IlIlllIlilIl(), this.lIiiiIiIil));

         for (iiliiIIiii var16 : this.iIIiiIiIil) {
            var18 ^= ((long)((int)Math.round(var16.IliIlllilIi() - var13)) ^ var18) & -1L >>> 32;
            if ((int)var18 >= 1) {
               var12.add(new Iiillliliillli((int)var18, var16.liiiIIllIl(), var16.iIlIlllllill(), var16.IilliliilIIi(), var16.lIiiIiIlilli()));
            }
         }

         if (terrain != null) {
            for (Iiillliliillli var21 : terrain) {
               if (var21 != null) {
                  var12.add(var21);
               }
            }
         }

         return IlIIiillllIIiill.liiiIIllIl(
            var6.IliIlllilIi(),
            Math.max(1, kicks),
            var7,
            var8 * var10.field_1352,
            var8 * var10.field_1350,
            true,
            (int)(var18 >>> 32) != 0 ? 0.026 : 0.05,
            var12
         );
      }
   }

   public void iliIiiliiiii(IlIIIiIillIIIiIi v, long tick) {
      if (v != null && v.IliIlllilIi() == this.liIiiIiIil && v.liiiIIllIl() != null) {
         class_243 var4 = v.liiiIIllIl();
         this.IliiiIiIil = tick;
         this.lliiiIiIil = var4.field_1351;
         if (this.IlIiiIiIil.size() >= 16) {
            this.IlIiiIiIil.remove(0);
         }

         this.IlIiiIiIil.add(new IlIIIllllIIIll(tick, var4.field_1351));
         double var5 = (double)(tick + (long)this.IIiiiIiIil.IilliliilIIi());
         this.iIIiiIiIil.removeIf(visible -> visible.IliIlllilIi() <= var5 + 0.75);
         this.lIlIliIlIl(new iiliiIIiii(var5, var4.field_1352, var4.field_1351, var4.field_1350, true, true));
         this.illIlIilIl(tick, var4.field_1351);
         if (this.lIiiiIiIil != Long.MIN_VALUE) {
            this.iliiiIiIil = this.IiIIlliIIl(this.lIiiiIiIil);
         }
      }
   }

   public void IlIlllIlilIl(long predictedVyBefore, double predictedKbY, double sentTick) {
      if (Double.isFinite(predictedKbY) && Double.isFinite(sentTick)) {
         if (this.llIiiIiIil.size() >= 4) {
            this.llIiiIiIil.remove(0);
         }

         this.llIiiIiIil.add(new iiIIlIIlIl(predictedVyBefore, predictedKbY, sentTick));
      }
   }

   public double IIiilIiiiIii() {
      return this.lliiiIiIil;
   }

   public void IliIlllilIi(lIiIlIIliIiIlIIl t) {
      this.ilIiiIiIil = t == null ? IlIIiillllIIiill.Illilliill : t;
   }

   public illIlIiIilIlIi IiIlliIliiIl() {
      return this.iliiiIiIil;
   }

   public boolean IiIiliIiiiIi() {
      return this.IlliiIiIil;
   }

   public int Iilllilliill(lIiIlIIliIiIlIIl terrain, IiIIIlliIIIl cal, class_243 towardUs) {
      if (!this.Illlllllilll()) {
         return 0;
      } else {
         iIlIiiIiIllIiiIi var4 = this.IIlllIlliIll(40, terrain, cal, towardUs, null);
         return var4 == null ? 0 : var4.iIlIlllllill();
      }
   }

   public long Illillliilli() {
      return this.iIiiiIiIil;
   }

   public class_243 IlIillIiilIi() {
      if (this.lIIiiIiIil.isEmpty()) {
         return null;
      } else {
         IiIIllIlliIIllIl var1 = this.lIIiiIiIil.get(this.lIIiiIiIil.size() - 1);
         return new class_243(var1.liiiIIllIl(), var1.iIlIlllllill(), var1.IilliliilIIi());
      }
   }

   public void lIiiIiIlilli(long target, class_1309 targetPingMs, int ourPingMs, int cal, IiIIIlliIIIl tick) {
      if (targetPingMs != null) {
         if (targetPingMs.method_5628() != this.liIiiIiIil) {
            this.iIlIlllllill(targetPingMs.method_5628());
         }

         this.IiIiiIiIil = tick;
         this.lIiiiIiIil = target;
         this.IIiiiIiIil = new liIiilIliiIiilIl(cal > 0 ? (double)cal : 100.0, ourPingMs > 0 ? (double)ourPingMs : 100.0);
         if (this.iiliiIiIil == Long.MIN_VALUE || target - this.iiliiIiIil >= 10L || target < this.iiliiIiIil) {
            this.lilIliilIl(targetPingMs, target);
         }

         class_243 var7 = targetPingMs.method_66233() != null ? targetPingMs.method_66233().method_66265() : targetPingMs.method_73189();
         this.IiiiiIiIil = IIiIllIiIl(var7);
         if (var7 != null && Double.isFinite(var7.field_1352) && Double.isFinite(var7.field_1351) && Double.isFinite(var7.field_1350)) {
            this.IIIIllIIIl(target, var7, targetPingMs.method_24828());
            this.iIIiiIiIil.removeIf(tickx -> tickx.IliIlllilIi() < (double)(target - 3L));
         }

         this.iliiiIiIil = this.IiIIlliIIl(target);
      }
   }

   public void IIIllIIliIIl(long vx, double vy, double vz, double sentTick, boolean set) {
      if (Double.isFinite(vy) && Double.isFinite(vz) && Double.isFinite(sentTick)) {
         double var10 = (double)(vx + (long)this.IIiiiIiIil.IilliliilIIi()) + this.IIiiiIiIil.IliIlllilIi() + 0.5;
         this.lIlIliIlIl(new iiliiIIiii(var10, vy, vz, sentTick, set, false));
         if (this.lIiiiIiIil != Long.MIN_VALUE) {
            this.iliiiIiIil = this.IiIIlliIIl(this.lIiiiIiIil);
         }
      }
   }

   private void lIlIliIlIl(iiliiIIiii k) {
      if (this.iIIiiIiIil.size() >= 8) {
         this.iIIiiIiIil.remove(0);
      }

      this.iIIiiIiIil.add(k);
      double var2 = Math.sqrt(k.liiiIIllIl() * k.liiiIIllIl() + k.iIlIlllllill() * k.iIlIlllllill() + k.IilliliilIIi() * k.IilliliilIIi());
      if (!Double.isNaN(this.iiiiiIiIil) && Math.abs(k.IliIlllilIi() - this.iiiiiIiIil) <= 8.0) {
         this.liiiiIiIil = Math.max(this.liiiiIiIil, var2);
         this.iiiiiIiIil = Math.max(this.iiiiiIiIil, k.IliIlllilIi());
      } else {
         this.liiiiIiIil = var2;
         this.iiiiiIiIil = k.IliIlllilIi();
      }
   }

   private void llIIlilIIl(liIIiIlliiIIiIll tick, double n, double dx, int dz, long prev) {
      if (this.IiIiiIiIil != null) {
         for (iiliiIIiii var10 : this.iIIiiIiIil) {
            if (var10.IliIlllilIi() <= (double)prev && var10.IliIlllilIi() > (double)this.IIliiIiIil) {
               return;
            }
         }

         for (IlIIIllllIIIll var30 : this.IlIiiIiIil) {
            if (var30.IliIlllilIi() > this.IIliiIiIil - 1L && var30.IliIlllilIi() <= prev) {
               return;
            }
         }

         double var29 = Math.pow(0.91, (double)dz);
         double var11 = (1.0 - var29) / 0.08999999999999997;
         double var13 = tick.IilliliilIIi() * var11;
         double var15 = tick.iliIiiliiiii() * var11;
         double var17 = n - var13;
         double var19 = dx - var15;
         double var21 = ((double)dz - 0.91 * (1.0 - var29) / 0.08999999999999997) / 0.08999999999999997;
         if (var21 > 1.0E-6) {
            class_243 var23 = this.IiiiiIiIil;
            double var24 = Math.sqrt(var23.field_1352 * var23.field_1352 + var23.field_1350 * var23.field_1350);
            if (!(var24 < 1.0E-6)) {
               double var26 = (var17 * var23.field_1352 + var19 * var23.field_1350) / var24 / var21;
               if (Double.isFinite(var26)) {
                  this.IiIiiIiIil.IIlllIlliIll(var26);
               }
            }
         }
      }
   }

   public long Iilililiiili() {
      return this.IliiiIiIil;
   }

   public boolean IIillIiliIil(long minVy, double tick) {
      return this.Ililllililil(minVy, tick) || this.Iiilliiliiil(minVy) >= 0.3;
   }
}
