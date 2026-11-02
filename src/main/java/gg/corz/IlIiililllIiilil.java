package gg.corz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import net.minecraft.class_1058;
import net.minecraft.class_1087;
import net.minecraft.class_10889;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2464;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_324;
import net.minecraft.class_4588;
import net.minecraft.class_4608;
import net.minecraft.class_5611;
import net.minecraft.class_5819;
import net.minecraft.class_773;
import net.minecraft.class_777;
import net.minecraft.class_2350.class_2351;
import net.minecraft.class_4587.class_4665;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector3fc;

final class IlIiililllIiilil {
   private static final float[] lIiiIlllil = new float[]{1.0F, 0.78F, 0.62F, 0.5F};
   private final float[] IIIIllllil;
   private iililIilIIiilIil llIIllllil;
   private static final int iIiiIlllil = 16;
   static final int liliIlllil = 12;
   private float IlIIllllil;
   private final float[][] iiiiIlllil;
   private float[] ilIIllllil;
   private float iIIIllllil;
   private float lIIIllllil;
   private static final float[] IIiiIlllil = new float[]{0.5F, 1.0F, 0.8F, 0.8F, 0.6F, 0.6F};
   private final float[][] liiiIlllil;
   private int lliiIlllil;
   private float[] IliiIlllil = new float[196608];
   private final float[] IiIIllllil;
   private final float[] iliiIlllil = new float[16];
   static final int iiliIlllil = 15728880;
   private final Vector3f IiiiIlllil = new Vector3f();

   private static boolean iliIiiliiiii(class_1058 sprite) {
      if (sprite == null) {
         return true;
      } else {
         String var1 = sprite.method_45851().method_45816().method_12832();
         return var1.contains(Iiilliiliiil<"Iiilliiliiil","F69kUienhoi91SO8ltfGi2FUgClwtiQGKfxSH7A4BoU=">())
            || var1.contains(Iiilliiliiil<"Iiilliiliiil","yRKZphO1LmH/cJkyOVcBo8psoPA8evapNC4nI9BulSi4wx4=">())
            || var1.contains(Iiilliiliiil<"Iiilliiliiil","GWhFVjydUU0N5+sEr6k+SxtQXqeil077tErFN7FvJXs=">())
            || var1.contains(Iiilliiliiil<"Iiilliiliiil","BPJ+mPWqhIE5XxIzMOMWfOQTsvYFcS+7GfCyBsBUPH4I">());
      }
   }

   private static int Ililllililil(float v) {
      long var2 = 2527948336818107139L;
      var2 ^= ((long)((int)(v * 255.0F + 0.5F)) << 32 ^ var2) & -1L << 32;
      return (int)(var2 >>> 32) < 0 ? 0 : ((int)(var2 >>> 32) > 255 ? 255 : (int)(var2 >>> 32));
   }

   int IliIlllilIi() {
      return this.lliiIlllil;
   }

   void liiiIIllIl(float z, float y, float x) {
      float var4 = (float)Math.sqrt((double)(z * z + y * y + x * x));
      this.lIIIllllil = z / var4;
      this.iIIIllllil = y / var4;
      this.IlIIllllil = x / var4;
   }

