package gg.corz;

import com.corz.client.CorzClient;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_4587;

public final class IIIiiiillIIiiiil {
   private final llliiiiilliiii lIliilIiil;
   private static final float IIIiilIiil = (float) (Math.PI * 2);
   private long liliilIiil;
   private static final float liililIiil = 2.5F;
   private liIIiilliiIIiill lliiilIiil;
   private long IiliilIiil;
   private IIliiIlllIliiIll IiiiilIiil;
   private final iiIiIliIIliIli IIliilIiil;
   private long iiliilIiil;
   private static class_2960 llIiilIiil;
   private final iiIiIliIIliIli iiIiilIiil;
   private boolean IIiiilIiil;
   private static final float llililIiil = 10.0F;
   private final llliiiiilliiii illiilIiil;
   public static final String llllilIiil = "bloodhound";
   private static final float iIililIiil = 168.0F;
   private static final float IlililIiil = 236.0F;
   private static final long iIIiilIiil = 1800000000L;
   private static final float ilililIiil = 4.0F;
   private int iIiiilIiil;
   private static final float IiililIiil = 6.0F;
   private static final String iillilIiil = "Chunks";
   private int IliiilIiil;
   private float liiiilIiil;
   private static final long lIIiilIiil = 220000000L;
   private static final String[] IlIiilIiil;
   private static final String lillilIiil = "Best";
   private final iiIIlillIIlIlill IiIiilIiil;
   private static final String IillilIiil = "Bases";
   private final class_4587 ilIiilIiil = new class_4587();
   private static final int lIililIiil = iilIllIiIIiIllIi.IlIlllIlilIl(0, 316291561 * -55 * -723362913 ^ 1173189248);
   private float iiiiilIiil;
   private boolean lIiiilIiil;
   private float lIIIIiIiil;
   private float IIIIIiIiil;
   private static final String IIililIiil = "...";
   private static final String illlilIiil = "Bloodhound";
   private final llliiiiilliiii iIliilIiil;
   private String iliiilIiil;
   private final iiIIlIIiIIlIlIIi liIiilIiil;
   private static final float iiililIiil = 0.22F;
   private final llliiiiilliiii llliilIiil;
   private final llliiiiilliiii IlliilIiil;

   private static class_2960 IiIlliIliiIl() {
      if (llIiilIiil == null) {
         llIiilIiil = lIlIIiliIlIIil.illIlIilIl(Illlllllilll<"Illlllllilll","QWMqr95SKHn+2OHGAEeIDRjghsrT+ndudMdZ/VO6POiHbw==">());
      }

      return llIiilIiil;
   }

   private int IIIllIIliIIl(long now) {
      int var10000;
      if (this.lliiilIiil == null) {
         var10000 = llliIlIlilliIlIl.Illlllllilll();
      } else {
         switch (this.lliiilIiil) {
            case IIlIiliill:
               var10000 = -8393375;
               break;
            case lIlIiliill:
               var10000 = -1535700;
               break;
            case iIlIiliill:
               var10000 = -1750963;
               break;
            default:
               var10000 = llliIlIlilliIlIl.Illlllllilll();
         }
      }

      int var3 = var10000;
      float var4 = this.iiliilIiil == 0L ? 1.0F : llliIlIlilliIlIl.liiiIIllIl((float)(now - this.iiliilIiil) / 2.2E8F);
      if (var4 >= 1.0F) {
         this.iiliilIiil = 0L;
      }

      this.IliiilIiil = var4 >= 1.0F ? var3 : IilIIIIililIIIIi.Illlllllilll(this.iIiiilIiil, var3, (double)llliIlIlilliIlIl.iIlIlllllill(var4));
      return this.IliiilIiil;
   }

