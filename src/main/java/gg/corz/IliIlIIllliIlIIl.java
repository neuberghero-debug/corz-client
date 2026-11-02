package gg.corz;

import java.util.HashMap;
import java.util.List;
import net.minecraft.class_1297;
import net.minecraft.class_1511;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_2338.class_2339;

public final class IliIlIIllliIlIIl implements lIiIlIIliIiIlIIl {
   public static final int lIIIlillIl = 8192;
   public static final int iIIIlillIl = 1;
   private long IiIIlillIl;
   private final class_2339 llIIlillIl;
   private long liIIlillIl;
   private final HashMap<Long, Boolean> IlIIlillIl = new HashMap<>();
   private class_1937 ilIIlillIl;

   @Override
   public boolean solid(int z, int y, int x) {
      long var10 = 1549796123850637518L;
      class_1937 var4 = this.ilIIlillIl;
      if (var4 == null) {
         return false;
      } else {
         long var5 = class_2338.method_10064(z, y, x);
         Boolean var7 = this.IlIIlillIl.get(var5);
         if (var7 != null) {
            return var7;
         } else {
            if (!var4.method_8393(z >> 4, x >> 4)) {
               var10 ^= (4294967296L ^ var10) & -1L << 32;
            } else {
               this.llIIlillIl.method_10103(z, y, x);
               class_2680 var9 = var4.method_8320(this.llIIlillIl);
               var10 ^= ((long)(!var9.method_26220(var4, this.llIIlillIl).method_1110() ? 1 : 0) << 32 ^ var10) & -1L << 32;
            }

            if (this.IlIIlillIl.size() < 8192) {
               this.IlIIlillIl.put(var5, Boolean.valueOf((boolean)((int)(var10 >>> 32))));
            }

            return (boolean)((int)(var10 >>> 32));
         }
      }
   }

   static class_243 Iliilliiilii(class_2338 base) {
      return new class_243((double)base.method_10263() + 0.5, (double)base.method_10264() + 1.0, (double)base.method_10260() + 0.5);
   }

   static double IIiilIiiiIii(double vy0, double y0, double floorY) {
      long var7 = 4078459171635820985L;
      var7 ^= ((long)IlIIiillllIIiill.IilliliilIIi(y0) << 32 ^ var7) & -1L << 32;
      return vy0 + Math.max(0.0, IlIIiillllIIiill.iIlIlllllill(y0, (int)(var7 >>> 32))) - floorY;
   }

   public class_1511 Illlllllilll(class_2338 base) {
      return this.ilIIlillIl != null && base != null ? lllIliIlillIliIl.IIlllIlliIll(base) : null;
   }

   static boolean iIlIlllllill(long tick, long memoTick) {
      return tick == Long.MIN_VALUE || memoTick < tick || memoTick - tick >= 1L;
   }

   public IliIlIIllliIlIIl() {
      this.llIIlillIl = new class_2339();
      this.IiIIlillIl = Long.MIN_VALUE;
      this.liIIlillIl = Long.MIN_VALUE;
   }

   public void IliIlllilIi(long world, class_1937 tick) {
      if (tick != this.ilIIlillIl || iIlIlllllill(this.IiIIlillIl, world)) {
         this.IlIIlillIl.clear();
         this.IiIIlillIl = world;
      }

      this.ilIIlillIl = tick;
   }

   public boolean IlIlllIlilIl(class_2338 p) {
      return this.ilIIlillIl != null && p != null && lliiIliliiIl.lIiiIiIlilli(p);
   }

   public boolean IiIlliIliiIl(class_2338 cell) {
      return this.ilIIlillIl != null && cell != null
         ? this.IlIlllIlilIl(cell) && lllIliIlillIliIl.Illlllllilll(cell.method_10074()) && lllIliIlillIliIl.IlIillIiilIi(cell)
         : false;
   }

   boolean llIIlilIIl(class_243 from, class_243 maxStepUp, int to) {
      return this.ilIIlillIl != null && IiIIlliIIl(this, from, maxStepUp, to);
   }

   static double IIlilIliiIli(class_243 from, class_243 eye, class_243 to) {
      if (from != null && eye != null && to != null) {
         float var3 = (float)liiIIliliiiIIlil.Ililllililil(eye.field_1352 - from.field_1352, eye.field_1350 - from.field_1350);
         float var4 = (float)liiIIliliiiIIlil.Iiilliiliiil(eye.field_1352 - from.field_1352, eye.field_1351 - from.field_1351, eye.field_1350 - from.field_1350);
         float var5 = (float)liiIIliliiiIIlil.Ililllililil(to.field_1352 - from.field_1352, to.field_1350 - from.field_1350);
         float var6 = (float)liiIIliliiiIIlil.Iiilliiliiil(to.field_1352 - from.field_1352, to.field_1351 - from.field_1351, to.field_1350 - from.field_1350);
         return liiIIliliiiIIlil.Iilllilliill(var3, var4, var5, var6);
      } else {
         return 180.0;
      }
   }

