package gg.corz;

import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import net.minecraft.class_12249;
import net.minecraft.class_1921;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2464;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_4608;
import net.minecraft.class_4696;
import net.minecraft.class_5819;
import net.minecraft.class_638;
import net.minecraft.class_776;
import net.minecraft.class_9799;
import net.minecraft.class_2338.class_2339;
import net.minecraft.class_2350.class_2351;
import net.minecraft.class_4597.class_4598;
import org.joml.Matrix4f;
import org.joml.Vector3f;

final class iIIlilIlIlIlilIl {
   static final int IIiIIilIll = 48;
   private final class_5819 llIlIilIll;
   private long llilIilIll;
   private static final float illIIilIll = 0.05F;
   private static final float iIlIIilIll = 0.004F;
   private int[] llllIilIll;
   private final IliIlllliIll iiiIIilIll;
   private double iIilIilIll;
   private final Vector3f ilIlIilIll;
   private int[] IIllIilIll;
   private static final long iIiIIilIll = 2000000L;
   private static class_4598 lliIIilIll;
   private int illlIilIll;
   private class_2680 IillIilIll;
   private static final float IilIIilIll = 0.6F;
   private static final int IliIIilIll = 3;
   private final iilIilIlIIiIilIl IIIlIilIll;
   private class_638 IiIlIilIll;
   private class_2680 lillIilIll;
   private class_2680[] iIllIilIll;
   private boolean lIilIilIll;
   private static final float IllIIilIll = 0.22F;
   private static final int IIlIIilIll = 8;
   private class_2680[] IlllIilIll;
   private static final float lIlIIilIll = 0.002F;
   private class_2680 IIilIilIll;
   private int[] liIlIilIll;
   private float[] lIllIilIll;
   private final class_4587 IlIlIilIll;
   private static final float lllIIilIll = 0.2F;
   private final Long2ObjectOpenHashMap<lIIIliIliIIIliIl> IiiIIilIll;
   private int IlilIilIll;
   private final class_2339 iIIlIilIll;
   private final ArrayList<lIIIliIliIIIliIl> iliIIilIll = new ArrayList<>();
   private final ArrayDeque<Illiilllliil> liiIIilIll;
   private double iillIilIll;
   private int[] iiIlIilIll;
   private static final double iilIIilIll = 0.0625;
   private final class_2339 lIIlIilIll;
   private static final int lilIIilIll = 2048;
   private static final int lIiIIilIll = 6;

   private boolean IIIIllIIIl(class_776 state, class_2680 yOffset, class_2338 pos, float brm) {
      long var9 = 9161133750164795892L;
      this.llIlIilIll.method_43052(yOffset.method_26190(pos));
      List var5 = state.method_3349(yOffset).method_68512(this.llIlIilIll);
      if (var5.isEmpty()) {
         return false;
      } else {
         this.IlIlIilIll.method_22903();

         try {
            if (brm != 0.0F) {
               this.IlIlIilIll.method_46416(0.0F, brm, 0.0F);
            }

            state.method_3350().method_3374(this.IIIlIilIll, var5, yOffset, pos, this.IlIlIilIll, this.iiiIIilIll, false, class_4608.field_21444);
            var9 ^= (4294967296L ^ var9) & -1L << 32;
            return (boolean)((int)(var9 >>> 32));
         } catch (RuntimeException var13) {
            var9 ^= (0L ^ var9) & -1L >>> 32;
         } finally {
            this.IlIlIilIll.method_22909();
         }

         return (boolean)((int)var9);
      }
   }

   void iliIiiliiiii(class_638 speed, long w, double now, double life) {
      if (!this.liiIIilIll.isEmpty() || !this.iliIIilIll.isEmpty()) {
         if (speed != null && speed == this.IiIlIilIll) {
            this.Ililllililil(w, now, life);
            int var8 = 0;

            for (int var9 = this.iliIIilIll.size(); var8 < var9; var8++) {
               lIIIliIliIIIliIl var10 = this.iliIIilIll.get(var8);
               if (!var10.iIIliliIll && !this.IIIllIIliIIl(speed, var10)) {
                  var10.iIIliliIll = true;
               }
            }
         } else {
            this.iIlIlllllill();
         }
      }
   }