   private static float IlIlllIlilIl() {
      long var3 = 5453939424705197172L;
      var3 ^= ((long)IiIiIIliliIiIIli.iIlllIllll() << 32 ^ var3) & -1L << 32;
      float var1 = (int)(var3 >>> 32) > 0 ? (float)((int)(var3 >>> 32)) + 5.0F : 6.0F;
      ilIllIiIll var2 = llilIllililIll.iliIiiliiiii(IIililillIililil.class);
      if (var2 != null && var2.IliIlllilIi() && IiIlIiIiliIlIiIi.Illlllllilll().iIlIlllllill()) {
         var1 += 26.0F * IIililillIililil.iIlIllIllIll(Illlllllilll<"Illlllllilll","IhmrZkqB2OzsW80lhGDrkmPscYWE3MSxkrqZWHdcwri3y0KH/Ul7gfg=">()) + 6.0F;
      }

      return var1;
   }

   private void iIlIlllllill(liIIiilliiIIiill now, String warn, int best, int status, int t, String chunks, long bases) {
      boolean var9 = !this.IIiiilIiil;
      this.iliiilIiil = warn == null ? "" : warn;
      String var10 = chunks == null ? "" : chunks;
      if (this.lIliilIiil.IliIlllilIi((long)var10.hashCode())) {
         this.lIliilIiil.liiiIIllIl(var10, 0.8F, true, false);
         boolean var11 = !var10.isEmpty();
         if (var11 && !this.lIiiilIiil) {
            this.liIiilIiil.IliIlllilIi();
         }

         this.lIiiilIiil = var11;
      }

      if (now != this.lliiilIiil) {
         boolean var12 = this.lliiilIiil == null || this.IIiiilIiil;
         this.iIiiilIiil = this.IliiilIiil;
         this.lliiilIiil = now;
         this.iiliilIiil = var12 ? 0L : bases;
      }

      if (this.IlliilIiil.IliIlllilIi((long)best)) {
         this.IlliilIiil.liiiIIllIl(String.valueOf(Math.max(0, best)), 0.9F, true, var9);
      }

      if (this.llliilIiil.IliIlllilIi((long)Math.max(0, status))) {
         this.llliilIiil
            .liiiIIllIl(
               status <= 0
                  ? Illlllllilll<"Illlllllilll","eBfU7tkyVV+npG8RTz5yOkE8oe5SO0VMneeKbUE=">()
                  : status + Illlllllilll<"Illlllllilll","LVqS9b/dJv/GGcOdyXuWol1PWR3vPLGa6uoGLp8=">(),
               0.9F,
               true,
               var9
            );
      }

      if (this.illiilIiil.IliIlllilIi((long)t)) {
         this.illiilIiil.liiiIIllIl(String.valueOf(Math.max(0, t)), 0.9F, true, var9);
      }
   }

