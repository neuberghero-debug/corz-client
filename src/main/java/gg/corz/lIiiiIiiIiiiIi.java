package gg.corz;

import java.util.ArrayList;
import org.joml.Matrix4f;

public final class lIiiiIiiIiiiIi {
   public static final float llIiIliiiilIiIliii = 1.0F;
   public static final float ililIliiiIiilIliii = 21.55F;
   public static final float IIIiIliiilIIiIliii = 2.403F;
   public static final String[] lIilIliiiiIilIliii = new String[]{
      IlIlllIlilIl<"IlIlllIlilIl","W+cKD4rNZl5KM2LZ4YIG7eUbwO9S8dzGeOpLCvDFmGq/kQ==">(),
      IlIlllIlilIl<"IlIlllIlilIl","XTeTfXY1gevpIAgn9+cM5WaRaVePjUmt7Zoki59X">(),
      IlIlllIlilIl<"IlIlllIlilIl","CZd9DZtBKRbt+K8Ow6M7XhHjoQKzi4cMKVVSgD517nU=">()
   };
   public static final float liilIliiiiiilIliii = -11.802F;
   public static final float IiIiIliiiliIiIliii = -1.0F;
   public static final float iIIiIliiiIlIiIliii = 8.0F;
   public static final String[] IlilIliiillilIliii = new String[]{
      IlIlllIlilIl<"IlIlllIlilIl","uGE3HGm/2CRv8M/dyrXBzfHJkaT1ZNDoWySGeuEUYYiq3jpB">(),
      IlIlllIlilIl<"IlIlllIlilIl","6PWJgpMy289SBkhGWocC7XtQlVcLFD7n58juYve/XGJg">(),
      IlIlllIlilIl<"IlIlllIlilIl","oEp6/c0THyEIeboGJPEig8pkALUTg4uhd6hLNVXQN18mmsc=">()
   };

   public static Matrix4f[] IIIllIIliIIl(lIIiilIliIIiilIl model) {
      Matrix4f[] var1 = iliIiiliiiii(model);
      Matrix4f var2 = iIlIlllllill();
      Matrix4f[] var3 = new Matrix4f[lIilIliiiiIilIliii.length];

      for (int var4 = 0; var4 < var3.length; var4++) {
         int var5 = IilliliilIIi(model, var4);
         var3[var4] = var5 < 0 ? null : new Matrix4f(var1[var5]).invert().mul(var2);
      }

      return var3;
   }

   public static Matrix4f iIlIlllllill() {
      return liiiIIllIl().invert();
   }

   public static Matrix4f[] iliIiiliiiii(lIIiilIliIIiilIl model) {
      Matrix4f[] var1 = model.Iilllilliill();
      model.IIillIiliIil(model.Illlllllilll(), var1);
      return var1;
   }

   private lIiiiIiiIiiiIi() {
   }

   public static int[] lIiiIiIlilli(lIIiilIliIIiilIl part, int model) {
      int var2 = IilliliilIIi(part, model);
      ArrayList var3 = new ArrayList();
      if (var2 >= 0) {
         for (int var4 = 0; var4 < part.liiililIll.length; var4++) {
            for (int var5 = var4; var5 >= 0; var5 = part.liiililIll[var5].liiiIIllIl()) {
               if (var5 == var2) {
                  var3.add(var4);
                  break;
               }
            }
         }
      }

      int[] var6 = new int[var3.size()];

      for (int var7 = 0; var7 < var6.length; var7++) {
         var6[var7] = (Integer)var3.get(var7);
      }

      return var6;
   }

   public static Matrix4f liiiIIllIl() {
      return new Matrix4f().translate(-11.802F, 2.403F, 8.0F).scale(21.55F).mul(IliIlllilIi());
   }

   public static Matrix4f IliIlllilIi() {
      float var0 = -1.0F;
      return new Matrix4f(0.0F, 0.0F, var0, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F);
   }

   public static int IilliliilIIi(lIIiilIliIIiilIl model, int part) {
      return part >= 0 && part < lIilIliiiiIilIliii.length ? model.IiIlliIliiIl(lIilIliiiiIilIliii[part]) : -1;
   }
}
