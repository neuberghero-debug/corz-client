package gg.corz;

import net.minecraft.class_4588;
import net.minecraft.class_11659.class_11660;
import net.minecraft.class_4587.class_4665;
import org.joml.Matrix4f;
import org.joml.Vector3f;

final class illIliIiIilIliIi implements class_11660 {
   static final float IillIliIIi = 0.58F;
   static final float iIllIliIIi = 0.42F;
   static final int lIllIliIIi = 96;
   private class_4588 IlliIliIIi;
   static final float llilIliIIi = 0.4F;
   static final float iIilIliIIi = 0.012F;
   private static final float[] lIIiIliIIi = new float[97];
   static final float iiilIliIIi = 0.1F;
   private float IIliIliIIi = 1.0F;
   static final float llllIliIIi = 0.05F;
   static final float iillIliIIi = 0.72F;
   static final float ililIliIIi = 0.75F;
   private int liIiIliIIi;
   private float lIliIliIIi;
   private int iiIiIliIIi;
   private final IiIIlllliIIlll illiIliIIi;
   static final float IiilIliIIi = 0.25F;
   static final int IlilIliIIi = 1711276032;
   static final float illlIliIIi = 0.14F;
   static final float IIilIliIIi = 0.007F;
   static final float lIilIliIIi = 0.52F;
   static final float IlllIliIIi = 0.58F;
   private Matrix4f iIliIliIIi;
   private static final float[] iIIiIliIIi = new float[97];
   private static final float IIIiIliIIi = (float) Math.PI;
   private static final float[] IlIiIliIIi = new float[97];
   static final float liilIliIIi = 0.55F;
   private int llIiIliIIi;
   static final float lillIliIIi = 0.01F;
   private int IiIiIliIIi;
   private int ilIiIliIIi;
   private final Vector3f llliIliIIi = new Vector3f();

   static int iIlIlllllill(int rgb, float hi, float lo, float power, float hover) {
      float var5 = hi + (lo - hi) * ilillIiIiillIi.IIillIiliIil(power) + 0.1F * ilillIiIiillIi.IIillIiliIil(hover);
      return IilliliilIIi(rgb, var5);
   }

   illIliIiIilIliIi() {
      this.illiIliIIi = this::liiiIIllIl;
   }

   static void IlIlllIlilIl(IiIIlllliIIlll scan, int sweep, int scanY, int floor, int shadow, float s, int outer, float inner) {
      float var8 = ilillIiIiillIi.IIillIiliIil(s);
      if (var8 > 0.0F) {
         if (sweep >>> 24 != 0) {
            Illlllllilll(scan, 0.58F, lIiiIiIlilli(sweep, var8));
         }

         if (shadow >>> 24 != 0) {
            Illlllllilll(scan, 0.42F, lIiiIiIlilli(shadow, var8));
         }

         if (scanY >>> 24 != 0) {
            IiIlliIliiIl(scan, 0.58F, 0.0F, 0.01F, scanY, var8);
         }

         if (floor >>> 24 != 0) {
            IiIlliIliiIl(scan, 0.72F, 0.0F, 0.007F, floor, var8);
         }
      }

      if (outer >>> 24 != 0) {
         IiIlliIliiIl(scan, 0.52F, inner, 0.012F, outer, 1.0F);
      }
   }

   private static void IIlllIlliIll(IiIIlllliIIlll z0, float top, float z1, float s, float x0, float y0, float bottom, int x1, int y1) {
      z0.v(top, y0, z1, x1);
      z0.v(s, y0, x0, x1);
      z0.v(s, bottom, x0, y1);
      z0.v(top, bottom, z1, y1);
   }

   void IliIlllilIi(int shadow, int sweep, int floor, int scanY, float outer, int scan, float inner) {
      this.llIiIliIIi = shadow;
      this.ilIiIliIIi = sweep;
      this.IiIiIliIIi = floor;
      this.liIiIliIIi = scanY;
      this.IIliIliIIi = outer;
      this.iiIiIliIIi = scan;
      this.lIliIliIIi = inner;
   }

