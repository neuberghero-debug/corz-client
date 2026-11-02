package gg.corz;

import com.corz.client.CorzClient;
import com.google.gson.Gson;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.class_1011;
import net.minecraft.class_1043;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import org.joml.Matrix4f;

public final class IIlIiIlllIlIiIll {
   private boolean liiillilll;
   private float Iliillilll;
   private final String iIlillilll;
   private boolean iliillilll;
   private final class_2960 Illillilll;
   private IIlillilIlilli[] Iilillilll;
   private boolean Iiiillilll;
   private static final Map<String, IIlIiIlllIlIiIll> lIlillilll = new HashMap<>();
   private final Map<Integer, IIlillilIlilli> lllillilll = new HashMap<>();
   private float iIiillilll;
   private final Map<Long, Float> illillilll = new HashMap<>();
   private int IIiillilll;
   private long[] lilillilll;
   private class_1011 lliillilll;
   private int lIiillilll;
   private float[] iilillilll;

   public static IIlIiIlllIlIiIll IliIlllilIi(String name) {
      return lIlillilll.computeIfAbsent(name, IIlIiIlllIlIiIll::new);
   }

   public static IIlIiIlllIlIiIll iliIiiliiiii() {
      return IliIlllilIi(llIIlilIIl<"llIIlilIIl","PLPY8eOmyTEAW9CXUKk4vQAAyPq6eLA0HqYhAAwNmLU=">());
   }

