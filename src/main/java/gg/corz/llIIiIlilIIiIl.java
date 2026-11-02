package gg.corz;

import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.function.Predicate;
import net.minecraft.class_1163;
import net.minecraft.class_1944;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_259;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_2818;
import net.minecraft.class_2826;
import net.minecraft.class_287;
import net.minecraft.class_290;
import net.minecraft.class_3610;
import net.minecraft.class_3612;
import net.minecraft.class_638;
import net.minecraft.class_765;
import net.minecraft.class_9799;
import net.minecraft.class_9801;
import net.minecraft.class_2338.class_2339;

final class llIIiIlilIIiIl {
   private int IlliIilllllliIilll;
   private final float[] illIIilllIilIIilll;
   private boolean IiIIIilllliIIIilll;
   private final boolean[] IIllIillllIllIilll;
   private final int[] liIlIillliiIlIilll;
   private final int[] ilIlIilllIiIlIilll;
   private int llIiIilllilIiIilll;
   private final int[] lilIIillliilIIilll;
   private boolean lIlIIillliIlIIilll;
   private int illiIilllIiliIilll;
   private int iIIiIilllIlIiIilll;
   private byte[] iliiillllIiiiillll;
   private final float[] IllIIillllllIIilll;
   private int IlilIilllllilIilll;
   private boolean llIIIilllilIIIilll;
   private final float[] iIllIilllIlllIilll;
   private final lliiiiIliliiiiIl liliIillliiliIilll;
   private boolean iiIIIilllIIlIIilll;
   private final int[] IIiIIillllIiIIilll;
   private int liilIillliiilIilll;
   private float[] liiiilllliiiiillll;
   private int iiIiIilllIIliIilll;
   private final class_9799 Iliiilllllliiillll;
   private final class_2680[] IiiIIilllliiIIilll;
   private byte[] IIIIIillllIIIIilll;
   private int IiIiIilllliIiIilll;
   private final iIiiIiIlIliiIiIl iIliillllIlliillll;
   private final boolean[] lIIlIillliIIlIilll;
   private final int[] IlIlIilllllIlIilll;
   private final boolean[] lliIIillliliIIilll;
   private boolean lIilIillliIilIilll;
   private final iIiiIiIlIliiIiIl IIliilllllIliillll = new iIiiIiIlIliiIiIl();
   private float iillIilllIIilIilll;
   private final iIiiIiIlIliiIiIl llliillllilliillll;
   static final VertexFormat iiilillllIIIiillll = class_290.field_1590;
   private int lIliIillliIliIilll;
   private final class_2339 Iiliillllliliillll;
   private int IIIiIillllIIiIilll;
   private class_287 llllIilllilllIilll;
   private static final int lIIiilllliIIiillll = 18;
   private final class_2339 iiliillllIIiiillll;
   private final class_2339 lIiiilllliIiiillll;
   private static final Predicate<class_2680> liIiilllliiIiillll = s -> {
      class_3610 var1 = s.method_26227();
      return !var1.method_15769() && var1.method_15772().method_15780(class_3612.field_15910);
   };
   private final boolean[] iIiIIilllIliIIilll;
   private int ililIilllIiilIilll;
   private float IillIillllillIilll;
   private byte[] iIIIIilllIlIIIilll;
   private final class_3610[] iiiIIilllIIIlIilll;
   private static final byte IlIiillllllIiillll = 1;
   private static final byte ilIiillllIiIiillll = 2;

