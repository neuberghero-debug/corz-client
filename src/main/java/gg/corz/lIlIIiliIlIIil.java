package gg.corz;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.GeneralPath;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.class_1011;
import net.minecraft.class_1043;
import net.minecraft.class_2960;
import net.minecraft.class_310;

public final class lIlIIiliIlIIil {
   private static final float IllllilIilllllilIi = 2.0F;
   private static final class_2960 iillIilIiIIilIilIi = class_2960.method_60655(
      lIIlIliIIlIl<"lIIlIliIIlIl","GSM0+q1S8y/SuOzmF2+o320flgAOBYvD4B4OtnPWrvoWb9WBnpI=">(),
      lIIlIliIIlIl<"lIIlIliIIlIl","cOm27b4ioK5w+R2LV2TjxYW1SbnEDQxXMCY9ncUswIxn5+r4cVQ=">()
   );
   private static boolean IiiiIilIiliiiIilIi;
   private static final class_2960 IIIiIilIilIIiIilIi = class_2960.method_60655(
      lIIlIliIIlIl<"lIIlIliIIlIl","GSM0+q1S8y/SuOzmF2+o320flgAOBYvD4B4OtnPWrvoWb9WBnpI=">(),
      lIIlIliIIlIl<"lIIlIliIIlIl","KAWywWn6U+0HjtogQ2GlD4nUUvw4WYzeeC43PMVfiC4q2DpTLw==">()
   );
   private static boolean iIiiIilIiIliiIilIi;
   private static final float lIlIIilIiiIlIIilIi = 4.608F;
   private static final Map<String, class_2960> iliIlilIiIiiIlilIi = new HashMap<>();
   private static final float llIllilIiilIllilIi = 1.5F;
   private static boolean ilIIlilIiIiIIlilIi;
   private static boolean iiIiIilIiIIliIilIi;
   private static boolean iiiiIilIiIIIIlilIi;
   private static final class_2960 IlIlIilIillIlIilIi = class_2960.method_60655(
      lIIlIliIIlIl<"lIIlIliIIlIl","GSM0+q1S8y/SuOzmF2+o320flgAOBYvD4B4OtnPWrvoWb9WBnpI=">(),
      lIIlIliIIlIl<"lIIlIliIIlIl","1A3PknEk17prrcZbC+qGLfiXPmI6s6VuYyYYq/Ywy+dwvVBE8gQ=">()
   );
   private static boolean IlIIlilIillIIlilIi;
   private static final class_2960 IillIilIilillIilIi = class_2960.method_60655(
      lIIlIliIIlIl<"lIIlIliIIlIl","GSM0+q1S8y/SuOzmF2+o320flgAOBYvD4B4OtnPWrvoWb9WBnpI=">(),
      lIIlIliIIlIl<"lIIlIliIIlIl","g5eh6b+t2HuNwLf04LoSy5n7h8Fz/7zXrX39zYGsibC3W1kgZg==">()
   );
   private static final class_2960 liilIilIiiiilIilIi = class_2960.method_60655(
      lIIlIliIIlIl<"lIIlIliIIlIl","GSM0+q1S8y/SuOzmF2+o320flgAOBYvD4B4OtnPWrvoWb9WBnpI=">(),
      lIIlIliIIlIl<"lIIlIliIIlIl","zrtjHmF5LEckEgnwbMGeF23cRGAvxGEodOEiCBzMpi346oApig==">()
   );
   private static boolean IIlIlilIilIlIlilIi;
   private static final Map<String, class_2960> IiIllilIiliIllilIi = new HashMap<>();
   private static final class_2960 illIIilIiIilIIilIi = class_2960.method_60655(
      lIIlIliIIlIl<"lIIlIliIIlIl","GSM0+q1S8y/SuOzmF2+o320flgAOBYvD4B4OtnPWrvoWb9WBnpI=">(),
      lIIlIliIIlIl<"lIIlIliIIlIl","Mdu+pOP4C0vWIr6aE2Iz7sEFCqXihvwoBiv87ff10VSMn8fLfw==">()
   );
   private static final class_2960 iIiIIilIiIliIIilIi = class_2960.method_60655(
      lIIlIliIIlIl<"lIIlIliIIlIl","GSM0+q1S8y/SuOzmF2+o320flgAOBYvD4B4OtnPWrvoWb9WBnpI=">(),
      lIIlIliIIlIl<"lIIlIliIIlIl","Xjjkfx/YgDvgBwcYSHITsTEXNqOUa330zjuMc81YrnhDexXqc2s=">()
   );
   private static boolean iIlIlilIiIllIlilIi;
   private static boolean liIIlilIiiiIIlilIi;
   private static final class_2960 IIiIIilIilIiIIilIi = class_2960.method_60655(
      lIIlIliIIlIl<"lIIlIliIIlIl","GSM0+q1S8y/SuOzmF2+o320flgAOBYvD4B4OtnPWrvoWb9WBnpI=">(),
      lIIlIliIIlIl<"lIIlIliIIlIl","0hfFMUflvWt8Yohak254/QWT5pgs+LKWhJvEnTdui4np9669bg==">()
   );
   private static final class_2960 lilIIilIiiilIIilIi = class_2960.method_60655(
      lIIlIliIIlIl<"lIIlIliIIlIl","GSM0+q1S8y/SuOzmF2+o320flgAOBYvD4B4OtnPWrvoWb9WBnpI=">(),
      lIIlIliIIlIl<"lIIlIliIIlIl","CMiVqNwbOks59ZVR0EpuLkHjxVBx5sBzMuVf+07Mu8rrzFlqyQ==">()
   );
   private static final class_2960 IllIIilIilllIIilIi = class_2960.method_60655(
      lIIlIliIIlIl<"lIIlIliIIlIl","GSM0+q1S8y/SuOzmF2+o320flgAOBYvD4B4OtnPWrvoWb9WBnpI=">(),
      lIIlIliIIlIl<"lIIlIliIIlIl","EvG3mTlLzc9VOu45ThwAijg08x2CdORSZ/2o98XW51g0s3ShtP9Z">()
   );
   private static final class_2960 IiiIIilIiliiIIilIi = class_2960.method_60655(
      lIIlIliIIlIl<"lIIlIliIIlIl","GSM0+q1S8y/SuOzmF2+o320flgAOBYvD4B4OtnPWrvoWb9WBnpI=">(),
      lIIlIliIIlIl<"lIIlIliIIlIl","nXVTSmna3dXKoLM5+gjpkBH+3NBCXT3oHILgNFZ2ktUZYG0=">()
   );
   private static final float iIIllilIiIlIllilIi = 16.0F;
   private static final class_2960 lliIIilIiiliIIilIi = class_2960.method_60655(
      lIIlIliIIlIl<"lIIlIliIIlIl","GSM0+q1S8y/SuOzmF2+o320flgAOBYvD4B4OtnPWrvoWb9WBnpI=">(),
      lIIlIliIIlIl<"lIIlIliIIlIl","xLq7siDEnTEp+gTRIaf255ppQnX3+dtl1dvJQN76LbVrdFSxEQ==">()
   );
   private static final float iiIIIilIiIIlIIilIi = 7.36F;
   private static final float lIlllilIiiIlllilIi = 24.0F;
   private static final class_2960 iIllIilIiIlllIilIi = class_2960.method_60655(
      lIIlIliIIlIl<"lIIlIliIIlIl","GSM0+q1S8y/SuOzmF2+o320flgAOBYvD4B4OtnPWrvoWb9WBnpI=">(),
      lIIlIliIIlIl<"lIIlIliIIlIl","hfkjkWvtNn/Wz56kSBkMcAaKBHUGk/8xX8Cd/+JCW0FO8Io2s3o=">()
   );
   private static final int IIIllilIilIIllilIi = 48;
   private static boolean lIIIlilIiiIIIlilIi;
   private static final class_2960 ililIilIiIiilIilIi = class_2960.method_60655(
      lIIlIliIIlIl<"lIIlIliIIlIl","GSM0+q1S8y/SuOzmF2+o320flgAOBYvD4B4OtnPWrvoWb9WBnpI=">(),
      lIIlIliIIlIl<"lIIlIliIIlIl","NqXLVILa42q1ADGKhW6bQwil11u/fDS2+EnpOjFBWp3CZncF">()
   );
   private static boolean liliIilIiiiliIilIi;
   private static boolean IliIlilIilliIlilIi;
   private static boolean IIiiIilIilIiiIilIi;
   private static final class_2960 IlilIilIillilIilIi = class_2960.method_60655(
      lIIlIliIIlIl<"lIIlIliIIlIl","GSM0+q1S8y/SuOzmF2+o320flgAOBYvD4B4OtnPWrvoWb9WBnpI=">(),
      lIIlIliIIlIl<"lIIlIliIIlIl","Dz+bHLnA6nqrsXWwPmYg73TuqFZx3YolhrJnxf2B0Oo5Is7sAbZ/Hj0=">()
   );
   private static boolean lIliIilIiiIliIilIi;
   private static final class_2960 lIilIilIiiIilIilIi = class_2960.method_60655(
      lIIlIliIIlIl<"lIIlIliIIlIl","GSM0+q1S8y/SuOzmF2+o320flgAOBYvD4B4OtnPWrvoWb9WBnpI=">(),
      lIIlIliIIlIl<"lIIlIliIIlIl","I/xXPmOKOBOJJYB6z4vHblkIXdb6yC+hTuqHoaaVtyjHqKdp">()
   );
   private static final class_2960 llllIilIiilllIilIi = class_2960.method_60655(
      lIIlIliIIlIl<"lIIlIliIIlIl","GSM0+q1S8y/SuOzmF2+o320flgAOBYvD4B4OtnPWrvoWb9WBnpI=">(),
      lIIlIliIIlIl<"lIIlIliIIlIl","4K34cexZDYHFInowSz1RLhDBsXm6q6xZ1enczj3wSXN+TmcU">()
   );
   private static boolean llIiIilIiilIiIilIi;
   private static boolean lliiIilIiiliiIilIi;
   private static final class_2960 lIiIlilIiiIiIlilIi = class_2960.method_60655(
      lIIlIliIIlIl<"lIIlIliIIlIl","GSM0+q1S8y/SuOzmF2+o320flgAOBYvD4B4OtnPWrvoWb9WBnpI=">(),
      lIIlIliIIlIl<"lIIlIliIIlIl","79oVfHV0OngA1h7+QO/Y0cYRfxndcYbqix28KM1eqvrxg34+84SGYg==">()
   );
   private static boolean IilIlilIililIlilIi;
   private static final Map<String, class_2960> illllilIiIilllilIi = new HashMap<>();
   private static boolean lllIlilIiillIlilIi;
   private static final int iiIllilIiIIlllilIi = 96;
   private static boolean iIIiIilIiIlIiIilIi;
   private static final Map<String, class_2960> liiIlilIiiiiIlilIi = new HashMap<>();
   private static final int IiIIIilIiliIIIilIi = 64;
   private static final class_2960 lIIlIilIiiIIlIilIi = class_2960.method_60655(
      lIIlIliIIlIl<"lIIlIliIIlIl","GSM0+q1S8y/SuOzmF2+o320flgAOBYvD4B4OtnPWrvoWb9WBnpI=">(),
      lIIlIliIIlIl<"lIIlIliIIlIl","HkuBgc7SRdZAuBf9k0QQYbZ5LybMzDtniy0chdBXDe3YAeResg==">()
   );
   private static final class_2960 iiiIIilIiIIIlIilIi = class_2960.method_60655(
      lIIlIliIIlIl<"lIIlIliIIlIl","GSM0+q1S8y/SuOzmF2+o320flgAOBYvD4B4OtnPWrvoWb9WBnpI=">(),
      lIIlIliIIlIl<"lIIlIliIIlIl","5uVi4CPmrHR2+0p1Ez629+eagxxTYWTC+uZnp5yd113tHMw=">()
   );
   private static boolean iilIlilIiIIiIlilIi;
   private static final class_2960 ilIlIilIiIiIlIilIi = class_2960.method_60655(
      lIIlIliIIlIl<"lIIlIliIIlIl","GSM0+q1S8y/SuOzmF2+o320flgAOBYvD4B4OtnPWrvoWb9WBnpI=">(),
      lIIlIliIIlIl<"lIIlIliIIlIl","XocWnFtp2qzJLY37tZW6M7B0o0nvbpo+z6v9tb1hZ9mdj4J4Rw==">()
   );
   private static boolean IlliIilIillliIilIi;
   private static final class_2960 IIllIilIilIllIilIi = class_2960.method_60655(
      lIIlIliIIlIl<"lIIlIliIIlIl","GSM0+q1S8y/SuOzmF2+o320flgAOBYvD4B4OtnPWrvoWb9WBnpI=">(),
      lIIlIliIIlIl<"lIIlIliIIlIl","UBDMTzf+k/veHqDHRLIVN4YtR0ijLY+MDxq8ImuV1rdn8jCxyg==">()
   );
   private static final class_2960 liIlIilIiiiIlIilIi = class_2960.method_60655(
      lIIlIliIIlIl<"lIIlIliIIlIl","GSM0+q1S8y/SuOzmF2+o320flgAOBYvD4B4OtnPWrvoWb9WBnpI=">(),
      lIIlIliIIlIl<"lIIlIliIIlIl","FfzY89xHUF4C5ep9e/5xCyT+tVINn2dSf6ZzwGYI6/wk/jUUSA==">()
   );
   private static boolean IiIiIilIiliIiIilIi;
   private static boolean illiIilIiIiliIilIi;

   private static boolean lIlIliIlIl(class_2960 id, String paint, lilIIiIliilIIiIl strokeW, float label) {
      long var9 = -591567816280792367L;

      try {
         BufferedImage var4 = new BufferedImage(64, 64, 2);
         Graphics2D var5 = var4.createGraphics();
         var5.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
         var5.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
         var5.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
         var5.setColor(Color.WHITE);
         if (label > 0.0F) {
            var5.setStroke(new BasicStroke(label, 1, 1));
         }

         strokeW.paint(var5);
         var5.dispose();
         class_1011 var6 = new class_1011(64, 64, false);
         int[] var7 = var4.getRGB(0, 0, 64, 64, null, 0, 64);

         for (long var12 = var9 ^ (0L ^ var9) & -1L << 32; (int)(var12 >>> 32) < var7.length; var12 += 4294967296L) {
            var6.method_61941((int)(var12 >>> 32) % 64, (int)(var12 >>> 32) / 64, var7[(int)(var12 >>> 32)]);
         }

         class_1043 var8 = new class_1043(() -> paint, var6);
         class_310.method_1551().method_1531().method_4616(id, var8);
         return true;
      } catch (Throwable var11) {
         return false;
      }
   }

