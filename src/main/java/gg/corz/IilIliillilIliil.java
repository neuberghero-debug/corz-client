package gg.corz;

import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import net.minecraft.class_4588;
import org.joml.Matrix4f;

final class IilIliillilIliil {
   private static float IilIiIilil;
   private static class_4588 illIiIilil;
   private static final int lIlIiIilil = 20;
   private static Matrix4f lllIiIilil;
   private static final float[] IllIiIilil = new float[21];
   private static final float[] iIlIiIilil = new float[21];

   static {
      long var3 = -3578923912210313854L;

      for (long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) <= 20; var5 += 4294967296L) {
         double var1 = (Math.PI * 2) * (double)((int)(var5 >>> 32)) / 20.0;
         iIlIiIilil[(int)(var5 >>> 32)] = (float)Math.cos(var1);
         IllIiIilil[(int)(var5 >>> 32)] = (float)Math.sin(var1);
      }

      IilIiIilil = 0.6F;
   }

   static void IliIlllilIi() {
      IliiIilliiIi.lilIliilIl();
      lllIiIilil = IIIiiIillIIiiIil.liiiIIllIl().method_23760().method_23761();
      IilIiIilil = Math.max(0.35F, IliiIilliiIi.Illlllllilll() * 1.2F);
      illIiIilil = llIllIililIllIil.IlIlllIlilIl(class_5596.field_27379);
   }

   static void IilliliilIIi(float cx, float cy, float soft, float col, int r) {
      long var17 = 5933840900318740431L;
      long var19 = -1133811341619265678L;
      var17 ^= ((long)(r & 16777215) << 32 ^ var17) & -1L << 32;
      float var6 = soft + Math.max(col, IilIiIilil);

      for (long var22 = var17 ^ (0L ^ var17) & -1L >>> 32; (int)var22 < 20; var22 ^= (var22 ^ var22 + (long)1) & -1L >>> 32) {
         var19 ^= ((long)((int)var22 + 1) << 32 ^ var19) & -1L << 32;
         float var9 = cx + iIlIiIilil[(int)var22] * soft;
         float var10 = cy + IllIiIilil[(int)var22] * soft;
         float var11 = cx + iIlIiIilil[(int)(var19 >>> 32)] * soft;
         float var12 = cy + IllIiIilil[(int)(var19 >>> 32)] * soft;
         IlIlllIlilIl(cx, cy, r, var9, var10, r, var11, var12, r);
         float var13 = cx + iIlIiIilil[(int)var22] * var6;
         float var14 = cy + IllIiIilil[(int)var22] * var6;
         float var15 = cx + iIlIiIilil[(int)(var19 >>> 32)] * var6;
         float var16 = cy + IllIiIilil[(int)(var19 >>> 32)] * var6;
         IlIlllIlilIl(var9, var10, r, var13, var14, (int)(var22 >>> 32), var15, var16, (int)(var22 >>> 32));
         IlIlllIlilIl(var9, var10, r, var15, var16, (int)(var22 >>> 32), var11, var12, r);
      }
   }

   static int IIlllIlliIll(int a, float rgb) {
      return IliiIilliiIi.IlIlllIlilIl(IiIlliIliiIl(a, rgb));
   }

   static void IlIlllIlilIl(float ay, float bx, int cc, float cy, float cx, int ax, float by, float ac, int bc) {
      illIiIilil.method_22918(lllIiIilil, ay, bx, 0.0F).method_39415(cc);
      illIiIilil.method_22918(lllIiIilil, cy, cx, 0.0F).method_39415(ax);
      illIiIilil.method_22918(lllIiIilil, by, ac, 0.0F).method_39415(bc);
   }

   static void iIlIlllllill(float ry, float rx, float mid, float center, int cx, int cy) {
      long var16 = -2671391128702516560L;
      var16 ^= ((long)(cx & 16777215) << 32 ^ var16) & -1L << 32;

      for (long var19 = var16 ^ (0L ^ var16) & -1L >>> 32; (int)var19 < 20; var19 ^= (var19 ^ var19 + (long)1) & -1L >>> 32) {
         float var8 = ry + iIlIiIilil[(int)var19] * mid * 0.32F;
         float var9 = rx + IllIiIilil[(int)var19] * center * 0.32F;
         float var10 = ry + iIlIiIilil[(int)var19 + 1] * mid * 0.32F;
         float var11 = rx + IllIiIilil[(int)var19 + 1] * center * 0.32F;
         IlIlllIlilIl(ry, rx, cx, var8, var9, cy, var10, var11, cy);
         float var12 = ry + iIlIiIilil[(int)var19] * mid;
         float var13 = rx + IllIiIilil[(int)var19] * center;
         float var14 = ry + iIlIiIilil[(int)var19 + 1] * mid;
         float var15 = rx + IllIiIilil[(int)var19 + 1] * center;
         IlIlllIlilIl(var8, var9, cy, var12, var13, (int)(var19 >>> 32), var14, var15, (int)(var19 >>> 32));
         IlIlllIlilIl(var8, var9, cy, var14, var15, (int)(var19 >>> 32), var10, var11, cy);
      }
   }

   private IilIliillilIliil() {
   }

   private static void IIIllIIliIIl(float x1, float x2, float y2, float b1, float nx, float ny, float a2, float o1, int y1, int b2, int o2, int a1) {
      float var12 = x1 + nx * a2;
      float var13 = x2 + ny * a2;
      float var14 = y2 + nx * a2;
      float var15 = b1 + ny * a2;
      float var16 = y2 + nx * o1;
      float var17 = b1 + ny * o1;
      float var18 = x1 + nx * o1;
      float var19 = x2 + ny * o1;
      IlIlllIlilIl(var12, var13, y1, var14, var15, b2, var16, var17, a1);
      IlIlllIlilIl(var12, var13, y1, var16, var17, a1, var18, var19, o2);
   }

   static void lIiiIiIlilli(float x0, float bottom, float y1, float y0, int x1, int top) {
      IlIlllIlilIl(x0, bottom, x1, y1, bottom, x1, y1, y0, top);
      IlIlllIlilIl(x0, bottom, x1, y1, y0, top, x0, y0, top);
   }

   static int IiIlliIliiIl(int rgb, float a) {
      long var3 = -7336154724255022785L;
      var3 ^= ((long)Math.round(255.0F * Math.max(0.0F, Math.min(1.0F, a))) << 32 ^ var3) & -1L << 32;
      return (int)(var3 >>> 32) << 24 | rgb & 16777215;
   }

   static void iliIiiliiiii(float x1, float c1, float y2, float x2, float c2, int half, int y1) {
      long var14 = -8680380571889652659L;
      float var7 = y2 - x1;
      float var8 = x2 - c1;
      float var9 = (float)Math.sqrt((double)(var7 * var7 + var8 * var8));
      if (!(var9 < 0.001F)) {
         float var10 = -var8 / var9;
         float var11 = var7 / var9;
         var14 ^= ((long)(half & 16777215) << 32 ^ var14) & -1L << 32;
         var14 ^= ((long)(y1 & 16777215) ^ var14) & -1L >>> 32;
         IIIllIIliIIl(x1, c1, y2, x2, var10, var11, -c2 - IilIiIilil, -c2, (int)(var14 >>> 32), (int)var14, half, y1);
         IIIllIIliIIl(x1, c1, y2, x2, var10, var11, -c2, c2, half, y1, half, y1);
         IIIllIIliIIl(x1, c1, y2, x2, var10, var11, c2, c2 + IilIiIilil, half, y1, (int)(var14 >>> 32), (int)var14);
      }
   }

   static void liiiIIllIl() {
      llIllIililIllIil.IIillIiliIil();
      illIiIilil = null;
   }
}
