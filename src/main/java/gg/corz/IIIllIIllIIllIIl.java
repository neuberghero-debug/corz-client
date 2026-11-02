package gg.corz;

import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import java.util.ArrayList;
import net.minecraft.class_4588;
import org.joml.Matrix4f;

public final class IIIllIIllIIllIIl {
   private static final float llIllillIl = 4.0F;
   private static final float IiIllillIl = 0.9F;
   private static final float liIllillIl = 0.5F;
   private static final float IlIllillIl = 2.5F;
   private static final float ilIllillIl = 2.2F;

   public static void IliIlllilIi(Matrix4f alpha, float m, float pw, float p, float py, float px, float color, float radius, int ph) {
      long var24 = -4897637175398679939L;
      long var26 = -174989790452000579L;
      long var28 = 6473037960984320803L;
      if (!(radius < 0.01F) && !(color <= 5.0E-4F)) {
         float var9 = 0.5F * IliiIilliiIi.Illlllllilll();
         float var10 = m - var9;
         float var11 = pw - var9;
         float var12 = m + p + var9;
         float var13 = pw + py + var9;
         float var14 = Math.min(px, Math.min(p, py) * 0.5F) + var9;
         float var15 = (var10 + var12) * 0.5F;
         ArrayList var16 = new ArrayList();
         iliIiiliiiii(var16, var15, var13, var12 - var14, var13, 0.0F, 1.0F);
         IIIllIIliIIl(var16, var12 - var14, var13 - var14, var14, 90.0F, 0.0F);
         iliIiiliiiii(var16, var12, var13 - var14, var12, var11 + var14, 1.0F, 0.0F);
         IIIllIIliIIl(var16, var12 - var14, var11 + var14, var14, 0.0F, -90.0F);
         iliIiiliiiii(var16, var12 - var14, var11, var15, var11, 0.0F, -1.0F);
         iliIiiliiiii(var16, var15, var11, var10 + var14, var11, 0.0F, -1.0F);
         IIIllIIliIIl(var16, var10 + var14, var11 + var14, var14, -90.0F, -180.0F);
         iliIiiliiiii(var16, var10, var11 + var14, var10, var13 - var14, -1.0F, 0.0F);
         IIIllIIliIIl(var16, var10 + var14, var13 - var14, var14, 180.0F, 90.0F);
         iliIiiliiiii(var16, var10 + var14, var13, var15, var13, 0.0F, 1.0F);
         var24 ^= ((long)var16.size() << 32 ^ var24) & -1L << 32;
         if ((int)(var24 >>> 32) >= 8) {
            var24 ^= ((long)Math.round(color * ((float)((int)(var24 >>> 32)) / 2.0F)) ^ var24) & -1L >>> 32;
            if ((int)var24 >= 1) {
               if ((int)var24 > (int)(var24 >>> 32) / 2) {
                  var24 ^= ((long)((int)(var24 >>> 32) / 2) ^ var24) & -1L >>> 32;
               }

               var26 ^= ((long)(ph >> 16 & 0xFF) << 32 ^ var26) & -1L << 32;
               var26 ^= ((long)(ph >> 8 & 0xFF) ^ var26) & -1L >>> 32;
               var28 ^= ((long)(ph & 0xFF) << 32 ^ var28) & -1L << 32;
               liiiIIllIl(alpha, var16, (int)(var24 >>> 32), (int)var24, color, 4.0F, 0.22F * radius, (int)(var26 >>> 32), (int)var26, (int)(var28 >>> 32));
               liiiIIllIl(alpha, var16, (int)(var24 >>> 32), (int)var24, color, 2.2F, 0.45F * radius, (int)(var26 >>> 32), (int)var26, (int)(var28 >>> 32));
               liiiIIllIl(alpha, var16, (int)(var24 >>> 32), (int)var24, color, 0.9F, 0.95F * radius, (int)(var26 >>> 32), (int)var26, (int)(var28 >>> 32));
               liiiIIllIl(
                  alpha,
                  var16,
                  (int)(var24 >>> 32),
                  (int)var24,
                  color,
                  0.55F,
                  0.55F * radius,
                  IlIlllIlilIl((int)(var26 >>> 32), 255, 0.6F),
                  IlIlllIlilIl((int)var26, 255, 0.6F),
                  IlIlllIlilIl((int)(var28 >>> 32), 255, 0.6F)
               );
               if (color < 0.995F) {
                  float[] var22 = (float[])var16.get((int)var24 % (int)(var24 >>> 32));
                  float[] var23 = (float[])var16.get((-((int)var24) % (int)(var24 >>> 32) + (int)(var24 >>> 32)) % (int)(var24 >>> 32));
                  IilliliilIIi(alpha, var22[0], var22[1], 5.4F, 0.5F * radius, (int)(var26 >>> 32), (int)var26, (int)(var28 >>> 32));
                  IilliliilIIi(alpha, var23[0], var23[1], 5.4F, 0.5F * radius, (int)(var26 >>> 32), (int)var26, (int)(var28 >>> 32));
               }
            }
         }
      }
   }

   private IIIllIIllIIllIIl() {
   }

   private static float IIlllIlliIll(float min, float v, float max) {
      return Math.max(v, Math.min(max, min));
   }

   private static int IlIlllIlilIl(int t, int b, float a) {
      return IiIlliIliiIl((int)((float)t + (float)(b - t) * a), 0, 255);
   }

