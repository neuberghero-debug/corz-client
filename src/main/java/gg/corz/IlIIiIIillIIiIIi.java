package gg.corz;

import java.util.function.Predicate;
import net.minecraft.class_1747;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3726;
import net.minecraft.class_3965;
import net.minecraft.class_638;
import net.minecraft.class_746;

public final class IlIIiIIillIIiIIi {
   private Predicate<class_2680> IIllIliiil;
   private int iillIliiil;
   private class_2338 ilIlIliiil;
   private boolean IlIlIliiil;
   private int lillIliiil;
   private final int lIIlIliiil;
   private final illlllllIillllll IIIlIliiil;
   public static final int IliIIliiil = 3;
   private class_2680 liIlIliiil;
   private boolean IlllIliiil;
   public static final int liiIIliiil = 2;
   private static final class_2350[] iiiIIliiil = class_2350.values();
   private long llllIliiil;
   private boolean llIlIliiil;
   public static final double lIiIIliiil = 1.9;
   private int IiIlIliiil = -1;
   private int IillIliiil;
   public static final double iliIIliiil = 720.0;
   private String lIilIliiil;
   public static final int iIiIIliiil = 1;
   public static final double lliIIliiil = 360.0;
   private int lIllIliiil;
   private final boolean iIIlIliiil;
   public static final int IiiIIliiil = 40;
   private class_2338 iiIlIliiil;
   private int illlIliiil;
   private class_3965 iIllIliiil;
   private long IIilIliiil;

   private lilIillliilIilll Iiilliiliiil(String reason) {
      this.IlIillIiilIi();
      this.lIilIliiil = reason;
      return lilIillliilIilll.iIIllIlill;
   }

   public IlIIiIIillIIiIIi(illlllllIillllll entityWaitMax, int host, boolean deep) {
      this.IIIlIliiil = entityWaitMax;
      this.lIIlIliiil = host;
      this.iIIlIliiil = deep;
   }

   public String IIlllIlliIll() {
      return this.lIilIliiil;
   }

   private void IlIillIiilIi() {
      this.IlIlIliiil = false;
      this.llIlIliiil = false;
      this.ilIlIliiil = null;
      this.IiIlIliiil = -1;
      this.liIlIliiil = null;
      this.iiIlIliiil = null;
      this.IIllIliiil = null;
      this.lIllIliiil = 0;
      this.iIllIliiil = null;
      this.IlllIliiil = false;
      this.llllIliiil = 0L;
      this.illlIliiil = 0;
      this.IillIliiil = 0;
      this.lillIliiil = 0;
      this.iillIliiil = 0;
   }

   private void IIIilIIiiIIi() {
      this.IlIillIiilIi();
      this.lIilIliiil = null;
   }

   public boolean IliIlllilIi(class_2338 cell, int confirmTicks, class_2680 avoidSupport, class_2338 expect, int slot) {
      if (!this.IlIlIliiil && cell != null && avoidSupport != null && confirmTicks >= 0 && confirmTicks <= 8) {
         this.IlIillIiilIi();
         this.lIilIliiil = null;
         this.llIlIliiil = false;
         this.ilIlIliiil = cell.method_10062();
         this.IiIlIliiil = confirmTicks;
         this.liIlIliiil = avoidSupport;
         this.iiIlIliiil = expect == null ? null : expect.method_10062();
         this.lIllIliiil = Math.max(1, slot);
         this.IlIlIliiil = true;
         return true;
      } else {
         return false;
      }
   }

   public boolean iliIiiliiiii() {
      return this.IlIlIliiil && this.iIllIliiil != null;
   }

   public boolean lIiiIiIlilli() {
      return this.IlIlIliiil;
   }

   public IlIIiIIillIIiIIi(illlllllIillllll host) {
      this(host, Integer.MAX_VALUE);
   }

