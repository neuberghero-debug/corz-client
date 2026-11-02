package gg.corz;

import com.corz.client.mixins.AccessorMobSpawnerLogic;
import java.util.Map.Entry;
import java.util.function.Predicate;
import net.minecraft.class_1952;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2487;
import net.minecraft.class_2586;
import net.minecraft.class_2636;
import net.minecraft.class_2680;
import net.minecraft.class_2818;
import net.minecraft.class_2826;

public final class illiliIilili {
   private static final Predicate<class_2680> llIiIllIlilIiIllIl = state -> state.method_27852(class_2246.field_10260);

   public static String liiiIIllIl(class_2586 blockEntity) {
      if (blockEntity instanceof class_2636 var1) {
         try {
            class_1952 var2 = ((AccessorMobSpawnerLogic)var1.method_11390()).corz$getSpawnEntry();
            if (var2 == null) {
               return null;
            } else {
               class_2487 var3 = var2.comp_64();
               if (var3 == null) {
                  return null;
               } else {
                  String var4 = var3.method_68564(IilliliilIIi<"IilliliilIIi","RFmorE8P5xDe7kShpdy2z+NUOxMGvDRGcMDSwhJQ">(), "");
                  return lIIlilIiiIIlilIi.IliIlllilIi(var4);
               }
            }
         } catch (Throwable var5) {
            return null;
         }
      } else {
         return null;
      }
   }

   private illiliIilili() {
   }

   public static llliiillii IliIlllilIi(class_2818 maxY, int out, int chunk, llliiillii minY) {
      long var32 = 6845163415512642062L;
      long var20 = -3039308399660563173L;
      long var22 = 5145200562941615310L;
      long var24 = 6846933932881593122L;
      long var26 = 2369492654450504377L;
      long var28 = -6570482714852354333L;
      long var30 = -3743772777027064409L;
      minY.IliIlllilIi();
      class_2826[] var4 = maxY.method_12006();
      var20 ^= ((long)maxY.method_31607() << 32 ^ var20) & -1L << 32;
      var20 ^= ((long)maxY.method_12004().method_8326() ^ var20) & -1L >>> 32;
      var22 ^= ((long)maxY.method_12004().method_8328() << 32 ^ var22) & -1L << 32;

      for (long var39 = var22 ^ (0L ^ var22) & -1L >>> 32; (int)var39 < var4.length; var39 ^= (var39 ^ var39 + (long)1) & -1L >>> 32) {
         var24 ^= ((long)((int)(var20 >>> 32) + ((int)var39 << 4)) << 32 ^ var24) & -1L << 32;
         if ((int)(var24 >>> 32) <= chunk && (int)(var24 >>> 32) + 15 >= out) {
            class_2826 var10 = var4[(int)var39];
            if (var10 != null && !var10.method_38292() && var10.method_19523(llIiIllIlilIiIllIl)) {
               minY.IIlIilIllIlIilIl++;
               var24 ^= ((long)(Math.max(out, (int)(var24 >>> 32)) - (int)(var24 >>> 32)) ^ var24) & -1L >>> 32;
               var26 ^= ((long)(Math.min(chunk, (int)(var24 >>> 32) + 15) - (int)(var24 >>> 32)) << 32 ^ var26) & -1L << 32;

               for (var26 ^= ((long)((int)var24) ^ var26) & -1L >>> 32; (int)var26 <= (int)(var26 >>> 32); var26 ^= (var26 ^ var26 + (long)1) & -1L >>> 32) {
                  var28 ^= (0L ^ var28) & -1L << 32;

                  while ((int)(var28 >>> 32) < 16) {
                     for (var28 ^= (0L ^ var28) & -1L >>> 32; (int)var28 < 16; var28 ^= (var28 ^ var28 + (long)1) & -1L >>> 32) {
                        if (var10.method_12254((int)var28, (int)var26, (int)(var28 >>> 32)).method_27852(class_2246.field_10260)) {
                           long var42 = var30 ^ ((long)((int)var20 + (int)var28) << 32 ^ var30) & -1L << 32;
                           var30 = var42 ^ ((long)((int)(var24 >>> 32) + (int)var26) ^ var42) & -1L >>> 32;
                           var32 ^= ((long)((int)(var39 >>> 32) + (int)(var28 >>> 32)) << 32 ^ var32) & -1L << 32;
                           class_2338 var19 = new class_2338((int)(var30 >>> 32), (int)var30, (int)(var32 >>> 32));
                           minY.liIIilIliiIIilIl
                              .put(iIiIiiIlIliIiiIl.lIiiIiIlilli((int)(var30 >>> 32), (int)var30, (int)(var32 >>> 32)), liiiIIllIl(maxY.method_8321(var19)));
                        }
                     }

                     var28 += 4294967296L;
                  }
               }
            } else {
               minY.iIlIilIlIllIilIl++;
            }
         }
      }

      for (Entry var9 : maxY.method_12214().entrySet()) {
         Object var11 = var9.getValue();
         if (var11 instanceof class_2636) {
            class_2636 var34 = (class_2636)var11;
            minY.lllIilIlillIilIl++;
            var11 = (class_2338)var9.getKey();
            if (var11.method_10264() >= out && var11.method_10264() <= chunk && maxY.method_8320((class_2338)var11).method_27852(class_2246.field_10260)) {
               long var12 = iIiIiiIlIliIiiIl.lIiiIiIlilli(var11.method_10263(), var11.method_10264(), var11.method_10260());
               String var14 = liiiIIllIl(var34);
               if (!minY.liIIilIliiIIilIl.containsKey(var12) || var14 != null && minY.liIIilIliiIIilIl.get(var12) == null) {
                  minY.liIIilIliiIIilIl.put(var12, var14);
               }
            }
         }
      }

      return minY;
   }
}
