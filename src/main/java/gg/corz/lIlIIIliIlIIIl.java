package gg.corz;

import java.awt.Color;
import java.util.Locale;
import net.minecraft.class_2960;
import net.minecraft.class_332;
import net.minecraft.class_4587;
import org.joml.Matrix3x2fStack;
import org.joml.Matrix4f;

public final class lIlIIIliIlIIIl {
   public static final float IiiIiIiIlliiIiIiIl = 5.0F;
   public static final float lilIiIiIliilIiIiIl = 16.0F;
   public static final float IIiIiIiIllIiIiIiIl = 5.0F;
   public static final float iIiIiIiIlIliIiIiIl = 7.0F;
   public static final float illIiIiIlIilIiIiIl = 7.0F;
   public static final float lliIiIiIliliIiIiIl = 0.82F;
   public static final float iiiIiIiIlIIIliIiIl = 0.9F;
   public static final float IlIliIiIlllIliIiIl = 0.8F;
   public static final float IllIiIiIllllIiIiIl = 10.0F;
   public static final int ilIliIiIlIiIliIiIl = 1375731712;
   public static final float lIIliIiIliIIliIiIl = 2.0F;
   public static final int liIliIiIliiIliIiIl = 117440511;

   public static void IliIlllilIi(class_332 x, float y, float w, float h, float ctx) {
      liiiIIllIl(x, y, w, h, ctx, 1.0F);
   }

   public static float Iilllilliill(class_332 value, String valueColor, String x, float ctx, float label, int y) {
      float var6 = 0.0F;
      if (valueColor != null && !valueColor.isEmpty()) {
         llilliilililliil.lIlIliIlIl(valueColor.toUpperCase(Locale.ROOT), ctx + 1.0F, label, 0.8F, -11117467);
         var6 = 12.2F;
      }

      float var7 = label + var6;
      llilliilililliil.lIlIliIlIl(x, ctx, var7, 2.0F, y);
      llilliilililliil.lIlIliIlIl(x, ctx + IIIiiIillIIiiIil.Illlllllilll(), var7, 2.0F, llilliilililliil.IIIIllIIIl(y, 0.55F));
      return var6 + 23.0F;
   }

   public static void IilliliilIIi(class_332 ctx, float x, float r, float y, float h, float w) {
      IIIiiIillIIiiIil.Iiilliiliiil(ctx, x, r, y, h, w, IIIiiIillIIiiIil.Illlllllilll(), IilIIIIililIIIIi.IIillIiliIil());
   }

   public static void Illlllllilll(String scale, float argb, float s, float x, float boxH, int boxY) {
      llilliilililliil.lIlIliIlIl(scale, argb, llilliilililliil.IllIllllIl(s, x, boxH), boxH, boxY);
   }

   public static float IIlllIlliIll(String scale, float s) {
      return llilliilililliil.IiIIlliIIl(scale, s);
   }

   public static void liiiIIllIl(class_332 ctx, float w, float ambient, float y, float h, float x) {
      IIIiiIillIIiiIil.IiIlliIliiIl(ctx, w + 3.0F, ambient + 7.0F, y - 6.0F, h - 4.0F, 10.0F, 1375731712, 20.0F, 1.0F);
      IIIiiIillIIiiIil.Ililllililil(ctx, w, ambient, y, h, 10.0F, llilliilililliil.IIillIiliIil(), 352321535);
      iilIllIiIIiIllIi.IIIllIIliIIl(ctx, 2, w, ambient, y, h, 10.0F, 0.9F * Math.max(0.0F, Math.min(1.0F, x)));
   }

   public static void iIlIlllllill(class_332 x, float y, float h, float r, float ctx, float w) {
      IIIiiIillIIiiIil.IlIlllIlilIl(x, y, h, r, ctx, w, IilIIIIililIIIIi.IlIlllIlilIl());
   }

