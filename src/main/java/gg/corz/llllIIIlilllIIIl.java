package gg.corz;

import java.awt.Color;
import java.net.URI;
import java.util.List;
import java.util.Locale;
import net.minecraft.class_332;
import net.minecraft.class_4587;
import org.joml.Matrix3x2fStack;

public class llllIIIlilllIIIl {
   private static final float IIIIIIllIl = 10.0F;
   private static final int illIIIllIl = -4000;
   private static final float lIlIIIllIl = 2.5F;
   private static final int lIiiiiIlIl = 24;
   private static final int liliiiIlIl = 2;
   private int ilIlIIllIl;
   private static final String iilIIIllIl = "Corz Radio";
   private IIliliillIliliil[] llllIIllIl;
   private static final String IIiIIIllIl = "On air";
   private static boolean IlIlIIllIl;
   private static final float IiiiiiIlIl = 35.0F;
   private static final String iIiIIIllIl = "Invalid link";
   private static final float lliiiiIlIl = 6.0F;
   private float lillIIllIl;
   private static final float[] IIIlIIllIl = new float[48];
   private static final float iiiiiiIlIl = 11.0F;
   private static final float lIIIIIllIl = 7.0F;
   public static final int illiiiIlIl = 24;
   private boolean IillIIllIl;
   private static final float IIlIIIllIl = 1.5F;
   private static final float liIIIIllIl = 1.3F;
   private static final String lIiIIIllIl = "Coming soon";
   private final iIliililIlliilil lIllIIllIl;
   private final Runnable IlllIIllIl;
   private static final float iIIIIIllIl = 5.0F;
   private static final int iiiIIIllIl = 24;
   private static final float liiiiiIlIl = 47.0F;
   private final lIiiIiiiIiiIii llIlIIllIl;
   private static final String liiIIIllIl = "reload";
   private static final double[] lllIIIllIl = new double[]{0.0, 1.9, 4.1};
   private static final float IiIIIIllIl = 2.0F;
   private int iiIlIIllIl;
   private final IIllIIIllIllIIIl IIllIIllIl = new IIllIIIllIllIIIl();
   private int liIlIIllIl;
   private static final float iliiiiIlIl = 19.0F;
   private static final float[] lIIlIIllIl = new float[2];
   private static final float iIlIIIllIl = 8.0F;
   private static final String IiiIIIllIl = "on:";
   private static final int iIiiiiIlIl = 18;
   private static final float IlIIIIllIl = 12.0F;
   private static final String IliIIIllIl = "No playlist yet";
   private int illlIIllIl;
   private static final String iliIIIllIl = "play:";
   private static final double[] IllIIIllIl = new double[]{7.1, 5.3, 8.6};
   private static final int IliiiiIlIl = 116;
   private static final float iiIIIIllIl = 2.0F;
   private static final float ilIIIIllIl = 0.46F;
   private static final float llIIIIllIl = 1.0F;
   private static final int IIiiiiIlIl = 6;
   public static final int IiliiiIlIl = -1;
   private static final String lliIIIllIl = "card:";
   private final iIIliiIiIlIliiIi iIllIIllIl;
   private static int iIIlIIllIl;
   private static final int iiliiiIlIl = 64;
   private static final String lilIIIllIl = "Staff playlists";
   private static final String IilIIIllIl = "Stations";
   private int IiIlIIllIl;

   private static float IiIlliIliiIl() {
      return 37.5F;
   }

