package gg.corz;

import java.util.List;
import java.util.Set;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_239;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_3965;
import net.minecraft.class_638;
import net.minecraft.class_746;
import net.minecraft.class_2350.class_2351;
import net.minecraft.class_239.class_240;

public final class lllIlIIlillIlIIl {
   private int iIliIillIl;
   private int IliiIillIl;
   private int llIiIillIl;
   private int IIIiIillIl;
   private int iiilIillIl;
   private int lIliIillIl;
   private boolean iiIiIillIl;
   private final class_310 IIilIillIl;
   private boolean liIiIillIl;
   private int lIIiIillIl;
   private int liliIillIl;
   private class_2338 iliiIillIl;
   private final ilIIIIiIiIIIIi lIilIillIl;
   private class_2338 IIliIillIl;
   private int lIiiIillIl;
   private final iilIiiIiIIiIiiIi iIilIillIl;
   private class_2338 ilIiIillIl;
   private double illiIillIl;
   private static final int[] lillIillIl = new int[]{0, 1, -1};
   private class_2350 iiliIillIl;
   private int lliiIillIl;
   private boolean IiliIillIl;
   private static final class_2350[] IillIillIl = new class_2350[]{
      class_2350.field_11043, class_2350.field_11034, class_2350.field_11035, class_2350.field_11039
   };
   private int iIIiIillIl;
   private class_2338 iIiiIillIl;
   private int IIiiIillIl;
   private List<class_2338> IiilIillIl;
   private int llliIillIl;
   private class_2351 IlliIillIl;
   private class_2338 liilIillIl;
   private long IiiiIillIl;
   private final liliIliiiliIli llilIillIl;
   private class_2338 IlIiIillIl;
   private static final int iillIillIl = 3;
   private double IiIiIillIl = Double.MAX_VALUE;
   private final llilIIIiililIIIi ililIillIl;
   private final liiiliIliiiiliIl IlilIillIl;

   public Set<class_2338> iIlIlllllill() {
      return this.llilIillIl.liiiIIllIl();
   }

   public long IiIiliIiiiIi() {
      return this.IiiiIillIl;
   }

   private boolean lilIliilIl(class_746 p, class_2338 target) {
      double var3 = IIiIllIiIl(p, target) + (double)Math.abs(p.method_31478() - target.method_10264());
      class_2338 var5 = this.IlilIillIl.IIiilIiiiIii();
      if (var5 != null && !var5.equals(this.IlIiIillIl)) {
         this.iIIiIillIl = 0;
      }

      this.IlIiIillIl = var5;
      if (this.IiIiIillIl - var3 > 0.0015) {
         this.lIIiIillIl = 0;
         this.iIIiIillIl = 0;
      } else if (var5 != null && ++this.iIIiIillIl <= 600) {
         this.lIIiIillIl = 0;
      } else {
         this.lIIiIillIl++;
      }

      this.IiIiIillIl = var3;
      return this.lIIiIillIl > 50;
   }

   private lillilliillill IllIllllIl(class_2338 pos) {
      class_638 var2 = this.IIilIillIl.field_1687;
      if (var2 == null || !this.ililIillIl.IiIiliIiiiIi(pos, 1)) {
         return lillilliillill.IIlilIlIilIlilIlIi;
      } else if (!lllIIlilillIIlil.IilliliilIIi(var2, pos)) {
         return lillilliillill.IIlilIlIilIlilIlIi;
      } else if (this.illIlIilIl(pos)) {
         return this.IlilIillIl.iliIiiliiiii(pos, this.lIlIliIlIl(), true) ? lillilliillill.ilIilIlIiIiIilIlIi : lillilliillill.IIlilIlIilIlilIlIi;
      } else {
         return this.IlilIillIl.IilliliilIIi(pos, this.lIlIliIlIl()) ? lillilliillill.ilIilIlIiIiIilIlIi : lillilliillill.IIlilIlIilIlilIlIi;
      }
   }

   public boolean IlIlllIlilIl() {
      return this.iiIiIillIl;
   }

   void Iiiiliiiiiii(class_746 p, double dx, double dz, boolean sneak) {
      double var7 = Math.toRadians((double)p.method_36454());
      double var9 = Math.sin(var7);
      double var11 = Math.cos(var7);
      double var13 = dz * var11 - dx * var9;
      double var15 = dz * var9 + dx * var11;
      this.iIilIillIl.liiiIIllIl(IIIIllIIIl(var13), IIIIllIIIl(var15), false, false, sneak);
   }