   private static double IlIllllIll(String pos, int[] d) {
      long var8 = 8833180110201308740L;
      long var10 = 8699452615713629224L;
      long var12 = -1983293660516861024L;
      lIIlliIIll(pos, d);
      var8 ^= ((long)pos.length() << 32 ^ var8) & -1L << 32;
      var8 ^= ((long)d[0] ^ var8) & -1L >>> 32;
      var10 ^= ((long)((int)var8) << 32 ^ var10) & -1L << 32;
      if ((int)(var10 >>> 32) < (int)(var8 >>> 32) && (pos.charAt((int)(var10 >>> 32)) == '-' || pos.charAt((int)(var10 >>> 32)) == '+')) {
         var10 += 4294967296L;
      }

      var10 ^= (0L ^ var10) & -1L >>> 32;
      var12 ^= (0L ^ var12) & -1L << 32;

      while ((int)(var10 >>> 32) < (int)(var8 >>> 32)) {
         var12 ^= ((long)pos.charAt((int)(var10 >>> 32)) ^ var12) & -1L >>> 32;
         if ((int)var12 >= 48 && (int)var12 <= 57) {
            var12 ^= (4294967296L ^ var12) & -1L << 32;
            var10 += 4294967296L;
         } else {
            if ((int)var12 != 46 || (int)var10 != 0) {
               break;
            }

            var10 ^= (1L ^ var10) & -1L >>> 32;
            var10 += 4294967296L;
         }
      }

      if ((int)(var12 >>> 32) != 0
         && (int)(var10 >>> 32) < (int)(var8 >>> 32)
         && (pos.charAt((int)(var10 >>> 32)) == 'e' || pos.charAt((int)(var10 >>> 32)) == 'E')) {
         var12 ^= ((long)((int)(var10 >>> 32) + 1) ^ var12) & -1L >>> 32;
         if ((int)var12 < (int)(var8 >>> 32) && (pos.charAt((int)var12) == '-' || pos.charAt((int)var12) == '+')) {
            var12 ^= (var12 ^ var12 + (long)1) & -1L >>> 32;
         }

         if ((int)var12 < (int)(var8 >>> 32) && Character.isDigit(pos.charAt((int)var12))) {
            var10 ^= ((long)((int)var12) << 32 ^ var10) & -1L << 32;

            while ((int)(var10 >>> 32) < (int)(var8 >>> 32) && Character.isDigit(pos.charAt((int)(var10 >>> 32)))) {
               var10 += 4294967296L;
            }
         }
      }

      if ((int)(var12 >>> 32) == 0) {
         throw new IllegalArgumentException(
            lIIlIliIIlIl<"lIIlIliIIlIl","MrcLymYj1oImtXdban9+Q0C0NbBuleOox6zp6qPGZSNtjA7CS172mgedPPDHXjsxXAfsLQ==">() + (int)var8
         );
      } else {
         d[0] = (int)(var10 >>> 32);
         return Double.parseDouble(pos.substring((int)var8, (int)(var10 >>> 32)));
      }
   }

   private static boolean llIIlilIIl(class_2960 label, String paint, lilIIiIliilIIiIl id) {
      return lIlIliIlIl(label, paint, id, 7.36F);
   }