   private void Iilllilliill(class_638 sections, class_2826[] sectionIndex, int ly, int world) {
      long var17 = 3361701356755559383L;
      long var19 = -5039282336580022439L;
      long var21 = -6603246799737755403L;
      long var23 = 3805717635991318103L;
      long var15 = 6865500720129332568L;
      var15 ^= (0L ^ var15) & -1L << 32;

      while ((int)(var15 >>> 32) < 18) {
         for (var15 ^= (0L ^ var15) & -1L >>> 32; (int)var15 < 18; var15 ^= (var15 ^ var15 + (long)1) & -1L >>> 32) {
            var17 ^= ((long)((int)(var15 >>> 32) * 18 + (int)var15) << 32 ^ var17) & -1L << 32;
            var17 ^= ((long)((int)var15 - 1) ^ var17) & -1L >>> 32;
            var19 ^= ((long)((int)(var15 >>> 32) - 1) << 32 ^ var19) & -1L << 32;
            if ((int)var17 >= 0 && (int)var17 < 16 && (int)(var19 >>> 32) >= 0 && (int)(var19 >>> 32) < 16) {
               var19 ^= ((long)this.IIliilllllIliillll.IIlilliIll[iIiiIiIlIliiIiIl.IliIlllilIi((int)var17, world, (int)(var19 >>> 32))] ^ var19) & -1L >>> 32;
               long var28 = var21 ^ ((long)this.IlIlllIlilIl((int)var19) << 32 ^ var21) & -1L << 32;
               var21 = var28 ^ ((long)this.IiIlliIliiIl(sectionIndex, ly, (int)var17, world, (int)(var19 >>> 32)) ^ var28) & -1L >>> 32;
               this.iIiIIilllIliIIilll[(int)(var17 >>> 32)] = (boolean)((int)(var21 >>> 32));
               this.lliIIillliliIIilll[(int)(var17 >>> 32)] = (boolean)((int)var21);
               this.IllIIillllllIIilll[(int)(var17 >>> 32)] = Iiililiili.IliIlllilIi(
                  (boolean)((int)(var21 >>> 32)), (boolean)((int)var21), this.liiiilllliiiiillll[(int)var19], (this.iliiillllIiiiillll[(int)var19] & 2) != 0
               );
               this.illIIilllIilIIilll[(int)(var17 >>> 32)] = (int)(var21 >>> 32) == 0
                  ? -1.0F
                  : (
                     (int)var21 != 0
                        ? 8.0F
                        : IllIlIlllllIlIll.IIIllIIliIIl(
                           this.liiiilllliiiiillll[(int)var19], this.iliIiiliiiii(sectionIndex, ly, (int)var17, world, (int)(var19 >>> 32))
                        )
                  );
               var23 ^= ((long)((int)(var19 >>> 32) * 16 + (int)var17) << 32 ^ var23) & -1L << 32;
               if ((int)(var21 >>> 32) != 0 && (int)var21 == 0) {
                  this.IiiIIilllliiIIilll[(int)(var23 >>> 32)] = this.IIlllIlliIll(sectionIndex, ly, (int)var17, world, (int)(var19 >>> 32));
                  this.iiiIIilllIIIlIilll[(int)(var23 >>> 32)] = this.IIliilllllIliillll.lIlilliIll[(int)var19].method_26227();
               } else {
                  this.IiiIIilllliiIIilll[(int)(var23 >>> 32)] = null;
                  this.iiiIIilllIIIlIilll[(int)(var23 >>> 32)] = null;
               }
            } else {
               this.Iiliillllliliillll
                  .method_10103(this.llIiIilllilIiIilll + (int)var17, this.iIIiIilllIlIiIilll, this.IiIiIilllliIiIilll + (int)(var19 >>> 32));
               class_2680 var10 = sections.method_8320(this.Iiliillllliliillll);
               class_3610 var11 = var10.method_26227();
               var21 ^= ((long)(!var11.method_15769() && var11.method_15772().method_15780(class_3612.field_15910) ? 1 : 0) ^ var21) & -1L >>> 32;
               var23 ^= (0L ^ var23) & -1L << 32;
               if ((int)var21 != 0) {
                  this.iiliillllIIiiillll
                     .method_10103(this.Iiliillllliliillll.method_10263(), this.iIIiIilllIlIiIilll + 1, this.Iiliillllliliillll.method_10260());
                  class_3610 var14 = sections.method_8320(this.iiliillllIIiiillll).method_26227();
                  var23 ^= ((long)(!var14.method_15769() && var14.method_15772().method_15780(class_3612.field_15910) ? 1 : 0) << 32 ^ var23) & -1L << 32;
               }

               this.iIiIIilllIliIIilll[(int)(var17 >>> 32)] = (boolean)((int)var21);
               this.lliIIillliliIIilll[(int)(var17 >>> 32)] = (boolean)((int)(var23 >>> 32));
               this.IllIIillllllIIilll[(int)(var17 >>> 32)] = Iiililiili.IliIlllilIi(
                  (boolean)((int)var21), (boolean)((int)(var23 >>> 32)), (int)var21 != 0 ? var11.method_20785() : 0.0F, var10.method_51367()
               );
               this.illIIilllIilIIilll[(int)(var17 >>> 32)] = (int)var21 == 0
                  ? -1.0F
                  : (
                     (int)(var23 >>> 32) != 0
                        ? 8.0F
                        : IllIlIlllllIlIll.IIIllIIliIIl(
                           var11.method_20785(),
                           this.IIIllIIliIIl(
                              sections, this.llIiIilllilIiIilll + (int)var17, this.iIIiIilllIlIiIilll, this.IiIiIilllliIiIilll + (int)(var19 >>> 32)
                           )
                        )
                  );
            }
         }

         var15 += 4294967296L;
      }
   }