   private static boolean IIlilIliiIli(class_265 shape) {
      return shape.method_1091(class_2351.field_11048) <= Double.longBitsToDouble(772565182797001729L ^ 3821502130526827521L)
         && shape.method_1105(class_2351.field_11048) >= Double.longBitsToDouble(8371349416216639825L ^ 5459209307168192849L)
         && shape.method_1091(class_2351.field_11051) <= Double.longBitsToDouble(-7348218041686609049L ^ -6506044911368326297L)
         && shape.method_1105(class_2351.field_11051) >= Double.longBitsToDouble(-1528365604633384111L ^ -3088299925563839663L);
   }

   private void Iilllilliill(Matrix4f rgb, class_243 rainbow, int cam, boolean hueBase, float m) {
      class_4588 var6 = null;
      int var7 = 0;

      for (int var8 = this.iliIIilIll.size(); var7 < var8; var7++) {
         lIIIliIliIIIliIl var9 = this.iliIIilIll.get(var7);
         if (!var9.iIIliliIll && var9.lIIliliIll && iliIlIIlIiiIlIIl.Ililllililil((double)var9.IlIliliIll) && !(var9.llIliliIll <= 0.0F)) {
            if (var6 == null) {
               var6 = iIiiIIilIliiIIil.IIIllIIliIIl();
            }

            int var10 = IIillIiliIil(var9, cam, hueBase, m);
            int var11 = iliIlIIlIiiIlIIl.llIIlilIIl(var10, 0.2F * var9.llIliliIll);
            int var12 = iliIlIIlIiiIlIIl.llIIlilIIl(var10, 0.05F * var9.llIliliIll);
            float var13 = (float)((double)var9.IilIiliIll - rainbow.field_1351) + var9.liiIiliIll + var9.IlIliliIll + 0.004F;
            float var14 = (float)((double)var9.illIiliIll - rainbow.field_1352) + 0.002F;
            float var15 = (float)((double)var9.lilIiliIll - rainbow.field_1350) + 0.002F;
            float var16 = var14 + 1.0F - 0.004F;
            float var17 = var15 + 1.0F - 0.004F;
            float var18 = (var14 + var16) * 0.5F;
            float var19 = (var15 + var17) * 0.5F;
            iIiiIIilIliiIIil.IiIlliIliiIl(var6, rgb, var18, var13, var19, var11, var14, var13, var15, var12, var16, var13, var15, var12);
            iIiiIIilIliiIIil.IiIlliIliiIl(var6, rgb, var18, var13, var19, var11, var16, var13, var15, var12, var16, var13, var17, var12);
            iIiiIIilIliiIIil.IiIlliIliiIl(var6, rgb, var18, var13, var19, var11, var16, var13, var17, var12, var14, var13, var17, var12);
            iIiiIIilIliiIIil.IiIlliIliiIl(var6, rgb, var18, var13, var19, var11, var14, var13, var17, var12, var14, var13, var15, var12);
         }
      }
   }

   private boolean IlIillIiilIi(class_638 feetY, int x, int feet, int z, double w) {
      int var7 = z + 1;
      int var8 = z - 1 - 4;
      double var9 = Double.NaN;
      int var11 = 0;
      class_2680 var12 = null;
      class_2680 var13 = null;
      class_2680 var14 = feetY.method_8320(this.lIIlIilIll.method_10103(x, var7 + 2, feet));
      class_2680 var15 = feetY.method_8320(this.lIIlIilIll.method_10103(x, var7 + 1, feet));

      for (int var16 = var7; var16 >= var8; var16--) {
         class_2680 var17 = feetY.method_8320(this.lIIlIilIll.method_10103(x, var16, feet));
         if (this.Iilililiiili(feetY, x, var16, feet, var17, var15, var14)) {
            double var18 = (double)var16 + this.iillIilIll;
            if (iliIlIIlIiiIlIIl.Illillliilli(var18, var9, w)) {
               var9 = var18;
               var11 = var16;
               var12 = var17;
               var13 = this.IIilIilIll;
            }
         }

         var14 = var15;
         var15 = var17;
      }

      if (Double.isNaN(var9)) {
         return false;
      } else {
         this.illlIilIll = var11;
         this.IillIilIll = var12;
         this.lillIilIll = var13;
         return true;
      }
   }