   public lilIillliilIilll iIlIlllllill() {
      if (!this.IlIlIliiil) {
         return lilIillliilIilll.IiiIlIlill;
      } else {
         class_310 var1 = class_310.method_1551();
         class_746 var2 = var1.field_1724;
         class_638 var3 = var1.field_1687;
         if (var2 != null && var3 != null) {
            class_2680 var4 = var3.method_8320(this.ilIlIliiil);
            if (this.llIlIliiil ? !this.IIllIliiil.test(var4) : !var4.method_27852(this.liIlIliiil.method_26204())) {
               if (!this.llIlIliiil && !lliiIliliiIl.lIiiIiIlilli(this.ilIlIliiil)) {
                  return this.Iiilliiliiil(IiIiliIiiiIi<"IiIiliIiiiIi","waVoejjkYjbLeb+HWU/a0YJ+TnOj9TKiY4gU0cS6yO96Dgo=">());
               } else {
                  float var5 = this.IIIlIliiil.IliIlllilIi();
                  float var6 = this.IIIlIliiil.liiiIIllIl();
                  long var7 = this.IIIlIliiil.IIillIiliIil();
                  if (this.IlllIliiil) {
                     if (var7 - this.llllIliiil <= (long)this.lIllIliiil) {
                        this.IIIlIliiil.iliIiiliiiii(var5, var6);
                        return lilIillliilIilll.iiiIlIlill;
                     }

                     if (this.illlIliiil >= 1) {
                        return this.Iiilliiliiil(IiIiliIiiiIi<"IiIiliIiiiIi","z9OD5/9HzU6qBdQIqKZZ6KSMDzWxywNzzOWpi3tSdgpxgC8ND8U=">());
                     }

                     this.illlIliiil++;
                     this.IlllIliiil = false;
                     this.iIllIliiil = null;
                  }

                  double var9 = this.IIIlIliiil.Iilllilliill();
                  class_243 var11 = var2.method_33571();
                  if (this.iIllIliiil == null || !this.Illlllllilll(this.iIllIliiil, var11, var9)) {
                     this.iIllIliiil = this.IIillIiliIil(var11, var9, var5, var6);
                     if (this.iIllIliiil == null) {
                        if (++this.IillIliiil >= 3) {
                           return this.Iiilliiliiil(IiIiliIiiiIi<"IiIiliIiiiIi","Ah9zqTSl5V+azkGBzN9MXA6RkYTmsTyw8Rr3UBs2JII51eXWKwXsiKtAUCE=">());
                        }

                        this.IIIlIliiil.lIiiIiIlilli(class_243.method_24953(this.ilIlIliiil), false);
                        return lilIillliilIilll.liiIlIlill;
                     }
                  }

                  this.IillIliiil = 0;
                  if (!this.llIlIliiil && iliilliIiiilli.IiIiliIiiiIi(this.iIllIliiil.method_17777())) {
                     class_3965 var12 = this.IIillIiliIil(var11, var9, var5, var6);
                     if (var12 != null && !iliilliIiiilli.IiIiliIiiiIi(var12.method_17777())) {
                        this.iIllIliiil = var12;
                     }
                  }

                  if (!this.llIlIliiil && iliilliIiiilli.IiIiliIiiiIi(this.iIllIliiil.method_17777())) {
                     iliilliIiiilli.Iilililiiili(true);
                     this.IIIlIliiil.lIiiIiIlilli(this.iIllIliiil.method_17784(), false);
                     return lilIillliilIilll.iiiIlIlill;
                  } else if (this.Iilllilliill(var2)) {
                     if (++this.lillIliiil > 40) {
                        return this.Iiilliiliiil(IiIiliIiiiIi<"IiIiliIiiiIi","Hqfxd7B/LLCrV8l7LnzuCa2H7k8ikkFKSldM8pLoRJnt/Z56Ef4Q">());
                     } else {
                        iliilliIiiilli.Iilililiiili(false);
                        this.IIIlIliiil.lIiiIiIlilli(this.iIllIliiil.method_17784(), false);
                        return lilIillliilIilll.iiiIlIlill;
                     }
                  } else if (!this.llIlIliiil && iliilliIiiilli.Iiilliiliiil(this.ilIlIliiil, iliilliIiiilli.IIillIiliIil())) {
                     if (++this.iillIliiil > this.lIIlIliiil) {
                        return this.Iiilliiliiil(IiIiliIiiiIi<"IiIiliIiiiIi","CsfIsRr+E5BYhLrCEdZWLAXet23B78O+Sn4nfWiW6/jnyg==">());
                     } else {
                        this.IIilIliiil = var7;
                        iliilliIiiilli.Iilililiiili(true);
                        this.IIIlIliiil.lIiiIiIlilli(this.iIllIliiil.method_17784(), false);
                        return lilIillliilIilll.iiiIlIlill;
                     }
                  } else if (this.IIIlIliiil.Iiilliiliiil()) {
                     return this.IilliliilIIi(var2, var3, var9, var5, var6, var7);
                  } else if (!this.IIIlIliiil.IlIlllIlilIl(this.IiIlIliiil)) {
                     this.IIIlIliiil.lIiiIiIlilli(this.iIllIliiil.method_17784(), false);
                     return lilIillliilIilll.iiiIlIlill;
                  } else {
                     class_2350 var17 = this.llIlIliiil ? null : this.iIllIliiil.method_17780();
                     class_3965 var13 = IiIiiiilliIiiiil.IliIlllilIi(this.iIllIliiil.method_17777(), var17, var9, var5, var6);
                     if (var13 == null) {
                        this.IIIlIliiil.lIiiIiIlilli(this.iIllIliiil.method_17784(), false);
                        return lilIillliilIilll.liiIlIlill;
                     } else if (this.IIIlIliiil.IilliliilIIi() > 1.9) {
                        float[] var18 = lllIliIlillIliIl.iIlllIllll(var11, var5, var6, var13.method_17777(), var17, IilIIilllilIIill.iIlIlllllill());
                        if (var18 != null) {
                           this.IIIlIliiil.iliIiiliiiii(var18[0], var18[1]);
                        } else {
                           this.IIIlIliiil.iliIiiliiiii(var5, var6);
                        }

                        return lilIillliilIilll.iiiIlIlill;
                     } else {
                        lIIiIiiIIiIi var14 = this.IIIlIliiil.Illlllllilll();
                        long var15 = this.IIIlIliiil.Ililllililil();
                        if (this.IIIlIliiil.iIlIlllllill()
                           && this.IIIlIliiil.IIIllIIliIIl()
                           && (var14 == null || var14.Ililllililil(var7) && !var14.Iiilliiliiil(var5, var6, var15))
                           && (this.llIlIliiil || var3.method_8628(this.liIlIliiil, this.ilIlIliiil, class_3726.method_16194()))
                           && (!this.llIlIliiil || !this.IIIlIliiil.IiIlliIliiIl() && !var2.method_21823())) {
                           IiIiiiilliIiiiil.iliIiiliiiii(var13);
                           if (var14 != null) {
                              var14.IilliliilIIi(var15, var7, var5, var6);
                           }

                           this.IIIlIliiil.iliIiiliiiii(var5, var6);
                           this.IlllIliiil = true;
                           this.llllIliiil = var7;
                           return lilIillliilIilll.IIIllIlill;
                        } else {
                           this.IIIlIliiil.iliIiiliiiii(var5, var6);
                           return lilIillliilIilll.iiiIlIlill;
                        }
                     }
                  }
               }
            } else {
               this.IIIilIIiiIIi();
               return lilIillliilIilll.lIIllIlill;
            }
         } else {
            return this.Iiilliiliiil(IiIiliIiiiIi<"IiIiliIiiiIi","96W4lr11r1Cy1Es5+h3k8cKnXi3GP5LAdmnS3gsiwm6ZH4NY">());
         }
      }
   }