   static void IiIlliIliiIl(IiIIlllliIIlll s, float y0, float sweep, float h, int argb, float r) {
      long var16 = 3911764788743242499L;
      long var18 = 7706489033318775071L;
      var16 ^= ((long)(argb & 16777215) << 32 ^ var16) & -1L << 32;
      float var7 = sweep + h;
      if (!(r >= 1.0F)) {
         float var8 = r * (float) Math.PI;
         float var9 = (float)Math.sin((double)var8) * y0;
         float var10 = (float)Math.cos((double)var8) * y0;

         for (long var22 = var18 ^ (0L ^ var18) & -1L << 32; (int)(var22 >>> 32) < 96; var22 += 4294967296L) {
            if (!(IlIiIliIIi[(int)(var22 >>> 32) + 1] <= -var8) && !(IlIiIliIIi[(int)(var22 >>> 32)] >= var8)) {
               float var12 = IlIiIliIIi[(int)(var22 >>> 32)] < -var8 ? -var9 : lIIiIliIIi[(int)(var22 >>> 32)] * y0;
               float var13 = IlIiIliIIi[(int)(var22 >>> 32)] < -var8 ? var10 : iIIiIliIIi[(int)(var22 >>> 32)] * y0;
               float var14 = IlIiIliIIi[(int)(var22 >>> 32) + 1] > var8 ? var9 : lIIiIliIIi[(int)(var22 >>> 32) + 1] * y0;
               float var15 = IlIiIliIIi[(int)(var22 >>> 32) + 1] > var8 ? var10 : iIIiIliIIi[(int)(var22 >>> 32) + 1] * y0;
               IIlllIlliIll(s, var12, var13, var14, var15, sweep, var7, argb, (int)(var16 >>> 32));
            }
         }
      } else {
         for (long var21 = var16 ^ (0L ^ var16) & -1L >>> 32; (int)var21 < 96; var21 ^= (var21 ^ var21 + (long)1) & -1L >>> 32) {
            IIlllIlliIll(
               s,
               lIIiIliIIi[(int)var21] * y0,
               iIIiIliIIi[(int)var21] * y0,
               lIIiIliIIi[(int)var21 + 1] * y0,
               iIIiIliIIi[(int)var21 + 1] * y0,
               sweep,
               var7,
               argb,
               (int)(var21 >>> 32)
            );
         }
      }
   }

   static void IIIllIIliIIl(IiIIlllliIIlll scan, int inner, int s, int outer, float shadow, int sweep, float scanY) {
      IlIlllIlilIl(scan, 0, inner, s, outer, shadow, sweep, scanY);
   }

   static int iliIiiliiiii(int rgb, float power) {
      return IilliliilIIi(rgb, 0.05F + 0.09F * ilillIiIiillIi.IIillIiliIil(power));
   }

   static int IilliliilIIi(int rgb, float a) {
      long var3 = -8280189995608198162L;
      var3 ^= ((long)Math.round(ilillIiIiillIi.IIillIiliIil(a) * 255.0F) << 32 ^ var3) & -1L << 32;
      return (int)(var3 >>> 32) << 24 | rgb & 16777215;
   }

   static int lIiiIiIlilli(int k, float argb) {
      return IilliliilIIi(k, (float)(k >>> 24) / 255.0F * argb);
   }

   public void render(class_4665 e, class_4588 vc) {
      this.iIliIliIIi = e.method_23761();
      this.IlliIliIIi = vc;

      try {
         IlIlllIlilIl(this.illiIliIIi, this.llIiIliIIi, this.ilIiIliIIi, this.IiIiIliIIi, this.liIiIliIIi, this.IIliIliIIi, this.iiIiIliIIi, this.lIliIliIIi);
      } finally {
         this.iIliIliIIi = null;
         this.IlliIliIIi = null;
      }
   }

   static void Illlllllilll(IiIIlllliIIlll s, float center, int r) {
      long var5 = 7122832658791619070L;
      var5 ^= ((long)(r & 16777215) << 32 ^ var5) & -1L << 32;

      for (long var8 = var5 ^ (0L ^ var5) & -1L >>> 32; (int)var8 < 96; var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
         s.v(0.0F, 0.0F, 0.0F, r);
         s.v(0.0F, 0.0F, 0.0F, r);
         s.v(iIIiIliIIi[(int)var8 + 1] * center, 0.0F, lIIiIliIIi[(int)var8 + 1] * center, (int)(var8 >>> 32));
         s.v(iIIiIliIIi[(int)var8] * center, 0.0F, lIIiIliIIi[(int)var8] * center, (int)(var8 >>> 32));
      }
   }

   static {
      long var3 = 5620533793308702146L;

      for (long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) <= 96; var5 += 4294967296L) {
         double var1 = -Math.PI + (double)((int)(var5 >>> 32)) * (Math.PI * 2) / 96.0;
         IlIiIliIIi[(int)(var5 >>> 32)] = (float)var1;
         lIIiIliIIi[(int)(var5 >>> 32)] = (float)Math.sin(var1);
         iIIiIliIIi[(int)(var5 >>> 32)] = (float)Math.cos(var1);
      }
   }

   private void liiiIIllIl(float z, float x, float y, int argb) {
      this.iIliIliIIi.transformPosition(z, x, y, this.llliIliIIi);
      this.IlliIliIIi.method_22912(this.llliIliIIi.x, this.llliIliIIi.y, this.llliIliIIi.z).method_39415(argb);
   }
}
