package gg.corz;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.minecraft.class_1921;
import net.minecraft.class_243;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_9799;
import net.minecraft.class_4597.class_4598;
import org.joml.Matrix4f;

public class lliIiililiIiil extends ilIllIiIll {
   private final iilliIlIIiliIl IllIiiIlilllIiiIli = new iilliIlIIiliIl(
      IliIlllilIi<"IliIlllilIi","itM/MWVS0oAVSGjMl0AN3qW/9t0p4+NrxXf8RpmPxFd0">(),
      IliIlllilIi<"IliIlllilIi","q9v7lJaKPBZfG3rqVsOJxkNfVtMw3s+yPJ3AL8DcGfNEN9ph7wMlAR5Mk60+IFw=">(),
      ((-184013439 << 15 | -184013439 >>> 17) + -53 >>> 5 | (-184013439 << 15 | -184013439 >>> 17) + -53 << 27) ^ 2025195462,
      5,
      -(~1966990570) ^ 1966990483
   );
   private static final float IIiIiiIlilIiIiiIli = 35.0F;
   private class_9799 iiiIiiIliIIIliiIli;
   private final iiIiiilIIliiil illIiiIliIilIiiIli = new iiIiiilIIliiil(
      IliIlllilIi<"IliIlllilIi","18qQiGYpfjPwP004lH09H3tWpcCY6jLbpbYVVGuCdxBkQjkJruNx">(),
      IliIlllilIi<"IliIlllilIi","mmbp3RhkMDwusdbOoHBsINPud1fp9m4/pBsPO2OmAc8OnH4ZnSUCOqOndHLgm0+NAFmGiS3AqexIO7RP8GeTedUpls/1dxWVBp0VnfJplUA59Sy2c/mZpDcg4IZg">(),
      true
   );
   private class_4598 lIIliiIliiIIliiIli;
   private final Random IiiIiiIliliiIiiIli;
   private static final int iIiIiiIliIliIiiIli = 25;
   private static final float lilIiiIliiilIiiIli = 0.35F;
   private final List<lliIIlIiiliIIlIi> lliIiiIliiliIiiIli = new ArrayList<>();

   private void iiiIlIIIll(class_243 playerPos) {
      double var2 = this.IiiIiiIliliiIiiIli.nextDouble() * 30.0 + 5.0;
      double var4 = Math.toRadians(this.IiiIiiIliliiIiiIli.nextDouble() * 360.0);
      double var6 = Math.toRadians((this.IiiIiiIliliiIiiIli.nextDouble() - 0.5) * 60.0);
      double var8 = -Math.sin(var4) * Math.cos(var6) * 0.35F;
      double var10 = Math.sin(var6) * 0.35F * 0.5;
      double var12 = Math.cos(var4) * Math.cos(var6) * 0.35F;
      int[] var14 = new int[]{16766720, 16776960, 65280, 65535, 16738740, 16753920, 49151};
      int var15 = 0xFF000000 | var14[this.IiiIiiIliliiIiiIli.nextInt(var14.length)];
      this.lliIiiIliiliIiiIli
         .add(
            new lliIIlIiiliIIlIi(
               playerPos.field_1352 - Math.sin(var4) * var2,
               playerPos.field_1351 + (this.IiiIiiIliliiIiiIli.nextDouble() - 0.3) * 8.0 + 1.0,
               playerPos.field_1350 + Math.cos(var4) * var2,
               var8,
               var10,
               var12,
               var15,
               25
            )
         );
   }

   private static void IlIllllIll(class_4588 buf, Matrix4f mat, float argb, int size) {
      float var4 = argb * 0.5F;
      int var5 = size >> 16 & 0xFF;
      int var6 = size >> 8 & 0xFF;
      int var7 = size & 0xFF;
      int var8 = size >>> 24;
      buf.method_22918(mat, -var4, -var4, 0.0F).method_22913(0.0F, 1.0F).method_1336(var5, var6, var7, var8);
      buf.method_22918(mat, var4, -var4, 0.0F).method_22913(1.0F, 1.0F).method_1336(var5, var6, var7, var8);
      buf.method_22918(mat, var4, var4, 0.0F).method_22913(1.0F, 0.0F).method_1336(var5, var6, var7, var8);
      buf.method_22918(mat, -var4, var4, 0.0F).method_22913(0.0F, 0.0F).method_1336(var5, var6, var7, var8);
   }