   private void IIillIiliIil(class_332 bx, IIliliillIliliil mx, float my, float ctx, float card, float playable, boolean hover, int by, int on) {
      long var19 = 5737791008591459346L;
      long var21 = 3505930045643595081L;
      long var23 = 6768209395284233350L;
      float var10 = this.lIllIIllIl.IIIllIIliIIl(mx.IlliIIIiil, hover && llilliilililliil.Iliilliiilii((double)by, (double)on, my, ctx, 18.0F, 18.0F));
      float var11 = Math.max(card * 0.55F, var10);
      var19 ^= ((long)llilliilililliil.IIIIllIIIl(IlIIilIlllIIilIl.lliiIlliIl, 0.92F) << 32 ^ var19) & -1L << 32;
      var19 ^= (
            (long)IilIIIIililIIIIi.Illlllllilll(
                  IilIIIIililIIIIi.Illlllllilll(IilIIIIililIIIIi.iliIiiliiiii(), -1, 0.04 + 0.08 * (double)var11),
                  IilIIIIililIIIIi.Illlllllilll((int)(var19 >>> 32), -1, 0.1 * (double)var10),
                  (double)playable
               )
               ^ var19
         )
         & -1L >>> 32;
      var21 ^= (
            (long)IilIIIIililIIIIi.Illlllllilll(
                     IilIIIIililIIIIi.Illlllllilll(IilIIIIililIIIIi.IIillIiliIil(), 1040187391, (double)var11), (int)(var19 >>> 32), (double)playable
                  )
                  << 32
               ^ var21
         )
         & -1L << 32;
      var21 ^= (
            (long)IilIIIIililIIIIi.Illlllllilll(
                  IilIIIIililIIIIi.Illlllllilll(-7630437, -920587, (double)var11), llilliilililliil.Iiiiliiiiiii(), (double)playable
               )
               ^ var21
         )
         & -1L >>> 32;
      var23 ^= ((long)llilliilililliil.IlIlllIlilIl(bx, my + 9.0F, ctx + 9.0F, this.lIllIIllIl.IilliliilIIi(mx.IlliIIIiil, 0.07F)) << 32 ^ var23) & -1L << 32;

      try {
         if (playable > 0.01F) {
            IIIiiIillIIiiIil.IiIlliIliiIl(bx, my, ctx, 18.0F, 18.0F, 9.0F, IilIIIIililIIIIi.IIlllIlliIll(0.2 * (double)playable), 4.0F, 0.5F);
         }

         IIIiiIillIIiiIil.Ililllililil(bx, my, ctx, 18.0F, 18.0F, 9.0F, (int)var19, (int)(var21 >>> 32));
         float var17 = 3.0F;
         iiIlilIlIIllilIl.IliIlllilIi(
            my + var17,
            ctx + var17,
            12.0F,
            12.0F,
            lIlIIiliIlIIil.illIlIilIl(Iilililiiili<"Iilililiiili","VQOZPbJXSRYt+dmEfGmhvco3PTgtH6VegZRQiG2QkLw=">()),
            new Color((int)var21, true),
            IIIiiIillIIiiIil.liiiIIllIl()
         );
      } finally {
         llilliilililliil.IiIlliIliiIl(bx, (boolean)((int)(var23 >>> 32)));
      }
   }

   private float IilliliilIIi() {
      long var2 = -2137671909301019331L;
      if (this.llllIIllIl.length == 0) {
         return 116.0F;
      } else {
         var2 ^= ((long)((this.llllIIllIl.length + 2 - 1) / 2) << 32 ^ var2) & -1L << 32;
         return (float)((int)(var2 >>> 32) * 64 + ((int)(var2 >>> 32) - 1) * 4);
      }
   }

   public int liiiIIllIl() {
      this.lIiiIiIlilli();
      if (this.lillIIllIl < 0.0F) {
         this.lillIIllIl = this.IilliliilIIi();
      }

      return 28 + Math.round(this.lillIIllIl);
   }

   private static void Iilllilliill(class_332 ax, IIliiIlllIliiIll font, IIliliillIliliil card, float ay, float ctx) {
      String var5 = card.lIliIIIiil.iIlIlllllill();
      if (!var5.isEmpty() && IiIiiIIlliIiiIIl.IilliliilIIi(var5) != null) {
         llilliilililliil.lIIIiiIIIi(ax, var5, ay, ctx, 24.0F);
      } else {
         IIIiiIillIIiiIil.Ililllililil(
            ax,
            ay,
            ctx,
            24.0F,
            24.0F,
            6.0F,
            IilIIIIililIIIIi.Illlllllilll(IilIIIIililIIIIi.iliIiiliiiii(), IlIIilIlllIIilIl.lliiIlliIl, 0.16),
            IilIIIIililIIIIi.IIlllIlliIll(0.3)
         );
         llilliilililliil.iiIIlIIlIl(
            card.illiIIIiil,
            ay + (24.0F - card.liiiIIIiil) / 2.0F - 1.3F,
            (float)font.IlIillIiilIi(Math.round(ctx), 24),
            IilIIIIililIIIIi.Illlllllilll(IlIIilIlllIIilIl.lliiIlliIl, -1, 0.25)
         );
      }
   }

   private static void IlIillIiilIi(class_332 ctx) {
      ctx.method_51448().popMatrix();
      IIIiiIillIIiiIil.liiiIIllIl().method_22909();
   }

