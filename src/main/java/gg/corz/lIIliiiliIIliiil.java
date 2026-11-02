package gg.corz;

public record lIIliiiliIIliiil(int index, int gain, int shieldable, int blocked) {
   private final int illlIlIiil;
   private final int lillIlIiil;
   private final int IillIlIiil;
   private final int iillIlIiil;

   public int lIiiIiIlilli() {
      return this.lillIlIiil;
   }

   public int IilliliilIIi() {
      return this.IillIlIiil;
   }

   public int iliIiiliiiii() {
      return this.iillIlIiil;
   }

   public boolean liiiIIllIl() {
      return this.lillIlIiil > 0 && this.iillIlIiil == this.lillIlIiil;
   }

   public int iIlIlllllill() {
      return this.illlIlIiil;
   }

   public boolean IliIlllilIi() {
      return this.illlIlIiil >= 0;
   }

   public lIIliiiliIIliiil(int index, int gain, int shieldable, int blocked) {
      this.illlIlIiil = index;
      this.IillIlIiil = gain;
      this.lillIlIiil = shieldable;
      this.iillIlIiil = blocked;
   }
}
