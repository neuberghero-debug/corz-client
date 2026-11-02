package gg.corz;

final class lilIIIIliilIIIIl {
   private long iIlIliIlIl;
   private long IIlIliIlIl = -1L;

   boolean liiiIIllIl(long setbackMs, long nowMs, long tick) {
      long var9 = 7517023498921567195L;
      if (nowMs < 0L) {
         return false;
      } else {
         if (nowMs != this.IIlIliIlIl) {
            this.IIlIliIlIl = nowMs;
            this.iIlIliIlIl = tick - nowMs <= 1000L ? setbackMs : Long.MIN_VALUE;
         }

         var9 ^= ((long)(this.iIlIliIlIl != Long.MIN_VALUE && setbackMs >= this.iIlIliIlIl && setbackMs - this.iIlIliIlIl < 2L ? 1 : 0) << 32 ^ var9)
            & -1L << 32;
         var9 ^= ((long)(tick >= nowMs && tick - nowMs < 120L ? 1 : 0) ^ var9) & -1L >>> 32;
         return (int)(var9 >>> 32) != 0 || (int)var9 != 0;
      }
   }

   lilIIIIliilIIIIl() {
      this.iIlIliIlIl = Long.MIN_VALUE;
   }

   void IliIlllilIi() {
      this.IIlIliIlIl = -1L;
      this.iIlIliIlIl = Long.MIN_VALUE;
   }
}