   private static class_4598 iIIIlIlIIl() {
      if (lliIIilIll == null) {
         LinkedHashMap var0 = new LinkedHashMap();
         var0.put(
            class_12249.method_75965(), new class_9799(((95027077 * -105 * -266059921 ^ 43) << 3 | (95027077 * -105 * -266059921 ^ 43) >>> 29) ^ -2143983694)
         );
         var0.put(class_12249.method_75972(), new class_9799(((1743875761 * 678152731 >>> 13 | 1743875761 * 678152731 << 19) ^ -99) * 25 ^ 1243483647));
         lliIIilIll = class_4597.method_22992(var0, new class_9799(~(-1542019032 * 1) * -101 ^ -1125115859));
      }

      return lliIIilIll;
   }

   private boolean IIIllIIliIIl(class_638 w, lIIIliIliIIIliIl s) {
      if (w.method_8320(this.lIIlIilIll.method_10103(s.illIiliIll, s.IilIiliIll, s.lilIiliIll)) != s.iilIiliIll) {
         return false;
      } else {
         class_2680 var3 = w.method_8320(this.lIIlIilIll.method_10103(s.illIiliIll, s.IilIiliIll + 1, s.lilIiliIll));
         if (s.IIiIiliIll != null) {
            return var3 != s.IIiIiliIll
               ? false
               : Illillliilli(w, w.method_8320(this.lIIlIilIll.method_10103(s.illIiliIll, s.IilIiliIll + 2, s.lilIiliIll)), this.lIIlIilIll);
         } else {
            return Illillliilli(w, var3, this.lIIlIilIll);
         }
      }
   }

   class_638 liiiIIllIl() {
      return this.IiIlIilIll;
   }

   void IlIlllIlilIl(
      class_4587 cam, class_243 speed, long hueBase, double rainbow, double life, double matrices, boolean glow, int now, boolean rgb, float height
   ) {
      this.Ililllililil(hueBase, life, matrices);
      if (!this.liiIIilIll.isEmpty() && this.IiIlIilIll != null) {
         int var15 = 0;

         for (int var16 = this.iliIIilIll.size(); var15 < var16; var15++) {
            lIIIliIliIIIliIl var17 = this.iliIIilIll.get(var15);
            var17.IlIliliIll = 0.0F;
            var17.llIliliIll = 0.0F;
         }

         this.IlilIilIll = 0;
         this.llilIilIll = System.nanoTime() + 2000000L;
         double var30 = Math.max(0.0, rainbow);
         int var31 = 0;

         for (Illiilllliil var19 : this.liiIIilIll) {
            double var20 = (double)(hueBase - var19.IlillIiillillIii) / 1.0E9;
            if (!(iliIlIIlIiiIlIIl.IlIlllIlilIl(var20, matrices) <= 0.0)) {
               double var22 = (double)var19.llIilIiiilIilIii
                  * (var19.IiIilIiiliIilIii ? iliIlIIlIiiIlIIl.IIIilIIiiIIi((double)(hueBase - var19.iiIilIiiIIlilIii) / 1.0E9) : 1.0);
               if (var22 > 0.0) {
                  for (int var24 = 0; var24 < var19.iIIilIiiIlIilIii; var24++) {
                     float var25 = var19.IIIilIiilIIilIii[var24];
                     if (var20 < iliIlIIlIiiIlIIl.iIlIlllllill((double)var25, life) - 0.05) {
                        break;
                     }

                     lIIIliIliIIIliIl var26 = var19.liillIiiiiillIii[var24];
                     if (!var26.iIIliliIll) {
                        if (!var26.lIIliliIll) {
                           if (var19.IiIilIiiliIilIii || !iliIlIIlIiiIlIIl.IiIiliIiiiIi((double)var25, var20, life) || !this.IiIlliIliiIl()) {
                              continue;
                           }

                           if (!this.Iiiiliiiiiii(this.IiIlIilIll, var26)) {
                              var26.iIIliliIll = true;
                              continue;
                           }
                        }

                        double var27 = iliIlIIlIiiIlIIl.Iilllilliill((double)var25, var20, life, matrices, var19.ilillIiiIiillIii) * var22;
                        if (!(var27 <= 0.0)) {
                           float var29 = (float)(var30 * var27);
                           if (var29 > var26.IlIliliIll) {
                              if ((double)var26.IlIliliIll < 0.03 && iliIlIIlIiiIlIIl.Ililllililil((double)var29)) {
                                 var31++;
                              }

                              var26.IlIliliIll = var29;
                              var26.llIliliIll = (float)var27;
                              var26.ilIliliIll = (float)((double)var25 / Math.max(0.001, var19.ilillIiiIiillIii));
                           }
                        }
                     }
                  }
               }
            }
         }

         if (var31 != 0) {
            Matrix4f var32 = cam.method_23760().method_23761();
            class_4598 var33 = iIIIlIlIIl();
            this.IIlllIlliIll(var33, class_12249.method_75965(), var32, speed, glow, now, rgb, height);
            this.IIlllIlliIll(var33, class_12249.method_75972(), var32, speed, glow, now, rgb, height);
            var33.method_22993();
            if (glow) {
               this.Iilllilliill(var32, speed, now, rgb, height);
            }
         }
      }
   }

