package gg.corz;

public record IlIillillIilli(
   lIiliiliIiliil target,
   lIiliiliIiliil stand,
   boolean sneak,
   lIiliiliIiliil support,
   int face,
   double hx,
   double hy,
   double hz,
   int look,
   double margin,
   boolean supportIsDirt
) {
   private final lIiliiliIiliil lilIliIIIl;
   private final double IiiIliIIIl;
   private final lIiliiliIiliil IIiIliIIIl;
   private final int iliIliIIIl;
   private final double lliIliIIIl;
   private final int lIiIliIIIl;
   private final boolean liiIliIIIl;
   private final lIiliiliIiliil IilIliIIIl;
   private final boolean iilIliIIIl;
   private final double IliIliIIIl;
   private final double iIiIliIIIl;

   public double IIIllIIliIIl() {
      return this.iIiIliIIIl;
   }

   public double IlIlllIlilIl() {
      return this.IliIliIIIl;
   }

   public double Illlllllilll() {
      return this.IiiIliIIIl;
   }

   public lIiliiliIiliil iIlIlllllill() {
      return this.lilIliIIIl;
   }

   public int IIlllIlliIll() {
      return this.iliIliIIIl;
   }

   public boolean IilliliilIIi() {
      return this.iilIliIIIl;
   }

   public long IliIlllilIi() {
      long var8 = 3015156374637277761L;
      long var1 = -3750763034362895579L;
      long[] var3 = new long[]{
         this.IilIliIIIl.IIIllIIliIIl(), this.lilIliIIIl.IIIllIIliIIl(), this.IIiIliIIIl.IIIllIIliIIl(), (long)this.lIiIliIIIl, this.iilIliIIIl ? 1L : 0L
      };
      var8 ^= ((long)var3.length << 32 ^ var8) & -1L << 32;

      for (long var11 = var8 ^ (0L ^ var8) & -1L >>> 32; (int)var11 < (int)(var11 >>> 32); var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32) {
         long var6 = var3[(int)var11];
         var1 = (var1 ^ var6) * 1099511628211L;
      }

      return var1;
   }

   public boolean Iilllilliill() {
      return this.liiIliIIIl;
   }

   public IlIillillIilli(
      lIiliiliIiliil target,
      lIiliiliIiliil stand,
      boolean sneak,
      lIiliiliIiliil support,
      int face,
      double hx,
      double hy,
      double hz,
      int look,
      double margin,
      boolean supportIsDirt
   ) {
      this.IilIliIIIl = target;
      this.lilIliIIIl = stand;
      this.iilIliIIIl = sneak;
      this.IIiIliIIIl = support;
      this.lIiIliIIIl = face;
      this.iIiIliIIIl = hx;
      this.IliIliIIIl = hy;
      this.lliIliIIIl = hz;
      this.iliIliIIIl = look;
      this.IiiIliIIIl = margin;
      this.liiIliIIIl = supportIsDirt;
   }

   public lIiliiliIiliil liiiIIllIl() {
      return this.IilIliIIIl;
   }

   public double IiIlliIliiIl() {
      return this.lliIliIIIl;
   }

   public lIiliiliIiliil lIiiIiIlilli() {
      return this.IIiIliIIIl;
   }

   public int iliIiiliiiii() {
      return this.lIiIliIIIl;
   }
}