   private static void IIIilIIiiIIi(class_332 dy, float ctx, float cy, float cx, float scale) {
      class_4587 var5 = IIIiiIillIIiiIil.liiiIIllIl();
      var5.method_22903();
      var5.method_46416(ctx, cy + scale, 0.0F);
      var5.method_22905(cx, cx, 1.0F);
      var5.method_46416(-ctx, -cy, 0.0F);
      Matrix3x2fStack var6 = dy.method_51448();
      var6.pushMatrix();
      var6.translate(ctx, cy + scale);
      var6.scale(cx, cx);
      var6.translate(-ctx, -cy);
   }

   private void IIlllIlliIll(
      class_332 hover, IIliiIlllIliiIll my, IIliliillIliliil cardW, int time, int card, int mx, float ctx, int cardX, int font, double cardY
   ) {
      long var26 = 8687790617405847333L;
      IIIlliIllIIlliIl var12 = cardW.lIliIIIiil;
      var26 ^= ((long)var12.IliIlllilIi() << 32 ^ var26) & -1L << 32;
      float var14 = this.lIllIIllIl.iliIiiliiiii(cardW.llliIIIiil, this.llIlIIllIl.Ililllililil(var12) ? 1.0F : 0.0F, 11.0F);
      Illlllllilll(hover, (float)time, (float)card, (float)mx, ctx, var14);
      float var15 = (float)(time + 6);
      float var16 = (float)(time + mx - 6);
      float var17 = var15 + 24.0F + 7.0F;
      float var18 = var16 - 18.0F;
      float var19 = (float)card + IiIlliIliiIl();
      float var20 = var18 - 5.0F - var15;
      cardW.IliIlllilIi(my, var16 - var17, var20);
      float var21 = IliiIilliiIi.IilliliilIIi((int)(var26 >>> 32) != 0 ? 1.0F : 0.46F);

      try {
         Iilllilliill(hover, my, cardW, var15, (float)(card + 6));
         llilliilililliil.iiIIlIIlIl(cardW.lIiiIIIiil, var17, llilliilililliil.IllIllllIl((float)card + 6.0F, 11.0F, 1.0F), -920587);
         if (!cardW.iIiiIIIiil.isEmpty()) {
            llilliilililliil.iiIilIIlil(hover, cardW.iIiiIIIiil, var17, (float)card + 19.0F, cardW.iiliIIIiil ? IlIIilIlllIIilIl.lliiIlliIl : -5854026);
         }

         llilliilililliil.lIlIliIlIl(
            cardW.IliiIIIiil,
            var15,
            llilliilililliil.IllIllllIl((float)card + 35.0F, 10.0F, 0.82F),
            0.82F,
            IilIIIIililIIIIi.Illlllllilll(-7630437, -5854026, (double)Math.max(ctx, var14))
         );
         this.IIillIiliIil(hover, cardW, var18, var19, ctx, var14, (boolean)((int)(var26 >>> 32)), cardX, font);
      } finally {
         IliiIilliiIi.lIiiIiIlilli(var21);
      }

      float var22 = (float)card + 47.0F;
      if ((int)(var26 >>> 32) == 0) {
         if (var12.IIlllIlliIll()) {
            llilliilililliil.iiIilIIlil(
               hover, Iilililiiili<"Iilililiiili","NsEXZxZT8snAAN2w/GxWPTe0bWNskrnk0hcpz51/qW2QpUWhrOwrRA==">(), var15, var22, -1535700
            );
         } else {
            llilliilililliil.Illillllil(hover, Iilililiiili<"Iilililiiili","PKfvYKLI3evv+bHEWKthS8a8U/10cTvx0jCd5UxqbZB/Zdr3wZG4">(), var15, var22, var20);
         }
      } else {
         if (var14 < 0.998F && !cardW.lliiIIIiil.isEmpty()) {
            float var23 = IliiIilliiIi.IilliliilIIi(1.0F - var14);

            try {
               llilliilililliil.Illillllil(hover, cardW.lliiIIIiil, var15, var22 - 2.0F * var14, var20);
            } finally {
               IliiIilliiIi.lIiiIiIlilli(var23);
            }
         }

         if (var14 > 0.002F) {
            float var40 = IliiIilliiIi.IilliliilIIi(var14);

            try {
               Ililllililil(hover, var15, var22 + 2.0F * (1.0F - var14), cardY);
            } finally {
               IliiIilliiIi.lIiiIiIlilli(var40);
            }
         }
      }
   }

