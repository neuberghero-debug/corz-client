package gg.corz;

public record IilIlIIllilIlIIl(int readyIn, float lastScaled) {
   public static final IilIlIIllilIlIIl IIIIlillIl = new IilIlIIllilIlIIl(0, 0.0F);
   private final float iiiiIillIl;
   private final int liiiIillIl;

   public float iIlIlllllill() {
      return this.iiiiIillIl;
   }

   public IilIlIIllilIlIIl(int readyIn, float lastScaled) {
      this.liiiIillIl = readyIn;
      this.iiiiIillIl = lastScaled;
   }

   public boolean IliIlllilIi(int landTicks) {
      return landTicks >= this.liiiIillIl;
   }

   public int liiiIIllIl() {
      return this.liiiIillIl;
   }
}
