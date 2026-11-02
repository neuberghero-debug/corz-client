package gg.corz;

public record IIIIiiillIIIiiil(
   lliilIiiliilIi action, IIlIlIIllIlIlIIl phase, boolean inside, double slide, boolean projectedInside, boolean overshoot, String note
) {
   private final boolean IIIliIIiil;
   private final String llIliIIiil;
   private final lliilIiiliilIi liiIiIIiil;
   private final boolean iIIliIIiil;
   private final IIlIlIIllIlIlIIl iiiIiIIiil;
   private final boolean IlIliIIiil;
   private final double lIIliIIiil;

   public String IIIllIIliIIl() {
      return this.llIliIIiil;
   }

   public IIlIlIIllIlIlIIl liiiIIllIl() {
      return this.iiiIiIIiil;
   }

   public boolean lIiiIiIlilli() {
      return this.iIIliIIiil;
   }

   public lliilIiiliilIi IliIlllilIi() {
      return this.liiIiIIiil;
   }

   public IIIIiiillIIIiiil(lliilIiiliilIi action, IIlIlIIllIlIlIIl phase, boolean inside, double slide, boolean projectedInside, boolean overshoot, String note) {
      this.liiIiIIiil = action;
      this.iiiIiIIiil = phase;
      this.IIIliIIiil = inside;
      this.lIIliIIiil = slide;
      this.iIIliIIiil = projectedInside;
      this.IlIliIIiil = overshoot;
      this.llIliIIiil = note;
   }

   public boolean iliIiiliiiii() {
      return this.IlIliIIiil;
   }

   public double IilliliilIIi() {
      return this.lIIliIIiil;
   }

   public boolean iIlIlllllill() {
      return this.IIIliIIiil;
   }
}
