package gg.corz;

public record iIIIiIilIlIIiIil(int index, boolean materialInHotbar, double distanceSq) {
   private final boolean IliIlllIil;
   private final int iIiIlllIil;
   private final double lliIlllIil;

   public boolean liiiIIllIl() {
      return this.IliIlllIil;
   }

   public int IliIlllilIi() {
      return this.iIiIlllIil;
   }

   public double iIlIlllllill() {
      return this.lliIlllIil;
   }

   public iIIIiIilIlIIiIil(int index, boolean materialInHotbar, double distanceSq) {
      this.iIiIlllIil = index;
      this.IliIlllIil = materialInHotbar;
      this.lliIlllIil = distanceSq;
   }
}