   private void IIIllIIliIIl() {
      long var17 = -3077524091243961190L;
      long var19 = -5078685669096287171L;
      long var21 = -5467173871646617103L;
      String var1 = llIIlilIIl<"llIIlilIIl","fugOcPVRKT2IRnBqmXCS/t9+Y+9fZQBzctnbdl/DdKbQckIYBGiKf/ORL3ZYR8XnD2d2JfUUIrQ=">()
         + this.iIlillilll
         + llIIlilIIl<"llIIlilIIl","y8f8VD4oKpPf9z+Eb2+F8b9ld56EezzYL73oTQ4=">();

      lIiiiiIiiIiiiiIi var2;
      try (InputStream var3 = IIlllIlliIll(var1 + llIIlilIIl<"llIIlilIIl","m/IHhnFeQ6PdTX/8szpZ+nWUzdbFmb7V/H91oUF/Yok0dMnmtg==">())) {
         if (var3 == null) {
            throw new IllegalStateException(
               llIIlilIIl<"llIIlilIIl","+VK6kc0XvB+74Mxl0J3yQ0GyOUYtqgMt6cCa+sbDqgED+CDu">()
                  + var1
                  + llIIlilIIl<"llIIlilIIl","m/IHhnFeQ6PdTX/8szpZ+nWUzdbFmb7V/H91oUF/Yok0dMnmtg==">()
            );
         }

         var2 = (lIiiiiIiiIiiiiIi)new Gson().fromJson(new InputStreamReader(var3, StandardCharsets.UTF_8), lIiiiiIiiIiiiiIi.class);
      }

      if (var2 != null && var2.IliliIIlIi != null && var2.lliliIIlIi != null && var2.ililiIIlIi != null) {
         this.Iliillilll = var2.lliliIIlIi.llliiIIill;
         this.iIiillilll = var2.lliliIIlIi.illiiIIill;
         float var27 = var2.IliliIIlIi.IllllIIlIi;
         float var4 = var2.IliliIIlIi.lllllIIlIi;

         for (illlliilIillliil var6 : var2.ililiIIlIi) {
            this.lllillilll.put(var6.IiIlIiilil, new IIlillilIlilli(var6, var27, var4));
         }

         if (var2.IiiliIIlIi != null) {
            for (iIIIlIIiIlIIlIIi var30 : var2.IiiliIIlIi) {
               this.illillilll.put(Illlllllilll(var30.IlliIlliil, var30.llliIlliil), var30.illiIlliil);
            }
         }

         try (InputStream var29 = IIlllIlliIll(var1 + llIIlilIIl<"llIIlilIIl","fI3XFjDlMnb9/FvLNBbpgC9A7pF19dZT0NnRMClfRiRLxD/4">())) {
            if (var29 == null) {
               throw new IllegalStateException(
                  llIIlilIIl<"llIIlilIIl","+VK6kc0XvB+74Mxl0J3yQ0GyOUYtqgMt6cCa+sbDqgED+CDu">()
                     + var1
                     + llIIlilIIl<"llIIlilIIl","fI3XFjDlMnb9/FvLNBbpgC9A7pF19dZT0NnRMClfRiRLxD/4">()
               );
            }

            this.lliillilll = class_1011.method_4309(var29);
         }

         var17 ^= (-4294967296L ^ var17) & -1L << 32;
         Iterator var31 = this.lllillilll.keySet().iterator();

         while (var31.hasNext()) {
            var17 ^= ((long)((Integer)var31.next()).intValue() ^ var17) & -1L >>> 32;
            if ((int)var17 >= 0 && (int)var17 <= 65535 && (int)var17 > (int)(var17 >>> 32)) {
               var17 ^= ((long)((int)var17) << 32 ^ var17) & -1L << 32;
            }
         }

         IIlillilIlilli[] var32 = new IIlillilIlilli[(int)(var17 >>> 32) + 1];

         for (Entry var8 : this.lllillilll.entrySet()) {
            var19 ^= ((long)((Integer)var8.getKey()).intValue() << 32 ^ var19) & -1L << 32;
            if ((int)(var19 >>> 32) >= 0 && (int)(var19 >>> 32) <= 65535) {
               var32[(int)(var19 >>> 32)] = (IIlillilIlilli)var8.getValue();
            }
         }

         this.Iilillilll = var32;
         var17 ^= (0L ^ var17) & -1L >>> 32;

         for (long var9 : this.illillilll.keySet()) {
            if (var9 >>> 32 <= 65535L && (var9 & 4294967295L) <= 65535L) {
               var17 ^= (var17 ^ var17 + (long)1) & -1L >>> 32;
            }
         }

         var19 ^= (2L ^ var19) & -1L >>> 32;

         while ((int)var19 < (int)var17 * 2) {
            var19 ^= ((long)((int)var19 << 1) ^ var19) & -1L >>> 32;
         }

         long[] var34 = new long[(int)var19];
         float[] var10 = new float[(int)var19];
         Arrays.fill(var34, Long.MIN_VALUE);
         var21 ^= ((long)(64 - Integer.numberOfTrailingZeros((int)var19)) << 32 ^ var21) & -1L << 32;

         for (Entry var13 : this.illillilll.entrySet()) {
            long var14 = (Long)var13.getKey();
            if (var14 >>> 32 <= 65535L && (var14 & 4294967295L) <= 65535L) {
               var21 ^= ((long)((int)(var14 * -7046029254386353131L >>> (int)(var21 >>> 32))) ^ var21) & -1L >>> 32;

               while (var34[(int)var21] != Long.MIN_VALUE) {
                  var21 ^= ((long)((int)var21 + 1 & (int)var19 - 1) ^ var21) & -1L >>> 32;
               }

               var34[(int)var21] = var14;
               var10[(int)var21] = (Float)var13.getValue();
            }
         }

         this.lilillilll = var34;
         this.iilillilll = var10;
         this.IIiillilll = (int)(var21 >>> 32);
         this.lIiillilll = (int)var17;
         this.iliillilll = true;
      } else {
         throw new IllegalStateException(llIIlilIIl<"llIIlilIIl","2KWmbE9H6/FIpC2KHo+faamzmgV4zoECenTHPD/7q91deZareDMMQxJwbrl1Hw==">() + this.iIlillilll);
      }
   }

   public static IIlIiIlllIlIiIll liiiIIllIl() {
      return IliIlllilIi(llIIlilIIl<"llIIlilIIl","5X1eM19Zfx0FTTFNyScfgDxojNARQ2mpwCh/SLyc5sF9bA==">());
   }

   public float Iiilliiliiil(String size, float text) {
      long var10 = 8790171246755030399L;
      long var12 = -7481857204341657070L;
      if (this.iliillilll && size != null && !size.isEmpty()) {
         float var3 = Ililllililil(text);
         float var4 = 0.0F;
         var10 ^= (-4294967296L ^ var10) & -1L << 32;
         var10 ^= (0L ^ var10) & -1L >>> 32;

         while ((int)var10 < size.length()) {
            var12 ^= ((long)size.charAt((int)var10) << 32 ^ var12) & -1L << 32;
            IIlillilIlilli var8 = this.IlIlllIlilIl((int)(var12 >>> 32));
            if (var8 == null) {
               var10 ^= ((long)((int)(var12 >>> 32)) << 32 ^ var10) & -1L << 32;
            } else {
               if ((int)(var10 >>> 32) != -1) {
                  var12 ^= ((long)this.IiIlliIliiIl(Illlllllilll((int)(var10 >>> 32), (int)(var12 >>> 32))) ^ var12) & -1L >>> 32;
                  if ((int)var12 >= 0) {
                     var4 += this.iilillilll[(int)var12] * var3;
                  }
               }

               var4 += var8.iillliIIIl * var3;
               var10 ^= ((long)((int)(var12 >>> 32)) << 32 ^ var10) & -1L << 32;
            }

            var10 ^= (var10 ^ var10 + (long)1) & -1L >>> 32;
         }

         return var4;
      } else {
         return 0.0F;
      }
   }

