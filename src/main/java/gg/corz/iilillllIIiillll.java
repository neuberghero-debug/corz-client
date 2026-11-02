package gg.corz;

import com.corz.client.CorzClient;
import java.util.List;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import org.joml.Matrix4f;

public final class iilillllIIiillll {
   private final int[] IIilliIill;
   static final float iIllliIill = 2.2F;
   static final float lIllliIill = 0.11F;
   static final int illlliIill = 256;
   private final lllIiiillIii IillliIill = new lllIiiillIii();
   static final double llllliIill = 1.35;
   private final double[] iillliIill;
   static final float IIllliIill = 40.0F;
   private boolean iIilliIill;
   private final class_4587 lillliIill = new class_4587();
   static final float IlllliIill = 1.0F;

   private void liiiIIllIl(class_2338 t) {
      class_310 var2 = class_310.method_1551();
      class_243 var3 = var2.field_1773.method_19418().method_71156();
      double var4 = (double)t.method_10263() + 0.5;
      double var6 = (double)t.method_10264() + 1.0;
      double var8 = (double)t.method_10260() + 0.5;
      double var10 = var4 - var3.field_1352;
      double var12 = var8 - var3.field_1350;
      double var14 = Math.sqrt(var10 * var10 + var12 * var12);
      if (!(var14 < 2.0)) {
         Matrix4f var16 = iIiiIIilIliiIIil.IIillIiliIil();
         class_4588 var17 = iIiiIIilIliiIIil.IilliliilIIi();
         int var18 = IlIIilIlllIIilIl.lliiIlliIl & 16777215;
         float var19 = 0.8F + 0.2F * (float)Math.sin((double)(System.currentTimeMillis() % 10000L) / 1000.0 * 2.2);
         float var20 = (float)(var12 / var14);
         float var21 = (float)(-var10 / var14);
         float var22 = 0.11F * (float)class_3532.method_15350(var14 / 32.0, 1.0, 5.0);
         float var23 = iIiiIIilIliiIIil.Ililllililil(var4);
         float var24 = iIiiIIilIliiIIil.IIIilIIiiIIi(var8);
         float var25 = iIiiIIilIliiIIil.Iiilliiliiil(var6);
         float var26 = iIiiIIilIliiIIil.Iiilliiliiil(var6 + 40.0);
         int var27 = iIillliIlillli.IIIilIIiiIIi(var18 | 0xFF000000, 0.55F * var19);
         iIiiIIilIliiIIil.IlIlllIlilIl(
            var17,
            var16,
            var23 + var20 * var22,
            var25,
            var24 + var21 * var22,
            var27,
            var23 - var20 * var22,
            var25,
            var24 - var21 * var22,
            var27,
            var23 - var20 * var22,
            var26,
            var24 - var21 * var22,
            var18,
            var23 + var20 * var22,
            var26,
            var24 + var21 * var22,
            var18
         );
      }
   }

   public void IliIlllilIi(float target, boolean pearl, class_2338 route, List<class_2338> show, class_2338 tickDelta, lIIIlliIIIll goal) {
      if (!this.iIilliIill) {
         try {
            IiiIIiilliiIIiil var7 = this.IillliIill.IliIlllilIi();
            var7.IliIlllilIi();
            var7.IlIilillil = pearl;
            var7.iIIilillil = pearl;
            if (route != null) {
               var7.iIlIlllllill(
                  route.method_10263(), route.method_10264(), route.method_10260(), route.method_10263(), route.method_10264(), route.method_10260()
               );
               var7.iliilillil = route;
            }

            if (show != null && !show.isEmpty() && tickDelta != null) {
               var7.Iiiilillil = show;
               var7.liiilillil = tickDelta;
               var7.iiiilillil = true;
            }

            this.IillliIill.liiiIIllIl(pearl, target);
            if (!pearl || route == null) {
               return;
            }

            this.liiiIIllIl(route);
            if (goal != null && goal.iliIiiliiiii() != null) {
               this.iIlIlllllill(goal);
            }
         } catch (Throwable var8) {
            this.iIilliIill = true;
         }
      }
   }