   private class_3965 IIillIiliIil(class_243 reach, double eye, float sp, float sy) {
      long var19 = -8944193111232386452L;
      if (this.llIlIliiil) {
         return this.Ililllililil(IiIiiiilliIiiiil.iIlIlllllill(this.ilIlIliiil, eye, sp, sy), iiiIIliiil, null, eye, sp, sy);
      } else {
         class_3965 var6 = null;
         double var7 = Double.MAX_VALUE;
         class_2350[] var9 = iiiIIliiil;
         var19 ^= ((long)var9.length << 32 ^ var19) & -1L << 32;

         for (long var22 = var19 ^ (0L ^ var19) & -1L >>> 32; (int)var22 < (int)(var22 >>> 32); var22 ^= (var22 ^ var22 + (long)1) & -1L >>> 32) {
            class_2350 var12 = var9[(int)var22];
            class_2338 var13 = this.ilIlIliiil.method_10093(var12);
            if (!var13.equals(this.iiIlIliiil) && !lliiIliliiIl.lIiiIiIlilli(var13)) {
               class_2350 var14 = var12.method_10153();
               if (lllIliIlillIliIl.IIillIiliIil(var13, var14)) {
                  class_3965 var15 = IiIiiiilliIiiiil.liiiIIllIl(var13, new class_2350[]{var14}, var14, eye, sp, sy);
                  if (var15 != null) {
                     float[] var16 = ilIiiIiIii.Ililllililil(reach, var15.method_17784());
                     double var17 = liiIIliliiiIIlil.Iilllilliill(sp, sy, var16[0], var16[1])
                        + (iliilliIiiilli.lIiiIiIlilli(var13) ? 360.0 : 0.0)
                        + (iliilliIiiilli.IiIiliIiiiIi(var13) ? 720.0 : 0.0);
                     if (var17 < var7) {
                        var7 = var17;
                        var6 = var15;
                     }
                  }
               }
            }
         }

         return var6 == null ? null : this.Ililllililil(var6, new class_2350[]{var6.method_17780()}, var6.method_17780(), eye, sp, sy);
      }
   }

