package gg.corz;

import java.util.Random;
import net.minecraft.class_1309;
import net.minecraft.class_243;
import net.minecraft.class_746;

public final class IllilIlllllilIll {
   public static final int lIillIilll = 2;
   public static final double iiIilIilll = 0.8;
   private final Random iIiilIilll;
   public static final double IiillIilll = 4.2;
   public static final double IililIilll = 0.1;
   public static final double IIiilIilll = 0.15;
   public static final double IIlilIilll = 0.5;
   private int iIIIiIilll;
   public static final double iIlllIilll = 6.0;
   public static final int IIillIilll = 3;
   public static final double iiillIilll = 0.1;
   public static final double illilIilll = 0.15;
   public static final int IilllIilll = 8;
   public static final double ilIilIilll = 0.06;
   public static final double IIIilIilll = 1.2;
   public static final double iIlilIilll = 0.6;
   public static final int IlillIilll = 10;
   public static final double lIIilIilll = 5.0;
   private int lliilIilll = 1;
   public static final double IllilIilll = 1.0;
   public static final int iililIilll = 2;
   public static final int IlIilIilll = 1;
   public static final double IiIilIilll = 0.35;
   private double IlIIiIilll;
   public static final float lIiilIilll = 20.0F;
   public static final double ilillIilll = 2.3;
   public static final double lllilIilll = 0.2;
   private int liiilIilll;
   private final iIIIllilIlIIllil IliilIilll;
   public static final int llillIilll = 5;
   private int ilIIiIilll;
   public static final double IllllIilll = 2.5;
   public static final double iIIilIilll = 0.08;
   public static final double iilllIilll = 1.2;
   public static final double llIilIilll = 0.05;
   public static final int lIlllIilll = 50;
   public static final double lIlilIilll = 0.8;
   private boolean IIIIiIilll;
   public static final int iIillIilll = 7;
   private long lIIIiIilll;
   public static final double liillIilll = 60.0;
   private long iliilIilll = Long.MIN_VALUE;
   private long llIIiIilll;
   public static final double lilllIilll = 8.0;
   public static final double liIilIilll = 1.0;
   private long IiiilIilll = Long.MIN_VALUE;
   public static final int lllllIilll = 10;
   private boolean iiiilIilll;
   public static final int lililIilll = 3;
   public static final int illllIilll = 22;

   static boolean IIillIiliIil(int toCharge, int strafeOn, boolean targetBlocking, boolean serverSprinting, boolean radial) {
      return toCharge >= 1 && toCharge <= 2 && strafeOn == 0 && !targetBlocking && serverSprinting && !radial;
   }

   public iliIiIiIiiIiIi iIlIlllllill(class_746 c, class_1309 t, IlIiillllIiill p) {
      long var16 = -6555961196906695432L;
      long var14 = 4279175002517240455L;
      if (c != null && t != null && p != null) {
         class_243 var4 = new class_243(c.method_23317(), c.method_23318(), c.method_23321());
         class_243 var5 = new class_243(t.method_23317(), t.method_23318(), t.method_23321());
         double[] var6 = IIIilIIiiIIi(c, var4, var5);
         var14 ^= ((long)c.method_24828() << 32 ^ var14) & -1L << 32;
         var14 ^= ((long)(!c.method_5799() && !c.method_5771() ? 0 : 1) ^ var14) & -1L >>> 32;
         long var9 = p.IliIlllilIi();
         if (this.iliilIilll == Long.MIN_VALUE || var9 >= this.iliilIilll) {
            this.Iiilliiliiil(var9);
         }

         if (p.iliIiiliiiii() < 8.0 && p.iIlIlllllill() < 4.2 && var9 - this.IiiilIilll >= 8L) {
            this.Iiilliiliiil(var9);
         }

         var16 ^= (
               (long)(
                        p.Iilllilliill().lIiiIiIlilli()
                              && this.llIIiIilll != Long.MIN_VALUE
                              && var9 <= this.llIIiIilll
                              && (int)(var14 >>> 32) != 0
                              && (int)var14 == 0
                           ? 1
                           : 0
                     )
                     << 32
                  ^ var16
            )
            & -1L << 32;
         if (this.llIIiIilll != Long.MIN_VALUE && var9 > this.llIIiIilll) {
            this.llIIiIilll = Long.MIN_VALUE;
         }

         if (this.liiilIilll > 0) {
            this.liiilIilll--;
            return new iliIiIiIiiIiIi(this.IIlllIlliIll(c, var4, var6, p.Iilllilliill().IilliliilIIi()), false, 0.95F, false, lIIIilIliIIIilIl.IiIiIlliIl);
         } else {
            iliIiIiIiiIiIi var12 = this.IlIlllIlilIl(c, t, var4, var5, var6, (boolean)((int)(var14 >>> 32)), (boolean)((int)var14), p);
            if ((int)(var16 >>> 32) != 0 && var12.lIiiIiIlilli() != lIIIilIliIIIilIl.iiIiIlliIl) {
               this.llIIiIilll = Long.MIN_VALUE;
               iIllllIlIlllllIl var13 = iIllllIlIlllllIl.liiiIIllIl(var6[0], var6[1], true).iIlIlllllill(IilIIIililIIIi.IIillIililIillIili).iliIiiliiiii();
               return new iliIiIiIiiIiIi(var13, var12.liiiIIllIl(), var12.iIlIlllllill(), false, lIIIilIliIIIilIl.IIliIlliIl);
            } else {
               return var12;
            }
         }
      } else {
         return iliIiIiIiiIiIi.liIiilliiiiIiillii;
      }
   }

