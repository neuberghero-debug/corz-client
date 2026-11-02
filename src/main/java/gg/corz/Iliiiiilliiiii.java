package gg.corz;

import com.corz.client.CorzClient;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_4587;

public class Iliiiiilliiiii {
   private static final String IIllilIlIl = "Module Disabled";
   private static final String iIllilIlIl = " disabled";
   private static final String llllilIlIl = "Disabled";
   private int lillilIlIl;
   private static final int ilIlilIlIl = 8;
   private static final String IlllilIlIl = "Enabled";
   private static final Iliiiiilliiiii llIlilIlIl = new Iliiiiilliiiii();
   private final List<liiiiiiiiiiiii> illlilIlIl = new ArrayList<>();
   private static final int IiIlilIlIl = 4;
   private static final int liIlilIlIl = 4;
   private static final String iiIlilIlIl = "Module Enabled";
   private final class_4587 IillilIlIl = new class_4587();
   private static final String lIllilIlIl = " enabled";

   public AutoCloseable liiiIIllIl() {
      this.lillilIlIl++;
      return () -> {
         if (this.lillilIlIl > 0) {
            this.lillilIlIl--;
         }
      };
   }

   public void IilliliilIIi(class_332 ctx) {
      long var16 = -3841841052320029291L;
      long var18 = 666732261439923189L;
      long var20 = 598358315787624420L;
      this.illlilIlIl.removeIf(liiiiiiiiiiiii::iliIiiliiiii);
      if (!this.illlilIlIl.isEmpty()) {
         if (!IliiliIllliiliIl.iiiIlIIIll()) {
            for (liiiiiiiiiiiii var3 : this.illlilIlIl) {
               var3.IliIlllilIi();
            }
         }

         class_310 var24 = class_310.method_1551();
         double var25 = (double)var24.method_22683().method_4495();
         var16 ^= ((long)var24.method_22683().method_4476(IIililillIililil.iiiIlIIIll(var24), var24.method_1573()) << 32 ^ var16) & -1L << 32;
         float var6 = (float)((double)((int)(var16 >>> 32)) / var25);
         var16 ^= ((long)(Math.abs(var6 - 1.0F) > 1.0E-4F ? 1 : 0) ^ var16) & -1L >>> 32;
         if ((int)var16 != 0) {
            var18 ^= ((long)Math.round((float)var24.method_22683().method_4486() / var6) << 32 ^ var18) & -1L << 32;
            var18 ^= ((long)Math.round((float)var24.method_22683().method_4502() / var6) ^ var18) & -1L >>> 32;
         } else {
            var18 ^= ((long)var24.method_22683().method_4486() << 32 ^ var18) & -1L << 32;
            var18 ^= ((long)var24.method_22683().method_4502() ^ var18) & -1L >>> 32;
         }

         class_4587 var10 = CorzClient.fontManager.liiiIIllIl();
         class_4587 var11 = IIIiiIillIIiiIil.liiiIIllIl();
         CorzClient.fontManager.iIlIlllllill(this.IillilIlIl);
         IIIiiIillIIiiIil.IliIlllilIi(this.IillilIlIl);
         if ((int)var16 != 0) {
            IliiIilliiIi.lIIlllIIliIIlllIIl = (float)((int)(var18 >>> 32));
            IliiIilliiIi.IlIlllIIlllIlllIIl = (float)((int)var18);
         }

         try {
            float var12 = (float)((int)var18 - 8) - llliIlIlilliIlIl.liilliiill();

            for (long var31 = var20 ^ ((long)(this.illlilIlIl.size() - 1) << 32 ^ var20) & -1L << 32; (int)(var31 >>> 32) >= 0; var31 += -4294967296L) {
               liiiiiiiiiiiii var14 = this.illlilIlIl.get((int)(var31 >>> 32));
               var14.IIIilIIiiIIi(ctx, (int)(var18 >>> 32) - 8, var12 - (float)var14.IIIllIIliIIl());
               var12 -= (float)(var14.IIIllIIliIIl() + 4) * var14.lIiiIiIlilli();
            }
         } finally {
            if ((int)var16 != 0) {
               IliiIilliiIi.lIIlllIIliIIlllIIl = 0.0F;
               IliiIilliiIi.IlIlllIIlllIlllIIl = 0.0F;
            }

            CorzClient.fontManager.iIlIlllllill(var10);
            IIIiiIillIIiiIil.IliIlllilIi(var11);
         }
      }
   }

   public static Iliiiiilliiiii IliIlllilIi() {
      return llIlilIlIl;
   }

   public void iIlIlllllill(String subtitle, String title, boolean enabled) {
      if (this.lillilIlIl <= 0 && IliiliIllliiliIl.iiiIlIIIll()) {
         String var4 = enabled
            ? IlIlllIlilIl<"IlIlllIlilIl","D+fdJNAie8PkIk1mIskq6e2V0WgUHphaecBeLg7nybrqKUVg">()
            : IlIlllIlilIl<"IlIlllIlilIl","TA2Zpr88DrqJX2spJbY3uThWMSSK9ZdF0J4vvvIsqT7Po9DnGQ==">();
         if ((enabled
                  ? IlIlllIlilIl<"IlIlllIlilIl","0h0uuJImr5WAq0XNFjHapBTLPPxLDCmtxNm+zdcIbaZx7gNRgkxfh7Hl">()
                  : IlIlllIlilIl<"IlIlllIlilIl","zmLQp4Oers48BxL6D2dHjFKcwIPrX+NONbz/2hc7b6+f30PQnHmqmdZx1g==">())
               .equals(subtitle)
            && title != null
            && title.length() > var4.length()
            && title.endsWith(var4)) {
            subtitle = title.substring(0, title.length() - var4.length());
            title = enabled
               ? IlIlllIlilIl<"IlIlllIlilIl","dX9Ys5ioZnumGnG7hISnv/B3sDVH2ahf04rkRsmuEO8o3ZA=">()
               : IlIlllIlilIl<"IlIlllIlilIl","5Oyema5eJzakYBH/AIHuNR13OH5NODkM90ynqvCAqKows5Nw">();
         }

         subtitle = liIlliIiiiIlliIi.Iillllilll(subtitle);
         title = liIlliIiiiIlliIi.Iillllilll(title);
         subtitle = IlIllllllIllll.Iillllilll(subtitle);
         title = IlIllllllIllll.Iillllilll(title);
         subtitle = IiiIliiliiIlii.liiiIIllIl(subtitle);
         title = IiiIliiliiIlii.liiiIIllIl(title);

         for (liiiiiiiiiiiii var6 : this.illlilIlIl) {
            if (!var6.liiiIIllIl() && var6.iIlIlllllill(subtitle, title, enabled)) {
               var6.IilliliilIIi();
               return;
            }
         }

         long var13 = this.illlilIlIl.stream().filter(t -> !t.liiiIIllIl()).count();
         if (var13 >= 4L) {
            this.illlilIlIl.stream().filter(t -> !t.liiiIIllIl()).findFirst().ifPresent(liiiiiiiiiiiii::IliIlllilIi);
         }

         this.illlilIlIl.add(new liiiiiiiiiiiii(subtitle, title, enabled));
      }
   }

   public Iliiiiilliiiii() {
      this.lillilIlIl = 0;
   }
}