   private static String Iiilliiliiil(String url) {
      if (url.isEmpty()) {
         return "";
      } else if (url.startsWith(Iilililiiili<"Iilililiiili","j47zUfu9gPamtihLh2cI1ud3mg1RF9z2iBplxl6htjNi480I">())) {
         return Iilililiiili<"Iilililiiili","p6r3ntsLK6NJUy8J4Nx+ssqQo1kWfu+x49pjRw/IUa0OYh8=">();
      } else {
         try {
            String var1 = new URI(url).getHost();
            if (var1 == null) {
               return "";
            } else {
               var1 = var1.toLowerCase(Locale.ROOT);
               if (var1.startsWith(Iilililiiili<"Iilililiiili","p8Q0qaCSuhJ1BIYInAkimNdBvhnDSxlqujGjplf90MU=">())) {
                  var1 = var1.substring(4);
               }

               if (var1.endsWith(Iilililiiili<"Iilililiiili","fGQcyykGDupXbTr8E7fvvTUiQZ2gYv4q/3kl4cWKC94okOKHIbv8">())) {
                  return Iilililiiili<"Iilililiiili","p6r3ntsLK6NJUy8J4Nx+ssqQo1kWfu+x49pjRw/IUa0OYh8=">();
               } else if (var1.equals(Iilililiiili<"Iilililiiili","X9Bcn22sniYIcRlsYmokiQz2oPspvQDUEV7PuDqgDM5nEt/Mpyf+5O1WO0TI">())) {
                  return Iilililiiili<"Iilililiiili","jtfsOFz45nLwzO/ujlM7Za5OjDQBOWnnKvLwr1X4PQffl+jITtNG92s=">();
               } else if (var1.endsWith(Iilililiiili<"Iilililiiili","uCEQfK2FBSubecnw3GJXNs2PXI6zYeb/Qa8eyUhSMNHqlWFYqEug">())
                  || var1.equals(Iilililiiili<"Iilililiiili","2Jvxaa7sFJyF+/66gv5HCp0xXBaQd6/fuyl1TpCvA8MypjMz">())) {
                  return Iilililiiili<"Iilililiiili","0dlPdcjXoEMwJnXuUG4cNUhXJjsBKcgoGB/EQ1mQishy0Bk=">();
               } else if (var1.endsWith(Iilililiiili<"Iilililiiili","/fayq5Fe28A4gZwYk8cHqjXBhWPEiEhoR923MZu3Jz3MYsQdI6+MYPXj">())) {
                  return Iilililiiili<"Iilililiiili","ItgBeqY82WiXMdvfuj83cWx5dzISBzALFe8Dw3BFsEk0rj53bXQ=">();
               } else if (var1.equals(Iilililiiili<"Iilililiiili","RoNdHog8r4EAQDzVaEzQ7S0eQ8ZZxiKyFu90Ux7tb0kZsja7vPbeZKr7UA==">())) {
                  return Iilililiiili<"Iilililiiili","VcmJyMHqOOtv0UWwtKhczHSZjOZP6moiHaxutqGzYbs3oQnaKdF9">();
               } else if (var1.endsWith(Iilililiiili<"Iilililiiili","iw5+YF49FBjX/JcWiA0ZWNA33YAC64Z9vPmCsK4EpibdD7wSzGI=">())) {
                  return Iilililiiili<"Iilililiiili","8fcAQIbV6ikiEPfwlPVerXCAvIiWAu2g1lQsVUhk1nx/dw==">();
               } else {
                  return var1.endsWith(Iilililiiili<"Iilililiiili","u1fsVP8p03Iz+6VO74jR8zjDFp4IXpTBa9OrExLBDNM7mlmxUg==">())
                     ? Iilililiiili<"Iilililiiili","iN2rW5x6k/QTmWdFGfKDPyXjkawL5FMLHi2TE0g5/nZe">()
                     : var1;
               }
            }
         } catch (Exception var2) {
            return "";
         }
      }
   }

   private static void Ililllililil(class_332 ctx, float x, float time, double y) {
      long var15 = -4661139991950216200L;
      var15 ^= ((long)IilIIIIililIIIIi.Illlllllilll(IlIIilIlllIIilIl.lliiIlliIl, -1, 0.22) << 32 ^ var15) & -1L << 32;
      float var6 = time + 11.0F - 1.5F;
      float var7 = llilliilililliil.IIIllIIliIIl(3.5F);
      float var8 = llilliilililliil.IIIllIIliIIl(x + 1.0F);

      for (var15 ^= (0L ^ var15) & -1L >>> 32; (int)var15 < IllIIIllIl.length; var15 ^= (var15 ^ var15 + (long)1) & -1L >>> 32) {
         double var10 = 0.5 + 0.5 * Math.sin(y * IllIIIllIl[(int)var15] + lllIIIllIl[(int)var15]);
         double var12 = 0.72 + 0.28 * Math.sin(y * IllIIIllIl[(int)var15] * 0.37 + lllIIIllIl[(int)var15] * 1.7);
         float var14 = 2.5F + 5.5F * (float)(var10 * var12);
         IIIiiIillIIiiIil.IlIlllIlilIl(ctx, var8 + (float)((int)var15) * var7, var6 - var14, 2.0F, var14, 1.0F, (int)(var15 >>> 32));
      }

      llilliilililliil.lIlIliIlIl(
         Iilililiiili<"Iilililiiili","PXhKQYSDHQw+ZeAaH5fzgJAXWqnS3QlsOOVz6I+740dORA==">(),
         var8 + (float)(IllIIIllIl.length - 1) * var7 + 2.0F + 5.0F,
         llilliilililliil.IllIllllIl(time, 11.0F, 0.82F),
         0.82F,
         (int)(var15 >>> 32)
      );
   }