   public void Iliilliiilii(String size, float text, float argbL, int argbR, int x, float y) {
      long var24 = -742617672806149170L;
      long var26 = 1783491504022062764L;
      long var28 = 6906439111353187877L;
      if (this.IIillIiliIil() && size != null && !size.isEmpty()) {
         this.Iilllilliill();
         if (this.liiillilll) {
            float var7 = this.Iiilliiliiil(size, y);
            if (var7 <= 0.0F) {
               this.IIlilIliiIli(size, text, argbL, argbR, y);
            } else {
               class_4587 var8 = CorzClient.fontManager.liiiIIllIl();
               Matrix4f var9 = var8.method_23760().method_23761();
               float var10 = Ililllililil(y);
               float var11 = argbL + this.iIiillilll * var10;
               float var12 = text;
               var24 ^= (-4294967296L ^ var24) & -1L << 32;
               class_287 var14 = null;
               var24 ^= (0L ^ var24) & -1L >>> 32;

               while ((int)var24 < size.length()) {
                  var26 ^= ((long)size.charAt((int)var24) << 32 ^ var26) & -1L << 32;
                  IIlillilIlilli var17 = this.IlIlllIlilIl((int)(var26 >>> 32));
                  if (var17 == null) {
                     var24 ^= ((long)((int)(var26 >>> 32)) << 32 ^ var24) & -1L << 32;
                  } else {
                     if ((int)(var24 >>> 32) != -1) {
                        var26 ^= ((long)this.IiIlliIliiIl(Illlllllilll((int)(var24 >>> 32), (int)(var26 >>> 32))) ^ var26) & -1L >>> 32;
                        if ((int)var26 >= 0) {
                           var12 += this.iilillilll[(int)var26] * var10;
                        }
                     }

                     if (var17.IliIlllilIi()) {
                        if (var14 == null) {
                           var14 = class_289.method_1348().method_60827(class_5596.field_27382, class_290.field_1575);
                        }

                        float var19 = var11 - var17.lillliIIIl * var10;
                        float var20 = var17.illlliIIIl * var10;
                        float var21 = var17.IillliIIIl * var10;
                        long var33 = var28 ^ ((long)IIIIllIIIl(argbR, x, (var12 - text) / var7) << 32 ^ var28) & -1L << 32;
                        var28 = var33 ^ ((long)IIIIllIIIl(argbR, x, (var12 + var20 - text) / var7) ^ var33) & -1L >>> 32;
                        Iiiiliiiiiii(var14, var9, var12, var19 + var21, var17.lIllliIIIl, var17.llllliIIIl, (int)(var28 >>> 32));
                        Iiiiliiiiiii(var14, var9, var12 + var20, var19 + var21, var17.iIllliIIIl, var17.llllliIIIl, (int)var28);
                        Iiiiliiiiiii(var14, var9, var12 + var20, var19, var17.iIllliIIIl, var17.IlllliIIIl, (int)var28);
                        Iiiiliiiiiii(var14, var9, var12, var19, var17.lIllliIIIl, var17.IlllliIIIl, (int)(var28 >>> 32));
                     }

                     var12 += var17.iillliIIIl * var10;
                     var24 ^= ((long)((int)(var26 >>> 32)) << 32 ^ var24) & -1L << 32;
                  }

                  var24 ^= (var24 ^ var24 + (long)1) & -1L >>> 32;
               }

               if (var14 != null) {
                  IliiIilliiIi.llIIlilIIl(var14.method_60800(), this.Illillilll);
               }
            }
         }
      }
   }