   float[] IlIlllIlilIl(float y, float fnz, float fnx, float x, float fny, float z) {
      long var24 = 8493111899638190963L;
      var24 ^= ((long)iililIilIIiilIil.IIiilIiiiIii(fnx) << 32 ^ var24) & -1L << 32;
      float var26;
      float var27;
      float var28;
      if ((int)(var24 >>> 32) != 0) {
         var26 = 0.46F;
         var27 = 0.55F;
         var28 = 0.86F;
         float var11 = Math.max(0.0F, fny);
         var26 += 0.18F * var11;
         var27 += 0.2F * var11;
         var28 += 0.12F * var11;
      } else {
         var26 = IIiliiIilIiliiIi.IliIlllilIi(Iiilliiliiil<"Iiilliiliiil","QYmeYS25wnJPNeq4fI+bxNqjza+wlW5VzIyRq6Mk87Hs">(), 0.17F);
         var27 = IIiliiIilIiliiIi.IliIlllilIi(Iiilliiliiil<"Iiilliiliiil","fgLjxJUE0BiO6NQDMW7ck2KDsfo68KYJ+IrsPN5Azc24">(), 0.13F);
         var28 = IIiliiIilIiliiIi.IliIlllilIi(Iiilliiliiil<"Iiilliiliiil","rrV9KfMgbKEHBfH3tHkcZNB+EUutNdt9WR0jhudxFDAN">(), 0.115F);
      }

      float var29 = 0.0F;
      float var12 = 0.0F;
      float var13 = 0.0F;

      for (liIliiliiIliil var15 : this.llIIllllil.lIIlIllIil) {
         if ((int)(var24 >>> 32) == 0 || !var15.IiIlliIliiIl()) {
            float var16 = var15.IliIlllilIi() - y;
            float var17 = var15.liiiIIllIl() - fnz;
            float var18 = var15.iIlIlllllill() - fnx;
            float var19 = var16 * var16 + var17 * var17 + var18 * var18;
            float var20 = (float)Math.sqrt((double)var19);
            float var21 = var20 < 1.0E-4F ? 1.0F : Math.max(0.0F, (var16 * x + var17 * fny + var18 * z) / var20);
            var21 = 0.25F + 0.75F * var21;
            float var22 = var15.IIIllIIliIIl() / (1.0F + var19 / (var15.IlIlllIlilIl() * var15.IlIlllIlilIl()));
            if ((int)(var24 >>> 32) != 0) {
               var22 *= 0.35F;
            }

            float var23 = var22 * var21;
            if (var15.IiIlliIliiIl()) {
               var29 += var15.IilliliilIIi() * var23;
               var12 += var15.lIiiIiIlilli() * var23;
               var13 += var15.iliIiiliiiii() * var23;
            } else {
               var26 += var15.IilliliilIIi() * var23;
               var27 += var15.lIiiIiIlilli() * var23;
               var28 += var15.iliIiiliiiii() * var23;
            }
         }
      }

      this.IiIIllllil[0] = var26;
      this.IiIIllllil[1] = var27;
      this.IiIIllllil[2] = var28;
      this.IiIIllllil[3] = var29;
      this.IiIIllllil[4] = var12;
      this.IiIIllllil[5] = var13;
      return this.IiIIllllil;
   }

