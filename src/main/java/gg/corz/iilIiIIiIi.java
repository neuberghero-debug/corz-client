package gg.corz;

import net.minecraft.class_1297;
import net.minecraft.class_1308;
import net.minecraft.class_1311;
import net.minecraft.class_1569;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import org.joml.Matrix4f;

public class iilIiIIiIi extends ilIllIiIll {
   private final lliliIIiililiIIi lillIiiiillIii;
   private static iilIiIIiIi IlllIiillllIii;
   private static final int iIIlIiiIlIlIii = 3731016;
   private int llilIiiililIii;
   private static final float IiIlIiiliIlIii = 0.2F;
   private int iIilIiiIlilIii;
   private int IIilIiilIilIii;
   private final lliliIIiililiIIi illlIiiIillIii = new lliliIIiililiIIi(
      IliIlllilIi<"IliIlllilIi","JzTbcYvRmj0JTL8ZsqNEeTQL0FQNTVH2GkSTDhfOQmw=">(),
      IliIlllilIi<"IliIlllilIi","Xf08NWj7ekTNZhy5GH6NN/O4NHHN7QI6uFSnPuOD4jgpODPYhk8/vMEn9MeoQzadeFCj">(),
      IliIlllilIi<"IliIlllilIi","YJznYOcxL5as21i10x25HKNSB04i0g3/Dt3cGx2V6w==">(),
      IliIlllilIi<"IliIlllilIi","C9eJwxxNpjc+Mo5zT8ea305zHgsfThsG67SO6s2S02gxVmo=">(),
      IliIlllilIi<"IliIlllilIi","F43Z9P35HNG9DrsgNHynH7BCFN2V77hmbCZXz2c1sxNOoZg=">(),
      IliIlllilIi<"IliIlllilIi","YJznYOcxL5as21i10x25HKNSB04i0g3/Dt3cGx2V6w==">()
   );
   private static final float llIlIiiilIlIii = 0.18F;
   private static final int IIIlIiilIIlIii = 16729670;
   private static final float iiIlIiiIIllIii = 1.6F;
   private static final float lIllIiiiIllIii = 2.2F;

   static boolean IlIllllIll(int kind, int filter) {
      return kind == (-1979242424 * 954437177 * 89 ^ 947890890) || kind == filter - 1;
   }

   static int lIIlliIIll(class_1297 entity) {
      if (entity instanceof class_1308 && entity.method_5805()) {
         return !(entity instanceof class_1569) && entity.method_5864().method_5891() != class_1311.field_6302 ? 2 : 1;
      } else {
         return 0;
      }
   }

