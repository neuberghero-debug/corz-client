package gg.corz;

public record IIliiiIilIliiiIi(
   double off, double self, double aggression, double airValue, int airCap, double toward, double time, double obsidian, double reuse
) {
   private final double IIlIiIIlIi;
   private final double illIiIIlIi;
   private final double lllIiIIlIi;
   private final double liIIiIIlIi;
   private final double iIlIiIIlIi;
   private final int lIlIiIIlIi;
   private final double iiIIiIIlIi;
   private final double IiIIiIIlIi;
   private final double IllIiIIlIi;

   public double IlIlllIlilIl() {
      return this.IllIiIIlIi;
   }

   public IIliiiIilIliiiIi(double off, double self, double aggression, double airValue, int airCap, double toward, double time, double obsidian, double reuse) {
      this.IiIIiIIlIi = off;
      this.liIIiIIlIi = self;
      this.iiIIiIIlIi = aggression;
      this.IIlIiIIlIi = airValue;
      this.lIlIiIIlIi = airCap;
      this.iIlIiIIlIi = toward;
      this.IllIiIIlIi = time;
      this.lllIiIIlIi = obsidian;
      this.illIiIIlIi = reuse;
   }

   public double liiiIIllIl() {
      return this.IiIIiIIlIi;
   }

   public double IilliliilIIi() {
      return this.iiIIiIIlIi;
   }

   public int iliIiiliiiii() {
      return this.lIlIiIIlIi;
   }

   public static IIliiiIilIliiiIi IliIlllilIi(double aggression, double self, double off) {
      return new IIliiiIilIliiiIi(aggression, self, off, 0.25, 24, 1.0, 0.15, 1.0, 1.5);
   }

   public double lIiiIiIlilli() {
      return this.IIlIiIIlIi;
   }

   public double iIlIlllllill() {
      return this.liIIiIIlIi;
   }

   public double IIIllIIliIIl() {
      return this.iIlIiIIlIi;
   }

   public double IIlllIlliIll() {
      return this.illIiIIlIi;
   }

   public double IiIlliIliiIl() {
      return this.lllIiIIlIi;
   }
}
