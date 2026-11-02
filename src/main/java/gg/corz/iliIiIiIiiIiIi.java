package gg.corz;

public record iliIiIiIiiIiIi(iIllllIlIlllllIl intent, boolean wantHit, float minCharge, boolean crit, lIIIilIliIIIilIl phase) {
   private final lIIIilIliIIIilIl ilIiilliiIiIiillii;
   private final float lIIiilliiiIIiillii;
   private final boolean iiililliiIIIiillii;
   private final boolean IlIiilliillIiillii;
   public static final iliIiIiIiiIiIi liIiilliiiiIiillii = new iliIiIiIiiIiIi(iIllllIlIlllllIl.IliIlllilIi(), false, 0.95F, false, lIIIilIliIIIilIl.iIIiIlliIl);
   private final iIllllIlIlllllIl Iiililliiliilillii;

   public iliIiIiIiiIiIi(iIllllIlIlllllIl intent, boolean wantHit, float minCharge, boolean crit, lIIIilIliIIIilIl phase) {
      this.Iiililliiliilillii = intent;
      this.iiililliiIIIiillii = wantHit;
      this.lIIiilliiiIIiillii = minCharge;
      this.IlIiilliillIiillii = crit;
      this.ilIiilliiIiIiillii = phase;
   }

   public boolean IilliliilIIi() {
      return this.IlIiilliillIiillii;
   }

   public float iIlIlllllill() {
      return this.lIIiilliiiIIiillii;
   }

   public iIllllIlIlllllIl IliIlllilIi() {
      return this.Iiililliiliilillii;
   }

   public lIIIilIliIIIilIl lIiiIiIlilli() {
      return this.ilIiilliiIiIiillii;
   }

   public boolean liiiIIllIl() {
      return this.iiililliiIIIiillii;
   }
}
