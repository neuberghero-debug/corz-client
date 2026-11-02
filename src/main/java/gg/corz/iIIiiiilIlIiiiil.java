package gg.corz;

public final class iIIiiiilIlIiiiil {
   public float lllIIiIiil;
   public float iIlIIiIiil;
   public float IIlIIiIiil;
   public float IlIIIiIiil;
   public float lIlIIiIiil;
   public float IllIIiIiil;
   public float liIIIiIiil;
   public float ilIIIiIiil;
   public float IiIIIiIiil;
   public float iiIIIiIiil;
   public float llIIIiIiil;
   public float iIIIIiIiil = 1.0F;

   public iIIiiiilIlIiiiil liiiIIllIl(iIIiiiilIlIiiiil o) {
      this.iIIIIiIiil = o.iIIIIiIiil;
      this.IlIIIiIiil = o.IlIIIiIiil;
      this.llIIIiIiil = o.llIIIiIiil;
      this.ilIIIiIiil = o.ilIIIiIiil;
      this.IiIIIiIiil = o.IiIIIiIiil;
      this.liIIIiIiil = o.liIIIiIiil;
      this.iiIIIiIiil = o.iiIIIiIiil;
      this.IIlIIiIiil = o.IIlIIiIiil;
      this.lIlIIiIiil = o.lIlIIiIiil;
      this.iIlIIiIiil = o.iIlIIiIiil;
      this.IllIIiIiil = o.IllIIiIiil;
      this.lllIIiIiil = o.lllIIiIiil;
      return this;
   }

   public void IIillIiliIil(float[] out, int o) {
      out[o] = this.iIIIIiIiil;
      out[o + 1] = this.IlIIIiIiil;
      out[o + 2] = this.llIIIiIiil;
      out[o + 3] = this.ilIIIiIiil;
      out[o + 4] = this.IiIIIiIiil;
      out[o + 5] = this.liIIIiIiil;
      out[o + 6] = this.iiIIIiIiil;
      out[o + 7] = this.IIlIIiIiil;
      out[o + 8] = this.lIlIIiIiil;
      out[o + 9] = this.iIlIIiIiil;
      out[o + 10] = this.IllIIiIiil;
      out[o + 11] = this.lllIIiIiil;
   }

   public float Illlllllilll(float z, float x, float y) {
      return this.lIlIIiIiil * z + this.iIlIIiIiil * x + this.IllIIiIiil * y + this.lllIIiIiil;
   }

   public iIIiiiilIlIiiiil IliIlllilIi() {
      this.iIIIIiIiil = 1.0F;
      this.IlIIIiIiil = 0.0F;
      this.llIIIiIiil = 0.0F;
      this.ilIIIiIiil = 0.0F;
      this.IiIIIiIiil = 0.0F;
      this.liIIIiIiil = 1.0F;
      this.iiIIIiIiil = 0.0F;
      this.IIlIIiIiil = 0.0F;
      this.lIlIIiIiil = 0.0F;
      this.iIlIIiIiil = 0.0F;
      this.IllIIiIiil = 1.0F;
      this.lllIIiIiil = 0.0F;
      return this;
   }

   public iIIiiiilIlIiiiil() {
      this.liIIIiIiil = 1.0F;
      this.IllIIiIiil = 1.0F;
   }

   public iIIiiiilIlIiiiil IIIllIIliIIl(float a) {
      if (a == 0.0F) {
         return this;
      } else {
         float var2 = (float)Math.cos((double)a);
         float var3 = (float)Math.sin((double)a);
         float var4 = this.iIIIIiIiil * var2 - this.llIIIiIiil * var3;
         this.llIIIiIiil = this.iIIIIiIiil * var3 + this.llIIIiIiil * var2;
         this.iIIIIiIiil = var4;
         var4 = this.IiIIIiIiil * var2 - this.iiIIIiIiil * var3;
         this.iiIIIiIiil = this.IiIIIiIiil * var3 + this.iiIIIiIiil * var2;
         this.IiIIIiIiil = var4;
         var4 = this.lIlIIiIiil * var2 - this.IllIIiIiil * var3;
         this.IllIIiIiil = this.lIlIIiIiil * var3 + this.IllIIiIiil * var2;
         this.lIlIIiIiil = var4;
         return this;
      }
   }