   public void IilliliilIIi(class_332 ctx, class_2338 title, String target, String detail) {
      if (!this.iIilliIill && ctx != null && title != null) {
         class_310 var5 = class_310.method_1551();
         if (var5.field_1724 != null && var5.field_1755 == null) {
            CorzClient.fontManager.iIlIlllllill(this.lillliIill);
            IIIiiIillIIiiIil.IliIlllilIi(this.lillliIill);
            double var6 = (double)var5.method_22683().method_4495();
            int var8 = var5.method_22683().method_4476(IIililillIililil.iiiIlIIIll(var5), var5.method_1573());
            float var9 = (float)((double)var8 / var6);
            boolean var10 = Math.abs(var9 - 1.0F) > 1.0E-4F;
            if (var10) {
               IliiIilliiIi.lIIlllIIliIIlllIIl = (float)Math.round((float)var5.method_22683().method_4486() / var9);
               IliiIilliiIi.IlIlllIIlllIlllIIl = (float)Math.round((float)var5.method_22683().method_4502() / var9);
            }

            try {
               IIlIiIlllIlIiIll var11 = IIlIiIlllIlIiIll.lIiiIiIlilli();
               IIlIiIlllIlIiIll var12 = var11.IIillIiliIil() ? var11 : IIlIiIlllIlIiIll.liiiIIllIl();
               if (!var12.IIillIiliIil()) {
                  return;
               }

               class_243 var13 = llilllililll.iIlIlllllill(
                  new class_243((double)title.method_10263() + 0.5, (double)title.method_10264() + 1.35, (double)title.method_10260() + 0.5)
               );
               if (var13 == null || var13.field_1350 <= 0.0 || var13.field_1350 >= 1.0) {
                  return;
               }

               float var14 = (float)(var13.field_1352 / (double)var9);
               float var15 = (float)(var13.field_1351 / (double)var9);
               float var16 = 18.0F;
               float var17 = 7.0F;
               float var18 = 11.0F;
               float var19 = 5.0F;
               String var20 = lIiiIiIlilli<"lIiiIiIlilli","p8zTxi0pfWIxsqCGMGJETSr81HTRSBAU2C53HgGv">();
               float var21 = var12.Iiilliiliiil(target, var18);
               float var22 = var12.Iiilliiliiil(var20, var18);
               float var23 = detail != null && !detail.isEmpty() ? var12.Iiilliiliiil(detail, var18) : 0.0F;
               float var24 = var17 + var21 + (var23 > 0.0F ? var22 + var23 : 0.0F) + var17;
               float var25 = var14 - var24 / 2.0F;
               float var26 = var15 - var16;
               IIIiiIillIIiiIil.Ililllililil(ctx, var25, var26, var24, var16, var19, -233499369, 620756991);
               float var27 = var26 + (var16 - var12.IlIillIiilIi(var18)) / 2.0F;
               var12.IIlilIliiIli(target, var25 + var17, var27, 0xFF000000 | IlIIilIlllIIilIl.lliiIlliIl, var18);
               if (var23 > 0.0F) {
                  var12.IIlilIliiIli(detail, var25 + var17 + var21 + var22, var27, -6645087, var18);
               }
            } finally {
               if (var10) {
                  IliiIilliiIi.lIIlllIIliIIlllIIl = 0.0F;
                  IliiIilliiIi.IlIlllIIlllIlllIIl = 0.0F;
               }
            }
         }
      }
   }

   private void iIlIlllllill(lIIIlliIIIll s) {
      class_310 var2 = class_310.method_1551();
      class_4184 var3 = var2.field_1773.method_19418();
      if (var3 != null) {
         List var4 = s.iliIiiliiiii();
         int var5 = Math.min(256, var4.size());
         if (var5 >= 2) {
            int var6 = 0xFF000000 | IlIIilIlllIIilIl.lliiIlliIl;
            int var7 = IilIIIIililIIIIi.Illlllllilll(var6, -1, 0.55);

            for (int var8 = 0; var8 < var5; var8++) {
               class_243 var9 = (class_243)var4.get(var8);
               this.iillliIill[var8 * 3] = var9.field_1352;
               this.iillliIill[var8 * 3 + 1] = var9.field_1351;
               this.iillliIill[var8 * 3 + 2] = var9.field_1350;
               float var10 = iIillliIlillli.Ililllililil(Math.min(1.0F, (float)var8 / 6.0F));
               this.IIilliIill[var8] = iIillliIlillli.IIIilIIiiIIi(var7, 0.85F * var10);
            }

            float var11 = Math.max(1.0F, (float)var2.method_22683().method_4506() / 1080.0F);
            IIillllIilll.liiiIIllIl(
               iIiiIIilIliiIIil.IilliliilIIi(), iIiiIIilIliiIIil.IIillIiliIil(), var3, this.iillliIill, this.IIilliIill, var5, 2.2F * var11, 1.0F, false, false
            );
         }
      }
   }

   public iilillllIIiillll() {
      this.iillliIill = new double[~(-1561289569 + -87) ^ -35 ^ -1561288854];
      this.IIilliIill = new int[~-1055185798 + -73 ^ 1055185468];
   }
}
