package gg.corz;

import com.corz.client.CorzClient;
import com.google.gson.Gson;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import java.awt.Color;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.class_1011;
import net.minecraft.class_1043;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import org.joml.Matrix4f;

public class lliIIllliliIIlll extends IIliiIlllIliiIll {
   private float iliiIIIill;
   private static float liliIIIill;
   private static final iiIlllllIIllllll[] llliIIIill = new iiIlllllIIllllll[256];
   private static iiIlllllIIllllll illiIIIill;
   private static class_1011 IIiiIIIill;
   private static boolean lIiiIIIill = false;
   private boolean IIIIlIIill;
   private final boolean liiiIIIill;
   private float lliiIIIill;
   private static final class_2960 lIliIIIill = class_2960.method_60655(
      lIiiIiIlilli<"lIiiIiIlilli","V3wFq5PPQBhEOiy7kPbbAH2W+tXxq7jJ/vTXlTwCA55KA+zkjtw=">(),
      lIiiIiIlilli<"lIiiIiIlilli","Vdw5E8giYP/8KGEU1QU8ahJiQiDiWvXrw3jWDSv+Bf8rDwy4d5PPKshb/JPNOA==">()
   );
   private static float iiliIIIill;
   private static final float lIIIlIIill = 0.716F;
   private static final String IIliIIIill = "The quick brown fox ABCDEFGHIJKLMNOPQRSTUVWXYZ abcdefghijklmnopqrstuvwxyz 0123456789";
   private static boolean iIiiIIIill = false;
   private static boolean IiliIIIill;
   private static final Map<Long, Float> IlliIIIill = new HashMap<>();
   private static final float iiIiIIIill = 1.0F;
   private class_287 iiiiIIIill;
   private static final Map<Integer, iiIlllllIIllllll> iIliIIIill = new HashMap<>();
   private float IiiiIIIill;
   private static boolean IliiIIIill = false;

   private void llIIlilIIl(String[] y, float[] xs, float[] n, float ys, int texts, Color color) {
      long var16 = 9030899565114881353L;
      class_4587 var7 = CorzClient.fontManager.liiiIIllIl();
      Matrix4f var8 = var7.method_23760().method_23761();
      float var9 = (float)color.getRed() / 255.0F;
      float var10 = (float)color.getGreen() / 255.0F;
      float var11 = (float)color.getBlue() / 255.0F;
      float var12 = (float)color.getAlpha() / 255.0F * IliiIilliiIi.ilIlllIIlIiIlllIIl;
      class_287 var13 = this.IIIIlIIill ? this.iiiiIIIill : null;

      for (long var18 = var16 ^ (0L ^ var16) & -1L << 32; (int)(var18 >>> 32) < texts; var18 += 4294967296L) {
         String var15 = IiiIliiliiIlii.liiiIIllIl(y[(int)(var18 >>> 32)]);
         if (var15 != null && !var15.isEmpty()) {
            IIIIllIIIl();
            if (!IliiIIIill) {
               break;
            }

            var13 = this.IllIllllIl(var13, var8, var15, xs[(int)(var18 >>> 32)], n == null ? ys : n[(int)(var18 >>> 32)], var9, var10, var11, var12);
         }
      }

      if (this.IIIIlIIill) {
         this.iiiiIIIill = var13;
      } else {
         if (var13 != null) {
            IliiIilliiIi.llIIlilIIl(var13.method_60800(), lIliIIIill);
         }
      }
   }

   public lliIIllliliIIlll(float fontSize) {
      long var5 = 3183958711673089144L;
      super(Iilililiiili(), fontSize);

      try {
         IIiilIiiiIii();
         float var3 = super.iIlIlllllill(
            lIiiIiIlilli<"lIiiIiIlilli","vqVjmRbveEYvAipfLSTwhCS3XN03ObiZ1qbORzDYUY6a92Kc6u+vBjTfpdxyRrwZAFexiUTkdPFlIoiRrYLebaGyED4FGGytTt8dqqnLY/zBMj7B8wQjc39WHNAoYFaFN7RF+yk2OBrcP/BjfLaFzg==">()
         );
         float var4 = Iiiiliiiiiii(
            lIiiIiIlilli<"lIiiIiIlilli","vqVjmRbveEYvAipfLSTwhCS3XN03ObiZ1qbORzDYUY6a92Kc6u+vBjTfpdxyRrwZAFexiUTkdPFlIoiRrYLebaGyED4FGGytTt8dqqnLY/zBMj7B8wQjc39WHNAoYFaFN7RF+yk2OBrcP/BjfLaFzg==">()
         );
         this.lliiIIIill = (var4 > 0.0F ? var3 / var4 : super.IilliliilIIi() / liliIIIill) * 1.0F;
         this.iliiIIIill = super.IilliliilIIi();
         this.IiiiIIIill = this.IIIilIIiiIIi();
         var5 ^= ((long)(!iIiiIIIill ? 1 : 0) << 32 ^ var5) & -1L << 32;
      } catch (Throwable var7) {
         var7.printStackTrace();
         var5 ^= (0L ^ var5) & -1L << 32;
      }

      this.liiiIIIill = (boolean)((int)(var5 >>> 32));
   }