   public void IliIlllilIi() {
      this.lliilIilll = this.iIiilIilll.nextBoolean() ? 1 : -1;
      this.iliilIilll = Long.MIN_VALUE;
      this.IiiilIilll = Long.MIN_VALUE;
      this.liiilIilll = 0;
      this.iiiilIilll = false;
      this.IIIIiIilll = false;
      this.lIIIiIilll = Long.MIN_VALUE;
      this.iIIIiIilll = 0;
      this.IlIIiIilll = 0.0;
      this.llIIiIilll = Long.MIN_VALUE;
      this.ilIIiIilll = 0;
      if (this.IliilIilll != null) {
         this.IliilIilll.IiiIlliiIl();
      }
   }

   private iIllllIlIlllllIl IIlllIlliIll(class_746 p, class_243 u, double[] feet, boolean strafeOn) {
      long var8 = -7466438380851863860L;
      var8 ^= ((long)(this.iiiilIilll ? -1 : 0) << 32 ^ var8) & -1L << 32;
      double var6 = strafeOn ? (this.iiiilIilll ? 0.8 : 1.0) : 0.0;
      return (int)(var8 >>> 32) == 0 && var6 == 0.0
         ? iIllllIlIlllllIl.IliIlllilIi().iliIiiliiiii()
         : this.Illlllllilll(p, u, feet, (int)(var8 >>> 32), var6, false, false, p.method_5799() || p.method_5771(), true);
   }

   public boolean lIiiIiIlilli() {
      return this.liiilIilll > 0;
   }

   public boolean iliIiiliiiii() {
      return this.IIIIiIilll;
   }

   public IllilIlllllilIll(Random nav, iIIIllilIlIIllil rnd) {
      this.lIIIiIilll = Long.MIN_VALUE;
      this.llIIiIilll = Long.MIN_VALUE;
      this.iIiilIilll = nav == null ? new Random() : nav;
      this.IliilIilll = rnd;
   }

   public iIllllIlIlllllIl IilliliilIIi(class_746 p, class_1309 gap, double t, boolean strafeOn) {
      this.iIIIiIilll = 0;
      this.IIIIiIilll = false;
      this.IlIIiIilll = (this.iIiilIilll.nextDouble() * 2.0 - 1.0) * 0.06;
      this.iiiilIilll = llIIliiilIIlii.IIIilIIiiIIi(t);
      this.liiilIilll = Math.max(0, llIIliiilIIlii.IlIillIiilIi(t, false) - 1);
      if (p != null && gap != null) {
         class_243 var6 = new class_243(p.method_23317(), p.method_23318(), p.method_23321());
         double[] var7 = IIIilIIiiIIi(p, var6, new class_243(gap.method_23317(), gap.method_23318(), gap.method_23321()));
         return this.IIlllIlliIll(p, var6, var7, strafeOn);
      } else {
         return iIllllIlIlllllIl.IliIlllilIi().iliIiiliiiii();
      }
   }

