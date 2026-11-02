package gg.corz;

import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Vector4f;

final class lIIilIliIIilIl {
   static final float[] iIIlIiIllIlIlIiIll = new float[]{6.6F, 2.9F, 12.4F};
   float illlIiIllIillIiIll;
   private float iIilIiIllIlilIiIll;
   final Matrix4f llIlIiIllilIlIiIll = new Matrix4f();
   static final float liiIIiIlliiiIIiIll = 0.1F;
   float IIilIiIlllIilIiIll;
   private final Vector4f IlllIiIllllllIiIll;
   final Matrix4f IiIlIiIllliIlIiIll = new Matrix4f();
   private float llilIiIllililIiIll;
   static final float IIIlIiIlllIIlIiIll = 80.0F;
   float lillIiIlliillIiIll;
   private static final float iliIIiIllIiiIIiIll = (float) (Math.PI / 180.0);
   final Matrix3f iiIlIiIllIIllIiIll = new Matrix3f();
   private final Matrix4f lIllIiIlliIllIiIll = new Matrix4f();

   void liiiIIllIl(float parallaxY, float parallaxX, float screenW, float screenH, boolean corner) {
      this.iIilIiIllIlilIiIll = Math.max(1.0F, parallaxY);
      this.llilIiIllililIiIll = Math.max(1.0F, parallaxX);
      float var6 = this.iIilIiIllIlilIiIll / this.llilIiIllililIiIll;
      String var7 = corner
         ? iliIiiliiiii<"iliIiiliiiii","uREL3wrycINb/iZS4BE4g+x3lWze2F64tq5Le+Ywg0y3nEk=">()
         : iliIiiliiiii<"iliIiiliiiii","m2Thn3Mtp7irxTFT3s28MgfhyXK1QLuhXwFoPWr8f6U=">();
      String var8 = corner
         ? iliIiiliiiii<"iliIiiliiiii","6Fh7jEbp/7HwgEp19YTba+Z9RCrFTDdId48aPiAVppLoKDKJ">()
         : iliIiiliiiii<"iliIiiliiiii","yeJ/i0gSvJZI5cE7v5OxCA0A5wmlUGAEhVDubyxSokji">();
      float var9 = IIiliiIilIiliiIi.IliIlllilIi(var7 + iliIiiliiiii<"iliIiiliiiii","vwKGUbfjULlkASgyT5+DAF9kJnKVGTBievv/d0p3oA==">(), 62.0F);
      this.illlIiIllIillIiIll = IIiliiIilIiliiIi.IliIlllilIi(
            var7 + iliIiiliiiii<"iliIiiliiiii","NAm0k3NavnTmED6/bCIZyWsJuaCa3w88XJ6XYqY=">(), corner ? iIIlIiIllIlIlIiIll[0] : 0.0F
         )
         + screenW * IIiliiIilIiliiIi.IliIlllilIi(iliIiiliiiii<"iliIiiliiiii","v+CGGyFQq4fUKaPUcyIx83TAnYI2cLNtLYOd6u3DY42HXG8Q">(), 0.35F);
      this.lillIiIlliillIiIll = IIiliiIilIiliiIi.IliIlllilIi(
            var7 + iliIiiliiiii<"iliIiiliiiii","Wcahgu9cIj9ABkReQ1McyfOeh72hYFxVYedbIm8=">(), corner ? iIIlIiIllIlIlIiIll[1] : 2.9F
         )
         + screenH * IIiliiIilIiliiIi.IliIlllilIi(iliIiiliiiii<"iliIiiliiiii","FqL9321rqjft9Ks7Cg2FC9MT8eyBa/3e5UCmjlwNQ1dbNS4w">(), 0.18F);
      this.IIilIiIlllIilIiIll = IIiliiIilIiliiIi.IliIlllilIi(
         var7 + iliIiiliiiii<"iliIiiliiiii","Be511ThBIjpdv+WgcbEfoC+erN52csKArr5L/qI=">(), corner ? iIIlIiIllIlIlIiIll[2] : 12.4F
      );
      float var10 = IIiliiIilIiliiIi.IliIlllilIi(var8 + iliIiiliiiii<"iliIiiliiiii","NAm0k3NavnTmED6/bCIZyWsJuaCa3w88XJ6XYqY=">(), corner ? 5.4F : 0.0F)
         + screenW * 0.08F;
      float var11 = IIiliiIilIiliiIi.IliIlllilIi(var8 + iliIiiliiiii<"iliIiiliiiii","Wcahgu9cIj9ABkReQ1McyfOeh72hYFxVYedbIm8=">(), corner ? 1.0F : 2.5F);
      float var12 = IIiliiIilIiliiIi.IliIlllilIi(var8 + iliIiiliiiii<"iliIiiliiiii","Be511ThBIjpdv+WgcbEfoC+erN52csKArr5L/qI=">(), corner ? 3.8F : 0.0F);
      this.llIlIiIllilIlIiIll.setPerspective(var9 * (float) (Math.PI / 180.0), var6, 0.1F, 80.0F);
      if (corner) {
         this.llIlIiIllilIlIiIll
            .translateLocal(
               IIiliiIilIiliiIi.IliIlllilIi(iliIiiliiiii<"iliIiiliiiii","WsJRtLmNIyV5Qgbb03qo4YRAGXaYjuAnuDUjTpQJdpl/u1vP/w==">(), 0.677F),
               IIiliiIilIiliiIi.IliIlllilIi(iliIiiliiiii<"iliIiiliiiii","7EX70basWS0eHeI3X3aBTVoRuMmJX745yZBvmGgt9PJCqZBTvg==">(), -0.333F),
               0.0F
            );
      }

      this.IiIlIiIllliIlIiIll.setLookAt(this.illlIiIllIillIiIll, this.lillIiIlliillIiIll, this.IIilIiIlllIilIiIll, var10, var11, var12, 0.0F, 1.0F, 0.0F);
      this.IiIlIiIllliIlIiIll.get3x3(this.iiIlIiIllIIllIiIll);
      this.llIlIiIllilIlIiIll.mul(this.IiIlIiIllliIlIiIll, this.lIllIiIlliIllIiIll);
   }

