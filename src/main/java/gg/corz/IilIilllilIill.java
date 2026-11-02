package gg.corz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2680;
import net.minecraft.class_3726;

public final class IilIilllilIill {
   public static final float iilIIiIIiIIiIIiIIi = 600.0F;
   private static final class_2350[] lIiIIiIIiiIiIIiIIi = new class_2350[]{
      class_2350.field_11043, class_2350.field_11035, class_2350.field_11039, class_2350.field_11034
   };

   public static int lIiiIiIlilli(class_1937 w, class_2338 feet) {
      long var8 = -8892334436360994189L;
      long var10 = 716911377805581300L;
      if (w != null && feet != null && iliIiiliiiii(w, feet) && iliIiiliiiii(w, feet.method_10084())) {
         var8 ^= (0L ^ var8) & -1L << 32;
         class_2350[] var3 = lIiIIiIIiiIiIIiIIi;
         var8 ^= ((long)var3.length ^ var8) & -1L >>> 32;

         for (long var14 = var10 ^ (0L ^ var10) & -1L << 32; (int)(var14 >>> 32) < (int)var8; var14 += 4294967296L) {
            class_2350 var6 = var3[(int)(var14 >>> 32)];
            class_2338 var7 = feet.method_10093(var6);
            if (!w.method_8320(var7).method_27852(class_2246.field_23152)
               && !iliIiiliiiii(w, var7)
               && (iliIiiliiiii(w, var7.method_10084()) || iliIiiliiiii(w, var7.method_10086(2)))) {
               var8 += 4294967296L;
            }
         }

         return (int)(var8 >>> 32);
      } else {
         return 0;
      }
   }

   private static boolean iliIiiliiiii(class_1937 w, class_2338 p) {
      class_2680 var2 = w.method_8320(p);
      return var2.method_26220(w, p).method_1110() && var2.method_26227().method_15769();
   }

   public static List<class_2338> iIlIlllllill(class_1937 feet, class_2338 w) {
      long var10 = 468683823483880422L;
      ArrayList var2 = new ArrayList(4);
      if (feet != null && w != null) {
         class_2680 var3 = class_2246.field_10540.method_9564();
         class_2350[] var4 = lIiIIiIIiiIiIIiIIi;
         var10 ^= ((long)var4.length << 32 ^ var10) & -1L << 32;

         for (long var13 = var10 ^ (0L ^ var10) & -1L >>> 32; (int)var13 < (int)(var13 >>> 32); var13 ^= (var13 ^ var13 + (long)1) & -1L >>> 32) {
            class_2350 var7 = var4[(int)var13];
            class_2338 var8 = w.method_10093(var7);
            class_2680 var9 = feet.method_8320(var8);
            if (var9.method_45474() && feet.method_8628(var3, var8, class_3726.method_16194())) {
               var2.add(var8);
            }
         }

         return var2;
      } else {
         return var2;
      }
   }