   private static float lIiiIiIlilli(float f, float p) {
      float var2 = 0.12F;
      float var3 = f < var2 ? f / var2 : (f > 1.0F - var2 ? (1.0F - f) / var2 : 1.0F);
      var3 = IIlllIlliIll(var3, 0.0F, 1.0F);
      var3 = var3 * var3 * (3.0F - 2.0F * var3);
      return var3 + (1.0F - var3) * p;
   }

   private static void IilliliilIIi(Matrix4f hg, float hr, float m, float hb, float alpha, int y, int x, int radius) {
      long var16 = 8427868971815664013L;
      long var14 = -3094731853175724663L;
      if (!(alpha < 0.01F)) {
         var14 ^= (85899345920L ^ var14) & -1L << 32;
         var14 ^= ((long)IiIlliIliiIl((int)(alpha * 255.0F), 0, 255) ^ var14) & -1L >>> 32;
         class_4588 var10 = llIllIililIllIil.IlIlllIlilIl(class_5596.field_27380);

         for (long var20 = var16 ^ (0L ^ var16) & -1L << 32; (int)(var20 >>> 32) <= (int)(var14 >>> 32); var20 += 4294967296L) {
            double var12 = (Math.PI * 2) * (double)((int)(var20 >>> 32)) / (double)((int)(var14 >>> 32));
            var10.method_22918(hg, hr, m, 0.0F).method_1336(y, x, radius, (int)var14);
            var10.method_22918(hg, hr + (float)Math.cos(var12) * hb, m + (float)Math.sin(var12) * hb, 0.0F).method_1336(y, x, radius, 0);
         }

         llIllIililIllIil.IIillIiliIil();
      }
   }

   private static void IIIllIIliIIl(ArrayList<float[]> ccx, float r, float a1, float pts, float ccy, float a0) {
      long var12 = -6327624347918018600L;
      var12 ^= ((long)Math.max(1, Math.round((float)((double)Math.abs(a0 - ccy) * Math.PI / 180.0 * (double)pts) / 2.5F)) << 32 ^ var12) & -1L << 32;

      for (long var15 = var12 ^ (0L ^ var12) & -1L >>> 32; (int)var15 < (int)(var15 >>> 32); var15 ^= (var15 ^ var15 + (long)1) & -1L >>> 32) {
         double var8 = Math.toRadians((double)(ccy + (a0 - ccy) * (float)((int)var15) / (float)((int)(var15 >>> 32))));
         float var10 = (float)Math.cos(var8);
         float var11 = (float)Math.sin(var8);
         ccx.add(new float[]{r + var10 * pts, a1 + var11 * pts, var10, var11});
      }
   }

   private static void iIlIlllllill(Matrix4f k, ArrayList<float[]> hg, int pts, int m, float offset, float p, float peak, int hr, int n, int hb) {
      long var18 = -6716266108132210053L;
      long var20 = 1493932092054434375L;
      var18 ^= ((long)(2 * m) << 32 ^ var18) & -1L << 32;
      class_4588 var11 = llIllIililIllIil.IlIlllIlilIl(class_5596.field_27380);

      for (long var23 = var18 ^ ((long)(-m) ^ var18) & -1L >>> 32; (int)var23 <= m; var23 ^= (var23 ^ var23 + (long)1) & -1L >>> 32) {
         long var24 = var20 ^ ((long)(((int)var23 % pts + pts) % pts) << 32 ^ var20) & -1L << 32;
         float var14 = (float)((int)var23 + m) / (float)((int)(var23 >>> 32));
         float var15 = peak * lIiiIiIlilli(var14, offset);
         var20 = var24 ^ ((long)IiIlliIliiIl((int)(var15 * 255.0F), 0, 255) ^ var24) & -1L >>> 32;
         float[] var17 = (float[])hg.get((int)(var20 >>> 32));
         var11.method_22918(k, var17[0], var17[1], 0.0F).method_1336(hr, n, hb, (int)var20);
         var11.method_22918(k, var17[0] + var17[2] * p, var17[1] + var17[3] * p, 0.0F).method_1336(hr, n, hb, 0);
      }

      llIllIililIllIil.IIillIiliIil();
   }

   private static void iliIiiliiiii(ArrayList<float[]> pts, float ny, float y0, float y1, float x1, float x0, float nx) {
      long var12 = 906568774955947694L;
      float var7 = y1 - ny;
      float var8 = x1 - y0;
      var12 ^= ((long)Math.max(1, Math.round((float)Math.sqrt((double)(var7 * var7 + var8 * var8)) / 2.5F)) << 32 ^ var12) & -1L << 32;

      for (long var15 = var12 ^ (0L ^ var12) & -1L >>> 32; (int)var15 < (int)(var15 >>> 32); var15 ^= (var15 ^ var15 + (long)1) & -1L >>> 32) {
         float var11 = (float)((int)var15) / (float)((int)(var15 >>> 32));
         pts.add(new float[]{ny + var7 * var11, y0 + var8 * var11, x0, nx});
      }
   }

   private static int IiIlliIliiIl(int max, int v, int min) {
      return Math.max(v, Math.min(min, max));
   }

   private static void liiiIIllIl(Matrix4f hg, ArrayList<float[]> pts, int peak, int n, float k, float hr, float p, int m, int half, int hb) {
      if (!(p <= 0.003F)) {
         iIlIlllllill(hg, pts, peak, n, k, hr, p, m, half, hb);
         iIlIlllllill(hg, pts, peak, n, k, -hr, p, m, half, hb);
      }
   }
}
