package gg.corz;

public final class llIIIililIIIil {
   private lIIililiIIilil lIIiillIiiIIiillIi = lIIililiIIilil.IiIlIlIliliIlIlIli;
   private int IlIiillIillIiillIi;
   private final int IiilillIiliilillIi;
   private int ilIiillIiIiIiillIi = -1;
   private int IIliillIilIliillIi;
   private int liIiillIiiiIiillIi = -1;
   private final int iiilillIiIIIiillIi;
   public static final int iIliillIiIlliillIi = 20;

   public void IilliliilIIi(int tick) {
      if (this.lIIiillIiiIIiillIi == lIIililiIIilil.IiIlIlIliliIlIlIli) {
         this.lIIiillIiiIIiillIi = lIIililiIIilil.iiIlIlIliIIllIlIli;
         this.ilIiillIiIiIiillIi = tick;
         this.IlIiillIillIiillIi = tick;
         this.liIiillIiiiIiillIi = -1;
         this.IIliillIilIliillIi = 0;
      }
   }

   public void lIiiIiIlilli(int serverSneakSettled, boolean tick) {
      if (this.lIIiillIiiIIiillIi != lIIililiIIilil.IiIlIlIliliIlIlIli) {
         this.IIliillIilIliillIi++;
         switch (this.lIIiillIiiIIiillIi) {
            case illlIlIliIillIlIli:
               this.lIIiillIiiIIiillIi = lIIililiIIilil.lIllIlIliiIllIlIli;
               this.IlIiillIillIiillIi = serverSneakSettled;
               break;
            case lIllIlIliiIllIlIli:
               if (tick && serverSneakSettled - this.IlIiillIillIiillIi >= this.IiilillIiliilillIi) {
                  this.lIIiillIiiIIiillIi = lIIililiIIilil.IlllIlIlillllIlIli;
                  this.IlIiillIillIiillIi = serverSneakSettled;
               }
               break;
            case IlllIlIlillllIlIli:
               if (serverSneakSettled - this.IlIiillIillIiillIi >= 20) {
                  this.lIIiillIiiIIiillIi = lIIililiIIilil.IiIlIlIliliIlIlIli;
                  this.IIliillIilIliillIi = 0;
               }
               break;
            case IiIlIlIliliIlIlIli:
               if (serverSneakSettled - this.IlIiillIillIiillIi >= this.iiilillIiIIIiillIi) {
                  this.lIIiillIiiIIiillIi = lIIililiIIilil.IiIlIlIliliIlIlIli;
               }
         }
      }
   }

   public int IlIlllIlilIl() {
      return this.IIliillIilIliillIi;
   }

   public void IIIllIIliIIl() {
      this.lIIiillIiiIIiillIi = lIIililiIIilil.IiIlIlIliliIlIlIli;
      this.IlIiillIillIiillIi = 0;
   }

   public boolean iIlIlllllill() {
      return this.lIIiillIiiIIiillIi == lIIililiIIilil.IlllIlIlillllIlIli;
   }

   public llIIIililIIIil(int holdAfterClickTicks, int settleTicks) {
      this.IiilillIiliilillIi = Math.max(0, holdAfterClickTicks);
      this.iiilillIiIIIiillIi = Math.max(0, settleTicks);
   }

   public boolean liiiIIllIl() {
      return this.lIIiillIiiIIiillIi != lIIililiIIilil.IiIlIlIliliIlIlIli;
   }

   public int IIlllIlliIll() {
      return this.liIiillIiiiIiillIi;
   }

   public lIIililiIIilil IliIlllilIi() {
      return this.lIIiillIiiIIiillIi;
   }

   public void iliIiiliiiii(int tick) {
      if (this.lIIiillIiiIIiillIi == lIIililiIIilil.IlllIlIlillllIlIli) {
         this.lIIiillIiiIIiillIi = lIIililiIIilil.illlIlIliIillIlIli;
         this.IlIiillIillIiillIi = tick;
         this.liIiillIiiiIiillIi = tick;
      }
   }

   public int IiIlliIliiIl() {
      return this.ilIiillIiIiIiillIi;
   }
}
