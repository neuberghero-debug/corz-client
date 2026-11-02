package gg.corz;

public final class liiIliliiiIlil {
   public int illliiiIiIilliiiIi;
   public final long[] lIlliiiIiiIlliiiIi;
   public final String lilliiiIiiilliiiIi;
   public long iIiliiiIiIliliiiIi;
   public final long[] IllliiiIilllliiiIi;
   public final int IIiliiiIilIiliiiIi;
   public final ilIllIllIiIllIll iiIliiiIiIIlliiiIi;
   public final long IiIliiiIiliIliiiIi;

   liiIliliiiIlil(long sideMask, ilIllIllIiIllIll region, long[] regionRev, long[] targets, int targetSigs, String reason, int ctx, long tick) {
      this.IiIliiiIiliIliiiIi = sideMask;
      this.iiIliiiIiIIlliiiIi = region;
      this.lIlliiiIiiIlliiiIi = regionRev;
      this.IllliiiIilllliiiIi = targets;
      this.illliiiIiIilliiiIi = targetSigs;
      this.lilliiiIiiilliiiIi = reason;
      this.IIiliiiIilIiliiiIi = ctx;
      this.iIiliiiIiIliliiiIi = tick;
   }

   public String IliIlllilIi() {
      long var3 = 4374042638605338414L;
      StringBuilder var1 = new StringBuilder();

      for (long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < illiIlIiIiliIlIi.IiiIiIIIIi.length; var5 += 4294967296L) {
         if ((this.illliiiIiIilliiiIi & 1 << (int)(var5 >>> 32)) != 0) {
            if (var1.length() > 0) {
               var1.append('|');
            }

            var1.append(illiIlIiIiliIlIi.IiiIiIIIIi[(int)(var5 >>> 32)]);
         }
      }

      return liiiIIllIl<"liiiIIllIl","kPFM6nFaYZWmMuX69FRl8JLGNae+268Vqf0kpfUePiYCpGY=">()
         + this.IiIliiiIiliIliiiIi
         + liiiIIllIl<"liiiIIllIl","b/WQrL9pkSOg41NEXjwznOv9r1LRe1+IJk6lJbp7ljmpmX8tXw==">()
         + this.lIlliiiIiiIlliiiIi.length
         + liiiIIllIl<"liiiIIllIl","VJC5z3r/7wS4m+3JzQRnxM1SJcgYF62GkPPFJif/ZCVrJFQ=">()
         + var1
         + liiiIIllIl<"liiiIIllIl","VKXnLkTzJsBaEscLmOMgZlvLZWJ8nxLkE5ZSn9CoGEI8IpQj">()
         + this.lilliiiIiiilliiiIi
         + liiiIIllIl<"liiiIIllIl","PGODiSlxtxEktZMnRuELoy1haN1d8DY1v36tEWrp6awv">()
         + this.iiIliiiIiIIlliiiIi.IliIlllilIi()
         + liiiIIllIl<"liiiIIllIl","lVYErrQzQWg7wVZoFIc6bfD/BBejcubzBSf53t0=">();
   }
}