   private boolean IiIlliIliiIl(class_2826[] z, int sections, int x, int ly, int sectionIndex) {
      if (ly < 15) {
         return this.IlIlllIlilIl(this.IIliilllllIliillll.IIlilliIll[iIiiIiIlIliiIiIl.IliIlllilIi(x, ly + 1, sectionIndex)]);
      } else {
         this.IilliliilIIi(z, sections);
         return this.IiIIIilllliIIIilll
            ? false
            : (this.IIIIIillllIIIIilll[this.iIliillllIlliillll.IIlilliIll[iIiiIiIlIliiIiIl.IliIlllilIi(x, 0, sectionIndex)]] & 1) != 0;
      }
   }

   private boolean Illlllllilll(class_2826[] ly, int sections, int sectionIndex) {
      long var6 = -6657010315086030775L;
      var6 ^= (0L ^ var6) & -1L << 32;

      while ((int)(var6 >>> 32) < 16) {
         for (var6 ^= (0L ^ var6) & -1L >>> 32; (int)var6 < 16; var6 ^= (var6 ^ var6 + (long)1) & -1L >>> 32) {
            if (this.IlIlllIlilIl(this.IIliilllllIliillll.IIlilliIll[iIiiIiIlIliiIiIl.IliIlllilIi((int)var6, sectionIndex, (int)(var6 >>> 32))])
               && !this.IiIlliIliiIl(ly, sections, (int)var6, sectionIndex, (int)(var6 >>> 32))) {
               return true;
            }
         }

         var6 += 4294967296L;
      }

      return false;
   }

   private void IIlilIliiIli(float v, float z, float x, int fz, float y, float color, int depthLevel, float fx, float u, int light) {
      this.llllIilllilllIilll
         .method_22912(v, z, x)
         .method_39415(fz)
         .method_22913(y, color)
         .method_60803(depthLevel)
         .method_22914(fx, IllIlIlllllIlIll.liiiIIllIl(light), u);
   }

   private static boolean Ililllililil(class_2680 upState, float minHeight) {
      if (upState == null) {
         return false;
      } else {
         class_265 var2 = upState.method_26173(class_2350.field_11033);
         if (var2 == class_259.method_1073()) {
            return false;
         } else {
            return var2 == class_259.method_1077()
               ? minHeight == 1.0F
               : class_259.method_1083(class_259.method_1081(0.0, 0.0, 0.0, 1.0, (double)minHeight, 1.0), var2, class_2350.field_11036);
         }
      }
   }

   private void IlIillIiilIi(int flowX, int hSE, int hNE, int x1, float flowZ, float z1, float light, float x0, int depths, float z0, float hSW, int[] hNW) {
      if (this.llllIilllilllIilll == null) {
         this.llllIilllilllIilll = new class_287(this.Iliiilllllliiillll, class_5596.field_27382, iiilillllIIIiillll);
      }

      float var13 = (float)(this.llIiIilllilIiIilll - this.iiIiIilllIIliIilll + flowX);
      float var14 = (float)(this.llIiIilllilIiIilll - this.iiIiIilllIIliIilll + hNE);
      float var15 = (float)(this.IiIiIilllliIiIilll - this.lIliIillliIliIilll + hSE);
      float var16 = (float)(this.IiIiIilllliIiIilll - this.lIliIillliIliIilll + x1);
      float var17 = (float)(this.IlliIilllllliIilll + flowX);
      float var18 = (float)(this.IlliIilllllliIilll + hNE);
      float var19 = (float)(this.illiIilllIiliIilll + hSE);
      float var20 = (float)(this.illiIilllIiliIilll + x1);
      float var21 = (float)this.iIIiIilllIlIiIilll;
      float var22 = var21 + flowZ - 0.001F;
      float var23 = var21 + z1 - 0.001F;
      float var24 = var21 + light - 0.001F;
      float var25 = var21 + x0 - 0.001F;
      this.IIlilIliiIli(var13, var22, var15, this.IiIiliIiiiIi(flowX, hSE), var17, var19, depths, z0, hSW, hNW[0]);
      this.IIlilIliiIli(var13, var23, var16, this.IiIiliIiiiIi(flowX, x1), var17, var20, depths, z0, hSW, hNW[1]);
      this.IIlilIliiIli(var14, var24, var16, this.IiIiliIiiiIi(hNE, x1), var18, var20, depths, z0, hSW, hNW[2]);
      this.IIlilIliiIli(var14, var25, var15, this.IiIiliIiiiIi(hNE, hSE), var18, var19, depths, z0, hSW, hNW[3]);
      this.IillIillllillIilll = Math.min(this.IillIillllillIilll, Math.min(Math.min(var22, var23), Math.min(var24, var25)));
      this.iillIilllIIilIilll = Math.max(this.iillIilllIIilIilll, Math.max(Math.max(var22, var23), Math.max(var24, var25)));
   }

