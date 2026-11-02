package gg.corz;

public record iiliIillIIiiIill(String name, int[] colors) {
   private final String iiIililill;
   private final int[] IIlililill;

   public int[] IilliliilIIi() {
      return this.IIlililill;
   }

   public String iIlIlllllill() {
      return this.iiIililill;
   }

   public int liiiIIllIl() {
      return this.IIlililill[this.IliIlllilIi()];
   }

   public iiliIillIIiiIill(String name, int[] colors) {
      this.iiIililill = name;
      this.IIlililill = colors;
   }

   public int IliIlllilIi() {
      long var7 = 7514425434269797309L;
      var7 ^= (0L ^ var7) & -1L << 32;
      double var2 = -1.0;

      for (var7 ^= (0L ^ var7) & -1L >>> 32; (int)var7 < this.IIlililill.length; var7 ^= (var7 ^ var7 + (long)1) & -1L >>> 32) {
         double var5 = liIliiiliiIliiil.iliIiiliiiii(this.IIlililill[(int)var7]) * 0.68 + liIliiiliiIliiil.IIIllIIliIIl(this.IIlililill[(int)var7]) * 0.32;
         if (var5 > var2) {
            var2 = var5;
            var7 ^= ((long)((int)var7) << 32 ^ var7) & -1L << 32;
         }
      }

      return (int)(var7 >>> 32);
   }
}