   @Override
   public void IIiilIiiiIii(illlllIillll event) {
      if (this.IliIlllilIi() && Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && !this.lliIiiIliiliIiiIli.isEmpty()) {
         if (this.iiiIiiIliIIIliiIli == null) {
            this.iiiIiiIliIIIliiIli = new class_9799(1048576);
            this.lIIliiIliiIIliiIli = class_4597.method_22991(this.iiiIiiIliIIIliiIli);
         }

         class_4587 var2 = event.IliiiIIilliiiIIi;
         class_243 var3 = Iiiilllliiilll.field_1773.method_19418().method_71156();
         float var4 = Iiiilllliiilll.method_61966().method_60637(true);
         boolean var5 = this.illIiiIliIilIiiIli.Iilllilliill();
         class_1921 var6 = llIlliIlilIlliIl.illiliiIll.apply(llIlliIlilIlliIl.IlliliiIll);
         class_4588 var7 = this.lIIliiIliiIIliiIli.method_73477(var6);
         var2.method_22903();
         var2.method_22904(-var3.field_1352, -var3.field_1351, -var3.field_1350);
         Matrix4f var8 = var2.method_23760().method_23761();

         for (int var9 = 0; var9 < this.lliIiiIliiliIiiIli.size(); var9++) {
            lliIIlIiiliIIlIi var10 = this.lliIiiIliiliIiiIli.get(var9);
            float var11 = var10.IIIllIIliIIl();
            int var12 = Math.min(var10.Illiiiiiil.size(), 10);
            if (!(var11 <= 0.01F) && var12 >= 2) {
               int var13 = var5 ? this.lIIlliIIll(var9) : var10.IIliiiiiil;
               double var14 = var10.iIlIlllllill(var4);
               double var16 = var10.IilliliilIIi(var4);
               double var18 = var10.lIiiIiIlilli(var4);
               class_243 var20 = new class_243(var14, var16, var18);
               ArrayList var21 = new ArrayList();
               var21.add(var20);
               var21.add(new class_243(var10.IIIiiiiiil, var10.lIIiiiiiil, var10.iIIiiiiiil));

               for (int var22 = 1; var22 < var12; var22++) {
                  iIiiIIliIliiIIli var23 = var10.Illiiiiiil.get(var22);
                  var21.add(new class_243(var23.liliIiIlIi, var23.iiliIiIlIi, var23.IIiiIiIlIi));
               }

               for (int var46 = 0; var46 < var21.size() - 1; var46++) {
                  class_243 var47 = (class_243)var21.get(var46);
                  class_243 var24 = (class_243)var21.get(var46 + 1);
                  float var25 = (float)var46 / (float)(var21.size() - 1);
                  float var26 = (float)(var46 + 1) / (float)(var21.size() - 1);
                  float var27 = 0.05F * (1.0F - var25);
                  float var28 = 0.05F * (1.0F - var26);
                  float var29 = var46 == 0 ? 0.0F : (float)Math.pow((double)(1.0F - var25), 2.0) * var11;
                  float var30 = (float)Math.pow((double)(1.0F - var26), 2.0) * var11;
                  class_243 var31 = var24.method_1020(var47);
                  if (!(var31.method_1027() < 1.0E-4)) {
                     var31 = var31.method_1029();
                     class_243 var32 = var47.method_1020(var3).method_1029();
                     class_243 var33 = var31.method_1036(var32).method_1029();
                     int var34 = iIillliIlillli.IIIilIIiiIIi(var13, var29);
                     int var35 = iIillliIlillli.IIIilIIiiIIi(var13, var30);
                     var7.method_22918(
                           var8,
                           (float)(var47.field_1352 + var33.field_1352 * (double)var27),
                           (float)(var47.field_1351 + var33.field_1351 * (double)var27),
                           (float)(var47.field_1350 + var33.field_1350 * (double)var27)
                        )
                        .method_22913(0.5F, 0.0F)
                        .method_39415(var34);
                     var7.method_22918(
                           var8,
                           (float)(var47.field_1352 - var33.field_1352 * (double)var27),
                           (float)(var47.field_1351 - var33.field_1351 * (double)var27),
                           (float)(var47.field_1350 - var33.field_1350 * (double)var27)
                        )
                        .method_22913(0.5F, 1.0F)
                        .method_39415(var34);
                     var7.method_22918(
                           var8,
                           (float)(var24.field_1352 - var33.field_1352 * (double)var28),
                           (float)(var24.field_1351 - var33.field_1351 * (double)var28),
                           (float)(var24.field_1350 - var33.field_1350 * (double)var28)
                        )
                        .method_22913(0.5F, 1.0F)
                        .method_39415(var35);
                     var7.method_22918(
                           var8,
                           (float)(var24.field_1352 + var33.field_1352 * (double)var28),
                           (float)(var24.field_1351 + var33.field_1351 * (double)var28),
                           (float)(var24.field_1350 + var33.field_1350 * (double)var28)
                        )
                        .method_22913(0.5F, 0.0F)
                        .method_39415(var35);
                  }
               }
            }
         }

         var2.method_22909();
         this.lIIliiIliiIIliiIli.method_22994(var6);
         var7 = this.lIIliiIliiIIliiIli.method_73477(var6);

         for (int var37 = 0; var37 < this.lliIiiIliiliIiiIli.size(); var37++) {
            lliIIlIiiliIIlIi var38 = this.lliIiiIliiliIiiIli.get(var37);
            float var39 = var38.IIIllIIliIIl();
            if (!(var39 <= 0.01F)) {
               int var40 = var5 ? this.lIIlliIIll(var37) : var38.IIliiiiiil;
               float var41 = var38.iliIiiliiiii() * var39;
               double var42 = var38.iIlIlllllill(var4);
               double var43 = var38.IilliliilIIi(var4);
               double var44 = var38.lIiiIiIlilli(var4);
               var2.method_22903();
               var2.method_22904(var42 - var3.field_1352, var43 - var3.field_1351, var44 - var3.field_1350);
               var2.method_22907(Iiiilllliiilll.field_1773.method_19418().method_23767());
               var2.method_46416(0.0F, 0.0F, 0.02F);
               Matrix4f var45 = var2.method_23760().method_23761();
               IlIllllIll(var7, var45, 1.7F, iIillliIlillli.IIIilIIiiIIi(var40, var41 * 0.15F));
               IlIllllIll(var7, var45, 0.95F, iIillliIlillli.IIIilIIiiIIi(var40, var41 * 0.4F));
               IlIllllIll(var7, var45, 0.4F, iIillliIlillli.IIIilIIiiIIi(var40, var41 * 0.85F));
               IlIllllIll(var7, var45, 0.15F, iIillliIlillli.IIIilIIiiIIi(-1, var41));
               var2.method_22909();
            }
         }

         this.lIIliiIliiIIliiIli.method_22993();
      }
   }

