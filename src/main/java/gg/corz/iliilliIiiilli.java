package gg.corz;

import com.corz.client.mixins.AccessorClientWorldPending;
import com.corz.client.mixins.AccessorPendingUpdate;
import com.corz.client.mixins.AccessorPendingUpdateManager;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import net.minecraft.class_10584;
import net.minecraft.class_1297;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_3726;
import net.minecraft.class_638;
import net.minecraft.class_7202;
import net.minecraft.class_746;
import net.minecraft.class_2338.class_2339;
import net.minecraft.class_2350.class_2351;

public final class iliilliIiiilli {
   private static long lllIiiIIIl = Long.MIN_VALUE;
   private static int lIlIiiIIIl;
   private static final double liIIiiIIIl = 0.002;
   public static final float iIIIiiIIIl = 1.3F;
   public static final float IlIIiiIIIl = 0.3F;
   public static final float llIIiiIIIl = 0.225F;
   public static final float ilIIiiIIIl = 9.0F;
   public static final double lIIIiiIIIl = 0.05;
   private static int IIlIiiIIIl;
   private static class_2338 iIlIiiIIIl;
   private static final double iiIIiiIIIl = 1.0E-7;
   public static final int iiiiliIIIl = 4;
   private static float IllIiiIIIl;
   private static final double IiIIiiIIIl = 0.001;
   public static final double IIIIiiIIIl = 4.0;

   public static boolean IilliliilIIi(class_1937 w, class_2338 pos) {
      if (pos == null) {
         return false;
      } else {
         Long2ObjectOpenHashMap var2 = IliIlllilIi(w);
         return var2 != null && !var2.isEmpty() && var2.containsKey(pos.method_10063());
      }
   }

   public static void IlIillIiilIi(class_2338 cell, float untilMs, long power) {
      iIlIiiIIIl = cell == null ? null : cell.method_10062();
      IllIiiIIIl = untilMs;
      lllIiiIIIl = power;
   }

   public static int IIiilIiiiIii() {
      return IIlIiiIIIl;
   }

   public static boolean IiIiliIiiiIi(class_2338 pos) {
      class_2338 var1 = iIlIiiIIIl;
      if (pos == null || var1 == null || IIIiillllIIiilll.IliIlllilIi() > lllIiiIIIl) {
         return false;
      } else if (pos.equals(var1)) {
         return true;
      } else {
         class_638 var2 = class_310.method_1551().field_1687;
         if (var2 == null) {
            return false;
         } else {
            class_2680 var3 = var2.method_8320(pos);
            float var4 = var3.method_26204().method_9520();
            if (!var3.method_26215() && var4 < 9.0F) {
               double var5 = class_243.method_24953(pos).method_1022(class_243.method_24953(var1));
               if (var5 <= (double)IllIiiIIIl) {
                  return true;
               } else {
                  return !(var5 <= IIlilIliiIli(IllIiiIIIl, var4)) ? false : Illillliilli(var2, var1, pos, IllIiiIIIl);
               }
            } else {
               return false;
            }
         }
      }
   }

   private static boolean Illillliilli(class_1937 cell, class_2338 power, class_2338 w, float target) {
      long var22 = -8044664510686854623L;
      class_243 var4 = class_243.method_24953(power);
      class_243 var5 = class_243.method_24953(w).method_1020(var4);
      double var6 = var5.method_1033();
      if (var6 < 1.0E-6) {
         return true;
      } else {
         double var8 = var5.field_1352 / var6;
         double var10 = var5.field_1351 / var6;
         double var12 = var5.field_1350 / var6;
         double var14 = (double)(1.3F * target);
         var22 ^= ((long)((int)Math.ceil(var6 / 0.3F) + 2) << 32 ^ var22) & -1L << 32;
         class_2339 var17 = new class_2339();

         for (long var25 = var22 ^ (0L ^ var22) & -1L >>> 32; (int)var25 < (int)(var25 >>> 32) && var14 > 0.0; var25 ^= (var25 ^ var25 + (long)1) & -1L >>> 32) {
            double var19 = (double)((float)((int)var25) * 0.3F);
            var17.method_10103(
               class_3532.method_15357(var4.field_1352 + var8 * var19),
               class_3532.method_15357(var4.field_1351 + var10 * var19),
               class_3532.method_15357(var4.field_1350 + var12 * var19)
            );
            if (!var17.equals(power)) {
               class_2680 var21 = cell.method_8320(var17);
               if (!var21.method_26215() || !var21.method_26227().method_15769()) {
                  var14 -= (double)((Math.max(var21.method_26204().method_9520(), var21.method_26227().method_15760()) + 0.3F) * 0.3F);
               }

               if (var17.equals(w)) {
                  return var14 > 0.0;
               }
            }

            var14 -= 0.225F;
         }

         return false;
      }
   }