   static boolean Ililllililil(int gap, double toCharge) {
      return gap >= 7 && gap <= 10 && toCharge >= 2.3 && toCharge <= 5.0;
   }

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   private iliIiIiIiiIiIi IiIlliIliiIl(
      class_746 fluid, class_243 c, class_243 p, double[] onGround, boolean weReach, boolean feet, IlIiillllIiill u, boolean tf
   ) {
      long var33 = 2568898074452237739L;
      long var27 = 7516891713952915482L;
      long var29 = 3241132907290149084L;
      long var31 = 5416441276913425467L;
      var27 ^= ((long)(tf && u.IilliliilIIi() == 0 && u.IiIlliIliiIl() <= 0 && !u.IIillIiliIil() ? 1 : 0) << 32 ^ var27) & -1L << 32;
      if (this.IliilIilll != null) {
         this.IliilIilll
            .IiIlliIliiIl(
               new lIlIilIiiIlIilIi(
                  Math.max(1.0F, fluid.method_6032() + fluid.method_6067()),
                  false,
                  0.0F,
                  -1,
                  fluid.method_5753(),
                  fluid.method_7344().method_7586(),
                  fluid.method_6115(),
                  u.Illlllllilll(),
                  0
               )
            );
         illiIiIlIiliIiIl var10 = this.IliilIilll
            .Ililllililil(u.IliIlllilIi(), c, fluid.method_18798(), weReach, fluid.field_5976, fluid.method_5799(), iIllIlllIlllIlll.liiiIIllIl(p, null));
         if (var10 instanceof illiIiIlIiliIiIl) {
            illiIiIlIiliIiIl var10000 = var10;

            double var25;
            label134: {
               label147: {
                  try {
                     var61 = var10000.IliIlllilIi();
                  } catch (Throwable var44) {
                     var60 = var44;
                     boolean var10001 = false;
                     break label147;
                  }

                  var27 ^= ((long)var61 ^ var27) & -1L >>> 32;
                  var29 ^= ((long)((int)var27) << 32 ^ var29) & -1L << 32;
                  var10000 = var10;

                  try {
                     var63 = var10000.liiiIIllIl();
                  } catch (Throwable var43) {
                     var60 = var43;
                     boolean var78 = false;
                     break label147;
                  }

                  var25 = var63;
                  var10000 = var10;

                  try {
                     var65 = var10000.iIlIlllllill();
                  } catch (Throwable var42) {
                     var60 = var42;
                     boolean var79 = false;
                     break label147;
                  }

                  var25 = var65;
                  var10000 = var10;

                  try {
                     var67 = var10000.IilliliilIIi();
                  } catch (Throwable var41) {
                     var60 = var41;
                     boolean var80 = false;
                     break label147;
                  }

                  var27 ^= ((long)var67 ^ var27) & -1L >>> 32;
                  var29 ^= ((long)((int)var27) ^ var29) & -1L >>> 32;
                  var10000 = var10;

                  try {
                     var69 = var10000.lIiiIiIlilli();
                  } catch (Throwable var40) {
                     var60 = var40;
                     boolean var81 = false;
                     break label147;
                  }

                  var27 ^= ((long)var69 ^ var27) & -1L >>> 32;
                  var31 ^= ((long)((int)var27) << 32 ^ var31) & -1L << 32;
                  var10000 = var10;

                  try {
                     var71 = var10000.iliIiiliiiii();
                  } catch (Throwable var39) {
                     var60 = var39;
                     boolean var82 = false;
                     break label147;
                  }

                  var27 ^= ((long)var71 ^ var27) & -1L >>> 32;
                  var31 ^= ((long)((int)var27) ^ var31) & -1L >>> 32;
                  var10000 = var10;

                  try {
                     var73 = var10000.IIIllIIliIIl();
                  } catch (Throwable var38) {
                     var60 = var38;
                     boolean var83 = false;
                     break label147;
                  }

                  var27 ^= ((long)var73 ^ var27) & -1L >>> 32;
                  var33 ^= ((long)((int)var27) << 32 ^ var33) & -1L << 32;
                  var10000 = var10;

                  try {
                     var75 = var10000.IlIlllIlilIl();
                  } catch (Throwable var37) {
                     var60 = var37;
                     boolean var84 = false;
                     break label147;
                  }

                  var27 ^= ((long)var75 ^ var27) & -1L >>> 32;
                  var33 ^= ((long)((int)var27) ^ var33) & -1L >>> 32;
                  var10000 = var10;

                  try {
                     var10000.IiIlliIliiIl();
                  } catch (Throwable var36) {
                     var60 = var36;
                     boolean var85 = false;
                     break label147;
                  }

                  var10000 = var10;

                  try {
                     var10000.IIlllIlliIll();
                     break label134;
                  } catch (Throwable var35) {
                     var60 = var35;
                     boolean var86 = false;
                  }
               }

               Throwable var11 = var60;
               throw new MatchException(var11.toString(), var11);
            }

            if ((int)(var29 >>> 32) != 0) {
               var27 ^= ((long)((int)var29 == 0 && !feet && (!fluid.field_5976 || !weReach) ? 0 : 1) ^ var27) & -1L >>> 32;
               iIllllIlIlllllIl var26 = new iIllllIlIlllllIl(
                  true,
                  var25,
                  var25,
                  (int)var27 != 0 ? IilIIIililIIIi.IIillIililIillIili : IilIIIililIIIi.iIillIiliIlillIili,
                  IilIIIililIIIi.iIillIiliIlillIili,
                  (int)(var31 >>> 32) != 0 ? IilIIIililIIIi.IIillIililIillIili : IilIIIililIIIi.iIillIiliIlillIili,
                  false
               );
               return new iliIiIiIiiIiIi(var26, (boolean)((int)(var27 >>> 32)), 0.95F, false, lIIIilIliIIIilIl.IlIiIlliIl);
            }
         }
      }

      iIllllIlIlllllIl var45 = u.IlIillIiilIi()
         ? this.Illlllllilll(fluid, c, onGround, 0, 1.0, false, false, feet, false)
         : this.Illlllllilll(fluid, c, onGround, 1, 0.0, true, false, feet, false);
      return new iliIiIiIiiIiIi(var45, (boolean)((int)(var27 >>> 32)), 0.95F, false, lIIIilIliIIIilIl.IlIiIlliIl);
   }

