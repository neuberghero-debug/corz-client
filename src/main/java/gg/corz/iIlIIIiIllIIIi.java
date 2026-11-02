package gg.corz;

public final class iIlIIIiIllIIIi {
   private final float[] liiIlIiliiiiIlIili;
   private final float[] iliIlIiliIiiIlIili;
   private final String[] IliIlIililliIlIili;

   public iIlIIIiIllIIIi(String tracking, float s, float scale) {
      int var4 = tracking == null ? 0 : tracking.length();
      this.IliIlIililliIlIili = new String[var4];
      this.iliIlIiliIiiIlIili = new float[var4];
      this.liiIlIiliiiiIlIili = new float[var4];
      float var5 = 0.0F;

      for (int var6 = 0; var6 < var4; var6++) {
         this.IliIlIililliIlIili[var6] = String.valueOf(tracking.charAt(var6));
         this.iliIlIiliIiiIlIili[var6] = var5;
         var5 += llliIlIlilliIlIl.lIliliIlil(this.IliIlIililliIlIili[var6], s) + scale;
      }
   }
}
