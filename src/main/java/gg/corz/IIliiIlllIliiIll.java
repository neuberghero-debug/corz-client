package gg.corz;

import com.corz.client.CorzClient;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import net.minecraft.class_1011;
import net.minecraft.class_1043;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import org.joml.Matrix4f;

public class IIliiIlllIliiIll implements liIiiIlliiIiiIll {
   private Graphics2D liiiIiilll;
   private final float[] lliiIiilll;
   private class_1011 IlIIliilll;
   private final float iliiIiilll;
   private FontMetrics iiiiIiilll;
   private boolean llIIliilll;
   private final int lIiiIiilll = 32;
   private final float[] IliiIiilll;
   private Font IiiiIiilll;
   private final int lIIIliilll;
   private final class_2960 iIIIliilll;
   private BufferedImage IIIIliilll;
   private final int iIiiIiilll = 255;
   private boolean ilIIliilll;
   public static int IIiiIiilll = 0;

   @Override
   public float IilliliilIIi() {
      return (float)this.IIlilIliiIli(Iilililiiili<"Iilililiiili","5fPqyPdIebWtaHv0opn6qYYItXG1YmqY0xgLX44=">()).getHeight() / 2.0F;
   }

   private void IiIlliIliiIl(class_4587 color, String x, float matrixStack, float color2, Color shadow, Color y, boolean text) {
      color.method_22903();

      try {
         color.method_22905(0.5F, 0.5F, 0.5F);
         if (text) {
            this.IIillIiliIil(color, x, matrixStack + 0.5F, color2 + 0.5F, y);
         }

         this.IIillIiliIil(color, x, matrixStack, color2, shadow);
      } finally {
         color.method_22909();
      }
   }

   public int IlIillIiilIi(int boxY, int boxH) {
      return boxY + (boxH - (int)this.IilliliilIIi()) / 2 - 2;
   }

   private void lIiiIiIlilli() {
      this.IIIIliilll = new BufferedImage(256, 256, 2);
      this.liiiIiilll = this.IIIIliilll.createGraphics();
      this.liiiIiilll
         .setRenderingHint(
            RenderingHints.KEY_TEXT_ANTIALIASING, this.ilIIliilll ? RenderingHints.VALUE_TEXT_ANTIALIAS_ON : RenderingHints.VALUE_TEXT_ANTIALIAS_OFF
         );
      this.liiiIiilll.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
   }

   private Rectangle2D IIlilIliiIli(String text) {
      return this.iiiiIiilll.getStringBounds(text, this.liiiIiilll);
   }

   public IIliiIlllIliiIll(InputStream antialias, float font, boolean fontSize) {
      this(antialias, font, null, fontSize);
   }

   public void IIlllIlliIll(String[] n, float[] xs, int y, float color, Color glyphs) {
      long var7 = 3580300289761799202L;

      for (long var9 = var7 ^ (0L ^ var7) & -1L << 32; (int)(var9 >>> 32) < y; var9 += 4294967296L) {
         this.IliIlllilIi(n[(int)(var9 >>> 32)], xs[(int)(var9 >>> 32)], color, glyphs);
      }
   }

   private void IlIlllIlilIl() {
      if (!this.llIIliilll) {
         if (this.IlIIliilll != null) {
            class_1043 var1 = new class_1043(
               () -> Iilililiiili<"Iilililiiili","dBAT/CoFR2mkr+DhmLRfhsYVFY6mb0DU0bP6IM0XTB8Sdf/xD3I=">() + this.lIIIliilll, this.IlIIliilll
            );
            class_310.method_1551().method_1531().method_4616(this.iIIIliilll, var1);
            this.llIIliilll = true;
         }
      }
   }

   @Override
   public float iIlIlllllill(String text) {
      return (float)this.IIlilIliiIli(IiiIliiliiIlii.liiiIIllIl(text)).getWidth() / 2.0F;
   }

   public String Iiilliiliiil(String text, float maxWidth) {
      if (text != null && !text.isEmpty()) {
         if (this.iIlIlllllill(text) <= maxWidth) {
            return text;
         } else {
            String var3 = text;

            while (var3.length() > 1 && this.iIlIlllllill(var3 + Iilililiiili<"Iilililiiili","M8xPD/IkTSFCn6DbEFl4N6Z6p9lhfTJrAbdXV6ktig==">()) > maxWidth) {
               var3 = var3.substring(0, var3.length() - 1);
            }

            return var3.stripTrailing() + Iilililiiili<"Iilililiiili","M8xPD/IkTSFCn6DbEFl4N6Z6p9lhfTJrAbdXV6ktig==">();
         }
      } else {
         return "";
      }
   }