   public static boolean lIiiIiIlilli(class_2338 pos) {
      return IilliliilIIi(class_310.method_1551().field_1687, pos);
   }

   public static class_2680 iliIiiliiiii(class_1937 w, class_2338 pos) {
      if (w != null && pos != null) {
         class_2680 var2 = IIIIllIIIl(w, pos);
         return var2 == null ? w.method_8320(pos) : var2;
      } else {
         return null;
      }
   }

   public static int Ililllililil(int pingMs) {
      long var2 = 8964240311530855052L;
      var2 ^= ((long)Math.max(0, pingMs) << 32 ^ var2) & -1L << 32;
      return Math.max(1, Math.min(4, 1 + (int)Math.ceil((double)((int)(var2 >>> 32)) / 100.0)));
   }

   private static class_2680 IIIIllIIIl(class_1937 pos, class_2338 w) {
      if (pos != null && w != null) {
         Long2ObjectOpenHashMap var2 = IliIlllilIi(pos);
         Object var3 = var2 != null && !var2.isEmpty() ? var2.get(w.method_10063()) : null;
         return var3 == null ? null : ((AccessorPendingUpdate)var3).corzServerState();
      } else {
         return null;
      }
   }

   public static boolean IlIlllIlilIl(class_1937 w, class_2338 pos) {
      class_2680 var2 = IIIIllIIIl(w, pos);
      return var2 == null ? false : w.method_8320(pos).method_26220(w, pos).method_1110() && !var2.method_26220(w, pos).method_1110();
   }

   public static boolean liiiIIllIl(class_1937 w) {
      Long2ObjectOpenHashMap var1 = IliIlllilIi(w);
      return var1 != null && !var1.isEmpty();
   }

   public static double IIlilIliiIli(float resistance, float power) {
      return Math.max(0.0, (double)((1.3F * resistance - (power + 0.3F) * 0.3F) / 0.74999994F));
   }

   public static boolean IIIilIIiiIIi(class_238 now, class_238 step, class_243 pos, class_243 srv, class_243 cell, int lead) {
      if (now != null && step != null) {
         class_243 var6 = pos == null ? class_243.field_1353 : pos;
         class_243 var7 = srv == null ? var6 : srv;
         class_238 var8 = step.method_997(var7.method_1020(var6));
         class_238 var9 = cell == null ? var8 : var8.method_997(cell.method_1021((double)Math.max(0, lead)));
         return step.method_991(var8).method_991(var9).method_1014(0.05).method_994(now);
      } else {
         return false;
      }
   }

   public static boolean Illlllllilll(class_746 p) {
      long var17 = 1966181446554921482L;
      long var19 = -3227864610017069235L;
      long var21 = 898821883698307970L;
      long var13 = -6453961391262199877L;
      long var15 = 2188175333495699503L;
      if (p == null) {
         return false;
      } else {
         class_1937 var1 = p.method_73183();
         Long2ObjectOpenHashMap var2 = IliIlllilIi(var1);
         if (var2 != null && !var2.isEmpty()) {
            class_238 var3 = p.method_5829();
            var13 ^= ((long)class_3532.method_15357(var3.field_1322 + 0.001) << 32 ^ var13) & -1L << 32;
            var13 ^= ((long)Math.max((int)(var13 >>> 32), class_3532.method_15357(var3.field_1325 - 1.0E-7)) ^ var13) & -1L >>> 32;
            var15 ^= ((long)class_3532.method_15357(var3.field_1323) << 32 ^ var15) & -1L << 32;
            var15 ^= ((long)Math.max((int)(var15 >>> 32), class_3532.method_15357(var3.field_1320 - 1.0E-7)) ^ var15) & -1L >>> 32;
            var17 ^= ((long)class_3532.method_15357(var3.field_1321) << 32 ^ var17) & -1L << 32;
            var17 ^= ((long)Math.max((int)(var17 >>> 32), class_3532.method_15357(var3.field_1324 - 1.0E-7)) ^ var17) & -1L >>> 32;
            var19 ^= ((long)((int)(var13 >>> 32)) << 32 ^ var19) & -1L << 32;

            while ((int)(var19 >>> 32) <= (int)var13) {
               for (var19 ^= ((long)((int)(var15 >>> 32) - 1) ^ var19) & -1L >>> 32;
                  (int)var19 <= (int)var15 + 1;
                  var19 ^= (var19 ^ var19 + (long)1) & -1L >>> 32
               ) {
                  for (var21 ^= ((long)((int)(var17 >>> 32) - 1) << 32 ^ var21) & -1L << 32; (int)(var21 >>> 32) <= (int)var17 + 1; var21 += 4294967296L) {
                     if ((
                           (int)var19 < (int)(var15 >>> 32)
                              || (int)var19 > (int)var15
                              || (int)(var21 >>> 32) < (int)(var17 >>> 32)
                              || (int)(var21 >>> 32) > (int)var17
                        )
                        && var2.containsKey(class_2338.method_10064((int)var19, (int)(var19 >>> 32), (int)(var21 >>> 32)))) {
                        return true;
                     }
                  }
               }

               var19 += 4294967296L;
            }

            return false;
         } else {
            return false;
         }
      }
   }