   private boolean Illlllllilll(class_746 p) {
      class_638 var2 = this.IIilIillIl.field_1687;
      if (var2 != null && this.iIliIillIl < 6) {
         class_2338 var3 = p.method_24515().method_10086(2);
         if (lllIIlilillIIlil.lIiiIiIlilli(var2, var3) || !lllIIlilillIIlil.IilliliilIIi(var2, var3)) {
            return false;
         } else if (!this.ililIillIl.IiIiliIiiiIi(var3, 1)) {
            return false;
         } else {
            this.iiIiIillIl = true;
            this.IIliIillIl = var3.method_10062();
            this.lIliIillIl = 0;
            this.iIliIillIl++;
            return true;
         }
      } else {
         return false;
      }
   }

   public liliIliiiliIli liiiIIllIl() {
      return this.llilIillIl;
   }

   private lillilliillill llIIlilIIl(class_746 w, class_1937 feet, class_2338 p, class_2338 target) {
      long var16 = 7648937871677483985L;
      long var18 = -3844655694106257058L;
      long var20 = 3850758440563907576L;
      var16 ^= ((long)(p.method_10263() == target.method_10263() && p.method_10260() == target.method_10260() ? 1 : 0) << 32 ^ var16) & -1L << 32;
      if ((int)(var16 >>> 32) != 0 && p.method_10264() < target.method_10264() && this.IIlllIlliIll(w)) {
         return lillilliillill.ilIilIlIiIiIilIlIi;
      } else if ((int)(var16 >>> 32) != 0 && p.method_10264() > target.method_10264()) {
         this.iIilIillIl.iIlIlllllill();
         class_2338 var23 = p.method_10074();
         return lllIIlilillIIlil.lIiiIiIlilli(feet, var23) ? lillilliillill.ilIilIlIiIiIilIlIi : this.IllIllllIl(var23);
      } else if ((int)(var16 >>> 32) == 0) {
         class_2350 var22 = IiiIlliiIl(this.iIiIlIliIl(p, target), p, target);
         class_2338 var7 = p.method_10093(var22);
         var16 ^= ((long)(this.llliIillIl != Integer.MIN_VALUE ? this.llliIillIl : p.method_10264() + 1) ^ var16) & -1L >>> 32;
         class_2338 var9 = new class_2338(var7.method_10263(), (int)var16, var7.method_10260());
         class_2338 var10 = new class_2338(var7.method_10263(), p.method_10264() + 1, var7.method_10260());
         var18 ^= ((long)(!lllIIlilillIIlil.lIiiIiIlilli(feet, var9) ? 1 : 0) << 32 ^ var18) & -1L << 32;
         var18 ^= ((long)(!lllIIlilillIIlil.lIiiIiIlilli(feet, var10) ? 1 : 0) ^ var18) & -1L >>> 32;
         if ((int)(var18 >>> 32) == 0 && (int)var18 == 0) {
            this.IlilIillIl.Iilililiiili();
            if (this.Iliilliiilii(w, (double)var22.method_10148(), (double)var22.method_10165()) > 50.0F) {
               this.iIilIillIl.iIlIlllllill();
               return lillilliillill.ilIilIlIiIiIilIlIi;
            } else if (!lllIIlilillIIlil.iliIiiliiiii(feet, var7.method_10074())) {
               if (this.lIilIillIl.liliIIiliiiliIIili && this.lliiIillIl <= 0 && liliIliiiliIli.IIIllIIliIIl(w)) {
                  this.Illillliilli(var22, p);
                  lillilliillill var13 = this.iIIIlIlIIl(w, feet, p, target);
                  if (var13 != null) {
                     return var13;
                  }
               }

               this.iIilIillIl.iIlIlllllill();
               return lillilliillill.IIlilIlIilIlilIlIi;
            } else {
               var20 ^= ((long)(this.lIilIillIl.illiIIiliIiliIIili && IIiIllIiIl(w, target) > 2.5 ? 1 : 0) << 32 ^ var20) & -1L << 32;
               this.iIilIillIl.IliIlllilIi(1.0F, 0.0F, false, (boolean)((int)(var20 >>> 32)));
               return lillilliillill.ilIilIlIiIiIilIlIi;
            }
         } else {
            var20 ^= (
                  (long)(
                           Math.abs(
                                    class_3532.method_15393(
                                       IliIIlIllliIIlIl.IliIlllilIi((double)var22.method_10148(), (double)var22.method_10165()) - w.method_36454()
                                    )
                                 )
                                 <= 40.0F
                              ? 1
                              : 0
                        )
                        << 32
                     ^ var20
               )
               & -1L << 32;
            var20 ^= ((long)((int)(var20 >>> 32) != 0 && this.lIilIillIl.illiIIiliIiliIIili && IIiIllIiIl(w, target) > 2.5 ? 1 : 0) ^ var20) & -1L >>> 32;
            this.iIilIillIl.IliIlllilIi((int)(var20 >>> 32) != 0 ? 1.0F : 0.0F, 0.0F, false, (boolean)((int)var20));
            lillilliillill var15 = (int)(var18 >>> 32) != 0 && this.IlilIillIl.IIlllIlliIll(var9, this.lIlIliIlIl())
               ? this.IllIllllIl(var9)
               : ((int)var18 != 0 ? this.IllIllllIl(var10) : this.IllIllllIl(var9));
            if (var15 == lillilliillill.IIlilIlIilIlilIlIi) {
               this.iIilIillIl.iIlIlllllill();
            }

            return var15;
         }
      } else {
         this.IlliIillIl = null;
         if (p.method_10264() < target.method_10264()) {
            if (this.IlilIillIl.IIlllIlliIll(target, this.lIilIillIl.iIiiIIiliIliiIIili)) {
               this.iIilIillIl.iIlIlllllill();
               return lillilliillill.liIilIlIiiiIilIlIi;
            } else {
               double var6 = (double)target.method_10263() + 0.5 - w.method_23317();
               double var8 = (double)target.method_10260() + 0.5 - w.method_23321();
               if (var6 * var6 + var8 * var8 > 0.64) {
                  this.Iiiiliiiiiii(w, var6, var8, false);
                  return lillilliillill.ilIilIlIiIiIilIlIi;
               } else if (target.method_10264() - p.method_10264() > 4 && this.IIlllIlliIll(w)) {
                  return lillilliillill.ilIilIlIiIiIilIlIi;
               } else {
                  this.liIiIillIl = false;
                  return lillilliillill.IIlilIlIilIlilIlIi;
               }
            }
         } else {
            this.iIilIillIl.iIlIlllllill();
            return lillilliillill.ilIilIlIiIiIilIlIi;
         }
      }
   }