   @Override
   protected void IIiilIiiiIii(illlllIillll event) {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         int var2 = this.lillIiiiillIii.Ililllililil();
         if (var2 != 0) {
            this.liIlliiIll();
            class_243 var3 = llilllililll.IliIlllilIi();
            double var4 = var3.field_1352;
            double var6 = var3.field_1351;
            double var8 = var3.field_1350;
            Matrix4f var10 = event.IliiiIIilliiiIIi.method_23760().method_23761();
            float var11 = event.liiiiIIiiiiiiIIi;
            int var12 = this.illlIiiIillIii.Ililllililil();
            int var13 = 0;

            for (class_1297 var15 : Iiiilllliiilll.field_1687.method_18112()) {
               int var16 = lIIlliIIll(var15);
               if (var16 != 0 && IlIllllIll(var12, var16)) {
                  double var17 = class_3532.method_16436((double)var11, var15.field_6014, var15.method_23317()) - var15.method_23317();
                  double var19 = class_3532.method_16436((double)var11, var15.field_6036, var15.method_23318()) - var15.method_23318();
                  double var21 = class_3532.method_16436((double)var11, var15.field_5969, var15.method_23321()) - var15.method_23321();
                  class_238 var23 = var15.method_5829();
                  double var24 = (var23.field_1323 + var23.field_1320) * 0.5 + var17;
                  double var26 = (var23.field_1322 + var23.field_1325) * 0.5 + var19;
                  double var28 = (var23.field_1321 + var23.field_1324) * 0.5 + var21;
                  double var30 = var23.field_1320 - var23.field_1323;
                  double var32 = var23.field_1325 - var23.field_1322;
                  double var34 = var23.field_1324 - var23.field_1321;
                  float var36 = (float)(Math.sqrt(var30 * var30 + var32 * var32 + var34 * var34) * 0.5) + 0.5F;
                  if (!iIiiIIilIliiIIil.IlIillIiilIi(var24, var26, var28, var36)) {
                     float var37 = (float)(var23.field_1323 + var17 - var4);
                     float var38 = (float)(var23.field_1322 + var19 - var6);
                     float var39 = (float)(var23.field_1321 + var21 - var8);
                     float var40 = (float)(var23.field_1320 + var17 - var4);
                     float var41 = (float)(var23.field_1325 + var19 - var6);
                     float var42 = (float)(var23.field_1324 + var21 - var8);
                     int var43 = var16 == 1 ? this.iIilIiiIlilIii : this.llilIiiililIii;
                     int var44 = 0xFF000000 | var43;
                     if (var2 == 1) {
                        iIiiIIilIliiIIil.IIlilIliiIli(
                           var10,
                           var37,
                           var38,
                           var39,
                           var40,
                           var41,
                           var42,
                           (float)(var43 >> 16 & 0xFF) / 255.0F,
                           (float)(var43 >> 8 & 0xFF) / 255.0F,
                           (float)(var43 & 0xFF) / 255.0F,
                           0.2F
                        );
                        iIiiIIilIliiIIil.iIIIlIlIIl(var10, var37, var38, var39, var40, var41, var42, var44, 1.6F);
                     } else {
                        IIllllIlll(var10, var37, var38, var39, var40, var41, var42, var44, 2.2F);
                     }

                     var13++;
                  }
               }
            }

            if (var13 > 0) {
               iIiiIIilIliiIIil.IiIiliIiiiIi();
            }
         }
      }
   }

   static int ilIllIiIll(int t, int theme, float base) {
      int var3 = Math.round((float)(t >> 16 & 0xFF) * (1.0F - base) + (float)(theme >> 16 & 0xFF) * base);
      int var4 = Math.round((float)(t >> 8 & 0xFF) * (1.0F - base) + (float)(theme >> 8 & 0xFF) * base);
      int var5 = Math.round((float)(t & 0xFF) * (1.0F - base) + (float)(theme & 0xFF) * base);
      return var3 << 16 | var4 << 8 | var5;
   }

   private static void IIllllIlll(Matrix4f x2, float z2, float y2, float argb, float x1, float y1, float z1, int w, float m) {
      float var9 = (x1 - z2) * 0.25F;
      float var10 = (y1 - y2) * 0.25F;
      float var11 = (z1 - argb) * 0.25F;

      for (int var12 = 0; var12 < 8; var12++) {
         boolean var13 = (var12 & 1) == 0;
         boolean var14 = (var12 & 2) == 0;
         boolean var15 = (var12 & 4) == 0;
         float var16 = var13 ? z2 : x1;
         float var17 = var14 ? y2 : y1;
         float var18 = var15 ? argb : z1;
         float var19 = var13 ? var9 : -var9;
         float var20 = var14 ? var10 : -var10;
         float var21 = var15 ? var11 : -var11;
         iIiiIIilIliiIIil.Iliilliiilii(x2, var16, var17, var18, var16 + var19, var17, var18, w, m);
         iIiiIIilIliiIIil.Iliilliiilii(x2, var16, var17, var18, var16, var17 + var20, var18, w, m);
         iIiiIIilIliiIIil.Iliilliiilii(x2, var16, var17, var18, var16, var17, var18 + var21, w, m);
      }
   }

   public iilIiIIiIi() {
      super(IliIlllilIi<"IliIlllilIi","KX2lE7+WPdz6TDDfecxUh+DjF8ohThMhaeA4nTmWlb2/Y5M=">(), lllIllillIll.llIlIIIiilIlIIIi);
      this.lillIiiiillIii = new lliliIIiililiIIi(
         IliIlllilIi<"IliIlllilIi","gAzqcyncl/4SdsODIOjXVHOO/DANKf/OfI7zjmsbvv8e">(),
         IliIlllilIi<"IliIlllilIi","id2r50pu7A9yB9XgcxEn+8vsCo5RapApNfS68TzZR6TyZn59GRnTZweIs1WUKDR69GOxCsEaPl1kIsg5cP9ln6CFVeLZhJ+pv8GRdQ==">(),
         IliIlllilIi<"IliIlllilIi","a59qDBKIMKNK09uGGfbWTgIhyA6btWnWKxuLj0nmoFawQCeWIqgpxA==">(),
         IliIlllilIi<"IliIlllilIi","a59qDBKIMKNK09uGGfbWTgIhyA6btWnWKxuLj0nmoFawQCeWIqgpxA==">(),
         IliIlllilIi<"IliIlllilIi","Nd4LK+/TMsHIgr/EqlJMg/L8za+PQlpXXegG4ram+Q==">(),
         IliIlllilIi<"IliIlllilIi","KInMEkPXeZdQov8wWL7sztQSMV0QewfnOptJ+v9v043MOzA=">()
      );
      this.IIilIiilIilIii = Integer.MIN_VALUE;
      this.iIilIiiIlilIii = 16729670;
      this.llilIiiililIii = 3731016;
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.illlIiiIillIii, this.lillIiiiillIii});
      IlllIiillllIii = this;
   }

   public static int iiiIlIIIll(class_1297 entity) {
      long var3 = 734795451204448382L;
      iilIiIIiIi var1 = IlllIiillllIii;
      if (var1 != null && var1.IliIlllilIi() && var1.lillIiiiillIii.Ililllililil() == 0) {
         var3 ^= ((long)lIIlliIIll(entity) << 32 ^ var3) & -1L << 32;
         if ((int)(var3 >>> 32) != 0 && IlIllllIll(var1.illlIiiIillIii.Ililllililil(), (int)(var3 >>> 32)) && entity.method_73183().method_8608()) {
            var1.liIlliiIll();
            return (((-1952629598 ^ 29) << 9 | (-1952629598 ^ 29) >>> 23) + 39) * 678152731 ^ 388061066
               | ((int)(var3 >>> 32) == (-950960991 + 7 + -27 ^ -950961012) ? var1.iIilIiiIlilIii : var1.llilIiiililIii);
         } else {
            return 0;
         }
      } else {
         return 0;
      }
   }

   private void liIlliiIll() {
      long var2 = 1584051474343289863L;
      var2 ^= ((long)(IlIIilIlllIIilIl.lliiIlliIl & (~(696217831 * -1030792151) * 1090785345 + 121 ^ 2027640966)) << 32 ^ var2) & -1L << 32;
      if ((int)(var2 >>> 32) != this.IIilIiilIilIii) {
         this.IIilIiilIilIii = (int)(var2 >>> 32);
         this.iIilIiiIlilIii = ilIllIiIll(-(~444835004) ^ 444392187, (int)(var2 >>> 32), 0.18F);
         this.llilIiiililIii = ilIllIiIll(-(-853315726 * 25) ^ -139267178, (int)(var2 >>> 32), 0.18F);
      }
   }
}
