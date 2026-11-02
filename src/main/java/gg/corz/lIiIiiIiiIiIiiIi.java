package gg.corz;

import com.corz.client.CorzClient;
import java.awt.Color;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_4587;

public final class lIiIiiIiiIiIiiIi {
   private static final long IlliiiiIIi = 1800000000L;
   private static final float lIliiiiIIi = (float) (Math.PI * 2);
   private long liiiiiiIIi;
   private static final long iIliiiiIIi = 220000000L;
   private liIIiilliiIIiill ilIIIIIlIi;
   private final llliiiiilliiii iliiiiiIIi;
   private static final String IIIiiiiIIi = "Next RTP";
   private static final float ilIiiiiIIi = 10.0F;
   private float IIlIIIIlIi;
   private final llliiiiilliiii iIiiiiiIIi;
   private static final int iIIiiiiIIi = iilIllIiIIiIllIi.IlIlllIlilIl(0, (~(-4280129 ^ 31) - 57) * 45 ^ 192604593);
   private final llliiiiilliiii IliiiiiIIi;
   private static final float llIiiiiIIi = 230.0F;
   private static final String lIIiiiiIIi = "...";
   private final iiIiIliIIliIli lIiiiiiIIi;
   private static final float IIliiiiIIi = 0.22F;
   private static final String IiiliiiIIi = "Anchor Hunter";
   private boolean lIIIIIIlIi;
   private int llIIIIIlIi;
   private final llliiiiilliiii lliiiiiIIi;
   private static final float IiIiiiiIIi = 4.0F;
   private static final float liIiiiiIIi = 6.0F;
   private final iiIIlIIiIIlIlIIi iiliiiiIIi;
   private final iiIiIliIIliIli IIiiiiiIIi;
   private long IIIIIIIlIi;
   private static final String liiliiiIIi = "Anchors";
   private String IiIIIIIlIi;
   private static final String iiiliiiIIi = "Per hour";
   private final llliiiiilliiii IiiiiiiIIi;
   private static final float IlIiiiiIIi = 160.0F;
   private static final float iiIiiiiIIi = 2.5F;
   private IIliiIlllIliiIll liIIIIIlIi;
   private final class_4587 IiliiiiIIi = new class_4587();
   private static final Color llliiiiIIi = new Color(935502960 * 59 * -17 ^ 2004940157, true);
   private boolean iIIIIIIlIi;
   private final iiIIlillIIlIlill liliiiiIIi = new iiIIlillIIlIlill();
   private long iiiiiiiIIi;
   private int IlIIIIIlIi;
   public static final String ililiiiIIi = "anchorhunter";
   private static class_2960 illiiiiIIi;
   private float lIlIIIIlIi;
   private float iIlIIIIlIi;
   private float iiIIIIIlIi;

