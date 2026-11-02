package gg.corz;

public final class IIllIllIllIl {
   private int IIIIIllllIIIIlll;
   public int llIIIlllilIIIlll;
   private boolean liiiiIlliiiiiIll;
   private boolean iiIIIlllIIlIIlll;
   public int iIIIIlllIlIIIlll;
   public static final int iliiiIllIiiiiIll = 4;
   public int IiIIIlllliIIIlll;

   public void iIlIlllllill() {
      this.liiiiIlliiiiiIll = false;
      this.IIIIIllllIIIIlll = 0;
      this.iiIIIlllIIlIIlll = false;
   }

   public boolean IliIlllilIi(boolean projectedUnsafe, boolean restingUnsafe) {
      long var4 = -1258594211625368789L;
      var4 ^= ((long)(!projectedUnsafe && !restingUnsafe ? 0 : 1) << 32 ^ var4) & -1L << 32;
      if ((int)(var4 >>> 32) != this.iiIIIlllIIlIIlll) {
         this.iiIIIlllIIlIIlll = (boolean)((int)(var4 >>> 32));
         if (this.liiiiIlliiiiiIll && (int)(var4 >>> 32) == 0) {
            this.IiIIIlllliIIIlll++;
         }
      }

      if ((int)(var4 >>> 32) != 0) {
         if (!this.liiiiIlliiiiiIll) {
            this.liiiiIlliiiiiIll = true;
            this.iIIIIlllIlIIIlll++;
         }

         this.IIIIIllllIIIIlll = 0;
         return true;
      } else if (!this.liiiiIlliiiiiIll) {
         return false;
      } else if (++this.IIIIIllllIIIIlll >= 4) {
         this.liiiiIlliiiiiIll = false;
         this.IIIIIllllIIIIlll = 0;
         this.llIIIlllilIIIlll++;
         return false;
      } else {
         return true;
      }
   }

   public void IilliliilIIi() {
      this.iIIIIlllIlIIIlll = this.llIIIlllilIIIlll = this.IiIIIlllliIIIlll = 0;
   }

   public boolean liiiIIllIl() {
      return this.liiiiIlliiiiiIll;
   }
}