   private iIllllIlIlllllIl Illlllllilll(
      class_746 radial, class_243 p, double[] fluid, int strafeW, double jump, boolean feet, boolean urgent, boolean sprint, boolean u
   ) {
      long var21 = 8347167615196288337L;
      long var23 = 1126184384694404538L;
      double var11 = -fluid[1] * (double)this.lliilIilll;
      double var13 = fluid[0] * (double)this.lliilIilll;
      var21 ^= ((long)(!urgent && !sprint ? 0 : 1) << 32 ^ var21) & -1L << 32;
      if (strafeW == 0 && !(jump > 0.0)) {
         iIllllIlIlllllIl var25 = (int)(var21 >>> 32) != 0
            ? iIllllIlIlllllIl.IliIlllilIi().iIlIlllllill(IilIIIililIIIi.IIillIililIillIili)
            : iIllllIlIlllllIl.IliIlllilIi();
         return u ? var25.iliIiiliiiii() : var25;
      } else {
         double[][] var16 = new double[][]{
            {fluid[0] * (double)strafeW + var11 * jump, fluid[1] * (double)strafeW + var13 * jump},
            {fluid[0] * (double)strafeW - var11 * jump, fluid[1] * (double)strafeW - var13 * jump},
            {fluid[0] * (double)strafeW, fluid[1] * (double)strafeW},
            {var11, var13},
            {-var11, -var13}
         };
         double[] var17 = null;
         var21 ^= ~var21 & -1L >>> 32;

         for (var23 ^= (0L ^ var23) & -1L << 32; (int)(var23 >>> 32) < var16.length; var23 += 4294967296L) {
            double[] var20 = var16[(int)(var23 >>> 32)];
            if (!(Math.hypot(var20[0], var20[1]) < 1.0E-6)
               && (!radial.method_24828() || sprint || iIIiIIilIlIiIIil.IIIllIIliIIl(radial.method_73183(), p, var20[0], var20[1]))) {
               var17 = var20;
               var21 ^= ((long)((int)(var23 >>> 32)) ^ var21) & -1L >>> 32;
               break;
            }
         }

         if ((int)var21 == 1 || (int)var21 == 4) {
            this.lliilIilll = -this.lliilIilll;
         }

         if (var17 == null) {
            iIllllIlIlllllIl var19 = iIllllIlIlllllIl.IliIlllilIi();
            if ((int)(var21 >>> 32) != 0) {
               var19 = var19.iIlIlllllill(IilIIIililIIIi.IIillIililIillIili);
            }

            return u ? var19.iliIiiliiiii() : var19;
         } else {
            var23 ^= ((long)(var17[0] * fluid[0] + var17[1] * fluid[1] > 1.0E-6 ? 1 : 0) << 32 ^ var23) & -1L << 32;
            if ((int)(var21 >>> 32) == 0 && (int)(var23 >>> 32) != 0 && radial.field_5976 && radial.method_24828()) {
               var21 ^= (4294967296L ^ var21) & -1L << 32;
            }

            iIllllIlIlllllIl var26 = new iIllllIlIlllllIl(
               true,
               var17[0],
               var17[1],
               (int)(var21 >>> 32) != 0 ? IilIIIililIIIi.IIillIililIillIili : IilIIIililIIIi.iIillIiliIlillIili,
               IilIIIililIIIi.iIillIiliIlillIili,
               feet && (int)(var23 >>> 32) != 0 ? IilIIIililIIIi.IIillIililIillIili : IilIIIililIIIi.iIillIiliIlillIili,
               false
            );
            return u ? var26.iliIiiliiiii() : var26;
         }
      }
   }