   private void lIiiIiIlilli(class_777 state, class_2680 by, class_324 oy, float colors, float grid, float q, int bx, int glow, int bz, boolean oz, boolean ox) {
      long var42 = -2554520492992553503L;
      long var44 = -921300227601805179L;
      long var46 = 8862639279603671966L;
      float var12 = 0.0F;
      float var13 = 0.0F;
      float var14 = 0.0F;

      for (var42 ^= (0L ^ var42) & -1L << 32; (int)(var42 >>> 32) < 4; var42 += 4294967296L) {
         Vector3fc var16 = state.method_76648((int)(var42 >>> 32));
         this.liiiIlllil[(int)(var42 >>> 32)][0] = colors + var16.x();
         this.liiiIlllil[(int)(var42 >>> 32)][1] = grid + var16.y();
         this.liiiIlllil[(int)(var42 >>> 32)][2] = q + var16.z();
         var12 += this.liiiIlllil[(int)(var42 >>> 32)][0];
         var13 += this.liiiIlllil[(int)(var42 >>> 32)][1];
         var14 += this.liiiIlllil[(int)(var42 >>> 32)][2];
         long var17 = state.method_76649((int)(var42 >>> 32));
         this.iiiiIlllil[(int)(var42 >>> 32)][0] = class_5611.method_76641(var17);
         this.iiiiIlllil[(int)(var42 >>> 32)][1] = class_5611.method_76642(var17);
      }

      var12 *= 0.25F;
      var13 *= 0.25F;
      var14 *= 0.25F;
      float var15 = this.liiiIlllil[1][0] - this.liiiIlllil[0][0];
      float var51 = this.liiiIlllil[1][1] - this.liiiIlllil[0][1];
      float var52 = this.liiiIlllil[1][2] - this.liiiIlllil[0][2];
      float var18 = this.liiiIlllil[2][0] - this.liiiIlllil[0][0];
      float var19 = this.liiiIlllil[2][1] - this.liiiIlllil[0][1];
      float var20 = this.liiiIlllil[2][2] - this.liiiIlllil[0][2];
      float var21 = var51 * var20 - var52 * var19;
      float var22 = var52 * var18 - var15 * var20;
      float var23 = var15 * var19 - var51 * var18;
      float var24 = (float)Math.sqrt((double)(var21 * var21 + var22 * var22 + var23 * var23));
      if (!(var24 < 1.0E-6F)) {
         var21 /= var24;
         var22 /= var24;
         var23 /= var24;
         float var25 = -Float.MAX_VALUE;

         for (long var57 = var42 ^ (0L ^ var42) & -1L >>> 32; (int)var57 + 2 < this.ilIIllllil.length; var57 ^= (var57 ^ var57 + (long)3) & -1L >>> 32) {
            var25 = Math.max(
               var25,
               var21 * (this.ilIIllllil[(int)var57] - var12)
                  + var22 * (this.ilIIllllil[(int)var57 + 1] - var13)
                  + var23 * (this.ilIIllllil[(int)var57 + 2] - var14)
            );
         }

         if (!(var25 < -0.35F)) {
            class_2350 var26 = state.comp_3723();
            var44 ^= ((long)(var26 == null ? 1 : var26.ordinal()) << 32 ^ var44) & -1L << 32;
            var44 ^= ((long)(state.method_3360() ? oy.method_1697(by, null, null, state.comp_3722()) : -1) ^ var44) & -1L >>> 32;
            float var29 = 1.0F;
            float var30 = 1.0F;
            float var31 = 1.0F;
            if (state.method_3360() && (int)var44 != -1) {
               var29 = (float)((int)var44 >> 16 & 0xFF) / 255.0F;
               var30 = (float)((int)var44 >> 8 & 0xFF) / 255.0F;
               var31 = (float)((int)var44 & 0xFF) / 255.0F;
            }

            float var32 = state.comp_3725() ? IIiiIlllil[(int)(var44 >>> 32)] : 1.0F;
            var46 ^= ((long)(oz && iliIiiliiiii(state.comp_3724()) ? 1 : 0) << 32 ^ var46) & -1L << 32;
            if (ox && state.comp_3725() && var26 != null && (int)(var46 >>> 32) == 0) {
               this.IIIllIIliIIl(var26, bx, glow, bz);
            } else {
               for (var46 ^= (0L ^ var46) & -1L >>> 32; (int)var46 < 4; var46 ^= (var46 ^ var46 + (long)1) & -1L >>> 32) {
                  this.IIIIllllil[(int)var46] = 1.0F;
               }
            }

            for (long var61 = var46 ^ (0L ^ var46) & -1L >>> 32; (int)var61 < 4; var61 ^= (var61 ^ var61 + (long)1) & -1L >>> 32) {
               float var35 = var29 * var32 * this.IIIIllllil[(int)var61];
               float var36 = var30 * var32 * this.IIIIllllil[(int)var61];
               float var37 = var31 * var32 * this.IIIIllllil[(int)var61];
               float var38 = this.liiiIlllil[(int)var61][0];
               float var39 = this.liiiIlllil[(int)var61][1];
               float var40 = this.liiiIlllil[(int)var61][2];
               if ((int)(var61 >>> 32) != 0) {
                  this.IIlllIlliIll(
                     var38, var39, var40, this.iiiiIlllil[(int)var61][0], this.iiiiIlllil[(int)var61][1], var29, var30, var31, 0.0F, 0.0F, 0.0F, 0.0F
                  );
               } else {
                  float[] var41 = this.IlIlllIlilIl(var38 + var21 * 0.05F, var39 + var22 * 0.05F, var40 + var23 * 0.05F, var21, var22, var23);
                  this.IIlllIlliIll(
                     var38,
                     var39,
                     var40,
                     this.iiiiIlllil[(int)var61][0],
                     this.iiiiIlllil[(int)var61][1],
                     var35 * var41[0],
                     var36 * var41[1],
                     var37 * var41[2],
                     var35 * var41[3],
                     var36 * var41[4],
                     var37 * var41[5],
                     IiIlliIliiIl(var38, var40)
                  );
               }
            }
         }
      }
   }

   IlIiililllIiilil() {
      this.liiiIlllil = new float[4][3];
      this.iiiiIlllil = new float[4][2];
      this.IIIIllllil = new float[4];
      this.ilIIllllil = new float[3];
      this.IiIIllllil = new float[6];
   }

