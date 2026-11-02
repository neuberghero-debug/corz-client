package gg.corz;

import com.mojang.blaze3d.systems.RenderSystem;

public class lllIIlIlillIIlIl extends ilIllIiIll {
   private double IlIiIiilIl;
   static final double IlilIiilIl = 0.97;
   private static boolean ililIiilIl;
   private final iilliIlIIiliIl iiilIiilIl;
   private final iilliIlIIiliIl IiilIiilIl = new iilliIlIIiliIl(
      IliIlllilIi<"IliIlllilIi","ZLWEBoHPbG42Q3PkeCkfwFjPV2AHEKK3murTA2I43+Hl5Vhs">(),
      IliIlllilIi<"IliIlllilIi","wYoSHINFPkWGyEdsNQ4N4CImFH1GSh5ypis3EbhhyKtwOHudP/s+G1A=">(),
      30,
      5,
      100,
      5
   ) {
      @Override
      public String IIlilIliiIli() {
         return IliIlllilIi<"IliIlllilIi","lim+Igqt/GKwnAiwWJLJVtZm9Ix5QaC2/iTXfUzblg==">() + lllIIlIlillIIlIl.IIllllIlll(this.Iilllilliill());
      }
   };
   private boolean llIiIiilIl;
   private static lllIIlIlillIIlIl llilIiilIl;
   private final iiIiiilIIliiil IIIiIiilIl;
   private long iIIiIiilIl;
   private final iiIiiilIIliiil liilIiilIl = new iiIiiilIIliiil(
      IliIlllilIi<"IliIlllilIi","cF62ZwERknFnXLYZjltaDFdDxIsBevY3se3sAX49MbF/bxB8ca7A">(),
      IliIlllilIi<"IliIlllilIi","nHRUFTpLyVOX6bkv36c2guGHWJ8u8OkBEThetyBU5OUG8v7WA0i+kG5XtZlCz+m9JNYzGzrCUy7vfkeDi/Jht7Tb">(),
      true
   );
   static final double iIilIiilIl = 12.0;
   private liIllIiiiIllIi lIIiIiilIl;

   @Override
   protected void Iilililiiili() {
      if (RenderSystem.isOnRenderThread()) {
         this.ilIllIiIll();
      } else {
         this.IlIllllIll();
      }
   }

   static double Iillllilll(double amount, double dtSeconds) {
      double var4 = 1.0 - Math.exp(Double.longBitsToDouble(-429094663318228427L ^ 4189346754550215221L) * Math.max(0.0, dtSeconds));
      amount += (1.0 - amount) * var4;
      return amount > Double.longBitsToDouble(-741895660040776982L ^ -3865295618762402367L) ? 1.0 : amount;
   }

   public static void lIIlliIIll() {
      long var2 = -7034535333089824394L;
      var2 ^= ((long)ililIiilIl << 32 ^ var2) & -1L << 32;
      ililIiilIl = false;
      lllIIlIlillIIlIl var1 = llilIiilIl;
      if (var1 != null) {
         if (!var1.IliIlllilIi()) {
            var1.ilIllIiIll();
         } else if ((int)(var2 >>> 32) != 0 && Iiiilllliiilll.field_1687 != null && !IIiIIllIiIIl.IliIlllilIi() && !iIIlIllIlIlIll.IIIllIIliIIl()) {
            var1.liIlliiIll();
         } else {
            var1.IlIllllIll();
         }
      }
   }

   static int iilllIIill(int pinkTrails, boolean accent, int tintPercent) {
      float var3 = accent ? (float)Math.clamp((double)tintPercent / 100.0, 0.0, 1.0) : 0.0F;
      if (var3 <= 0.0F) {
         return -1;
      } else {
         int var4 = (int)(255.0F + (float)((pinkTrails >> 16 & 0xFF) - 255) * var3);
         int var5 = (int)(255.0F + (float)((pinkTrails >> 8 & 0xFF) - 255) * var3);
         int var6 = (int)(255.0F + (float)((pinkTrails & 0xFF) - 255) * var3);
         return 0xFF000000 | var4 << 16 | var5 << 8 | var6;
      }
   }

   static String IIllllIlll(int pct) {
      if (pct <= (-((1965047447 * -45 ^ 55) * 71) ^ -915589978)) {
         return IliIlllilIi<"IliIlllilIi","4vuXJqUX8nJI1h4k22uMKLiTq6XUwQFnDHVBWYftt3PY3A==">();
      } else if (pct <= (~(-1039621600 - 89) * -1643291835 - -127 ^ -83735110)) {
         return IliIlllilIi<"IliIlllilIi","djRYMLgzy3QYxE3BdeqLkn73HAKo3COJ0FHHZlKgX/kepta4">();
      } else if (pct <= (1855077962 + -99 + -111 ^ 1855077694)) {
         return IliIlllilIi<"IliIlllilIi","CL1O52gX/uepH2Eh2s2DScySrouwIbh/cJY3y+4l45hLAA==">();
      } else {
         return pct <= (-(-870555255 ^ 61) ^ 870555158)
            ? IliIlllilIi<"IliIlllilIi","6f5gWjbj0/+MjLTzHHrRE7NT4y/PEFUQo8zOyoOFsCU0">()
            : IliIlllilIi<"IliIlllilIi","b7ntOvAMhMVAf81r3A4J/0vDrlQ89qOVMDB5BfnvHGCats4TKw==">();
      }
   }

