package gg.corz;

public record iiIllIlIIlllIl(float armor, float toughness, int resistanceAmp, float epf, int difficulty) {
   private final int lilIilIlliilIilIll;
   private final int iIiIilIllIliIilIll;
   public static final iiIllIlIIlllIl lliIilIlliliIilIll = new iiIllIlIIlllIl(0.0F, 0.0F, -1, 0.0F, -1);
   private final float IllIilIlllllIilIll;
   private final float illIilIllIilIilIll;
   private final float IIiIilIlllIiIilIll;

   public int lIiiIiIlilli() {
      return this.iIiIilIllIliIilIll;
   }

   public float liiiIIllIl() {
      return this.illIilIllIilIilIll;
   }

   public float IliIlllilIi() {
      return this.IllIilIlllllIilIll;
   }

   public iiIllIlIIlllIl(float armor, float toughness, int resistanceAmp, float epf, int difficulty) {
      this.IllIilIlllllIilIll = armor;
      this.illIilIllIilIilIll = toughness;
      this.lilIilIlliilIilIll = resistanceAmp;
      this.IIiIilIlllIiIilIll = epf;
      this.iIiIilIllIliIilIll = difficulty;
   }

   public float IilliliilIIi() {
      return this.IIiIilIlllIiIilIll;
   }

   public int iIlIlllllill() {
      return this.lilIilIlliilIilIll;
   }
}
