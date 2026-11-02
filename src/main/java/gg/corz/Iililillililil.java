package gg.corz;

public final class Iililillililil {
   public final float[] IiililIliliililIli = new float[1856];
   private final float[] liIiilIliiiIiilIli;
   public static final float iIililIliIlililIli = 64.0F;
   private final float[] lIIiilIliiIIiilIli = new float[15];
   private final float[] ilIiilIliIiIiilIli;
   private final float[] iliiilIliIiiiilIli;
   private final float[] IiIIIiIliliIIIiIli;
   public static final float llililIliilililIli = 32.0F;
   private final float[] lIiiilIliiIiiilIli;
   private final float[] iIIIIiIliIlIIIiIli;
   private final float[] IiliilIlililiilIli;
   private final float[] IIIIIiIlilIIIIiIli;
   private final float[] iIliilIliIlliilIli;
   private final float[] IliiilIlilliiilIli;
   public static final int IIililIlilIililIli = 8;
   private final float[] llliilIliilliilIli;
   public static final int lillilIliiillilIli = 58;
   public static final int illlilIliIillilIli = 15;
   private final float[] llIIIiIliilIIIiIli;
   private final float[] IlIiilIlillIiilIli = new float[15];
   private int iiililIliIIIiilIli;
   private final float[] iiliilIliIIiiilIli;
   private final float[] iiIIIiIliIIlIIiIli;
   private final float[] liiiilIliiiiiilIli;
   private final float[] IIliilIlilIliilIli;

   private void lIiiIiIlilli(int u, int j, int outer, float nZ, float side, float v, float nX, float nY) {
      long var12 = 133398098278940437L;
      float var9 = (float)j * 5.0F;
      float var10 = (float)outer * 1.0F;
      var12 ^= ((long)(this.iiililIliIIIiilIli * 8) << 32 ^ var12) & -1L << 32;
      this.IiililIliliililIli[(int)(var12 >>> 32)] = this.lIIiilIliiIIiilIli[u] + this.liIiilIliiiIiilIli[u] * var9 + this.llliilIliilliilIli[u] * var10;
      this.IiililIliliililIli[(int)(var12 >>> 32) + 1] = this.IlIiilIlillIiilIli[u] + this.IIliilIlilIliilIli[u] * var9 + this.IiliilIlililiilIli[u] * var10;
      this.IiililIliliililIli[(int)(var12 >>> 32) + 2] = this.ilIiilIliIiIiilIli[u] + this.iIliilIliIlliilIli[u] * var9 + this.iiliilIliIIiiilIli[u] * var10;
      this.IiililIliliililIli[(int)(var12 >>> 32) + 3] = nZ;
      this.IiililIliliililIli[(int)(var12 >>> 32) + 4] = side;
      this.IiililIliliililIli[(int)(var12 >>> 32) + 5] = v;
      this.IiililIliliililIli[(int)(var12 >>> 32) + 6] = nX;
      this.IiililIliliililIli[(int)(var12 >>> 32) + 7] = nY;
      this.iiililIliIIIiilIli++;
   }

   public float iIlIlllllill(int j) {
      return this.ilIiilIliIiIiilIli[j];
   }

   public int IliIlllilIi() {
      return this.iiililIliIIIiilIli;
   }

