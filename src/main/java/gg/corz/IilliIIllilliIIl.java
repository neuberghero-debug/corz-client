package gg.corz;

public record IilliIIllilliIIl(iIlIIIIiIllIIIIi lane, boolean available, double value, int prepTicks, boolean pops, boolean kills, String why) {
   private final int illIiIilIl;
   private final boolean IllIiIilIl;
   private final boolean IilIiIilIl;
   private final String iilIiIilIl;
   private final boolean lilIiIilIl;
   private final double lllIiIilIl;
   private final iIlIIIIiIllIIIIi iIlIiIilIl;

   public boolean IIIllIIliIIl() {
      return this.lilIiIilIl;
   }

   public iIlIIIIiIllIIIIi liiiIIllIl() {
      return this.iIlIiIilIl;
   }

   public static IilliIIllilliIIl IliIlllilIi(iIlIIIIiIllIIIIi why, String lane) {
      return new IilliIIllilliIIl(why, false, Double.NEGATIVE_INFINITY, 0, false, false, lane);
   }

   public double IilliliilIIi() {
      return this.lllIiIilIl;
   }

   public IilliIIllilliIIl(iIlIIIIiIllIIIIi lane, boolean available, double value, int prepTicks, boolean pops, boolean kills, String why) {
      this.iIlIiIilIl = lane;
      this.IllIiIilIl = available;
      this.lllIiIilIl = value;
      this.illIiIilIl = prepTicks;
      this.IilIiIilIl = pops;
      this.lilIiIilIl = kills;
      this.iilIiIilIl = why;
   }

   public boolean iliIiiliiiii() {
      return this.IilIiIilIl;
   }

   public String IlIlllIlilIl() {
      return this.iilIiIilIl;
   }

   public boolean iIlIlllllill() {
      return this.IllIiIilIl;
   }

   public int lIiiIiIlilli() {
      return this.illIiIilIl;
   }
}
