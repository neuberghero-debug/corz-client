package gg.corz;

import java.util.Objects;

public record IIIiIiillIIiIiil(String dim, double x, double y, double z) {
   private final double iillIIilil;
   private final String lillIIilil;
   private final double IIilIIilil;
   private final double lIilIIilil;

   public IIIiIiillIIiIiil(String dim, double x, double y, double z) {
      this.lillIIilil = dim;
      this.iillIIilil = x;
      this.IIilIIilil = y;
      this.lIilIIilil = z;
   }

   public double lIiiIiIlilli() {
      return this.IIilIIilil;
   }

   public double liiiIIllIl(IIIiIiillIIiIiil o) {
      if (!this.IliIlllilIi(o)) {
         return Double.longBitsToDouble(-6784478044616872454L ^ -2438504404204343814L);
      } else {
         double var2 = this.iillIIilil - o.iillIIilil;
         double var4 = this.IIilIIilil - o.IIilIIilil;
         double var6 = this.lIilIIilil - o.lIilIIilil;
         return Math.sqrt(var2 * var2 + var4 * var4 + var6 * var6);
      }
   }

   public double IilliliilIIi() {
      return this.iillIIilil;
   }

   public String iIlIlllllill() {
      return this.lillIIilil;
   }

   public double iliIiiliiiii() {
      return this.lIilIIilil;
   }

   public boolean IliIlllilIi(IIIiIiillIIiIiil o) {
      return o != null && Objects.equals(this.lillIIilil, o.lillIIilil);
   }
}
