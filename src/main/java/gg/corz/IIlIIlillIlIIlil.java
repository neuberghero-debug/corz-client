package gg.corz;

public enum IIlIIlillIlIIlil {
   lllliilIil(1600, 15.0F, 6.0F, 12.0F, 0.85F, 0.85F, 2.2F, 0.95F, 0.025F),
   IllliilIil(5000, 16.0F, 6.0F, 12.0F, 0.55F, 1.0F, 1.1F, 0.96F, 0.05F);
   public final float IliliilIil;
   public final float lIiliilIil;
   public final int illliilIil;
   public final float lilliilIil;
   // $VF: synthetic field
   private static final IIlIIlillIlIIlil[] ililiilIil = IilliliilIIi();
   public final float iIiliilIil;
   public final float IilliilIil;
   public final float IIiliilIil;
   public final float iilliilIil;
   public final float lliliilIil;

   public int iIlIlllllill(float amount01) {
      float var2 = amount01 < 0.0F ? 0.0F : (amount01 > 1.0F ? 1.0F : amount01);
      return Math.round((float)this.illliilIil * var2);
   }

   public float IliIlllilIi() {
      return this.IilliilIil * 2.0F;
   }

   public float liiiIIllIl() {
      return this.lilliilIil + this.iilliilIil;
   }

   private IIlIIlillIlIIlil(int above, float alpha, float param5, float maxCount, float relax, float nullx, float restLift, float landFade, float windResponse) {
      this.illliilIil = above;
      this.IilliilIil = alpha;
      this.lilliilIil = var5;
      this.iilliilIil = maxCount;
      this.IIiliilIil = relax;
      this.lIiliilIil = nullx;
      this.iIiliilIil = restLift;
      this.IliliilIil = landFade;
      this.lliliilIil = windResponse;
   }
}