   private void IilliliilIIi(class_332 now, int ctx, float dt, long sw) {
      IIliiIlllIliiIll var6 = llliIlIlilliIlIl.IliIlllilIi();
      if (var6 != this.IiiiilIiil) {
         this.IiiiilIiil = var6;
         this.lIIIIiIiil = llliIlIlilliIlIl.lIliliIlil(Illlllllilll<"Illlllllilll","wbBdiRdHRFVVaFWlX16JJwuZ32TzCTBGwXT5mU1QCSR+cQwDAhs=">(), 0.95F);
         this.liiiilIiil = llliIlIlilliIlIl.lIliliIlil(Illlllllilll<"Illlllllilll","1oH9ouIS+P2Uen0kC55oX5Y25NsqI6gx+ivrUIBCG2wm">(), 0.78F);
         this.iiiiilIiil = llliIlIlilliIlIl.lIliliIlil(Illlllllilll<"Illlllllilll","H6m+HsBhY2wjWq/bj942RIzwqEL31cPRa5uITwWCBKw=">(), 0.78F);
         this.IIIIIiIiil = llliIlIlilliIlIl.lIliliIlil(Illlllllilll<"Illlllllilll","48PEkVjEP9urUSJI7+39K/q/Hoq1FAh1LbELYfp59PaRsg==">(), 0.78F);
         this.IlliilIiil.liiiIIllIl(this.IlliilIiil.lIiillIlIl, 0.9F, true, false);
         this.llliilIiil.liiiIIllIl(this.llliilIiil.lIiillIlIl, 0.9F, true, false);
         this.illiilIiil.liiiIIllIl(this.illiilIiil.lIiillIlIl, 0.9F, true, false);
      }

      if (this.iIliilIiil.IliIlllilIi((long)this.iliiilIiil.hashCode() * 31L + (long)System.identityHashCode(var6))) {
         float var7 = 212.0F;
         this.iIliilIiil.liiiIIllIl(IIlllIlliIll(IiiIliiliiIlii.liiiIIllIl(this.iliiilIiil), var7), 0.9F, false, !this.IIiiilIiil);
      }

      float var32 = 7.0F;
      float var8 = 4.0F;
      float var9 = 15.0F;
      float var10 = var32
         + this.liiiilIiil
         + var8
         + this.IlliilIiil.iliillIlIl
         + 10.0F
         + this.iiiiilIiil
         + var8
         + this.llliilIiil.iliillIlIl
         + 10.0F
         + this.IIIIIiIiil
         + var8
         + this.illiilIiil.iliillIlIl
         + var32;
      float var11 = Math.max(
         llliIlIlilliIlIl.lIlIliIlIl(this.lIIIIiIiil, this.lIliilIiil.iliillIlIl), Math.max(var32 + 4.0F + 6.0F + this.iIliilIiil.IliillIlIl + var32, var10)
      );
      float var12 = this.iiIiilIiil.IilliliilIIi(Math.max(168.0F, Math.min(236.0F, (float)Math.ceil((double)var11))), dt, 0.08F);
      float var13 = llliIlIlilliIlIl.IlIlllIlilIl(30.0F + 2.0F * var9 + 5.0F);
      float var14 = ((float)ctx - var12) / 2.0F;
      float var15 = this.IIliilIiil.IliIlllilIi(IIililillIililil.liIIlliiIIll(var14, IlIlllIlilIl(), var12, var13, IlIiilIiil), dt, 0.08F);
      float var16 = IIililillIililil.IiiiIlliiiIl(Illlllllilll<"Illlllllilll","EOlLlfVIKU7Sw/RiQjthOZnXvQqOvr8uRiWNLBZba/0+kV9nWVg=">());
      float var17 = IIililillIililil.iiiiIlIIIIll(Illlllllilll<"Illlllllilll","EOlLlfVIKU7Sw/RiQjthOZnXvQqOvr8uRiWNLBZba/0+kV9nWVg=">());
      iiIliiiIIlliii var18 = IIililillIililil.ilIIllIiIIll(
         Illlllllilll<"Illlllllilll","EOlLlfVIKU7Sw/RiQjthOZnXvQqOvr8uRiWNLBZba/0+kV9nWVg=">(), var14 + var16, var15 + var17, var12, var13
      );
      float var19 = llliIlIlilliIlIl.IIIllIIliIIl(var14 + var16);
      float var20 = llliIlIlilliIlIl.IIIllIIliIIl(var15 + var17);
      if (var18 != null) {
         var18.IilliliilIIi(this.ilIiilIiil);
      }

      float var21 = IliiIilliiIi.IilliliilIIi(this.IiIiilIiil.IliIlllilIi());
      boolean var22 = llliIlIlilliIlIl.lIIIiiIIIi(now, var19 + var12 / 2.0F, var20 + var13 / 2.0F, this.IiIiilIiil.liiiIIllIl());

      try {
         llliIlIlilliIlIl.Iiilliiliiil(lIililIiil, var19, var20, var12, var13, 1.0F);
         float var23 = llliIlIlilliIlIl.IllIllllIl(
            now,
            var19,
            var20,
            var12,
            IiIlliIliiIl(),
            Illlllllilll<"Illlllllilll","wbBdiRdHRFVVaFWlX16JJwuZ32TzCTBGwXT5mU1QCSR+cQwDAhs=">(),
            this.lIliilIiil,
            this.liIiilIiil,
            1.0F
         );
         float var24 = var19 + var32;
         this.iliIiiliiiii(var24, var23 + llliIlIlilliIlIl.IIIllIIliIIl((var9 - 4.0F) / 2.0F), this.IIIllIIliIIl(sw), sw);
         llliIlIlilliIlIl.lliililiil(this.iIliilIiil, var24 + 4.0F + 6.0F, llliIlIlilliIlIl.illilIilil(var23, var9, 0.9F), 0.9F, llliIlIlilliIlIl.liIlIlIiIl);
         float var25 = var23 + var9;
         float var26 = llliIlIlilliIlIl.illilIilil(var25, var9, 0.78F);
         float var27 = llliIlIlilliIlIl.illilIilil(var25, var9, 0.9F);
         float var28 = lIiiIiIlilli(
               Illlllllilll<"Illlllllilll","1oH9ouIS+P2Uen0kC55oX5Y25NsqI6gx+ivrUIBCG2wm">(), this.liiiilIiil, this.IlliilIiil, var24, var26, var27
            )
            + 10.0F;
         var28 = lIiiIiIlilli(
               Illlllllilll<"Illlllllilll","H6m+HsBhY2wjWq/bj942RIzwqEL31cPRa5uITwWCBKw=">(), this.iiiiilIiil, this.llliilIiil, var28, var26, var27
            )
            + 10.0F;
         lIiiIiIlilli(Illlllllilll<"Illlllllilll","48PEkVjEP9urUSJI7+39K/q/Hoq1FAh1LbELYfp59PaRsg==">(), this.IIIIIiIiil, this.illiilIiil, var28, var26, var27);
      } finally {
         llliIlIlilliIlIl.IlIIillIIi(now, var22);
         IliiIilliiIi.lIiiIiIlilli(var21);
         if (var18 != null) {
            this.ilIiilIiil.method_22909();
         }
      }
   }