   private static void Iiiiliiiiiii(class_287 argb, Matrix4f v, float y, float u, float m, float x, int buf) {
      float var7 = (float)(buf >>> 24 & 0xFF) / 255.0F * IliiIilliiIi.ilIlllIIlIiIlllIIl;
      argb.method_22918(v, y, u, 0.0F)
         .method_22913(m, x)
         .method_22915((float)(buf >> 16 & 0xFF) / 255.0F, (float)(buf >> 8 & 0xFF) / 255.0F, (float)(buf & 0xFF) / 255.0F, var7);
   }

   public float IIIilIIiiIIi(char size, float c) {
      if (!this.iliillilll) {
         return 0.0F;
      } else {
         IIlillilIlilli var3 = this.IlIlllIlilIl(size);
         if (var3 == null) {
            return 0.0F;
         } else {
            float var4 = 0.0F;
            return var4 + var3.iillliIIIl * Ililllililil(c);
         }
      }
   }

   public static IIlIiIlllIlIiIll lIiiIiIlilli() {
      return IliIlllilIi(llIIlilIIl<"llIIlilIIl","Ff7gdEw2GwbR8GwlqQ3SUIVPDmk6j+rdOizuTB2rX7xDF9ddYZo=">());
   }

   private class_287 IIiilIiiiIii(
      class_287 g, Matrix4f to, String baseline, int a, int b, float x, float text, float s, float from, float r, float matrix, float buf
   ) {
      long var22 = -3904156584467749860L;
      long var24 = 6668589244076766581L;
      float var13 = x;
      var22 ^= (-4294967296L ^ var22) & -1L << 32;
      var22 ^= ((long)a ^ var22) & -1L >>> 32;

      while ((int)var22 < b) {
         var24 ^= ((long)baseline.charAt((int)var22) << 32 ^ var24) & -1L << 32;
         IIlillilIlilli var17 = this.IlIlllIlilIl((int)(var24 >>> 32));
         if (var17 == null) {
            var22 ^= ((long)((int)(var24 >>> 32)) << 32 ^ var22) & -1L << 32;
         } else {
            if ((int)(var22 >>> 32) != -1) {
               var24 ^= ((long)this.IiIlliIliiIl(Illlllllilll((int)(var22 >>> 32), (int)(var24 >>> 32))) ^ var24) & -1L >>> 32;
               if ((int)var24 >= 0) {
                  var13 += this.iilillilll[(int)var24] * s;
               }
            }

            if (var17.IliIlllilIi()) {
               if (g == null) {
                  g = class_289.method_1348().method_60827(class_5596.field_27382, class_290.field_1575);
               }

               float var19 = text - var17.lillliIIIl * s;
               float var20 = var17.illlliIIIl * s;
               float var21 = var17.IillliIIIl * s;
               g.method_22918(to, var13, var19 + var21, 0.0F).method_22913(var17.lIllliIIIl, var17.llllliIIIl).method_22915(from, r, matrix, buf);
               g.method_22918(to, var13 + var20, var19 + var21, 0.0F).method_22913(var17.iIllliIIIl, var17.llllliIIIl).method_22915(from, r, matrix, buf);
               g.method_22918(to, var13 + var20, var19, 0.0F).method_22913(var17.iIllliIIIl, var17.IlllliIIIl).method_22915(from, r, matrix, buf);
               g.method_22918(to, var13, var19, 0.0F).method_22913(var17.lIllliIIIl, var17.IlllliIIIl).method_22915(from, r, matrix, buf);
            }

            var13 += var17.iillliIIIl * s;
            var22 ^= ((long)((int)(var24 >>> 32)) << 32 ^ var22) & -1L << 32;
         }

         var22 ^= (var22 ^ var22 + (long)1) & -1L >>> 32;
      }

      return g;
   }

   private int IiIlliIliiIl(long key) {
      long var8 = 1986588519388659359L;
      if (this.lIiillilll == 0) {
         return -1;
      } else {
         long[] var3 = this.lilillilll;
         var8 ^= ((long)(var3.length - 1) << 32 ^ var8) & -1L << 32;
         var8 ^= ((long)((int)(key * -7046029254386353131L >>> this.IIiillilll)) ^ var8) & -1L >>> 32;

         while (true) {
            long var6 = var3[(int)var8];
            if (var6 == key) {
               return (int)var8;
            }

            if (var6 == Long.MIN_VALUE) {
               return -1;
            }

            var8 ^= ((long)((int)var8 + 1 & (int)(var8 >>> 32)) ^ var8) & -1L >>> 32;
         }
      }
   }

