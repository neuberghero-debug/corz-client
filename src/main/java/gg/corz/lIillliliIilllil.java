package gg.corz;

final class lIillliliIilllil {
   private int liIlliiIil;
   private int lIIlliiIil;
   private long IiIlliiIil;
   private long iIIlliiIil;
   private int ilIlliiIil;
   private boolean llIlliiIil;
   private int iiIlliiIil;
   private int IIIlliiIil;
   private long IlIlliiIil;
   private lIililiiIilili iiiIliiIil = lIililiiIilili.iIiIlIlIIl;
   static final int liiIliiIil = 10;

   void IilliliilIIi(int holdTicks, long hitTick, int targetId, int releaseTicks) {
      if (this.iiiIliiIil == lIililiiIilili.iIiIlIlIIl) {
         this.llIlliiIil = true;
         this.ilIlliiIil = holdTicks;
         this.IiIlliiIil = hitTick + (904589019497627294L ^ 904589019497627284L);
         this.liIlliiIil = targetId;
         this.iiIlliiIil = releaseTicks;
      }
   }

   boolean IliIlllilIi() {
      return this.iiiIliiIil == lIililiiIilili.iIiIlIlIIl;
   }

   boolean liiiIIllIl() {
      return this.iiiIliiIil == lIililiiIilili.lliIlIlIIl;
   }

   void IIIllIIliIIl() {
      this.iiiIliiIil = lIililiiIilili.iIiIlIlIIl;
      this.llIlliiIil = false;
   }

   boolean iIlIlllllill(long hitTick, int holdTicks, int releaseTicks) {
      if (this.iiiIliiIil != lIililiiIilili.iIiIlIlIIl) {
         return false;
      } else {
         this.IIIlliiIil = Math.max(0, holdTicks);
         this.lIIlliiIil = Math.max(1, releaseTicks);
         this.iIIlliiIil = hitTick;
         this.llIlliiIil = false;
         this.iiiIliiIil = lIililiiIilili.IliIlIlIIl;
         return true;
      }
   }

   boolean lIiiIiIlilli(int targetId, long tick) {
      if (this.llIlliiIil && targetId == this.ilIlliiIil) {
         this.llIlliiIil = false;
         return tick <= this.IiIlliiIil && this.iIlIlllllill(tick, this.liIlliiIil, this.iiIlliiIil);
      } else {
         return false;
      }
   }

   lIliilIiiIliilIi iliIiiliiiii(long forwardHeld, boolean tick) {
      switch (this.iiiIliiIil) {
         case IliIlIlIIl:
            if (!tick) {
               this.IIIllIIliIIl();
               return lIliilIiiIliilIi.IIilillIIi;
            } else {
               if (forwardHeld > this.iIIlliiIil && forwardHeld - this.iIIlliiIil >= (long)Math.max(1, this.IIIlliiIil)) {
                  this.iiiIliiIil = lIililiiIilili.lliIlIlIIl;
                  this.IlIlliiIil = forwardHeld;
                  return lIliilIiiIliilIi.lIilillIIi;
               }

               return lIliilIiiIliilIi.IIilillIIi;
            }
         case lliIlIlIIl:
            if (forwardHeld - this.IlIlliiIil < (long)this.lIIlliiIil) {
               return lIliilIiiIliilIi.iIilillIIi;
            }

            this.IIIllIIliIIl();
            return lIliilIiiIliilIi.IlilillIIi;
         default:
            return lIliilIiiIliilIi.IIilillIIi;
      }
   }
}
