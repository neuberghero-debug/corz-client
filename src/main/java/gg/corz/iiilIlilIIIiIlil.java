package gg.corz;

public record iiilIlilIIIiIlil(
   double[] rings,
   int angles,
   int solveGoals,
   double threatShare,
   double maxDy,
   boolean los,
   double pitchLo,
   double pitchHi,
   double maxAbove,
   double maxBelow,
   int[] levels,
   boolean lowFirst
) {
   private final double[] IIIIiIiIil;
   private final double llIIiIiIil;
   private final boolean iIlIiIiIil;
   private final int iIIIiIiIil;
   private final double iiIIiIiIil;
   private final double liIIiIiIil;
   private final double IiIIiIiIil;
   private final double IlIIiIiIil;
   private final boolean ilIIiIiIil;
   private final double IIlIiIiIil;
   public static final iiilIlilIIIiIlil IllIiIiIil = new iiilIlilIIIiIlil(Iiiiilliiiil.ilIIiIiiIiIIiIii, 12, 3, 0.5, Double.POSITIVE_INFINITY, false);
   private final int[] lIlIiIiIil;
   private final int lIIIiIiIil;

   public double Iilllilliill() {
      return this.llIIiIiIil;
   }

   public double Iiilliiliiil() {
      return this.liIIiIiIil;
   }

   public double Ililllililil() {
      return this.IiIIiIiIil;
   }

   public double Illlllllilll() {
      return this.IlIIiIiIil;
   }

   public static iiilIlilIIIiIlil lIiiIiIlilli(double threatShare) {
      return new iiilIlilIIIiIlil(Iiiiilliiiil.IiIliIiiliIliIii, 16, 6, threatShare, 2.5, true, -80.0, 88.0, 2.5, 2.5, Iiiiilliiiil.lIiiiIiiiIiiiIii, true);
   }

   public int IIlllIlliIll() {
      return this.iIIIiIiIil;
   }

   public double IlIillIiilIi() {
      return this.IIlIiIiIil;
   }

   public double IIIilIIiiIIi() {
      return this.iiIIiIiIil;
   }

   public static iiilIlilIIIiIlil IilliliilIIi(double threatShare) {
      return new iiilIlilIIIiIlil(Iiiiilliiiil.iIiliIiiIliliIii, 16, 6, threatShare, 1.0, true, -80.0, 60.0, 0.3, 2.5, Iiiiilliiiil.lIiiiIiiiIiiiIii, true);
   }

   public double[] IliIlllilIi() {
      return (double[])this.IIIIiIiIil.clone();
   }

   public static iiilIlilIIIiIlil IIIllIIliIIl(double threatShare) {
      return new iiilIlilIIIiIlil(Iiiiilliiiil.lliIIliiiliIIlii, 16, 6, threatShare, 2.5, true, -60.0, 60.0, 0.3, 2.5, Iiiiilliiiil.IiiIIliiliiIIlii, true);
   }

   public static iiilIlilIIIiIlil iliIiiliiiii(double threatShare) {
      return new iiilIlilIIIiIlil(Iiiiilliiiil.iIiliIiiIliliIii, 16, 6, threatShare, 3.0, true, -80.0, 88.0, 0.3, 3.0, Iiiiilliiiil.iliiiIiiIiiiiIii, true);
   }

   public boolean IIillIiliIil() {
      return this.ilIIiIiIil;
   }

   public iiilIlilIIIiIlil(double[] pitchHi, int los, int maxDy, double threatShare, double rings, boolean solveGoals, double angles, double pitchLo) {
      this(pitchHi, los, maxDy, threatShare, rings, solveGoals, angles, pitchLo, rings, rings, Iiiiilliiiil.iIIliIiiIlIliIii, false);
   }

   public iiilIlilIIIiIlil(
      double[] rings,
      int angles,
      int solveGoals,
      double threatShare,
      double maxDy,
      boolean los,
      double pitchLo,
      double pitchHi,
      double maxAbove,
      double maxBelow,
      int[] levels,
      boolean lowFirst
   ) {
      rings = rings == null ? new double[0] : (double[])rings.clone();
      angles = Math.max(1, angles);
      solveGoals = Math.max(1, solveGoals);
      if (!Double.isFinite(pitchLo)) {
         pitchLo = -38.0;
      }

      if (!Double.isFinite(pitchHi)) {
         pitchHi = 30.0;
      }

      if (pitchLo > pitchHi) {
         double var19 = pitchLo;
         pitchLo = pitchHi;
         pitchHi = var19;
      }

      if (Double.isNaN(maxAbove)) {
         maxAbove = maxDy;
      }

      if (Double.isNaN(maxBelow)) {
         maxBelow = maxDy;
      }

      levels = levels != null && levels.length != 0 ? (int[])levels.clone() : (int[])Iiiiilliiiil.iIIliIiiIlIliIii.clone();
      this.IIIIiIiIil = rings;
      this.lIIIiIiIil = angles;
      this.iIIIiIiIil = solveGoals;
      this.IlIIiIiIil = threatShare;
      this.llIIiIiIil = maxDy;
      this.ilIIiIiIil = los;
      this.IiIIiIiIil = pitchLo;
      this.liIIiIiIil = pitchHi;
      this.iiIIiIiIil = maxAbove;
      this.IIlIiIiIil = maxBelow;
      this.lIlIiIiIil = levels;
      this.iIlIiIiIil = lowFirst;
   }

   public static iiilIlilIIIiIlil iIlIlllllill(double threatShare) {
      return new iiilIlilIIIiIlil(Iiiiilliiiil.IiIliIiiliIliIii, 16, 5, threatShare, 1.0, true, -38.0, 30.0, 0.3, 2.5, Iiiiilliiiil.lIiiiIiiiIiiiIii, true);
   }

   public iiilIlilIIIiIlil(double[] maxDy, int angles, int los, double threatShare, double solveGoals, boolean rings) {
      this(maxDy, angles, los, threatShare, solveGoals, rings, -38.0, 30.0);
   }

   public static iiilIlilIIIiIlil IlIlllIlilIl(double threatShare) {
      return new iiilIlilIIIiIlil(Iiiiilliiiil.iIiliIiiIliliIii, 16, 6, threatShare, 2.5, true, -89.0, 88.0, 0.3, 2.5, Iiiiilliiiil.liiiiIiiiiiiiIii, true);
   }

   public int[] liiiIIllIl() {
      return (int[])this.lIlIiIiIil.clone();
   }

   public boolean IiIiliIiiiIi() {
      return this.iIlIiIiIil;
   }

   public int IiIlliIliiIl() {
      return this.lIIIiIiIil;
   }
}