   public void IiIIlliIIl(int y) {
      this.llliIillIl = y;
   }

   private boolean illIlIilIl(class_2338 pos) {
      if (this.IIilIillIl.field_1765 instanceof class_3965 var2 && var2.method_17783() == class_240.field_1332 && var2.method_17777().equals(pos)) {
         return true;
      }

      return false;
   }

   public void iiIIlIIlIl(double r) {
      this.illiIillIl = Math.max(this.lIilIillIl.iIiiIIiliIliiIIili, r);
   }

   public void IIIllIIliIIl() {
      this.iiliIillIl = null;
      this.IIiiIillIl = 0;
      this.lIiiIillIl = 0;
      this.IliiIillIl = 0;
      this.lliiIillIl = 25;
      this.iIilIillIl.IliliiiIIi = false;
      this.iIilIillIl.iIiliiiIIi = 0;
      this.iIilIillIl.iIlIlllllill();
   }

   static double IIiIllIiIl(class_746 b, class_2338 p) {
      double var2 = (double)p.method_10263() + 0.5 - b.method_23317();
      double var4 = (double)p.method_10260() + 0.5 - b.method_23321();
      return var2 * var2 + var4 * var4;
   }

   private float Iliilliiilii(class_746 dx, double dz, double p) {
      float var6 = IliIIlIllliIIlIl.IliIlllilIi(dz, p);
      float var7 = Math.abs(class_3532.method_15393(var6 - dx.method_36454()));
      if (!this.IiliIillIl) {
         if (var7 < 8.0F) {
            return 0.0F;
         }

         this.IiliIillIl = true;
      }

      this.IiliIillIl = IliIIlIllliIIlIl.liiiIIllIl(dx, var6, 12.0F);
      return var7;
   }

   public class_2338 IIIilIIiiIIi() {
      return this.liilIillIl;
   }

