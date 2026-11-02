package gg.corz;

public final class IlllIlIlllllIlIl {
   private final int llllliilIl;
   private IIiIlIlllIiIlIll iillliilIl;
   private final Iiilliilliilliil IlllliilIl;
   private int IillliilIl = -1;
   private boolean illlliilIl;
   private lIiiIlIliIiiIlIl lillliilIl = lIiiIlIliIiiIlIl.IliIllIiIl;

   public IIiIlIlllIiIlIll lIiiIiIlilli() {
      return this.IIIllIIliIIl(lIiiIlIliIiiIlIl.iIIlllIiIl);
   }

   private IIiIlIlllIiIlIll IIIllIIliIIl(lIiiIlIliIiiIlIl why) {
      this.lillliilIl = why;
      return this.iillliilIl = IIiIlIlllIiIlIll.illilillll;
   }

   public IlllIlIlllllIlIl(Iiilliilliilliil recipe, int startedTick) {
      this.IlllliilIl = recipe;
      this.llllliilIl = startedTick;
   }

   public IIiIlIlllIiIlIll iliIiiliiiii(lIiiIlIliIiiIlIl why) {
      return this.IIIllIIliIIl(why == null ? lIiiIlIliIiiIlIl.iIIlllIiIl : why);
   }

   public boolean liiiIIllIl() {
      return this.illlliilIl;
   }

   public lIiiIlIliIiiIlIl iIlIlllllill() {
      return this.lillliilIl;
   }

   public IIiIlIlllIiIlIll IilliliilIIi(llliiiilliii o) {
      if (this.iillliilIl != null) {
         return this.iillliilIl;
      } else if (o.IliIlllilIi() - this.llllliilIl > this.IlllliilIl.Ililllililil()) {
         return this.IIIllIIliIIl(lIiiIlIliIiiIlIl.lliIllIiIl);
      } else if (this.illlliilIl) {
         if (!o.IIIllIIliIIl()) {
            return this.IIIllIIliIIl(o.lIiiIiIlilli() ? lIiiIlIliIiiIlIl.IiiIllIiIl : lIiiIlIliIiiIlIl.liiIllIiIl);
         } else if (o.lIiiIiIlilli()) {
            return this.iillliilIl = IIiIlIlllIiIlIll.lllilillll;
         } else if (!o.iliIiiliiiii()) {
            return this.IIIllIIliIIl(lIiiIlIliIiiIlIl.iiiIllIiIl);
         } else {
            return o.IliIlllilIi() - this.IillliilIl > this.IlllliilIl.IIillIiliIil()
               ? this.IIIllIIliIIl(lIiiIlIliIiiIlIl.iliIllIiIl)
               : IIiIlIlllIiIlIll.Illilillll;
         }
      } else if (!o.IIIllIIliIIl()) {
         return this.IIIllIIliIIl(lIiiIlIliIiiIlIl.IiiIllIiIl);
      } else if (!o.iliIiiliiiii()) {
         return this.IIIllIIliIIl(lIiiIlIliIiiIlIl.iiiIllIiIl);
      } else if (!this.IlllliilIl.IiIlliIliiIl() || o.liiiIIllIl() && o.iIlIlllllill() >= this.IlllliilIl.IIlllIlliIll()) {
         if (!o.IilliliilIIi()) {
            return IIiIlIlllIiIlIll.lIlilillll;
         } else {
            this.illlliilIl = true;
            this.IillliilIl = o.IliIlllilIi();
            return IIiIlIlllIiIlIll.iIlilillll;
         }
      } else {
         return IIiIlIlllIiIlIll.IIlilillll;
      }
   }

   public Iiilliilliilliil IliIlllilIi() {
      return this.IlllliilIl;
   }
}
