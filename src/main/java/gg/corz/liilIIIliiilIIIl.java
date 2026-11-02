package gg.corz;

final class liilIIIliiilIIIl {
   final float[] IlIiIIllIl;
   final float[] lIIiIIllIl;
   final float[] iIIiIIllIl;

   liilIIIliiilIIIl(float... tv) {
      if (tv.length >= 4 && (tv.length & 1) == 0) {
         int var2 = tv.length / 2;
         this.lIIiIIllIl = new float[var2];
         this.iIIiIIllIl = new float[var2];
         this.IlIiIIllIl = new float[var2];

         for (int var3 = 0; var3 < var2; var3++) {
            this.lIIiIIllIl[var3] = tv[2 * var3];
            this.iIIiIIllIl[var3] = tv[2 * var3 + 1];
            if (var3 > 0 && this.lIIiIIllIl[var3] <= this.lIIiIIllIl[var3 - 1]) {
               throw new IllegalArgumentException(IilliliilIIi<"IilliliilIIi","Ib0zZJAdOC3NzpTsPbH/I2x5QIS2JGCRrVTU+udTRYSUK8FHSX6naokyttCL3TF2eJbl">());
            }
         }

         float[] var9 = new float[var2 - 1];

         for (int var4 = 0; var4 < var2 - 1; var4++) {
            var9[var4] = (this.iIIiIIllIl[var4 + 1] - this.iIIiIIllIl[var4]) / (this.lIIiIIllIl[var4 + 1] - this.lIIiIIllIl[var4]);
         }

         for (int var10 = 1; var10 < var2 - 1; var10++) {
            this.IlIiIIllIl[var10] = var9[var10 - 1] * var9[var10] <= 0.0F ? 0.0F : (var9[var10 - 1] + var9[var10]) * 0.5F;
         }

         for (int var11 = 0; var11 < var2 - 1; var11++) {
            if (var9[var11] == 0.0F) {
               this.IlIiIIllIl[var11] = 0.0F;
               this.IlIiIIllIl[var11 + 1] = 0.0F;
            } else {
               float var5 = this.IlIiIIllIl[var11] / var9[var11];
               float var6 = this.IlIiIIllIl[var11 + 1] / var9[var11];
               float var7 = var5 * var5 + var6 * var6;
               if (var7 > 9.0F) {
                  float var8 = 3.0F / (float)Math.sqrt((double)var7);
                  this.IlIiIIllIl[var11] = var8 * var5 * var9[var11];
                  this.IlIiIIllIl[var11 + 1] = var8 * var6 * var9[var11];
               }
            }
         }
      } else {
         throw new IllegalArgumentException(IilliliilIIi<"IilliliilIIi","7KUY3R65WHtWLLpKBAq1ojRPQa566QvQS83QWucQc939kBY1r9haMrC5MtQ=">());
      }
   }

   float IliIlllilIi(float x) {
      int var2 = this.lIIiIIllIl.length;
      if (x <= this.lIIiIIllIl[0]) {
         return this.iIIiIIllIl[0];
      } else if (x >= this.lIIiIIllIl[var2 - 1]) {
         return this.iIIiIIllIl[var2 - 1];
      } else {
         int var3 = 0;

         while (x > this.lIIiIIllIl[var3 + 1]) {
            var3++;
         }

         float var4 = this.lIIiIIllIl[var3 + 1] - this.lIIiIIllIl[var3];
         float var5 = (x - this.lIIiIIllIl[var3]) / var4;
         float var6 = var5 * var5;
         float var7 = var6 * var5;
         return (2.0F * var7 - 3.0F * var6 + 1.0F) * this.iIIiIIllIl[var3]
            + (var7 - 2.0F * var6 + var5) * var4 * this.IlIiIIllIl[var3]
            + (-2.0F * var7 + 3.0F * var6) * this.iIIiIIllIl[var3 + 1]
            + (var7 - var6) * var4 * this.IlIiIIllIl[var3 + 1];
      }
   }

   float liiiIIllIl() {
      return this.iIIiIIllIl[0];
   }

   float iIlIlllllill() {
      return this.iIIiIIllIl[this.iIIiIIllIl.length - 1];
   }
}
