package gg.corz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.joml.Matrix4f;
import org.joml.Vector3f;

final class IIIiIlIilIIiIlIi {
   final String lIIllIIIIi;
   final float[] IIlllIIIIi;
   final liIlIiliiIlIil iiiIlIIIIi;
   final Vector3f IiIllIIIIi = new Vector3f();
   final float[] iiIllIIIIi;
   final boolean[] llIllIIIIi;
   float iIlllIIIIi;
   final List<String> ilIllIIIIi;
   final Matrix4f liIllIIIIi = new Matrix4f();
   final int IlIllIIIIi;
   final Matrix4f[] lIlllIIIIi;
   final lIIiilIliIIiilIl IIIllIIIIi;
   final int iIIllIIIIi;

   IIIiIlIilIIiIlIi(liIlIiliiIlIil asset) {
      this.iIlllIIIIi = 1.0F;
      this.iiiIlIIIIi = asset;
      this.IIIllIIIIi = asset.liiiIIllIl();
      this.lIIllIIIIi = iIIIIilIlIIIil.IliIlllilIi(asset.IliIlllilIi(), asset.liiiIIllIl());
      int[] var2 = llIiilIiilIiilIi.IliIlllilIi(this.IIIllIIIIi, asset.IliIlllilIi());
      this.IlIllIIIIi = var2[0];
      this.iIIllIIIIi = var2[1];
      this.llIllIIIIi = new boolean[this.IIIllIIIIi.liiililIll.length];

      for (int var3 = 0; var3 < this.llIllIIIIi.length; var3++) {
         this.llIllIIIIi[var3] = this.IIIllIIIIi.liiililIll[var3].lIiiIiIlilli().length > 0 && this.IIIllIIIIi.IIlllIlliIll(var3, this.iIIllIIIIi);
      }

      this.ilIllIIIIi = iIIIIilIlIIIil.iIlIlllllill(asset.IliIlllilIi(), this.IIIllIIIIi);
      this.iiIllIIIIi = this.IIIllIIIIi.Illlllllilll();
      this.IIlllIIIIi = this.IIIllIIIIi.Illlllllilll();
      this.lIlllIIIIi = this.IIIllIIIIi.Iilllilliill();
      this.IliIlllilIi();
   }

   void IilliliilIIi(lliIiiililiIiiil time, float clip) {
      this.iIlIlllllill(this.iiIllIIIIi);
      if (time != null) {
         time.IliIlllilIi(Math.max(0.0F, Math.min(time.iIlIlllllill(), clip)), this.iiIllIIIIi);
      }

      this.IIIllIIIIi.IIillIiliIil(this.iiIllIIIIi, this.lIlllIIIIi);
   }

   private void iIlIlllllill(float[] out) {
      Arrays.fill(out, 0.0F);

      for (int var2 = 0; var2 < this.IIIllIIIIi.liiililIll.length; var2++) {
         Arrays.fill(out, var2 * 9 + 6, var2 * 9 + 9, 1.0F);
      }

      lliIiiililiIiiil var3 = this.IIIllIIIIi.iiiililIll.get(this.lIIllIIIIi);
      if (var3 != null) {
         var3.IliIlllilIi(0.0F, out);
      }
   }