   public void IliIlllilIi() {
      this.IiliilIiil += 2L;
      this.IIiiilIiil = true;
      this.liliilIiil = 0L;
      this.iiliilIiil = 0L;
      this.lIiiilIiil = false;
      this.lliiilIiil = null;
      this.iiIiilIiil.iIlIlllllill();
      this.IIliilIiil.iIlIlllllill();
   }

   private static String IIlllIlliIll(String s, float avail) {
      if (s != null && !s.isEmpty()) {
         if (llliIlIlilliIlIl.lIliliIlil(s, 0.9F) <= avail) {
            return s;
         } else {
            int var2 = 0;
            int var3 = s.length();

            while (var2 < var3) {
               int var4 = var2 + var3 + 1 >>> 1;
               if (llliIlIlilliIlIl.lIliliIlil(s.substring(0, var4) + Illlllllilll<"Illlllllilll","tIiTMqcZjmVEDmefdIJ6uRdIF2+/uep3aGtgHDla/w==">(), 0.9F)
                  <= avail) {
                  var2 = var4;
               } else {
                  var3 = var4 - 1;
               }
            }

            return s.substring(0, var2).stripTrailing() + Illlllllilll<"Illlllllilll","tIiTMqcZjmVEDmefdIJ6uRdIF2+/uep3aGtgHDla/w==">();
         }
      } else {
         return "";
      }
   }

   static {
      String[] var10000 = new String[((1707144509 << 3 | 1707144509 >>> 29) * -67 >>> 15 | (1707144509 << 3 | 1707144509 >>> 29) * -67 << 17) ^ 251652091];
      var10000[0] = Illlllllilll<"Illlllllilll","1Nb+p+BTyx4D9dWeEEnDBL1ZkENLc3jc5Zw1Jh4f9brDLg==">();
      var10000[1] = Illlllllilll<"Illlllllilll","xNcOqyQ4fh078DOrOdFBkWQy9nGO+JgoDXktW8AjbI8=">();
      var10000[2] = Illlllllilll<"Illlllllilll","yUdN1B/inwSq4T8G4oNmQ3a5if0k/FspyA7wwjnuoMqA">();
      var10000[3] = Illlllllilll<"Illlllllilll","T8zjTTNgHsBTv3XRNGtKLbuFhFe7p5tgAWa5HYUYMPgZX0nPCUaZ">();
      var10000[4] = Illlllllilll<"Illlllllilll","9pHVuY9NJ/2OtLGFCIe7wRA0C7hdCszYz3MbqV7eL7maCIF/O4cEzw==">();
      var10000[5] = Illlllllilll<"Illlllllilll","L9R6nxL4bUlbJwdq0ooJhef/l4tj1VC6gOYdiQ10ac6j4v/hRvQpsQ==">();
      IlIiilIiil = var10000;
   }