   private IIlillilIlilli IlIlllIlilIl(int cp) {
      return cp < this.Iilillilll.length ? this.Iilillilll[cp] : null;
   }

   public static IIlIiIlllIlIiIll iIlIlllllill() {
      return IliIlllilIi(llIIlilIIl<"llIIlilIIl","IKDX7f/zvw89N0TUPORmroZff9Y53OVzzgkCXTkXJrw=">());
   }

   public void Illillliilli(String n, float[] size, int text, float argb, int y, float xs) {
      long var17 = -5062521879920636658L;
      if (this.IIillIiliIil() && n != null && text > 0) {
         this.Iilllilliill();
         if (this.liiillilll) {
            class_4587 var7 = CorzClient.fontManager.liiiIIllIl();
            Matrix4f var8 = var7.method_23760().method_23761();
            float var9 = Ililllililil(xs);
            float var10 = (float)(y >>> 24 & 0xFF) / 255.0F * IliiIilliiIi.ilIlllIIlIiIlllIIl;
            float var11 = (float)(y >> 16 & 0xFF) / 255.0F;
            float var12 = (float)(y >> 8 & 0xFF) / 255.0F;
            float var13 = (float)(y & 0xFF) / 255.0F;
            float var14 = argb + this.iIiillilll * var9;
            class_287 var15 = null;

            for (long var19 = var17 ^ (0L ^ var17) & -1L << 32; (int)(var19 >>> 32) < text; var19 += 4294967296L) {
               var15 = this.IIiilIiiiIii(
                  var15, var8, n, (int)(var19 >>> 32), (int)(var19 >>> 32) + 1, size[(int)(var19 >>> 32)], var14, var9, var11, var12, var13, var10
               );
            }

            if (var15 != null) {
               IliiIilliiIi.llIIlilIIl(var15.method_60800(), this.Illillilll);
            }
         }
      }
   }

   private static float Ililllililil(float size) {
      return size * 0.5F;
   }

   private static long Illlllllilll(int l, int r) {
      return (long)l << 32 | (long)r & 4294967295L;
   }

   private IIlIiIlllIlIiIll(String name) {
      this.Iilillilll = new IIlillilIlilli[0];
      this.lilillilll = new long[0];
      this.iilillilll = new float[0];
      this.iIlillilll = name;
      this.Illillilll = class_2960.method_60655(
         llIIlilIIl<"llIIlilIIl","HdZIZdqj01ON6l51As4+2BqcNPggdfJwWf4GGRiqmGZgZaRrJLk=">(),
         llIIlilIIl<"llIIlilIIl","MLNsdfc/MmJI96E7mRKnqfBLPdN78lmxZM3zhaI+xUrp1KwKcQ==">() + name
      );

      try {
         this.IIIllIIliIIl();
      } catch (Throwable var3) {
         this.Iiiillilll = true;
         var3.printStackTrace();
      }
   }

   private static int IIIIllIIIl(int c2, int t, float c1) {
      long var17 = 7866160525439960809L;
      long var11 = -2979665421221713809L;
      long var13 = 1290806166937026123L;
      long var15 = 4441974274336168191L;
      c1 = c1 < 0.0F ? 0.0F : (c1 > 1.0F ? 1.0F : c1);
      var11 ^= ((long)(c2 >>> 24 & 0xFF) << 32 ^ var11) & -1L << 32;
      var11 ^= ((long)(c2 >> 16 & 0xFF) ^ var11) & -1L >>> 32;
      var13 ^= ((long)(c2 >> 8 & 0xFF) << 32 ^ var13) & -1L << 32;
      var13 ^= ((long)(c2 & 0xFF) ^ var13) & -1L >>> 32;
      var15 ^= ((long)(t >>> 24 & 0xFF) << 32 ^ var15) & -1L << 32;
      var15 ^= ((long)(t >> 16 & 0xFF) ^ var15) & -1L >>> 32;
      var17 ^= ((long)(t >> 8 & 0xFF) << 32 ^ var17) & -1L << 32;
      var17 ^= ((long)(t & 0xFF) ^ var17) & -1L >>> 32;
      return (int)((float)((int)(var11 >>> 32)) + (float)((int)(var15 >>> 32) - (int)(var11 >>> 32)) * c1) << 24
         | (int)((float)((int)var11) + (float)((int)var15 - (int)var11) * c1) << 16
         | (int)((float)((int)(var13 >>> 32)) + (float)((int)(var17 >>> 32) - (int)(var13 >>> 32)) * c1) << 8
         | (int)((float)((int)var13) + (float)((int)var17 - (int)var13) * c1);
   }