   public static boolean iIlIlllllill(int out, float[] index) {
      if (index == null || index.length < 2) {
         return false;
      } else if (out == -1) {
         if (!IlIlIIllIl) {
            return false;
         } else {
            index[0] = lIIlIIllIl[0];
            index[1] = lIIlIIllIl[1];
            return true;
         }
      } else if (out >= 0 && out < iIIlIIllIl) {
         index[0] = IIIlIIllIl[out * 2];
         index[1] = IIIlIIllIl[out * 2 + 1];
         return true;
      } else {
         return false;
      }
   }

   public llllIIIlilllIIIl(lIiiIiiiIiiIii setting, int w, int h, int x, int y) {
      this.lIllIIllIl = new iIliililIlliilil();
      this.iIllIIllIl = new iIIliiIiIlIliiIi();
      this.IlllIIllIl = this::iliIiiliiiii;
      this.llllIIllIl = new IIliliillIliliil[0];
      this.illlIIllIl = -1;
      this.IillIIllIl = true;
      this.lillIIllIl = -1.0F;
      this.llIlIIllIl = setting;
      this.ilIlIIllIl = w;
      this.IiIlIIllIl = h;
      this.liIlIIllIl = x;
      this.iiIlIIllIl = y;
      this.lIiiIiIlilli();
   }

   private void lIiiIiIlilli() {
      long var6 = -1153348009431828254L;
      var6 ^= ((long)llIliiIiilIliiIi.liiiIIllIl() << 32 ^ var6) & -1L << 32;
      if ((int)(var6 >>> 32) != this.illlIIllIl) {
         this.illlIIllIl = (int)(var6 >>> 32);
         List var2 = this.llIlIIllIl.Iilllilliill();
         IIliliillIliliil[] var3 = new IIliliillIliliil[var2.size()];

         for (long var9 = var6 ^ (0L ^ var6) & -1L >>> 32; (int)var9 < var3.length; var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32) {
            IIliliillIliliil var5 = new IIliliillIliliil((IIIlliIllIIlliIl)var2.get((int)var9), (int)var9);
            var5.IIiiIIIiil = () -> this.IIIllIIliIIl(var5);
            var3[(int)var9] = var5;
         }

         this.llllIIllIl = var3;
         this.lIllIIllIl
            .IIlllIlliIll(
               k -> !k.startsWith(Iilililiiili<"Iilililiiili","cxmOOO1jlrd0pzEnRgiqxP4cvFPzT4QmQ9WScNOENJjX">())
                     && !k.startsWith(Iilililiiili<"Iilililiiili","qcFIq6uFIzc8WQ4pRF7lILKJBTmhddaqeIgJa54Nji0k">())
                     && !k.startsWith(Iilililiiili<"Iilililiiili","8f7qreZCsOqv0Qeq0PTPW9hOckTLCzEbbMsbLr1Scw==">())
            );
         this.IillIIllIl = true;
      }
   }

   public void IliIlllilIi(int h, int w, int x, int y) {
      this.ilIlIIllIl = h;
      this.IiIlIIllIl = w;
      this.liIlIIllIl = x;
      this.iiIlIIllIl = y;
   }