   private boolean Iilililiiili(class_746 feet, class_1937 p, class_2338 w, class_2338 target) {
      long var18 = -1757282637361146009L;
      long var20 = 3906107819076083892L;
      long var22 = 863185557319776279L;
      long var24 = -4750501908649244792L;
      var18 ^= (
            (long)(this.IiilIillIl != null && target.equals(this.liilIillIl) && this.iiilIillIl < this.IiilIillIl.size() && ++this.IIIiIillIl <= 40 ? 0 : 1)
                  << 32
               ^ var18
         )
         & -1L << 32;
      if ((int)(var18 >>> 32) != 0) {
         IiIlliIlliIlliIl var6 = new IiIlliIlliIlliIl(p, w, 3);
         this.IiilIillIl = var6.IliIlllilIi(target);
         if (this.IiilIillIl == null) {
            List var7 = null;
            class_2350[] var8 = IillIillIl;
            var18 ^= ((long)var8.length ^ var18) & -1L >>> 32;
            var20 ^= (0L ^ var20) & -1L << 32;

            while ((int)(var20 >>> 32) < (int)var18) {
               class_2350 var11 = var8[(int)(var20 >>> 32)];
               class_2338 var12 = null;
               int[] var13 = lillIillIl;
               var20 ^= ((long)var13.length ^ var20) & -1L >>> 32;

               for (var22 ^= (0L ^ var22) & -1L << 32; (int)(var22 >>> 32) < (int)var20; var22 += 4294967296L) {
                  var22 ^= ((long)var13[(int)(var22 >>> 32)] ^ var22) & -1L >>> 32;
                  class_2338 var17 = target.method_10093(var11).method_10086((int)var22);
                  if (lllIIlilillIIlil.IIIllIIliIIl(p, var17)) {
                     var12 = var17;
                     break;
                  }
               }

               List var27;
               if (var12 != null && (var27 = var6.IliIlllilIi(var12)) != null && !var27.isEmpty() && (var7 == null || var27.size() < var7.size())) {
                  var7 = var27;
               }

               var20 += 4294967296L;
            }

            this.IiilIillIl = var7;
         }

         if (this.IiilIillIl != null && !this.IiilIillIl.isEmpty()) {
            var24 ^= (
                  (long)(
                           Math.abs(target.method_10263() - w.method_10263())
                              + Math.abs(target.method_10264() - w.method_10264())
                              + Math.abs(target.method_10260() - w.method_10260())
                        )
                        << 32
                     ^ var24
               )
               & -1L << 32;
            if (this.IiilIillIl.size() > (int)(var24 >>> 32) * 4 + 20) {
               this.IiilIillIl = null;
            }
         }

         this.liilIillIl = target;
         this.iiilIillIl = 0;
         this.IIIiIillIl = 0;
      }

      if (this.IiilIillIl != null && !this.IiilIillIl.isEmpty()) {
         while (this.iiilIillIl < this.IiilIillIl.size() && this.IiilIillIl.get(this.iiilIillIl).equals(w)) {
            this.iiilIillIl++;
         }

         if (this.iiilIillIl >= this.IiilIillIl.size()) {
            this.IiilIillIl = null;
            return false;
         } else {
            class_2338 var26 = this.IiilIillIl.get(this.iiilIillIl);
            if (Math.abs(var26.method_10263() - w.method_10263()) <= 1 && Math.abs(var26.method_10260() - w.method_10260()) <= 1) {
               var24 ^= ((long)(this.iiilIillIl == this.IiilIillIl.size() - 1 ? 1 : 0) << 32 ^ var24) & -1L << 32;
               var24 ^= ((long)(var26.method_10264() > w.method_10264() ? 1 : 0) ^ var24) & -1L >>> 32;
               var18 ^= ((long)(IIiIllIiIl(feet, target) > 2.5 ? 1 : 0) ^ var18) & -1L >>> 32;
               this.IIiilIiiiIii(feet, var26, (boolean)((int)(var24 >>> 32)), (boolean)((int)var24), (boolean)((int)var18));
               return true;
            } else {
               this.IiilIillIl = null;
               return false;
            }
         }
      } else {
         return false;
      }
   }

   private static float IIIIllIIIl(double v) {
      double var2 = Math.abs(v);
      if (var2 < 0.08) {
         return 0.0F;
      } else if (var2 < 0.3) {
         return v > 0.0 ? 0.35F : -0.35F;
      } else {
         return v > 0.0 ? 1.0F : -1.0F;
      }
   }