   public lliIiililiIiil() {
      super(IliIlllilIi<"IliIlllilIi","V6WJSfu1GjXGI4htQJ9v4ssBVtqM3d0h+Q5+P1Tjcl5Px7I=">(), lllIllillIll.llIlIIIiilIlIIIi);
      this.IiiIiiIliliiIiiIli = new Random();
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IllIiiIlilllIiiIli, this.illIiiIliIilIiiIli});
   }

   @Override
   public void iIIIlIlIIl() {
      if (this.IliIlllilIi() && Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null) {
         class_243 var1 = Iiiilllliiilll.field_1724.method_73189();
         float var2 = 0.525F;
         this.lliIiiIliiliIiiIli.forEach(maxSpeed -> maxSpeed.IliIlllilIi(0.35F, var2, var1));
         this.lliIiiIliiliIiiIli.removeIf(f -> f.liiiIIllIl(var1));
         int var3 = this.IllIiiIlilllIiiIli.Iilllilliill();

         while (this.lliIiiIliiliIiiIli.size() > var3) {
            this.lliIiiIliiliIiiIli.remove(this.lliIiiIliiliIiiIli.size() - 1);
         }

         while (this.lliIiiIliiliIiiIli.size() < var3) {
            this.iiiIlIIIll(var1);
         }
      }
   }

   private int lIIlliIIll(int fi) {
      return iIillliIlillli.Iiilliiliiil(IlIIilIlllIIilIl.lliiIlliIl, IlIIilIlllIIilIl.IiiiIlliIl, 0.5F, (float)fi * 0.08F);
   }

   @Override
   public void Iilililiiili() {
      this.lliIiiIliiliIiiIli.clear();
      if (this.iiiIiiIliIIIliiIli != null) {
         this.iiiIiiIliIIIliiIli.close();
         this.iiiIiiIliIIIliiIli = null;
         this.lIIliiIliiIIliiIli = null;
      }
   }
}