   private void iliIiiliiiii() {
      long var2 = 1736327843635154017L;
      llIliiIiilIliiIi.lIiiIiIlilli();
      this.lIllIIllIl.iIlIlllllill(Iilililiiili<"Iilililiiili","QFzrsriZ1w0iMRDD7jUdfKUhHgvc2xa6RaA11Qs5TMXRnA==">());
      var2 ^= ((long)llIliiIiilIliiIi.IliIlllilIi().size() << 32 ^ var2) & -1L << 32;
      if (llIliiIiilIliiIi.IilliliilIIi()) {
         Iliiiiilliiiii.IliIlllilIi()
            .iIlIlllllill(
               Iilililiiili<"Iilililiiili","cyFSxUA78qjpvj7tNutdxD9nF6jCLEObIOHYZlTAt+9HtIEpEWc=">(),
               Iilililiiili<"Iilililiiili","jiR5WVNg+uAAwMRexHiaeZwnZxzLjQDveXz5YND6OJwRZf8yJ29PJJAWtnkc3vgzZQ==">(),
               false
            );
      } else if ((int)(var2 >>> 32) == 0) {
         Iliiiiilliiiii.IliIlllilIi()
            .iIlIlllllill(
               Iilililiiili<"Iilililiiili","cyFSxUA78qjpvj7tNutdxD9nF6jCLEObIOHYZlTAt+9HtIEpEWc=">(),
               Iilililiiili<"Iilililiiili","JdUNeRURNoXsJpBQ4cHDQgU51dAuIse6BAHKtiQs9IxNS372f5gyDeeYFGYp">(),
               false
            );
      } else {
         Iliiiiilliiiii.IliIlllilIi()
            .iIlIlllllill(
               Iilililiiili<"Iilililiiili","cyFSxUA78qjpvj7tNutdxD9nF6jCLEObIOHYZlTAt+9HtIEpEWc=">(),
               (int)(var2 >>> 32) == 1
                  ? Iilililiiili<"Iilililiiili","yqebZMq4TH8HrKbWjeZaq11SAZYC5blsUhhFPQ2gQh4HPkO5n3wPomW3r7M=">()
                  : (int)(var2 >>> 32) + Iilililiiili<"Iilililiiili","Uy3IOemhEQiLFZd1u19CU2kC0wTgNulHagUDdY5tAG/LdN2g65RlkgyQ2Ik=">(),
               true
            );
      }
   }

   private void IIIllIIliIIl(IIliliillIliliil card) {
      IIIlliIllIIlliIl var2 = card.lIliIIIiil;
      if (var2.IliIlllilIi()) {
         if (!llIliiIiilIliiIi.iliIiiliiiii(var2)) {
            Iliiiiilliiiii.IliIlllilIi()
               .iIlIlllllill(
                  Iilililiiili<"Iilililiiili","cyFSxUA78qjpvj7tNutdxD9nF6jCLEObIOHYZlTAt+9HtIEpEWc=">(),
                  Iilililiiili<"Iilililiiili","H5CtyFK4n5awirGVftHIIKWFTIgOewELtFsPdx8hV3h6NWoAm7nTknoJ">() + var2.liiiIIllIl(),
                  false
               );
         } else {
            this.llIlIIllIl.Iiilliiliiil(var2.IiIlliIliiIl());
            this.lIllIIllIl.iIlIlllllill(card.IlliIIIiil);
            Iliiiiilliiiii.IliIlllilIi()
               .iIlIlllllill(
                  Iilililiiili<"Iilililiiili","cyFSxUA78qjpvj7tNutdxD9nF6jCLEObIOHYZlTAt+9HtIEpEWc=">(),
                  Iilililiiili<"Iilililiiili","KOahvpjKSxbg19P+MTF/pasaoKJoEgkw1N4YfdVXASyRRq2idQ==">() + var2.liiiIIllIl(),
                  true
               );
         }
      }
   }

   private static void Illlllllilll(class_332 w, float hover, float ctx, float x, float on, float y) {
      long var8 = 459972903550421686L;
      var8 ^= (
            (long)IilIIIIililIIIIi.Illlllllilll(
                     IilIIIIililIIIIi.Illlllllilll(IilIIIIililIIIIi.iliIiiliiiii(), -1, 0.025 + 0.04 * (double)on),
                     IlIIilIlllIIilIl.lliiIlliIl,
                     0.07 * (double)y
                  )
                  << 32
               ^ var8
         )
         & -1L << 32;
      var8 ^= (
            (long)IilIIIIililIIIIi.Illlllllilll(
                  IilIIIIililIIIIi.Illlllllilll(IilIIIIililIIIIi.IIillIiliIil(), 1040187391, 0.6 * (double)on), IilIIIIililIIIIi.IIlllIlliIll(0.62), (double)y
               )
               ^ var8
         )
         & -1L >>> 32;
      if (y > 0.02F && !IilIIIIililIIIIi.liiiIIllIl()) {
         IIIiiIillIIiiIil.IIlllIlliIll(w, hover, ctx, x, 64.0F, 7.0F, IilIIIIililIIIIi.IIlllIlliIll(0.2 * (double)y), 3.0F, 0.85F);
      }

      IIIiiIillIIiiIil.Ililllililil(w, hover, ctx, x, 64.0F, 7.0F, (int)(var8 >>> 32), (int)var8);
   }