   static class_238 IIIilIIiiIIi(liIIiIlliiIIiIll extra, double s) {
      double var3 = Math.max(0.0, s + (extra == null ? 0.0 : extra.IlIlllIlilIl()));
      return extra == null ? null : Iiilliiliiil(extra.IliIlllilIi(), extra.liiiIIllIl(), extra.iIlIlllllill(), var3);
   }

   public boolean iliIiiliiiii(class_2338 p) {
      class_1937 var2 = this.ilIIlillIl;
      return var2 != null && p != null && var2.method_22347(p);
   }

   static class_238 Iiilliiliiil(double y, double z, double x, double pad) {
      double var8 = 0.3 + pad;
      return new class_238(y - var8, z - pad, x - var8, y + var8, z + 1.8 + pad, x + var8);
   }

   public class_1937 IilliliilIIi() {
      return this.ilIIlillIl;
   }

   static double Illillliilli(float pitch, float yaw, class_243 to, class_243 eye) {
      if (to != null && eye != null) {
         float var4 = (float)liiIIliliiiIIlil.Ililllililil(eye.field_1352 - to.field_1352, eye.field_1350 - to.field_1350);
         float var5 = (float)liiIIliliiiIIlil.Iiilliiliiil(eye.field_1352 - to.field_1352, eye.field_1351 - to.field_1351, eye.field_1350 - to.field_1350);
         return liiIIliliiiIIlil.Iilllilliill(pitch, yaw, var4, var5);
      } else {
         return 180.0;
      }
   }

   public void liiiIIllIl(long mark) {
      if (mark != this.liIIlillIl) {
         this.liIIlillIl = mark;
         this.IlIIlillIl.clear();
      }
   }

   public boolean lIiiIiIlilli(class_2338 p) {
      return p != null && this.solid(p.method_10263(), p.method_10264(), p.method_10260());
   }

   public List<class_1511> Iilllilliill(class_243 centre, double radius) {
      class_1937 var4 = this.ilIIlillIl;
      if (var4 != null && centre != null && radius > 0.0) {
         class_238 var5 = new class_238(
            centre.field_1352 - radius,
            centre.field_1351 - radius,
            centre.field_1350 - radius,
            centre.field_1352 + radius,
            centre.field_1351 + radius,
            centre.field_1350 + radius
         );
         double var6 = radius * radius;
         return var4.method_8390(class_1511.class, var5, c -> c.method_5805() && !c.method_31481() && c.method_73189().method_1025(centre) <= var6);
      } else {
         return List.of();
      }
   }

   public boolean IIillIiliIil(class_2338 skipB, class_1297 skipA, class_1297 base) {
      class_1937 var4 = this.ilIIlillIl;
      if (var4 != null && skipB != null) {
         class_2338 var5 = skipB.method_10084();
         return !var4.method_8333(
               null,
               lllIliIlillIliIl.iIlIlllllill(skipB),
               up -> !up.method_7325() && up != skipA && up != base && (!(up instanceof class_1511 var4x) || !var4x.method_24515().equals(var5))
            )
            .isEmpty();
      } else {
         return false;
      }
   }

   static double IiIiliIiiiIi(double x) {
      if (Double.isNaN(x)) {
         return 1.0;
      } else if (x == Double.POSITIVE_INFINITY) {
         return 1.0;
      } else if (x == Double.NEGATIVE_INFINITY) {
         return 0.0;
      } else {
         double var2 = 1.0 / (1.0 + 0.2316419 * Math.abs(x));
         double var4 = 0.3989422804014327 * Math.exp(-x * x / 2.0);
         double var6 = var4 * var2 * (0.31938153 + var2 * (-0.356563782 + var2 * (1.781477937 + var2 * (-1.821255978 + var2 * 1.330274429))));
         return x >= 0.0 ? 1.0 - var6 : var6;
      }
   }

   public boolean IIlllIlliIll(class_2338 cell) {
      return this.ilIIlillIl != null && cell != null && lllIliIlillIliIl.Ililllililil(cell);
   }

   static int Iilililiiili(double floorY, double max, double vy0, int y0) {
      long var8 = -4499836609439246473L;
      if (Double.isFinite(floorY) && Double.isFinite(max) && Double.isFinite(vy0)) {
         if (floorY <= vy0 + 1.0E-6 && max <= 0.0) {
            return 0;
         } else {
            for (long var10 = var8 ^ (4294967296L ^ var8) & -1L << 32; (int)(var10 >>> 32) <= y0; var10 += 4294967296L) {
               if (floorY + IlIIiillllIIiill.iIlIlllllill(max, (int)(var10 >>> 32)) <= vy0 + 1.0E-6) {
                  return (int)(var10 >>> 32);
               }
            }

            return y0;
         }
      } else {
         return 0;
      }
   }