   @Override
   protected void Illillliilli() {
      this.llIiIiilIl = false;
      this.IlIllllIll();
   }

   public static void iiiIlIIIll() {
      ililIiilIl = true;
   }

   static double lllllillll(int strengthPercent, boolean dtSeconds, double enableAmount, double fpsCompensated) {
      double var6 = iIlllIllll(strengthPercent);
      if (dtSeconds && enableAmount > Double.longBitsToDouble(-1128352862459872369L ^ -1128352862459872369L)) {
         var6 = Math.pow(var6, enableAmount * Double.longBitsToDouble(5359594634794846421L ^ 733834867531925717L));
      }

      return Math.clamp(var6 * fpsCompensated, 0.0, Double.longBitsToDouble(8278614474079739018L ^ 5551960041475394432L));
   }

   private void liIlliiIll() {
      if (!this.llIiIiilIl) {
         long var1 = System.nanoTime();
         double var3 = this.iIIiIiilIl == 0L ? 0.0 : (double)(var1 - this.iIIiIiilIl) / 1.0E9;
         this.iIIiIiilIl = var1;
         this.IlIiIiilIl = Iillllilll(this.IlIiIiilIl, var3);
         float var5 = (float)lllllillll(this.IiilIiilIl.Iilllilliill(), this.IIIiIiilIl.Iilllilliill(), var3, this.IlIiIiilIl);
         int var6 = iilllIIill(IlIIilIlllIIilIl.lliiIlliIl, this.liilIiilIl.Iilllilliill(), this.iiilIiilIl.Iilllilliill());
         if (this.lIIiIiilIl == null) {
            this.lIIiIiilIl = new liIllIiiiIllIi();
         }

         try {
            this.lIIiIiilIl
               .IliIlllilIi(
                  Iiiilllliiilll.method_1522(), var5, (float)(var6 >> 16 & 0xFF) / 255.0F, (float)(var6 >> 8 & 0xFF) / 255.0F, (float)(var6 & 0xFF) / 255.0F
               );
         } catch (Throwable var8) {
            this.llIiIiilIl = true;
            this.lIIiIiilIl.liiiIIllIl();
         }
      }
   }

   private void IlIllllIll() {
      this.iIIiIiilIl = 0L;
      this.IlIiIiilIl = 0.0;
      if (this.lIIiIiilIl != null) {
         this.lIIiIiilIl.liiiIIllIl();
      }
   }

   public lllIIlIlillIIlIl() {
      super(IliIlllilIi<"IliIlllilIi","e44SKDYDDblkOc8EZhK4odYuYrpCh6dVOb3gUeYGGAjyqWw5KAIx">(), lllIllillIll.llIlIIIiilIlIIIi);
      this.iiilIiilIl = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","6lRcdlMthxSt9E+m7a0Q7q1+ag8NM6IdiC38xhmSLrI=">(),
         IliIlllilIi<"IliIlllilIi","+MAgmQZC5ssAGlA2ViIh34tbYVhdVpcWi3jsplLFJrpPVCzI53umUBgHjiUY4xAa+EYHs5I2HIlgaI01Hb3WdWD1Yo0=">(),
         30,
         0,
         100,
         5
      );
      this.IIIiIiilIl = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","ObLYszB68WQp+KhBmSMlpkWVFshUDK8z/c3u+RqkXLa+PfhjlHaY3YxrdA==">(),
         IliIlllilIi<"IliIlllilIi","0gwalenlPp1uL4SXZx+MIR8U7Q3uEl68QQEh3d1q0LVenZlIYnML5K+nXbLos3M3BajPUMdaxB5h4mpxYDzf04vOH5Eisw==">(),
         true
      );
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IiilIiilIl, this.liilIiilIl, this.iiilIiilIl, this.IIIiIiilIl});
      llilIiilIl = this;
   }

   private void ilIllIiIll() {
      this.IlIllllIll();
      if (this.lIIiIiilIl != null) {
         this.lIIiIiilIl.iliIiiliiiii();
         this.lIIiIiilIl = null;
      }
   }

   static double iIlllIllll(int strengthPercent) {
      return Math.clamp(
         (double)strengthPercent / Double.longBitsToDouble(-1459370109127979366L ^ -6060078603463651686L),
         Double.longBitsToDouble(-5127277163889732154L ^ -8686923560037856164L),
         Double.longBitsToDouble(630691209790730003L ^ 3976340054203156853L)
      );
   }
}