   private lilIillliilIilll IilliliilIIi(class_746 sy, class_638 reach, double tick, float sp, float player, long world) {
      class_2350 var9 = this.llIlIliiil ? null : this.iIllIliiil.method_17780();
      class_3965 var10 = IiIiiiilliIiiiil.IliIlllilIi(this.iIllIliiil.method_17777(), var9, tick, sp, player);
      if (var10 == null) {
         this.IIIlIliiil.IlIillIiilIi(this.iIllIliiil.method_17784());
         return lilIillliilIilll.liiIlIlill;
      } else {
         lIIiIiiIIiIi var11 = this.IIIlIliiil.Illlllllilll();
         long var12 = this.IIIlIliiil.Ililllililil();
         if (this.IIIlIliiil.iIlIlllllill()
            && this.IIIlIliiil.IIIllIIliIIl()
            && (var11 == null || var11.Ililllililil(world))
            && (this.llIlIliiil || reach.method_8628(this.liIlIliiil, this.ilIlIliiil, class_3726.method_16194()))
            && (!this.llIlIliiil || !this.IIIlIliiil.IiIlliIliiIl() && !sy.method_21823())) {
            if (!this.IIIlIliiil.IIIilIIiiIIi(this.IiIlIliiil)) {
               this.IIIlIliiil.iliIiiliiiii(sp, player);
               return lilIillliilIilll.iiiIlIlill;
            } else {
               IiIiiiilliIiiiil.iliIiiliiiii(var10);
               if (var11 != null) {
                  var11.lIiiIiIlilli(var12, world, sp, player, true);
               }

               this.IIIlIliiil.iliIiiliiiii(sp, player);
               this.IlllIliiil = true;
               this.llllIliiil = world;
               return lilIillliilIilll.IIIllIlill;
            }
         } else {
            this.IIIlIliiil.iliIiiliiiii(sp, player);
            return lilIillliilIilll.iiiIlIlill;
         }
      }
   }

   private class_3965 Ililllililil(class_3965 sp, class_2350[] faces, class_2350 sy, double reach, float near, float side) {
      return this.iIIlIliiil && sp != null
         ? IiIiiiilliIiiiil.IilliliilIIi(sp, faces, sy, reach, near, side, this.ilIlIliiil, lIlllIIliIlllIIl.liiiIIllIl())
         : sp;
   }

