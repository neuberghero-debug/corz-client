package gg.corz;

public final class IiiiIIilliiiIIil {
   private long llIiliIIil = Long.MIN_VALUE;

   public boolean IliIlllilIi(long clientTick) {
      if (this.llIiliIIil == clientTick) {
         return false;
      } else {
         this.llIiliIIil = clientTick;
         return true;
      }
   }

   public int liiiIIllIl(long clientTick) {
      return this.llIiliIIil == clientTick ? 1 : 0;
   }

   public void iIlIlllllill() {
      this.llIiliIIil = Long.MIN_VALUE;
   }
}
