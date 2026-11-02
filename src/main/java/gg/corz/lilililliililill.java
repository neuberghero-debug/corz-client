package gg.corz;

public final class lilililliililill {
   private int lIIiIliill;
   private final int[] IIIiIliill = new int[IiiIIiIlliiIIiIl.values().length];

   public void liiiIIllIl() {
      this.lIIiIliill++;
   }

   public void IliIlllilIi(IiiIIiIlliiIIiIl c) {
      this.IIIiIliill[c.ordinal()]++;
   }

   public int lIiiIiIlilli() {
      return this.IIIiIliill[IiiIIiIlliiIIiIl.llliiIiIll.ordinal()] + this.IIIiIliill[IiiIIiIlliiIIiIl.illiiIiIll.ordinal()];
   }

   public int IilliliilIIi() {
      return this.lIIiIliill;
   }

   public int iIlIlllllill(IiiIIiIlliiIIiIl c) {
      return this.IIIiIliill[c.ordinal()];
   }

   public int IlIlllIlilIl() {
      long var6 = -237226119397874297L;
      long var8 = 2243352301944974868L;
      var6 ^= (0L ^ var6) & -1L << 32;
      IiiIIiIlliiIIiIl[] var2 = IiiIIiIlliiIIiIl.values();
      var6 ^= ((long)var2.length ^ var6) & -1L >>> 32;

      for (long var12 = var8 ^ (0L ^ var8) & -1L << 32; (int)(var12 >>> 32) < (int)var6; var12 += 4294967296L) {
         IiiIIiIlliiIIiIl var5 = var2[(int)(var12 >>> 32)];
         if (var5 != IiiIIiIlliiIIiIl.IliiiIiIll) {
            var6 ^= ((long)((int)(var6 >>> 32) + this.IIIiIliill[var5.ordinal()]) << 32 ^ var6) & -1L << 32;
         }
      }

      return (int)(var6 >>> 32);
   }

   public int iliIiiliiiii() {
      return this.IIIiIliill[IiiIIiIlliiIIiIl.IiliiIiIll.ordinal()];
   }

   public int IIIllIIliIIl() {
      return this.IIIiIliill[IiiIIiIlliiIIiIl.iIiiiIiIll.ordinal()]
         + this.IIIiIliill[IiiIIiIlliiIIiIl.iiliiIiIll.ordinal()]
         + this.IIIiIliill[IiiIIiIlliiIIiIl.IIiiiIiIll.ordinal()]
         + this.IIIiIliill[IiiIIiIlliiIIiIl.IiliiIiIll.ordinal()];
   }
}