   private void IilliliilIIi(
      class_773 grid, class_324 bz, List<class_10889> oz, class_2680 ox, float state, float by, float models, int bx, int oy, int parts, boolean colors
   ) {
      long var22 = 4435235145445142810L;
      long var24 = -6964215036052901407L;
      if (ox.method_26217() == class_2464.field_11458) {
         class_1087 var12 = grid.method_3335(ox);
         oz.clear();
         var12.method_68513(class_5819.method_43049(ox.method_26190(new class_2338(bx, oy, parts))), oz);
         var22 ^= ((long)(ox.method_26213() > 0 ? 1 : 0) << 32 ^ var22) & -1L << 32;

         for (class_10889 var15 : oz) {
            class_2350[] var16 = class_2350.values();
            var22 ^= ((long)var16.length ^ var22) & -1L >>> 32;

            for (var24 ^= (0L ^ var24) & -1L << 32; (int)(var24 >>> 32) < (int)var22; var24 += 4294967296L) {
               class_2350 var19 = var16[(int)(var24 >>> 32)];
               if (!colors || !this.llIIllllil.iliIiiliiiii(bx + var19.method_10148(), oy + var19.method_10164(), parts + var19.method_10165())) {
                  for (class_777 var21 : var15.method_68509(var19)) {
                     this.lIiiIiIlilli(var21, ox, bz, state, by, models, bx, oy, parts, (boolean)((int)(var22 >>> 32)), colors);
                  }
               }
            }

            for (class_777 var17 : var15.method_68509(null)) {
               this.lIiiIiIlilli(var17, ox, bz, state, by, models, bx, oy, parts, (boolean)((int)(var22 >>> 32)), colors);
            }
         }
      }
   }

   private void IIIllIIliIIl(class_2350 bx, int by, int bz, int face) {
      long var32 = 5899154997580073022L;
      long var34 = 5285544659927514478L;
      long var36 = -8132398009821190006L;
      long var38 = -3339254244815115188L;
      long var40 = -3424101882055739704L;
      long var26 = -5104068600840459286L;
      long var42 = 2055911434083262770L;
      long var28 = -7886711168031399739L;
      long var30 = -6610377496135504629L;
      var26 ^= ((long)(by + bx.method_10148()) << 32 ^ var26) & -1L << 32;
      var26 ^= ((long)(bz + bx.method_10164()) ^ var26) & -1L >>> 32;
      var28 ^= ((long)(face + bx.method_10165()) << 32 ^ var28) & -1L << 32;
      class_2351 var8 = bx.method_10166();

      for (long var47 = var28 ^ (0L ^ var28) & -1L >>> 32; (int)var47 < 4; var47 ^= (var47 ^ var47 + (long)1) & -1L >>> 32) {
         float var10 = this.liiiIlllil[(int)var47][0] - (float)by;
         float var11 = this.liiiIlllil[(int)var47][1] - (float)bz;
         float var12 = this.liiiIlllil[(int)var47][2] - (float)face;
         var30 ^= ((long)(var8 == class_2351.field_11048 ? 0 : (var10 > 0.75F ? 1 : (var10 < 0.25F ? -1 : 0))) << 32 ^ var30) & -1L << 32;
         var30 ^= ((long)(var8 == class_2351.field_11052 ? 0 : (var11 > 0.75F ? 1 : (var11 < 0.25F ? -1 : 0))) ^ var30) & -1L >>> 32;
         var32 ^= ((long)(var8 == class_2351.field_11051 ? 0 : (var12 > 0.75F ? 1 : (var12 < 0.25F ? -1 : 0))) << 32 ^ var32) & -1L << 32;
         if (var8 == class_2351.field_11048) {
            var32 ^= (0L ^ var32) & -1L >>> 32;
            var34 ^= ((long)((int)var30) << 32 ^ var34) & -1L << 32;
            var34 ^= (0L ^ var34) & -1L >>> 32;
            var36 ^= (0L ^ var36) & -1L << 32;
            var36 ^= (0L ^ var36) & -1L >>> 32;
            var38 ^= ((long)((int)(var32 >>> 32)) << 32 ^ var38) & -1L << 32;
         } else if (var8 == class_2351.field_11052) {
            var32 ^= ((long)((int)(var30 >>> 32)) ^ var32) & -1L >>> 32;
            var34 ^= (0L ^ var34) & -1L << 32;
            var34 ^= (0L ^ var34) & -1L >>> 32;
            var36 ^= (0L ^ var36) & -1L << 32;
            var36 ^= (0L ^ var36) & -1L >>> 32;
            var38 ^= ((long)((int)(var32 >>> 32)) << 32 ^ var38) & -1L << 32;
         } else {
            var32 ^= ((long)((int)(var30 >>> 32)) ^ var32) & -1L >>> 32;
            var34 ^= (0L ^ var34) & -1L << 32;
            var34 ^= (0L ^ var34) & -1L >>> 32;
            var36 ^= (0L ^ var36) & -1L << 32;
            var36 ^= ((long)((int)var30) ^ var36) & -1L >>> 32;
            var38 ^= (0L ^ var38) & -1L << 32;
         }

         var38 ^= (
               (long)(
                     ((int)var32 | (int)(var34 >>> 32) | (int)var34) != 0
                           && this.llIIllllil
                              .iliIiiliiiii((int)(var26 >>> 32) + (int)var32, (int)var26 + (int)(var34 >>> 32), (int)(var47 >>> 32) + (int)var34)
                        ? 1
                        : 0
                  )
                  ^ var38
            )
            & -1L >>> 32;
         long var57 = var40
            ^ (
                  (long)(
                           ((int)(var36 >>> 32) | (int)var36 | (int)(var38 >>> 32)) != 0
                                 && this.llIIllllil
                                    .iliIiiliiiii((int)(var26 >>> 32) + (int)(var36 >>> 32), (int)var26 + (int)var36, (int)(var47 >>> 32) + (int)(var38 >>> 32))
                              ? 1
                              : 0
                        )
                        << 32
                     ^ var40
               )
               & -1L << 32;
         var40 = var57
            ^ (
                  (long)(
                        ((int)var32 | (int)(var34 >>> 32) | (int)var34) != 0
                              && ((int)(var36 >>> 32) | (int)var36 | (int)(var38 >>> 32)) != 0
                              && this.llIIllllil
                                 .iliIiiliiiii(
                                    (int)(var26 >>> 32) + (int)var32 + (int)(var36 >>> 32),
                                    (int)var26 + (int)(var34 >>> 32) + (int)var36,
                                    (int)(var47 >>> 32) + (int)var34 + (int)(var38 >>> 32)
                                 )
                           ? 1
                           : 0
                     )
                     ^ var57
               )
               & -1L >>> 32;
         var42 ^= (
               (long)(
                        (int)var38 != 0 && (int)(var40 >>> 32) != 0
                           ? 3
                           : ((int)var38 != 0 ? 1 : 0) + ((int)(var40 >>> 32) != 0 ? 1 : 0) + ((int)var40 != 0 ? 1 : 0)
                     )
                     << 32
                  ^ var42
            )
            & -1L << 32;
         this.IIIIllllil[(int)var47] = lIiiIlllil[Math.min(3, (int)(var42 >>> 32))];
      }
   }

