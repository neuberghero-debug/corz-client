package gg.corz;

public final class iIIliiIiIlIliiIi {
   private static final int iIilIIIlIi = 12;
   public float liilIIIlIi = 1.0F;
   private static final float IillIIIlIi = 0.9F;
   private long llilIIIlIi;
   private long IlilIIIlIi;
   private static final float lIilIIIlIi = 0.5F;
   private boolean ililIIIlIi;
   private static final float llllIIIlIi = 26.0F;
   private static final float IlllIIIlIi = 150.0F;
   public float IiilIIIlIi;
   public boolean IIIiIIIlIi;
   public float iiilIIIlIi = 1.0F;
   private static final float illlIIIlIi = 70.0F;
   public boolean lIIiIIIlIi;
   private static final float iillIIIlIi = 0.965F;
   private static final float lillIIIlIi = 1.9F;
   private static final float IIilIIIlIi = 1.1F;
   private static final float iIllIIIlIi = 260.0F;

   public boolean iliIiiliiiii() {
      return this.liilIIIlIi <= 0.002F && this.IiilIIIlIi <= 0.004F;
   }

   public float IIIllIIliIIl(int index) {
      return this.lIiiIiIlilli(index).liilIIIlIi;
   }

   public boolean iIlIlllllill() {
      long var4 = 4486467429135558485L;
      long var1 = System.nanoTime();
      var4 ^= ((long)(this.llilIIIlIi != 0L && var1 - this.llilIIIlIi <= 300000000L ? 0 : 1) << 32 ^ var4) & -1L << 32;
      this.llilIIIlIi = var1;
      if (this.IlilIIIlIi != 0L && (float)(var1 - this.IlilIIIlIi) / 1000000.0F > (this.ililIIIlIi ? 0.0F : 312.0F) + 260.0F) {
         this.IlilIIIlIi = 0L;
      }

      return (boolean)((int)(var4 >>> 32));
   }

   public void IliIlllilIi() {
      this.IlilIIIlIi = System.nanoTime();
      this.ililIIIlIi = false;
   }

   public void liiiIIllIl() {
      if (this.IlilIIIlIi == 0L) {
         this.IlilIIIlIi = System.nanoTime();
         this.ililIIIlIi = true;
      }
   }

   public boolean IilliliilIIi() {
      return this.IlilIIIlIi != 0L;
   }

   public iIIliiIiIlIliiIi() {
      this.IIIiIIIlIi = true;
      this.lIIiIIIlIi = true;
   }

   public iIIliiIiIlIliiIi lIiiIiIlilli(int index) {
      this.IiilIIIlIi = 0.0F;
      this.liilIIIlIi = 1.0F;
      this.iiilIIIlIi = 1.0F;
      this.IIIiIIIlIi = true;
      this.lIIiIIIlIi = true;
      if (this.IlilIIIlIi == 0L) {
         return this;
      } else {
         float var2 = Math.max(0.0F, (float)(this.llilIIIlIi - this.IlilIIIlIi) / 1000000.0F);
         float var3 = var2 - (this.ililIIIlIi ? 0.0F : (float)Math.min(Math.max(index, 0), 12) * 26.0F);
         if (var3 >= 260.0F) {
            return this;
         } else {
            float var4 = Math.max(0.0F, var3 / 260.0F);
            float var5 = var3 <= 0.0F ? 0.0F : llilliilililliil.liiiIIllIl(var3 / 150.0F);
            if (this.ililIIIlIi) {
               this.liilIIIlIi = 0.55F + 0.45F * var5;
               this.iiilIIIlIi = 0.965F + 0.035000026F * llilliilililliil.IilliliilIIi(var4, 1.1F);
            } else {
               this.liilIIIlIi = var5;
               this.iiilIIIlIi = 0.9F + 0.100000024F * llilliilililliil.IilliliilIIi(var4, 1.9F);
               this.IiilIIIlIi = (1.0F - var5) * 0.5F * llilliilililliil.IliIlllilIi(var2 / 70.0F);
               this.lIIiIIIlIi = var3 >= 75.0F;
            }

            this.IIIiIIIlIi = var4 > 0.6F;
            return this;
         }
      }
   }
}
