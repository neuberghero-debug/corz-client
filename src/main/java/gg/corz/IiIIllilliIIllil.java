package gg.corz;

import com.corz.client.CorzClient;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.awt.Color;
import net.minecraft.class_4587;

public final class IiIIllilliIIllil {
   private static float lliIlliIil = -1.0F;
   private static float IliIlliIil = -1.0F;
   private static final float[] lIiIlliIil = new float[10];
   private static final Int2ObjectOpenHashMap<Color> iIiIlliIil = new Int2ObjectOpenHashMap();
   private static final String[] IIiIlliIil = new String[128];

   public static float IIIllIIliIIl(String s, float y, float scale, float right, int argb) {
      float var5 = IilliliilIIi(s, right);
      iliIiiliiiii(s, llilliilililliil.IIIllIIliIIl(y - var5), scale, right, argb, argb);
      return var5;
   }

   public static float lIiiIiIlilli(String y, float scale, float x, float s, int argb) {
      return iliIiiliiiii(y, scale, x, s, argb, argb);
   }

   static {
      long var1 = -6193320329707492527L;

      for (long var3 = var1 ^ (137438953472L ^ var1) & -1L << 32; (int)(var3 >>> 32) < 128; var3 += 4294967296L) {
         IIiIlliIil[(int)(var3 >>> 32)] = String.valueOf((char)((int)(var3 >>> 32)));
      }
   }

   private static float iIlIlllllill(IIliiIlllIliiIll f) {
      long var4 = 4129510661729582039L;
      float var1 = f.iIlIlllllill(IiIlliIliiIl<"IiIlliIliiIl","FMx8D8uF605Qm0lIlIY8s5KFJ4k0X21HPV2vLEg=">());
      if (var1 != lliIlliIil || IliIlliIil <= 0.0F) {
         lliIlliIil = var1;
         float var2 = 0.0F;

         for (long var6 = var4 ^ (0L ^ var4) & -1L << 32; (int)(var6 >>> 32) < 10; var6 += 4294967296L) {
            lIiIlliIil[(int)(var6 >>> 32)] = f.iIlIlllllill(IIiIlliIil[48 + (int)(var6 >>> 32)]);
            if ((int)(var6 >>> 32) >= 2) {
               var2 = Math.max(var2, lIiIlliIil[(int)(var6 >>> 32)]);
            }
         }

         IliIlliIil = var2;
      }

      return IliIlliIil;
   }

   private static boolean IliIlllilIi(char c) {
      return c >= '0' && c <= '9';
   }

   private static Color IlIlllIlilIl(int argb) {
      Color var1 = (Color)iIiIlliIil.get(argb);
      if (var1 == null) {
         if (iIiIlliIil.size() > 96) {
            iIiIlliIil.clear();
         }

         var1 = new Color(argb, true);
         iIiIlliIil.put(argb, var1);
      }

      return var1;
   }

   private IiIIllilliIIllil() {
   }

   public static float IilliliilIIi(String s, float scale) {
      long var8 = -7329745256713318693L;
      long var10 = -163214672027509384L;
      if (s != null && !s.isEmpty()) {
         IIliiIlllIliiIll var2 = llilliilililliil.IIiilIiiiIii();
         float var3 = iIlIlllllill(var2);
         float var4 = 0.0F;
         var8 ^= ((long)s.length() << 32 ^ var8) & -1L << 32;

         for (long var13 = var8 ^ (0L ^ var8) & -1L >>> 32; (int)var13 < (int)(var13 >>> 32); var13 ^= (var13 ^ var13 + (long)1) & -1L >>> 32) {
            var10 ^= ((long)s.charAt((int)var13) << 32 ^ var10) & -1L << 32;
            var4 += IliIlllilIi((char)((int)(var10 >>> 32))) ? var3 : var2.iIlIlllllill(liiiIIllIl((char)((int)(var10 >>> 32))));
         }

         return var4 * scale;
      } else {
         return 0.0F;
      }
   }

   public static float iliIiiliiiii(String s, float argb, float signArgb, float x, int scale, int y) {
      long var21 = -2981241752521711559L;
      long var23 = 8196604317630992306L;
      if (s != null && !s.isEmpty()) {
         IIliiIlllIliiIll var6 = llilliilililliil.IIiilIiiiIii();
         float var7 = iIlIlllllill(var6);
         Color var8 = IlIlllIlilIl(scale);
         Color var9 = IlIlllIlilIl(y);
         class_4587 var10 = CorzClient.fontManager.liiiIIllIl();
         var10.method_22903();
         lliIIllliliIIlll var11 = null;

         float var15;
         try {
            lliIIllliliIIlll var10000;
            label193: {
               var10.method_22905(x, x, 1.0F);
               if (var6 instanceof lliIIllliliIIlll var12 && var12.IiIIlliIIl()) {
                  var10000 = var12;
                  break label193;
               }

               var10000 = null;
            }

            var11 = var10000;
            float var36 = argb / x;
            float var13 = signArgb / x;
            var21 ^= ((long)s.length() << 32 ^ var21) & -1L << 32;

            for (long var38 = var21 ^ (0L ^ var21) & -1L >>> 32; (int)var38 < (int)(var38 >>> 32); var38 ^= (var38 ^ var38 + (long)1) & -1L >>> 32) {
               var23 ^= ((long)s.charAt((int)var38) << 32 ^ var23) & -1L << 32;
               String var17 = liiiIIllIl((char)((int)(var23 >>> 32)));
               if (IliIlllilIi((char)((int)(var23 >>> 32)))) {
                  var6.IliIlllilIi(var17, var36 + (var7 - lIiIlliIil[(int)(var23 >>> 32) - 48]) / 2.0F, var13, var8);
                  var36 += var7;
               } else {
                  var6.IliIlllilIi(var17, var36, var13, (int)(var23 >>> 32) != 36 && (int)(var23 >>> 32) != 43 && (int)(var23 >>> 32) != 45 ? var8 : var9);
                  var36 += var6.iIlIlllllill(var17);
               }
            }

            var15 = var36 * x - argb;
         } finally {
            try {
               if (var11 != null) {
                  var11.iiIIlIIlIl();
               }
            } finally {
               var10.method_22909();
            }
         }

         return var15;
      } else {
         return 0.0F;
      }
   }

   private static String liiiIIllIl(char c) {
      return c < 128 && IIiIlliIil[c] != null ? IIiIlliIil[c] : String.valueOf(c);
   }
}