   public static boolean Iiilliiliiil(class_2338 cell, int lead) {
      class_310 var2 = class_310.method_1551();
      class_638 var3 = var2.field_1687;
      if (var3 != null && cell != null) {
         class_238 var4 = new class_238(cell);

         for (class_1297 var6 : var3.method_8333(var2.field_1724, var4.method_1014(4.0), e -> e.method_5805() && !e.method_7325() && e.field_23807)) {
            class_243 var7 = var6.method_73189();
            class_10584 var8 = var6.method_66233();
            class_243 var9 = var8 != null ? var8.method_66265() : var7;
            class_243 var10 = new class_243(var7.field_1352 - var6.field_6014, var7.field_1351 - var6.field_6036, var7.field_1350 - var6.field_5969);
            if (IIIilIIiiIIi(var4, var6.method_5829(), var7, var9, var10, lead)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public static boolean Iilllilliill(int real, int unconfirmed) {
      return unconfirmed > 0 && real == 0;
   }

   public static void Iiiiliiiiiii() {
      IIlIiiIIIl = 0;
      lIlIiiIIIl = 0;
   }

   public static int iIlIlllllill(class_1937 w) {
      Long2ObjectOpenHashMap var1 = IliIlllilIi(w);
      return var1 == null ? 0 : var1.size();
   }

   public static int IIillIiliIil() {
      return Ililllililil(illIllilIilIllil.IiIlliIliiIl());
   }

   public static boolean IiIlliIliiIl(class_1937 w, class_238 box) {
      long var16 = 3925031972681305127L;
      long var18 = -5934989581692255313L;
      long var20 = 5904942284744840044L;
      long var12 = 8400340457567021480L;
      long var14 = -1241515091336148963L;
      if (box == null) {
         return false;
      } else {
         Long2ObjectOpenHashMap var2 = IliIlllilIi(w);
         if (var2 != null && !var2.isEmpty()) {
            var12 ^= ((long)class_3532.method_15357(box.field_1323) << 32 ^ var12) & -1L << 32;
            var12 ^= ((long)Math.max((int)(var12 >>> 32), class_3532.method_15357(box.field_1320 - 1.0E-7)) ^ var12) & -1L >>> 32;
            var14 ^= ((long)class_3532.method_15357(box.field_1322) << 32 ^ var14) & -1L << 32;
            var14 ^= ((long)Math.max((int)(var14 >>> 32), class_3532.method_15357(box.field_1325 - 1.0E-7)) ^ var14) & -1L >>> 32;
            var16 ^= ((long)class_3532.method_15357(box.field_1321) << 32 ^ var16) & -1L << 32;
            var16 ^= ((long)Math.max((int)(var16 >>> 32), class_3532.method_15357(box.field_1324 - 1.0E-7)) ^ var16) & -1L >>> 32;
            var18 ^= ((long)((int)(var12 >>> 32)) << 32 ^ var18) & -1L << 32;

            while ((int)(var18 >>> 32) <= (int)var12) {
               for (var18 ^= ((long)((int)(var14 >>> 32)) ^ var18) & -1L >>> 32; (int)var18 <= (int)var14; var18 ^= (var18 ^ var18 + (long)1) & -1L >>> 32) {
                  for (var20 ^= ((long)((int)(var16 >>> 32)) << 32 ^ var20) & -1L << 32; (int)(var20 >>> 32) <= (int)var16; var20 += 4294967296L) {
                     if (var2.containsKey(class_2338.method_10064((int)(var18 >>> 32), (int)var18, (int)(var20 >>> 32)))) {
                        return true;
                     }
                  }
               }

               var18 += 4294967296L;
            }

            return false;
         } else {
            return false;
         }
      }
   }

   public static boolean IIIllIIliIIl(class_1937 w, class_2338 pos) {
      class_2680 var2 = IIIIllIIIl(w, pos);
      return var2 == null ? false : !w.method_8320(pos).method_26220(w, pos).method_1110() && var2.method_26220(w, pos).method_1110();
   }

   public static int Iliilliiilii() {
      return lIlIiiIIIl;
   }

   public static boolean IIlllIlliIll(class_746 p) {
      long var22 = -728787989979273161L;
      long var24 = 6498209452845360779L;
      long var26 = -2050519013971027025L;
      long var28 = 3272578136262855569L;
      long var30 = -4465045147709740544L;
      if (p == null) {
         return false;
      } else {
         class_1937 var1 = p.method_73183();
         Long2ObjectOpenHashMap var2 = IliIlllilIi(var1);
         if (var2 != null && !var2.isEmpty()) {
            class_238 var3 = p.method_5829();
            var22 ^= ((long)class_3532.method_15357(var3.field_1322 - 0.001) << 32 ^ var22) & -1L << 32;
            var22 ^= ((long)class_3532.method_15357(var3.field_1323) ^ var22) & -1L >>> 32;
            var24 ^= ((long)Math.max((int)var22, class_3532.method_15357(var3.field_1320 - 1.0E-7)) << 32 ^ var24) & -1L << 32;
            var24 ^= ((long)class_3532.method_15357(var3.field_1321) ^ var24) & -1L >>> 32;
            var26 ^= ((long)Math.max((int)var24, class_3532.method_15357(var3.field_1324 - 1.0E-7)) << 32 ^ var26) & -1L << 32;
            class_3726 var9 = class_3726.method_16195(p);
            class_2339 var10 = new class_2339();
            var26 ^= (0L ^ var26) & -1L >>> 32;
            var28 ^= (0L ^ var28) & -1L << 32;
            double var13 = Double.NEGATIVE_INFINITY;
            double var15 = Double.NEGATIVE_INFINITY;

            for (var28 ^= ((long)((int)var22) ^ var28) & -1L >>> 32; (int)var28 <= (int)(var24 >>> 32); var28 ^= (var28 ^ var28 + (long)1) & -1L >>> 32) {
               for (var30 ^= ((long)((int)var24) << 32 ^ var30) & -1L << 32; (int)(var30 >>> 32) <= (int)(var26 >>> 32); var30 += 4294967296L) {
                  var10.method_10103((int)var28, (int)(var22 >>> 32), (int)(var30 >>> 32));
                  class_265 var19 = var1.method_8320(var10).method_26194(var1, var10, var9);
                  if (!var19.method_1110()) {
                     double var20 = (double)((int)(var22 >>> 32)) + var19.method_1105(class_2351.field_11052);
                     if (!(var20 < var3.field_1322 - 0.002)) {
                        if (var2.containsKey(var10.method_10063())) {
                           var28 += 4294967296L;
                           if (var20 > var15) {
                              var15 = var20;
                           }
                        } else {
                           var26 ^= (var26 ^ var26 + (long)1) & -1L >>> 32;
                           if (var20 > var13) {
                              var13 = var20;
                           }
                        }
                     }
                  }
               }
            }

            return Iilllilliill((int)var26, (int)(var28 >>> 32)) || var15 > var13 + 0.002;
         } else {
            return false;
         }
      }
   }

   public static void Iilililiiili(boolean entity) {
      if (entity) {
         lIlIiiIIIl++;
      } else {
         IIlIiiIIIl++;
      }
   }

   private static Long2ObjectOpenHashMap<?> IliIlllilIi(class_1937 w) {
      if (w instanceof class_638 var1) {
         class_7202 var2 = ((AccessorClientWorldPending)var1).corzPendingUpdates();
         return var2 == null ? null : ((AccessorPendingUpdateManager)var2).corzPendingByPos();
      } else {
         return null;
      }
   }

   private iliilliIiiilli() {
   }
}