   @Override
   public float IiIiliIiiiIi() {
      return this.liiiIIIill ? 0.716F * this.lliiIIIill : super.IiIiliIiiiIi();
   }

   @Override
   public void IIlllIlliIll(String[] n, float[] y, int xs, float color, Color glyphs) {
      if (!this.liiiIIIill) {
         super.IIlllIlliIll(n, y, xs, color, glyphs);
      } else {
         this.llIIlilIIl(n, y, null, color, xs, glyphs);
      }
   }

   @Override
   public void IliIlllilIi(String text, float y, float x, Color color) {
      this.iIIIlIlIIl(text, y, x, color);
   }

   public void iiIIlIIlIl() {
      class_287 var1 = this.iiiiIIIill;
      this.IIIIlIIill = false;
      this.iiiiIIIill = null;
      if (var1 != null) {
         IliiIilliiIi.llIIlilIIl(var1.method_60800(), lIliIIIill);
      }
   }

   @Override
   public void Illlllllilll(String[] ys, float[] n, float[] color, int xs, Color texts) {
      if (!this.liiiIIIill) {
         super.Illlllllilll(ys, n, color, xs, texts);
      } else {
         this.llIIlilIIl(ys, n, color, 0.0F, xs, texts);
      }
   }

   public boolean IiIIlliIIl() {
      if (this.liiiIIIill && !this.IIIIlIIill) {
         this.IIIIlIIill = true;
         this.iiiiIIIill = null;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public int IlIillIiilIi(int boxH, int boxY) {
      return !this.liiiIIIill
         ? super.IlIillIiilIi(boxH, boxY)
         : Math.round((float)boxH + (float)boxY / 2.0F - (this.IiiiIIIill - 0.716F * this.lliiIIIill / 2.0F));
   }

   private static long Iliilliiilii(int right, int left) {
      return (long)right << 32 | (long)left & 4294967295L;
   }

   @Override
   public float iIlIlllllill(String text) {
      long var8 = -3843161420703016138L;
      long var10 = -7797749430526162356L;
      text = IiiIliiliiIlii.liiiIIllIl(text);
      if (!this.liiiIIIill) {
         return super.iIlIlllllill(text);
      } else if (text != null && !text.isEmpty()) {
         float var2 = 0.0F;
         var8 ^= (-4294967296L ^ var8) & -1L << 32;
         var8 ^= (0L ^ var8) & -1L >>> 32;

         while ((int)var8 < text.length()) {
            var10 ^= ((long)text.charAt((int)var8) << 32 ^ var10) & -1L << 32;
            iiIlllllIIllllll var6 = lIlIliIlIl((int)(var10 >>> 32));
            if (var6 == null) {
               var8 ^= ((long)((int)(var10 >>> 32)) << 32 ^ var8) & -1L << 32;
            } else {
               if (IiliIIIill && (int)(var8 >>> 32) != -1) {
                  Float var7 = IlliIIIill.get(Iliilliiilii((int)(var8 >>> 32), (int)(var10 >>> 32)));
                  if (var7 != null) {
                     var2 += var7 * this.lliiIIIill;
                  }
               }

               var2 += var6.liiIIiIill * this.lliiIIIill;
               var8 ^= ((long)((int)(var10 >>> 32)) << 32 ^ var8) & -1L << 32;
            }

            var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32;
         }

         return var2;
      } else {
         return 0.0F;
      }
   }

   @Override
   public float IilliliilIIi() {
      return this.liiiIIIill ? this.iliiIIIill : super.IilliliilIIi();
   }

   private static iiIlllllIIllllll lIlIliIlIl(int cp) {
      iiIlllllIIllllll var1 = cp < 256 ? llliIIIill[cp] : iIliIIIill.get(cp);
      if (var1 == null && cp != 32) {
         var1 = illiIIIill;
      }

      return var1;
   }

   private static synchronized void IIiilIiiiIii() {
      long var6 = -6273875737671404040L;
      if (!lIiiIIIill && !iIiiIIIill) {
         try {
            lIiiiiIiiIiiiiIi var0;
            try (InputStream var1 = CorzClient.class
                  .getClassLoader()
                  .getResourceAsStream(
                     lIiiIiIlilli<"lIiiIiIlilli","GCvZAIYuTugm3gq4xr3rOAaBBuMhQVpHJdTPV6YNUo6++9J1+TTa6HrQHY/s16BWHcIVjFA/bdT4p8HIw6M7Eq4=">()
                  )) {
               if (var1 == null) {
                  throw new IllegalStateException(
                     lIiiIiIlilli<"lIiiIiIlilli","lfGMq+Fu3NANEIE7HBkMYnBpss5LYq23HORaqe26l4uixJWwfgTZ217PGaFVns7cQIW15ImgSlgG82SFpSHHLg==">()
                  );
               }

               var0 = (lIiiiiIiiIiiiiIi)new Gson().fromJson(new InputStreamReader(var1, StandardCharsets.UTF_8), lIiiiiIiiIiiiiIi.class);
            }

            if (var0 != null && var0.IliliIIlIi != null && var0.lliliIIlIi != null && var0.ililiIIlIi != null) {
               liliIIIill = var0.lliliIIlIi.llliiIIill;
               iiliIIIill = var0.lliliIIlIi.illiiIIill;
               float var13 = var0.IliliIIlIi.IllllIIlIi;
               float var2 = var0.IliliIIlIi.lllllIIlIi;

               for (illlliilIillliil var4 : var0.ililiIIlIi) {
                  iIliIIIill.put(var4.IiIlIiilil, new iiIlllllIIllllll(var4, var13, var2));
               }

               if (var0.IiiliIIlIi != null) {
                  for (iIIIlIIiIlIIlIIi var16 : var0.IiiliIIlIi) {
                     IlliIIIill.put(Iliilliiilii(var16.IlliIlliil, var16.llliIlliil), var16.illiIlliil);
                  }
               }

               for (long var17 = var6 ^ (0L ^ var6) & -1L << 32; (int)(var17 >>> 32) < llliIIIill.length; var17 += 4294967296L) {
                  llliIIIill[(int)(var17 >>> 32)] = iIliIIIill.get((int)(var17 >>> 32));
               }

               illiIIIill = iIliIIIill.get(63);
               IiliIIIill = !IlliIIIill.isEmpty();

               try (InputStream var15 = CorzClient.class
                     .getClassLoader()
                     .getResourceAsStream(
                        lIiiIiIlilli<"lIiiIiIlilli","Vdpl7/uGUbYJyEroV8XAap5eyHYtxQ+T+eO7MSqB30FBYwORA/uqkfvPgUQpGXy6fqstJ18+EkuZVpBj09eaNw==">()
                     )) {
                  if (var15 == null) {
                     throw new IllegalStateException(
                        lIiiIiIlilli<"lIiiIiIlilli","unYdAnAfkO9cDw3BpjOnzUzhqOrox81rhpIWxbXO35AoTl2YGf+P0zmuOTsDXFuMIgrFL5X2783L2Sbm95fo">()
                     );
                  }

                  IIiiIIIill = class_1011.method_4309(var15);
               }

               lIiiIIIill = true;
            } else {
               throw new IllegalStateException(lIiiIiIlilli<"lIiiIiIlilli","7VNU8+eR1nWijjhplDFEauJ3QZB2mQvqgi5/gPpzwsKUz6ABCb74FDqrhlVsMVBFc5q5FbEc">());
            }
         } catch (Throwable var12) {
            iIiiIIIill = true;
            throw var12;
         }
      }
   }

   private void iIIIlIlIIl(String x, float y, float text, Color color) {
      x = IiiIliiliiIlii.liiiIIllIl(x);
      if (!this.liiiIIIill) {
         super.IliIlllilIi(x, y, text, color);
      } else if (x != null && !x.isEmpty()) {
         IIIIllIIIl();
         if (IliiIIIill) {
            class_4587 var5 = CorzClient.fontManager.liiiIIllIl();
            Matrix4f var6 = var5.method_23760().method_23761();
            float var7 = (float)color.getRed() / 255.0F;
            float var8 = (float)color.getGreen() / 255.0F;
            float var9 = (float)color.getBlue() / 255.0F;
            float var10 = (float)color.getAlpha() / 255.0F * IliiIilliiIi.ilIlllIIlIiIlllIIl;
            class_287 var11 = this.IllIllllIl(this.IIIIlIIill ? this.iiiiIIIill : null, var6, x, y, text, var7, var8, var9, var10);
            if (this.IIIIlIIill) {
               this.iiiiIIIill = var11;
            } else {
               if (var11 != null) {
                  IliiIilliiIi.llIIlilIIl(var11.method_60800(), lIliIIIill);
               }
            }
         }
      }
   }

   private class_287 IllIllllIl(class_287 text, Matrix4f b, String x, float r, float buffer, float a, float matrix, float y, float g) {
      long var20 = 8328927729748599911L;
      long var22 = 1487365848118403161L;
      float var10 = buffer + this.IiiiIIIill;
      float var11 = r;
      var20 ^= (-4294967296L ^ var20) & -1L << 32;
      var20 ^= (0L ^ var20) & -1L >>> 32;

      while ((int)var20 < x.length()) {
         var22 ^= ((long)x.charAt((int)var20) << 32 ^ var22) & -1L << 32;
         iiIlllllIIllllll var15 = lIlIliIlIl((int)(var22 >>> 32));
         if (var15 == null) {
            var20 ^= ((long)((int)(var22 >>> 32)) << 32 ^ var20) & -1L << 32;
         } else {
            if (IiliIIIill && (int)(var20 >>> 32) != -1) {
               Float var16 = IlliIIIill.get(Iliilliiilii((int)(var20 >>> 32), (int)(var22 >>> 32)));
               if (var16 != null) {
                  var11 += var16 * this.lliiIIIill;
               }
            }

            if (var15.IliIlllilIi()) {
               if (text == null) {
                  text = class_289.method_1348().method_60827(class_5596.field_27382, class_290.field_1575);
               }

               float var17 = var10 - var15.IiiIIiIill * this.lliiIIIill;
               float var18 = var15.lliIIiIill * this.lliiIIIill;
               float var19 = var15.iliIIiIill * this.lliiIIIill;
               text.method_22918(b, var11, var17 + var19, 0.0F).method_22913(var15.IIiIIiIill, var15.IliIIiIill).method_22915(a, matrix, y, g);
               text.method_22918(b, var11 + var18, var17 + var19, 0.0F).method_22913(var15.lIiIIiIill, var15.IliIIiIill).method_22915(a, matrix, y, g);
               text.method_22918(b, var11 + var18, var17, 0.0F).method_22913(var15.lIiIIiIill, var15.iIiIIiIill).method_22915(a, matrix, y, g);
               text.method_22918(b, var11, var17, 0.0F).method_22913(var15.IIiIIiIill, var15.iIiIIiIill).method_22915(a, matrix, y, g);
            }

            var11 += var15.liiIIiIill * this.lliiIIIill;
            var20 ^= ((long)((int)(var22 >>> 32)) << 32 ^ var20) & -1L << 32;
         }

         var20 ^= (var20 ^ var20 + (long)1) & -1L >>> 32;
      }

      return text;
   }

   private static InputStream Iilililiiili() {
      return CorzClient.class
         .getClassLoader()
         .getResourceAsStream(lIiiIiIlilli<"lIiiIiIlilli","g65aSS5RhLF1NfbocrOj8ocI6gSAmBl3Ss26+IYS6D6bsBFFdddRi3kQKMWRAtkPg6ZyDULYS2+yvHI=">());
   }

   @Override
   public void liiiIIllIl(String y, float text, float x, Color color) {
      this.iIIIlIlIIl(y, text, x, color);
   }

   private static float Iiiiliiiiiii(String text) {
      long var7 = 5351677862323796043L;
      long var9 = 8578228552994979654L;
      float var1 = 0.0F;
      var7 ^= (-4294967296L ^ var7) & -1L << 32;
      var7 ^= (0L ^ var7) & -1L >>> 32;

      while ((int)var7 < text.length()) {
         var9 ^= ((long)text.charAt((int)var7) << 32 ^ var9) & -1L << 32;
         iiIlllllIIllllll var5 = iIliIIIill.get((int)(var9 >>> 32));
         if (var5 == null && (int)(var9 >>> 32) != 32) {
            var5 = iIliIIIill.get(63);
         }

         if (var5 == null) {
            var7 ^= ((long)((int)(var9 >>> 32)) << 32 ^ var7) & -1L << 32;
         } else {
            if ((int)(var7 >>> 32) != -1) {
               Float var6 = IlliIIIill.get(Iliilliiilii((int)(var7 >>> 32), (int)(var9 >>> 32)));
               if (var6 != null) {
                  var1 += var6;
               }
            }

            var1 += var5.liiIIiIill;
            var7 ^= ((long)((int)(var9 >>> 32)) << 32 ^ var7) & -1L << 32;
         }

         var7 ^= (var7 ^ var7 + (long)1) & -1L >>> 32;
      }

      return var1;
   }

   private static void IIIIllIIIl() {
      if (!IliiIIIill && IIiiIIIill != null) {
         class_1043 var0 = new class_1043(() -> lIiiIiIlilli<"lIiiIiIlilli","jIImcXH3Ip12poa3yuxshoJBElEf/OyIYuDAQNBC/fJBJIvOFBCRDdI1u7MgUg==">(), IIiiIIIill);
         class_310.method_1551().method_1531().method_4616(lIliIIIill, var0);
         IliiIIIill = true;
      }
   }
}
