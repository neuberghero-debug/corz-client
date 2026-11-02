package gg.corz;

public record liIIlliiIIll(String model, int parent, float pivotX, float pivotY, int channel) {
   private final float lllIIIIiillIIIIi;
   private final int IilIIIIililIIIIi;
   private final int IIlIIIIilIlIIIIi;
   private final String liIIIIIiiiIIIIIi;
   private final float iIlIIIIiIllIIIIi;

   public liIIlliiIIll(String model, int parent, float pivotX, float pivotY, int channel) {
      this.liIIIIIiiiIIIIIi = model;
      this.IIlIIIIilIlIIIIi = parent;
      this.iIlIIIIiIllIIIIi = pivotX;
      this.lllIIIIiillIIIIi = pivotY;
      this.IilIIIIililIIIIi = channel;
   }

   public int lIiiIiIlilli() {
      return this.IilIIIIililIIIIi;
   }

   public float iIlIlllllill() {
      return this.iIlIIIIiIllIIIIi;
   }

   public float IilliliilIIi() {
      return this.lllIIIIiillIIIIi;
   }

   public String IliIlllilIi() {
      return this.liIIIIIiiiIIIIIi;
   }

   public int liiiIIllIl() {
      return this.IIlIIIIilIlIIIIi;
   }
}