   private boolean Iiiiliiiiiii(class_638 s, lIIIliIliIIIliIl w) {
      class_776 var3 = class_310.method_1551().method_1541();
      if (var3 == null) {
         return false;
      } else {
         class_2680 var4 = w.iilIiliIll;
         class_2680 var5 = w.IIiIiliIll;
         if (s.method_8320(this.lIIlIilIll.method_10103(w.illIiliIll, w.IilIiliIll, w.lilIiliIll)) != var4) {
            return false;
         } else if (var5 != null && s.method_8320(this.iIIlIilIll.method_10103(w.illIiliIll, w.IilIiliIll + 1, w.lilIiliIll)) != var5) {
            return false;
         } else {
            this.IIIlIilIll.IliIlllilIi(s, w.illIiliIll, w.IilIiliIll, w.lilIiliIll, var4, var5);

            try {
               this.iiiIIilIll.IliIlllilIi();
               if (!this.IIIIllIIIl(var3, var4, this.IIIlIilIll.liIlillIll, 0.0F) || this.iiiIIilIll.lIiiIIIiiIiiIIIi < 3) {
                  return false;
               }

               w.IliIiliIll = this.iiiIIilIll.liiiIIllIl(0.002F, w.IliIiliIll);
               w.lliIiliIll = this.iiiIIilIll.lIiiIIIiiIiiIIIi;
               w.IiiIiliIll = 0;
               if (var5 != null) {
                  this.iiiIIilIll.IliIlllilIi();
                  if (!this.IIIIllIIIl(var3, var5, this.IIIlIilIll.iiIlillIll, 1.0F) || this.iiiIIilIll.lIiiIIIiiIiiIIIi < 3) {
                     return false;
                  }

                  w.iliIiliIll = this.iiiIIilIll.liiiIIllIl(0.002F, w.iliIiliIll);
                  w.IiiIiliIll = this.iiiIIilIll.lIiiIIIiiIiiIIIi;
                  w.iIiIiliIll = class_4696.method_29359(var5);
               }
            } finally {
               this.IIIlIilIll.liiiIIllIl();
            }

            w.lIiIiliIll = class_4696.method_29359(var4);
            class_265 var6 = var4.method_26218(s, this.lIIlIilIll.method_10103(w.illIiliIll, w.IilIiliIll, w.lilIiliIll));
            double var7 = var6.method_1110() ? 1.0 : var6.method_1105(class_2351.field_11052);
            double var9 = 0.0;
            if (var5 != null) {
               class_265 var11 = var5.method_26218(s, this.iIIlIilIll.method_10103(w.illIiliIll, w.IilIiliIll + 1, w.lilIiliIll));
               var9 = var11.method_1110() ? 0.0 : var11.method_1105(class_2351.field_11052);
            }

            w.liiIiliIll = iliIlIIlIiiIlIIl.Iiiiliiiiiii(var7, var5 != null, var9);
            w.lIIliliIll = true;
            return true;
         }
      }
   }

