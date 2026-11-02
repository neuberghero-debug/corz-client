package gg.corz;

import com.corz.client.CorzClient;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.awt.Color;
import net.minecraft.class_332;
import net.minecraft.class_4587;

public final class IiillIlliillIl {
   private static final Color iIlIIiIllIllIIiIll = new Color(-7630437, true);
   private static final String[] lllIIiIllillIIiIll = new String[]{
      IIlllIlliIll<"IIlllIlliIll","dq0AwwpY72nhZIqg92LEpL0KzUDAComyoSxBn9A=">(),
      IIlllIlliIll<"IIlllIlliIll","98iF5RYuoA6Tsnn1MTzwgBVBbK9tLjWyESf7XY0=">(),
      IIlllIlliIll<"IIlllIlliIll","aZ1E/hv1o2Ngx+3WpiKqcI3fmW9KOKuWsI2mZV0=">(),
      IIlllIlliIll<"IIlllIlliIll","L9skG+2q0K/FlqeryOHFYh32Mc75NBieAEjXLMQ=">(),
      IIlllIlliIll<"IIlllIlliIll","zDSv9c3CX5gqH+t6VMfHo0vMzZHVpSEdmRXPmCg=">(),
      IIlllIlliIll<"IIlllIlliIll","IYAK3XPbWDKgjNhTIeJ7XtpoPS/EQgU2UxJbmrw=">(),
      IIlllIlliIll<"IIlllIlliIll","2qEn29WRBUsDOIALEr0IQByDFlEEmpyzzbUkb+o=">(),
      IIlllIlliIll<"IIlllIlliIll","gNN5dckf4PVSTEUhyM87l0zEGg1UhigUAIDwdSc=">(),
      IIlllIlliIll<"IIlllIlliIll","UXe0qOpn42aoJBnliST5vRoju2ae+muYf8lo4BE=">(),
      IIlllIlliIll<"IIlllIlliIll","kqFNHB1pZgtRolBQMrNQQRU8BSSU5Y+efJorkU8=">()
   };
   public static final float IiiiilIllliiiilIll = 0.9F;
   private static final Color IIlIIiIlllIlIIiIll = new Color(-920587, true);
   private static final Int2ObjectOpenHashMap<Color> IilIIiIlllilIIiIll = new Int2ObjectOpenHashMap();
   public static final float illiilIllIiliilIll = 8.0F;
   public static final float lliiilIlliliiilIll = 5.0F;
   public static final float IIiiilIlllIiiilIll = 6.0F;
   private static final int lIIIIiIlliIIIIiIll = 184;
   private static final int IlIIIiIllllIIIiIll = 102;
   public static final float IlliilIllllliilIll = 6.0F;
   public static final float liliilIlliiliilIll = 5.0F;
   private static final int liIIIiIlliiIIIiIll = 654311423;
   public static final float iIiiilIllIliiilIll = 2.0F;
   public static final float lIliilIlliIliilIll = 6.0F;
   public static final float iiIiilIllIIliilIll = 16.0F;
   private static final int ilIIIiIllIiIIIiIll = 788529151;
   public static final float iiiiilIllIIIIIiIll = 0.8F;

   private static void iliIiiliiiii(IIliiIlllIliiIll font, String s, float c, float x, float y, Color scale) {
      if (!s.isEmpty()) {
         if (Math.abs(y - 1.0F) < 5.0E-4F) {
            font.IliIlllilIi(s, c, x, scale);
         } else {
            class_4587 var6 = CorzClient.fontManager.liiiIIllIl();
            var6.method_22903();
            var6.method_22905(y, y, 1.0F);
            font.IliIlllilIi(s, c / y, x / y, scale);
            var6.method_22909();
         }
      }
   }

   private IiillIlliillIl() {
   }

   private static float lIiiIiIlilli(IIliiIlllIliiIll scale, String font, float s) {
      float var3 = scale.iIlIlllllill(IIlllIlliIll<"IIlllIlliIll","dq0AwwpY72nhZIqg92LEpL0KzUDAComyoSxBn9A=">()) * s;
      float var4 = 0.0F;

      for (int var5 = 0; var5 < font.length(); var5++) {
         char var6 = font.charAt(var5);
         var4 += var6 >= '0' && var6 <= '9'
            ? var3
            : scale.iIlIlllllill(var6 == '.' ? IIlllIlliIll<"IIlllIlliIll","NvrKV7bQNpKvYrPO7R6Mw7C5WA4YzsJUHr5EcI4=">() : String.valueOf(var6)) * s;
      }

      return var4;
   }

