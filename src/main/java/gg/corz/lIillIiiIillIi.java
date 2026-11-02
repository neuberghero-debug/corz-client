package gg.corz;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public final class lIillIiiIillIi {
   public static final int iiIIliIiiIIlIliIii = 826691147;
   public final float[] iIiIliIiiIliIliIii;
   private static final Map<String, int[]> lilIliIiiiilIliIii = new ConcurrentHashMap<>();
   public final int[] IiiIliIiiliiIliIii;
   public static final int IllIliIiilllIliIii = 256;
   public final float[] lliIliIiiiliIliIii;
   public final int[] iiiIliIiiIIIlliIii;
   private static final Map<String, lIillIiiIillIi> illIliIiiIilIliIii = new ConcurrentHashMap<>();
   public final int[] lIIlliIiiiIIlliIii;
   public final float[] IIiIliIiilIiIliIii;
   public static final String lIlIliIiiiIlIliIii = "/assets/corzclient/textures/knife/knife.png";

   public static int[] IiIlliIliiIl(String path) {
      int[] var1 = lilIliIiiiilIliIii.get(path);
      if (var1 != null) {
         return var1;
      } else {
         try {
            label91: {
               Object var4;
               try (InputStream var2 = lIillIiiIillIi.class.getResourceAsStream(path)) {
                  if (var2 == null) {
                     return null;
                  }

                  int[] var3 = IIlllIlliIll(var2.readAllBytes());
                  if (var3 != null
                     && var3[0] == ((~-73295064 << 27 | ~-73295064 >>> 5) ^ -1205669338)
                     && var3[1] == ((-446421749 - 65) * 101 * 77 ^ -1488872054)) {
                     var1 = Arrays.copyOfRange(var3, 2, var3.length);
                     break label91;
                  }

                  var4 = null;
               }

               return (int[])var4;
            }
         } catch (RuntimeException | IOException var7) {
            return null;
         }

         int[] var9 = lilIliIiiiilIliIii.putIfAbsent(path, var1);
         return var9 != null ? var9 : var1;
      }
   }

   public static lIillIiiIillIi IilliliilIIi(byte[] data) {
      ByteBuffer var1 = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
      if (data.length >= 12 && var1.getInt() == 826691147) {
         int var2 = var1.getInt();
         int var3 = var1.getInt();
         if (var2 > 0 && var3 > 0 && var3 % 3 == 0 && (long)var2 * 36L + (long)var3 * 4L + 12L == (long)data.length) {
            float[] var4 = new float[var2 * 3];
            float[] var5 = new float[var2 * 3];
            float[] var6 = new float[var2 * 2];
            int[] var7 = new int[var2];
            int[] var8 = new int[var3];

            for (int var9 = 0; var9 < var2; var9++) {
               var4[var9 * 3] = var1.getFloat();
               var4[var9 * 3 + 1] = var1.getFloat();
               var4[var9 * 3 + 2] = var1.getFloat();
               var5[var9 * 3] = var1.getFloat();
               var5[var9 * 3 + 1] = var1.getFloat();
               var5[var9 * 3 + 2] = var1.getFloat();
               var6[var9 * 2] = var1.getFloat();
               var6[var9 * 2 + 1] = var1.getFloat();
               var7[var9] = var1.getInt();
            }

            for (int var11 = 0; var11 < var3; var11++) {
               int var10 = var1.getInt();
               if (var10 < 0 || var10 >= var2) {
                  throw new IllegalArgumentException(
                     IIIilIIiiIIi<"IIIilIIiiIIi","H91Zia6VEwB/y28XF42bXON6WhpW1S9eEp1KTkKk45/rb8sq+SPJQt5ZByMSpAyooHbtU31L6gY/">()
                  );
               }

               var8[var11] = var10;
            }

            return new lIillIiiIillIi(var4, var5, var6, var7, var8);
         } else {
            throw new IllegalArgumentException(IIIilIIiiIIi<"IIIilIIiiIIi","UN3+BRWimVBSdGttVzKTYy+6oLX0WQm8dhw87OJWFZLo/QS0/X80VOISvQqS/8TL6knkCA==">());
         }
      } else {
         throw new IllegalArgumentException(IIIilIIiiIIi<"IIIilIIiiIIi","nj1Fv4lIfu8XNU5YANwDpmj7YnpiFDelzqMIv7Qit2j6HYvzKe9K2lPrtM4=">());
      }
   }

   private lIillIiiIillIi(float[] idx, float[] uv, float[] pos, int[] nrm, int[] argb) {
      this.IIiIliIiilIiIliIii = idx;
      this.iIiIliIiiIliIliIii = uv;
      this.lliIliIiiiliIliIii = pos;
      this.IiiIliIiiliiIliIii = nrm;
      this.iiiIliIiiIIIlliIii = argb;
      this.lIIlliIiiiIIlliIii = this.Illlllllilll();
   }

   public static int[] IlIlllIlilIl(illIIlllIilIIlll rig) {
      return IiIlliIliiIl(
         rig == null
            ? IIIilIIiiIIi<"IIIilIIiiIIi","DFMLHfpiFibr9lC/RVWFNzlKIz3PF0XiHdKexchhQfKTAlSxRa+1KVcNsI2Tp17zGu5rrBnFxtslsTV+dqlwHZAtyLmAutw=">()
            : rig.IilliliilIIi()
      );
   }

   private static long IIillIiliIil(int a, int b) {
      return a < b
         ? (long)a << (-(-1347908916 + 3) ^ 1347908881) | (long)b & (5483692356739120265L ^ 5483692360867660662L)
         : (long)b << (-(-1094111867 - -121) ^ -33 ^ -1094111747) | (long)a & (-5359115222190624430L ^ -5359115221349724499L);
   }

   public static lIillIiiIillIi[] iliIiiliiiii(illIIlllIilIIlll rig) {
      lIillIiiIillIi[] var1 = new lIillIiiIillIi[rig.IlIlllIlilIl()];

      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = lIiiIiIlilli(rig.IiIlliIliiIl(var2).IliIlllilIi());
         if (var1[var2] == null) {
            return null;
         }
      }

      return var1;
   }

   public int iIlIlllllill() {
      return this.lIIlliIiiiIIlliIii.length / 4;
   }

   private int[] Ililllililil() {
      int var1 = this.IiiIliIiiliiIliIii.length;
      int[] var2 = new int[var1];
      HashMap var3 = new HashMap();

      for (int var4 = 0; var4 < var1; var4++) {
         String var5 = Float.floatToIntBits(this.IIiIliIiilIiIliIii[var4 * 3])
            + IIIilIIiiIIi<"IIIilIIiiIIi","960kJUsTP/uwBPtgr/q1I5Acr5x0wjmduYo3vBU=">()
            + Float.floatToIntBits(this.IIiIliIiilIiIliIii[var4 * 3 + 1])
            + IIIilIIiiIIi<"IIIilIIiiIIi","960kJUsTP/uwBPtgr/q1I5Acr5x0wjmduYo3vBU=">()
            + Float.floatToIntBits(this.IIiIliIiilIiIliIii[var4 * 3 + 2])
            + IIIilIIiiIIi<"IIIilIIiiIIi","960kJUsTP/uwBPtgr/q1I5Acr5x0wjmduYo3vBU=">()
            + Float.floatToIntBits(this.lliIliIiiiliIliIii[var4 * 2])
            + IIIilIIiiIIi<"IIIilIIiiIIi","960kJUsTP/uwBPtgr/q1I5Acr5x0wjmduYo3vBU=">()
            + Float.floatToIntBits(this.lliIliIiiiliIliIii[var4 * 2 + 1])
            + IIIilIIiiIIi<"IIIilIIiiIIi","960kJUsTP/uwBPtgr/q1I5Acr5x0wjmduYo3vBU=">()
            + this.IiiIliIiiliiIliIii[var4]
            + IIIilIIiiIIi<"IIIilIIiiIIi","960kJUsTP/uwBPtgr/q1I5Acr5x0wjmduYo3vBU=">()
            + Math.round(this.iIiIliIiiIliIliIii[var4 * 3] * 2000.0F)
            + IIIilIIiiIIi<"IIIilIIiiIIi","960kJUsTP/uwBPtgr/q1I5Acr5x0wjmduYo3vBU=">()
            + Math.round(this.iIiIliIiiIliIliIii[var4 * 3 + 1] * 2000.0F)
            + IIIilIIiiIIi<"IIIilIIiiIIi","960kJUsTP/uwBPtgr/q1I5Acr5x0wjmduYo3vBU=">()
            + Math.round(this.iIiIliIiiIliIliIii[var4 * 3 + 2] * 2000.0F);
         Integer var6 = var3.putIfAbsent(var5, var4);
         var2[var4] = var6 == null ? var4 : var6;
      }

      return var2;
   }

   public int IliIlllilIi() {
      return this.IiiIliIiiliiIliIii.length;
   }

   public static int[] IIIllIIliIIl() {
      return IiIlliIliiIl(IIIilIIiiIIi<"IIIilIIiiIIi","DFMLHfpiFibr9lC/RVWFNzlKIz3PF0XiHdKexchhQfKTAlSxRa+1KVcNsI2Tp17zGu5rrBnFxtslsTV+dqlwHZAtyLmAutw=">());
   }

   public static lIillIiiIillIi lIiiIiIlilli(String model) {
      lIillIiiIillIi var1 = illIliIiiIilIliIii.get(model);
      if (var1 != null) {
         return var1;
      } else {
         try {
            label61: {
               Object var3;
               try (InputStream var2 = lIillIiiIillIi.class
                     .getResourceAsStream(
                        IIIilIIiiIIi<"IIIilIIiiIIi","JLmr/XqWy//Uxgbu2zXncG9ojsQnqmPuNhergxzH9WgCIj0RjvF5tAmviIIKoWjPGWpJmVY=">()
                           + model
                           + IIIilIIiiIIi<"IIIilIIiiIIi","rf5MEc2o1TEGjJZ30PPCrY0hzeuiJbUlHQzg/GihtxJI2w==">()
                     )) {
                  if (var2 != null) {
                     var1 = IilliliilIIi(var2.readAllBytes());
                     break label61;
                  }

                  var3 = null;
               }

               return (lIillIiiIillIi)var3;
            }
         } catch (IOException | IllegalArgumentException var7) {
            return null;
         }

         lIillIiiIillIi var9 = illIliIiiIilIliIii.putIfAbsent(model, var1);
         return var9 != null ? var9 : var1;
      }
   }

   public int liiiIIllIl() {
      return this.iiiIliIiiIIIlliIii.length / 3;
   }

   static int[] IIlllIlliIll(byte[] d) {
      if (d.length >= 8 && (d[0] & 255) == 137 && d[1] == 80 && d[2] == 78 && d[3] == 71) {
         int var1 = 8;
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;
         int var5 = -1;
         byte[] var6 = null;
         byte[] var7 = null;
         ByteArrayOutputStream var8 = new ByteArrayOutputStream();

         while (var1 + 8 <= d.length) {
            int var9 = (d[var1] & 255) << 24 | (d[var1 + 1] & 255) << 16 | (d[var1 + 2] & 255) << 8 | d[var1 + 3] & 255;
            String var10 = new String(d, var1 + 4, 4, StandardCharsets.US_ASCII);
            int var11 = var1 + 8;
            if (var9 < 0 || var11 + var9 > d.length) {
               return null;
            }

            switch (var10) {
               case IIIilIIiiIIi<"IIIilIIiiIIi","Gib9ws5Q7eNElAJseAtz0W8yiGVHvjoDmiRzZIrgLuA=">():
                  var2 = (d[var11] & 255) << 24 | (d[var11 + 1] & 255) << 16 | (d[var11 + 2] & 255) << 8 | d[var11 + 3] & 255;
                  var3 = (d[var11 + 4] & 255) << 24 | (d[var11 + 5] & 255) << 16 | (d[var11 + 6] & 255) << 8 | d[var11 + 7] & 255;
                  var4 = d[var11 + 8] & 255;
                  var5 = d[var11 + 9] & 255;
                  if (d[var11 + 12] != 0) {
                     return null;
                  }
                  break;
               case IIIilIIiiIIi<"IIIilIIiiIIi","5p8TfwIIHgk5dHzS8ybADOnADZ9Rl0MaeVXc5KqLoyk=">():
                  var6 = Arrays.copyOfRange(d, var11, var11 + var9);
                  break;
               case IIIilIIiiIIi<"IIIilIIiiIIi","CuZI7nUf+BqVxTPm34TcCiYDjabB66+oEuG1c2FDVu0=">():
                  var7 = Arrays.copyOfRange(d, var11, var11 + var9);
                  break;
               case IIIilIIiiIIi<"IIIilIIiiIIi","oG18l0qkVRG8LF1zd73U8GGJnqZK0P1lgEtkDUQX28Q=">():
                  var8.write(d, var11, var9);
            }

            if (var10.equals(IIIilIIiiIIi<"IIIilIIiiIIi","MxlZkz8yUFq172VH+GmMwo2jei+cEfcogXUuD1WFidw=">())) {
               break;
            }

            var1 = var11 + var9 + 4;
         }

         if (var4 == 8 && var2 > 0 && var3 > 0) {
            byte var33 = switch (var5) {
               case 0 -> 1;
               default -> -1;
               case 2 -> 3;
               case 3 -> 1;
               case 4 -> 2;
               case 6 -> 4;
            };
            if (var33 < 0) {
               return null;
            } else {
               int var34 = var2 * var33;
               byte[] var35 = new byte[(var34 + 1) * var3];
               Inflater var12 = new Inflater();

               try {
                  var12.setInput(var8.toByteArray());
                  int var36 = 0;

                  while (var36 < var35.length && !var12.finished()) {
                     int var38 = var12.inflate(var35, var36, var35.length - var36);
                     if (var38 == 0 && (var12.needsInput() || var12.needsDictionary())) {
                        break;
                     }

                     var36 += var38;
                  }

                  if (var36 < var35.length) {
                     return null;
                  }
               } catch (DataFormatException var31) {
                  return null;
               } finally {
                  var12.end();
               }

               byte[] var37 = new byte[var34];
               byte[] var39 = new byte[var34];
               int[] var15 = new int[2 + var2 * var3];
               var15[0] = var2;
               var15[1] = var3;

               for (int var16 = 0; var16 < var3; var16++) {
                  int var17 = var35[var16 * (var34 + 1)] & 255;
                  int var18 = var16 * (var34 + 1) + 1;

                  for (int var19 = 0; var19 < var34; var19++) {
                     int var20 = var35[var18 + var19] & 255;
                     int var21 = var19 >= var33 ? var37[var19 - var33] & 255 : 0;
                     int var22 = var39[var19] & 255;
                     int var23 = var19 >= var33 ? var39[var19 - var33] & 255 : 0;

                     int var24 = switch (var17) {
                        case 0 -> var20;
                        case 1 -> var20 + var21;
                        case 2 -> var20 + var22;
                        case 3 -> var20 + (var21 + var22 >> 1);
                        case 4 -> {
                           int var25 = var21 + var22 - var23;
                           int var26 = Math.abs(var25 - var21);
                           int var27 = Math.abs(var25 - var22);
                           int var28 = Math.abs(var25 - var23);
                           yield var20 + (var26 <= var27 && var26 <= var28 ? var21 : (var27 <= var28 ? var22 : var23));
                        }
                        default -> -1;
                     };
                     if (var24 < 0) {
                        return null;
                     }

                     var37[var19] = (byte)var24;
                  }

                  for (int var41 = 0; var41 < var2; var41++) {
                     int var46 = 255;
                     int var47 = var41 * var33;
                     int var43;
                     int var44;
                     int var45;
                     switch (var5) {
                        case 0:
                           var43 = var44 = var45 = var37[var47] & 255;
                           break;
                        case 1:
                        default:
                           var43 = var37[var47] & 255;
                           var44 = var37[var47 + 1] & 255;
                           var45 = var37[var47 + 2] & 255;
                           var46 = var37[var47 + 3] & 255;
                           break;
                        case 2:
                           var43 = var37[var47] & 255;
                           var44 = var37[var47 + 1] & 255;
                           var45 = var37[var47 + 2] & 255;
                           break;
                        case 3:
                           int var48 = var37[var47] & 255;
                           if (var6 == null || var48 * 3 + 2 >= var6.length) {
                              return null;
                           }

                           var43 = var6[var48 * 3] & 255;
                           var44 = var6[var48 * 3 + 1] & 255;
                           var45 = var6[var48 * 3 + 2] & 255;
                           if (var7 != null && var48 < var7.length) {
                              var46 = var7[var48] & 255;
                           }
                           break;
                        case 4:
                           var43 = var44 = var45 = var37[var47] & 255;
                           var46 = var37[var47 + 1] & 255;
                     }

                     var15[2 + var16 * var2 + var41] = var46 << 24 | var43 << 16 | var44 << 8 | var45;
                  }

                  byte[] var42 = var39;
                  var39 = var37;
                  var37 = var42;
               }

               return var15;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private boolean Iilllilliill(int[] canon, int t) {
      long var6 = -7614079284079489485L;
      long var8 = 2560247788036916072L;
      var6 ^= ((long)canon[this.iiiIliIiiIIIlliIii[t * 3]] << 32 ^ var6) & -1L << 32;
      var6 ^= ((long)canon[this.iiiIliIiiIIIlliIii[t * 3 + 1]] ^ var6) & -1L >>> 32;
      var8 ^= ((long)canon[this.iiiIliIiiIIIlliIii[t * 3 + 2]] << 32 ^ var8) & -1L << 32;
      return (int)(var6 >>> 32) == (int)var6 || (int)var6 == (int)(var8 >>> 32) || (int)(var6 >>> 32) == (int)(var8 >>> 32);
   }

   private int[] Illlllllilll() {
      int var1 = this.iiiIliIiiIIIlliIii.length / 3;
      int[] var2 = this.Ililllililil();
      HashMap var3 = new HashMap();

      for (int var4 = 0; var4 < var1; var4++) {
         for (int var5 = 0; var5 < 3; var5++) {
            var3.computeIfAbsent(
                  IIillIiliIil(var2[this.iiiIliIiiIIIlliIii[var4 * 3 + var5]], var2[this.iiiIliIiiIIIlliIii[var4 * 3 + (var5 + 1) % 3]]),
                  k -> new ArrayList<>(2)
               )
               .add(var4);
         }
      }

      boolean[] var16 = new boolean[var1];
      int[] var17 = new int[var1 * 4];
      int var6 = 0;

      for (int var7 = 0; var7 < var1; var7++) {
         if (!var16[var7]) {
            var16[var7] = true;
            int var8 = -1;
            int var9 = -1;

            for (int var10 = 0; var10 < 3 && var8 < 0; var10++) {
               for (int var12 : (List)var3.get(
                  IIillIiliIil(var2[this.iiiIliIiiIIIlliIii[var7 * 3 + var10]], var2[this.iiiIliIiiIIIlliIii[var7 * 3 + (var10 + 1) % 3]])
               )) {
                  if (!var16[var12] && !this.Iilllilliill(var2, var12)) {
                     var8 = var12;
                     var9 = var10;
                     break;
                  }
               }
            }

            if (var8 >= 0 && !this.Iilllilliill(var2, var7)) {
               var16[var8] = true;
               int var29 = this.iiiIliIiiIIIlliIii[var7 * 3 + var9];
               int var25 = this.iiiIliIiiIIIlliIii[var7 * 3 + (var9 + 1) % 3];
               int var27 = this.iiiIliIiiIIIlliIii[var7 * 3 + (var9 + 2) % 3];
               int var13 = -1;

               for (int var14 = 0; var14 < 3; var14++) {
                  int var15 = this.iiiIliIiiIIIlliIii[var8 * 3 + var14];
                  if (var2[var15] != var2[var25] && var2[var15] != var2[var29]) {
                     var13 = var15;
                  }
               }

               var17[var6++] = var25;
               var17[var6++] = var27;
               var17[var6++] = var29;
               var17[var6++] = var13;
            } else {
               int var24 = this.iiiIliIiiIIIlliIii[var7 * 3];
               int var26 = this.iiiIliIiiIIIlliIii[var7 * 3 + 1];
               int var28 = this.iiiIliIiiIIIlliIii[var7 * 3 + 2];
               var17[var6++] = var24;
               var17[var6++] = var26;
               var17[var6++] = var28;
               var17[var6++] = var28;
            }
         }
      }

      return Arrays.copyOf(var17, var6);
   }
}
