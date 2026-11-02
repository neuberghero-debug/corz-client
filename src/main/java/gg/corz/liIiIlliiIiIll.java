package gg.corz;

record liIiIlliiIiIll(boolean move, double dx, double dz, boolean hop) {
   private final double lllIiIlilillIiIlil;
   private final boolean IilIiIlillilIiIlil;
   private final boolean IIlIiIlillIlIiIlil;
   private final double iIlIiIlilIllIiIlil;

   public boolean IilliliilIIi() {
      return this.IilIiIlillilIiIlil;
   }

   public double iIlIlllllill() {
      return this.lllIiIlilillIiIlil;
   }

   private liIiIlliiIiIll(boolean move, double dx, double dz, boolean hop) {
      this.IIlIiIlillIlIiIlil = move;
      this.iIlIiIlilIllIiIlil = dx;
      this.lllIiIlilillIiIlil = dz;
      this.IilIiIlillilIiIlil = hop;
   }

   public boolean IliIlllilIi() {
      return this.IIlIiIlillIlIiIlil;
   }

   public double liiiIIllIl() {
      return this.iIlIiIlilIllIiIlil;
   }
}
