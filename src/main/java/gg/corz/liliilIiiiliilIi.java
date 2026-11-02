package gg.corz;

import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.util.Optional;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_1309;
import net.minecraft.class_1511;
import net.minecraft.class_1887;
import net.minecraft.class_1890;
import net.minecraft.class_1893;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2378;
import net.minecraft.class_238;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_5455;
import net.minecraft.class_6880;
import net.minecraft.class_746;
import net.minecraft.class_7924;
import net.minecraft.class_2338.class_2339;
import net.minecraft.class_2350.class_2351;

public final class liliilIiiiliilIi implements IlIIlIilllIIlIil {
   private final LongOpenHashSet IiliillIIi;
   private long iiliillIIi;
   private static class_5455 IlliillIIi;
   private static class_6880<class_1887> llliillIIi;
   private class_1937 liliillIIi;
   private final class_2339 illiillIIi = new class_2339();

   @Override
   public int iIlIlllllill(int z, int x, int y) {
      long var6 = 2852014853309072015L;
      class_1937 var4 = iliIiiliiiii();
      if (var4 == null) {
         return 0;
      } else {
         var6 ^= ((long)iIiIilIliIil.liiiIIllIl(var4, new class_2338(z, x, y)) << 32 ^ var6) & -1L << 32;
         if (this.IIIllIIliIIl(var4, z, x, y)) {
            var6 ^= ((long)((int)(var6 >>> 32) | 1048576) << 32 ^ var6) & -1L << 32;
         }

         return (int)(var6 >>> 32);
      }
   }

   static boolean lIiiIiIlilli() {
      class_310 var0 = class_310.method_1551();
      return var0 != null && var0.field_1687 != null && var0.field_1724 != null;
   }

   private boolean IIIllIIliIIl(class_1937 z, int x, int w, int y) {
      long var5 = z.method_75260();
      if (z != this.liliillIIi || var5 != this.iiliillIIi) {
         this.liliillIIi = z;
         this.iiliillIIi = var5;
         this.IlIlllIlilIl(z);
      }

      return this.IiliillIIi.isEmpty()
         ? false
         : this.IiliillIIi.contains(IIIiIllIIiIl.iIlIlllllill(x, w, y)) || this.IiliillIIi.contains(IIIiIllIIiIl.iIlIlllllill(x, w + 1, y));
   }

   @Override
   public double liiiIIllIl(int z, int y, int x) {
      class_1937 var4 = iliIiiliiiii();
      if (var4 == null) {
         return Double.NaN;
      } else {
         this.illiillIIi.method_10103(z, y, x);
         class_2680 var5 = var4.method_8320(this.illiillIIi);
         class_265 var6 = var5.method_26220(var4, this.illiillIIi);
         return var6.method_1110() ? Double.NaN : (double)y + var6.method_1105(class_2351.field_11052);
      }
   }

   public static float IiIlliIliiIl(class_1309 e) {
      long var5 = 2046736595845110297L;
      if (e == null) {
         return 0.0F;
      } else {
         class_310 var1 = class_310.method_1551();
         if (var1 != null && var1.field_1687 != null) {
            float var2 = lllIliIlillIliIl.iIiIlIliIl(e);
            class_5455 var3 = var1.field_1687.method_30349();
            if (var3 != IlliillIIi) {
               IlliillIIi = var3;
               llliillIIi = IIlllIlliIll(var3);
            }

            var5 ^= ((long)(llliillIIi == null ? 0 : class_1890.method_8225(llliillIIi, e.method_6118(class_1304.field_6166))) << 32 ^ var5) & -1L << 32;
            return var2 + 3.0F * (float)((int)(var5 >>> 32));
         } else {
            return 0.0F;
         }
      }
   }

   private void IlIlllIlilIl(class_1937 w) {
      long var18 = 3681047308304451316L;
      long var20 = 4126883343921868076L;
      long var22 = 8013702682610832214L;
      long var24 = -9220704332525896835L;
      long var26 = -2755205917578426176L;
      this.IiliillIIi.clear();
      class_310 var2 = class_310.method_1551();
      class_746 var3 = var2 == null ? null : var2.field_1724;
      if (var3 != null) {
         class_238 var4 = var3.method_5829().method_1009(32.0, 24.0, 32.0);
         var18 ^= (0L ^ var18) & -1L << 32;

         for (class_1511 var7 : w.method_8390(class_1511.class, var4, class_1297::method_5805)) {
            int var10000 = (int)(var18 >>> 32);
            var18 += 4294967296L;
            if (var10000 >= 24) {
               break;
            }

            class_238 var8 = var7.method_5829();
            var18 ^= ((long)((int)Math.floor(var8.field_1323)) ^ var18) & -1L >>> 32;
            var20 ^= ((long)((int)Math.floor(var8.field_1320 - 1.0E-6)) << 32 ^ var20) & -1L << 32;
            var20 ^= ((long)((int)Math.floor(var8.field_1322)) ^ var20) & -1L >>> 32;
            var22 ^= ((long)((int)Math.floor(var8.field_1325 - 1.0E-6)) << 32 ^ var22) & -1L << 32;
            var22 ^= ((long)((int)Math.floor(var8.field_1321)) ^ var22) & -1L >>> 32;
            var24 ^= ((long)((int)Math.floor(var8.field_1324 - 1.0E-6)) << 32 ^ var24) & -1L << 32;

            for (var24 ^= ((long)((int)var18) ^ var24) & -1L >>> 32; (int)var24 <= (int)(var20 >>> 32); var24 ^= (var24 ^ var24 + (long)1) & -1L >>> 32) {
               var26 ^= ((long)((int)var20) << 32 ^ var26) & -1L << 32;

               while ((int)(var26 >>> 32) <= (int)(var22 >>> 32)) {
                  for (var26 ^= ((long)((int)var22) ^ var26) & -1L >>> 32; (int)var26 <= (int)(var24 >>> 32); var26 ^= (var26 ^ var26 + (long)1) & -1L >>> 32) {
                     this.IiliillIIi.add(IIIiIllIIiIl.iIlIlllllill((int)var24, (int)(var26 >>> 32), (int)var26));
                  }

                  var26 += 4294967296L;
               }
            }
         }
      }
   }

   private static class_6880<class_1887> IIlllIlliIll(class_5455 registries) {
      Optional var1 = registries.method_46759(class_7924.field_41265);
      if (var1.isEmpty()) {
         return null;
      } else {
         Optional var2 = ((class_2378)var1.get()).method_46746(class_1893.field_9129);
         return var2.isPresent() ? (class_6880)var2.get() : null;
      }
   }

   private static class_1937 iliIiiliiiii() {
      class_310 var0 = class_310.method_1551();
      return var0 == null ? null : var0.field_1687;
   }

   @Override
   public int IilliliilIIi() {
      class_1937 var1 = iliIiiliiiii();
      return var1 == null ? -64 : var1.method_31607();
   }

   @Override
   public boolean IliIlllilIi(int z, int x, int y) {
      class_1937 var4 = iliIiiliiiii();
      if (var4 == null) {
         return false;
      } else {
         this.illiillIIi.method_10103(z, x, y);
         return !var4.method_8320(this.illiillIIi).method_26220(var4, this.illiillIIi).method_1110();
      }
   }

   public liliilIiiiliilIi() {
      this.IiliillIIi = new LongOpenHashSet();
      this.iiliillIIi = Long.MIN_VALUE;
   }
}