   lIIilIliIIilIl() {
      this.IlllIiIllllllIiIll = new Vector4f();
      this.iIilIiIllIlilIiIll = 1.0F;
      this.llilIiIllililIiIll = 1.0F;
   }

   float IilliliilIIi(float depth) {
      return !(depth > 0.1F) ? 0.0F : this.llilIiIllililIiIll * this.llIlIiIllilIlIiIll.m11() / (2.0F * depth);
   }

   boolean iIlIlllllill(float out, float z, float y, float[] x) {
      this.IlllIiIllllllIiIll.set(out, z, y, 1.0F);
      this.lIllIiIlliIllIiIll.transform(this.IlllIiIllllllIiIll);
      if (this.IlllIiIllllllIiIll.w <= 0.1F) {
         return false;
      } else {
         float var5 = this.IlllIiIllllllIiIll.x / this.IlllIiIllllllIiIll.w;
         float var6 = this.IlllIiIllllllIiIll.y / this.IlllIiIllllllIiIll.w;
         x[0] = (var5 * 0.5F + 0.5F) * this.iIilIiIllIlilIiIll;
         x[1] = (0.5F - var6 * 0.5F) * this.llilIiIllililIiIll;
         x[2] = this.IlllIiIllllllIiIll.w;
         return true;
      }
   }

   void IliIlllilIi(float screenW, float parallaxY, float parallaxX, float screenH) {
      this.liiiIIllIl(screenW, parallaxY, parallaxX, screenH, false);
   }

   float lIiiIiIlilli(float z, float x, float y) {
      float var4 = z - this.illlIiIllIillIiIll;
      float var5 = x - this.lillIiIlliillIiIll;
      float var6 = y - this.IIilIiIlllIilIiIll;
      return (float)Math.sqrt((double)(var4 * var4 + var5 * var5 + var6 * var6));
   }
}
