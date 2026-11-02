package gg.corz;

public final class iIililIlIlililIl {
   private int IlIililIll;
   private int IIIililIll = -1;
   private long llIililIll;
   private long iIIililIll = -1L;
   public static final long liillilIll = 1000L;
   public static final long iiillilIll = 3000L;
   private boolean lIIililIll;

   public iIililIlIlililIl() {
      this.IlIililIll = -1;
   }

   public void iIlIlllllill(long nowMs) {
      if (this.IIIililIll != -1) {
         if (this.iIIililIll < 0L) {
            this.iIIililIll = nowMs;
         } else {
            if (nowMs - this.iIIililIll >= 1000L) {
               this.IilliliilIIi();
            }
         }
      }
   }

   public void IliIlllilIi(int nowMs, long attackerId) {
      if (nowMs >= 0) {
         this.IlIililIll = nowMs;
         this.llIililIll = attackerId;
         if (this.lIIililIll && nowMs == this.IIIililIll) {
            this.lIIililIll = false;
         }
      }
   }

   public boolean liiiIIllIl(int nowMs, long entityId) {
      this.iIIililIll = -1L;
      if (nowMs != this.IIIililIll) {
         this.IIIililIll = nowMs;
         this.lIIililIll = nowMs != this.IlIililIll || entityId - this.llIililIll > 3000L;
      }

      return !this.lIIililIll;
   }

   public void lIiiIiIlilli() {
      this.IilliliilIIi();
      this.IlIililIll = -1;
      this.llIililIll = 0L;
   }

   public void IilliliilIIi() {
      this.IIIililIll = -1;
      this.lIIililIll = false;
      this.iIIililIll = -1L;
   }
}
