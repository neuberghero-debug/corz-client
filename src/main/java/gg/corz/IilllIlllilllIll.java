package gg.corz;

import java.util.List;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3532;

public final class IilllIlllilllIll {
   private long llIIIIilll;
   private long lIIIIIilll;
   private static final int iIiiiillll = 20;
   private static final class_310 IIiiiillll = class_310.method_1551();
   private static final int Iliiiillll = 30;
   private double liiiiillll = 2.5;
   private final lilIIIliiilIIIli iliiiillll;
   private class_2338 Iiiiiillll;
   private class_243 iIIIIIilll;
   private int IlIIIIilll;
   private int IIIIIIilll;
   private static final int lliiiillll = 90;
   private List<class_2338> iiiiiillll;
   private static final float lIiiiillll = 32.0F;

   public class_2338 liiiIIllIl() {
      return this.Iiiiiillll;
   }

   public void iIlIlllllill() {
      this.Iiiiiillll = null;
      this.iiiiiillll = null;
      this.IIIIIIilll = 0;
      this.IlIIIIilll = 0;
      this.IIillIiliIil();
   }

   private List<class_2338> IIIllIIliIIl(class_2338 start, class_2338 goal) {
      try {
         return IIIlIIIilIIlIIIi.IlIllllIll(start, goal);
      } catch (Exception var4) {
         return null;
      }
   }

   private boolean IIlllIlliIll(class_2338 depth, int pos) {
      long var4 = -6663744613121401474L;

      for (long var6 = var4 ^ (4294967296L ^ var4) & -1L << 32; (int)(var6 >>> 32) <= pos; var6 += 4294967296L) {
         if (this.IiIlliIliiIl(depth.method_10087((int)(var6 >>> 32)))) {
            return false;
         }
      }

      return true;
   }

   public llIlllilIlll IilliliilIIi() {
      long var11 = 2982177803922807509L;
      this.llIIIIilll++;
      if (IIiiiillll.field_1724 != null && IIiiiillll.field_1687 != null && this.Iiiiiillll != null) {
         class_243 var1 = IIiiiillll.field_1724.method_73189();
         class_243 var2 = class_243.method_24953(this.Iiiiiillll);
         double var3 = Math.hypot(var2.field_1352 - var1.field_1352, var2.field_1350 - var1.field_1350);
         double var5 = Math.abs(var2.field_1351 - var1.field_1351);
         if (var3 <= this.liiiiillll && var5 <= 2.0) {
            this.IIillIiliIil();
            return llIlllilIlll.IilllIIililllIIi;
         } else {
            var11 ^= (
                  (long)(
                           this.iiiiiillll != null
                                 && this.IIIIIIilll < this.iiiiiillll.size()
                                 && this.llIIIIilll - this.lIIIIIilll <= 100L
                                 && this.IlIIIIilll != 30
                              ? 0
                              : 1
                        )
                        << 32
                     ^ var11
               )
               & -1L << 32;
            if ((int)(var11 >>> 32) != 0 && this.llIIIIilll - this.lIIIIIilll >= 20L) {
               this.lIIIIIilll = this.llIIIIilll;
               List var8 = this.IIIllIIliIIl(IIiiiillll.field_1724.method_24515(), this.Iiiiiillll);
               if (var8 != null && var8.size() > 1) {
                  this.iiiiiillll = var8;
                  this.IIIIIIilll = 0;
               } else {
                  this.iiiiiillll = null;
               }
            }

            class_2338 var13 = this.lIiiIiIlilli(var1);
            this.iliIiiliiiii(var13 != null ? var13 : this.Iiiiiillll);
            if (this.iIIIIIilll != null) {
               double var9 = Math.hypot(var1.field_1352 - this.iIIIIIilll.field_1352, var1.field_1350 - this.iIIIIIilll.field_1350);
               if (var9 < 0.03) {
                  this.IlIIIIilll++;
               } else {
                  this.IlIIIIilll = 0;
               }
            }

            this.iIIIIIilll = var1;
            if (this.IlIIIIilll > 12 && this.IlIIIIilll < 20 && IIiiiillll.field_1724.method_24828()) {
               IIiiiillll.field_1690.field_1903.method_23481(true);
            }

            if (this.IlIIIIilll >= 90) {
               this.IIillIiliIil();
               return llIlllilIlll.iilllIIiIIillIIi;
            } else {
               return this.iiiiiillll == null && !this.IlIlllIlilIl() ? llIlllilIlll.lIillIIiiIillIIi : llIlllilIlll.lllllIIiillllIIi;
            }
         }
      } else {
         return llIlllilIlll.iIlllIIiIllllIIi;
      }
   }

