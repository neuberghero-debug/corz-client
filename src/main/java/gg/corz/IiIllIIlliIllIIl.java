package gg.corz;

public final class IiIllIIlliIllIIl {
   private long IllilillIl;
   private long iIlilillIl;
   private long IIlilillIl;
   private int iiIilillIl = -1;
   private int lIlilillIl;

   public void iliIiiliiiii(long worldKeyAfterStep) {
      if (this.iIlIlllllill()) {
         this.iiIilillIl++;
         this.IIlilillIl = worldKeyAfterStep;
         this.iIlilillIl++;
      }
   }

   public long lIiiIiIlilli() {
      return this.IIlilillIl;
   }

   public int liiiIIllIl() {
      return this.iiIilillIl;
   }

   public boolean IilliliilIIi() {
      return this.lIlilillIl > 0 && this.iiIilillIl >= this.lIlilillIl;
   }

   public long Illlllllilll() {
      return this.IllilillIl;
   }

   public void IiIlliIliiIl(int steps, int at, long worldKey) {
      this.lIlilillIl = Math.max(0, steps);
      this.iiIilillIl = this.lIlilillIl > 0 && at >= 0 ? Math.min(at, this.lIlilillIl) : -1;
      this.IIlilillIl = worldKey;
   }

   public long IIlllIlliIll() {
      return this.iIlilillIl;
   }

   public boolean IIIllIIliIIl(long worldKeyNow) {
      return this.iIlIlllllill() && worldKeyNow != this.IIlilillIl;
   }

   public void IliIlllilIi(int worldKey, long steps) {
      this.iiIilillIl = worldKey > 0 ? 0 : -1;
      this.lIlilillIl = worldKey;
      this.IIlilillIl = steps;
   }

   public void IlIlllIlilIl() {
      this.iiIilillIl = -1;
      this.lIlilillIl = 0;
      this.IllilillIl++;
   }

   public boolean iIlIlllllill() {
      return this.iiIilillIl >= 0 && this.iiIilillIl < this.lIlilillIl;
   }
}