   static double IIIIllIIIl(class_243 a, class_243 b) {
      double var2 = a.field_1352 - b.field_1352;
      double var4 = a.field_1350 - b.field_1350;
      return Math.sqrt(var2 * var2 + var4 * var4);
   }

   static class_243 Iiiiliiiiiii(class_243 v) {
      return iIliIlilIlliIlil.iIiIlIliIl(v);
   }

   static double iIIIlIlIIl(double bx, double bz, double ax, double az) {
      double var8 = bx - ax;
      double var10 = bz - az;
      return Math.sqrt(var8 * var8 + var10 * var10);
   }

   static double IlIillIiilIi(class_238 b, class_238 a) {
      double var2 = Math.max(b.field_1323 - a.field_1320, a.field_1323 - b.field_1320);
      double var4 = Math.max(b.field_1322 - a.field_1325, a.field_1322 - b.field_1325);
      double var6 = Math.max(b.field_1321 - a.field_1324, a.field_1321 - b.field_1324);
      return Math.max(var2, Math.max(var4, var6));
   }

   public void Ililllililil() {
      this.IlIIlillIl.clear();
      this.ilIIlillIl = null;
      this.IiIIlillIl = Long.MIN_VALUE;
      this.liIIlillIl = Long.MIN_VALUE;
   }

   static boolean IiIIlliIIl(lIiIlIIliIiIlIIl terrain, class_243 to, class_243 from, int maxStepUp) {
      long var18 = 698390059621620874L;
      long var20 = 2932956031673318246L;
      long var22 = 8353042390422160555L;
      long var24 = 6547106645131156026L;
      long var26 = -3513327301312228255L;
      if (terrain != null && to != null && from != null) {
         double var4 = IIIIllIIIl(to, from);
         var18 ^= ((long)Math.max(1, (int)Math.ceil(var4 / 0.5)) << 32 ^ var18) & -1L << 32;
         var18 ^= ((long)((int)Math.floor(to.field_1351 + 0.001)) ^ var18) & -1L >>> 32;
         var20 ^= ((long)((int)var18) << 32 ^ var20) & -1L << 32;

         for (long var31 = var20 ^ (1L ^ var20) & -1L >>> 32; (int)var31 <= (int)(var18 >>> 32); var31 ^= (var31 ^ var31 + (long)1) & -1L >>> 32) {
            double var10 = (double)((int)var31) / (double)((int)(var18 >>> 32));
            var22 ^= ((long)((int)Math.floor(to.field_1352 + (from.field_1352 - to.field_1352) * var10)) << 32 ^ var22) & -1L << 32;
            var22 ^= ((long)((int)Math.floor(to.field_1350 + (from.field_1350 - to.field_1350) * var10)) ^ var22) & -1L >>> 32;
            var24 ^= ((long)((int)var18) << 32 ^ var24) & -1L << 32;
            var24 ^= (0L ^ var24) & -1L >>> 32;
            var26 ^= (0L ^ var26) & -1L << 32;

            while ((int)(var26 >>> 32) <= 1 && (int)var24 == 0) {
               var26 ^= ((long)((int)var18 + (int)(var26 >>> 32)) ^ var26) & -1L >>> 32;
               if (!terrain.solid((int)(var22 >>> 32), (int)var26, (int)var22) && !terrain.solid((int)(var22 >>> 32), (int)var26 + 1, (int)var22)) {
                  var24 ^= ((long)((int)var26) << 32 ^ var24) & -1L << 32;
                  var24 ^= (1L ^ var24) & -1L >>> 32;
               }

               var26 += 4294967296L;
            }

            if ((int)var24 == 0) {
               return false;
            }

            for (var26 ^= (0L ^ var26) & -1L << 32;
               !terrain.solid((int)(var22 >>> 32), (int)(var24 >>> 32) - 1, (int)var22) && (int)(var26 >>> 32) < 4;
               var26 += 4294967296L
            ) {
               var24 += -4294967296L;
            }

            if ((int)(var26 >>> 32) >= 4) {
               return false;
            }

            if ((int)(var24 >>> 32) - (int)var18 > maxStepUp) {
               return false;
            }

            var18 ^= ((long)((int)(var24 >>> 32)) ^ var18) & -1L >>> 32;
            if ((int)var18 - (int)(var31 >>> 32) > maxStepUp) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public boolean IIIllIIliIIl(class_2338 p) {
      return this.ilIIlillIl != null && p != null && lllIliIlillIliIl.IliIlllilIi(p);
   }
}
