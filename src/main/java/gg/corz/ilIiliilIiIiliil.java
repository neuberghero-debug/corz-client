package gg.corz;

public record ilIiliilIiIiliil(boolean on, boolean deep, boolean behind, boolean ref, boolean bare) {
   private final boolean iIIlIIIiil;
   private final boolean IlIlIIIiil;
   public static final float lillIIIiil = 0.7F;
   public static final float lIllIIIiil = 4.0F;
   public static final float iIilIIIiil = 1.0F;
   public static final float iIllIIIiil = 1.0F;
   private final boolean llIlIIIiil;
   public static final float llllIIIiil = 3.0F;
   private final boolean lIIlIIIiil;
   public static final float iillIIIiil = 2.0F;
   public static final float llilIIIiil = 1.0F;
   private final boolean ilIlIIIiil;
   public static final float IlllIIIiil = 0.25F;
   public static final float IillIIIiil = 0.25F;
   public static final int IIllIIIiil = 2;
   public static final float lIilIIIiil = 6.0F;
   public static final float IlilIIIiil = 2.0F;
   public static final float IIilIIIiil = 1.0F;
   public static final ilIiliilIiIiliil IiIlIIIiil = new ilIiliilIiIiliil(false, false);
   public static final float illlIIIiil = 0.5F;
   public static final int liIlIIIiil = 2;
   public static final int iiIlIIIiil = 5;

   public float IIlilIliiIli(float base) {
      return this.lIIlIIIiil ? Math.min(base, 0.5F) : base;
   }

   public boolean IIlllIlliIll(float full, boolean dealt, float popsTarget, float cost, boolean deny) {
      if (!this.llIlIIIiil || dealt) {
         return true;
      } else if (deny && this.IiIlliIliiIl(popsTarget, cost)) {
         return true;
      } else {
         float var6 = this.IlIlllIlilIl(popsTarget, cost);
         return Float.isFinite(full) && Float.isFinite(var6) && full >= var6;
      }
   }

   public static ilIiliilIiIiliil IliIlllilIi(boolean terminator, boolean totems, int totemConfirmed, float ehp) {
      return liiiIIllIl(terminator, totems, totemConfirmed, ehp, false);
   }

   public ilIiliilIiIiliil(boolean on, boolean deep, boolean behind, boolean ref, boolean bare) {
      this.lIIlIIIiil = on;
      this.iIIlIIIiil = deep;
      this.IlIlIIIiil = behind;
      this.llIlIIIiil = ref;
      this.ilIlIIIiil = bare;
   }

   public boolean IIIllIIliIIl(boolean kills, boolean pops) {
      return this.llIlIIIiil && this.iIIlIIIiil && !this.ilIlIIIiil && (kills || pops && !this.IlIlIIIiil);
   }

   public static double IIiilIiiiIii(double up, double dist) {
      return Double.isFinite(up) && Double.isFinite(dist) && dist > 1.0E-6 ? Math.max(0.0, Math.min(1.0, up / dist)) : 0.0;
   }

   public boolean IlIillIiilIi(float knock, float selfEhp, boolean cost, float full, float popsTarget, float dealt) {
      return this.IiIiliIiiiIi(knock, selfEhp, cost, Float.NaN, full, popsTarget, dealt);
   }

   public ilIiliilIiIiliil(boolean on, boolean behind, boolean deep) {
      this(on, behind, deep, false, false);
   }

   public static boolean Iilllilliill(float targetEhp) {
      return Float.isFinite(targetEhp) && targetEhp > 0.0F && targetEhp <= 6.0F;
   }

   public boolean IiIiliIiiiIi(float knock, float full, boolean targetEhp, float dealt, float popsTarget, float selfEhp, float cost) {
      if (!this.Ililllililil(knock, full, targetEhp)) {
         return false;
      } else if (!Float.isFinite(popsTarget) || !Float.isFinite(selfEhp) || !Float.isFinite(cost)) {
         return false;
      } else if (this.llIlIIIiil) {
         return this.lIiiIiIlilli(Math.max(popsTarget, selfEhp), cost, false);
      } else {
         return Illlllllilll(Math.max(popsTarget, selfEhp), cost)
            ? this.IIIilIIiiIIi(knock, targetEhp, dealt)
            : this.Iiilliiliiil(popsTarget, selfEhp, cost) && IIillIiliIil(knock, full, targetEhp, selfEhp);
      }
   }

   public boolean iiIIlIIlIl() {
      return this.llIlIIIiil;
   }

   public float Iilililiiili(float lift, float selfKnock, double knock) {
      if (!this.lIIlIIIiil) {
         return 0.0F;
      } else {
         float var5 = Float.isFinite(lift) ? Math.max(0.0F, Math.min(1.0F, lift)) : 0.0F;
         return Float.isFinite(selfKnock) && Double.isFinite(knock)
            ? var5 - Math.max(0.0F, Math.min(1.0F, selfKnock)) * (float)Math.max(0.0, Math.min(1.0, knock))
            : var5;
      }
   }

   public float Illillliilli(float knock) {
      return this.lIIlIIIiil && Float.isFinite(knock) ? 3.0F * Math.max(-1.0F, Math.min(1.0F, knock)) : 0.0F;
   }

   public float IlIlllIlilIl(float cost, float full) {
      return this.llIlIIIiil && !this.ilIlIIIiil && Float.isFinite(full) ? Math.min(cost, Math.max(0.0F, full)) : cost;
   }