   public IlIIiIIillIIiIIi(illlllllIillllll entityWaitMax, int host) {
      this(entityWaitMax, host, false);
   }

   public boolean IIIllIIliIIl() {
      return this.IlIlIliiil && !this.llIlIliiil && this.iillIliiil > 0 && this.IIIlIliiil.IIillIiliIil() - this.IIilIliiil <= 1L;
   }

   public boolean liiiIIllIl(class_2338 slot, int confirmTicks, Predicate<class_2680> done, int block) {
      if (!this.IlIlIliiil && slot != null && done != null && confirmTicks >= 0 && confirmTicks <= 8) {
         this.IlIillIiilIi();
         this.lIilIliiil = null;
         this.llIlIliiil = true;
         this.ilIlIliiil = slot.method_10062();
         this.IiIlIliiil = confirmTicks;
         this.IIllIliiil = done;
         this.lIllIliiil = Math.max(1, block);
         this.IlIlIliiil = true;
         return true;
      } else {
         return false;
      }
   }

   private boolean Iilllilliill(class_746 player) {
      if (this.iIllIliiil == null) {
         return false;
      } else {
         return !this.llIlIliiil
            ? iliilliIiiilli.lIiiIiIlilli(this.iIllIliiil.method_17777())
            : iliilliIiiilli.lIiiIiIlilli(this.ilIlIliiil) && player.method_31548().method_5438(this.IiIlIliiil).method_7909() instanceof class_1747;
      }
   }

   private boolean Illlllllilll(class_3965 reach, class_243 h, double eye) {
      class_2338 var5 = reach.method_17777();
      class_2350 var6 = reach.method_17780();
      if (this.llIlIliiil) {
         if (!var5.equals(this.ilIlIliiil)) {
            return false;
         }
      } else {
         if (!var5.method_10093(var6).equals(this.ilIlIliiil) || var5.equals(this.iiIlIliiil)) {
            return false;
         }

         if (lliiIliliiIl.lIiiIiIlilli(var5) || !lllIliIlillIliIl.IIillIiliIil(var5, var6)) {
            return false;
         }
      }

      class_243 var7 = reach.method_17784();
      if (h.method_1025(var7) > eye * eye) {
         return false;
      } else {
         float[] var8 = ilIiiIiIii.Ililllililil(h, var7);
         return IiIiiiilliIiiiil.IliIlllilIi(var5, this.llIlIliiil ? null : var6, eye, var8[0], var8[1]) != null;
      }
   }

   public void IiIlliIliiIl() {
      this.IlIillIiilIi();
      this.lIilIliiil = null;
   }

   public int IlIlllIlilIl() {
      if (this.IlIlIliiil && this.iIllIliiil != null) {
         class_310 var1 = class_310.method_1551();
         class_746 var2 = var1.field_1724;
         if (var2 != null && var1.field_1687 != null) {
            float var3 = this.IIIlIliiil.IliIlllilIi();
            float var4 = this.IIIlIliiil.liiiIIllIl();
            if (!this.llIlIliiil && iliilliIiiilli.IiIiliIiiiIi(this.iIllIliiil.method_17777())) {
               return 1;
            } else if (IiIiiiilliIiiiil.IliIlllilIi(
                  this.iIllIliiil.method_17777(), this.llIlIliiil ? null : this.iIllIliiil.method_17780(), this.IIIlIliiil.Iilllilliill(), var3, var4
               )
               != null) {
               return 0;
            } else {
               float[] var5 = ilIiiIiIii.Ililllililil(var2.method_33571(), this.iIllIliiil.method_17784());
               return (int)Math.ceil(liiIIliliiiIIlil.Iilllilliill(var3, var4, var5[0], var5[1]) / 15.0);
            }
         } else {
            return Integer.MAX_VALUE;
         }
      } else {
         return Integer.MAX_VALUE;
      }
   }
}