   public void Iilllilliill(float[] o, int out) {
      float var3 = this.liIIIiIiil * this.IllIIiIiil - this.iiIIIiIiil * this.iIlIIiIiil;
      float var4 = this.iiIIIiIiil * this.lIlIIiIiil - this.IiIIIiIiil * this.IllIIiIiil;
      float var5 = this.IiIIIiIiil * this.iIlIIiIiil - this.liIIIiIiil * this.lIlIIiIiil;
      float var6 = this.llIIIiIiil * this.iIlIIiIiil - this.IlIIIiIiil * this.IllIIiIiil;
      float var7 = this.iIIIIiIiil * this.IllIIiIiil - this.llIIIiIiil * this.lIlIIiIiil;
      float var8 = this.IlIIIiIiil * this.lIlIIiIiil - this.iIIIIiIiil * this.iIlIIiIiil;
      float var9 = this.IlIIIiIiil * this.iiIIIiIiil - this.llIIIiIiil * this.liIIIiIiil;
      float var10 = this.llIIIiIiil * this.IiIIIiIiil - this.iIIIIiIiil * this.iiIIIiIiil;
      float var11 = this.iIIIIiIiil * this.liIIIiIiil - this.IlIIIiIiil * this.IiIIIiIiil;
      float var12 = this.iIIIIiIiil * var3 + this.IlIIIiIiil * var4 + this.llIIIiIiil * var5;
      float var13 = var12 < 0.0F ? -1.0F : 1.0F;
      o[out] = var3 * var13;
      o[out + 1] = var4 * var13;
      o[out + 2] = var5 * var13;
      o[out + 3] = var6 * var13;
      o[out + 4] = var7 * var13;
      o[out + 5] = var8 * var13;
      o[out + 6] = var9 * var13;
      o[out + 7] = var10 * var13;
      o[out + 8] = var11 * var13;
   }

   public iIIiiiilIlIiiiil iliIiiliiiii(float a) {
      if (a == 0.0F) {
         return this;
      } else {
         float var2 = (float)Math.cos((double)a);
         float var3 = (float)Math.sin((double)a);
         float var4 = this.IlIIIiIiil * var2 + this.llIIIiIiil * var3;
         this.llIIIiIiil = this.llIIIiIiil * var2 - this.IlIIIiIiil * var3;
         this.IlIIIiIiil = var4;
         var4 = this.liIIIiIiil * var2 + this.iiIIIiIiil * var3;
         this.iiIIIiIiil = this.iiIIIiIiil * var2 - this.liIIIiIiil * var3;
         this.liIIIiIiil = var4;
         var4 = this.iIlIIiIiil * var2 + this.IllIIiIiil * var3;
         this.IllIIiIiil = this.IllIIiIiil * var2 - this.iIlIIiIiil * var3;
         this.iIlIIiIiil = var4;
         return this;
      }
   }

   public float IIlllIlliIll(float z, float y, float x) {
      return this.IiIIIiIiil * z + this.liIIIiIiil * y + this.iiIIIiIiil * x + this.IIlIIiIiil;
   }