   private int IlIlllIlilIl(long now) {
      int var10000;
      if (this.ilIIIIIlIi == null) {
         var10000 = llliIlIlilliIlIl.Illlllllilll();
      } else {
         switch (this.ilIIIIIlIi) {
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
      float var4 = this.IIIIIIIlIi == 0L ? 1.0F : llliIlIlilliIlIl.liiiIIllIl((float)(now - this.IIIIIIIlIi) / 2.2E8F);
      if (var4 >= 1.0F) {
         this.IIIIIIIlIi = 0L;
      }

      this.llIIIIIlIi = var4 >= 1.0F ? var3 : IilIIIIililIIIIi.Illlllllilll(this.IlIIIIIlIi, var3, (double)llliIlIlilliIlIl.iIlIlllllill(var4));
      return this.llIIIIIlIi;
   }

   private void iIlIlllllill(IlillIIillillIIi anchors, int warn, int nextRtp, String perHour, String now, long s) {
      boolean var8 = !this.lIIIIIIlIi;
      String var9 = anchors.iIlIlllllill();
      this.IiIIIIIlIi = var9 == null ? "" : var9;
      String var10 = now == null ? "" : now;
      if (this.iIiiiiiIIi.IliIlllilIi((long)var10.hashCode())) {
         this.iIiiiiiIIi.liiiIIllIl(var10, 0.8F, true, false);
         boolean var11 = !var10.isEmpty();
         if (var11 && !this.iIIIIIIlIi) {
            this.iiliiiiIIi.IliIlllilIi();
         }

         this.iIIIIIIlIi = var11;
      }

      if (anchors.liiiIIllIl() != this.ilIIIIIlIi) {
         boolean var12 = this.ilIIIIIlIi == null || this.lIIIIIIlIi;
         this.IlIIIIIlIi = this.llIIIIIlIi;
         this.ilIIIIIlIi = anchors.liiiIIllIl();
         this.IIIIIIIlIi = var12 ? 0L : s;
      }

      if (this.lliiiiiIIi.IliIlllilIi((long)warn)) {
         this.lliiiiiIIi.liiiIIllIl(String.valueOf(Math.max(0, warn)), 0.9F, true, var8);
      }

      if (this.iliiiiiIIi.IliIlllilIi((long)nextRtp)) {
         this.iliiiiiIIi.liiiIIllIl(String.valueOf(Math.max(0, nextRtp)), 0.9F, true, var8);
      }

      String var13 = perHour == null ? Iilllilliill<"Iilllilliill","PaUPlylUNY3D+NyTLMI8ELtQZJal3tBCxQHl7PA=">() : perHour;
      if (this.IiiiiiiIIi.IliIlllilIi((long)var13.hashCode())) {
         this.IiiiiiiIIi.liiiIIllIl(var13, 0.9F, true, var8);
      }
   }

   public lIiIiiIiiIiIiiIi() {
      this.iiliiiiIIi = new iiIIlIIiIIlIlIIi();
      this.IIiiiiiIIi = new iiIiIliIIliIli();
      this.lIiiiiiIIi = new iiIiIliIIliIli();
      this.iIiiiiiIIi = new llliiiiilliiii();
      this.IliiiiiIIi = new llliiiiilliiii();
      this.lliiiiiIIi = new llliiiiilliiii();
      this.iliiiiiIIi = new llliiiiilliiii();
      this.IiiiiiiIIi = new llliiiiilliiii();
      this.lIIIIIIlIi = true;
      this.IiIIIIIlIi = "";
   }

   private static String[] lIiiIiIlilli() {
      ilIllIiIll var0 = llilIllililIll.iliIiiliiiii(iIIiIlIlIiIl.class);
      ilIllIiIll var1 = llilIllililIll.iliIiiliiiii(iiIlIIIiIIllIIIi.class);
      boolean var2 = var0 != null && var0.IliIlllilIi();
      boolean var3 = var1 != null && var1.IliIlllilIi();
      if (var2 && var3) {
         return new String[]{
            Iilllilliill<"Iilllilliill","8uUraaKTF59xB/r9M+pK/WLEoxX4SxUeUWVpPMondWHVkQ==">(),
            Iilllilliill<"Iilllilliill","KqXgPoMGunGRposGVe2Agm7mKN8TcRaT3YjUkRvkVCE=">(),
            Iilllilliill<"Iilllilliill","IW65kAVDewpybspMZ7DB6kJIrXSxyr4w35+dvVNmSDxR">(),
            Iilllilliill<"Iilllilliill","8x79qREX3YFqqWLtqkFFSBAu0343TinDuP+ouCMSTCRUylfs0fR19w==">(),
            Iilllilliill<"Iilllilliill","D8JIAra7zwivVLuyKzIYGcqXFs2LhW4+Us1CdddR11o6DrQ3tH/P">()
         };
      } else if (var2) {
         return new String[]{
            Iilllilliill<"Iilllilliill","8uUraaKTF59xB/r9M+pK/WLEoxX4SxUeUWVpPMondWHVkQ==">(),
            Iilllilliill<"Iilllilliill","KqXgPoMGunGRposGVe2Agm7mKN8TcRaT3YjUkRvkVCE=">(),
            Iilllilliill<"Iilllilliill","IW65kAVDewpybspMZ7DB6kJIrXSxyr4w35+dvVNmSDxR">(),
            Iilllilliill<"Iilllilliill","8x79qREX3YFqqWLtqkFFSBAu0343TinDuP+ouCMSTCRUylfs0fR19w==">()
         };
      } else {
         return var3
            ? new String[]{
               Iilllilliill<"Iilllilliill","8uUraaKTF59xB/r9M+pK/WLEoxX4SxUeUWVpPMondWHVkQ==">(),
               Iilllilliill<"Iilllilliill","KqXgPoMGunGRposGVe2Agm7mKN8TcRaT3YjUkRvkVCE=">(),
               Iilllilliill<"Iilllilliill","IW65kAVDewpybspMZ7DB6kJIrXSxyr4w35+dvVNmSDxR">(),
               Iilllilliill<"Iilllilliill","D8JIAra7zwivVLuyKzIYGcqXFs2LhW4+Us1CdddR11o6DrQ3tH/P">()
            }
            : new String[]{
               Iilllilliill<"Iilllilliill","8uUraaKTF59xB/r9M+pK/WLEoxX4SxUeUWVpPMondWHVkQ==">(),
               Iilllilliill<"Iilllilliill","KqXgPoMGunGRposGVe2Agm7mKN8TcRaT3YjUkRvkVCE=">(),
               Iilllilliill<"Iilllilliill","IW65kAVDewpybspMZ7DB6kJIrXSxyr4w35+dvVNmSDxR">()
            };
      }
   }

   public void liiiIIllIl(class_332 nextRtp, IlillIIillillIIi perHour, int s, int anchors, String ctx, String warn) {
      class_310 var7 = class_310.method_1551();
      if (nextRtp != null && var7.field_1724 != null && perHour != null) {
         CorzClient.fontManager.iIlIlllllill(this.IiliiiiIIi);
         IIIiiIillIIiiIil.IliIlllilIi(this.IiliiiiIIi);
         double var8 = (double)var7.method_22683().method_4495();
         int var10 = var7.method_22683().method_4476(IIililillIililil.iiiIlIIIll(var7), var7.method_1573());
         float var11 = (float)((double)var10 / var8);
         boolean var12 = Math.abs(var11 - 1.0F) > 1.0E-4F;
         int var13 = var12 ? Math.round((float)var7.method_22683().method_4486() / var11) : var7.method_22683().method_4486();
         if (var12) {
            IliiIilliiIi.lIIlllIIliIIlllIIl = (float)var13;
            IliiIilliiIi.IlIlllIIlllIlllIIl = (float)Math.round((float)var7.method_22683().method_4502() / var11);
         }

         try {
            float var14 = IIililillIililil.ilIllIiIll();
            if (var14 < 0.004F) {
               return;
            }

            long var15 = System.nanoTime();
            float var17 = this.iiiiiiiIIi == 0L ? 0.016F : Math.min(0.05F, (float)(var15 - this.iiiiiiiIIi) / 1.0E9F);
            this.iiiiiiiIIi = var15;
            this.iIlIlllllill(perHour, s, anchors, ctx, warn, var15);
            if (this.liliiiiIIi.IilliliilIIi(true, ++this.liiiiiiIIi)) {
               float var18 = IliiIilliiIi.IilliliilIIi(var14);

               try {
                  this.IilliliilIIi(nextRtp, var13, var17, var15);
               } finally {
                  IliiIilliiIi.lIiiIiIlilli(var18);
               }

               this.lIIIIIIlIi = false;
               return;
            }
         } finally {
            if (var12) {
               IliiIilliiIi.lIIlllIIliIIlllIIl = 0.0F;
               IliiIilliiIi.IlIlllIIlllIlllIIl = 0.0F;
            }
         }
      }
   }

   private static String Illlllllilll(String avail, float s) {
      if (avail != null && !avail.isEmpty()) {
         if (llliIlIlilliIlIl.lIliliIlil(avail, 0.9F) <= s) {
            return avail;
         } else {
            int var2 = 0;
            int var3 = avail.length();

            while (var2 < var3) {
               int var4 = var2 + var3 + 1 >>> 1;
               if (llliIlIlilliIlIl.lIliliIlil(avail.substring(0, var4) + Iilllilliill<"Iilllilliill","nKLULw0p/8Z+TJfFN8TZG6bkaUeUm3feZ/WuPviBTg==">(), 0.9F)
                  <= s) {
                  var2 = var4;
               } else {
                  var3 = var4 - 1;
               }
            }

            return avail.substring(0, var2).stripTrailing() + Iilllilliill<"Iilllilliill","nKLULw0p/8Z+TJfFN8TZG6bkaUeUm3feZ/WuPviBTg==">();
         }
      } else {
         return "";
      }
   }

   public void IliIlllilIi() {
      this.liiiiiiIIi += 2L;
      this.lIIIIIIlIi = true;
      this.iiiiiiiIIi = 0L;
      this.IIIIIIIlIi = 0L;
      this.iIIIIIIlIi = false;
      this.ilIIIIIlIi = null;
      this.IIiiiiiIIi.iIlIlllllill();
      this.lIiiiiiIIi.iIlIlllllill();
   }

   private void IIIllIIliIIl(float y, float x, int now, long argb) {
      float var6 = llliIlIlilliIlIl.IIIllIIliIIl(y);
      float var7 = llliIlIlilliIlIl.IIIllIIliIIl(x);
      float var8 = 0.5F + 0.5F * (float)Math.cos((double)((float)(argb % 1800000000L) * 3.4906587E-9F));
      llliIlIlilliIlIl.Ililllililil(var6, var7, 4.0F, 4.0F, 2.0F, llliIlIlilliIlIl.iliIiiliiiii(now, 0.22F * (0.35F + 0.65F * var8)), 2.5F, true);
      llliIlIlilliIlIl.IIillIiliIil(var6, var7, 4.0F, 4.0F, 2.0F, 0.0F, now);
   }

   private void IilliliilIIi(class_332 sw, int now, float ctx, long dt) {
      IIliiIlllIliiIll var6 = llliIlIlilliIlIl.IliIlllilIi();
      if (var6 != this.liIIIIIlIi) {
         this.liIIIIIlIi = var6;
         this.iiIIIIIlIi = llliIlIlilliIlIl.lIliliIlil(Iilllilliill<"Iilllilliill","zl2EK5B+vKF8O2SFebzY530EbfshQu+HAhe9dXkHaWgp5jOjBqXUJEU=">(), 0.95F);
         this.IIlIIIIlIi = llliIlIlilliIlIl.lIliliIlil(Iilllilliill<"Iilllilliill","HplwbE8yNVUlwS8WPjiDnu4C6Rj20HUVR93JxIdTej6Fpd0=">(), 0.78F);
         this.lIlIIIIlIi = llliIlIlilliIlIl.lIliliIlil(Iilllilliill<"Iilllilliill","HBJpWkAd7rzP8zTjqIW4d5vbxww3qJ5NiLCjJJVK7cevUaso">(), 0.78F);
         this.iIlIIIIlIi = llliIlIlilliIlIl.lIliliIlil(Iilllilliill<"Iilllilliill","UBVBMQEIhul4r/h3xBP03i2iRX7TAl7/uyhOVhbXal8XRpnC">(), 0.78F);
      }

      if (this.IliiiiiIIi.IliIlllilIi((long)this.IiIIIIIlIi.hashCode() * 31L + (long)System.identityHashCode(var6))) {
         float var7 = 206.0F;
         this.IliiiiiIIi.liiiIIllIl(Illlllllilll(IiiIliiliiIlii.liiiIIllIl(this.IiIIIIIlIi), var7), 0.9F, false, !this.lIIIIIIlIi);
      }

      float var32 = 7.0F;
      float var8 = 4.0F;
      float var9 = 15.0F;
      float var10 = var32
         + this.IIlIIIIlIi
         + var8
         + this.lliiiiiIIi.iliillIlIl
         + 10.0F
         + this.lIlIIIIlIi
         + var8
         + this.iliiiiiIIi.iliillIlIl
         + 10.0F
         + this.iIlIIIIlIi
         + var8
         + this.IiiiiiiIIi.iliillIlIl
         + var32;
      float var11 = Math.max(
         llliIlIlilliIlIl.lIlIliIlIl(this.iiIIIIIlIi, this.iIiiiiiIIi.iliillIlIl), Math.max(var32 + 4.0F + 6.0F + this.IliiiiiIIi.IliillIlIl + var32, var10)
      );
      float var12 = this.IIiiiiiIIi.IilliliilIIi(Math.max(160.0F, Math.min(230.0F, (float)Math.ceil((double)var11))), ctx, 0.08F);
      float var13 = llliIlIlilliIlIl.IlIlllIlilIl(30.0F + 2.0F * var9 + 5.0F);
      float var14 = ((float)now - var12) / 2.0F;
      float var15 = this.lIiiiiiIIi.IliIlllilIi(IIililillIililil.liIIlliiIIll(var14, IiIlliIliiIl(), var12, var13, lIiiIiIlilli()), ctx, 0.08F);
      float var16 = IIililillIililil.IiiiIlliiiIl(Iilllilliill<"Iilllilliill","R+EMSo+WVaISR3FLTd/UiZY+QcmHwL0lwwuPdkSDiMpCfJf4uDJBRQ==">());
      float var17 = IIililillIililil.iiiiIlIIIIll(Iilllilliill<"Iilllilliill","R+EMSo+WVaISR3FLTd/UiZY+QcmHwL0lwwuPdkSDiMpCfJf4uDJBRQ==">());
      iiIliiiIIlliii var18 = IIililillIililil.ilIIllIiIIll(
         Iilllilliill<"Iilllilliill","R+EMSo+WVaISR3FLTd/UiZY+QcmHwL0lwwuPdkSDiMpCfJf4uDJBRQ==">(), var14 + var16, var15 + var17, var12, var13
      );
      float var19 = llliIlIlilliIlIl.IIIllIIliIIl(var14 + var16);
      float var20 = llliIlIlilliIlIl.IIIllIIliIIl(var15 + var17);
      if (var18 != null) {
         var18.IilliliilIIi(this.IiliiiiIIi);
      }

      float var21 = IliiIilliiIi.IilliliilIIi(this.liliiiiIIi.IliIlllilIi());
      boolean var22 = llliIlIlilliIlIl.lIIIiiIIIi(sw, var19 + var12 / 2.0F, var20 + var13 / 2.0F, this.liliiiiIIi.liiiIIllIl());

      try {
         llliIlIlilliIlIl.Iiilliiliiil(iIIiiiiIIi, var19, var20, var12, var13, 1.0F);
         float var23 = llliIlIlilliIlIl.IllIllllIl(
            sw,
            var19,
            var20,
            var12,
            IIlllIlliIll(),
            Iilllilliill<"Iilllilliill","zl2EK5B+vKF8O2SFebzY530EbfshQu+HAhe9dXkHaWgp5jOjBqXUJEU=">(),
            this.iIiiiiiIIi,
            this.iiliiiiIIi,
            1.0F
         );
         float var24 = var19 + var32;
         this.IIIllIIliIIl(var24, var23 + llliIlIlilliIlIl.IIIllIIliIIl((var9 - 4.0F) / 2.0F), this.IlIlllIlilIl(dt), dt);
         llliIlIlilliIlIl.lliililiil(
            this.IliiiiiIIi,
            var24 + 4.0F + 6.0F,
            llliIlIlilliIlIl.illilIilil(var23, var9, 0.9F),
            0.9F,
            this.ilIIIIIlIi == liIIiilliiIIiill.iIlIiliill ? llliiiiIIi : llliIlIlilliIlIl.liIlIlIiIl
         );
         float var25 = var23 + var9;
         float var26 = llliIlIlilliIlIl.illilIilil(var25, var9, 0.78F);
         float var27 = llliIlIlilliIlIl.illilIilil(var25, var9, 0.9F);
         float var28 = iliIiiliiiii(
               Iilllilliill<"Iilllilliill","HplwbE8yNVUlwS8WPjiDnu4C6Rj20HUVR93JxIdTej6Fpd0=">(), this.IIlIIIIlIi, this.lliiiiiIIi, var24, var26, var27
            )
            + 10.0F;
         var28 = iliIiiliiiii(
               Iilllilliill<"Iilllilliill","HBJpWkAd7rzP8zTjqIW4d5vbxww3qJ5NiLCjJJVK7cevUaso">(), this.lIlIIIIlIi, this.iliiiiiIIi, var28, var26, var27
            )
            + 10.0F;
         iliIiiliiiii(Iilllilliill<"Iilllilliill","UBVBMQEIhul4r/h3xBP03i2iRX7TAl7/uyhOVhbXal8XRpnC">(), this.iIlIIIIlIi, this.IiiiiiiIIi, var28, var26, var27);
      } finally {
         llliIlIlilliIlIl.IlIIillIIi(sw, var22);
         IliiIilliiIi.lIiiIiIlilli(var21);
         if (var18 != null) {
            this.IiliiiiIIi.method_22909();
         }
      }
   }

   private static class_2960 IIlllIlliIll() {
      if (illiiiiIIi == null) {
         illiiiiIIi = lIlIIiliIlIIil.illIlIilIl(Iilllilliill<"Iilllilliill","lSihDz+0waapZWZ+YJ15w6n7UmeZlne0lKGR5FMXZajLYufmYw==">());
      }

      return illiiiiIIi;
   }

   private static float IiIlliIliiIl() {
      long var3 = -8883465562226459890L;
      var3 ^= ((long)IiIiIIliliIiIIli.iIlllIllll() << 32 ^ var3) & -1L << 32;
      float var1 = (int)(var3 >>> 32) > 0 ? (float)((int)(var3 >>> 32)) + 5.0F : 6.0F;
      ilIllIiIll var2 = llilIllililIll.iliIiiliiiii(IIililillIililil.class);
      if (var2 != null && var2.IliIlllilIi() && IiIlIiIiliIlIiIi.Illlllllilll().iIlIlllllill()) {
         var1 += 26.0F * IIililillIililil.iIlIllIllIll(Iilllilliill<"Iilllilliill","O0ocq4h67ielp2pgE2Npd+JWbPVw5JpyylpWRfp5IsjKMJutTW9SjDc=">()) + 6.0F;
      }

      return var1;
   }

   private static float iliIiiliiiii(String ly, float v, llliiiiilliiii label, float x, float vy, float labelW) {
      llliIlIlilliIlIl.lililiilil(ly, x, vy, 0.78F, llliIlIlilliIlIl.iiIlIlIiIl);
      float var6 = x + v + 4.0F + label.iliillIlIl;
      llliIlIlilliIlIl.iIiilIliil(label, var6, labelW, 0.9F, llliIlIlilliIlIl.liIlIlIiIl);
      return var6;
   }
}
