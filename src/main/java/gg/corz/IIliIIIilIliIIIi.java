package gg.corz;

import net.minecraft.class_243;

public record IIliIIIilIliIIIi(double x, double y, double z, String name, int color) {
   private final double liliiIliil;
   private final double illiiIliil;
   private final double IiliiIliil;
   private final String iiliiIliil;
   private final int IIiiiIliil;

   class_243 IliIlllilIi() {
      return new class_243(this.illiiIliil, this.IiliiIliil, this.liliiIliil);
   }

   public double IilliliilIIi() {
      return this.liliiIliil;
   }

   public double iIlIlllllill() {
      return this.IiliiIliil;
   }

   public IIliIIIilIliIIIi(double x, double y, double z, String name, int color) {
      this.illiiIliil = x;
      this.IiliiIliil = y;
      this.liliiIliil = z;
      this.iiliiIliil = name;
      this.IIiiiIliil = color;
   }

   public String lIiiIiIlilli() {
      return this.iiliiIliil;
   }

   public int iliIiiliiiii() {
      return this.IIiiiIliil;
   }

   public double liiiIIllIl() {
      return this.illiiIliil;
   }
}