   public static void liiiIIllIl(class_332 name, float ay, float s, float ctx, String progress, String accent, float ax, int time) {
      IIliiIlllIliiIll var8 = CorzClient.fontRenderer();
      float var9 = 0.9F * ctx;
      float var10 = 0.8F * ctx;
      float var11 = IlIlllIlilIl(16.0F * ctx);
      float var12 = 6.0F * ctx;
      float var13 = 8.0F * ctx;
      boolean var14 = progress != null && !progress.isEmpty();
      float var15 = var14 ? var8.iIlIlllllill(progress) * var9 + 6.0F * ctx : 0.0F;
      float var16 = lIiiIiIlilli(var8, accent, var9);
      float var17 = IliIlllilIi(ctx, progress, accent);
      float var18 = IlIlllIlilIl(ay - var17 / 2.0F);
      float var19 = IlIlllIlilIl(s + 5.0F * ctx);
      int var20 = (IilIIIIililIIIIi.liiiIIllIl() ? 102 : 184) << 24 | 1053465;
      IIIiiIillIIiiIil.Iilllilliill(name, var18, var19, var17, var11, Math.min(6.0F * ctx, var11 / 2.0F), var20, 788529151);
      float var21 = var18 + var12;
      iIlIlllllill(var21 + var13 / 2.0F, var19 + var11 / 2.0F, var13, ax, time);
      var21 += var13 + 5.0F * ctx;
      float var22 = IIIllIIliIIl(var8, var19, var11, var9);
      if (var14) {
         iliIiiliiiii(var8, progress, var21, var22, var9, IIlIIiIlllIlIIiIll);
         var21 += var15;
      }

      IilliliilIIi(var8, accent, var21, var22, var9, IiIlliIliiIl(time));
      var21 += var16 + 2.0F * ctx;
      iliIiiliiiii(
         var8,
         IIlllIlliIll<"IIlllIlliIll","OgehAharB+cXTVnEyRG9c3rC+RAFRWYerSBaER4=">(),
         var21,
         IIIllIIliIIl(var8, var19, var11, var10),
         var10,
         iIlIIiIllIllIIiIll
      );
   }

   private static float IIIllIIliIIl(IIliiIlllIliiIll scale, float boxH, float boxY, float font) {
      float var4 = (float)scale.IlIillIiilIi(0, --56615551 - 13 ^ 56615446) - 50.0F;
      return IlIlllIlilIl(boxH + boxY / 2.0F + var4 * font);
   }

   public static float IliIlllilIi(float name, String s, String time) {
      IIliiIlllIliiIll var3 = CorzClient.fontRenderer();
      float var4 = 0.9F * name;
      float var5 = 6.0F * name;
      float var6 = s != null && !s.isEmpty() ? var3.iIlIlllllill(s) * var4 + 6.0F * name : 0.0F;
      return (float)Math.ceil(
         (double)(
            var5
               + 8.0F * name
               + 5.0F * name
               + var6
               + lIiiIiIlilli(var3, time, var4)
               + 2.0F * name
               + var3.iIlIlllllill(IIlllIlliIll<"IIlllIlliIll","OgehAharB+cXTVnEyRG9c3rC+RAFRWYerSBaER4=">()) * 0.8F * name
               + var5
         )
      );
   }

   private static Color IiIlliIliiIl(int argb) {
      Color var1 = (Color)IilIIiIlllilIIiIll.get(argb);
      if (var1 == null) {
         if (IilIIiIlllilIIiIll.size() > (~(565437200 - -87) ^ -565437224)) {
            IilIIiIlllilIIiIll.clear();
         }

         var1 = new Color(argb, true);
         IilIIiIlllilIIiIll.put(argb, var1);
      }

      return var1;
   }

   private static void iIlIlllllill(float accent, float cx, float cy, float fraction, int d) {
      float var5 = IIIiiIillIIiiIil.Illlllllilll();
      float var6 = Math.max(2.0F, (float)Math.round(1.5F * cy / 8.0F / var5)) * var5;
      float var7 = cy / 2.0F - var6 / 2.0F;
      float var8 = IlIlllIlilIl(accent);
      float var9 = IlIlllIlilIl(cx);
      iiiIiIlIIIliIl var10 = new iiiIiIlIIIliIl(var8, var9, 654311423, false, false, true, false);
      var10.iliIiiliiiii(var7, var6);
      var10.Iilllilliill();
      float var11 = Illiiiilllliiiil.lIiiIiIlilli(fraction);
      if (!(var11 <= 0.003F)) {
         iiiIiIlIIIliIl var12 = new iiiIiIlIIIliIl(var8, var9, d, false, false, true, false);
         if (var11 >= 0.997F) {
            var12.iliIiiliiiii(var7, var6);
         } else {
            var12.IIIllIIliIIl(var7, var6, IIliiilllIliiill.iliIiiliiiii(var11), IIliiilllIliiill.IIIllIIliIIl(var11));
         }

         var12.Iilllilliill();
      }
   }

   private static float IlIlllIlilIl(float v) {
      float var1 = IIIiiIillIIiiIil.Illlllllilll();
      return (float)Math.round(v / var1) * var1;
   }

   private static void IilliliilIIi(IIliiIlllIliiIll scale, String x, float font, float c, float s, Color y) {
      float var6 = scale.iIlIlllllill(IIlllIlliIll<"IIlllIlliIll","dq0AwwpY72nhZIqg92LEpL0KzUDAComyoSxBn9A=">()) * s;

      for (int var7 = 0; var7 < x.length(); var7++) {
         char var8 = x.charAt(var7);
         if (var8 >= '0' && var8 <= '9') {
            String var10 = lllIIiIllillIIiIll[var8 - '0'];
            iliIiiliiiii(scale, var10, font + (var6 - scale.iIlIlllllill(var10) * s) / 2.0F, c, s, y);
            font += var6;
         } else {
            String var9 = var8 == '.' ? IIlllIlliIll<"IIlllIlliIll","NvrKV7bQNpKvYrPO7R6Mw7C5WA4YzsJUHr5EcI4=">() : String.valueOf(var8);
            iliIiiliiiii(scale, var9, font, c, s, y);
            font += scale.iIlIlllllill(var9) * s;
         }
      }
   }
}