   private void iliIiiliiiii(float y, float argb, int x, long now) {
      float var6 = llliIlIlilliIlIl.IIIllIIliIIl(y);
      float var7 = llliIlIlilliIlIl.IIIllIIliIIl(argb);
      float var8 = 0.5F + 0.5F * (float)Math.cos((double)((float)(now % 1800000000L) * 3.4906587E-9F));
      llliIlIlilliIlIl.Ililllililil(var6, var7, 4.0F, 4.0F, 2.0F, llliIlIlilliIlIl.iliIiiliiiii(x, 0.22F * (0.35F + 0.65F * var8)), 2.5F, true);
      llliIlIlilliIlIl.IIillIiliIil(var6, var7, 4.0F, 4.0F, 2.0F, 0.0F, x);
   }

   public void liiiIIllIl(class_332 status, liIIiilliiIIiill bases, String best, int chunks, int warn, int t, String ctx) {
      class_310 var8 = class_310.method_1551();
      if (status != null && var8.field_1724 != null) {
         CorzClient.fontManager.iIlIlllllill(this.ilIiilIiil);
         IIIiiIillIIiiIil.IliIlllilIi(this.ilIiilIiil);
         double var9 = (double)var8.method_22683().method_4495();
         int var11 = var8.method_22683().method_4476(IIililillIililil.iiiIlIIIll(var8), var8.method_1573());
         float var12 = (float)((double)var11 / var9);
         boolean var13 = Math.abs(var12 - 1.0F) > 1.0E-4F;
         int var14 = var13 ? Math.round((float)var8.method_22683().method_4486() / var12) : var8.method_22683().method_4486();
         if (var13) {
            IliiIilliiIi.lIIlllIIliIIlllIIl = (float)var14;
            IliiIilliiIi.IlIlllIIlllIlllIIl = (float)Math.round((float)var8.method_22683().method_4502() / var12);
         }

         try {
            float var15 = IIililillIililil.ilIllIiIll();
            if (var15 < 0.004F) {
               return;
            }

            long var16 = System.nanoTime();
            float var18 = this.liliilIiil == 0L ? 0.016F : Math.min(0.05F, (float)(var16 - this.liliilIiil) / 1.0E9F);
            this.liliilIiil = var16;
            this.iIlIlllllill(bases, best, chunks, warn, t, ctx, var16);
            if (this.IiIiilIiil.IilliliilIIi(true, ++this.IiliilIiil)) {
               float var19 = IliiIilliiIi.IilliliilIIi(var15);

               try {
                  this.IilliliilIIi(status, var14, var18, var16);
               } finally {
                  IliiIilliiIi.lIiiIiIlilli(var19);
               }

               this.IIiiilIiil = false;
               return;
            }
         } finally {
            if (var13) {
               IliiIilliiIi.lIIlllIIliIIlllIIl = 0.0F;
               IliiIilliiIi.IlIlllIIlllIlllIIl = 0.0F;
            }
         }
      }
   }

   private static float lIiiIiIlilli(String labelW, float ly, llliiiiilliiii label, float x, float v, float vy) {
      llliIlIlilliIlIl.lililiilil(labelW, x, v, 0.78F, llliIlIlilliIlIl.iiIlIlIiIl);
      float var6 = x + ly + 4.0F + label.iliillIlIl;
      llliIlIlilliIlIl.iIiilIliil(label, var6, vy, 0.9F, llliIlIlilliIlIl.liIlIlIiIl);
      return var6;
   }

   public IIIiiiillIIiiiil() {
      this.IiIiilIiil = new iiIIlillIIlIlill();
      this.liIiilIiil = new iiIIlIIiIIlIlIIi();
      this.iiIiilIiil = new iiIiIliIIliIli();
      this.IIliilIiil = new iiIiIliIIliIli();
      this.lIliilIiil = new llliiiiilliiii();
      this.iIliilIiil = new llliiiiilliiii();
      this.IlliilIiil = new llliiiiilliiii();
      this.llliilIiil = new llliiiiilliiii();
      this.illiilIiil = new llliiiiilliiii();
      this.IIiiilIiil = true;
      this.iliiilIiil = "";
   }
}