   public void IilliliilIIi(float[] roll, float[] pitch) {
      long var17 = 4421917021710778647L;

      for (var17 ^= (0L ^ var17) & -1L << 32; (int)(var17 >>> 32) < 14; var17 += 4294967296L) {
         float var4 = (float)Math.cos((double)roll[(int)(var17 >>> 32)]);
         float var5 = (float)Math.sin((double)roll[(int)(var17 >>> 32)]);
         float var6 = (float)Math.cos((double)pitch[(int)(var17 >>> 32)]);
         float var7 = (float)Math.sin((double)pitch[(int)(var17 >>> 32)]);
         this.liiiilIliiiiiilIli[(int)(var17 >>> 32)] = -var7;
         this.IIIIIiIlilIIIIiIli[(int)(var17 >>> 32)] = var6 * var4;
         this.iIIIIiIliIlIIIiIli[(int)(var17 >>> 32)] = var6 * var5;
         this.llIIIiIliilIIIiIli[(int)(var17 >>> 32)] = var6;
         this.IiIIIiIliliIIIiIli[(int)(var17 >>> 32)] = var7 * var4;
         this.iiIIIiIliIIlIIiIli[(int)(var17 >>> 32)] = var7 * var5;
      }

      this.lIIiilIliiIIiilIli[0] = 0.0F;
      this.IlIiilIlillIiilIli[0] = 0.0F;
      this.ilIiilIliIiIiilIli[0] = 2.0F;

      for (var17 ^= (4294967296L ^ var17) & -1L << 32; (int)(var17 >>> 32) < 15; var17 += 4294967296L) {
         this.lIIiilIliiIIiilIli[(int)(var17 >>> 32)] = this.lIIiilIliiIIiilIli[(int)(var17 >>> 32) - 1]
            + 1.1428572F * this.liiiilIliiiiiilIli[(int)(var17 >>> 32) - 1];
         this.IlIiilIlillIiilIli[(int)(var17 >>> 32)] = this.IlIiilIlillIiilIli[(int)(var17 >>> 32) - 1]
            + 1.1428572F * this.IIIIIiIlilIIIIiIli[(int)(var17 >>> 32) - 1];
         this.ilIiilIliIiIiilIli[(int)(var17 >>> 32)] = this.ilIiilIliIiIiilIli[(int)(var17 >>> 32) - 1]
            + 1.1428572F * this.iIIIIiIliIlIIIiIli[(int)(var17 >>> 32) - 1];
      }

      for (var17 ^= (0L ^ var17) & -1L << 32; (int)(var17 >>> 32) < 15; var17 += 4294967296L) {
         float var8;
         float var9;
         float var19;
         float var21;
         float var24;
         float var27;
         if ((int)(var17 >>> 32) == 0) {
            var19 = this.liiiilIliiiiiilIli[0];
            var21 = this.IIIIIiIlilIIIIiIli[0];
            var24 = this.iIIIIiIliIlIIIiIli[0];
            var27 = 1.0F;
            var8 = 0.0F;
            var9 = 0.0F;
         } else if ((int)(var17 >>> 32) == 14) {
            var19 = this.liiiilIliiiiiilIli[(int)(var17 >>> 32) - 1];
            var21 = this.IIIIIiIlilIIIIiIli[(int)(var17 >>> 32) - 1];
            var24 = this.iIIIIiIliIlIIIiIli[(int)(var17 >>> 32) - 1];
            var27 = this.llIIIiIliilIIIiIli[(int)(var17 >>> 32) - 1];
            var8 = this.IiIIIiIliliIIIiIli[(int)(var17 >>> 32) - 1];
            var9 = this.iiIIIiIliIIlIIiIli[(int)(var17 >>> 32) - 1];
         } else {
            var19 = this.liiiilIliiiiiilIli[(int)(var17 >>> 32) - 1] + this.liiiilIliiiiiilIli[(int)(var17 >>> 32)];
            var21 = this.IIIIIiIlilIIIIiIli[(int)(var17 >>> 32) - 1] + this.IIIIIiIlilIIIIiIli[(int)(var17 >>> 32)];
            var24 = this.iIIIIiIliIlIIIiIli[(int)(var17 >>> 32) - 1] + this.iIIIIiIliIlIIIiIli[(int)(var17 >>> 32)];
            var27 = this.llIIIiIliilIIIiIli[(int)(var17 >>> 32) - 1] + this.llIIIiIliilIIIiIli[(int)(var17 >>> 32)];
            var8 = this.IiIIIiIliliIIIiIli[(int)(var17 >>> 32) - 1] + this.IiIIIiIliliIIIiIli[(int)(var17 >>> 32)];
            var9 = this.iiIIIiIliIIlIIiIli[(int)(var17 >>> 32) - 1] + this.iiIIIiIliIIlIIiIli[(int)(var17 >>> 32)];
         }

         float var10 = (float)Math.sqrt((double)(var19 * var19 + var21 * var21 + var24 * var24));
         if (var10 < 1.0E-6F) {
            var19 = this.liiiilIliiiiiilIli[Math.min((int)(var17 >>> 32), 13)];
            var21 = this.IIIIIiIlilIIIIiIli[Math.min((int)(var17 >>> 32), 13)];
            var24 = this.iIIIIiIliIlIIIiIli[Math.min((int)(var17 >>> 32), 13)];
            var10 = (float)Math.sqrt((double)(var19 * var19 + var21 * var21 + var24 * var24));
         }

         var19 /= var10;
         var21 /= var10;
         var24 /= var10;
         float var11 = var27 * var19 + var8 * var21 + var9 * var24;
         var27 -= var11 * var19;
         var8 -= var11 * var21;
         var9 -= var11 * var24;
         float var12 = (float)Math.sqrt((double)(var27 * var27 + var8 * var8 + var9 * var9));
         if (var12 < 1.0E-6F) {
            float var29 = 1.0F;
            float var32 = 0.0F;
            float var35 = 0.0F;
            var27 = var29 - var19 * var19;
            var8 = var32 - var19 * var21;
            var9 = var35 - var19 * var24;
            var12 = Math.max(1.0E-6F, (float)Math.sqrt((double)(var27 * var27 + var8 * var8 + var9 * var9)));
         }

         var27 /= var12;
         var8 /= var12;
         var9 /= var12;
         this.lIiiilIliiIiiilIli[(int)(var17 >>> 32)] = var19;
         this.IliiilIlilliiilIli[(int)(var17 >>> 32)] = var21;
         this.iliiilIliIiiiilIli[(int)(var17 >>> 32)] = var24;
         this.liIiilIliiiIiilIli[(int)(var17 >>> 32)] = var27;
         this.IIliilIlilIliilIli[(int)(var17 >>> 32)] = var8;
         this.iIliilIliIlliilIli[(int)(var17 >>> 32)] = var9;
         float var13 = var8 * var24 - var9 * var21;
         float var14 = var9 * var19 - var27 * var24;
         float var15 = var27 * var21 - var8 * var19;
         float var16 = Math.max(1.0E-6F, (float)Math.sqrt((double)(var13 * var13 + var14 * var14 + var15 * var15)));
         this.llliilIliilliilIli[(int)(var17 >>> 32)] = var13 / var16;
         this.IiliilIlililiilIli[(int)(var17 >>> 32)] = var14 / var16;
         this.iiliilIliIIiiilIli[(int)(var17 >>> 32)] = var15 / var16;
      }

      this.iiililIliIIIiilIli = 0;
      var17 ^= (0L ^ var17) & -1L << 32;

      while ((int)(var17 >>> 32) < 14) {
         var17 ^= ((long)((int)(var17 >>> 32) + 1) ^ var17) & -1L >>> 32;
         float var23 = (1.0F + 16.0F * (float)((int)(var17 >>> 32)) / 14.0F) / 32.0F;
         float var26 = (1.0F + 16.0F * (float)((int)var17) / 14.0F) / 32.0F;
         this.lIiiIiIlilli(
            (int)(var17 >>> 32),
            1,
            1,
            0.015625F,
            var23,
            this.llliilIliilliilIli[(int)(var17 >>> 32)],
            this.IiliilIlililiilIli[(int)(var17 >>> 32)],
            this.iiliilIliIIiiilIli[(int)(var17 >>> 32)]
         );
         this.lIiiIiIlilli(
            (int)var17, 1, 1, 0.015625F, var26, this.llliilIliilliilIli[(int)var17], this.IiliilIlililiilIli[(int)var17], this.iiliilIliIIiiilIli[(int)var17]
         );
         this.lIiiIiIlilli(
            (int)var17, -1, 1, 0.171875F, var26, this.llliilIliilliilIli[(int)var17], this.IiliilIlililiilIli[(int)var17], this.iiliilIliIIiiilIli[(int)var17]
         );
         this.lIiiIiIlilli(
            (int)(var17 >>> 32),
            -1,
            1,
            0.171875F,
            var23,
            this.llliilIliilliilIli[(int)(var17 >>> 32)],
            this.IiliilIlililiilIli[(int)(var17 >>> 32)],
            this.iiliilIliIIiiilIli[(int)(var17 >>> 32)]
         );
         this.lIiiIiIlilli(
            (int)(var17 >>> 32),
            1,
            0,
            0.34375F,
            var23,
            -this.llliilIliilliilIli[(int)(var17 >>> 32)],
            -this.IiliilIlililiilIli[(int)(var17 >>> 32)],
            -this.iiliilIliIIiiilIli[(int)(var17 >>> 32)]
         );
         this.lIiiIiIlilli(
            (int)(var17 >>> 32),
            -1,
            0,
            0.1875F,
            var23,
            -this.llliilIliilliilIli[(int)(var17 >>> 32)],
            -this.IiliilIlililiilIli[(int)(var17 >>> 32)],
            -this.iiliilIliIIiiilIli[(int)(var17 >>> 32)]
         );
         this.lIiiIiIlilli(
            (int)var17, -1, 0, 0.1875F, var26, -this.llliilIliilliilIli[(int)var17], -this.IiliilIlililiilIli[(int)var17], -this.iiliilIliIIiiilIli[(int)var17]
         );
         this.lIiiIiIlilli(
            (int)var17, 1, 0, 0.34375F, var26, -this.llliilIliilliilIli[(int)var17], -this.IiliilIlililiilIli[(int)var17], -this.iiliilIliIIiiilIli[(int)var17]
         );
         this.lIiiIiIlilli(
            (int)(var17 >>> 32),
            1,
            0,
            0.0F,
            var23,
            this.liIiilIliiiIiilIli[(int)(var17 >>> 32)],
            this.IIliilIlilIliilIli[(int)(var17 >>> 32)],
            this.iIliilIliIlliilIli[(int)(var17 >>> 32)]
         );
         this.lIiiIiIlilli(
            (int)var17, 1, 0, 0.0F, var26, this.liIiilIliiiIiilIli[(int)var17], this.IIliilIlilIliilIli[(int)var17], this.iIliilIliIlliilIli[(int)var17]
         );
         this.lIiiIiIlilli(
            (int)var17, 1, 1, 0.015625F, var26, this.liIiilIliiiIiilIli[(int)var17], this.IIliilIlilIliilIli[(int)var17], this.iIliilIliIlliilIli[(int)var17]
         );
         this.lIiiIiIlilli(
            (int)(var17 >>> 32),
            1,
            1,
            0.015625F,
            var23,
            this.liIiilIliiiIiilIli[(int)(var17 >>> 32)],
            this.IIliilIlilIliilIli[(int)(var17 >>> 32)],
            this.iIliilIliIlliilIli[(int)(var17 >>> 32)]
         );
         this.lIiiIiIlilli(
            (int)(var17 >>> 32),
            -1,
            0,
            0.1875F,
            var23,
            -this.liIiilIliiiIiilIli[(int)(var17 >>> 32)],
            -this.IIliilIlilIliilIli[(int)(var17 >>> 32)],
            -this.iIliilIliIlliilIli[(int)(var17 >>> 32)]
         );
         this.lIiiIiIlilli(
            (int)(var17 >>> 32),
            -1,
            1,
            0.171875F,
            var23,
            -this.liIiilIliiiIiilIli[(int)(var17 >>> 32)],
            -this.IIliilIlilIliilIli[(int)(var17 >>> 32)],
            -this.iIliilIliIlliilIli[(int)(var17 >>> 32)]
         );
         this.lIiiIiIlilli(
            (int)var17,
            -1,
            1,
            0.171875F,
            var26,
            -this.liIiilIliiiIiilIli[(int)var17],
            -this.IIliilIlilIliilIli[(int)var17],
            -this.iIliilIliIlliilIli[(int)var17]
         );
         this.lIiiIiIlilli(
            (int)var17, -1, 0, 0.1875F, var26, -this.liIiilIliiiIiilIli[(int)var17], -this.IIliilIlilIliilIli[(int)var17], -this.iIliilIliIlliilIli[(int)var17]
         );
         var17 += 4294967296L;
      }

      var17 ^= (0L ^ var17) & -1L << 32;
      var17 ^= (14L ^ var17) & -1L >>> 32;
      this.lIiiIiIlilli(
         (int)(var17 >>> 32),
         1,
         0,
         0.015625F,
         0.0F,
         -this.lIiiilIliiIiiilIli[(int)(var17 >>> 32)],
         -this.IliiilIlilliiilIli[(int)(var17 >>> 32)],
         -this.iliiilIliIiiiilIli[(int)(var17 >>> 32)]
      );
      this.lIiiIiIlilli(
         (int)(var17 >>> 32),
         1,
         1,
         0.015625F,
         0.03125F,
         -this.lIiiilIliiIiiilIli[(int)(var17 >>> 32)],
         -this.IliiilIlilliiilIli[(int)(var17 >>> 32)],
         -this.iliiilIliIiiiilIli[(int)(var17 >>> 32)]
      );
      this.lIiiIiIlilli(
         (int)(var17 >>> 32),
         -1,
         1,
         0.171875F,
         0.03125F,
         -this.lIiiilIliiIiiilIli[(int)(var17 >>> 32)],
         -this.IliiilIlilliiilIli[(int)(var17 >>> 32)],
         -this.iliiilIliIiiiilIli[(int)(var17 >>> 32)]
      );
      this.lIiiIiIlilli(
         (int)(var17 >>> 32),
         -1,
         0,
         0.171875F,
         0.0F,
         -this.lIiiilIliiIiiilIli[(int)(var17 >>> 32)],
         -this.IliiilIlilliiilIli[(int)(var17 >>> 32)],
         -this.iliiilIliIiiiilIli[(int)(var17 >>> 32)]
      );
      this.lIiiIiIlilli(
         (int)var17, 1, 0, 0.171875F, 0.0F, this.lIiiilIliiIiiilIli[(int)var17], this.IliiilIlilliiilIli[(int)var17], this.iliiilIliIiiiilIli[(int)var17]
      );
      this.lIiiIiIlilli(
         (int)var17, -1, 0, 0.328125F, 0.0F, this.lIiiilIliiIiiilIli[(int)var17], this.IliiilIlilliiilIli[(int)var17], this.iliiilIliIiiiilIli[(int)var17]
      );
      this.lIiiIiIlilli(
         (int)var17, -1, 1, 0.328125F, 0.03125F, this.lIiiilIliiIiiilIli[(int)var17], this.IliiilIlilliiilIli[(int)var17], this.iliiilIliIiiiilIli[(int)var17]
      );
      this.lIiiIiIlilli(
         (int)var17, 1, 1, 0.171875F, 0.03125F, this.lIiiilIliiIiiilIli[(int)var17], this.IliiilIlilliiilIli[(int)var17], this.iliiilIliIiiiilIli[(int)var17]
      );
   }

   public float liiiIIllIl(int j) {
      return this.IlIiilIlillIiilIli[j];
   }

   public Iililillililil() {
      this.ilIiilIliIiIiilIli = new float[15];
      this.liIiilIliiiIiilIli = new float[15];
      this.IIliilIlilIliilIli = new float[15];
      this.iIliilIliIlliilIli = new float[15];
      this.llliilIliilliilIli = new float[15];
      this.IiliilIlililiilIli = new float[15];
      this.iiliilIliIIiiilIli = new float[15];
      this.lIiiilIliiIiiilIli = new float[15];
      this.IliiilIlilliiilIli = new float[15];
      this.iliiilIliIiiiilIli = new float[15];
      this.liiiilIliiiiiilIli = new float[14];
      this.IIIIIiIlilIIIIiIli = new float[14];
      this.iIIIIiIliIlIIIiIli = new float[14];
      this.llIIIiIliilIIIiIli = new float[14];
      this.IiIIIiIliliIIIiIli = new float[14];
      this.iiIIIiIliIIlIIiIli = new float[14];
   }
}