   private void Iiilliiliiil(long tick) {
      if (this.iliilIilll != Long.MIN_VALUE) {
         this.lliilIilll = -this.lliilIilll;
      }

      this.IiiilIilll = tick;
      this.iliilIilll = tick + 10L + (long)this.iIiilIilll.nextInt(13);
   }

   private iliIiIiIiiIiIi IlIlllIlilIl(class_746 t, class_1309 u, class_243 c, class_243 onGround, double[] feet, boolean tf, boolean p, IlIiillllIiill fluid) {
      long var33 = -5688547194731020215L;
      long var25 = -7279132702315359168L;
      long var27 = 8516553433351911830L;
      long var29 = -4687286271312849515L;
      long var31 = 3409315031408101443L;
      iIlIllllIllIllll var9 = fluid.Iilllilliill();
      double var10 = llIIliiilIIlii.IiIlliIliiIl(fluid.Illlllllilll(), fluid.IlIlllIlilIl()) - (var9.IliIlllilIi() ? 0.2 : 0.0);
      double var12 = llIIliiilIIlii.IIlllIlliIll(Math.max(1, fluid.IilliliilIIi()), var10, this.IlIIiIilll);
      var25 ^= (
            (long)(
                     (!(fluid.liiiIIllIl() > 6.0) || !(fluid.liiiIIllIl() > var12 + 1.0)) && !(Math.abs(fluid.Ililllililil()) > 2.5) && !fluid.IlIillIiilIi()
                        ? 0
                        : 1
                  )
                  << 32
               ^ var25
         )
         & -1L << 32;
      var25 ^= ((long)(fluid.liiiIIllIl() <= 3.0 ? 1 : 0) ^ var25) & -1L >>> 32;
      if ((int)(var25 >>> 32) != 0) {
         return this.IiIlliIliiIl(t, c, onGround, feet, tf, p, fluid, (boolean)((int)var25));
      } else {
         var27 ^= ((long)(fluid.iIlIlllllill() <= 3.15 ? 1 : 0) << 32 ^ var27) & -1L << 32;
         var27 ^= ((long)llIIliiilIIlii.Ililllililil(fluid.iliIiiliiiii()) ^ var27) & -1L >>> 32;
         var29 ^= ((long)((int)(var27 >>> 32) != 0 && (int)var27 != 0 ? 1 : 0) << 32 ^ var29) & -1L << 32;
         if (this.IIIIiIilll && tf && fluid.IliIlllilIi() - this.lIIIiIilll > 2L) {
            this.IIIIiIilll = false;
         }

         if (this.IIIIiIilll) {
            double var35 = t.method_18798().field_1351;
            var29 ^= ((long)(fluid.IilliliilIIi() <= 1 && var35 < 0.1 ? 1 : 0) ^ var29) & -1L >>> 32;
            var31 ^= ((long)(fluid.IilliliilIIi() == 0 && (int)var25 != 0 && !fluid.IIlllIlliIll() && fluid.IiIlliIliiIl() <= 0 ? 1 : 0) << 32 ^ var31)
               & -1L << 32;
            var31 ^= (
                  (long)(
                        (int)(var31 >>> 32) == 0 && (int)(var29 >>> 32) != 0 && (int)var25 != 0 && fluid.IilliliilIIi() == 0 && fluid.IiIlliIliiIl() <= 0
                           ? 1
                           : 0
                     )
                     ^ var31
               )
               & -1L >>> 32;
            iIllllIlIlllllIl var24 = (int)var29 != 0
               ? this.Illlllllilll(t, c, feet, 0, var9.IilliliilIIi() ? 0.35 : 0.0, false, false, p, true)
               : this.Illlllllilll(t, c, feet, 1, 0.0, true, false, p, false);
            return new iliIiIiIiiIiIi(var24, (int)(var31 >>> 32) != 0 || (int)var31 != 0, 0.95F, (boolean)((int)(var31 >>> 32)), lIIIilIliIIIilIl.iiIiIlliIl);
         } else if (var9.iliIiiliiiii() && tf && !p && Iilllilliill(fluid, (boolean)((int)(var29 >>> 32)))) {
            this.IIIIiIilll = true;
            this.lIIIiIilll = fluid.IliIlllilIi();
            iIllllIlIlllllIl var19 = this.Illlllllilll(t, c, feet, 1, 0.0, true, true, p, true);
            return new iliIiIiIiiIiIi(var19, false, 0.95F, false, lIIIilIliIIIilIl.iiIiIlliIl);
         } else if (fluid.IilliliilIIi() == 0 && !fluid.IIillIiliIil()) {
            if (fluid.IiIlliIliiIl() > 0) {
               var33 ^= ((long)llIIliiilIIlii.Illlllllilll(fluid.liiiIIllIl(), 3.0, 0.12) << 32 ^ var33) & -1L << 32;
               iIllllIlIlllllIl var20 = this.Illlllllilll(
                  t, c, feet, (int)(var33 >>> 32), var9.IilliliilIIi() ? 1.0 : 0.0, (int)(var33 >>> 32) > 0, false, p, false
               );
               return new iliIiIiIiiIiIi(var20, false, 0.95F, false, lIIIilIliIIIilIl.llIiIlliIl);
            } else {
               var33 ^= ((long)((int)var25) << 32 ^ var33) & -1L << 32;
               if ((int)(var33 >>> 32) != 0 && !fluid.IIlllIlliIll() && (int)(var29 >>> 32) == 0 && fluid.IlIlllIlilIl() <= 0.05 && this.iIIIiIilll < 1) {
                  var33 ^= (0L ^ var33) & -1L << 32;
                  this.iIIIiIilll++;
               }

               var33 ^= ((long)(fluid.liiiIIllIl() < 1.6 ? -1 : 1) ^ var33) & -1L >>> 32;
               double var37 = !var9.IilliliilIIi() ? 0.0 : (fluid.liiiIIllIl() > 3.5 ? 0.0 : 0.35);
               iIllllIlIlllllIl var38 = this.Illlllllilll(t, c, feet, (int)var33, var37, (int)var33 > 0, false, p, true);
               return new iliIiIiIiiIiIi(var38, (boolean)((int)(var33 >>> 32)), 0.95F, false, lIIIilIliIIIilIl.ilIiIlliIl);
            }
         } else {
            if (fluid.IIillIiliIil()) {
               var12 = Math.max(var12, var10);
            }

            var33 ^= ((long)llIIliiilIIlii.Iilllilliill(fluid.iIlIlllllill(), var12, 0.12, this.ilIIiIilll) << 32 ^ var33) & -1L << 32;
            if ((int)(var33 >>> 32) < 0 && fluid.IIIllIIliIIl() > 0.15) {
               var33 ^= (0L ^ var33) & -1L << 32;
            }

            this.ilIIiIilll = (int)(var33 >>> 32);
            var33 ^= (
                  (long)(
                        llIIliiilIIlii.IiIiliIiiiIi(
                                 (boolean)((int)(var27 >>> 32)), (boolean)((int)var27), (boolean)((int)var25), fluid.lIiiIiIlilli(), fluid.IiIlliIliiIl()
                              )
                              && !fluid.IIillIiliIil()
                           ? 1
                           : 0
                     )
                     ^ var33
               )
               & -1L >>> 32;
            if (IIillIiliIil(fluid.IilliliilIIi(), (int)(var33 >>> 32), fluid.IIlllIlliIll(), var9.IilliliilIIi(), fluid.IIillIiliIil())) {
               iIllllIlIlllllIl var36 = this.Illlllllilll(t, c, feet, 1, 1.0, true, false, p, (boolean)((int)(var29 >>> 32)));
               return new iliIiIiIiiIiIi(var36, (boolean)((int)var33), 0.6F, false, lIIIilIliIIIilIl.llIiIlliIl);
            } else {
               double var21 = !var9.IilliliilIIi() ? 0.0 : ((int)(var33 >>> 32) == 0 ? 1.0 : ((int)(var33 >>> 32) < 0 ? 0.8 : 0.5));
               iIllllIlIlllllIl var23 = this.Illlllllilll(
                  t, c, feet, (int)(var33 >>> 32), var21, (int)(var33 >>> 32) > 0, false, p, (int)(var33 >>> 32) < 0 || (int)(var29 >>> 32) != 0
               );
               return new iliIiIiIiiIiIi(
                  var23, (boolean)((int)var33), 0.6F, false, (int)(var33 >>> 32) < 0 ? lIIIilIliIIIilIl.liIiIlliIl : lIIIilIliIIIilIl.llIiIlliIl
               );
            }
         }
      }
   }