   private boolean IiIlliIliiIl() {
      if (this.IlilIilIll >= (-(349977443 * -1332920885 - -21) * 119 ^ -193013642)) {
         return false;
      } else if (this.IlilIilIll >= (-(-505237764 - 119) * 723362913 ^ 356363165) && System.nanoTime() > this.llilIilIll) {
         return false;
      } else {
         this.IlilIilIll++;
         return true;
      }
   }

   private void Iiilliiliiil(Illiilllliil w) {
      for (int var2 = 0; var2 < w.iIIilIiiIlIilIii; var2++) {
         lIIIliIliIIIliIl var3 = w.liillIiiiiillIii[var2];
         if (--var3.iiiIiliIll <= 0) {
            int var4 = var3.IIIliliIll;
            int var5 = this.iliIIilIll.size() - 1;
            if (var4 >= 0 && var4 <= var5 && this.iliIIilIll.get(var4) == var3) {
               lIIIliIliIIIliIl var6 = this.iliIIilIll.get(var5);
               this.iliIIilIll.set(var4, var6);
               var6.IIIliliIll = var4;
               this.iliIIilIll.remove(var5);
            }

            var3.IIIliliIll = -1;
            this.IiiIIilIll.remove(var3.lllIiliIll);
         }
      }
   }

   private void IIIilIIiiIIi(int n) {
      if (this.liIlIilIll.length < n) {
         this.liIlIilIll = new int[n];
         this.iiIlIilIll = new int[n];
         this.IIllIilIll = new int[n];
         this.lIllIilIll = new float[n];
         this.iIllIilIll = new class_2680[n];
         this.IlllIilIll = new class_2680[n];
         this.llllIilIll = new int[n];
      }
   }

   private static int IIillIiliIil(lIIIliIliIIIliIl hueBase, int s, boolean rgb, float rainbow) {
      if (!rgb) {
         return s & (~1096817916 + 93 ^ -1100997473);
      } else {
         float var4 = rainbow + hueBase.ilIliliIll * 0.6F;
         var4 -= (float)Math.floor((double)var4);
         return class_3532.method_15369(var4, 0.75F, 1.0F) & (-(-398878330 + 117) * 99 ^ 826706960);
      }
   }

   private void IIlllIlliIll(class_4598 hueBase, class_1921 rainbow, Matrix4f cam, class_243 m, boolean glow, int rgb, boolean imm, float layer) {
      class_4588 var9 = null;
      int var10 = 0;

      for (int var11 = this.iliIIilIll.size(); var10 < var11; var10++) {
         lIIIliIliIIIliIl var12 = this.iliIIilIll.get(var10);
         if (!var12.iIIliliIll && var12.lIIliliIll && iliIlIIlIiiIlIIl.Ililllililil((double)var12.IlIliliIll)) {
            boolean var13 = var12.lIiIiliIll == rainbow;
            boolean var14 = var12.IiiIiliIll > 0 && var12.iIiIiliIll == rainbow;
            if (var13 || var14) {
               if (var9 == null) {
                  var9 = hueBase.method_73477(rainbow);
               }

               float var15 = (float)((double)var12.illIiliIll - m.field_1352);
               float var16 = (float)((double)var12.IilIiliIll - m.field_1351) + var12.IlIliliIll;
               float var17 = (float)((double)var12.lilIiliIll - m.field_1350);
               float var18 = glow ? 0.22F * var12.llIliliIll : 0.0F;
               int var19 = var18 > 0.0F ? IIillIiliIil(var12, rgb, imm, layer) : 0;
               if (var13) {
                  this.Illlllllilll(var9, cam, var12.IliIiliIll, var12.lliIiliIll, var15, var16, var17, var18, var19);
               }

               if (var14) {
                  this.Illlllllilll(var9, cam, var12.iliIiliIll, var12.IiiIiliIll, var15, var16, var17, var18, var19);
               }
            }
         }
      }
   }

