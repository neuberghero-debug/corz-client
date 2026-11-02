package gg.corz;

import net.minecraft.class_332;

public final class iliiIiIiIiiiIiIi {
   private double llIiiIiIIi = Double.NaN;
   private long ilIiiIiIIi = 0L;

   public void liiiIIllIl(float x) {
      this.llIiiIiIIi = (double)x;
   }

   public void IliIlllilIi() {
      this.ilIiiIiIIi = System.currentTimeMillis();
   }

   public void iIlIlllllill(class_332 x, float y, int accent, int h, int ctx, double dt) {
      long var13 = 1140562804329291359L;
      if (Double.isNaN(this.llIiiIiIIi)) {
         this.llIiiIiIIi = (double)y;
      }

      this.llIiiIiIIi = IiiIIIIlliiIIIIl.iIlIlllllill(this.llIiiIiIIi, (double)y, 32.0, dt);
      long var8 = System.currentTimeMillis() - this.ilIiiIiIIi;
      float var10;
      if (var8 < 420L) {
         var10 = 1.0F;
      } else {
         double var11 = (double)(var8 - 420L) / 1060.0 * Math.PI * 2.0;
         var10 = (float)(0.3 + 0.7 * (0.5 + 0.5 * Math.cos(var11)));
      }

      var13 ^= ((long)(ctx >>> 24 & 0xFF) << 32 ^ var13) & -1L << 32;
      if ((int)(var13 >>> 32) == 0) {
         var13 ^= (1095216660480L ^ var13) & -1L << 32;
      }

      var13 ^= ((long)((int)((float)((int)(var13 >>> 32)) * var10) << 24 | ctx & 16777215) ^ var13) & -1L >>> 32;
      IIIiiIillIIiiIil.lIiiIiIlilli(x, (int)Math.round(this.llIiiIiIIi), accent, 1, h, 0, (int)var13);
   }
}
