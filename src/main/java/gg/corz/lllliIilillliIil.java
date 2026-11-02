package gg.corz;

public final class lllliIilillliIil {
   private volatile boolean liIlIilIil;
   private volatile long iiIlIilIil = Long.MIN_VALUE;
   private volatile long IIllIilIil = Long.MIN_VALUE;

   public long lIiiIiIlilli() {
      return this.iiIlIilIil;
   }

   public boolean IilliliilIIi() {
      return this.liIlIilIil;
   }

   public long iliIiiliiiii() {
      return this.IIllIilIil;
   }

   public synchronized void iIlIlllllill(boolean knockbackCarried, long tick) {
      if (knockbackCarried) {
         this.liIlIilIil = false;
         this.IIllIilIil = tick;
      }
   }

   public synchronized void IliIlllilIi() {
      this.liIlIilIil = false;
      this.iiIlIilIil = Long.MIN_VALUE;
      this.IIllIilIil = Long.MIN_VALUE;
   }

   public synchronized void liiiIIllIl(boolean start, long tick) {
      this.liIlIilIil = start;
      if (start) {
         this.iiIlIilIil = tick;
      }
   }
}