   private IIliiIlllIliiIll(InputStream antialias, float style, Integer fontSize, boolean font) {
      this.IliiIiilll = new float[223];
      this.lliiIiilll = new float[223];
      this.llIIliilll = false;
      this.ilIIliilll = true;
      this.iliiIiilll = style;
      this.ilIIliilll = font;
      this.lIIIliilll = IIiiIiilll++;
      this.iIIIliilll = class_2960.method_60655(
         Iilililiiili<"Iilililiiili","XQQf564jLcbLzsBQlnggICbn0Ss+wo4NGO4XwrMT2vdlvLAvaxI=">(),
         Iilililiiili<"Iilililiiili","xJ5qCMRzEyv3yCw3/l4hV/0tsq4CacKGPSmlEfMWocz3j8lzq5Ax">() + this.lIIIliilll
      );
      this.lIiiIiIlilli();
      this.iliIiiliiiii(antialias, style, fontSize);
   }

   private void iliIiiliiiii(InputStream size, float style, Integer font) {
      long var7 = -7533568859931299440L;

      try {
         this.IiiiIiilll = Font.createFont(0, size);
         if (font != null) {
            this.IiiiIiilll = this.IiiiIiilll.deriveFont(font, style);
         } else {
            this.IiiiIiilll = this.IiiiIiilll.deriveFont(style);
         }
      } catch (Exception var9) {
         var9.printStackTrace();
      }

      this.liiiIiilll.setFont(this.IiiiIiilll);
      this.liiiIiilll.setColor(new Color(255, 255, 255, 0));
      this.liiiIiilll.fillRect(0, 0, 256, 256);
      this.liiiIiilll.setColor(Color.white);
      this.iiiiIiilll = this.liiiIiilll.getFontMetrics();
      if (this.iiiiIiilll != null) {
         float var4 = 5.0F;
         float var5 = 5.0F;

         for (long var10 = var7 ^ (137438953472L ^ var7) & -1L << 32; (int)(var10 >>> 32) < 255; var10 += 4294967296L) {
            this.liiiIiilll.drawString(String.valueOf((char)((int)(var10 >>> 32))), var4, var5 + (float)this.iiiiIiilll.getAscent());
            this.IliiIiilll[(int)(var10 >>> 32) - 32] = var4;
            this.lliiIiilll[(int)(var10 >>> 32) - 32] = var5 - (float)this.iiiiIiilll.getMaxDescent();
            var4 += (float)this.iiiiIiilll.stringWidth(String.valueOf((char)((int)(var10 >>> 32)))) + 2.0F;
            if (var4 >= (float)(250 - this.iiiiIiilll.getMaxAdvance())) {
               var4 = 5.0F;
               var5 += (float)(this.iiiiIiilll.getMaxAscent() + this.iiiiIiilll.getMaxDescent() + Math.round(this.iliiIiilll / 2.0F));
            }
         }
      }

      this.IIIllIIliIIl(this.IIIIliilll);
   }

   private float Ililllililil(class_287 y, Matrix4f matrix, char buffer, float b, float character, float x, float g, float a, float r) {
      Rectangle2D var10 = this.iiiiIiilll.getStringBounds(String.valueOf(buffer), this.liiiIiilll);
      float var11 = this.IliiIiilll[buffer - ' '];
      float var12 = this.lliiIiilll[buffer - ' '];
      float var13 = (float)var10.getWidth();
      float var14 = (float)var10.getHeight() + (float)this.iiiiIiilll.getMaxDescent() + 1.0F;
      float var15 = 0.0039063F;
      y.method_22918(matrix, b, character + var14, 0.0F).method_22913(var11 * var15, (var12 + var14) * var15).method_22915(x, g, a, r);
      y.method_22918(matrix, b + var13, character + var14, 0.0F).method_22913((var11 + var13) * var15, (var12 + var14) * var15).method_22915(x, g, a, r);
      y.method_22918(matrix, b + var13, character, 0.0F).method_22913((var11 + var13) * var15, var12 * var15).method_22915(x, g, a, r);
      y.method_22918(matrix, b, character, 0.0F).method_22913(var11 * var15, var12 * var15).method_22915(x, g, a, r);
      return b + (float)this.IIlilIliiIli(String.valueOf(buffer)).getWidth();
   }

   public IIliiIlllIliiIll(InputStream fontSize, float font, int style) {
      this(fontSize, font, style, true);
   }

   public float IiIiliIiiiIi() {
      return this.IilliliilIIi() * 0.5F;
   }