   public static boolean Illlllllilll(float full, float ehp) {
      return full > 0.0F && Float.isFinite(ehp) && full >= ehp - 1.0F;
   }

   public static ilIiliilIiIiliil iIlIlllllill(boolean ehp, boolean terminator, int behind, float popPending, boolean totems, boolean totemConfirmed) {
      return ehp && terminator && !totems && behind >= 1 && popPending > 0.0F && Float.isFinite(popPending)
         ? new ilIiliilIiIiliil(true, behind >= 2, totemConfirmed)
         : IiIlIIIiil;
   }

   public boolean lIlIliIlIl() {
      return this.ilIlIIIiil;
   }

   public double Iliilliiilii(double value) {
      return this.lIIlIIIiil && Double.isFinite(value) ? Math.max(value, 0.25) : value;
   }

   public boolean llIIlilIIl() {
      return this.iIIlIIIiil;
   }

   public boolean IiIlliIliiIl(float full, float cost) {
      return this.llIlIIIiil && !this.ilIlIIIiil && Float.isFinite(full) && full - this.IlIlllIlilIl(full, cost) >= 1.0F;
   }

   public boolean iliIiiliiiii(boolean kills) {
      return this.IIIllIIliIIl(kills, false);
   }

   public ilIiliilIiIiliil(boolean on, boolean deep) {
      this(on, deep, false);
   }

   public String IIIIllIIIl() {
      return this.lIIlIIIiil
         ? (
            this.llIlIIIiil
               ? (
                  this.iIIlIIIiil
                     ? IllIllllIl<"IllIllllIl","2hvHIC+1a5sltZRVieNAw0DL7pCg4UC1Lys079s=">()
                     : (
                        this.ilIlIIIiil
                           ? IllIllllIl<"IllIllllIl","EBSEwW6MSF7qgC4b8oIH2eC2Pu69fDmu+KxwCts=">()
                           : IllIllllIl<"IllIllllIl","E0uibC0bsx5v1wTM4flYuGrftP8FtdgR8vPGxJo=">()
                     )
               )
               : (
                  this.iIIlIIIiil
                     ? IllIllllIl<"IllIllllIl","EVZIEQN/MfEP9t8KUNxOQMjqTNSpIsKL2OSdzns=">()
                     : IllIllllIl<"IllIllllIl","xt/P9luhz6CctZ85dfaw7aADUTer+ldlKIkHfH0=">()
               )
         )
         : IllIllllIl<"IllIllllIl","qg5DoreMipxuP6UHbEfU5r38h/RHY6VgXxlgFLs=">();
   }

   public boolean IiIIlliIIl() {
      return this.IlIlIIIiil;
   }

   public boolean Iiilliiliiil(float cost, float full, float selfEhp) {
      if (!this.lIIlIIIiil || !Float.isFinite(cost) || !Float.isFinite(full) || !Float.isFinite(selfEhp)) {
         return false;
      } else if (this.llIlIIIiil) {
         return this.lIiiIiIlilli(Math.max(cost, full), selfEhp, false);
      } else if (Illlllllilll(Math.max(cost, full), selfEhp)) {
         return false;
      } else {
         return this.iIIlIIIiil ? true : Math.max(cost, full) <= selfEhp - 4.0F;
      }
   }

   public static ilIiliilIiIiliil IilliliilIIi(boolean totems, int behind, float ehp, boolean totemReady) {
      return ehp > 0.0F && Float.isFinite(ehp) ? new ilIiliilIiIiliil(true, totems && behind >= 2, totemReady, true, !totems) : IiIlIIIiil;
   }

   public static ilIiliilIiIiliil liiiIIllIl(boolean ehp, boolean terminator, int popPending, float totemConfirmed, boolean totems) {
      return iIlIlllllill(ehp, terminator, popPending, totemConfirmed, totems, false);
   }

   public boolean IIIilIIiiIIi(float targetEhp, boolean popsTarget, float dealt) {
      return this.lIIlIIIiil && this.iIIlIIIiil && popsTarget ? !Float.isFinite(dealt) || Float.isFinite(targetEhp) && targetEhp >= dealt + 1.0F : false;
   }

   public float Iiiiliiiiiii() {
      return this.lIIlIIIiil ? 3.0F : 0.0F;
   }

   public boolean iIIIlIlIIl() {
      return this.lIIlIIIiil;
   }

   public boolean Ililllililil(float popsTarget, float knock, boolean dealt) {
      return !this.lIIlIIIiil ? false : dealt || Float.isFinite(popsTarget) && popsTarget >= 1.0F || Float.isFinite(knock) && knock >= 0.25F;
   }

   public boolean lIiiIiIlilli(float selfEhp, float full, boolean lethalOk) {
      if (!Float.isFinite(selfEhp) || !Float.isFinite(full)) {
         return false;
      } else {
         return selfEhp > 0.0F && !(selfEhp < full - (this.ilIlIIIiil ? 2.0F : 1.0F)) ? !this.ilIlIIIiil && lethalOk : true;
      }
   }

   public static boolean IIillIiliIil(float cost, float knock, boolean dealt, float popsTarget) {
      if (!Float.isFinite(popsTarget)) {
         return false;
      } else {
         float var4 = Math.max(0.0F, popsTarget);
         if (dealt) {
            return true;
         } else {
            return Float.isFinite(cost) && cost >= 1.0F ? var4 <= 2.0F || var4 <= 0.7F * cost : Float.isFinite(knock) && knock >= 0.25F && var4 <= 1.0F;
         }
      }
   }
}