   public static void lIiiIiIlilli(class_332 y, float x, float size, float ctx) {
      IIIiiIillIIiiIil.Ililllililil(y, x, size, ctx, ctx, 5.0F, IilIIIIililIIIIi.IlIlllIlilIl(), IilIIIIililIIIIi.IIillIiliIil());
   }

   public static float IIiilIiiiIii() {
      return IIIiiIillIIiiIil.liiiIIllIl().method_23760().method_23761().m00();
   }

   public static void Iliilliiilii(class_332 w, float ctx, float x, float y, float h) {
      w.method_44379((int)Math.floor((double)ctx), (int)Math.floor((double)x), (int)Math.ceil((double)(ctx + y)), (int)Math.ceil((double)(x + h)));
   }

   public static void Iiilliiliiil(class_332 h, float x, float icon, float ctx, float w, class_2960 title, String sub, String y) {
      float var8 = llilliilililliil.IIiilIiiiIii().IilliliilIIi();
      float var9 = (title == null ? 0.0F : 26.0F) + var8 + (y == null ? 0.0F : 3.0F + var8 * 0.82F);
      float var10 = icon + Math.max(0.0F, (w - var9) / 2.0F);
      float var11 = x + ctx / 2.0F;
      if (title != null) {
         iiIlilIlIIllilIl.IliIlllilIi(var11 - 9.0F, var10, 18.0F, 18.0F, title, new Color(-10722709, true), IIIiiIillIIiiIil.liiiIIllIl());
         var10 += 26.0F;
      }

      if (sub != null) {
         llilliilililliil.iiIIlIIlIl(sub, llilliilililliil.IIIllIIliIIl(var11 - llilliilililliil.llIIlilIIl(sub) / 2.0F), var10, -920587);
      }

      if (y != null) {
         llilliilililliil.lIlIliIlIl(y, var11 - llilliilililliil.IiIIlliIIl(y, 0.82F) / 2.0F, var10 + var8 + 3.0F, 0.82F, -7630437);
      }
   }

   public static class_2960 IlIillIiilIi(String name) {
      return lIlIIiliIlIIil.illIlIilIl(name);
   }

   public static float Iilililiiili(float y) {
      Matrix4f var1 = IIIiiIillIIiiIil.liiiIIllIl().method_23760().method_23761();
      return y * var1.m11() + var1.m31();
   }

   private lIlIIIliIlIIIl() {
   }

   public static void IIIllIIliIIl(class_332 r, float w, float h, float ctx, float hover, float x, float on, float y) {
      long var10 = 4935043301068675904L;
      var10 ^= (
            (long)IilIIIIililIIIIi.Illlllllilll(
                     IilIIIIililIIIIi.Illlllllilll(IilIIIIililIIIIi.iliIiiliiiii(), -1, 0.035 * (double)on), IlIIilIlllIIilIl.lliiIlliIl, 0.15 * (double)y
                  )
                  << 32
               ^ var10
         )
         & -1L << 32;
      var10 ^= (
            (long)IilIIIIililIIIIi.Illlllllilll(
                  IilIIIIililIIIIi.Illlllllilll(IilIIIIililIIIIi.IIillIiliIil(), 1040187391, (double)on), IilIIIIililIIIIi.IIlllIlliIll(0.55), (double)y
               )
               ^ var10
         )
         & -1L >>> 32;
      IIIiiIillIIiiIil.Ililllililil(r, w, h, ctx, hover, x, (int)(var10 >>> 32), (int)var10);
   }

   public static boolean IiIiliIiiiIi(class_332 ctx, float dy, float scale, float cy, float cx) {
      long var9 = -4419960225729538769L;
      var9 ^= ((long)(Math.abs(cy - 1.0F) > 5.0E-4F ? 1 : 0) << 32 ^ var9) & -1L << 32;
      var9 ^= ((long)(Math.abs(cx) > 5.0E-4F ? 1 : 0) ^ var9) & -1L >>> 32;
      if ((int)(var9 >>> 32) == 0 && (int)var9 == 0) {
         return false;
      } else {
         class_4587 var7 = IIIiiIillIIiiIil.liiiIIllIl();
         var7.method_22903();
         var7.method_46416(dy, scale + cx, 0.0F);
         var7.method_22905(cy, cy, 1.0F);
         var7.method_46416(-dy, -scale, 0.0F);
         Matrix3x2fStack var8 = ctx.method_51448();
         var8.pushMatrix();
         var8.translate(dy, scale + cx);
         var8.scale(cy, cy);
         var8.translate(-dy, -scale);
         return true;
      }
   }

