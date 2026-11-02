package gg.corz;

public record llllIiIlilllIiIl(int slot, float speed, int efficiency, boolean pickaxe, boolean suitableObsidian) {
   private final float IlilIliIll;
   private final int iIilIliIll;
   private final boolean ililIliIll;
   private final boolean IiilIliIll;
   private final int llilIliIll;

   public llllIiIlilllIiIl(int slot, float speed, int efficiency, boolean pickaxe, boolean suitableObsidian) {
      this.iIilIliIll = slot;
      this.IlilIliIll = speed;
      this.llilIliIll = efficiency;
      this.ililIliIll = pickaxe;
      this.IiilIliIll = suitableObsidian;
   }

   public float iIlIlllllill() {
      return this.IlilIliIll;
   }

   public int liiiIIllIl() {
      return this.iIilIliIll;
   }

   public boolean IliIlllilIi() {
      return this.iIilIliIll >= 0 && this.iIilIliIll < 9;
   }

   public boolean lIiiIiIlilli() {
      return this.ililIliIll;
   }

   public int IilliliilIIi() {
      return this.llilIliIll;
   }

   public boolean iliIiiliiiii() {
      return this.IiilIliIll;
   }
}