   private lillilliillill iIIIlIlIIl(class_746 target, class_1937 w, class_2338 feet, class_2338 p) {
      long var33 = -3750401257003952313L;
      long var35 = 415680930433723013L;
      class_2350 var5 = this.iiliIillIl;
      if (var5 == null) {
         return null;
      } else {
         if (this.IliiIillIl > 0) {
            this.IliiIillIl--;
         }

         if (feet.equals(p)) {
            this.IIIllIIliIIl();
            return lillilliillill.liIilIlIiiiIilIlIi;
         } else {
            double var6 = (double)p.method_10263() + 0.5 - target.method_23317();
            double var8 = (double)p.method_10260() + 0.5 - target.method_23321();
            if (var6 * var6 + var8 * var8 <= 0.49 && Math.abs(target.method_23318() - (double)p.method_10264()) < 0.6) {
               this.IIIllIIliIIl();
               return lillilliillill.liIilIlIiiiIilIlIi;
            } else {
               class_2338 var10 = feet.method_10074();
               class_2338 var11 = feet.method_10093(var5);
               class_2338 var12 = var11.method_10074();
               var33 ^= ((long)lllIIlilillIIlil.iliIiiliiiii(w, var10) << 32 ^ var33) & -1L << 32;
               var33 ^= ((long)lllIIlilillIIlil.iliIiiliiiii(w, var12) ^ var33) & -1L >>> 32;
               if ((int)(var33 >>> 32) != 0 && (int)var33 != 0 && !this.llilIillIl.liiiIIllIl().contains(var12)) {
                  this.IIIllIIliIIl();
                  IliIIlIllliIIlIl.iIlIlllllill(target, IliIIlIllliIIlIl.IliIlllilIi((double)var5.method_10148(), (double)var5.method_10165()));
                  target.method_36457(15.0F);
                  return lillilliillill.ilIilIlIiIiIilIlIi;
               } else {
                  if (!feet.equals(this.iIiiIillIl)) {
                     this.iIiiIillIl = feet.method_10062();
                     this.IIiiIillIl = 0;
                  }

                  if (++this.IIiiIillIl > 140) {
                     this.IIIllIIliIIl();
                     return lillilliillill.IIlilIlIilIlilIlIi;
                  } else {
                     var35 ^= ((long)liliIliiiliIli.iliIiiliiiii(target) << 32 ^ var35) & -1L << 32;
                     if ((int)(var35 >>> 32) < 0) {
                        this.IIIllIIliIIl();
                        return lillilliillill.IIlilIlIilIlilIlIi;
                     } else {
                        if (target.method_31548().method_67532() != (int)(var35 >>> 32)) {
                           target.method_31548().method_61496((int)(var35 >>> 32));
                        }

                        if ((int)(var33 >>> 32) == 0) {
                           this.IlilIillIl.Iilililiiili();
                           this.iIilIillIl.liiiIIllIl(0.0F, 0.0F, false, false, true);
                           this.iIilIillIl.IliliiiIIi = true;
                           this.iIilIillIl.iIiliiiIIi = 6;
                           if (this.IliiIillIl <= 0 && this.llilIillIl.IlIlllIlilIl(target, var10, this.lIlIliIlIl())) {
                              this.lIiiIillIl = 0;
                              this.IliiIillIl = 4;
                           } else if (++this.lIiiIillIl > 40) {
                              this.IIIllIIliIIl();
                              return lillilliillill.IIlilIlIilIlilIlIi;
                           }

                           return lillilliillill.ilIilIlIiIiIilIlIi;
                        } else if (lllIIlilillIIlil.lIiiIiIlilli(w, var11) && lllIIlilillIIlil.lIiiIiIlilli(w, var11.method_10084())) {
                           double var16 = (double)var10.method_10263() + 0.5;
                           double var18 = (double)var10.method_10260() + 0.5;
                           float var20 = IliIIlIllliIIlIl.IliIlllilIi((double)(-var5.method_10148()), (double)(-var5.method_10165()));
                           double var21 = (double)var5.method_10148() * (target.method_23321() - var18)
                              - (double)var5.method_10165() * (target.method_23317() - var16);
                           float var23 = class_3532.method_15363((float)(var21 * 25.0), -6.0F, 6.0F);
                           IliIIlIllliIIlIl.liiiIIllIl(target, var20 - var23, 25.0F);
                           float var24 = target.method_36455();
                           target.method_36457(var24 + class_3532.method_15363(78.0F - var24, -15.0F, 15.0F));
                           this.iIilIillIl.IliliiiIIi = true;
                           this.iIilIillIl.iIiliiiIIi = Math.max(this.iIilIillIl.iIiliiiIIi, 4);
                           this.iIilIillIl.liiiIIllIl(-1.0F, 0.0F, false, false, true);
                           if ((int)var33 != 0) {
                              this.lIiiIillIl = 0;
                              return lillilliillill.ilIilIlIiIiIilIlIi;
                           } else {
                              double var25 = (target.method_23317() - var16) * (double)var5.method_10148()
                                 + (target.method_23321() - var18) * (double)var5.method_10165();
                              if (!(var25 < 0.2) && this.IliiIillIl <= 0) {
                                 var35 ^= (0L ^ var35) & -1L >>> 32;
                                 class_239 var28 = this.IIilIillIl.field_1765;
                                 if (var28 instanceof class_3965 var29 && var28.method_17783() == class_240.field_1332) {
                                    class_2338 var30 = var29.method_17777();
                                    class_2350 var31 = var29.method_17780();
                                    if (var30.method_10093(var31).equals(var12) || var30.equals(var10) && var31 == var5) {
                                       class_1269 var32 = this.IIilIillIl.field_1761.method_2896(target, class_1268.field_5808, var29);
                                       if (var32.method_23665()) {
                                          target.method_6104(class_1268.field_5808);
                                          var35 ^= (1L ^ var35) & -1L >>> 32;
                                          this.IliiIillIl = 4;
                                          this.llilIillIl.IilliliilIIi(var12);
                                       }
                                    }
                                 }

                                 if ((int)var35 == 0 && this.llilIillIl.IlIlllIlilIl(target, var12, this.lIlIliIlIl())) {
                                    var35 ^= (1L ^ var35) & -1L >>> 32;
                                    this.IliiIillIl = 4;
                                 }

                                 if ((int)var35 != 0) {
                                    this.lIiiIillIl = 0;
                                    this.IIiiIillIl = 0;
                                 } else if (++this.lIiiIillIl > 60) {
                                    this.IIIllIIliIIl();
                                    return lillilliillill.IIlilIlIilIlilIlIi;
                                 }

                                 return lillilliillill.ilIilIlIiIiIilIlIi;
                              } else {
                                 return lillilliillill.ilIilIlIiIiIilIlIi;
                              }
                           }
                        } else {
                           this.IIIllIIliIIl();
                           IliIIlIllliIIlIl.iIlIlllllill(target, IliIIlIllliIIlIl.IliIlllilIi((double)var5.method_10148(), (double)var5.method_10165()));
                           target.method_36457(15.0F);
                           return lillilliillill.ilIilIlIiIiIilIlIi;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public List<class_2338> Iiilliiliiil() {
      return this.IiilIillIl;
   }

   private boolean Iilllilliill(class_746 p) {
      class_638 var2 = this.IIilIillIl.field_1687;
      if (var2 != null && this.IIliIillIl != null) {
         this.liIiIillIl = true;
         this.iIilIillIl.iIlIlllllill();
         if (lllIIlilillIIlil.lIiiIiIlilli(var2, this.IIliIillIl)) {
            this.llilIillIl.IliIlllilIi();
            return this.IIillIiliIil(true);
         } else {
            return ++this.lIliIillIl <= 200 && this.IlilIillIl.iliIiiliiiii(this.IIliIillIl, this.lIlIliIlIl(), true) ? true : this.IIillIiliIil(false);
         }
      } else {
         return this.IIillIiliIil(false);
      }
   }

   public boolean IiIlliIliiIl(class_746 p) {
      return this.IIlllIlliIll(p);
   }

   public void IliIlllilIi() {
      this.lIIiIillIl = 0;
      this.iIIiIillIl = 0;
      this.IlIiIillIl = null;
      this.llIiIillIl = 0;
      this.ilIiIillIl = null;
      this.IiIiIillIl = Double.MAX_VALUE;
      this.IiilIillIl = null;
      this.liilIillIl = null;
      this.iiilIillIl = 0;
      this.IIIiIillIl = 0;
      this.liIiIillIl = false;
      this.iiIiIillIl = false;
      this.IIliIillIl = null;
      this.lIliIillIl = 0;
      this.iIliIillIl = 0;
      this.IlliIillIl = null;
      this.iiliIillIl = null;
      this.IIiiIillIl = 0;
      this.lIiiIillIl = 0;
      this.iIiiIillIl = null;
      this.IliiIillIl = 0;
      this.IiliIillIl = false;
      this.llilIillIl.IliIlllilIi();
   }

   private boolean Ililllililil(class_746 p) {
      if (!p.method_24828()) {
         return false;
      } else {
         class_2338 var2 = p.method_24515();
         double var3 = (double)var2.method_10263() + 0.5 - p.method_23317();
         double var5 = (double)var2.method_10260() + 0.5 - p.method_23321();
         if ((Math.abs(var3) > 0.15 || Math.abs(var5) > 0.15) && this.liliIillIl <= 40) {
            this.liliIillIl++;
            this.liIiIillIl = true;
            this.Iiiiliiiiiii(p, var3, var5, false);
            return true;
         } else {
            this.liliIillIl = 0;
            return false;
         }
      }
   }

   private boolean IIillIiliIil(boolean ok) {
      this.iiIiIillIl = false;
      this.IIliIillIl = null;
      this.lIliIillIl = 0;
      this.IlilIillIl.Iilililiiili();
      if (!ok) {
         this.liIiIillIl = false;
      }

      return ok;
   }

   public void IilliliilIIi() {
      this.llilIillIl.iIlIlllllill();
   }

   public lillilliillill IIlilIliiIli(class_2338 target) {
      long var10 = 6783941995524662573L;
      this.iliiIillIl = target;
      this.IiiiIillIl = System.nanoTime();
      class_746 var2 = this.IIilIillIl.field_1724;
      class_638 var3 = this.IIilIillIl.field_1687;
      if (var2 == null || var3 == null) {
         return lillilliillill.IIlilIlIilIlilIlIi;
      } else if (this.iiIiIillIl) {
         return this.Iilllilliill(var2) ? lillilliillill.ilIilIlIiIiIilIlIi : lillilliillill.IIlilIlIilIlilIlIi;
      } else {
         class_2338 var4 = var2.method_24515();
         if (this.liIiIillIl && var4.method_10264() >= target.method_10264() && var2.method_24828()) {
            this.liIiIillIl = false;
         }

         if (this.liIiIillIl) {
            return this.IIlllIlliIll(var2) ? lillilliillill.ilIilIlIiIiIilIlIi : lillilliillill.IIlilIlIilIlilIlIi;
         } else if (var4.equals(target)) {
            this.IIIllIIliIIl();
            if (!lllIIlilillIIlil.iliIiiliiiii(var3, target.method_10074()) && this.lIilIillIl.liliIIiliiiliIIili) {
               this.iIilIillIl.liiiIIllIl(0.0F, 0.0F, false, false, true);
               this.llilIillIl.IlIlllIlilIl(var2, target.method_10074(), this.lIlIliIlIl());
               return lillilliillill.ilIilIlIiIiIilIlIi;
            } else {
               if (this.ilIiIillIl != null && this.ilIiIillIl.equals(target)) {
                  if (IIiIllIiIl(var2, target) <= 0.2025) {
                     this.iIilIillIl.iIlIlllllill();
                     return lillilliillill.liIilIlIiiiIilIlIi;
                  }

                  this.ilIiIillIl = null;
               }

               double var12 = IIiIllIiIl(var2, target);
               if (var12 > 0.16 && ++this.llIiIillIl <= 6) {
                  this.IlilIillIl.Iilililiiili();
                  this.Iiiiliiiiiii(
                     var2, (double)target.method_10263() + 0.5 - var2.method_23317(), (double)target.method_10260() + 0.5 - var2.method_23321(), false
                  );
                  return lillilliillill.ilIilIlIiIiIilIlIi;
               } else {
                  this.iIilIillIl.iIlIlllllill();
                  this.IliIlllilIi();
                  this.ilIiIillIl = target.method_10062();
                  return lillilliillill.liIilIlIiiiIilIlIi;
               }
            }
         } else {
            if (this.iiliIillIl != null) {
               lillilliillill var5 = this.iIIIlIlIIl(var2, var3, var4, target);
               if (var5 != null) {
                  return var5;
               }
            }

            this.llIiIillIl = 0;
            this.ilIiIillIl = null;
            if (this.lilIliilIl(var2, target)) {
               this.iIilIillIl.iIlIlllllill();
               this.IliIlllilIi();
               return lillilliillill.IIlilIlIilIlilIlIi;
            } else if (this.Iilililiiili(var2, var3, var4, target)) {
               return lillilliillill.ilIilIlIiIiIilIlIi;
            } else {
               if (this.lliiIillIl > 0) {
                  this.lliiIillIl--;
               }

               if (this.lIilIillIl.liliIIiliiiliIIili
                  && this.lliiIillIl <= 0
                  && liliIliiiliIli.IIIllIIliIIl(var2)
                  && Math.abs(var4.method_10264() - target.method_10264()) <= 1) {
                  var10 ^= ((long)(var4.method_10263() - target.method_10263()) << 32 ^ var10) & -1L << 32;
                  var10 ^= ((long)(var4.method_10260() - target.method_10260()) ^ var10) & -1L >>> 32;
                  if ((int)(var10 >>> 32) * (int)(var10 >>> 32) + (int)var10 * (int)var10 <= 49) {
                     class_2350 var7 = IiiIlliiIl(this.iIiIlIliIl(var4, target), var4, target);
                     class_2338 var8 = var4.method_10093(var7);
                     if (lllIIlilillIIlil.lIiiIiIlilli(var3, var8) && !lllIIlilillIIlil.iliIiiliiiii(var3, var8.method_10074())) {
                        this.Illillliilli(var7, var4);
                        lillilliillill var9 = this.iIIIlIlIIl(var2, var3, var4, target);
                        if (var9 != null) {
                           return var9;
                        }
                     }
                  }
               }

               return this.llIIlilIIl(var2, var3, var4, target);
            }
         }
      }
   }

   private void Illillliilli(class_2350 dir, class_2338 feet) {
      this.iiliIillIl = dir;
      this.IIiiIillIl = 0;
      this.lIiiIillIl = 0;
      this.iIiiIillIl = feet.method_10062();
   }

   private boolean IIlllIlliIll(class_746 p) {
      if (!this.lIilIillIl.liliIIiliiiliIIili) {
         return false;
      } else if (this.iiIiIillIl) {
         return this.Iilllilliill(p);
      } else if (this.llilIillIl.lIiiIiIlilli() > 3) {
         if (this.Illlllllilll(p)) {
            return this.Iilllilliill(p);
         } else {
            this.liIiIillIl = false;
            return false;
         }
      } else {
         this.IlilIillIl.Iilililiiili();
         if (this.Ililllililil(p)) {
            return true;
         } else {
            boolean[] var2 = new boolean[]{false};
            if (!this.llilIillIl.IiIlliIliiIl(p, var2)) {
               this.liIiIillIl = false;
               return false;
            } else {
               if (this.llilIillIl.lIiiIiIlilli() == 0) {
                  this.iIliIillIl = 0;
               }

               this.liIiIillIl = true;
               this.iIilIillIl.IliIlllilIi(0.0F, 0.0F, var2[0], false);
               return true;
            }
         }
      }
   }

   private void IIiilIiiiIii(class_746 p, class_2338 far, boolean up, boolean node, boolean last) {
      long var14 = 2744208556403037274L;
      double var6 = (double)far.method_10263() + 0.5 - p.method_23317();
      double var8 = (double)far.method_10260() + 0.5 - p.method_23321();
      double var10 = var6 * var6 + var8 * var8;
      this.IlilIillIl.Iilililiiili();
      if (up && var10 <= 0.49) {
         this.IiliIillIl = false;
         this.Iiiiliiiiiii(p, var6, var8, false);
      } else if ((this.IiliIillIl || var10 >= 0.5625) && this.Iliilliiilii(p, var6, var8) > 50.0F) {
         this.iIilIillIl.iIlIlllllill();
      } else {
         var14 ^= ((long)(up && var10 <= 1.44 ? 1 : 0) << 32 ^ var14) & -1L << 32;
         var14 ^= ((long)(this.lIilIillIl.illiIIiliIiliIIili && last && (int)(var14 >>> 32) == 0 && !node ? 1 : 0) ^ var14) & -1L >>> 32;
         this.iIilIillIl.IliIlllilIi(1.0F, 0.0F, node && p.method_24828(), (boolean)((int)var14));
      }
   }

   private static int lliIliliIl(class_2351 from, class_2338 to, class_2338 axis) {
      return from == class_2351.field_11048 ? axis.method_10263() - to.method_10263() : axis.method_10260() - to.method_10260();
   }

   private class_2351 iIiIlIliIl(class_2338 from, class_2338 to) {
      if (this.IlliIillIl != null && lliIliliIl(this.IlliIillIl, from, to) != 0) {
         return this.IlliIillIl;
      } else {
         this.IlliIillIl = Math.abs(to.method_10263() - from.method_10263()) >= Math.abs(to.method_10260() - from.method_10260())
            ? class_2351.field_11048
            : class_2351.field_11051;
         return this.IlliIillIl;
      }
   }

   public boolean iliIiiliiiii() {
      return this.iiliIillIl != null;
   }

   public boolean lIiiIiIlilli() {
      return this.liIiIillIl;
   }

   public class_2338 IlIillIiilIi() {
      return this.iliiIillIl;
   }

   private static class_2350 IiiIlliiIl(class_2351 to, class_2338 from, class_2338 axis) {
      long var4 = -3871427303014732306L;
      var4 ^= ((long)lliIliliIl(to, from, axis) << 32 ^ var4) & -1L << 32;
      if (to == class_2351.field_11048) {
         return (int)(var4 >>> 32) >= 0 ? class_2350.field_11034 : class_2350.field_11039;
      } else {
         return (int)(var4 >>> 32) >= 0 ? class_2350.field_11035 : class_2350.field_11043;
      }
   }

   double lIlIliIlIl() {
      return this.illiIillIl > 0.0 ? this.illiIillIl : this.lIilIillIl.iIiiIIiliIliiIIili;
   }

   public lllIlIIlillIlIIl(class_310 config, ilIIIIiIiIIIIi mc, iilIiiIiIIiIiiIi breaker, liiiliIliiiiliIl input, llilIIIiililIIIi selection) {
      this.llliIillIl = Integer.MIN_VALUE;
      this.IIilIillIl = config;
      this.lIilIillIl = mc;
      this.iIilIillIl = breaker;
      this.IlilIillIl = input;
      this.llilIillIl = new liliIliiiliIli(config, breaker);
      this.ililIillIl = selection;
   }
}