   public static void IIlilIliiIli(class_332 pushed, boolean ctx) {
      if (ctx) {
         pushed.method_51448().popMatrix();
         IIIiiIillIIiiIil.liiiIIllIl().method_22909();
      }
   }

   public static int IiIlliIliiIl(float on, float hover) {
      return IilIIIIililIIIIi.Illlllllilll(
         IilIIIIililIIIIi.Illlllllilll(-7630437, -920587, (double)on), IilIIIIililIIIIi.Illlllllilll(IlIIilIlllIIilIl.lliiIlliIl, -1, 0.22), (double)hover
      );
   }

   public static void IIillIiliIil(class_332 w, float ctx, float hover, float y, float h, int index, float x) {
      if ((index & 1) == 1) {
         IIIiiIillIIiiIil.IlIlllIlilIl(w, ctx, hover, y, h, 5.0F, 117440511);
      }

      if (x > 0.01F) {
         IIIiiIillIIiiIil.IlIlllIlilIl(w, ctx, hover, y, h, 5.0F, llilliilililliil.IIIIllIIIl(-1, 0.045F * x));
      }
   }

   public static void IlIlllIlilIl(class_332 w, float x, float hover, float y, float h, float ctx) {
      long var7 = 7108818555853098936L;
      if (ctx > 0.01F) {
         IIIiiIillIIiiIil.IiIlliIliiIl(w, x, hover, y, h, 5.0F, IilIIIIililIIIIi.IIlllIlliIll(0.16 * (double)ctx), 4.0F, 0.5F);
      }

      var7 ^= ((long)IilIIIIililIIIIi.Illlllllilll(llilliilililliil.IIIIllIIIl(IlIIilIlllIIilIl.lliiIlliIl, 0.92F), -1, 0.1 * (double)ctx) << 32 ^ var7)
         & -1L << 32;
      IIIiiIillIIiiIil.IlIlllIlilIl(w, x, hover, y, h, 5.0F, (int)(var7 >>> 32));
   }

   public static void iliIiiliiiii(class_332 ctx, float y, float x, float w, float h, float on, float hover) {
      IIIllIIliIIl(ctx, y, x, w, h, 5.0F, on, hover);
   }

   public static float Illillliilli(float x) {
      Matrix4f var1 = IIIiiIillIIiiIil.liiiIIllIl().method_23760().method_23761();
      return x * var1.m00() + var1.m30();
   }

   public static int Iiiiliiiiiii(int argb, float a) {
      return llilliilililliil.IIIIllIIIl(argb, a);
   }

   public static void Ililllililil(class_332 y, float h, float scroll, float x, iiiilIIiIIIIiIIi ctx) {
      float var5 = ctx.Illlllllilll();
      if (!(var5 <= 0.01F) && ctx.iIlIlllllill()) {
         float var6 = ctx.Iilllilliill(x);
         float var7 = ctx.IIillIiliIil(x);
         IIIiiIillIIiiIil.IlIlllIlilIl(y, h, scroll + var7, 2.0F, var6, 1.0F, llilliilililliil.IIIIllIIIl(-1, 0.22F * var5));
      }
   }

   public static void IIIilIIiiIIi(class_2960 y, float size, float x, float argb, int tex) {
      if (y != null) {
         iiIlilIlIIllilIl.IliIlllilIi(size, x, argb, argb, y, new Color(tex, true), IIIiiIillIIiiIil.liiiIIllIl());
      }
   }
}