   public iIIiiiilIlIiiiil iIlIlllllill(iIIiiiilIlIiiiil b) {
      float var2 = this.iIIIIiIiil * b.iIIIIiIiil + this.IlIIIiIiil * b.IiIIIiIiil + this.llIIIiIiil * b.lIlIIiIiil;
      float var3 = this.iIIIIiIiil * b.IlIIIiIiil + this.IlIIIiIiil * b.liIIIiIiil + this.llIIIiIiil * b.iIlIIiIiil;
      float var4 = this.iIIIIiIiil * b.llIIIiIiil + this.IlIIIiIiil * b.iiIIIiIiil + this.llIIIiIiil * b.IllIIiIiil;
      float var5 = this.iIIIIiIiil * b.ilIIIiIiil + this.IlIIIiIiil * b.IIlIIiIiil + this.llIIIiIiil * b.lllIIiIiil + this.ilIIIiIiil;
      float var6 = this.IiIIIiIiil * b.iIIIIiIiil + this.liIIIiIiil * b.IiIIIiIiil + this.iiIIIiIiil * b.lIlIIiIiil;
      float var7 = this.IiIIIiIiil * b.IlIIIiIiil + this.liIIIiIiil * b.liIIIiIiil + this.iiIIIiIiil * b.iIlIIiIiil;
      float var8 = this.IiIIIiIiil * b.llIIIiIiil + this.liIIIiIiil * b.iiIIIiIiil + this.iiIIIiIiil * b.IllIIiIiil;
      float var9 = this.IiIIIiIiil * b.ilIIIiIiil + this.liIIIiIiil * b.IIlIIiIiil + this.iiIIIiIiil * b.lllIIiIiil + this.IIlIIiIiil;
      float var10 = this.lIlIIiIiil * b.iIIIIiIiil + this.iIlIIiIiil * b.IiIIIiIiil + this.IllIIiIiil * b.lIlIIiIiil;
      float var11 = this.lIlIIiIiil * b.IlIIIiIiil + this.iIlIIiIiil * b.liIIIiIiil + this.IllIIiIiil * b.iIlIIiIiil;
      float var12 = this.lIlIIiIiil * b.llIIIiIiil + this.iIlIIiIiil * b.iiIIIiIiil + this.IllIIiIiil * b.IllIIiIiil;
      float var13 = this.lIlIIiIiil * b.ilIIIiIiil + this.iIlIIiIiil * b.IIlIIiIiil + this.IllIIiIiil * b.lllIIiIiil + this.lllIIiIiil;
      this.iIIIIiIiil = var2;
      this.IlIIIiIiil = var3;
      this.llIIIiIiil = var4;
      this.ilIIIiIiil = var5;
      this.IiIIIiIiil = var6;
      this.liIIIiIiil = var7;
      this.iiIIIiIiil = var8;
      this.IIlIIiIiil = var9;
      this.lIlIIiIiil = var10;
      this.iIlIIiIiil = var11;
      this.IllIIiIiil = var12;
      this.lllIIiIiil = var13;
      return this;
   }

   public float IiIlliIliiIl(float y, float x, float z) {
      return this.iIIIIiIiil * y + this.IlIIIiIiil * x + this.llIIIiIiil * z + this.ilIIIiIiil;
   }

   public iIIiiiilIlIiiiil lIiiIiIlilli(float x, float z, float y) {
      this.iIIIIiIiil *= x;
      this.IiIIIiIiil *= x;
      this.lIlIIiIiil *= x;
      this.IlIIIiIiil *= z;
      this.liIIIiIiil *= z;
      this.iIlIIiIiil *= z;
      this.llIIIiIiil *= y;
      this.iiIIIiIiil *= y;
      this.IllIIiIiil *= y;
      return this;
   }

   public iIIiiiilIlIiiiil IlIlllIlilIl(float a) {
      if (a == 0.0F) {
         return this;
      } else {
         float var2 = (float)Math.cos((double)a);
         float var3 = (float)Math.sin((double)a);
         float var4 = this.iIIIIiIiil * var2 + this.IlIIIiIiil * var3;
         this.IlIIIiIiil = this.IlIIIiIiil * var2 - this.iIIIIiIiil * var3;
         this.iIIIIiIiil = var4;
         var4 = this.IiIIIiIiil * var2 + this.liIIIiIiil * var3;
         this.liIIIiIiil = this.liIIIiIiil * var2 - this.IiIIIiIiil * var3;
         this.IiIIIiIiil = var4;
         var4 = this.lIlIIiIiil * var2 + this.iIlIIiIiil * var3;
         this.iIlIIiIiil = this.iIlIIiIiil * var2 - this.lIlIIiIiil * var3;
         this.lIlIIiIiil = var4;
         return this;
      }
   }

   public iIIiiiilIlIiiiil IilliliilIIi(float x, float y, float z) {
      this.ilIIIiIiil = this.ilIIIiIiil + this.iIIIIiIiil * x + this.IlIIIiIiil * y + this.llIIIiIiil * z;
      this.IIlIIiIiil = this.IIlIIiIiil + this.IiIIIiIiil * x + this.liIIIiIiil * y + this.iiIIIiIiil * z;
      this.lllIIiIiil = this.lllIIiIiil + this.lIlIIiIiil * x + this.iIlIIiIiil * y + this.IllIIiIiil * z;
      return this;
   }
}