   boolean IilliliilIIi(class_638 w, double maxWaves, double groundY, double gain, double radius, int px, double now, long pz) {
      if (w != null && now > 0.0) {
         if (w != this.IiIlIilIll) {
            this.iIlIlllllill();
            this.IiIlIilIll = w;
         }

         int var15 = class_3532.method_15357(groundY + 0.001);
         int var16 = class_3532.method_15357(maxWaves);
         int var17 = class_3532.method_15357(gain);
         int var18 = (int)Math.ceil(radius);
         int var19 = (2 * var18 + 1) * (2 * var18 + 1);
         this.IIIilIIiiIIi(var19);
         int var20 = 0;

         for (int var21 = -var18; var21 <= var18; var21++) {
            for (int var22 = -var18; var22 <= var18; var22++) {
               int var23 = var16 + var21;
               int var24 = var17 + var22;
               double var25 = (double)var23 + 0.5 - maxWaves;
               double var27 = (double)var24 + 0.5 - gain;
               if (iliIlIIlIiiIlIIl.IIlilIliiIli(var25, var27, radius) && this.IlIillIiilIi(w, var23, var24, var15, groundY)) {
                  this.liIlIilIll[var20] = var23;
                  this.iiIlIilIll[var20] = this.illlIilIll;
                  this.IIllIilIll[var20] = var24;
                  this.lIllIilIll[var20] = (float)Math.sqrt(var25 * var25 + var27 * var27);
                  this.iIllIilIll[var20] = this.IillIilIll;
                  this.IlllIilIll[var20] = this.lillIilIll;
                  var20++;
               }
            }
         }

         if (var20 == 0) {
            return false;
         } else {
            int var29 = iliIlIIlIiiIlIIl.IIIIllIIIl(this.lIllIilIll, var20, 512, this.llllIilIll);
            lIIIliIliIIIliIl[] var30 = new lIIIliIliIIIliIl[var29];
            float[] var31 = new float[var29];
            int var32 = 0;

            for (int var33 = 0; var33 < var29; var33++) {
               int var26 = this.llllIilIll[var33];
               lIIIliIliIIIliIl var34 = this.Iliilliiilii(
                  this.liIlIilIll[var26], this.iiIlIilIll[var26], this.IIllIilIll[var26], this.iIllIilIll[var26], this.IlllIilIll[var26]
               );
               if (var34 != null) {
                  var30[var32] = var34;
                  var31[var32] = this.lIllIilIll[var26];
                  var32++;
               }
            }

            if (var32 == 0) {
               return false;
            } else {
               this.liiIIilIll.addLast(new Illiilllliil(pz, radius, var30, var31, var32, (float)Math.min(1.0, now)));
               this.lIiiIiIlilli(px, pz);
               return true;
            }
         }
      } else {
         return false;
      }
   }

   private boolean IIiilIiiiIii(class_638 pos, class_2680 state, class_2338 w) {
      long var7 = 2033113325968946146L;
      if (!IiIiliIiiiIi(state)) {
         return false;
      } else {
         class_265 var4 = state.method_26218(pos, w);
         class_265 var5 = state.method_26220(pos, w);
         var7 ^= ((long)var4.method_1110() << 32 ^ var7) & -1L << 32;
         this.lIilIilIll = var5.method_1110();
         this.iIilIilIll = this.lIilIilIll ? 0.0 : var5.method_1105(class_2351.field_11052);
         return iliIlIIlIiiIlIIl.IIiilIiiiIii(
            false,
            true,
            false,
            false,
            false,
            (boolean)((int)(var7 >>> 32)),
            (int)(var7 >>> 32) != 0 ? 0.0 : var4.method_1091(class_2351.field_11052),
            (int)(var7 >>> 32) != 0 ? 0.0 : var4.method_1105(class_2351.field_11052),
            (int)(var7 >>> 32) == 0 && IIlilIliiIli(var4),
            this.lIilIilIll,
            this.iIilIilIll
         );
      }
   }

