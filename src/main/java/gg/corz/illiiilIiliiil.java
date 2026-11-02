package gg.corz;

public enum illiiilIiliiil {
   liiIIilliiiiIIilli(
      iliIiiliiiii<"iliIiiliiiii","hgEb95+yboPbxA8v4WrhkmqVchPdtUiJ+r4m1QECctcVuq5Deo0=">(),
      0.5F,
      IililIllililIl.liiiIIllIl(IIlIlIllIlIlIl.lllIIIIllillIIIIll),
      IililIllililIl.liiiIIllIl(IIlIlIllIlIlIl.IilIIIIlllilIIIIll),
      IililIllililIl.liiiIIllIl(IIlIlIllIlIlIl.iilIIIIllIIiIIIIll),
      0.2F,
      2.0F,
      false,
      1.0F
   ),
   iilIIilliIIiIIilli(iliIiiliiiii<"iliIiiliiiii","LP8baDONPLEzRmGGUNJI4D3iSGDCz3/9I9Z2hlDQrbj8Y1Ma">(), 0.5F, 0.12F, 0.22F, 0.2F, 0.07F, 2.0F, false, 0.0F),
   lIiIIilliiIiIIilli(iliIiiliiiii<"iliIiiliiiii","MeErJHGCbOmo2apaj9+IMV8IW4dppmnkmJFFQ+by0xx4cUTv">(), 0.5F, 0.12F, 0.24F, 0.22F, 0.07F, 2.0F, false, 0.0F),
   iliIIilliIiiIIilli(iliIiiliiiii<"iliIiiliiiii","kzC0nAbHSAuaIQnKCoGzfhWcjZUydXeHDmRjp7cExG4/0q5e">(), 0.45F, 0.12F, 0.24F, 0.22F, 0.05F, 4.0F, false, 0.9F),
   IIIlIillilIIlIilli(iliIiiliiiii<"iliIiiliiiii","7Y3VKwF7GDC1Bs04Co7SKwzRHncjgMepGqk6XIJAhOFAew==">(), -1.0F, -1.0F, -1.0F, -1.0F, -1.0F, -1.0F, false, 0.0F),
   IliIIillilliIIilli(
      iliIiiliiiii<"iliIiiliiiii","MINs1hQ35M26HIeVd5DRA+XUkuU5vH+fcpYWXVb7XOuvs0B4Bw==">(), 0.28F, 0.1F, 0.18F, 0.16F, 0.05F, 1.5F, false, 0.9F
   );

   public final float iiIlIilliIIllIilli;
   public final float llIlIilliilIlIilli;
   public final float illlIilliIillIilli;
   public final boolean lillIilliiillIilli;
   public final String iIIlIilliIlIlIilli;
   public final float IiIlIilliliIlIilli;
   public final float IlllIillillllIilli;
   public final float IIilIillilIilIilli;
   public final float lIllIilliiIllIilli;

   public IIliIiilIliIii liiiIIllIl() {
      return this == liiIIilliiiiIIilli ? IIliIiilIliIii.lIIIlIiIIl : IIliIiilIliIii.IIIIlIiIIl;
   }

   public boolean IliIlllilIi() {
      return this != IIIlIillilIIlIilli;
   }

   private illiiilIiliiil(
      String renderCorrect,
      float wrongStateTint,
      float missingTint,
      float wrongBlockTint,
      float param7,
      float minOutlineOpacity,
      float interiorFadeRadius,
      boolean nullx,
      float label
   ) {
      this.iIIlIilliIlIlIilli = renderCorrect;
      this.llIlIilliilIlIilli = wrongStateTint;
      this.IiIlIilliliIlIilli = missingTint;
      this.iiIlIilliIIllIilli = wrongBlockTint;
      this.lIllIilliiIllIilli = var7;
      this.IlllIillillllIilli = minOutlineOpacity;
      this.illlIilliIillIilli = interiorFadeRadius;
      this.lillIilliiillIilli = nullx;
      this.IIilIillilIilIilli = label;
   }

   public static String[] IilliliilIIi() {
      long var3 = 974320878450980029L;
      illiiilIiliiil[] var0 = values();
      String[] var1 = new String[var0.length];

      for (long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < var0.length; var5 += 4294967296L) {
         var1[(int)(var5 >>> 32)] = var0[(int)(var5 >>> 32)].iIIlIilliIlIlIilli;
      }

      return var1;
   }

   public static illiiilIiliiil iIlIlllllill(String label) {
      long var5 = 5958805040073739050L;
      illiiilIiliiil[] var1 = values();
      var5 ^= ((long)var1.length << 32 ^ var5) & -1L << 32;

      for (long var8 = var5 ^ (0L ^ var5) & -1L >>> 32; (int)var8 < (int)(var8 >>> 32); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
         illiiilIiliiil var4 = var1[(int)var8];
         if (var4.iIIlIilliIlIlIilli.equals(label)) {
            return var4;
         }
      }

      return lIiIIilliiIiIIilli;
   }
}