   public void IlIlllIlilIl(class_332 mx, int ctx, int my) {
      long var33 = 5457035513196422799L;
      long var35 = -4389955635984783381L;
      long var37 = -5889986770709888777L;
      long var39 = -4577333302715061840L;
      long var31 = -4483352507621157738L;
      this.lIiiIiIlilli();
      this.IIllIIllIl.IliIlllilIi();
      float var4 = this.IilliliilIIi();
      this.lillIIllIl = this.lillIIllIl < 0.0F
         ? var4
         : (float)IiiIIIIlliiIIIIl.iIlIlllllill((double)this.lillIIllIl, (double)var4, 16.0, llIilillilIilill.liiiIIllIl());
      if (Math.abs(this.lillIIllIl - var4) < 0.5F) {
         this.lillIIllIl = var4;
      }

      var31 ^= ((long)this.iIllIIllIl.iIlIlllllill() << 32 ^ var31) & -1L << 32;
      if ((int)(var31 >>> 32) != 0 || this.IillIIllIl) {
         this.iIllIIllIl.IliIlllilIi();
      }

      this.IillIIllIl = false;
      float var6 = llilliilililliil.IiiIlliiIl(
         mx, Iilililiiili<"Iilililiiili","yA1L0dj8NY65nfNsRy83WM4tYGPhMxjdcYydLU/zxpWyetAw">(), (float)this.ilIlIIllIl, (float)this.IiIlIIllIl, 22.0F
      );
      llilliilililliil.lIlIliIlIl(
         Iilililiiili<"Iilililiiili","CcjWg2NDYMAGs4E8mh5JgKkVJf2ZGB0YNe4qXfYKZuZZhWd97mWnkRkbqw==">(),
         var6 + 6.0F,
         llilliilililliil.IllIllllIl((float)this.IiIlIIllIl, 22.0F, 0.82F) + 1.25F,
         0.82F,
         -7630437
      );
      float var7 = 18.0F;
      float var8 = (float)(this.ilIlIIllIl + this.liIlIIllIl) - var7;
      float var9 = (float)this.IiIlIIllIl + (22.0F - var7) / 2.0F;
      llilliilililliil.IIllllIlll(
         mx,
         this.IIllIIllIl,
         this.lIllIIllIl,
         Iilililiiili<"Iilililiiili","QFzrsriZ1w0iMRDD7jUdfKUhHgvc2xa6RaA11Qs5TMXRnA==">(),
         lIlIIiliIlIIil.IIIilIIiiIIi(),
         var8,
         var9,
         var7,
         12.0F,
         ctx,
         my,
         false,
         this.IlllIIllIl
      );
      lIIlIIllIl[0] = var8 + var7 / 2.0F;
      lIIlIIllIl[1] = var9 + var7 / 2.0F;
      IlIlIIllIl = true;
      var31 ^= ((long)(this.IiIlIIllIl + 22 + 6) ^ var31) & -1L >>> 32;
      iIIlIIllIl = 0;
      if (this.llllIIllIl.length == 0) {
         llilliilililliil.IilIililIi(
            mx,
            this.IIllIIllIl,
            this.lIllIIllIl,
            Iilililiiili<"Iilililiiili","3g3UuS32QMkOwyCo7aYMGeiNgmHfR8Mq0YD+tTEI3mIX">(),
            (float)this.ilIlIIllIl,
            (float)((int)var31),
            (float)this.liIlIIllIl,
            116.0F,
            lIlIIiliIlIIil.illIlIilIl(Iilililiiili<"Iilililiiili","5xS1kWw/Q+HivCUPcfVb2bwd2TETuv1CPxAbX9pqmuOY18dYjw==">()),
            Iilililiiili<"Iilililiiili","XZYMKOqSOSsxGHqQOPguI+gnQSBLelNlwjRxfaLySrn5uA0le5dgEdCL9Q==">(),
            Iilililiiili<"Iilililiiili","GPY9TMwzfOXOaW7Tl8OeRPtrlWHP+pbsZGjiYmNodbn4QJPh0pN+qLCMPRruOHokybjQDsK2vQrEKOuA1roJln3N">(),
            Iilililiiili<"Iilililiiili","8ynb9kYnmfLVjEcATVnPG9hARUdDIuHgcsAEEuCal+manA==">(),
            ctx,
            my,
            this.IlllIIllIl
         );
      } else {
         IIliiIlllIliiIll var11 = llilliilililliil.IIiilIiiiIii();
         double var12 = (double)System.nanoTime() / 1.0E9;
         var33 ^= (0L ^ var33) & -1L << 32;

         while ((int)(var33 >>> 32) < this.llllIIllIl.length) {
            IIliliillIliliil var15 = this.llllIIllIl[(int)(var33 >>> 32)];
            var33 ^= ((long)((int)(var33 >>> 32) % 2) ^ var33) & -1L >>> 32;
            var35 ^= ((long)llilliilililliil.iIiIlIliIl(this.ilIlIIllIl, this.liIlIIllIl, 2, 4, (int)var33) << 32 ^ var35) & -1L << 32;
            var35 ^= ((long)llilliilililliil.lliIliliIl(this.ilIlIIllIl, this.liIlIIllIl, 2, 4, (int)var33) ^ var35) & -1L >>> 32;
            var37 ^= ((long)((int)var31 + (int)(var33 >>> 32) / 2 * 68) << 32 ^ var37) & -1L << 32;
            if ((int)(var33 >>> 32) < 24) {
               IIIlIIllIl[(int)(var33 >>> 32) * 2] = (float)((int)(var35 >>> 32) + (int)var35 - 6) - 9.0F;
               IIIlIIllIl[(int)(var33 >>> 32) * 2 + 1] = (float)((int)(var37 >>> 32)) + IiIlliIliiIl() + 9.0F;
               iIIlIIllIl = (int)(var33 >>> 32) + 1;
            }

            iIIliiIiIlIliiIi var20 = this.iIllIIllIl.lIiiIiIlilli((int)(var33 >>> 32));
            if (!var20.iliIiiliiiii()) {
               float var21 = var20.IiilIIIlIi;
               float var22 = var20.liilIIIlIi;
               var37 ^= ((long)var15.lIliIIIiil.IliIlllilIi() ^ var37) & -1L >>> 32;
               long var59 = var39 ^ ((long)((int)var37 != 0 && var20.lIIiIIIlIi ? 1 : 0) << 32 ^ var39) & -1L << 32;
               var39 = var59 ^ ((long)((int)var37 != 0 && var20.IIIiIIIlIi ? ctx : -4000) ^ var59) & -1L >>> 32;
               float var26 = this.lIllIIllIl
                  .IIIllIIliIIl(
                     var15.iIliIIIiil,
                     llilliilililliil.Iliilliiilii(
                        (double)((int)var39), (double)my, (float)((int)(var35 >>> 32)), (float)((int)(var37 >>> 32)), (float)((int)var35), 64.0F
                     )
                  );
               IIIilIIiiIIi(
                  mx,
                  (float)((int)(var35 >>> 32)) + (float)((int)var35) / 2.0F,
                  (float)((int)(var37 >>> 32)) + 32.0F,
                  var20.iiilIIIlIi * this.lIllIIllIl.IilliliilIIi(var15.iIliIIIiil, 0.025F),
                  -1.0F * var26
               );

               try {
                  if (var21 > 0.004F) {
                     float var27 = IliiIilliiIi.IilliliilIIi(var21);

                     try {
                        Illlllllilll(mx, (float)((int)(var35 >>> 32)), (float)((int)(var37 >>> 32)), (float)((int)var35), 0.0F, 0.0F);
                     } finally {
                        IliiIilliiIi.lIiiIiIlilli(var27);
                     }
                  }

                  if (var22 > 0.002F) {
                     float var53 = IliiIilliiIi.IilliliilIIi(var22);

                     try {
                        this.IIlllIlliIll(mx, var11, var15, (int)(var35 >>> 32), (int)(var37 >>> 32), (int)var35, var26, (int)var39, my, var12);
                     } finally {
                        IliiIilliiIi.lIiiIiIlilli(var53);
                     }
                  }
               } finally {
                  IlIillIiilIi(mx);
               }

               if ((int)(var39 >>> 32) != 0) {
                  this.IIllIIllIl
                     .iIlIlllllill(
                        (float)((int)(var35 >>> 32)),
                        (float)((int)(var37 >>> 32)),
                        (float)((int)var35),
                        64.0F,
                        var15.IIiiIIIiil,
                        this.lIllIIllIl,
                        var15.iIliIIIiil
                     );
               }
            }

            var33 += 4294967296L;
         }
      }
   }

   public boolean IiIiliIiiiIi(double my, double mx, int btn) {
      return btn == 0 && this.IIllIIllIl.IilliliilIIi(my, mx);
   }
}