   private void Iilllilliill() {
      if (!this.liiillilll && this.lliillilll != null) {
         class_1043 var1 = new class_1043(
            () -> llIIlilIIl<"llIIlilIIl","H4Ecl9rcPB5yv+xxxNegp33Eb+6/QLJBgiT8Po6b9JTYbJfMyg==">() + this.iIlillilll, this.lliillilll
         );
         class_310.method_1551().method_1531().method_4616(this.Illillilll, var1);
         this.liiillilll = true;
      }
   }

   public void IIlilIliiIli(String text, float size, float x, int y, float argb) {
      if (this.IIillIiliIil() && text != null && !text.isEmpty()) {
         this.Iilllilliill();
         if (this.liiillilll) {
            class_4587 var6 = CorzClient.fontManager.liiiIIllIl();
            Matrix4f var7 = var6.method_23760().method_23761();
            float var8 = Ililllililil(argb);
            float var9 = (float)(y >>> 24 & 0xFF) / 255.0F * IliiIilliiIi.ilIlllIIlIiIlllIIl;
            float var10 = (float)(y >> 16 & 0xFF) / 255.0F;
            float var11 = (float)(y >> 8 & 0xFF) / 255.0F;
            float var12 = (float)(y & 0xFF) / 255.0F;
            float var13 = x + this.iIiillilll * var8;
            class_287 var14 = this.IIiilIiiiIii(null, var7, text, 0, text.length(), size, var13, var8, var10, var11, var12, var9);
            if (var14 != null) {
               IliiIilliiIi.llIIlilIIl(var14.method_60800(), this.Illillilll);
            }
         }
      }
   }

   public void Iilililiiili(String[] size, float[] argbs, float[] texts, int[] xs, int n, float ys) {
      long var19 = -591046821501329625L;
      if (this.IIillIiliIil()) {
         class_4587 var7 = CorzClient.fontManager.liiiIIllIl();
         Matrix4f var8 = var7.method_23760().method_23761();
         float var9 = Ililllililil(ys);
         class_287 var10 = null;

         for (long var21 = var19 ^ (0L ^ var19) & -1L << 32; (int)(var21 >>> 32) < n; var21 += 4294967296L) {
            String var12 = size[(int)(var21 >>> 32)];
            if (var12 != null && !var12.isEmpty()) {
               this.Iilllilliill();
               if (!this.liiillilll) {
                  break;
               }

               var21 ^= ((long)xs[(int)(var21 >>> 32)] ^ var21) & -1L >>> 32;
               float var14 = (float)((int)var21 >>> 24 & 0xFF) / 255.0F * IliiIilliiIi.ilIlllIIlIiIlllIIl;
               float var15 = (float)((int)var21 >> 16 & 0xFF) / 255.0F;
               float var16 = (float)((int)var21 >> 8 & 0xFF) / 255.0F;
               float var17 = (float)((int)var21 & 0xFF) / 255.0F;
               float var18 = texts[(int)(var21 >>> 32)] + this.iIiillilll * var9;
               var10 = this.IIiilIiiiIii(var10, var8, var12, 0, var12.length(), argbs[(int)(var21 >>> 32)], var18, var9, var15, var16, var17, var14);
            }
         }

         if (var10 != null) {
            IliiIilliiIi.llIIlilIIl(var10.method_60800(), this.Illillilll);
         }
      }
   }

   public boolean IIillIiliIil() {
      return this.iliillilll && !this.Iiiillilll;
   }

   public float IlIillIiilIi(float size) {
      return this.Iliillilll * Ililllililil(size);
   }

   private static InputStream IIlllIlliIll(String p) {
      return CorzClient.class.getClassLoader().getResourceAsStream(p);
   }

   public static IIlIiIlllIlIiIll IilliliilIIi() {
      return IliIlllilIi(llIIlilIIl<"llIIlilIIl","OAIOb2PkMQWC7fxo8dZDqS370vOYRDAoXwm6s3/xshakLAC0NUZ4">());
   }

   public float IiIiliIiiiIi(float size) {
      return this.iIiillilll * Ililllililil(size);
   }
}
