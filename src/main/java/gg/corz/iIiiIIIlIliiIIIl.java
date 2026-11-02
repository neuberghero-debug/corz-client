package gg.corz;

public class iIiiIIIlIliiIIIl implements Runnable {
   volatile Throwable IilIllllIl;
   volatile boolean illIllllIl;
   volatile boolean lllIllllIl;

   public final boolean liiiIIllIl() {
      return this.illIllllIl;
   }

   void lIiiIiIlilli() {
   }

   public final void IliIlllilIi() {
      this.lllIllllIl = true;
   }

   public final boolean iIlIlllllill() {
      return this.lllIllllIl;
   }

   @Override
   public final void run() {
      try {
         if (!this.lllIllllIl) {
            this.lIiiIiIlilli();
         }
      } catch (Throwable var5) {
         this.IilIllllIl = var5;
      } finally {
         this.illIllllIl = true;
      }
   }

   public final Throwable IilliliilIIi() {
      return this.IilIllllIl;
   }
}