   private void lIiiIiIlilli(int now, long maxWaves) {
      int var4 = Math.max(1, now);
      int var5 = 0;

      for (Illiilllliil var7 : this.liiIIilIll) {
         if (!var7.IiIilIiiliIilIii) {
            var5++;
         }
      }

      Iterator var8 = this.liiIIilIll.iterator();

      while (var8.hasNext() && var5 > var4) {
         Illiilllliil var9 = (Illiilllliil)var8.next();
         if (!var9.IiIilIiiliIilIii) {
            var9.IiIilIiiliIilIii = true;
            var9.iiIilIiiIIlilIii = maxWaves;
            var5--;
         }
      }

      while (this.liiIIilIll.size() > var4 + 3) {
         this.Iiilliiliiil(this.liiIIilIll.removeFirst());
      }
   }

   private static boolean Illillliilli(class_638 pos, class_2680 state, class_2338 w) {
      return state.method_26215() || state.method_26227().method_15769() && state.method_26220(pos, w).method_1110();
   }

   private boolean Iilililiiili(class_638 x, int above, int above2, int state, class_2680 y, class_2680 w, class_2680 z) {
      if (!IiIiliIiiiIi(y)) {
         return false;
      } else {
         this.iIIlIilIll.method_10103(above, above2, state);
         class_265 var8 = y.method_26220(x, this.iIIlIilIll);
         boolean var9 = var8.method_1110();
         double var10 = var9 ? 0.0 : var8.method_1105(class_2351.field_11052);
         boolean var12 = !var9 && IIlilIliiIli(var8);
         if (!iliIlIIlIiiIlIIl.Iilililiiili(false, true, false, false, false, var9, var10, var12, true, false)) {
            return false;
         } else {
            this.iillIilIll = var10;
            this.IIilIilIll = null;
            if (w.method_26215()) {
               return true;
            } else {
               this.iIIlIilIll.method_10103(above, above2 + 1, state);
               if (this.IIiilIiiiIii(x, w, this.iIIlIilIll)) {
                  boolean var13 = this.lIilIilIll;
                  double var14 = this.iIilIilIll;
                  this.iIIlIilIll.method_10103(above, above2 + 2, state);
                  if (!Illillliilli(x, z, this.iIIlIilIll)) {
                     return false;
                  } else {
                     this.IIilIilIll = w;
                     this.iillIilIll = iliIlIIlIiiIlIIl.Iliilliiilii(var10, true, var13, var14);
                     return true;
                  }
               } else {
                  return Illillliilli(x, w, this.iIIlIilIll);
               }
            }
         }
      }
   }

   private void Illlllllilll(class_4588 vertices, Matrix4f ox, int[] tint, int oz, float d, float vc, float k, float m, int oy) {
      int var10 = 0;

      for (byte var11 = 0; var10 < oz; var11 += 8) {
         ox.transformPosition(
            Float.intBitsToFloat(tint[var11]) + d, Float.intBitsToFloat(tint[var11 + 1]) + vc, Float.intBitsToFloat(tint[var11 + 2]) + k, this.ilIlIilIll
         );
         int var12 = m > 0.0F ? iliIlIIlIiiIlIIl.iIIIlIlIIl(tint[var11 + 3], oy, m) : tint[var11 + 3];
         int var13 = tint[var11 + 7];
         vertices.method_23919(
            this.ilIlIilIll.x,
            this.ilIlIilIll.y,
            this.ilIlIilIll.z,
            var12,
            Float.intBitsToFloat(tint[var11 + 4]),
            Float.intBitsToFloat(tint[var11 + 5]),
            class_4608.field_21444,
            tint[var11 + 6],
            (float)((byte)var13) / 127.0F,
            (float)((byte)(var13 >> 8)) / 127.0F,
            (float)((byte)(var13 >> 16)) / 127.0F
         );
         var10++;
      }
   }