   lilIIIliilIIIl IliIlllilIi(class_638 world, class_2818 sectionIndex, int chunk, int regionOriginZ, int regionOriginX) {
      long var17 = -3336595656262209108L;
      long var15 = -131001217750831789L;
      class_2826[] var6 = sectionIndex.method_12006();
      if (chunk >= 0 && chunk < var6.length) {
         class_2826 var7 = var6[chunk];
         if (var7 == null || var7.method_38292()) {
            return null;
         } else if (!var7.method_19523(liIiilllliiIiillll)) {
            return null;
         } else {
            this.IIliilllllIliillll.iIlIlllllill(var7);
            if (!this.iIlIlllllill(this.IIliilllllIliillll, false)) {
               return null;
            } else {
               this.llIIIilllilIIIilll = false;
               this.iiIIIilllIIlIIilll = false;
               if (this.llllIilllilllIilll != null) {
                  this.llllIilllilllIilll = null;
                  this.Iliiilllllliiillll.method_60811();
               }

               this.IillIillllillIilll = Float.MAX_VALUE;
               this.iillIilllIIilIilll = -Float.MAX_VALUE;
               this.llIiIilllilIiIilll = sectionIndex.method_12004().method_8326();
               this.IiIiIilllliIiIilll = sectionIndex.method_12004().method_8328();
               this.iiIiIilllIIliIilll = regionOriginZ;
               this.lIliIillliIliIilll = regionOriginX;
               this.IlliIilllllliIilll = IIIIlilIIIli.IIIllIIliIIl(this.llIiIilllilIiIilll);
               this.illiIilllIiliIilll = IIIIlilIIIli.IIIllIIliIIl(this.IiIiIilllliIiIilll);
               var15 ^= ((long)(sectionIndex.method_32891() + chunk << 4) << 32 ^ var15) & -1L << 32;

               for (long var23 = var15 ^ (0L ^ var15) & -1L >>> 32; (int)var23 < 16; var23 ^= (var23 ^ var23 + (long)1) & -1L >>> 32) {
                  if (this.Illlllllilll(var6, chunk, (int)var23)) {
                     this.iIIiIilllIlIiIilll = (int)(var23 >>> 32) + (int)var23;
                     this.lIilIillliIilIilll = false;
                     this.Iilllilliill(world, var6, chunk, (int)var23);
                     this.IIillIiliIil(world);
                  }
               }

               if (this.llllIilllilllIilll == null) {
                  return null;
               } else {
                  class_9801 var9 = this.llllIilllilllIilll.method_60794();
                  this.llllIilllilllIilll = null;
                  if (var9 == null) {
                     return null;
                  } else {
                     lilIIIliilIIIl var12;
                     try {
                        ByteBuffer var10 = var9.method_60818();
                        var17 ^= ((long)var10.remaining() << 32 ^ var17) & -1L << 32;
                        if ((int)(var17 >>> 32) > 0) {
                           var12 = new lilIIIliilIIIl();
                           var12.llIiiIiIlilIiiIiIl = new byte[(int)(var17 >>> 32)];
                           var10.get(var10.position(), var12.llIiiIiIlilIiiIiIl, 0, (int)(var17 >>> 32));
                           var12.IiIiiIiIlliIiiIiIl = var9.method_60822().comp_750();
                           var12.iiIiiIiIlIIliiIiIl = this.IillIillllillIilll;
                           var12.lIliiIiIliIliiIiIl = this.iillIilllIIilIilll;
                           return var12;
                        }

                        var12 = null;
                     } finally {
                        var9.close();
                     }

                     return var12;
                  }
               }
            }
         }
      } else {
         return null;
      }
   }