   private void IIIllIIliIIl(BufferedImage image) {
      long var8 = -853420029585362602L;
      long var10 = -1285459558656710882L;
      var8 ^= ((long)image.getWidth() << 32 ^ var8) & -1L << 32;
      var8 ^= ((long)image.getHeight() ^ var8) & -1L >>> 32;
      int[] var4 = new int[(int)(var8 >>> 32) * (int)var8];
      image.getRGB(0, 0, (int)(var8 >>> 32), (int)var8, var4, 0, (int)(var8 >>> 32));
      class_1011 var5 = new class_1011((int)(var8 >>> 32), (int)var8, false);
      var10 ^= (0L ^ var10) & -1L << 32;

      while ((int)(var10 >>> 32) < (int)var8) {
         for (var10 ^= (0L ^ var10) & -1L >>> 32; (int)var10 < (int)(var8 >>> 32); var10 ^= (var10 ^ var10 + (long)1) & -1L >>> 32) {
            var5.method_61941((int)var10, (int)(var10 >>> 32), var4[(int)(var10 >>> 32) * (int)(var8 >>> 32) + (int)var10]);
         }

         var10 += 4294967296L;
      }

      this.IlIIliilll = var5;
   }

   protected float IIIilIIiiIIi() {
      return this.iiiiIiilll == null ? this.IilliliilIIi() : (float)(this.iiiiIiilll.getAscent() + this.iiiiIiilll.getMaxDescent()) * 0.5F;
   }

   public IIliiIlllIliiIll(InputStream font, float fontSize) {
      this(font, fontSize, null, true);
   }

   private void Iilllilliill(String color, float text, float shadow, Color y, boolean x) {
      long var7 = 1220616161122713856L;
      color = IiiIliiliiIlii.liiiIIllIl(color);
      var7 ^= ((long)Math.min(187, y.getAlpha()) << 32 ^ var7) & -1L << 32;
      this.IiIlliIliiIl(
         CorzClient.fontManager.liiiIIllIl(), color, text, shadow, y, new Color(0, 0, 0, (int)(var7 >>> 32) == -1 ? y.getAlpha() : (int)(var7 >>> 32)), x
      );
   }

   @Override
   public void liiiIIllIl(String y, float color, float x, Color text) {
      this.Iilllilliill(y, color, x, text, false);
   }

   @Override
   public void IliIlllilIi(String text, float color, float y, Color x) {
      this.Iilllilliill(text, color, y, x, true);
   }

   public void Illlllllilll(String[] texts, float[] n, float[] ys, int color, Color xs) {
      long var7 = 1511182399750085507L;

      for (long var9 = var7 ^ (0L ^ var7) & -1L << 32; (int)(var9 >>> 32) < color; var9 += 4294967296L) {
         this.liiiIIllIl(texts[(int)(var9 >>> 32)], n[(int)(var9 >>> 32)], ys[(int)(var9 >>> 32)], xs);
      }
   }

   private void IIillIiliIil(class_4587 text, String color, float x, float matrixStack, Color y) {
      long var16 = 706795540121233358L;
      long var18 = 6151498613134812165L;
      StringBuilder var6 = new StringBuilder();
      char[] var7 = color.toCharArray();
      var16 ^= ((long)var7.length << 32 ^ var16) & -1L << 32;

      for (long var26 = var16 ^ (0L ^ var16) & -1L >>> 32; (int)var26 < (int)(var26 >>> 32); var26 ^= (var26 ^ var26 + (long)1) & -1L >>> 32) {
         var18 ^= ((long)var7[(int)var26] << 32 ^ var18) & -1L << 32;
         if ((int)(var18 >>> 32) >= 32 && (int)(var18 >>> 32) < 255) {
            var6.append((char)((int)(var18 >>> 32)));
         } else {
            var6.append(Iilililiiili<"Iilililiiili","J4FVzXEPUTk7XVYUiQiYk7lreUdgPFKErhRhx+U=">());
         }
      }

      color = var6.toString();
      if (!color.isEmpty()) {
         x *= 2.0F;
         matrixStack *= 2.0F;
         this.IlIlllIlilIl();
         if (this.llIIliilll) {
            Matrix4f var24 = text.method_23760().method_23761();
            float var8 = (float)y.getRed() / 255.0F;
            float var9 = (float)y.getGreen() / 255.0F;
            float var10 = (float)y.getBlue() / 255.0F;
            float var11 = (float)y.getAlpha() / 255.0F * IliiIilliiIi.ilIlllIIlIiIlllIIl;
            class_287 var12 = class_289.method_1348().method_60827(class_5596.field_27382, class_290.field_1575);
            float var13 = x;

            for (long var27 = var18 ^ (0L ^ var18) & -1L >>> 32; (int)var27 < color.length(); var27 ^= (var27 ^ var27 + (long)1) & -1L >>> 32) {
               try {
                  var13 = this.Ililllililil(var12, var24, color.charAt((int)var27), var13, matrixStack, var8, var9, var10, var11);
               } catch (ArrayIndexOutOfBoundsException var20) {
               }
            }

            IliiIilliiIi.IIIIllIIIl(var12.method_60800(), this.iIIIliilll);
         }
      }
   }
}
