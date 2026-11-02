package gg.corz;

public record iIllllIlIlllllIl(boolean move, double dirX, double dirZ, IilIIIililIIIi jump, IilIIIililIIIi sneak, IilIIIililIIIi sprint, boolean urgent) {
   private final IilIIIililIIIi IiliiiIiIl;
   private final IilIIIililIIIi liliiiIiIl;
   private final IilIIIililIIIi illiiiIiIl;
   private final boolean iiliiiIiIl;
   private final boolean iIliiiIiIl;
   private final double llliiiIiIl;
   private final double IlliiiIiIl;

   public IilIIIililIIIi Iilllilliill() {
      return this.IiliiiIiIl;
   }

   public boolean IlIlllIlilIl() {
      return this.iIliiiIiIl;
   }

   public static iIllllIlIlllllIl liiiIIllIl(double sprint, double dirX, boolean dirZ) {
      return new iIllllIlIlllllIl(
         true,
         sprint,
         dirX,
         IilIIIililIIIi.iIillIiliIlillIili,
         IilIIIililIIIi.iIillIiliIlillIili,
         dirZ ? IilIIIililIIIi.IIillIililIillIili : IilIIIililIIIi.iIillIiliIlillIili,
         false
      );
   }

   public boolean Ililllililil() {
      return this.iiliiiIiIl;
   }

   public iIllllIlIlllllIl(boolean move, double dirX, double dirZ, IilIIIililIIIi jump, IilIIIililIIIi sneak, IilIIIililIIIi sprint, boolean urgent) {
      this.iIliiiIiIl = move;
      this.IlliiiIiIl = dirX;
      this.llliiiIiIl = dirZ;
      this.illiiiIiIl = jump;
      this.IiliiiIiIl = sneak;
      this.liliiiIiIl = sprint;
      this.iiliiiIiIl = urgent;
   }

   public IilIIIililIIIi Illlllllilll() {
      return this.illiiiIiIl;
   }

   public iIllllIlIlllllIl iIlIlllllill(IilIIIililIIIi t) {
      return new iIllllIlIlllllIl(this.iIliiiIiIl, this.IlliiiIiIl, this.llliiiIiIl, t, this.IiliiiIiIl, this.liliiiIiIl, this.iiliiiIiIl);
   }

   public iIllllIlIlllllIl IilliliilIIi(IilIIIililIIIi t) {
      return new iIllllIlIlllllIl(this.iIliiiIiIl, this.IlliiiIiIl, this.llliiiIiIl, this.illiiiIiIl, t, this.liliiiIiIl, this.iiliiiIiIl);
   }

   public static iIllllIlIlllllIl IliIlllilIi() {
      return new iIllllIlIlllllIl(
         false, 0.0, 0.0, IilIIIililIIIi.iIillIiliIlillIili, IilIIIililIIIi.iIillIiliIlillIili, IilIIIililIIIi.iIillIiliIlillIili, false
      );
   }

   public IilIIIililIIIi IIillIiliIil() {
      return this.liliiiIiIl;
   }

   public iIllllIlIlllllIl iliIiiliiiii() {
      return new iIllllIlIlllllIl(this.iIliiiIiIl, this.IlliiiIiIl, this.llliiiIiIl, this.illiiiIiIl, this.IiliiiIiIl, this.liliiiIiIl, true);
   }

   public iIllllIlIlllllIl IIIllIIliIIl() {
      return new iIllllIlIlllllIl(false, 0.0, 0.0, this.illiiiIiIl, IilIIIililIIIi.iIillIiliIlillIili, this.liliiiIiIl, false);
   }

   public iIllllIlIlllllIl lIiiIiIlilli(IilIIIililIIIi t) {
      return new iIllllIlIlllllIl(this.iIliiiIiIl, this.IlliiiIiIl, this.llliiiIiIl, this.illiiiIiIl, this.IiliiiIiIl, t, this.iiliiiIiIl);
   }

   public double IIlllIlliIll() {
      return this.llliiiIiIl;
   }

   public double IiIlliIliiIl() {
      return this.IlliiiIiIl;
   }
}