   private boolean iIlIlllllill(iIiiIiIlIliiIiIl r, boolean forAbove) {
      long var10 = 4330787261295978647L;
      long var12 = 153155493442908627L;
      long var14 = 9033146902925246259L;
      var10 ^= ((long)r.iIlilliIll << 32 ^ var10) & -1L << 32;
      if (forAbove) {
         if (this.IIIIIillllIIIIilll.length < (int)(var10 >>> 32)) {
            this.IIIIIillllIIIIilll = new byte[Math.max((int)(var10 >>> 32), this.IIIIIillllIIIIilll.length * 2)];
         }
      } else {
         if (this.iliiillllIiiiillll.length < (int)(var10 >>> 32)) {
            this.iliiillllIiiiillll = new byte[Math.max((int)(var10 >>> 32), this.iliiillllIiiiillll.length * 2)];
         }

         if (this.liiiilllliiiiillll.length < (int)(var10 >>> 32)) {
            this.liiiilllliiiiillll = new float[Math.max((int)(var10 >>> 32), this.liiiilllliiiiillll.length * 2)];
         }
      }

      var10 ^= (0L ^ var10) & -1L >>> 32;
      var12 ^= (0L ^ var12) & -1L << 32;

      while ((int)(var12 >>> 32) < (int)(var10 >>> 32)) {
         class_2680 var6 = r.lIlilliIll[(int)(var12 >>> 32)];
         class_3610 var7 = var6.method_26227();
         var12 ^= ((long)(!var7.method_15769() && var7.method_15772().method_15780(class_3612.field_15910) ? 1 : 0) ^ var12) & -1L >>> 32;
         var14 ^= ((long)((byte)(((int)var12 != 0 ? 1 : 0) | (var6.method_51367() ? 2 : 0))) << 32 ^ var14) & -1L << 32;
         if (forAbove) {
            this.IIIIIillllIIIIilll[(int)(var12 >>> 32)] = (byte)((int)(var14 >>> 32));
         } else {
            this.iliiillllIiiiillll[(int)(var12 >>> 32)] = (byte)((int)(var14 >>> 32));
            this.liiiilllliiiiillll[(int)(var12 >>> 32)] = (int)var12 != 0 ? var7.method_20785() : 0.0F;
         }

         var10 ^= ((long)((int)var10 | (int)var12) ^ var10) & -1L >>> 32;
         var12 += 4294967296L;
      }

      return (boolean)((int)var10);
   }

   private int IIIllIIliIIl(class_638 wy, int world, int wz, int wx) {
      long var9 = 5277229982427605074L;
      long var11 = -3562438246306662755L;
      var9 ^= (0L ^ var9) & -1L << 32;
      var9 ^= (8L ^ var9) & -1L >>> 32;

      for (long var15 = var11 ^ (4294967296L ^ var11) & -1L << 32; (int)(var15 >>> 32) <= (int)var9; var15 += 4294967296L) {
         class_3610 var8 = wy.method_8320(this.lIiiilllliIiiillll.method_10103(world, wz - (int)(var15 >>> 32), wx)).method_26227();
         if (var8.method_15769() || !var8.method_15772().method_15780(class_3612.field_15910)) {
            break;
         }

         var9 += 4294967296L;
      }

      return (int)(var9 >>> 32);
   }