   private static boolean IiIiliIiiiIi(class_2680 state) {
      if (!state.method_26215() && state.method_26217() == class_2464.field_11458 && !state.method_31709() && state.method_26227().method_15769()) {
         class_1921 var1 = class_4696.method_29359(state);
         return var1 == class_12249.method_75965() || var1 == class_12249.method_75972();
      } else {
         return false;
      }
   }

   boolean IliIlllilIi() {
      return this.liiIIilIll.isEmpty();
   }

   iIIlilIlIlIlilIl() {
      this.IiiIIilIll = new Long2ObjectOpenHashMap();
      this.liiIIilIll = new ArrayDeque<>();
      this.iiiIIilIll = new IliIlllliIll();
      this.IIIlIilIll = new iilIilIlIIiIilIl();
      this.lIIlIilIll = new class_2339();
      this.iIIlIilIll = new class_2339();
      this.IlIlIilIll = new class_4587();
      this.llIlIilIll = class_5819.method_43047();
      this.ilIlIilIll = new Vector3f();
      this.liIlIilIll = new int[0];
      this.iiIlIilIll = new int[0];
      this.IIllIilIll = new int[0];
      this.lIllIilIll = new float[0];
      this.iIllIilIll = new class_2680[0];
      this.IlllIilIll = new class_2680[0];
      this.llllIilIll = new int[0];
   }

   private void Ililllililil(long speed, double now, double life) {
      if (!this.liiIIilIll.isEmpty()) {
         Iterator var7 = this.liiIIilIll.iterator();

         while (var7.hasNext()) {
            Illiilllliil var8 = (Illiilllliil)var7.next();
            double var9 = (double)(speed - var8.IlillIiillillIii) / 1.0E9;
            boolean var11 = var8.IiIilIiiliIilIii && iliIlIIlIiiIlIIl.IlIillIiilIi((double)(speed - var8.iiIilIiiIIlilIii) / 1.0E9);
            if (var11 || var9 > iliIlIIlIiiIlIIl.Iiilliiliiil(var8.ilillIiiIiillIii, now, life)) {
               var7.remove();
               this.Iiilliiliiil(var8);
            }
         }
      }
   }

   void iIlIlllllill() {
      this.liiIIilIll.clear();
      this.iliIIilIll.clear();
      this.IiiIIilIll.clear();
      this.IiIlIilIll = null;
   }

   private lIIIliIliIIIliIl Iliilliiilii(int y, int state, int cap, class_2680 x, class_2680 z) {
      long var6 = class_2338.method_10064(y, state, cap);
      lIIIliIliIIIliIl var8 = (lIIIliIliIIIliIl)this.IiiIIilIll.get(var6);
      if (var8 == null) {
         if (this.iliIIilIll.size() >= (-1554220391 - -17 - 89 - 13 ^ -1554222524)) {
            return null;
         } else {
            var8 = new lIIIliIliIIIliIl(var6, y, state, cap);
            var8.iilIiliIll = x;
            var8.IIiIiliIll = z;
            var8.iiiIiliIll = 1;
            var8.IIIliliIll = this.iliIIilIll.size();
            this.iliIIilIll.add(var8);
            this.IiiIIilIll.put(var6, var8);
            return var8;
         }
      } else {
         if (var8.iIIliliIll || var8.iilIiliIll != x || var8.IIiIiliIll != z) {
            var8.iilIiliIll = x;
            var8.IIiIiliIll = z;
            var8.lIIliliIll = false;
            var8.iIIliliIll = false;
         }

         var8.iiiIiliIll++;
         return var8;
      }
   }
}