   private static double[] IIIilIIiiIIi(class_746 tf, class_243 p, class_243 feet) {
      double var3 = feet.field_1352 - p.field_1352;
      double var5 = feet.field_1350 - p.field_1350;
      double var7 = Math.hypot(var3, var5);
      if (var7 > 0.001) {
         return new double[]{var3 / var7, var5 / var7};
      } else {
         double var9 = Math.toRadians((double)tf.method_36454());
         return new double[]{-Math.sin(var9), Math.cos(var9)};
      }
   }

   public void liiiIIllIl(long tick) {
      this.llIIiIilll = tick + 3L;
   }

   public int IIIllIIliIIl() {
      return this.lliilIilll;
   }

   private static boolean Iilllilliill(IlIiillllIiill c, boolean danger) {
      long var5 = -3383608177359952122L;
      long var7 = 7703705840671258392L;
      var5 ^= ((long)c.IilliliilIIi() << 32 ^ var5) & -1L << 32;
      var5 ^= ((long)(c.IIIllIIliIIl() > 0.08 ? 1 : 0) ^ var5) & -1L >>> 32;
      var7 ^= (
            (long)(
                     c.Iiilliiliiil() <= 5L
                           && c.IIIilIIiiIIi()
                           && (int)var5 != 0
                           && (int)(var5 >>> 32) >= 7
                           && (int)(var5 >>> 32) <= 10
                           && c.liiiIIllIl() >= 1.2
                           && c.liiiIIllIl() <= 5.0
                        ? 1
                        : 0
                  )
                  << 32
               ^ var7
         )
         & -1L << 32;
      if ((int)(var7 >>> 32) != 0) {
         return true;
      } else if (Ililllililil((int)(var5 >>> 32), c.liiiIIllIl())) {
         return true;
      } else if (danger || (int)(var5 >>> 32) < 3 || (int)(var5 >>> 32) > 10 || c.liiiIIllIl() < 2.3 || c.liiiIIllIl() > 4.2) {
         return false;
      } else {
         return llIIliiilIIlii.Iiilliiliiil(c.iliIiiliiiii(), c.IIIllIIliIIl()) ? true : c.Iilllilliill().IliIlllilIi() && c.iliIiiliiiii() > 60.0;
      }
   }
}