   private void IIillIiliIil(class_638 world) {
      long var17 = 6613626818021856606L;
      long var11 = -7486971591054434231L;
      long var13 = -7423554767073686813L;
      long var15 = -1748915271902988243L;
      var11 ^= (0L ^ var11) & -1L << 32;

      for (var11 ^= (0L ^ var11) & -1L >>> 32; (int)var11 < 16; var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32) {
         var13 ^= (0L ^ var13) & -1L << 32;

         while ((int)(var13 >>> 32) < 16) {
            var13 ^= ((long)((int)var11 * 16 + (int)(var13 >>> 32)) ^ var13) & -1L >>> 32;
            var15 ^= ((long)(((int)var11 + 1) * 18 + (int)(var13 >>> 32) + 1) << 32 ^ var15) & -1L << 32;
            this.lIIlIillliIIlIilll[(int)var13] = false;
            if (this.iIiIIilllIliIIilll[(int)(var15 >>> 32)] && !this.lliIIillliliIIilll[(int)(var15 >>> 32)]) {
               Iiililiili.iIlIlllllill(this.IllIIillllllIIilll, 18, (int)(var15 >>> 32), this.iIllIilllIlllIilll);
               if (!Ililllililil(this.IiiIIilllliiIIilll[(int)var13], Iiililiili.lIiiIiIlilli(this.iIllIilllIlllIilll))) {
                  this.Iiliillllliliillll
                     .method_10103(this.llIiIilllilIiIilll + (int)(var13 >>> 32), this.iIIiIilllIlIiIilll, this.IiIiIilllliIiIilll + (int)var11);
                  if (!this.lIilIillliIilIilll) {
                     this.Iiilliiliiil(world);
                  }

                  var15 ^= ((long)this.IIIilIIiiIIi(world, this.Iiliillllliliillll) ^ var15) & -1L >>> 32;
                  IllIlIlllllIlIll.lIiiIiIlilli(this.illIIilllIilIIilll, 18, (int)(var15 >>> 32), this.lilIIillliilIIilll);
                  var17 ^= ((long)Iiililiili.IilliliilIIi(this.iIllIilllIlllIilll) << 32 ^ var17) & -1L << 32;
                  if ((int)(var17 >>> 32) != 0 && IllIlIlllllIlIll.iliIiiliiiii(this.lilIIillliilIIilll)) {
                     this.lIIlIillliIIlIilll[(int)var13] = true;
                     this.IlIlIilllllIlIilll[(int)var13] = Float.floatToIntBits(this.iIllIilllIlllIilll[0]);
                     this.ilIlIilllIiIlIilll[(int)var13] = this.lilIIillliilIIilll[0];
                     this.liIlIillliiIlIilll[(int)var13] = (int)var15;
                     var11 ^= (4294967296L ^ var11) & -1L << 32;
                  } else if ((int)(var17 >>> 32) != 0) {
                     this.IlIillIiilIi(
                        (int)(var13 >>> 32),
                        (int)var11,
                        (int)(var13 >>> 32) + 1,
                        (int)var11 + 1,
                        this.iIllIilllIlllIilll[0],
                        this.iIllIilllIlllIilll[1],
                        this.iIllIilllIlllIilll[2],
                        this.iIllIilllIlllIilll[3],
                        (int)var15,
                        0.0F,
                        0.0F,
                        this.lilIIillliilIIilll
                     );
                  } else {
                     class_3610 var9 = this.iiiIIilllIIIlIilll[(int)var13];
                     class_243 var10 = var9 == null ? class_243.field_1353 : var9.method_15758(world, this.Iiliillllliliillll);
                     this.IlIillIiilIi(
                        (int)(var13 >>> 32),
                        (int)var11,
                        (int)(var13 >>> 32) + 1,
                        (int)var11 + 1,
                        this.iIllIilllIlllIilll[0],
                        this.iIllIilllIlllIilll[1],
                        this.iIllIilllIlllIilll[2],
                        this.iIllIilllIlllIilll[3],
                        (int)var15,
                        (float)var10.field_1352,
                        (float)var10.field_1350,
                        this.lilIIillliilIIilll
                     );
                  }
               }
            }

            var13 += 4294967296L;
         }
      }

      if ((int)(var11 >>> 32) != 0) {
         lIiIIIiiIiIIIi.IliIlllilIi(
            this.lIIlIillliIIlIilll,
            this.IlIlIilllllIlIilll,
            this.ilIlIilllIiIlIilll,
            this.liIlIillliiIlIilll,
            this.IIllIillllIllIilll,
            this.liliIillliiliIilll
         );
      }
   }