   public IilllIlllilllIll(lilIIIliiilIIIli rotation) {
      this.lIIIIIilll = -4611686018427387904L;
      this.iliiiillll = rotation;
   }

   private class_2338 lIiiIiIlilli(class_243 self) {
      if (this.iiiiiillll != null && !this.iiiiiillll.isEmpty()) {
         while (this.IIIIIIilll < this.iiiiiillll.size() - 1) {
            class_2338 var2 = this.iiiiiillll.get(this.IIIIIIilll);
            double var3 = Math.hypot((double)var2.method_10263() + 0.5 - self.field_1352, (double)var2.method_10260() + 0.5 - self.field_1350);
            if (!(var3 <= 1.3)) {
               break;
            }

            this.IIIIIIilll++;
         }

         return this.IIIIIIilll < this.iiiiiillll.size() ? this.iiiiiillll.get(this.IIIIIIilll) : this.Iiiiiillll;
      } else {
         return this.Iiiiiillll;
      }
   }

   private boolean IiIlliIliiIl(class_2338 p) {
      class_2680 var2 = IIiiiillll.field_1687.method_8320(p);
      return !var2.method_26215() && !var2.method_45474() && !var2.method_26220(IIiiiillll.field_1687, p).method_1110();
   }

   private boolean IlIlllIlilIl() {
      return this.Iiiiiillll != null;
   }

   private float Iilllilliill(class_243 target) {
      class_243 var2 = IIiiiillll.field_1724.method_33571();
      double var3 = target.field_1352 - var2.field_1352;
      double var5 = target.field_1351 - var2.field_1351;
      double var7 = target.field_1350 - var2.field_1350;
      double var9 = Math.sqrt(var3 * var3 + var7 * var7);
      return (float)Math.toDegrees(Math.atan2(-var5, var9));
   }

   private void IIillIiliIil() {
      IIiiiillll.field_1690.field_1894.method_23481(false);
      IIiiiillll.field_1690.field_1903.method_23481(false);
      illIilIilIil.IliIlllilIi(IIiiiillll.field_1690.field_1832, false);
   }

   private void iliIiiliiiii(class_2338 target) {
      long var10 = 6527279016625313473L;
      if (target != null) {
         class_243 var2 = class_243.method_24953(target);
         float var3 = this.Illlllllilll(var2);
         float var4 = class_3532.method_15363(this.Iilllilliill(var2), -25.0F, 25.0F);
         this.iliiiillll.iIlIlllllill(var3, var4, 0);
         float var5 = Math.abs(class_3532.method_15393(var3 - IIiiiillll.field_1724.method_36454()));
         if (!(var5 >= 32.0F)) {
            class_2338 var6 = IIiiiillll.field_1724.method_24515();
            class_2338 var7 = var6.method_10093(class_2350.method_10150((double)IIiiiillll.field_1724.method_36454()));
            var10 ^= ((long)(!this.IiIlliIliiIl(var7.method_10074()) && this.IIlllIlliIll(var7, 4) ? 1 : 0) << 32 ^ var10) & -1L << 32;
            var10 ^= ((long)(!var7.equals(target) && !var7.method_10074().equals(target) ? 0 : 1) ^ var10) & -1L >>> 32;
            if ((int)(var10 >>> 32) != 0 && (int)var10 == 0) {
               illIilIilIil.IliIlllilIi(IIiiiillll.field_1690.field_1832, true);
            } else {
               IIiiiillll.field_1690.field_1894.method_23481(true);
               if (this.IiIlliIliiIl(var7) && !this.IiIlliIliiIl(var7.method_10084()) && IIiiiillll.field_1724.method_24828()) {
                  IIiiiillll.field_1690.field_1903.method_23481(true);
               }

               if (target.method_10264() > var6.method_10264() + 1 && IIiiiillll.field_1724.method_24828()) {
                  IIiiiillll.field_1690.field_1903.method_23481(true);
               }
            }
         }
      }
   }

   public void IliIlllilIi(class_2338 arriveDist, double standSpot) {
      if (arriveDist == null) {
         this.iIlIlllllill();
      } else {
         if (!arriveDist.equals(this.Iiiiiillll)) {
            this.Iiiiiillll = arriveDist;
            this.iiiiiillll = null;
            this.IIIIIIilll = 0;
            this.IlIIIIilll = 0;
         }

         this.liiiiillll = Math.max(0.6, standSpot);
      }
   }

   private float Illlllllilll(class_243 target) {
      double var2 = target.field_1352 - IIiiiillll.field_1724.method_23317();
      double var4 = target.field_1350 - IIiiiillll.field_1724.method_23321();
      return (float)Math.toDegrees(Math.atan2(-var2, var4));
   }
}