   public static List<IlillIllllillIll> IilliliilIIi(class_1937 w, class_2338 max, int center, int radius) {
      long var13 = -5672213747480806877L;
      long var15 = 6540928575732321411L;
      ArrayList var4 = new ArrayList();
      if (w != null && max != null && radius > 0) {
         var13 ^= ((long)Math.max(0, center) << 32 ^ var13) & -1L << 32;
         double var6 = ((double)((int)(var13 >>> 32)) + 0.5) * ((double)((int)(var13 >>> 32)) + 0.5);

         for (long var18 = var13 ^ (-2L ^ var13) & -1L >>> 32; (int)var18 <= 2; var18 ^= (var18 ^ var18 + (long)1) & -1L >>> 32) {
            var15 ^= ((long)(-((int)(var18 >>> 32))) << 32 ^ var15) & -1L << 32;

            while ((int)(var15 >>> 32) <= (int)(var18 >>> 32)) {
               for (var15 ^= ((long)(-((int)(var18 >>> 32))) ^ var15) & -1L >>> 32;
                  (int)var15 <= (int)(var18 >>> 32);
                  var15 ^= (var15 ^ var15 + (long)1) & -1L >>> 32
               ) {
                  if (!((double)((int)(var15 >>> 32) * (int)(var15 >>> 32) + (int)var15 * (int)var15 + (int)var18 * (int)var18) > var6)) {
                     class_2338 var11 = max.method_10069((int)(var15 >>> 32), (int)var18, (int)var15);
                     if (IliIlllilIi(w.method_8320(var11.method_10074())) && iliIiiliiiii(w, var11)) {
                        IlillIllllillIll var12 = liiiIIllIl(w, var11);
                        if (var12 != null && var12.liiiIIllIl() != iiIIiilIIlIiil.IliIliIlilliIliIli && var12.iIlIlllllill() <= 2) {
                           var4.add(var12);
                        }
                     }
                  }
               }

               var15 += 4294967296L;
            }
         }

         var4.sort(Comparator.<IlillIllllillIll>comparingDouble(h -> h.IliIlllilIi().method_10262(max)).thenComparingInt(IlillIllllillIll::iIlIlllllill));
         return var4.size() > radius ? new ArrayList<>(var4.subList(0, radius)) : var4;
      } else {
         return var4;
      }
   }

   public static boolean IliIlllilIi(class_2680 s) {
      return s != null && s.method_26204().method_9520() >= 600.0F;
   }

   public static IlillIllllillIll liiiIIllIl(class_1937 w, class_2338 feet) {
      long var10 = 594637192901832403L;
      long var12 = 6461245811507524108L;
      if (w != null && feet != null) {
         class_2338 var2 = feet.method_10074();
         class_2680 var3 = w.method_8320(var2);
         ArrayList var4 = new ArrayList(4);
         class_2350[] var5 = lIiIIiIIiiIiIIiIIi;
         var10 ^= ((long)var5.length << 32 ^ var10) & -1L << 32;

         for (var10 ^= (0L ^ var10) & -1L >>> 32; (int)var10 < (int)(var10 >>> 32); var10 ^= (var10 ^ var10 + (long)1) & -1L >>> 32) {
            class_2350 var8 = var5[(int)var10];
            var4.add(feet.method_10093(var8));
         }

         if (iliIiiliiiii(w, feet) && iliIiiliiiii(w, feet.method_10084()) && IliIlllilIi(var3)) {
            var12 ^= ((long)var3.method_27852(class_2246.field_9987) << 32 ^ var12) & -1L << 32;
            ArrayList var6 = new ArrayList(4);

            for (class_2338 var14 : var4) {
               class_2680 var9 = w.method_8320(var14);
               if (IliIlllilIi(var9)) {
                  if (!var9.method_27852(class_2246.field_9987)) {
                     var12 ^= (0L ^ var12) & -1L << 32;
                  }
               } else {
                  var6.add(var14);
               }
            }

            var10 ^= ((long)var6.size() ^ var10) & -1L >>> 32;
            iiIIiilIIlIiil var15;
            if ((int)var10 == 4) {
               var15 = iiIIiilIIlIiil.IliIliIlilliIliIli;
            } else if ((int)var10 > 0) {
               var15 = iiIIiilIIlIiil.iliIliIliIiiIliIli;
            } else {
               var15 = (int)(var12 >>> 32) != 0 ? iiIIiilIIlIiil.IIIlliIlilIIlliIli : iiIIiilIIlIiil.liiIliIliiiiIliIli;
            }

            return new IlillIllllillIll(feet, var15, (int)var10, List.copyOf(var6));
         } else {
            return new IlillIllllillIll(feet, iiIIiilIIlIiil.IliIliIlilliIliIli, 4, var4);
         }
      } else {
         return null;
      }
   }

   private IilIilllilIill() {
   }
}