   private void lIiiIiIlilli(class_2826[] sections, int sectionIndex) {
      long var8 = 106849764396308155L;
      long var10 = 6398277138913138937L;
      if (!this.iiIIIilllIIlIIilll) {
         this.iiIIIilllIIlIIilll = true;
         var8 ^= ((long)(sectionIndex - 1) << 32 ^ var8) & -1L << 32;
         class_2826 var4 = (int)(var8 >>> 32) >= 0 ? sections[(int)(var8 >>> 32)] : null;
         if (var4 != null && !var4.method_38292()) {
            this.llliillllilliillll.iIlIlllllill(var4);
            var8 ^= ((long)this.llliillllilliillll.iIlilliIll ^ var8) & -1L >>> 32;
            if (this.iIIIIilllIlIIIilll.length < (int)var8) {
               this.iIIIIilllIlIIIilll = new byte[Math.max((int)var8, this.iIIIIilllIlIIIilll.length * 2)];
            }

            for (long var14 = var10 ^ (0L ^ var10) & -1L << 32; (int)(var14 >>> 32) < (int)var8; var14 += 4294967296L) {
               class_3610 var7 = this.llliillllilliillll.lIlilliIll[(int)(var14 >>> 32)].method_26227();
               this.iIIIIilllIlIIIilll[(int)(var14 >>> 32)] = (byte)(!var7.method_15769() && var7.method_15772().method_15780(class_3612.field_15910) ? 1 : 0);
            }

            this.lIlIIillliIlIIilll = false;
         } else {
            this.lIlIIillliIlIIilll = true;
         }
      }
   }

   void liiiIIllIl() {
      this.llllIilllilllIilll = null;
      this.Iliiilllllliiillll.close();
   }

   private int IiIiliIiiiIi(int lx, int lz) {
      return IIliiiilIliiii.IliIlllilIi(
         this.IlilIilllllilIilll, this.ililIilllIiilIilll, this.liilIillliiilIilll, this.IIIiIillllIIiIilll, (float)lx / 16.0F, (float)lz / 16.0F
      );
   }

   private class_2680 IIlllIlliIll(class_2826[] sections, int z, int x, int ly, int sectionIndex) {
      if (ly < 15) {
         return this.IIliilllllIliillll.lIlilliIll[this.IIliilllllIliillll.IIlilliIll[iIiiIiIlIliiIiIl.IliIlllilIi(x, ly + 1, sectionIndex)]];
      } else {
         this.IilliliilIIi(sections, z);
         return this.IiIIIilllliIIIilll
            ? class_2246.field_10124.method_9564()
            : this.iIliillllIlliillll.lIlilliIll[this.iIliillllIlliillll.IIlilliIll[iIiiIiIlIliiIiIl.IliIlllilIi(x, 0, sectionIndex)]];
      }
   }

   private int IIIilIIiiIIi(class_638 world, class_2338 p) {
      this.iiliillllIIiiillll.method_10103(p.method_10263(), p.method_10264() + 1, p.method_10260());
      return class_765.method_23687(
         world.method_8314(class_1944.field_9282, this.iiliillllIIiiillll), world.method_8314(class_1944.field_9284, this.iiliillllIIiiillll)
      );
   }

   private void IilliliilIIi(class_2826[] sectionIndex, int sections) {
      long var5 = -1529991723766325741L;
      if (!this.llIIIilllilIIIilll) {
         this.llIIIilllilIIIilll = true;
         var5 ^= ((long)(sections + 1) << 32 ^ var5) & -1L << 32;
         class_2826 var4 = (int)(var5 >>> 32) < sectionIndex.length ? sectionIndex[(int)(var5 >>> 32)] : null;
         if (var4 != null && !var4.method_38292()) {
            this.iIliillllIlliillll.iIlIlllllill(var4);
            this.iIlIlllllill(this.iIliillllIlliillll, true);
            this.IiIIIilllliIIIilll = false;
         } else {
            this.IiIIIilllliIIIilll = true;
         }
      }
   }

