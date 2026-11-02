package gg.corz;

import java.util.UUID;
import net.minecraft.class_2561;
import net.minecraft.class_270;
import net.minecraft.class_5251;

final class ilIIlIlIiIIlIl {
   static boolean iliIiiliiiii(UUID uuid) {
      return uuid != null && uuid.version() == 2;
   }

   static double IilliliilIIi(double minY, double maxZ, double minZ, double px, double minX, double maxX, double pz, double py, double maxY) {
      double var18 = Math.max(px, Math.min(minY, pz));
      double var20 = Math.max(minX, Math.min(maxZ, py));
      double var22 = Math.max(maxX, Math.min(minZ, maxY));
      double var24 = minY - var18;
      double var26 = maxZ - var20;
      double var28 = minZ - var22;
      return Math.sqrt(var24 * var24 + var26 * var26 + var28 * var28);
   }

   static boolean lIiiIiIlilli(class_270 mine, class_270 theirs) {
      return mine != null && mine.method_1206(theirs) && !mine.method_1205();
   }

   static double IliIlllilIi(float yaw, float dy, double dz, double pitch, double dx) {
      double var8 = Math.toRadians((double)yaw);
      double var10 = Math.toRadians((double)dy);
      double var12 = -Math.sin(var8) * Math.cos(var10);
      double var14 = -Math.sin(var10);
      double var16 = Math.cos(var8) * Math.cos(var10);
      return liiiIIllIl(var12, var14, var16, dz, pitch, dx);
   }

   private ilIIlIlIiIIlIl() {
   }

   static Integer IIIllIIliIIl(class_2561 name, String text) {
      return name != null && text != null && !text.isEmpty() ? IlIlllIlilIl(name, text, null) : null;
   }

   private static String IiIlliIliiIl(String s) {
      long var4 = 5875035101097438792L;
      StringBuilder var1 = new StringBuilder(s.length());
      var4 ^= (0L ^ var4) & -1L << 32;

      while ((int)(var4 >>> 32) < s.length()) {
         var4 ^= ((long)s.charAt((int)(var4 >>> 32)) ^ var4) & -1L >>> 32;
         if ((int)var4 >= 97 && (int)var4 <= 122 || (int)var4 >= 65 && (int)var4 <= 90 || (int)var4 >= 48 && (int)var4 <= 57 || (int)var4 == 95) {
            var1.append((char)((int)var4));
         }

         var4 += 4294967296L;
      }

      return var1.toString();
   }

   static double liiiIIllIl(double bx, double ax, double ay, double bz, double by, double az) {
      double var12 = Math.sqrt(bx * bx + ax * ax + ay * ay);
      double var14 = Math.sqrt(bz * bz + by * by + az * az);
      if (!(var12 < 1.0E-9) && !(var14 < 1.0E-9)) {
         double var16 = (bx * bz + ax * by + ay * az) / (var12 * var14);
         return Math.toDegrees(Math.acos(Math.max(-1.0, Math.min(1.0, var16))));
      } else {
         return 0.0;
      }
   }

   static boolean iIlIlllllill(double angleDegrees, double fovDegrees) {
      return fovDegrees >= 360.0 || angleDegrees <= fovDegrees / 2.0;
   }

   private static Integer IlIlllIlilIl(class_2561 inherited, String node, Integer name) {
      class_5251 var3 = inherited.method_10866().method_10973();
      Integer var4 = var3 != null ? var3.method_27716() : name;
      String var5 = inherited.method_27662().getString();
      if (var4 == null || !var5.equals(node) && !IiIlliIliiIl(var5).equals(node)) {
         for (class_2561 var7 : inherited.method_10855()) {
            Integer var8 = IlIlllIlilIl(var7, node, var4);
            if (var8 != null) {
               return var8;
            }
         }

         return null;
      } else {
         return var4;
      }
   }
}