   private static float IiIlliIliiIl(float z, float x) {
      return (float)Math.floorMod((int)Math.floor((double)(z * 1.7F + x * 1.1F)), 16);
   }

   void iIlIlllllill(iililIilIIiilIil room, float... eyes) {
      long var16 = -6496154660047823782L;
      long var18 = 6772265791990634620L;
      long var14 = -6233294699941550332L;
      this.llIIllllil = room;
      this.ilIIllllil = (float[])eyes.clone();
      this.lliiIlllil = 0;
      class_310 var3 = class_310.method_1551();
      class_773 var4 = var3.method_1541().method_3351();
      class_324 var5 = var3.method_1505();
      ArrayList var6 = new ArrayList();

      for (Entry var8 : room.iiiIIllIil.entrySet()) {
         long var9 = (Long)var8.getKey();
         long var22 = var14 ^ ((long)iililIilIIiilIil.liiiIIllIl(var9) << 32 ^ var14) & -1L << 32;
         var14 = var22 ^ ((long)iililIilIIiilIil.iIlIlllllill(var9) ^ var22) & -1L >>> 32;
         var16 ^= ((long)iililIilIIiilIil.IilliliilIIi(var9) << 32 ^ var16) & -1L << 32;
         this.IilliliilIIi(
            var4,
            var5,
            var6,
            (class_2680)var8.getValue(),
            (float)((int)(var14 >>> 32)),
            (float)((int)var14),
            (float)((int)(var16 >>> 32)),
            (int)(var14 >>> 32),
            (int)var14,
            (int)(var16 >>> 32),
            true
         );
      }

      for (IillliIilillliIi var21 : room.IIIlIllIil) {
         var16 ^= ((long)((int)Math.floor((double)var21.liiiIIllIl())) ^ var16) & -1L >>> 32;
         var18 ^= ((long)((int)Math.floor((double)var21.iIlIlllllill())) << 32 ^ var18) & -1L << 32;
         var14 ^= ((long)((int)Math.floor((double)var21.IilliliilIIi())) << 32 ^ var14) & -1L << 32;
         this.IilliliilIIi(
            var4,
            var5,
            var6,
            var21.IliIlllilIi(),
            var21.liiiIIllIl(),
            var21.iIlIlllllill(),
            var21.IilliliilIIi(),
            (int)var16,
            (int)(var18 >>> 32),
            (int)(var14 >>> 32),
            false
         );
      }
   }