   private int iliIiiliiiii(class_2826[] sections, int sectionIndex, int ly, int z, int x) {
      long var11 = 6394520109541977432L;
      long var13 = 7995120310096642063L;
      long var15 = 5903735303168390616L;
      var11 ^= (0L ^ var11) & -1L << 32;
      var11 ^= (8L ^ var11) & -1L >>> 32;
      var13 ^= (4294967296L ^ var13) & -1L << 32;

      while ((int)(var13 >>> 32) <= (int)var11) {
         var13 ^= ((long)(z - (int)(var13 >>> 32)) ^ var13) & -1L >>> 32;
         if ((int)var13 >= 0) {
            var15 ^= ((long)this.IlIlllIlilIl(this.IIliilllllIliillll.IIlilliIll[iIiiIiIlIliiIiIl.IliIlllilIi(ly, (int)var13, x)]) << 32 ^ var15) & -1L << 32;
         } else {
            this.lIiiIiIlilli(sections, sectionIndex);
            var15 ^= (
                  (long)(
                           !this.lIlIIillliIlIIilll
                                 && (this.iIIIIilllIlIIIilll[this.llliillllilliillll.IIlilliIll[iIiiIiIlIliiIiIl.IliIlllilIi(ly, (int)var13 + 16, x)]] & 1)
                                    != 0
                              ? 1
                              : 0
                        )
                        << 32
                     ^ var15
               )
               & -1L << 32;
         }

         if ((int)(var15 >>> 32) == 0) {
            break;
         }

         var11 += 4294967296L;
         var13 += 4294967296L;
      }

      return (int)(var11 >>> 32);
   }

   private void Iiilliiliiil(class_638 world) {
      this.lIilIillliIilIilll = true;
      this.IlilIilllllilIilll = class_1163.method_4961(
         world, this.iiliillllIIiiillll.method_10103(this.llIiIilllilIiIilll, this.iIIiIilllIlIiIilll, this.IiIiIilllliIiIilll)
      );
      this.ililIilllIiilIilll = class_1163.method_4961(
         world, this.iiliillllIIiiillll.method_10103(this.llIiIilllilIiIilll + 16, this.iIIiIilllIlIiIilll, this.IiIiIilllliIiIilll)
      );
      this.liilIillliiilIilll = class_1163.method_4961(
         world, this.iiliillllIIiiillll.method_10103(this.llIiIilllilIiIilll, this.iIIiIilllIlIiIilll, this.IiIiIilllliIiIilll + 16)
      );
      this.IIIiIillllIIiIilll = class_1163.method_4961(
         world, this.iiliillllIIiiillll.method_10103(this.llIiIilllilIiIilll + 16, this.iIIiIilllIlIiIilll, this.IiIiIilllliIiIilll + 16)
      );
   }

   private boolean IlIlllIlilIl(int id) {
      return (this.iliiillllIiiiillll[id] & 1) != 0;
   }

   llIIiIlilIIiIl() {
      this.iIliillllIlliillll = new iIiiIiIlIliiIiIl();
      this.llliillllilliillll = new iIiiIiIlIliiIiIl();
      this.Iiliillllliliillll = new class_2339();
      this.iiliillllIIiiillll = new class_2339();
      this.lIiiilllliIiiillll = new class_2339();
      this.Iliiilllllliiillll = new class_9799(65536);
      this.iliiillllIiiiillll = new byte[64];
      this.liiiilllliiiiillll = new float[64];
      this.IIIIIillllIIIIilll = new byte[64];
      this.iIIIIilllIlIIIilll = new byte[64];
      this.IllIIillllllIIilll = new float[324];
      this.illIIilllIilIIilll = new float[324];
      this.lilIIillliilIIilll = new int[4];
      this.IIiIIillllIiIIilll = new int[4];
      this.iIiIIilllIliIIilll = new boolean[324];
      this.lliIIillliliIIilll = new boolean[324];
      this.IiiIIilllliiIIilll = new class_2680[256];
      this.iiiIIilllIIIlIilll = new class_3610[256];
      this.lIIlIillliIIlIilll = new boolean[256];
      this.IlIlIilllllIlIilll = new int[256];
      this.ilIlIilllIiIlIilll = new int[256];
      this.liIlIillliiIlIilll = new int[256];
      this.IIllIillllIllIilll = new boolean[256];
      this.iIllIilllIlllIilll = new float[4];
      this.liliIillliiliIilll = (cell, w, x, d, z) -> {
         float var6 = Float.intBitsToFloat(this.IlIlIilllllIlIilll[z]);
         Arrays.fill(this.IIiIIillllIiIIilll, this.ilIlIilllIiIlIilll[z]);
         this.IlIillIiilIi(cell, w, cell + x, w + d, var6, var6, var6, var6, this.liIlIillliiIlIilll[z], 0.0F, 0.0F, this.IIiIIillllIiIIilll);
      };
   }
}
