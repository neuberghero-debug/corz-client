package gg.corz;

import net.minecraft.class_4184;
import net.minecraft.class_4588;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public final class Iillllilll {
   private static final float lliIiililiIiil = 0.2F;
   private static final float iIiIiilIliIiil = 0.05F;
   private static final float illIiilIilIiil = 1.5F;
   private static int Iiiiiilliiiiil;
   private static final float lIIliiliIIliil = 0.25F;
   private static final float IiiIiilliiIiil = 0.34F;
   private static float IIiiiillIiiiil;
   private static boolean lIIIIIiiIIIIIi;
   private static final Vector3f lIiliiliIiliil = new Vector3f(0.0F, 0.0F, -1.0F);
   private static int lliiiililiiiil;
   private static final Vector3f IiIiiilliIiiil = new Vector3f();
   private static final int lllliilillliil = 640;
   private static final Vector3f llIiiililIiiil = new Vector3f();
   private static final Vector3f Ililiillliliil = new Vector3f(1.0F, 0.0F, 0.0F);
   static final float IIiIiillIiIiil = 0.6F;
   private static final float iiiIiilIIIliil = 0.62F;
   private static float illiiilIiliiil;
   private static final Vector3f iilliilIIiliil = new Vector3f(0.0F, 0.0F, -1.5F);
   private static final Vector3f IIIiiillIIiiil = new Vector3f();
   private static final Vector3f iiIiiilIIliiil = new Vector3f();
   private static final Vector3f ililiilIiiliil = new Vector3f(0.0F, 1.0F, 0.0F);
   private static final float ilIliilIiIliil = 0.14F;
   private static final float Iilliillilliil = (float) (Math.PI * 2);
   private static boolean iIiiiilIliiiil;
   private static final Vector3f iIIiiilIlIiiil = new Vector3f();
   private static final float IlIliilllIliil = 0.0062F;
   private static float liliiiliiliiil;
   private static float Illiiilllliiil;
   private static final Vector3f liiliiliiiliil = new Vector3f();
   private static final float liIliiliiIliil = 0.55F;
   static final float lilIiiliilIiil = 0.18F;
   private static final int iIlliilIllliil = 96;
   private static final long IIlliillIlliil = 1600000000L;
   private static float lIliiiliIliiil = 1.5F;
   private static boolean iiiiiilIIIIIIi = true;

   public static float IIIllIIliIIl() {
      return iilliilIIiliil.x;
   }

   public static float IlIlllIlilIl() {
      return iilliilIIiliil.y;
   }

   public static void liiiIIllIl() {
      if (lIIIIIiiIIIIIi) {
         lIIIIIiiIIIIIi = false;
         liIilIIliiIilIIl.iIiiiillIl.method_22993();
      }
   }

   public static void Iilllilliill(double worldY, double accent, double worldX, int strong, boolean worldZ) {
      IIillIiliIil(
         iIiiIIilIliiIIil.Ililllililil(worldY),
         iIiiIIilIliiIIil.Iiilliiliiil(accent),
         iIiiIIilIliiIIil.IIIilIIiiIIi(worldX),
         iIillliIlillli.IIIilIIiiIIi(strong, worldZ ? 0.65F : 0.45F),
         iIillliIlillli.IIIilIIiiIIi(strong, 1.0F),
         worldZ ? 2.6F : 2.2F
      );
   }

   public static float IiIlliIliiIl() {
      return iilliilIIiliil.z;
   }

   public static void IIlllIlliIll(double worldY, double width, double argb, int worldZ, float worldX) {
      IIillIiliIil(iIiiIIilIliiIIil.Ililllililil(worldY), iIiiIIilIliiIIil.Iiilliiliiil(width), iIiiIIilIliiIIil.IIIilIIiiIIi(argb), worldZ, worldZ, worldX);
   }

   static float lIiiIiIlilli(float s, float depth1, float depth0) {
      if (s <= 0.0F) {
         return 0.0F;
      } else if (s >= 1.0F) {
         return 1.0F;
      } else {
         float var3 = (1.0F - s) * depth0 + s * depth1;
         return var3 > 1.0E-6F ? s * depth1 / var3 : s;
      }
   }

   static boolean IilliliilIIi(Matrix4f projection, float reach, Vector3f out) {
      liiliiliiiliil.set(projection.m00(), projection.m10(), projection.m20());
      IIIiiillIIiiil.set(projection.m01(), projection.m11(), projection.m21());
      liiliiliiiliil.cross(IIIiiillIIiiil, iiIiiilIIliiil);
      float var3 = iiIiiilIIliiil.length();
      if (!(var3 > 1.0E-6F)) {
         return false;
      } else {
         iIIiiilIlIiiil.set(iiIiiilIIliiil).div(var3);
         if (iIIiiilIlIiiil.z > 0.0F) {
            iIIiiilIlIiiil.negate();
         }

         IIIiiillIIiiil.cross(iIIiiilIlIiiil, llIiiililIiiil);
         iIIiiilIlIiiil.cross(liiliiliiiliil, IiIiiilliIiiil);
         float var4 = liiliiliiiliil.dot(llIiiililIiiil);
         if (!(Math.abs(var4) > 1.0E-9F)) {
            return false;
         } else {
            float var5 = -projection.m30();
            float var6 = -projection.m31();
            out.set(
               (llIiiililIiiil.x * var5 + IiIiiilliIiiil.x * var6 + iiIiiilIIliiil.x * reach) / var4,
               (llIiiililIiiil.y * var5 + IiIiiilliIiiil.y * var6 + iiIiiilIIliiil.y * reach) / var4,
               (llIiiililIiiil.z * var5 + IiIiiilliIiiil.z * var6 + iiIiiilIIliiil.z * reach) / var4
            );
            return out.isFinite() && out.lengthSquared() < reach * reach * 16.0F;
         }
      }
   }

   public static void Illlllllilll(double worldY, double startArgb, double worldX, int worldZ, int endArgb, float width) {
      IIillIiliIil(
         iIiiIIilIliiIIil.Ililllililil(worldY), iIiiIIilIliiIIil.Iiilliiliiil(startArgb), iIiiIIilIliiIIil.IIIilIIiiIIi(worldX), worldZ, endArgb, width
      );
   }

   private Iillllilll() {
   }

   private static float iliIiiliiiii(float s) {
      if (iIiiiilIliiiil) {
         return lIiiIiIlilli(s, illiiilIiliiil, liliiiliiliiil);
      } else {
         return s <= 0.18F ? s / 0.18F * IIiiiillIiiiil : IIiiiillIiiiil + (Math.min(1.0F, s) - 0.18F) / 0.82F * (1.0F - IIiiiillIiiiil);
      }
   }

   private static void IIillIiliIil(float startArgb, float tz, float width, int tx, int ty, float endArgb) {
      long var37 = 2809984761510030880L;
      long var39 = -7321966068867284146L;
      float var6 = iIillliIlillli.Iilililiiili(tx);
      float var7 = iIillliIlillli.Iilililiiili(ty);
      if (!(var6 < 0.004F) || !(var7 < 0.004F)) {
         float var8 = iilliilIIiliil.x;
         float var9 = iilliilIIiliil.y;
         float var10 = iilliilIIiliil.z;
         float var11 = startArgb - var8;
         float var12 = tz - var9;
         float var13 = width - var10;
         float var14 = var11 * var11 + var12 * var12 + var13 * var13;
         if (!(var14 < 1.0E-6F)) {
            lliiiililiiiil++;
            float var15 = startArgb * lIiliiliIiliil.x + tz * lIiliiliIiliil.y + width * lIiliiliIiliil.z;
            iIiiiilIliiiil = var15 > 0.05F && lIliiiliIliiil > 0.05F;
            illiiilIiliiil = lIliiiliIliiil;
            liliiiliiliiil = var15;
            IIiiiillIiiiil = Math.min(0.5F, 0.2F / (float)Math.sqrt((double)var14));
            float var16 = iIiiiilIliiiil ? iIillliIlillli.liiiIIllIl((var15 - 8.0F) / 88.0F) : 0.0F;
            float var17 = Math.max(1.0F, Math.min(6.0F, endArgb)) * (1.2F - 0.35F * var16);
            float var18 = Math.max(var6, var7);
            Matrix4f var19 = iIiiIIilIliiIIil.IIillIiliIil();
            class_4588 var20 = iIlIlllllill();
            float var21 = iliIiiliiiii(0.18F);
            float var22 = var8 + var11 * var21;
            float var23 = var9 + var12 * var21;
            float var24 = var10 + var13 * var21;
            if (Iiiiiilliiiiil <= 640) {
               var37 ^= ((long)iIillliIlillli.IIIilIIiiIIi(0, 0.34F * var6) << 32 ^ var37) & -1L << 32;
               iIiiIIilIliiIIil.IIiilIiiiIii(var20, var19, var8, var9, var10, 0, var22, var23, var24, (int)(var37 >>> 32), var17 + 2.0F);
               iIiiIIilIliiIIil.IIiilIiiiIii(
                  var20, var19, var22, var23, var24, (int)(var37 >>> 32), startArgb, tz, width, iIillliIlillli.IIIilIIiiIIi(0, 0.34F * var7), var17 + 2.0F
               );
            }

            iIiiIIilIliiIIil.IIiilIiiiIii(var20, var19, var8, var9, var10, tx & 16777215, var22, var23, var24, tx, var17);
            if (tx == ty) {
               iIiiIIilIliiIIil.IIiilIiiiIii(var20, var19, var22, var23, var24, tx, startArgb, tz, width, ty, var17);
            } else {
               float var25 = iliIiiliiiii(0.6F);
               float var26 = var8 + var11 * var25;
               float var27 = var9 + var12 * var25;
               float var28 = var10 + var13 * var25;
               var37 ^= ((long)iIillliIlillli.iliIiiliiiii(tx, ty, 0.51219517F) ^ var37) & -1L >>> 32;
               iIiiIIilIliiIIil.IIiilIiiiIii(var20, var19, var22, var23, var24, tx, var26, var27, var28, (int)var37, var17);
               iIiiIIilIliiIIil.IIiilIiiiIii(var20, var19, var26, var27, var28, (int)var37, startArgb, tz, width, ty, var17);
            }

            if (iIiiiilIliiiil && Iiiiiilliiiiil <= 96) {
               float var41 = startArgb * Ililiillliliil.x + tz * Ililiillliliil.y + width * Ililiillliliil.z;
               float var42 = startArgb * ililiilIiiliil.x + tz * ililiilIiiliil.y + width * ililiilIiiliil.z;
               float var43 = Illiiilllliiil + (float)Math.atan2((double)var42, (double)var41) / (float) (Math.PI * 2);
               var43 -= (float)Math.floor((double)var43);
               if (var43 < 0.55F) {
                  float var45 = var43 / 0.55F;
                  float var29 = 0.09F + 0.90999997F * (1.0F - (1.0F - var45) * (1.0F - var45));
                  float var30 = Math.max(0.0F, var29 - 0.14F);
                  float var31 = Math.min(1.0F, var45 / 0.12F) * Math.min(1.0F, (1.0F - var45) / 0.3F);
                  var39 ^= ((long)(iIillliIlillli.iliIiiliiiii(ty | 0xFF000000, -1, 0.62F) & 16777215) << 32 ^ var39) & -1L << 32;
                  float var33 = iliIiiliiiii(var29);
                  float var34 = iliIiiliiiii(var30);
                  iIiiIIilIliiIIil.IIiilIiiiIii(
                     var20,
                     var19,
                     var8 + var11 * var34,
                     var9 + var12 * var34,
                     var10 + var13 * var34,
                     (int)(var39 >>> 32),
                     var8 + var11 * var33,
                     var9 + var12 * var33,
                     var10 + var13 * var33,
                     iIillliIlillli.IIIilIIiiIIi((int)(var39 >>> 32), var18 * var31),
                     var17 + 1.0F
                  );
               }

               float var46 = var15 * 0.0062F * (0.8F + 0.2F * var17);
               float var47 = Ililiillliliil.x * var46;
               float var48 = Ililiillliliil.y * var46;
               float var49 = Ililiillliliil.z * var46;
               float var32 = ililiilIiiliil.x * var46;
               float var50 = ililiilIiiliil.y * var46;
               float var51 = ililiilIiiliil.z * var46;
               var39 ^= ((long)iIillliIlillli.IIIilIIiiIIi(iIillliIlillli.iliIiiliiiii(ty | 0xFF000000, -1, 0.25F), Math.max(var7, var6 * 0.8F)) ^ var39)
                  & -1L >>> 32;
               float var36 = Math.max(1.25F, var17 * 0.85F);
               iIiiIIilIliiIIil.IIiilIiiiIii(
                  var20, var19, startArgb + var32, tz + var50, width + var51, (int)var39, startArgb + var47, tz + var48, width + var49, (int)var39, var36
               );
               iIiiIIilIliiIIil.IIiilIiiiIii(
                  var20, var19, startArgb + var47, tz + var48, width + var49, (int)var39, startArgb - var32, tz - var50, width - var51, (int)var39, var36
               );
               iIiiIIilIliiIIil.IIiilIiiiIii(
                  var20, var19, startArgb - var32, tz - var50, width - var51, (int)var39, startArgb - var47, tz - var48, width - var49, (int)var39, var36
               );
               iIiiIIilIliiIIil.IIiilIiiiIii(
                  var20, var19, startArgb - var47, tz - var48, width - var49, (int)var39, startArgb + var32, tz + var50, width + var51, (int)var39, var36
               );
            }
         }
      }
   }

   static void IliIlllilIi(class_4184 camera) {
      if (lIIIIIiiIIIIIi) {
         iiiiiilIIIIIIi = false;
         liiiIIllIl();
      }

      if (!IilliliilIIi(iliIliIlIiiIliIl.lIiIIiiIll, 1.5F, iilliilIIiliil)) {
         iilliilIIiliil.set(0.0F, 0.0F, -1.5F);
      }

      Quaternionf var1 = camera.method_23767();
      iilliilIIiliil.rotate(var1);
      lIiliiliIiliil.set(0.0F, 0.0F, -1.0F).rotate(var1);
      Ililiillliliil.set(1.0F, 0.0F, 0.0F).rotate(var1);
      ililiilIiiliil.set(0.0F, 1.0F, 0.0F).rotate(var1);
      lIliiiliIliiil = iilliilIIiliil.dot(lIiliiliIiliil);
      Illiiilllliiil = (float)Math.floorMod(System.nanoTime(), 1600000000L) / 1.6E9F;
      Iiiiiilliiiiil = lliiiililiiiil;
      lliiiililiiiil = 0;
   }

   private static class_4588 iIlIlllllill() {
      if (!iiiiiilIIIIIIi) {
         return iIiiIIilIliiIIil.IIlllIlliIll();
      } else {
         lIIIIIiiIIIIIi = true;
         return liIilIIliiIilIIl.iIiiiillIl.method_73477(liIilIIliiIilIIl.lIiiiillIl);
      }
   }
}