   public static class_2960 IiiIlliiIl(String name) {
      long var6 = 3564065926887522766L;
      class_2960 var1 = illllilIiIilllilIi.get(name);
      if (var1 != null) {
         return var1;
      } else {
         class_2960 var2 = class_2960.method_60655(
            lIIlIliIIlIl<"lIIlIliIIlIl","GSM0+q1S8y/SuOzmF2+o320flgAOBYvD4B4OtnPWrvoWb9WBnpI=">(),
            lIIlIliIIlIl<"lIIlIliIIlIl","m9Ld2pUcV8c4lrfmMheoDjv7XGe2b/Z0HGHzNtIyycbF96Ljbqrr">() + name.replace('-', '_')
         );
         var6 ^= (-4294967296L ^ var6) & -1L << 32;
         switch (name.hashCode()) {
            case -1695069083:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","nFsZRjOo8P25n42JVo+lGOYNhLVdicaCtY0w1UMcJ1/YwgbKZUtH7C4=">())) {
                  var6 ^= (68719476736L ^ var6) & -1L << 32;
               }
               break;
            case -1249503706:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","bh/JrA3kRYk4RplDbShb1tmm29kWwnyGejuoBEbDBSsCWF+Zkw==">())) {
                  var6 ^= (21474836480L ^ var6) & -1L << 32;
               }
               break;
            case -1109732030:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","zOjUNre+81pgtqOWQGFC3nu0Ujds/+qxCoDB6BfjGa77lQ==">())) {
                  var6 ^= (64424509440L ^ var6) & -1L << 32;
               }
               break;
            case -889296362:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","tjfHRkKgAkOR+hHShP2hUz9HtIF13ddyvsB9OmVAMlZe/A==">())) {
                  var6 ^= (73014444032L ^ var6) & -1L << 32;
               }
               break;
            case -807062458:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","885mKPfI0/KgywHekOuHUGZBuFL801IRWl9mqFEZEGJr1KU=">())) {
                  var6 ^= (30064771072L ^ var6) & -1L << 32;
               }
               break;
            case -734622710:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","gn0H0qHFr7ap80ZJNd4ET5IqHA98kyULlP0XMbEuQxGAFsdHmEIMJtA=">())) {
                  var6 ^= (55834574848L ^ var6) & -1L << 32;
               }
               break;
            case -620676243:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","SI0nFRmyWofh71KwNFKZ1o3EvvJY7Xo2ZHEY06uQSfxwGai2bio=">())) {
                  var6 ^= (38654705664L ^ var6) & -1L << 32;
               }
               break;
            case -79909723:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","Y81dZIzhyrUIqyIWlPqovx7ZRNvGY2euLqUZzAplbLZli/K8iYU=">())) {
                  var6 ^= (60129542144L ^ var6) & -1L << 32;
               }
               break;
            case 120:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","SRe+ORTHlscgXRzE6i7+o2VJcPcBfjNnRP0A7HM=">())) {
                  var6 ^= (12884901888L ^ var6) & -1L << 32;
               }
               break;
            case 97735:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","xhnZn4FTp1G2hZ7Ee1IBbCPnRzjHnSo6myLTT8rUwQ==">())) {
                  var6 ^= (77309411328L ^ var6) & -1L << 32;
               }
               break;
            case 3444122:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","JOW1NZLE1giEQnS7FBj7mVw5ph9xU3VRMpUcW5kH73A=">())) {
                  var6 ^= (47244640256L ^ var6) & -1L << 32;
               }
               break;
            case 103901296:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","kJNlvUk/EAXG4wk3dfPkZ9pm0y/qrmMfMfFgtj2uoh/S">())) {
                  var6 ^= (42949672960L ^ var6) & -1L << 32;
               }
               break;
            case 530081012:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","tnxfdg7uY6h9th5Z4ErX++qgnlsYzcS5Edp6PXjN+9mfFU0sGQTYrw==">())) {
                  var6 ^= (34359738368L ^ var6) & -1L << 32;
               }
               break;
            case 530309209:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","1jmUEchzSMH2/Ci8l7hdaTUFmf4X+wVbbHGIXVQ+g4NnZW8y7r1kEQ==">())) {
                  var6 ^= (51539607552L ^ var6) & -1L << 32;
               }
               break;
            case 835567012:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","kMB4pyhMyQZgbqnGuxEPa8CdN0uUIbAq0VZC+AqozbMAsp8=">())) {
                  var6 ^= (4294967296L ^ var6) & -1L << 32;
               }
               break;
            case 1397962786:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","gHQ30nwhxPfoHkIz6VZOf0hrR3S9F1vSgf5VcoODmVUx3wLjdg==">())) {
                  var6 ^= (17179869184L ^ var6) & -1L << 32;
               }
               break;
            case 1640633897:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","BHFRzIxnpDsCi9blJ4cbj6OEsoWHeRILjQFpbccJjL3li+ktilvO4+CmYCo1">())) {
                  var6 ^= (25769803776L ^ var6) & -1L << 32;
               }
               break;
            case 1965038601:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","6E7gv3rbQX28kEJejUrszVbLe9CG4Sp8DKbqaJZeLnLILN6m0bt3">())) {
                  var6 ^= (8589934592L ^ var6) & -1L << 32;
               }
               break;
            case 2121767808:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","3ucOE4H0DWBmCbNsE0fjRW+uYZmkWvZFeO1V2BperHomD8+3">())) {
                  var6 ^= (0L ^ var6) & -1L << 32;
               }
         }
         String[] var3 = switch ((int)(var6 >>> 32)) {
            case 0 -> new String[]{
            lIIlIliIIlIl<"lIIlIliIIlIl","vU7mbQkYxCHrgIAaVrs+xYZcC/fazoVDwZzyh8D24Acv1EMaZorzB9I/bk6QlE7oXsoM86d1Uvzj9Vc/JR3ZeLonmM62L/QF+VLhh4uneJY8X/Zo0rm9TjMBLsCxctNomQ==">(),
            lIIlIliIIlIl<"lIIlIliIIlIl","ZavTCGZEiw1vbpT2VJ0B0TV5VLpSrQnj8uXngvtxr5o3YFg=">(),
            lIIlIliIIlIl<"lIIlIliIIlIl","lHCBB7GoSEGHlOEAHVj1fRay1Mz3IAY6B0/A3dgfrZIHFDE=">(),
            lIIlIliIIlIl<"lIIlIliIIlIl","oNBFIa/wWL2ekvUrQL91Lh7W+p0w2iXmQrxjKtMzkf/rlpCf3Lil7u+ck+P+2jhyQcaYgMbLiHahimrTUC4sco2Dlio=">(),
            lIIlIliIIlIl<"lIIlIliIIlIl","CN52dYMBWuPSwm+5BwVeZN+YtS/bKmtK3ubYfqHSDs13pBEYX7yviMO/qtX+AL4vO6CNyCvg/CMe7uUJ0WE448b7">()
         };
            case 1 -> new String[]{
            lIIlIliIIlIl<"lIIlIliIIlIl","043sdZ7+dCAoGTA9ExdlMLyFGabAs/PY/PgKqniMoyIL4uGnHPhWw3wNrw8S60dXKqwrwyCh3vOJcy4ZUlpseAM7j17h5mU1lHaqhkt2wVq29FxySnHbhP3UmvNUf9DgEGv/bDK+FwF+nOJOU4grm0vHXdkimBjfS679/7SZeno=">(),
            lIIlIliIIlIl<"lIIlIliIIlIl","mXQMUzjL4bvv8Ce8apWUC3qfSh8Y4iK/1YtI04vbneaVKxJ+EtO3PyPVpwpsmPAG3L7P0O1HSA/sRYq85Iw=">()
         };
            case 2 -> new String[]{
            lIIlIliIIlIl<"lIIlIliIIlIl","B7gKY+KB74Fq/MzXQrMRc8ZO9/9ziDd9u+5k3af6Lp1JD8z5z+Q03jK8oA2P7EBMy0Z1XAGELLXL77EuH4w5S17fb2cWddZ4Ibsoo6rSJ7bNrv0wbbcpS7aNChg2XsG2yw==">(),
            lIIlIliIIlIl<"lIIlIliIIlIl","iCJ3ZqmYnzxMF+HtnEEX5fnEkoejv2q74ySNgNb3QC6pjj9P5UJ+PzgcCOQkITujn1qig0dfwL3MRWanyQRY1t7u265Gx12PCfj5g3rGO0rWLCqMO/4dYHarvmefMxJyKEWE">(),
            lIIlIliIIlIl<"lIIlIliIIlIl","+bR64qGwB2WaVb85VVlU/7ZYvRUZaBwdYgNGQeeESmRizKC8ZG2vXYmg9SX3dUQyouwH3dq9W6vkOsIzaa9SCCcmSnOwcYgKgsE1gINJJqyVeZVG/MLHsEkkVFAGgWEn4CzcSU8=">(),
            lIIlIliIIlIl<"lIIlIliIIlIl","UCBEIjCaHSYoSsYw0ZlAz3zY7mD4xUAQr13xpPlXuV5hoCXTstzTfvciy9o0LQYZQ8P6kdG+e7n/px0ae0Di9JaWVhyBdkQxatIyQN2+jGzyWfD8cubr2zJuQFCMHKtLGGv/">()
         };
            case 3 -> new String[]{
            lIIlIliIIlIl<"lIIlIliIIlIl","cpWPwHU8E2C3iLucjYZ8n5ou3idZTEJ/aw48f+a+hU8KEBOhrZ0=">(),
            lIIlIliIIlIl<"lIIlIliIIlIl","haEOWNwVmuDjKoVvzdzuAtI+hs8j4+bVJw5c+r1laOwtOQyPg1E=">()
         };
            case 4 -> new String[]{
            lIIlIliIIlIl<"lIIlIliIIlIl","J3I89cavoVqUgakRbDneaeqUISFkBqUGWjfqicKtOsNC9cDM0y4rkU9kUNTm2lIc/Cgu/GbL8zUNFbPgLHNhKmU2Yiw=">(),
            lIIlIliIIlIl<"lIIlIliIIlIl","OPP0+4t4PaCvpOrl7+8bayxoL1DA5wkPsUO/10OY5jyNDrB5+A==">(),
            lIIlIliIIlIl<"lIIlIliIIlIl","8BZRnrMfS5oxg/Fzsq2h9m8ceNf5G3xOLMoiLSiEItOeW0k=">(),
            lIIlIliIIlIl<"lIIlIliIIlIl","nTaTGLQsVQ1Em/3hSqntwok2DsPdiIXC1cZJELMuKw7THwA=">(),
            lIIlIliIIlIl<"lIIlIliIIlIl","tDxuLTlwqVgntK9OrmyuTNOYnwqXDZY9iJ7m5YypKgy1XCmFGA==">()
         };
            case 5 -> new String[]{
            lIIlIliIIlIl<"lIIlIliIIlIl","+R6vaBYkxMkstQPDlu4UH+I4HSho3huPYbC2PkXUi6k0BhFdfBf1lHmssCZYhqXGKRo/NJYArNp6cMk6FYUZ2j0lttl4rH7Od3YCGuc=">(),
            lIIlIliIIlIl<"lIIlIliIIlIl","z4LsxduuzcCOlOCuUo5j9+CX8yjHPrJz55yQnQL4iBFoZHX08Hw=">()
         };
            case 6 -> new String[]{
            lIIlIliIIlIl<"lIIlIliIIlIl","NAO1I92sMhj+mRBkATlzZ3SBJGlWrQ8sIpYzurzPcWbBxDyZKLHLKg31">(),
            lIIlIliIIlIl<"lIIlIliIIlIl","lue164yPQ7ERT/0hM9J2aNQRuiWdMRFf6IN0HgyaxVLofEs08DTdMpwUEg==">(),
            lIIlIliIIlIl<"lIIlIliIIlIl","MpgDwiAu7/6GP0HgmOSNiGITIFUYRNL3yPFjBHnMVKhenWEu">(),
            lIIlIliIIlIl<"lIIlIliIIlIl","+Grmn9mF4V2eo4LMTwHX5LO1QhBmqPOzDGEn/0lGMNBBvPMn">(),
            lIIlIliIIlIl<"lIIlIliIIlIl","CNLulFhc3C9W3rgZ8iU+8lR9UO9J1Ojv5CP0T/1RluJxc9A=">(),
            lIIlIliIIlIl<"lIIlIliIIlIl","r7EoIAtbvO/SgXLpQOiHyphfNsSRotPK6GsqrvXMlYV0u+M=">()
         };
            case 7 -> new String[]{
            lIIlIliIIlIl<"lIIlIliIIlIl","VJUf//4HM8UzZv23sSenjoYY0MGszC6koJRI5jflZEY+9Q6fJoBjKVuNhpYjJsTQzlGHS5Hhib+YxLUqFNm0y/G0loTb418yenNObLA9ZkTbOrFsBe7k1hR7yh3dN4wIsavuiOdj0O9Mw+R9Pk16xvgBj/Wjf6SZEtyRJHgVPt8nfdtI36KlzCMTgax1PwdNw438cw==">(),
            lIIlIliIIlIl<"lIIlIliIIlIl","Dy219FJxl/3w6fmt1FlU6EfA5Rf3gMToHTUAuyTRF3Prie5Qow==">(),
            lIIlIliIIlIl<"lIIlIliIIlIl","N8j0nf6pmse4pAjLhcuW9DODAsHweWyvuQhefcu8XfxiWcJnh4gCZB51A/vWp+GZIaHe77B8hMiFU0RxwDdRmQnke0ywQL4=">(),
            lIIlIliIIlIl<"lIIlIliIIlIl","gHkpUUOJKGg+jP2ZwMyusT1f6Gyg+B22OpstIM8Ql5+UbwtMmxyX+g4FIFk=">()
         };
            case 8 -> new String[]{lIIlIliIIlIl<"lIIlIliIIlIl","nh+jbNAMZf/bXItqV+XLcGHotyO+5R0DXV7CZV3EO3zPAKb7NDdN6Q==">()};
            case 9 -> new String[]{lIIlIliIIlIl<"lIIlIliIIlIl","lHsTYABuyaw4cvJGVYEv4gQEfkpGazCR+kXpBcQQ/9vNF1FFxUWR7us5">()};
            case 10 -> new String[]{lIIlIliIIlIl<"lIIlIliIIlIl","tA70U2ClQ9GJX4tCpGAGzEWwZYPeAaDPYh3eweJp7afxhZEk">()};
            case 11 -> new String[]{
            lIIlIliIIlIl<"lIIlIliIIlIl","tA70U2ClQ9GJX4tCpGAGzEWwZYPeAaDPYh3eweJp7afxhZEk">(),
            lIIlIliIIlIl<"lIIlIliIIlIl","qSnErLUdsrQVOK5WV35afvQPJI2P1FKWzwKWzHjCJIinm0Rf">()
         };
            case 12 -> new String[]{lIIlIliIIlIl<"lIIlIliIIlIl","ux6T3PQbw568QtEB+7/vnWt0imJho9katJvP4iHD7gIXK0ARKFmKwOsx">()};
            case 13 -> new String[]{lIIlIliIIlIl<"lIIlIliIIlIl","TLCiOR9pb1ZjzRVX1Vc0JHv6rr4SPA4hZAZOvzYk9d2D9Am7x0J7krU=">()};
            case 14 -> new String[]{
            lIIlIliIIlIl<"lIIlIliIIlIl","OX0IrG16/swDsaW1Jfb+dxs303Hf7fNRhriu/HyCgFfIgfbaBjC7UIWitSWEk+q967Dx55Wmr9QzLl/0y4ktD+WydIs9aZDYKIAlzwQ=">(),
            lIIlIliIIlIl<"lIIlIliIIlIl","N34+BPFU4x0q1yUwhZCfpWjbkjWfq5K85AkBjfUYJWx0T4Qz">()
         };
            case 15 -> new String[]{
            lIIlIliIIlIl<"lIIlIliIIlIl","6yqwFq361oN1RhAcxNA9Z7l9h4bpLdMn5Xx3T1ihlIMX+zcxN6DKtyHq9NuNWE++uwZ9AeDQzDbUmxcqgjm4V4q7G4TGKyUt/ElLE3WcJH+iaR7pDgJ2tMaourTUMGbgs1AbSj3PmbYTxfDWGaqFvVz3dD8pyLMp3fTSsUPDJlfzhsGSp0A3lA==">(),
            lIIlIliIIlIl<"lIIlIliIIlIl","IbFqUDkbFh18PvnsmqTgKTcEQG6f2uxYaLzT7S1xdvXGc+mDZe7RwcaNmNIanAki2w1oKoPp98XtpDWSmmj76xen21H8sT95">(),
            lIIlIliIIlIl<"lIIlIliIIlIl","nrFfuyRTEqoF89vXYZflkFjpf/4ncvfNGVRHiZjS/TJqqM6i7eczudCae4fyjekMdLgbvEJOwwK/3f8ihJJEZMPiQ4z0mMT0">()
         };
            case 16 -> new String[]{
            lIIlIliIIlIl<"lIIlIliIIlIl","QfO8kbRkDyyz++eT+ZiRFvayND7B3H79RqS5A1E8AV9/zXoGSr4mc5k+coI0KT3HJwIVkCCbglgn5vMjXw==">(),
            lIIlIliIIlIl<"lIIlIliIIlIl","qXPTTaYiOu8eX5ani0zry3srjtyJyphn8q96mxWgS85z2n2sVKvwGRU/4PBfyCtQ6XLMLM9wYroriFmKPvc=">(),
            lIIlIliIIlIl<"lIIlIliIIlIl","8O+Ycfq8HGtkuhuYl69zTkB5H/p6VlLomENigq4JWbsdBxSyx1eQTatFlSowpdPa8Qsh8fvOD81wv9czLwWZnGZaL/5NB2MU4GrELmPct/Ja6zFCu1/fYKapwhcYeo3AhC+ID/3jDR1eSAUR">()
         };
            case 17 -> new String[]{
            lIIlIliIIlIl<"lIIlIliIIlIl","EKAUq/oFTqDk099oENyR67IKm8kMdso3AwzpZKbH6CwXrxB9qpM6SOSjv7hXPMXeaVIowQKxWVU=">(),
            lIIlIliIIlIl<"lIIlIliIIlIl","uN9RT4Q+x+Z+sslevmPuRAsBOCp4l9nkTAqCh6+izoWIRZc2gaY=">(),
            lIIlIliIIlIl<"lIIlIliIIlIl","oCuGk+uGC3CTkstHYEHNofkt0NMCFbmfM4oA9Qs3Oa9zxd8YZdg=">(),
            lIIlIliIIlIl<"lIIlIliIIlIl","cvtAXO5BTbzRO/28INqzgBgR+3hCYZy4nd9ZDla7r+sLFRvNupk=">(),
            lIIlIliIIlIl<"lIIlIliIIlIl","C8Nuesvpc5w5dQ1J9/qp/mpwGpTNlcVkxzQ/wB1qeLi2TYwTJCbfAHa48KZYan2N+JGMSst8Ow==">(),
            lIIlIliIIlIl<"lIIlIliIIlIl","ZnjrV3s7GJ95GoIBZVbVdj1Aqhn5hyubxWH+nVfiU8q4D6r3oQ==">(),
            lIIlIliIIlIl<"lIIlIliIIlIl","0sfbCTJdEvhcS0H6xdr7QqQ7XsEW9vbrcmDZtgO5IZPquA3dHMY=">(),
            lIIlIliIIlIl<"lIIlIliIIlIl","0dtW9FFpoBv/p08+rveuHlFLMbP8Kh0+AWkdQXasSMFpD3jIYA==">()
         };
            case 18 -> new String[]{
            lIIlIliIIlIl<"lIIlIliIIlIl","gJwdxsS95qwN7whiYOR6u75yoAktZHBgwXM8t07huiPIpx48vw==">(),
            lIIlIliIIlIl<"lIIlIliIIlIl","a9rnd1ys7nvoL3ZLP6p1hrzNOfmEP01S6vJbKOEN4yxjz/bjBDSvXuv19laC05ZlZWvshOzQnpbT2jSyyoQSJipGzk15kWU5JC258WjY8ZyZGtxPpXc8sJ0k3vqJOOb7wfkX">(),
            lIIlIliIIlIl<"lIIlIliIIlIl","ce3pwhko2v46OkLWE1gCw84XMrTu3dJ2Dh3jSzLhRTA5LQw=">(),
            lIIlIliIIlIl<"lIIlIliIIlIl","05+wlhQFohfa64NA30XpdiGt+UwTpWPR+bVyAHwMOXiUH4Dj">(),
            lIIlIliIIlIl<"lIIlIliIIlIl","zvnVUzYj/ouX8GMpsoFevm00cO36Z+hh9EsofIQvyc/Zf892">(),
            lIIlIliIIlIl<"lIIlIliIIlIl","bSbHcTV5njquzmdf7xqxscSol+SSJNNegE7N3KyFjAoSYOk=">()
         };
            default -> null;
         };
         if (var3 != null) {
            iIlllIllll(var2, lIIlIliIIlIl<"lIIlIliIIlIl","SlBixN12RgukGNV1Jts9qm6AtTtq9dCsw95NJnYB4CzNByOaJLnmruhwMwY=">() + name, 96, 24.0F, 2.0F, paths -> {
               long var6x = -4138220904846890770L;
               String[] var2x = var3;
               var6x ^= ((long)var3.length << 32 ^ var6x) & -1L << 32;

               for (long var9 = var6x ^ (0L ^ var6x) & -1L >>> 32; (int)var9 < (int)(var9 >>> 32); var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32) {
                  String var5 = var2x[(int)var9];
                  paths.draw(iiiIlIIIll(var5));
               }
            });
         }

         illllilIiIilllilIi.put(name, var2);
         return var2;
      }
   }

   public static class_2960 IIlilIliiIli() {
      if (!iIlIlilIiIllIlilIi) {
         iIlIlilIiIllIlilIi = iiIIlIIlIl(
            IlilIilIillilIilIi, lIIlIliIIlIl<"lIIlIliIIlIl","KpAW9UQCmV1HiEje0VVTUvAvXmGn9cL6+/DddjJwcAGwQQfM1p1lOzjY8CLmKw==">(), g -> {
               GeneralPath var1 = new GeneralPath();
               var1.moveTo(17.92, 25.6);
               var1.lineTo(32.0, 39.68);
               var1.lineTo(46.08, 25.6);
               g.draw(var1);
            }
         );
      }

      return IlilIilIillilIilIi;
   }

   public static class_2960 IlIlllIlilIl() {
      if (!liliIilIiiiliIilIi) {
         liliIilIiiiliIilIi = IiIIlliIIl(iiiIIilIiIIIlIilIi, lIIlIliIIlIl<"lIIlIliIIlIl","b7bWRlX6T0vNHmZJnn+Jz0+Ye0rckmhX2u7ZiNCCuQKzFIAKnKNJaQ==">(), g -> {
            GeneralPath var1 = new GeneralPath();
            var1.moveTo(32.0, 11.52);
            var1.lineTo(47.36, 51.2);
            var1.lineTo(32.0, 40.96);
            var1.lineTo(16.64, 51.2);
            var1.closePath();
            g.fill(var1);
         });
      }

      return iiiIIilIiIIIlIilIi;
   }

   private static void lIIlliIIll(String pos, int[] d) {
      while (d[0] < pos.length() && (Character.isWhitespace(pos.charAt(d[0])) || pos.charAt(d[0]) == ',')) {
         d[0]++;
      }
   }

   private static boolean iiIIlIIlIl(class_2960 paint, String id, lilIIiIliilIIiIl label) {
      return lIlIliIlIl(paint, id, label, 4.608F);
   }

   private static boolean IIllllIlll(class_2960 paint, String label, lilIIiIliilIIiIl id) {
      return iIlllIllll(paint, label, 48, 16.0F, 1.5F, id);
   }

   public static class_2960 Iiilliiliiil() {
      if (!IlIIlilIillIIlilIi) {
         IlIIlilIillIIlilIi = IiIIlliIIl(llllIilIiilllIilIi, lIIlIliIIlIl<"lIIlIliIIlIl","PUwNa5NnWAtFAMSHeNOl2ooxL5Ud7hAprRun4cx2QvOLfh8BTEo3DH8=">(), g -> {
            g.fill(new java.awt.geom.Ellipse2D.Double(17.92, 35.84, 14.08, 10.88));
            g.fill(new java.awt.geom.RoundRectangle2D.Double(30.08, 15.36, 3.2, 26.88, 1.28, 1.28));
            GeneralPath var1 = new GeneralPath();
            var1.moveTo(33.28, 15.36);
            var1.lineTo(43.52, 19.84);
            var1.lineTo(43.52, 28.16);
            var1.lineTo(33.28, 23.68);
            var1.closePath();
            g.fill(var1);
         });
      }

      return llllIilIiilllIilIi;
   }

   public static class_2960 illIlIilIl(String name) {
      long var6 = 8031316433233508727L;
      class_2960 var1 = IiIllilIiliIllilIi.get(name);
      if (var1 != null) {
         return var1;
      } else {
         class_2960 var2 = class_2960.method_60655(
            lIIlIliIIlIl<"lIIlIliIIlIl","GSM0+q1S8y/SuOzmF2+o320flgAOBYvD4B4OtnPWrvoWb9WBnpI=">(),
            lIIlIliIIlIl<"lIIlIliIIlIl","GBrbT/LHLL99DAHMQ8iK9Zwaue1NB03I3XHlLy+q1GJZARi2Cg==">() + name
         );
         String var3 = lIIlIliIIlIl<"lIIlIliIIlIl","cf8yVKJ+yonnz0K5sGT2LUEhlpfRtvwmvweQopXBPYfZDr4vjFwT12r4">() + name;
         var6 ^= (-4294967296L ^ var6) & -1L << 32;
         switch (name.hashCode()) {
            case -1618876223:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","s6SvpvPCD1mppEE5j9W8Dxm3K+cBMU9/AF9WE1P7xrZmMSiwSg==">())) {
                  var6 ^= (64424509440L ^ var6) & -1L << 32;
               }
               break;
            case -991716523:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","0CH3x3jjUbVC/yUZUU0HXdM7olzU5sEFaBIeQdwVkftPUg==">())) {
                  var6 ^= (42949672960L ^ var6) & -1L << 32;
               }
               break;
            case -905826493:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","1suFVLrcRpSBMqoGgy3ll2bOEODEPpP3zcU1TkaNN19/cA==">())) {
                  var6 ^= (17179869184L ^ var6) & -1L << 32;
               }
               break;
            case -903340183:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","O/hINenOYRgZdadf1TJaWGORNdJ2mZQDjKr7jb/e7CJOww==">())) {
                  var6 ^= (34359738368L ^ var6) & -1L << 32;
               }
               break;
            case -902467928:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","/pgVfK3x60ciONXEAhf0h7fIIx40WSf/ooH61Yj1c0P0uw==">())) {
                  var6 ^= (12884901888L ^ var6) & -1L << 32;
               }
               break;
            case -880905839:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","LVl8p79VniesfUFO90EMNAuRld/yyeM6z+E3TyFPCVUJIg==">())) {
                  var6 ^= (38654705664L ^ var6) & -1L << 32;
               }
               break;
            case 110997:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","xnrwUMRbFxe2sgBAhGg/ZPfmcticAs7I1TVYIZaCPw==">())) {
                  var6 ^= (30064771072L ^ var6) & -1L << 32;
               }
               break;
            case 3064885:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","FfLfUXAzDOsAlErqXK5OE6+yuwzZ6kl7cc3NESsWT3M=">())) {
                  var6 ^= (47244640256L ^ var6) & -1L << 32;
               }
               break;
            case 3443508:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","OtxLLH/fMv1rikudhCsr9tLRo0E5xJs638Uypd2+JMc=">())) {
                  var6 ^= (60129542144L ^ var6) & -1L << 32;
               }
               break;
            case 3649547:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","0FTMFK+oDA2FaNGSXtBqAWKRM3z3IjEhQvqRHFZGpUg=">())) {
                  var6 ^= (68719476736L ^ var6) & -1L << 32;
               }
               break;
            case 94627080:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","TmC+trIwokUbDMpTlBIAzllzA1ldEjk5X51hycFCdl3h">())) {
                  var6 ^= (51539607552L ^ var6) & -1L << 32;
               }
               break;
            case 94755854:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","DY/SkLaSwZt7S3oeYbNBMg9hxm0QUNopTS6vo6vmcru2">())) {
                  var6 ^= (0L ^ var6) & -1L << 32;
               }
               break;
            case 94935104:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","M77nLU7aMTygUWx/I1hdX3QqJuLG8Bv5sBd1wb1tm7vz">())) {
                  var6 ^= (55834574848L ^ var6) & -1L << 32;
               }
               break;
            case 97513459:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","SPLj2WSIt+swJ3wv0rgER1vifhxZQV3NpHy8ZUdotZJd">())) {
                  var6 ^= (25769803776L ^ var6) & -1L << 32;
               }
               break;
            case 110364485:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","a9tphm157oUrHtfTq1rVqP/VZOUTlpRilIBgZe69duA3">())) {
                  var6 ^= (4294967296L ^ var6) & -1L << 32;
               }
               break;
            case 503739367:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","EZVqH7CXAV7MutMQDonvDb2g5+lkWtneSCcZaO4vXUu3cIyH">())) {
                  var6 ^= (21474836480L ^ var6) & -1L << 32;
               }
               break;
            case 1236319578:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","WdmC5ZMNNJzkO7TeG9+h6fw5u7Vtp7NV/E+tyvwxZarPUIA=">())) {
                  var6 ^= (8589934592L ^ var6) & -1L << 32;
               }
         }

         switch ((int)(var6 >>> 32)) {
            case 0:
               IIllllIlll(var2, var3, g -> {
                  iIiIlIliIl(g, 7.5, 7.5, 5.0);
                  GeneralPath var1x = new GeneralPath();
                  var1x.moveTo(7.5, 4.5);
                  var1x.lineTo(7.5, 7.5);
                  var1x.lineTo(9.5, 9.0);
                  g.draw(var1x);
               });
               break;
            case 1:
               IIllllIlll(var2, var3, g -> {
                  iIiIlIliIl(g, 7.5, 8.5, 4.0);
                  lilIliilIl(g, 6.5, 2.5, 8.5, 2.5);
                  lilIliilIl(g, 7.5, 8.5, 7.5, 6.5);
               });
               break;
            case 2:
               IIllllIlll(var2, var3, g -> {
                  lliIliliIl(g, 2.5, 2.5, 10.0, 7.0, 1.5);
                  lilIliilIl(g, 7.5, 9.5, 7.5, 12.5);
                  lilIliilIl(g, 5.5, 12.5, 9.5, 12.5);
               });
               break;
            case 3:
               IIllllIlll(var2, var3, g -> {
                  lilIliilIl(g, 3.5, 12.5, 3.5, 10.5);
                  lilIliilIl(g, 7.5, 12.5, 7.5, 6.5);
                  lilIliilIl(g, 11.5, 12.5, 11.5, 2.5);
               });
               break;
            case 4:
               IIllllIlll(var2, var3, g -> {
                  lliIliliIl(g, 2.5, 2.5, 11.0, 4.0, 1.25);
                  lliIliliIl(g, 2.5, 9.5, 11.0, 4.0, 1.25);
                  IIiIllIiIl(g, 5.5, 4.5, 1.5);
                  IIiIllIiIl(g, 5.5, 11.5, 1.5);
               });
               break;
            case 5:
               IIllllIlll(var2, var3, g -> {
                  lliIliliIl(g, 2.5, 4.5, 10.0, 6.0, 1.5);
                  IIiIllIiIl(g, 5.5, 6.5, 1.5);
                  IIiIllIiIl(g, 7.5, 6.5, 1.5);
                  IIiIllIiIl(g, 9.5, 6.5, 1.5);
                  lilIliilIl(g, 5.5, 8.5, 9.5, 8.5);
               });
               break;
            case 6:
               IIllllIlll(var2, var3, g -> {
                  lilIliilIl(g, 5.5, 2.5, 10.5, 2.5);
                  GeneralPath var1x = new GeneralPath();
                  var1x.moveTo(6.5, 2.5);
                  var1x.lineTo(6.5, 6.0);
                  var1x.lineTo(3.3, 11.0);
                  var1x.quadTo(2.4, 12.5, 4.2, 12.5);
                  var1x.lineTo(11.8, 12.5);
                  var1x.quadTo(13.6, 12.5, 12.7, 11.0);
                  var1x.lineTo(9.5, 6.0);
                  var1x.lineTo(9.5, 2.5);
                  g.draw(var1x);
                  lilIliilIl(g, 5.5, 9.5, 10.5, 9.5);
               });
               break;
            case 7:
               IIllllIlll(var2, var3, g -> {
                  GeneralPath var1x = new GeneralPath();
                  var1x.moveTo(7.5, 12.6);
                  var1x.curveTo(5.5, 10.9, 3.5, 8.9, 3.5, 6.5);
                  var1x.curveTo(3.5, 4.29, 5.29, 2.5, 7.5, 2.5);
                  var1x.curveTo(9.71, 2.5, 11.5, 4.29, 11.5, 6.5);
                  var1x.curveTo(11.5, 8.9, 9.5, 10.9, 7.5, 12.6);
                  var1x.closePath();
                  g.draw(var1x);
                  IIiIllIiIl(g, 7.5, 6.5, 2.5);
               });
               break;
            case 8:
               IIllllIlll(var2, var3, g -> {
                  GeneralPath var1x = new GeneralPath();
                  var1x.moveTo(7.5, 2.5);
                  var1x.lineTo(11.5, 4.0);
                  var1x.lineTo(11.5, 7.5);
                  var1x.curveTo(11.5, 10.2, 9.8, 11.8, 7.5, 12.6);
                  var1x.curveTo(5.2, 11.8, 3.5, 10.2, 3.5, 7.5);
                  var1x.lineTo(3.5, 4.0);
                  var1x.closePath();
                  g.draw(var1x);
               });
               break;
            case 9:
               IIllllIlll(var2, var3, g -> {
                  iIiIlIliIl(g, 7.5, 7.5, 5.0);
                  IIiIllIiIl(g, 7.5, 7.5, 3.0);
               });
               break;
            case 10:
               IIllllIlll(var2, var3, g -> {
                  iIiIlIliIl(g, 7.5, 4.5, 2.0);
                  GeneralPath var1x = new GeneralPath();
                  var1x.moveTo(3.5, 12.5);
                  var1x.lineTo(3.5, 12.0);
                  var1x.quadTo(3.5, 9.5, 6.0, 9.5);
                  var1x.lineTo(9.0, 9.5);
                  var1x.quadTo(11.5, 9.5, 11.5, 12.0);
                  var1x.lineTo(11.5, 12.5);
                  g.draw(var1x);
               });
               break;
            case 11:
               IIllllIlll(var2, var3, g -> {
                  GeneralPath var1x = new GeneralPath();
                  var1x.moveTo(7.5, 2.5);
                  var1x.lineTo(11.5, 4.75);
                  var1x.lineTo(11.5, 10.25);
                  var1x.lineTo(7.5, 12.5);
                  var1x.lineTo(3.5, 10.25);
                  var1x.lineTo(3.5, 4.75);
                  var1x.closePath();
                  g.draw(var1x);
                  GeneralPath var2x = new GeneralPath();
                  var2x.moveTo(3.5, 4.75);
                  var2x.lineTo(7.5, 7.0);
                  var2x.lineTo(11.5, 4.75);
                  g.draw(var2x);
                  lilIliilIl(g, 7.5, 7.0, 7.5, 12.5);
               });
               break;
            case 12:
               IIllllIlll(var2, var3, g -> {
                  GeneralPath var1x = new GeneralPath();
                  var1x.moveTo(3.5, 7.5);
                  var1x.lineTo(6.5, 10.5);
                  var1x.lineTo(12.5, 4.5);
                  g.draw(var1x);
               });
               break;
            case 13:
               IIllllIlll(var2, var3, g -> {
                  lilIliilIl(g, 4.5, 4.5, 11.5, 11.5);
                  lilIliilIl(g, 11.5, 4.5, 4.5, 11.5);
               });
               break;
            case 14:
               IIllllIlll(var2, var3, g -> {
                  GeneralPath var1x = new GeneralPath();
                  var1x.moveTo(6.0, 4.0);
                  var1x.lineTo(12.0, 8.0);
                  var1x.lineTo(6.0, 12.0);
                  var1x.closePath();
                  g.draw(var1x);
               });
               break;
            case 15:
               IIllllIlll(var2, var3, g -> {
                  IIiIllIiIl(g, 8.0, 8.0, 2.5);
                  g.draw(new java.awt.geom.Arc2D.Double(4.75, 4.75, 6.5, 6.5, -45.0, 90.0, 0));
                  g.draw(new java.awt.geom.Arc2D.Double(4.75, 4.75, 6.5, 6.5, 135.0, 90.0, 0));
                  g.draw(new java.awt.geom.Arc2D.Double(2.0, 2.0, 12.0, 12.0, -45.0, 90.0, 0));
                  g.draw(new java.awt.geom.Arc2D.Double(2.0, 2.0, 12.0, 12.0, 135.0, 90.0, 0));
               });
               break;
            case 16:
               IIllllIlll(var2, var3, g -> {
                  GeneralPath var1x = new GeneralPath();
                  var1x.moveTo(6.6, 3.0);
                  var1x.curveTo(5.2, 2.5, 3.6, 2.9, 2.9, 4.8);
                  var1x.curveTo(2.3, 7.4, 2.4, 10.6, 3.2, 13.2);
                  var1x.quadTo(4.6, 11.4, 6.3, 10.2);
                  var1x.curveTo(6.2, 8.2, 6.6, 5.6, 6.6, 3.0);
                  var1x.closePath();
                  g.draw(var1x);
                  g.draw(new AffineTransform(-1.0F, 0.0F, 0.0F, 1.0F, 16.0F, 0.0F).createTransformedShape(var1x));
               });
         }

         IiIllilIiliIllilIi.put(name, var2);
         return var2;
      }
   }

   private static void lliIliliIl(Graphics2D r, double g, double w, double h, double y, double x) {
      r.draw(new java.awt.geom.RoundRectangle2D.Double(g, w, h, y, x * 2.0, x * 2.0));
   }

   public static class_2960 IilliliilIIi() {
      if (!iiIiIilIiIIliIilIi) {
         iiIiIilIiIIliIilIi = llIIlilIIl(IIiIIilIilIiIIilIi, lIIlIliIIlIl<"lIIlIliIIlIl","E+5o3l3TwdEwraqM7oSMN0fTmcdj17IPQHWTXYUNUz4Ka6M+QZYqEZZb">(), g -> {
            GeneralPath var1 = new GeneralPath();
            var1.moveTo(10.24, 33.28);
            var1.lineTo(23.04, 33.28);
            var1.lineTo(29.44, 19.2);
            var1.lineTo(37.12, 46.08);
            var1.lineTo(42.24, 33.28);
            var1.lineTo(55.04, 33.28);
            g.draw(var1);
         });
      }

      return IIiIIilIilIiIIilIi;
   }

   static GeneralPath iiiIlIIIll(String d) {
      long var37 = 7928329325503216395L;
      long var39 = -6735808204313051834L;
      long var41 = -4391225527702804362L;
      long var43 = -4954371856564316370L;
      long var45 = -3795078066771316952L;
      GeneralPath var1 = new GeneralPath();
      int[] var2 = new int[]{0};
      var37 ^= ((long)d.length() << 32 ^ var37) & -1L << 32;
      double var4 = 0.0;
      double var6 = 0.0;
      double var8 = 0.0;
      double var10 = 0.0;
      double var12 = 0.0;
      double var14 = 0.0;
      var37 ^= (0L ^ var37) & -1L >>> 32;
      var39 ^= (0L ^ var39) & -1L << 32;

      while (true) {
         lIIlliIIll(d, var2);
         if (var2[0] >= (int)(var37 >>> 32)) {
            return var1;
         }

         var39 ^= ((long)d.charAt(var2[0]) ^ var39) & -1L >>> 32;
         if (Character.isLetter((char)((int)var39))) {
            var37 ^= ((long)((int)var39) ^ var37) & -1L >>> 32;
            var2[0]++;
         } else if ((int)var37 == 77) {
            var37 ^= (76L ^ var37) & -1L >>> 32;
         } else if ((int)var37 == 109) {
            var37 ^= (108L ^ var37) & -1L >>> 32;
         } else if ((int)var37 == 0 || (int)var37 == 90 || (int)var37 == 122) {
            throw new IllegalArgumentException(lIIlIliIIlIl<"lIIlIliIIlIl","ZgdzsJsC8JBTDxWp1CEEhImlFsURtDRNVQjz+nlNqxd7URppstGLlLYKXZ5HXR4ITg==">() + var2[0]);
         }

         var41 ^= ((long)Character.isLowerCase((char)((int)var37)) << 32 ^ var41) & -1L << 32;
         double var20 = (int)(var41 >>> 32) != 0 ? var4 : 0.0;
         double var22 = (int)(var41 >>> 32) != 0 ? var6 : 0.0;
         var41 ^= ((long)Character.toUpperCase((char)((int)var37)) ^ var41) & -1L >>> 32;
         switch ((int)var41) {
            case 65:
               double var48 = IlIllllIll(d, var2);
               double var51 = IlIllllIll(d, var2);
               double var53 = IlIllllIll(d, var2);
               var43 ^= ((long)ilIllIiIll(d, var2) ^ var43) & -1L >>> 32;
               var45 ^= ((long)ilIllIiIll(d, var2) << 32 ^ var45) & -1L << 32;
               double var33 = var20 + IlIllllIll(d, var2);
               double var35 = var22 + IlIllllIll(d, var2);
               liIlliiIll(var1, var4, var6, var48, var51, var53, (boolean)((int)var43), (boolean)((int)(var45 >>> 32)), var33, var35);
               var4 = var33;
               var6 = var35;
               break;
            case 66:
            case 68:
            case 69:
            case 70:
            case 71:
            case 73:
            case 74:
            case 75:
            case 78:
            case 79:
            case 80:
            case 82:
            case 85:
            case 87:
            case 88:
            case 89:
            default:
               throw new IllegalArgumentException(
                  lIIlIliIIlIl<"lIIlIliIIlIl","joRTp2I5MKFY7t/SmBDbXhhQo1+XeGaA/sqLHldF2NV9O7BzoDqDs1TxFMEJxts3qQ==">() + (int)var37
               );
            case 67:
               double var47 = var20 + IlIllllIll(d, var2);
               double var50 = var22 + IlIllllIll(d, var2);
               double var29 = var20 + IlIllllIll(d, var2);
               double var31 = var22 + IlIllllIll(d, var2);
               var4 = var20 + IlIllllIll(d, var2);
               var6 = var22 + IlIllllIll(d, var2);
               var1.curveTo(var47, var50, var29, var31, var4, var6);
               var12 = var29;
               var14 = var31;
               break;
            case 72:
               var4 = var20 + IlIllllIll(d, var2);
               var1.lineTo(var4, var6);
               break;
            case 76:
               var4 = var20 + IlIllllIll(d, var2);
               var6 = var22 + IlIllllIll(d, var2);
               var1.lineTo(var4, var6);
               break;
            case 77:
               var4 = var20 + IlIllllIll(d, var2);
               var6 = var22 + IlIllllIll(d, var2);
               var1.moveTo(var4, var6);
               var8 = var4;
               var10 = var6;
               break;
            case 81:
               double var25 = var20 + IlIllllIll(d, var2);
               double var27 = var22 + IlIllllIll(d, var2);
               var4 = var20 + IlIllllIll(d, var2);
               var6 = var22 + IlIllllIll(d, var2);
               var1.quadTo(var25, var27, var4, var6);
               var12 = var25;
               var14 = var27;
               break;
            case 83:
               var43 ^= ((long)((int)(var39 >>> 32) != 67 && (int)(var39 >>> 32) != 83 ? 0 : 1) << 32 ^ var43) & -1L << 32;
               double var49 = (int)(var43 >>> 32) != 0 ? 2.0 * var4 - var12 : var4;
               double var52 = (int)(var43 >>> 32) != 0 ? 2.0 * var6 - var14 : var6;
               double var30 = var20 + IlIllllIll(d, var2);
               double var32 = var22 + IlIllllIll(d, var2);
               var4 = var20 + IlIllllIll(d, var2);
               var6 = var22 + IlIllllIll(d, var2);
               var1.curveTo(var49, var52, var30, var32, var4, var6);
               var12 = var30;
               var14 = var32;
               break;
            case 84:
               var43 ^= ((long)((int)(var39 >>> 32) != 81 && (int)(var39 >>> 32) != 84 ? 0 : 1) << 32 ^ var43) & -1L << 32;
               double var26 = (int)(var43 >>> 32) != 0 ? 2.0 * var4 - var12 : var4;
               double var28 = (int)(var43 >>> 32) != 0 ? 2.0 * var6 - var14 : var6;
               var4 = var20 + IlIllllIll(d, var2);
               var6 = var22 + IlIllllIll(d, var2);
               var1.quadTo(var26, var28, var4, var6);
               var12 = var26;
               var14 = var28;
               break;
            case 86:
               var6 = var22 + IlIllllIll(d, var2);
               var1.lineTo(var4, var6);
               break;
            case 90:
               var1.closePath();
               var4 = var8;
               var6 = var10;
         }

         var39 ^= ((long)((int)var41) << 32 ^ var39) & -1L << 32;
      }
   }

   private lIlIIiliIlIIil() {
   }

   public static class_2960 IlIillIiilIi() {
      if (!liIIlilIiiiIIlilIi) {
         liIIlilIiiiIIlilIi = iiIIlIIlIl(
            iillIilIiIIilIilIi, lIIlIliIIlIl<"lIIlIliIIlIl","/dkRZXwQPTSUplFetS8mHt9xoDO1ErDWqSiLiN53dyjpuYhZ3iLKZeOWLw==">(), g -> {
               GeneralPath var1 = new GeneralPath();
               var1.moveTo(32.0, 10.24);
               var1.lineTo(51.2, 17.28);
               var1.curveTo(51.2, 38.4, 46.08, 48.64, 32.0, 55.04);
               var1.curveTo(17.92, 48.64, 12.8, 38.4, 12.8, 17.28);
               var1.closePath();
               g.draw(var1);
            }
         );
      }

      return iillIilIiIIilIilIi;
   }

   public static class_2960 IIlllIlliIll() {
      if (!iIiiIilIiIliiIilIi) {
         iIiiIilIiIliiIilIi = IiIIlliIIl(
            IlIlIilIillIlIilIi, lIIlIliIIlIl<"lIIlIliIIlIl","HWHyeRBWVJ080ph0bPpQ+4uy5LCG+MiBovBcHrr29x51vVS2TWBUjbOjkg==">(), g -> {
               double var1 = 12.8;
               double var3 = 38.4;
               double var5 = 9.92;
               double var7 = 3.52;
               g.fill(new java.awt.geom.RoundRectangle2D.Double(var1, 15.36, var3, var5, var7, var7));
               g.fill(new java.awt.geom.RoundRectangle2D.Double(var1, 27.04, var3, var5, var7, var7));
               g.fill(new java.awt.geom.RoundRectangle2D.Double(var1, 38.72, var3, var5, var7, var7));
            }
         );
      }

      return IlIlIilIillIlIilIi;
   }

   private static boolean Iiiiliiiiiii(class_2960 strokeW, String label, lilIIiIliilIIiIl paint, float id, int shrink) {
      long var17 = 667313372187238315L;
      long var19 = 3212948100664023947L;
      long var15 = -8396439406840519299L;

      try {
         BufferedImage var5 = new BufferedImage(64, 64, 2);
         Graphics2D var6 = var5.createGraphics();
         var6.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
         var6.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
         var6.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
         var6.setColor(Color.WHITE);
         if (id > 0.0F) {
            var6.setStroke(new BasicStroke(id, 1, 1));
         }

         paint.paint(var6);
         var6.dispose();
         var15 ^= ((long)(64 / shrink) << 32 ^ var15) & -1L << 32;
         int[] var8 = var5.getRGB(0, 0, 64, 64, null, 0, 64);
         class_1011 var9 = new class_1011((int)(var15 >>> 32), (int)(var15 >>> 32), false);

         for (long var23 = var15 ^ (0L ^ var15) & -1L >>> 32; (int)var23 < (int)(var23 >>> 32); var23 ^= (var23 ^ var23 + (long)1) & -1L >>> 32) {
            var17 ^= (0L ^ var17) & -1L << 32;

            while ((int)(var17 >>> 32) < (int)(var23 >>> 32)) {
               var17 ^= (0L ^ var17) & -1L >>> 32;
               var19 ^= (0L ^ var19) & -1L << 32;

               while ((int)(var19 >>> 32) < shrink) {
                  for (var19 ^= (0L ^ var19) & -1L >>> 32; (int)var19 < shrink; var19 ^= (var19 ^ var19 + (long)1) & -1L >>> 32) {
                     var17 ^= (
                           (long)(
                                 (int)var17
                                    + (var8[((int)var23 * shrink + (int)(var19 >>> 32)) * 64 + (int)(var17 >>> 32) * shrink + (int)var19] >>> 24 & 0xFF)
                              )
                              ^ var17
                        )
                        & -1L >>> 32;
                  }

                  var19 += 4294967296L;
               }

               var9.method_61941((int)(var17 >>> 32), (int)var23, (int)var17 / (shrink * shrink) << 24 | 16777215);
               var17 += 4294967296L;
            }
         }

         class_1043 var10 = new class_1043(() -> label, var9);
         class_310.method_1551().method_1531().method_4616(strokeW, var10);
         return true;
      } catch (Throwable var21) {
         return false;
      }
   }

   private static boolean ilIllIiIll(String pos, int[] d) {
      long var3 = 2207760019431513195L;
      lIIlliIIll(pos, d);
      var3 ^= ((long)(d[0] < pos.length() ? pos.charAt(d[0]) : 32) << 32 ^ var3) & -1L << 32;
      if ((int)(var3 >>> 32) != 48 && (int)(var3 >>> 32) != 49) {
         throw new IllegalArgumentException(lIIlIliIIlIl<"lIIlIliIIlIl","gDRa+JeVEaz7VvIDnh/v6ArX1IP3w0ha8V9g2r4+W6JakHLGwKQ1fzRDACDtBgzZsC2Ks7Ux">() + d[0]);
      } else {
         d[0]++;
         return (int)(var3 >>> 32) == 49;
      }
   }

   private static GeneralPath lllllillll(double R, double cy, double cx) {
      long var18 = 1433296764044665673L;
      double var6 = cx * 0.28;
      GeneralPath var8 = new GeneralPath();

      for (long var20 = var18 ^ (0L ^ var18) & -1L << 32; (int)(var20 >>> 32) < 8; var20 += 4294967296L) {
         double var10 = (-Math.PI / 2) + (double)((int)(var20 >>> 32)) * Math.PI / 4.0;
         double var12 = (int)(var20 >>> 32) % 2 == 0 ? cx : var6;
         double var14 = R + Math.cos(var10) * var12;
         double var16 = cy + Math.sin(var10) * var12;
         if ((int)(var20 >>> 32) == 0) {
            var8.moveTo(var14, var16);
         } else {
            var8.lineTo(var14, var16);
         }
      }

      var8.closePath();
      return var8;
   }

   public static class_2960 Iliilliiilii() {
      if (!IliIlilIilliIlilIi) {
         IliIlilIilliIlilIi = Iiiiliiiiiii(
            lIiIlilIiiIiIlilIi, lIIlIliIIlIl<"lIIlIliIIlIl","K7sJVsXer7QcWAxvvc9O8d9pQjnl/ehJb30P+PWXzImwcJvClVQym1+qqUWvGw==">(), g -> {
               g.draw(new java.awt.geom.Ellipse2D.Double(10.88, 10.88, 42.24, 42.24));
               g.draw(new java.awt.geom.Line2D.Double(32.0, 32.0, 32.0, 20.48));
               g.draw(new java.awt.geom.Line2D.Double(32.0, 32.0, 44.8, 32.0));
            }, 7.36F, 2
         );
      }

      return lIiIlilIiiIiIlilIi;
   }

   public static class_2960 IiIlliIliiIl() {
      if (!IIiiIilIilIiiIilIi) {
         IIiiIilIilIiiIilIi = IiIIlliIIl(lIIlIilIiiIIlIilIi, lIIlIliIIlIl<"lIIlIliIIlIl","piG0b0L5mlKZVdzL5UKw339vIKeIjZM+eJRS6Ut52ybDDqqWL+IG3Lu3">(), g -> {
            Area var1 = new Area();
            var1.add(new Area(new java.awt.geom.Ellipse2D.Double(8.96, 26.88, 21.76, 21.76)));
            var1.add(new Area(new java.awt.geom.Ellipse2D.Double(21.12, 17.92, 25.6, 25.6)));
            var1.add(new Area(new java.awt.geom.Ellipse2D.Double(33.28, 26.88, 21.76, 21.76)));
            var1.add(new Area(new java.awt.geom.RoundRectangle2D.Double(11.52, 35.84, 40.96, 12.8, 12.8, 12.8)));
            g.fill(var1);
         });
      }

      return lIIlIilIiiIIlIilIi;
   }

   public static class_2960 IIIilIIiiIIi() {
      if (!ilIIlilIiIiIIlilIi) {
         ilIIlilIiIiIIlilIi = iiIIlIIlIl(IillIilIilillIilIi, lIIlIliIIlIl<"lIIlIliIIlIl","DjF7Lxzn2Zhg++ojAqDYSshBjFnqM9zOyaxb40teUQfM+sHrml1dP4yo">(), g -> {
            double var1 = 32.0;
            double var3 = 32.0;
            double var5 = 16.0;
            g.draw(new java.awt.geom.Arc2D.Double(var1 - var5, var3 - var5, var5 * 2.0, var5 * 2.0, 75.0, 285.0, 0));
            double var7 = Math.toRadians(75.0);
            double var9 = var1 + var5 * Math.cos(var7);
            double var11 = var3 - var5 * Math.sin(var7);
            g.draw(new java.awt.geom.Line2D.Double(var9, var11, var9 - 7.68, var11 + 1.92));
            g.draw(new java.awt.geom.Line2D.Double(var9, var11, var9 + 1.28, var11 + 8.32));
         });
      }

      return IillIilIilillIilIi;
   }

   private static void iIiIlIliIl(Graphics2D g, double r, double cx, double cy) {
      g.draw(new java.awt.geom.Ellipse2D.Double(r - cy, cx - cy, cy * 2.0, cy * 2.0));
   }

   public static class_2960 Iilllilliill() {
      if (!IiiiIilIiliiiIilIi) {
         IiiiIilIiliiiIilIi = IiIIlliIIl(liIlIilIiiiIlIilIi, lIIlIliIIlIl<"lIIlIliIIlIl","kkOU7bJoQ8Upb461Y1gQHI1Qhr8AxEH2bg/NBUIa8gzXSYHuYbVxuj1d">(), g -> {
            GeneralPath var1 = new GeneralPath();
            var1.moveTo(16.64, 17.92);
            var1.lineTo(38.4, 32.0);
            var1.lineTo(16.64, 46.08);
            var1.closePath();
            g.fill(var1);
            g.fill(new java.awt.geom.RoundRectangle2D.Double(43.2, 19.2, 5.44, 25.6, 3.2, 3.2));
         });
      }

      return liIlIilIiiiIlIilIi;
   }

   private static void liIlliiIll(GeneralPath sweep, double y, double y0, double p, double x, double ry, boolean rotDeg, boolean large, double x0, double rx) {
      long var83 = 2798862047836202280L;
      if (y != x0 || y0 != rx) {
         p = Math.abs(p);
         x = Math.abs(x);
         if (p != 0.0 && x != 0.0) {
            double var17 = Math.toRadians(ry);
            double var19 = Math.cos(var17);
            double var21 = Math.sin(var17);
            double var23 = (y - x0) / 2.0;
            double var25 = (y0 - rx) / 2.0;
            double var27 = var19 * var23 + var21 * var25;
            double var29 = -var21 * var23 + var19 * var25;
            double var31 = var27 * var27 / (p * p) + var29 * var29 / (x * x);
            if (var31 > 1.0) {
               double var33 = Math.sqrt(var31);
               p *= var33;
               x *= var33;
            }

            double var87 = p * p;
            double var35 = x * x;
            double var37 = var87 * var29 * var29 + var35 * var27 * var27;
            double var39 = (double)(rotDeg == large ? -1 : 1) * Math.sqrt(Math.max(0.0, (var87 * var35 - var37) / var37));
            double var41 = var39 * p * var29 / x;
            double var43 = -var39 * x * var27 / p;
            double var45 = var19 * var41 - var21 * var43 + (y + x0) / 2.0;
            double var47 = var21 * var41 + var19 * var43 + (y0 + rx) / 2.0;
            double var49 = (var27 - var41) / p;
            double var51 = (var29 - var43) / x;
            double var53 = (-var27 - var41) / p;
            double var55 = (-var29 - var43) / x;
            double var57 = Math.atan2(var51, var49);
            double var59 = Math.atan2(var49 * var55 - var51 * var53, var49 * var53 + var51 * var55);
            if (!large && var59 > 0.0) {
               var59 -= Math.PI * 2;
            } else if (large && var59 < 0.0) {
               var59 += Math.PI * 2;
            }

            var83 ^= ((long)Math.max(1, (int)Math.ceil(Math.abs(var59) / (Math.PI / 2) - 1.0E-9)) << 32 ^ var83) & -1L << 32;
            double var62 = var59 / (double)((int)(var83 >>> 32));
            double var64 = 1.3333333333333333 * Math.tan(var62 / 4.0);

            for (long var89 = var83 ^ (0L ^ var83) & -1L >>> 32; (int)var89 < (int)(var89 >>> 32); var89 ^= (var89 ^ var89 + (long)1) & -1L >>> 32) {
               double var67 = Math.cos(var57);
               double var69 = Math.sin(var57);
               double var71 = Math.cos(var57 + var62);
               double var73 = Math.sin(var57 + var62);
               double var75 = var67 - var64 * var69;
               double var77 = var69 + var64 * var67;
               double var79 = var71 + var64 * var73;
               double var81 = var73 - var64 * var71;
               sweep.curveTo(
                  var45 + p * var75 * var19 - x * var77 * var21,
                  var47 + p * var75 * var21 + x * var77 * var19,
                  var45 + p * var79 * var19 - x * var81 * var21,
                  var47 + p * var79 * var21 + x * var81 * var19,
                  var45 + p * var71 * var19 - x * var73 * var21,
                  var47 + p * var71 * var21 + x * var73 * var19
               );
               var57 += var62;
            }
         } else {
            sweep.lineTo(x0, rx);
         }
      }
   }

   public static class_2960 IIiilIiiiIii() {
      if (!IilIlilIililIlilIi) {
         IilIlilIililIlilIi = llIIlilIIl(liilIilIiiiilIilIi, lIIlIliIIlIl<"lIIlIliIIlIl","6vK7fAytd9NH1lonrOIpsNxv97SmRNJ0rRnFpopUC5anrY6vaTpqHfv5">(), g -> {
            g.draw(new java.awt.geom.Ellipse2D.Double(10.88, 10.88, 42.24, 42.24));
            g.draw(new java.awt.geom.Line2D.Double(32.0, 32.0, 32.0, 20.48));
            g.draw(new java.awt.geom.Line2D.Double(32.0, 32.0, 44.8, 32.0));
         });
      }

      return liilIilIiiiilIilIi;
   }

   public static class_2960 lIiiIiIlilli() {
      if (!lIliIilIiiIliIilIi) {
         lIliIilIiiIliIilIi = llIIlilIIl(
            iIiIIilIiIliIIilIi, lIIlIliIIlIl<"lIIlIliIIlIl","YHaptoSKbMUSwp2pTvCSxtGdUAG1tJBcPDzCBvbXO82QlHlnc3jcWlsczA==">(), g -> {
               double var1 = 46.08;
               g.draw(new java.awt.geom.Line2D.Double(17.92, var1, 17.92, 38.4));
               g.draw(new java.awt.geom.Line2D.Double(32.0, var1, 32.0, 28.16));
               g.draw(new java.awt.geom.Line2D.Double(46.08, var1, 46.08, 17.92));
            }
         );
      }

      return iIiIIilIiIliIIilIi;
   }

   public static class_2960 IIIllIIliIIl() {
      if (!illiIilIiIiliIilIi) {
         illiIilIiIiliIilIi = IiIIlliIIl(IiiIIilIiliiIIilIi, lIIlIliIIlIl<"lIIlIliIIlIl","FO+5ZbGOREvuPqWlQjcPXNHbvspKQjccDdAEWN2IgjcOeVTaEDTm8A==">(), g -> {
            GeneralPath var1 = new GeneralPath();
            var1.moveTo(32.0, 52.48);
            var1.curveTo(32.0, 52.48, 15.36, 33.28, 15.36, 24.32);
            var1.curveTo(15.36, 12.16, 48.64, 12.16, 48.64, 24.32);
            var1.curveTo(48.64, 33.28, 32.0, 52.48, 32.0, 52.48);
            var1.closePath();
            g.fill(var1);
         });
      }

      return IiiIIilIiliiIIilIi;
   }

   public static class_2960 iliIiiliiiii() {
      if (!IlliIilIillliIilIi) {
         IlliIilIillliIilIi = llIIlilIIl(lliIIilIiiliIIilIi, lIIlIliIIlIl<"lIIlIliIIlIl","w/ahZtgk4wBurq4ok0XUPf6Hppkpvm20wGy1pxPOYyps1nI82ZexuIHq">(), g -> {
            GeneralPath var1 = new GeneralPath();
            var1.moveTo(21.76, 17.92);
            var1.lineTo(33.28, 32.0);
            var1.lineTo(21.76, 46.08);
            GeneralPath var2 = new GeneralPath();
            var2.moveTo(34.56, 17.92);
            var2.lineTo(46.08, 32.0);
            var2.lineTo(34.56, 46.08);
            g.draw(var1);
            g.draw(var2);
         });
      }

      return lliIIilIiiliIIilIi;
   }

   public static class_2960 IliIlllilIi() {
      if (!iIIiIilIiIlIiIilIi) {
         iIIiIilIiIlIiIilIi = llIIlilIIl(
            IllIIilIilllIIilIi, lIIlIliIIlIl<"lIIlIliIIlIl","GiZkElFQzp167up0b12xyZeFXcZLhdMDWTpaeC52XY5Lm1Lg5u6mdbZXSuo=">(), g -> {
               GeneralPath var1 = new GeneralPath();
               var1.moveTo(23.04, 14.08);
               var1.lineTo(42.24, 32.0);
               var1.lineTo(23.04, 49.92);
               g.draw(var1);
            }
         );
      }

      return IllIIilIilllIIilIi;
   }

   private static GeneralPath iIIIlIlIIl(double R, double r, double cy, double cx) {
      long var18 = 8757653999955863309L;
      GeneralPath var8 = new GeneralPath();

      for (long var20 = var18 ^ (0L ^ var18) & -1L << 32; (int)(var20 >>> 32) < 10; var20 += 4294967296L) {
         double var10 = (-Math.PI / 2) + (double)((int)(var20 >>> 32)) * Math.PI / 5.0;
         double var12 = (int)(var20 >>> 32) % 2 == 0 ? cy : cx;
         double var14 = R + Math.cos(var10) * var12;
         double var16 = r + Math.sin(var10) * var12;
         if ((int)(var20 >>> 32) == 0) {
            var8.moveTo(var14, var16);
         } else {
            var8.lineTo(var14, var16);
         }
      }

      var8.closePath();
      return var8;
   }

   public static class_2960 liiiIIllIl() {
      if (!llIiIilIiilIiIilIi) {
         llIiIilIiilIiIilIi = llIIlilIIl(illIIilIiIilIIilIi, lIIlIliIIlIl<"lIIlIliIIlIl","YUWYASK/T+MsNKMKPbtf0240uXvdHsT5Rl8gY6SUqanGQV/nfnu99JEH">(), g -> {
            GeneralPath var1 = new GeneralPath();
            var1.moveTo(15.36, 32.64);
            var1.lineTo(26.88, 44.8);
            var1.lineTo(48.64, 19.2);
            g.draw(var1);
         });
      }

      return illIIilIiIilIIilIi;
   }

   public static class_2960 Ililllililil() {
      if (!lIIIlilIiiIIIlilIi) {
         lIIIlilIiiIIIlilIi = IiIIlliIIl(
            iIllIilIiIlllIilIi, lIIlIliIIlIl<"lIIlIliIIlIl","S3MQtfRPN3r6mEA8eEFNLiSkYDfpvj3XQis0xyllKusnN6blgmoZwk+t9w==">(), g -> {
               double var1 = 9.6;
               double var3 = 17.92;
               double var5 = 28.16;
               double var7 = 3.2;
               g.fill(new java.awt.geom.RoundRectangle2D.Double(21.12, var3, var1, var5, var7, var7));
               g.fill(new java.awt.geom.RoundRectangle2D.Double(33.28, var3, var1, var5, var7, var7));
            }
         );
      }

      return iIllIilIiIlllIilIi;
   }

   public static class_2960 Illillliilli() {
      if (!lllIlilIiillIlilIi) {
         lllIlilIiillIlilIi = IiIIlliIIl(
            ililIilIiIiilIilIi,
            lIIlIliIIlIl<"lIIlIliIIlIl","aaW0vnXOYDa5Cn/8J1msyKwd6sEtF06USKpbSgWYqKlDJpInAKucIyI=">(),
            g -> g.fill(iIIIlIlIIl(32.0, 33.28, 26.88, 11.2))
         );
      }

      return ililIilIiIiilIilIi;
   }

   private static void lilIliilIl(Graphics2D y1, double y2, double g, double x2, double x1) {
      y1.draw(new java.awt.geom.Line2D.Double(y2, g, x2, x1));
   }

   public static class_2960 iIlIlllllill() {
      if (!IiIiIilIiliIiIilIi) {
         IiIiIilIiliIiIilIi = llIIlilIIl(lilIIilIiiilIIilIi, lIIlIliIIlIl<"lIIlIliIIlIl","EfvqePDu7deKE+L+iwU7BR8T7dVOoU4vD7A9zc2YjhOZQDpbtaOL21Ej">(), g -> {
            GeneralPath var1 = new GeneralPath();
            var1.moveTo(17.28, 17.28);
            var1.lineTo(46.72, 46.72);
            GeneralPath var2 = new GeneralPath();
            var2.moveTo(46.72, 17.28);
            var2.lineTo(17.28, 46.72);
            g.draw(var1);
            g.draw(var2);
         });
      }

      return lilIIilIiiilIIilIi;
   }

   public static class_2960 Iilililiiili() {
      if (!iilIlilIiIIiIlilIi) {
         iilIlilIiIIiIlilIi = IiIIlliIIl(IIIiIilIilIIiIilIi, lIIlIliIIlIl<"lIIlIliIIlIl","bt+tiwaQDL+TYNbmXs2bl8dD9nPUaPBroFbbGN2VX67E98DDnfQu7o8b">(), g -> {
            double var1 = 11.84;
            g.fill(new java.awt.geom.Ellipse2D.Double(21.44 - var1, 24.0 - var1, var1 * 2.0, var1 * 2.0));
            g.fill(new java.awt.geom.Ellipse2D.Double(42.56 - var1, 24.0 - var1, var1 * 2.0, var1 * 2.0));
            GeneralPath var3 = new GeneralPath();
            var3.moveTo(10.24, 28.16);
            var3.lineTo(53.76, 28.16);
            var3.lineTo(32.0, 53.76);
            var3.closePath();
            g.fill(var3);
         });
      }

      return IIIiIilIilIIiIilIi;
   }

   public static class_2960 IIillIiliIil() {
      if (!iiiiIilIiIIIIlilIi) {
         iiiiIilIiIIIIlilIi = IiIIlliIIl(IIllIilIilIllIilIi, lIIlIliIIlIl<"lIIlIliIIlIl","vMUFn963HIW4uNVf3R2Q8l6myezHbkDRCnLm0DljhkorTo7AZaLyP8Qm">(), g -> {
            GeneralPath var1 = new GeneralPath();
            var1.moveTo(21.76, 16.64);
            var1.lineTo(47.36, 32.0);
            var1.lineTo(21.76, 47.36);
            var1.closePath();
            g.fill(var1);
         });
      }

      return IIllIilIilIllIilIi;
   }

   private static void IIiIllIiIl(Graphics2D cx, double g, double cy, double d) {
      cx.fill(new java.awt.geom.Ellipse2D.Double(g - d / 2.0, cy - d / 2.0, d, d));
   }

   public static class_2960 IIIIllIIIl(String name) {
      long var9 = -2237114255714242336L;
      class_2960 var1 = iliIlilIiIiiIlilIi.get(name);
      if (var1 != null) {
         return var1;
      } else {
         class_2960 var2 = class_2960.method_60655(
            lIIlIliIIlIl<"lIIlIliIIlIl","GSM0+q1S8y/SuOzmF2+o320flgAOBYvD4B4OtnPWrvoWb9WBnpI=">(),
            lIIlIliIIlIl<"lIIlIliIIlIl","wAKVTUnWIj1Ki2h9PYph3AKOfIlBie16uV3tt0NaQlmYH8M=">() + name
         );
         String var3 = lIIlIliIIlIl<"lIIlIliIIlIl","9CZqOqavmfKE+P+CaHiPFCr9+DFdS0P3ReaKqAbIG5XGL8Hr0UcmMg==">() + name;
         double var4 = 64.0;
         var9 ^= (-4294967296L ^ var9) & -1L << 32;
         switch (name.hashCode()) {
            case -1268966290:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","86KdK/d4xlPWyO2R67f2BJbzNJ9JrccM0RhAZ5kSHlja+g==">())) {
                  var9 ^= (38654705664L ^ var9) & -1L << 32;
               }
               break;
            case -991851251:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","qE0TVi1NUCQb0q78n30mERaEXCMoGazKRghgz0itXEsX1g==">())) {
                  var9 ^= (8589934592L ^ var9) & -1L << 32;
               }
               break;
            case -906336856:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","YFqUMwvGMCUehb8wAV7HAJ1TcH7J+/TQsrzJaYEvDOuKOQ==">())) {
                  var9 ^= (55834574848L ^ var9) & -1L << 32;
               }
               break;
            case -873960692:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","q3dJI8qoyV1E9HotVlqXN/i8NRNvYrUXcnD0BPZ4WZg5Rw==">())) {
                  var9 ^= (51539607552L ^ var9) & -1L << 32;
               }
               break;
            case -838595071:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","ry9TLUisEEcbr54VnNzj5FQQxiP/EjDMgunNXl3EMO8HWQ==">())) {
                  var9 ^= (17179869184L ^ var9) & -1L << 32;
               }
               break;
            case -827512079:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","Iu2NKbEYPOQCxmyLP6JHTstn2mlg14AQ4Gm1WBGczxA4nfml76o=">())) {
                  var9 ^= (42949672960L ^ var9) & -1L << 32;
               }
               break;
            case 106079:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","zk6druzvRwkiTU+o5mJlRSxmlVxmyyYF5VyBDa4MaA==">())) {
                  var9 ^= (25769803776L ^ var9) & -1L << 32;
               }
               break;
            case 3089482:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","Vh6U02umBQMatwDSTbzvxCHTQ+p/yRsn6z/wvN3pMRo=">())) {
                  var9 ^= (64424509440L ^ var9) & -1L << 32;
               }
               break;
            case 3444122:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","JOW1NZLE1giEQnS7FBj7mVw5ph9xU3VRMpUcW5kH73A=">())) {
                  var9 ^= (0L ^ var9) & -1L << 32;
               }
               break;
            case 3522941:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","++FECtBU3R5JdymOQ1jZtXJqXPX9GM79OyXqPc5/A3M=">())) {
                  var9 ^= (47244640256L ^ var9) & -1L << 32;
               }
               break;
            case 3599307:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","mHMGjCRhw0l3EWnTzhiyc6xEJdiQkLYqpKu5lyCl3BM=">())) {
                  var9 ^= (30064771072L ^ var9) & -1L << 32;
               }
               break;
            case 94756344:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","UyqqQtpXI1FUlrO28qOS/0NGfGQfZ7+E/i9PovCplCUL">())) {
                  var9 ^= (60129542144L ^ var9) & -1L << 32;
               }
               break;
            case 98449901:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","oPosTPUp20c4bR+am0AX0Mmqc4OBqqBJD4yAdDkmCAv3">())) {
                  var9 ^= (34359738368L ^ var9) & -1L << 32;
               }
               break;
            case 109400031:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","B12VYfOqyqamnhPLwuOOKrn4RAMVH2F4Cmbzt0CLkPtx">())) {
                  var9 ^= (21474836480L ^ var9) & -1L << 32;
               }
               break;
            case 110621496:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","SKQBEl8T7FkGcwVPyaedBAqRjUA48HfbC7bZK1lSjthj">())) {
                  var9 ^= (4294967296L ^ var9) & -1L << 32;
               }
               break;
            case 1427818632:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","rhS54hlSFDHgWtpM35wXulBhqLw6qIhcr+Dp2U9moggBt2Kd">())) {
                  var9 ^= (12884901888L ^ var9) & -1L << 32;
               }
         }
         var9 ^= ((long)(switch ((int)(var9 >>> 32)) {
            case 0 -> iiIIlIIlIl(var2, var3, r -> {
            r.draw(new java.awt.geom.Line2D.Double(var4 * 0.5, var4 * 0.22, var4 * 0.5, var4 * 0.78));
            r.draw(new java.awt.geom.Line2D.Double(var4 * 0.22, var4 * 0.5, var4 * 0.78, var4 * 0.5));
         });
            case 1 -> iiIIlIIlIl(var2, var3, g -> {
            g.draw(new java.awt.geom.Line2D.Double(var4 * 0.2, var4 * 0.28, var4 * 0.8, var4 * 0.28));
            GeneralPath var3x = new GeneralPath();
            var3x.moveTo(var4 * 0.4, var4 * 0.28);
            var3x.lineTo(var4 * 0.4, var4 * 0.18);
            var3x.lineTo(var4 * 0.6, var4 * 0.18);
            var3x.lineTo(var4 * 0.6, var4 * 0.28);
            g.draw(var3x);
            GeneralPath var4x = new GeneralPath();
            var4x.moveTo(var4 * 0.27, var4 * 0.28);
            var4x.lineTo(var4 * 0.31, var4 * 0.82);
            var4x.lineTo(var4 * 0.69, var4 * 0.82);
            var4x.lineTo(var4 * 0.73, var4 * 0.28);
            g.draw(var4x);
            g.draw(new java.awt.geom.Line2D.Double(var4 * 0.43, var4 * 0.42, var4 * 0.43, var4 * 0.68));
            g.draw(new java.awt.geom.Line2D.Double(var4 * 0.57, var4 * 0.42, var4 * 0.57, var4 * 0.68));
         });
            case 2 -> iiIIlIIlIl(var2, var3, g -> {
            GeneralPath var3x = new GeneralPath();
            var3x.moveTo(var4 * 0.22, var4 * 0.78);
            var3x.lineTo(var4 * 0.26, var4 * 0.62);
            var3x.lineTo(var4 * 0.62, var4 * 0.26);
            var3x.lineTo(var4 * 0.74, var4 * 0.38);
            var3x.lineTo(var4 * 0.38, var4 * 0.74);
            var3x.closePath();
            g.draw(var3x);
            g.draw(new java.awt.geom.Line2D.Double(var4 * 0.53, var4 * 0.35, var4 * 0.65, var4 * 0.47));
         });
            case 3 -> iiIIlIIlIl(var2, var3, r -> {
            r.draw(new java.awt.geom.Line2D.Double(var4 * 0.5, var4 * 0.18, var4 * 0.5, var4 * 0.6));
            GeneralPath var3x = new GeneralPath();
            var3x.moveTo(var4 * 0.32, var4 * 0.44);
            var3x.lineTo(var4 * 0.5, var4 * 0.62);
            var3x.lineTo(var4 * 0.68, var4 * 0.44);
            r.draw(var3x);
            GeneralPath var4x = new GeneralPath();
            var4x.moveTo(var4 * 0.2, var4 * 0.66);
            var4x.lineTo(var4 * 0.2, var4 * 0.8);
            var4x.lineTo(var4 * 0.8, var4 * 0.8);
            var4x.lineTo(var4 * 0.8, var4 * 0.66);
            r.draw(var4x);
         });
            case 4 -> iiIIlIIlIl(var2, var3, r -> {
            r.draw(new java.awt.geom.Line2D.Double(var4 * 0.5, var4 * 0.62, var4 * 0.5, var4 * 0.2));
            GeneralPath var3x = new GeneralPath();
            var3x.moveTo(var4 * 0.32, var4 * 0.38);
            var3x.lineTo(var4 * 0.5, var4 * 0.2);
            var3x.lineTo(var4 * 0.68, var4 * 0.38);
            r.draw(var3x);
            GeneralPath var4x = new GeneralPath();
            var4x.moveTo(var4 * 0.2, var4 * 0.66);
            var4x.lineTo(var4 * 0.2, var4 * 0.8);
            var4x.lineTo(var4 * 0.8, var4 * 0.8);
            var4x.lineTo(var4 * 0.8, var4 * 0.66);
            r.draw(var4x);
         });
            case 5 -> iiIIlIIlIl(var2, var3, r -> {
            double var3x = var4 * 0.16;
            r.draw(new java.awt.geom.Ellipse2D.Double(var4 * 0.72 - var3x / 2.0, var4 * 0.24 - var3x / 2.0, var3x, var3x));
            r.draw(new java.awt.geom.Ellipse2D.Double(var4 * 0.28 - var3x / 2.0, var4 * 0.5 - var3x / 2.0, var3x, var3x));
            r.draw(new java.awt.geom.Ellipse2D.Double(var4 * 0.72 - var3x / 2.0, var4 * 0.76 - var3x / 2.0, var3x, var3x));
            r.draw(new java.awt.geom.Line2D.Double(var4 * 0.36, var4 * 0.45, var4 * 0.64, var4 * 0.29));
            r.draw(new java.awt.geom.Line2D.Double(var4 * 0.36, var4 * 0.55, var4 * 0.64, var4 * 0.71));
         });
            case 6 -> iiIIlIIlIl(var2, var3, r -> {
            r.draw(new java.awt.geom.Ellipse2D.Double(var4 * 0.2, var4 * 0.36, var4 * 0.28, var4 * 0.28));
            r.draw(new java.awt.geom.Line2D.Double(var4 * 0.48, var4 * 0.5, var4 * 0.82, var4 * 0.5));
            r.draw(new java.awt.geom.Line2D.Double(var4 * 0.68, var4 * 0.5, var4 * 0.68, var4 * 0.62));
            r.draw(new java.awt.geom.Line2D.Double(var4 * 0.8, var4 * 0.5, var4 * 0.8, var4 * 0.6));
         });
            case 7 -> iiIIlIIlIl(var2, var3, r -> {
            r.draw(new java.awt.geom.Ellipse2D.Double(var4 * 0.36, var4 * 0.18, var4 * 0.28, var4 * 0.28));
            r.draw(new java.awt.geom.Arc2D.Double(var4 * 0.22, var4 * 0.6, var4 * 0.56, var4 * 0.46, 0.0, 180.0, 0));
         });
            case 8 -> iiIIlIIlIl(var2, var3, g -> {
            g.draw(new java.awt.geom.Ellipse2D.Double(var4 * 0.2, var4 * 0.2, var4 * 0.6, var4 * 0.6));
            g.draw(new java.awt.geom.Ellipse2D.Double(var4 * 0.37, var4 * 0.2, var4 * 0.26, var4 * 0.6));
            g.draw(new java.awt.geom.Line2D.Double(var4 * 0.2, var4 * 0.5, var4 * 0.8, var4 * 0.5));
         });
            case 9 -> iiIIlIIlIl(var2, var3, g -> {
            GeneralPath var3x = new GeneralPath();
            var3x.moveTo(var4 * 0.18, var4 * 0.3);
            var3x.lineTo(var4 * 0.42, var4 * 0.3);
            var3x.lineTo(var4 * 0.5, var4 * 0.38);
            var3x.lineTo(var4 * 0.82, var4 * 0.38);
            var3x.lineTo(var4 * 0.82, var4 * 0.76);
            var3x.lineTo(var4 * 0.18, var4 * 0.76);
            var3x.closePath();
            g.draw(var3x);
         });
            case 10 -> IiIIlliIIl(var2, var3, r -> {
            Area var3x = new Area(new java.awt.geom.RoundRectangle2D.Double(var4 * 0.14, var4 * 0.2, var4 * 0.36, var4 * 0.3, var4 * 0.12, var4 * 0.12));
            var3x.add(new Area(new java.awt.geom.RoundRectangle2D.Double(var4 * 0.14, var4 * 0.32, var4 * 0.72, var4 * 0.48, var4 * 0.14, var4 * 0.14)));
            r.fill(var3x);
         });
            case 11 -> iiIIlIIlIl(var2, var3, r -> {
            GeneralPath var3x = new GeneralPath();
            var3x.moveTo(var4 * 0.2, var4 * 0.2);
            var3x.lineTo(var4 * 0.68, var4 * 0.2);
            var3x.lineTo(var4 * 0.8, var4 * 0.32);
            var3x.lineTo(var4 * 0.8, var4 * 0.8);
            var3x.lineTo(var4 * 0.2, var4 * 0.8);
            var3x.closePath();
            r.draw(var3x);
            r.draw(new java.awt.geom.Rectangle2D.Double(var4 * 0.34, var4 * 0.54, var4 * 0.32, var4 * 0.26));
            r.draw(new java.awt.geom.Line2D.Double(var4 * 0.34, var4 * 0.2, var4 * 0.34, var4 * 0.36));
            r.draw(new java.awt.geom.Line2D.Double(var4 * 0.34, var4 * 0.36, var4 * 0.6, var4 * 0.36));
            r.draw(new java.awt.geom.Line2D.Double(var4 * 0.6, var4 * 0.36, var4 * 0.6, var4 * 0.2));
         });
            case 12 -> iiIIlIIlIl(var2, var3, r -> {
            r.draw(new java.awt.geom.RoundRectangle2D.Double(var4 * 0.16, var4 * 0.3, var4 * 0.68, var4 * 0.4, var4 * 0.1, var4 * 0.1));
            r.draw(new java.awt.geom.Line2D.Double(var4 * 0.6, var4 * 0.36, var4 * 0.6, var4 * 0.44));
            r.draw(new java.awt.geom.Line2D.Double(var4 * 0.6, var4 * 0.56, var4 * 0.6, var4 * 0.64));
         });
            case 13 -> iiIIlIIlIl(var2, var3, r -> {
            r.draw(new java.awt.geom.Ellipse2D.Double(var4 * 0.2, var4 * 0.2, var4 * 0.42, var4 * 0.42));
            r.draw(new java.awt.geom.Line2D.Double(var4 * 0.57, var4 * 0.57, var4 * 0.8, var4 * 0.8));
         });
            case 14 -> iiIIlIIlIl(var2, var3, g -> {
            g.draw(new java.awt.geom.Line2D.Double(var4 * 0.28, var4 * 0.28, var4 * 0.72, var4 * 0.72));
            g.draw(new java.awt.geom.Line2D.Double(var4 * 0.72, var4 * 0.28, var4 * 0.28, var4 * 0.72));
         });
            case 15 -> IiIIlliIIl(var2, var3, g -> {
            double var3x = var4 * 0.13;
            g.fill(new java.awt.geom.Ellipse2D.Double(var4 * 0.24 - var3x / 2.0, var4 * 0.5 - var3x / 2.0, var3x, var3x));
            g.fill(new java.awt.geom.Ellipse2D.Double(var4 * 0.5 - var3x / 2.0, var4 * 0.5 - var3x / 2.0, var3x, var3x));
            g.fill(new java.awt.geom.Ellipse2D.Double(var4 * 0.76 - var3x / 2.0, var4 * 0.5 - var3x / 2.0, var3x, var3x));
         });
            default -> 0;
         }) ^ var9) & -1L >>> 32;
         if ((int)var9 == 0) {
            return iIlIlllllill();
         } else {
            iliIlilIiIiiIlilIi.put(name, var2);
            return var2;
         }
      }
   }

   public static class_2960 IiIiliIiiiIi() {
      if (!IIlIlilIilIlIlilIi) {
         IIlIlilIilIlIlilIi = iiIIlIIlIl(lIilIilIiiIilIilIi, lIIlIliIIlIl<"lIIlIliIIlIl","Nr3RvH2D7btJH0CVcwsoeXgoEjU+WO9hctLmr4O8pTAdrSRiiUbzCSk=">(), g -> {
            double var1 = 32.0;
            double var5 = 10.88;
            double var7 = 52.48;
            double var9 = 21.44;
            double var11 = 11.52;
            double var13 = 42.56;
            double var15 = 53.12;
            GeneralPath var17 = new GeneralPath();
            var17.moveTo(var1, var5);
            var17.lineTo(var7, var9);
            var17.lineTo(var7, var13);
            var17.lineTo(var1, var15);
            var17.lineTo(var11, var13);
            var17.lineTo(var11, var9);
            var17.closePath();
            g.draw(var17);
            double var20 = 32.0;
            g.draw(new java.awt.geom.Line2D.Double(var1, var5, var1, var20));
            g.draw(new java.awt.geom.Line2D.Double(var11, var13, var1, var20));
            g.draw(new java.awt.geom.Line2D.Double(var7, var13, var1, var20));
         });
      }

      return lIilIilIiiIilIilIi;
   }

   public static class_2960 Illlllllilll() {
      if (!lliiIilIiiliiIilIi) {
         lliiIilIiiliiIilIi = IiIIlliIIl(ilIlIilIiIiIlIilIi, lIIlIliIIlIl<"lIIlIliIIlIl","S+TV0VxmHrPZ8pnMQjXxXiR54YKhsCJGqFCty90Z3BgilKD0JNuBKmyR">(), g -> {
            g.fill(new java.awt.geom.RoundRectangle2D.Double(15.36, 19.2, 5.44, 25.6, 3.2, 3.2));
            GeneralPath var1 = new GeneralPath();
            var1.moveTo(47.36, 17.92);
            var1.lineTo(25.6, 32.0);
            var1.lineTo(47.36, 46.08);
            var1.closePath();
            g.fill(var1);
         });
      }

      return ilIlIilIiIiIlIilIi;
   }

   public static class_2960 IllIllllIl(String name) {
      long var6 = 393182602230310193L;
      class_2960 var1 = liiIlilIiiiiIlilIi.get(name);
      if (var1 != null) {
         return var1;
      } else {
         class_2960 var2 = class_2960.method_60655(
            lIIlIliIIlIl<"lIIlIliIIlIl","GSM0+q1S8y/SuOzmF2+o320flgAOBYvD4B4OtnPWrvoWb9WBnpI=">(),
            lIIlIliIIlIl<"lIIlIliIIlIl","mLBWqQTA7Z7mxFp3uq8Hi0DB5DyAH5I7ACHaxLX8NCHghxX/">() + name
         );
         String var3 = lIIlIliIIlIl<"lIIlIliIIlIl","fPKpU8aYCDzczZEWsNGihz6iy6QDqbJZzeuTeFwK3CuIazNXEmHDt6Q=">() + name;
         var6 ^= (-4294967296L ^ var6) & -1L << 32;
         switch (name.hashCode()) {
            case -991716523:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","0CH3x3jjUbVC/yUZUU0HXdM7olzU5sEFaBIeQdwVkftPUg==">())) {
                  var6 ^= (0L ^ var6) & -1L << 32;
               }
               break;
            case -905826493:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","1suFVLrcRpSBMqoGgy3ll2bOEODEPpP3zcU1TkaNN19/cA==">())) {
                  var6 ^= (25769803776L ^ var6) & -1L << 32;
               }
               break;
            case -903340183:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","O/hINenOYRgZdadf1TJaWGORNdJ2mZQDjKr7jb/e7CJOww==">())) {
                  var6 ^= (47244640256L ^ var6) & -1L << 32;
               }
               break;
            case -902467928:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","/pgVfK3x60ciONXEAhf0h7fIIx40WSf/ooH61Yj1c0P0uw==">())) {
                  var6 ^= (17179869184L ^ var6) & -1L << 32;
               }
               break;
            case -880905839:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","LVl8p79VniesfUFO90EMNAuRld/yyeM6z+E3TyFPCVUJIg==">())) {
                  var6 ^= (55834574848L ^ var6) & -1L << 32;
               }
               break;
            case 100913:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","TSQtcsAYAgTz7IkMyCj+LT6B79DsslX/mZKL5EpNWg==">())) {
                  var6 ^= (51539607552L ^ var6) & -1L << 32;
               }
               break;
            case 110997:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","xnrwUMRbFxe2sgBAhGg/ZPfmcticAs7I1TVYIZaCPw==">())) {
                  var6 ^= (4294967296L ^ var6) & -1L << 32;
               }
               break;
            case 3064885:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","FfLfUXAzDOsAlErqXK5OE6+yuwzZ6kl7cc3NESsWT3M=">())) {
                  var6 ^= (30064771072L ^ var6) & -1L << 32;
               }
               break;
            case 3540562:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","5I63PvrAoirCd6vH6RRbJX/w3X3cdyDwreacY8ItnKE=">())) {
                  var6 ^= (34359738368L ^ var6) & -1L << 32;
               }
               break;
            case 94755854:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","DY/SkLaSwZt7S3oeYbNBMg9hxm0QUNopTS6vo6vmcru2">())) {
                  var6 ^= (38654705664L ^ var6) & -1L << 32;
               }
               break;
            case 94756405:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","5w3QSZXdkcA4gZHozVhTbBUYdIzsaggqnZAjD7R1wB3O">())) {
                  var6 ^= (8589934592L ^ var6) & -1L << 32;
               }
               break;
            case 98128121:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","tkh6mavS1fTQ8kTTKwpc1qA+2jNp1RGhXow+9K37uSM6">())) {
                  var6 ^= (12884901888L ^ var6) & -1L << 32;
               }
               break;
            case 109641799:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","76mpefg2qfYlI8MOI8FqD6BRSEcR8vjeklZyoXefwcXC">())) {
                  var6 ^= (21474836480L ^ var6) & -1L << 32;
               }
               break;
            case 2061493789:
               if (name.equals(lIIlIliIIlIl<"lIIlIliIIlIl","hmKYGvbC7H7ObkgFwn0Xk33eSMxUl8MrB9kKkqA9Y/eDfQRV">())) {
                  var6 ^= (42949672960L ^ var6) & -1L << 32;
               }
         }

         switch ((int)(var6 >>> 32)) {
            case 0:
               Iiiiliiiiiii(var2, var3, g -> {
                  g.fill(new java.awt.geom.Ellipse2D.Double(22.4, 8.96, 19.2, 19.2));
                  Area var1x = new Area(new java.awt.geom.Ellipse2D.Double(11.52, 32.0, 40.96, 35.84));
                  var1x.intersect(new Area(new java.awt.geom.Rectangle2D.Double(0.0, 0.0, 64.0, 52.48)));
                  g.fill(var1x);
               }, 0.0F, 2);
               break;
            case 1:
               Iiiiliiiiiii(var2, var3, g -> {
                  GeneralPath var1x = new GeneralPath();
                  var1x.moveTo(32.0, 52.48);
                  var1x.curveTo(32.0, 52.48, 15.36, 33.28, 15.36, 24.32);
                  var1x.curveTo(15.36, 12.16, 48.64, 12.16, 48.64, 24.32);
                  var1x.curveTo(48.64, 33.28, 32.0, 52.48, 32.0, 52.48);
                  var1x.closePath();
                  g.fill(var1x);
               }, 0.0F, 2);
               break;
            case 2:
               Iiiiliiiiiii(var2, var3, g -> {
                  Area var1x = new Area();
                  var1x.add(new Area(new java.awt.geom.Ellipse2D.Double(8.96, 26.88, 21.76, 21.76)));
                  var1x.add(new Area(new java.awt.geom.Ellipse2D.Double(21.12, 17.92, 25.6, 25.6)));
                  var1x.add(new Area(new java.awt.geom.Ellipse2D.Double(33.28, 26.88, 21.76, 21.76)));
                  var1x.add(new Area(new java.awt.geom.RoundRectangle2D.Double(11.52, 35.84, 40.96, 12.8, 12.8, 12.8)));
                  g.fill(var1x);
               }, 0.0F, 2);
               break;
            case 3:
               Iiiiliiiiiii(var2, var3, g -> {
                  GeneralPath var1x = new GeneralPath();
                  var1x.moveTo(10.24, 33.28);
                  var1x.lineTo(23.04, 33.28);
                  var1x.lineTo(29.44, 19.2);
                  var1x.lineTo(37.12, 46.08);
                  var1x.lineTo(42.24, 33.28);
                  var1x.lineTo(55.04, 33.28);
                  g.draw(var1x);
               }, 7.36F, 2);
               break;
            case 4:
               Iiiiliiiiiii(var2, var3, g -> {
                  double var1x = 46.08;
                  g.draw(new java.awt.geom.Line2D.Double(17.92, var1x, 17.92, 38.4));
                  g.draw(new java.awt.geom.Line2D.Double(32.0, var1x, 32.0, 28.16));
                  g.draw(new java.awt.geom.Line2D.Double(46.08, var1x, 46.08, 17.92));
               }, 7.36F, 2);
               break;
            case 5:
               Iiiiliiiiiii(var2, var3, g -> {
                  GeneralPath var1x = new GeneralPath();
                  var1x.moveTo(21.76, 17.92);
                  var1x.lineTo(33.28, 32.0);
                  var1x.lineTo(21.76, 46.08);
                  GeneralPath var2x = new GeneralPath();
                  var2x.moveTo(34.56, 17.92);
                  var2x.lineTo(46.08, 32.0);
                  var2x.lineTo(34.56, 46.08);
                  g.draw(var1x);
                  g.draw(var2x);
               }, 7.36F, 2);
               break;
            case 6:
               Iiiiliiiiiii(var2, var3, g -> {
                  double var1x = 12.8;
                  double var3x = 38.4;
                  double var5 = 9.92;
                  double var7 = 3.52;
                  g.fill(new java.awt.geom.RoundRectangle2D.Double(var1x, 15.36, var3x, var5, var7, var7));
                  g.fill(new java.awt.geom.RoundRectangle2D.Double(var1x, 27.04, var3x, var5, var7, var7));
                  g.fill(new java.awt.geom.RoundRectangle2D.Double(var1x, 38.72, var3x, var5, var7, var7));
               }, 0.0F, 2);
               break;
            case 7:
               Iiiiliiiiiii(var2, var3, g -> {
                  double var1x = 32.0;
                  double var3x = 10.88;
                  double var5 = 52.48;
                  double var7 = 21.44;
                  double var9 = 11.52;
                  double var11 = 42.56;
                  double var13 = 53.12;
                  GeneralPath var15 = new GeneralPath();
                  var15.moveTo(var1x, var3x);
                  var15.lineTo(var5, var7);
                  var15.lineTo(var5, var11);
                  var15.lineTo(var1x, var13);
                  var15.lineTo(var9, var11);
                  var15.lineTo(var9, var7);
                  var15.closePath();
                  g.draw(var15);
                  g.draw(new java.awt.geom.Line2D.Double(var9, var7, var1x, 32.0));
                  g.draw(new java.awt.geom.Line2D.Double(var5, var7, var1x, 32.0));
                  g.draw(new java.awt.geom.Line2D.Double(var1x, 32.0, var1x, var13));
               }, 6.4511995F, 2);
               break;
            case 8:
               Iiiiliiiiiii(var2, var3, g -> g.fill(iIIIlIlIIl(32.0, 33.28, 26.88, 11.2)), 0.0F, 2);
               break;
            case 9:
               Iiiiliiiiiii(var2, var3, g -> {
                  g.draw(new java.awt.geom.Ellipse2D.Double(10.88, 10.88, 42.24, 42.24));
                  g.draw(new java.awt.geom.Line2D.Double(32.0, 32.0, 32.0, 20.48));
                  g.draw(new java.awt.geom.Line2D.Double(32.0, 32.0, 44.8, 32.0));
               }, 7.36F, 2);
               break;
            case 10:
               Iiiiliiiiiii(var2, var3, g -> {
                  g.fill(lllllillll(26.88, 34.56, 19.2));
                  g.fill(lllllillll(47.36, 16.64, 8.96));
               }, 0.0F, 2);
               break;
            case 11:
               Iiiiliiiiiii(var2, var3, g -> {
                  GeneralPath var1x = new GeneralPath();
                  var1x.moveTo(32.0, 10.24);
                  var1x.lineTo(51.2, 17.28);
                  var1x.curveTo(51.2, 38.4, 46.08, 48.64, 32.0, 55.04);
                  var1x.curveTo(17.92, 48.64, 12.8, 38.4, 12.8, 17.28);
                  var1x.closePath();
                  g.fill(var1x);
               }, 0.0F, 2);
               break;
            case 12:
               Iiiiliiiiiii(var2, var3, g -> {
                  GeneralPath var1x = new GeneralPath();
                  var1x.moveTo(7.68, 32.0);
                  var1x.quadTo(32.0, 6.4, 56.32, 32.0);
                  var1x.quadTo(32.0, 57.6, 7.68, 32.0);
                  var1x.closePath();
                  g.draw(var1x);
                  double var2x = 14.08;
                  g.fill(new java.awt.geom.Ellipse2D.Double(32.0 - var2x / 2.0, 32.0 - var2x / 2.0, var2x, var2x));
               }, 6.4511995F, 2);
               break;
            case 13:
               Iiiiliiiiiii(var2, var3, g -> {
                  g.draw(new java.awt.geom.Ellipse2D.Double(10.88, 10.88, 42.24, 42.24));
                  double var1x = 15.36;
                  g.fill(new java.awt.geom.Ellipse2D.Double(32.0 - var1x / 2.0, 32.0 - var1x / 2.0, var1x, var1x));
               }, 7.36F, 2);
         }

         liiIlilIiiiiIlilIi.put(name, var2);
         return var2;
      }
   }

   private static boolean iIlllIllll(class_2960 paint, String res, int stroke, float id, float grid, lilIIiIliilIIiIl label) {
      long var11 = 209270383871161962L;

      try {
         BufferedImage var6 = new BufferedImage(stroke, stroke, 2);
         Graphics2D var7 = var6.createGraphics();
         var7.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
         var7.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
         var7.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
         var7.setColor(Color.WHITE);
         var7.scale((double)((float)stroke / id), (double)((float)stroke / id));
         var7.setStroke(new BasicStroke(grid, 1, 1));
         label.paint(var7);
         var7.dispose();
         class_1011 var8 = new class_1011(stroke, stroke, false);
         int[] var9 = var6.getRGB(0, 0, stroke, stroke, null, 0, stroke);

         for (long var14 = var11 ^ (0L ^ var11) & -1L << 32; (int)(var14 >>> 32) < var9.length; var14 += 4294967296L) {
            var8.method_61941((int)(var14 >>> 32) % stroke, (int)(var14 >>> 32) / stroke, var9[(int)(var14 >>> 32)] & 0xFF000000 | 16777215);
         }

         class_1043 var10 = new class_1043(() -> res, var8);
         class_310.method_1551().method_1531().method_4616(paint, var10);
         return true;
      } catch (Throwable var13) {
         return false;
      }
   }

   private static boolean IiIIlliIIl(class_2960 id, String label, lilIIiIliilIIiIl paint) {
      return lIlIliIlIl(id, label, paint, 0.0F);
   }
}