   void Illlllllilll(double t) {
      long var7 = -7995956909653177025L;

      for (long var9 = var7 ^ (0L ^ var7) & -1L << 32; (int)(var9 >>> 32) < 16; var9 += 4294967296L) {
         double var4 = (double)((int)(var9 >>> 32)) * 0.73;
         float var6 = 0.84F
            + 0.09F * (float)Math.sin(t * 9.7 + var4)
            + 0.05F * (float)Math.sin(t * 23.3 + var4 * 2.1)
            + 0.04F * (float)Math.sin(t * 4.1 + var4 * 0.6);
         this.iliiIlllil[(int)(var9 >>> 32)] = Math.max(0.62F, Math.min(1.05F, var6));
      }
   }

   private void IIlllIlliIll(float y, float fg, float fb, float u, float sr, float sg, float sb, float x, float z, float phase, float v, float fr) {
      long var15 = -7562649645270838252L;
      var15 ^= ((long)((this.lliiIlllil + 1) * 12) << 32 ^ var15) & -1L << 32;
      if ((int)(var15 >>> 32) > this.IliiIlllil.length) {
         this.IliiIlllil = Arrays.copyOf(this.IliiIlllil, this.IliiIlllil.length * 2);
      }

      var15 ^= ((long)(this.lliiIlllil * 12) ^ var15) & -1L >>> 32;
      this.IliiIlllil[(int)var15] = y;
      this.IliiIlllil[(int)var15 + 1] = fg;
      this.IliiIlllil[(int)var15 + 2] = fb;
      this.IliiIlllil[(int)var15 + 3] = u;
      this.IliiIlllil[(int)var15 + 4] = sr;
      this.IliiIlllil[(int)var15 + 5] = sg;
      this.IliiIlllil[(int)var15 + 6] = sb;
      this.IliiIlllil[(int)var15 + 7] = x;
      this.IliiIlllil[(int)var15 + 8] = z;
      this.IliiIlllil[(int)var15 + 9] = phase;
      this.IliiIlllil[(int)var15 + 10] = v;
      this.IliiIlllil[(int)var15 + 11] = fr;
      this.lliiIlllil++;
   }

   float Iilllilliill(float x, float z) {
      return this.iliiIlllil[(int)IiIlliIliiIl(x, z)];
   }

   void IIillIiliIil(class_4665 vc, class_4588 entry) {
      long var11 = 6982299525578278212L;
      long var13 = 272364589103065591L;
      long var15 = 6716750344057158839L;
      Matrix4f var3 = vc.method_23761();
      float[] var4 = this.IliiIlllil;
      var11 ^= (0L ^ var11) & -1L << 32;
      var11 ^= (0L ^ var11) & -1L >>> 32;

      while ((int)(var11 >>> 32) < this.lliiIlllil) {
         var3.transformPosition(var4[(int)var11], var4[(int)var11 + 1], var4[(int)var11 + 2], this.IiiiIlllil);
         float var7 = this.iliiIlllil[(int)var4[(int)var11 + 11]];
         long var20 = var13 ^ ((long)Ililllililil(var4[(int)var11 + 5] + var4[(int)var11 + 8] * var7) << 32 ^ var13) & -1L << 32;
         var13 = var20 ^ ((long)Ililllililil(var4[(int)var11 + 6] + var4[(int)var11 + 9] * var7) ^ var20) & -1L >>> 32;
         var15 ^= ((long)Ililllililil(var4[(int)var11 + 7] + var4[(int)var11 + 10] * var7) << 32 ^ var15) & -1L << 32;
         entry.method_23919(
            this.IiiiIlllil.x,
            this.IiiiIlllil.y,
            this.IiiiIlllil.z,
            0xFF000000 | (int)(var13 >>> 32) << 16 | (int)var13 << 8 | (int)(var15 >>> 32),
            var4[(int)var11 + 3],
            var4[(int)var11 + 4],
            class_4608.field_21444,
            15728880,
            this.lIIIllllil,
            this.iIIIllllil,
            this.IlIIllllil
         );
         var11 += 4294967296L;
         var11 ^= (var11 ^ var11 + (long)12) & -1L >>> 32;
      }
   }
}