   private void IliIlllilIi() {
      this.IilliliilIIi(null, 0.0F);
      this.liIllIIIIi.set(this.liiiIIllIl()).invert();
      int var1 = this.IIIllIIIIi.liiililIll.length;
      float[][] var2 = new float[var1][];
      Vector3f var3 = new Vector3f(Float.MAX_VALUE);
      Vector3f var4 = new Vector3f(-Float.MAX_VALUE);
      Vector3f var5 = new Vector3f();
      Matrix4f var6 = new Matrix4f(this.lIlllIIIIi[this.iIIllIIIIi]).invert();
      Matrix4f var7 = new Matrix4f();

      for (int var8 = 0; var8 < var1; var8++) {
         if (this.llIllIIIIi[var8]) {
            float[] var9 = this.IIIllIIIIi.liiililIll[var8].lIiiIiIlilli();
            float var10 = Float.MAX_VALUE;
            float var11 = Float.MAX_VALUE;
            float var12 = Float.MAX_VALUE;
            float var13 = -Float.MAX_VALUE;
            float var14 = -Float.MAX_VALUE;
            float var15 = -Float.MAX_VALUE;
            boolean var16 = Math.abs(this.lIlllIIIIi[var8].determinant3x3()) >= 1.0E-10F;
            var7.set(var6).mul(this.lIlllIIIIi[var8]);

            for (byte var17 = 0; var17 < var9.length; var17 += 8) {
               var10 = Math.min(var10, var9[var17]);
               var13 = Math.max(var13, var9[var17]);
               var11 = Math.min(var11, var9[var17 + 1]);
               var14 = Math.max(var14, var9[var17 + 1]);
               var12 = Math.min(var12, var9[var17 + 2]);
               var15 = Math.max(var15, var9[var17 + 2]);
               if (var16) {
                  var7.transformPosition(var9[var17], var9[var17 + 1], var9[var17 + 2], var5);
                  var3.min(var5);
                  var4.max(var5);
               }
            }

            float var34 = (var10 + var13) / 2.0F;
            float var18 = (var11 + var14) / 2.0F;
            float var19 = (var12 + var15) / 2.0F;
            float var20 = 0.0F;

            for (byte var21 = 0; var21 < var9.length; var21 += 8) {
               float var22 = var9[var21] - var34;
               float var23 = var9[var21 + 1] - var18;
               float var24 = var9[var21 + 2] - var19;
               var20 = Math.max(var20, (float)Math.sqrt((double)(var22 * var22 + var23 * var23 + var24 * var24)));
            }

            var2[var8] = new float[]{var34, var18, var19, var20};
         }
      }

      if (var3.x > var4.x) {
         var3.zero();
         var4.zero();
      }

      this.IiIllIIIIi.set(var3).add(var4).mul(0.5F);
      float var25 = 0.0F;
      ArrayList var26 = new ArrayList();
      var26.add(null);

      for (String var29 : this.ilIllIIIIi) {
         var26.add(this.IIIllIIIIi.iiiililIll.get(var29));
      }

      for (lliIiiililiIiiil var30 : var26) {
         float var31 = var30 == null ? 0.0F : var30.iIlIlllllill();

         for (float var32 = 0.0F; var32 <= var31 + 1.0E-4F; var32 += 0.033333335F) {
            this.IilliliilIIi(var30, var32);
            var6.set(this.lIlllIIIIi[this.iIIllIIIIi]).invert();

            for (int var33 = 0; var33 < var1; var33++) {
               if (var2[var33] != null && !(Math.abs(this.lIlllIIIIi[var33].determinant3x3()) < 1.0E-10F)) {
                  var7.set(var6).mul(this.lIlllIIIIi[var33]).transformPosition(var2[var33][0], var2[var33][1], var2[var33][2], var5);
                  var25 = Math.max(var25, var5.distance(this.IiIllIIIIi) + var2[var33][3]);
               }
            }
         }
      }

      this.iIlllIIIIi = Math.max(0.001F, var25);
   }

   void lIiiIiIlilli(lliIiiililiIiiil clip, float time) {
      if (clip == null) {
         this.IilliliilIIi(null, 0.0F);
      } else {
         float var3 = llIiilIiilIiilIi.IlIillIiilIi(time, clip.iIlIlllllill());
         this.iIlIlllllill(this.iiIllIIIIi);
         if (var3 > 0.0F) {
            this.iIlIlllllill(this.IIlllIIIIi);
            clip.IliIlllilIi(Math.max(0.0F, Math.min(clip.iIlIlllllill(), time)), this.IIlllIIIIi);

            for (int var4 = 0; var4 < this.iiIllIIIIi.length; var4++) {
               float var5 = this.IIlllIIIIi[var4] - this.iiIllIIIIi[var4];
               int var6 = var4 % 9;
               if (var6 >= 3 && var6 < 6) {
                  var5 -= (float)Math.floor((double)((var5 + 180.0F) / 360.0F)) * 360.0F;
               }

               this.iiIllIIIIi[var4] = this.iiIllIIIIi[var4] + var5 * var3;
            }
         }

         this.IIIllIIIIi.IIillIiliIil(this.iiIllIIIIi, this.lIlllIIIIi);
      }
   }

   private Matrix4f liiiIIllIl() {
      return this.IlIllIIIIi >= 0 && this.IlIllIIIIi != this.iIIllIIIIi
         ? llIiilIiilIiilIi.illlillIIi.set(this.lIlllIIIIi[this.IlIllIIIIi]).invert().mul(this.lIlllIIIIi[this.iIIllIIIIi])
         : llIiilIiilIiilIi.illlillIIi.set(this.lIlllIIIIi[this.iIIllIIIIi]);
   }
}
