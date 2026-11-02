package gg.corz;

import java.util.Arrays;
import net.minecraft.class_1044;
import net.minecraft.class_1047;
import net.minecraft.class_1058;
import net.minecraft.class_11582;
import net.minecraft.class_2248;
import net.minecraft.class_2281;
import net.minecraft.class_2336;
import net.minecraft.class_2350;
import net.minecraft.class_2531;
import net.minecraft.class_2680;
import net.minecraft.class_2745;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import net.minecraft.class_4608;
import net.minecraft.class_4722;
import net.minecraft.class_630;
import net.minecraft.class_7833;
import net.minecraft.class_9944;
import net.minecraft.class_11959.class_11960;

public final class iliIiiIiIiiIiiIi {
   private final class_630[] IIllIIIlIi;
   private static final int ilIlIIIlIi = 18;
   private static final int[] liIlIIIlIi = new int[6];
   private static final int IiIlIIIlIi = 15728880;
   private final class_1058[][] lIllIIIlIi;
   private static class_630[] iiIlIIIlIi;

   IlIliIilllIliIil liiiIIllIl(class_2680 state) {
      class_2248 var2 = state.method_26204();
      if (!(var2 instanceof class_2281) && !(var2 instanceof class_2336)) {
         return null;
      } else {
         try {
            class_2745 var3 = state.method_28498(class_2281.field_10770) ? (class_2745)state.method_11654(class_2281.field_10770) : class_2745.field_12569;
            class_11960 var4 = iIlIlllllill(var2);
            class_2745 var5 = var4 == class_11960.field_62697 ? class_2745.field_12569 : var3;
            class_1058 var6 = this.lIllIIIlIi[var4.ordinal()][var5.ordinal()];
            if (var6 == null) {
               return null;
            } else {
               class_2350 var7 = state.method_28498(class_2281.field_10768) ? (class_2350)state.method_11654(class_2281.field_10768) : class_2350.field_11043;
               class_4587 var8 = new class_4587();
               var8.method_46416(0.5F, 0.5F, 0.5F);
               var8.method_22907(class_7833.field_40716.rotationDegrees(-var7.method_10144()));
               var8.method_46416(-0.5F, -0.5F, -0.5F);
               iIlIiIiIllIiIi var9 = new iIlIiIiIllIiIi(var6);
               this.IIllIIIlIi[var3.ordinal()].method_22698(var8, var9, 15728880, class_4608.field_21444);
               return var9.iIlIilliiIllIillii != 0 && var9.lllIilliiillIillii == 0
                  ? new IlIliIilllIliIil(
                     Arrays.copyOf(var9.ilIIilliiIiIIillii, var9.IIlIilliilIlIillii), Arrays.copyOf(var9.liIIilliiiiIIillii, var9.iIlIilliiIllIillii)
                  )
                  : null;
            }
         } catch (Throwable var10) {
            return null;
         }
      }
   }

   public static iliIiiIiIiiIiiIi IliIlllilIi(class_310 mc) {
      long var17 = -5004729106858981668L;
      long var19 = 8130283575896431076L;
      long var15 = -7258626358280653783L;
      if (iiIlIIIlIi == null) {
         iiIlIIIlIi = new class_630[]{
            class_9944.method_62070().method_32109(), class_9944.method_62072().method_32109(), class_9944.method_62071().method_32109()
         };
      }

      class_1044 var1 = mc.method_1531().method_4619(class_4722.field_21709);
      if (var1 != null && var1.method_71659() != null) {
         class_11960[] var2 = class_11960.values();
         class_2745[] var3 = class_2745.values();
         class_1058[][] var4 = new class_1058[var2.length][var3.length];
         var15 ^= (0L ^ var15) & -1L << 32;
         class_11960[] var6 = var2;
         var15 ^= ((long)var2.length ^ var15) & -1L >>> 32;

         for (long var24 = var17 ^ (0L ^ var17) & -1L << 32; (int)(var24 >>> 32) < (int)var15; var24 += 4294967296L) {
            class_11960 var9 = var6[(int)(var24 >>> 32)];
            if (var9 != class_11960.field_62698) {
               class_2745[] var10 = var3;
               var24 ^= ((long)var3.length ^ var24) & -1L >>> 32;

               for (var19 ^= (0L ^ var19) & -1L << 32; (int)(var19 >>> 32) < (int)var24; var19 += 4294967296L) {
                  class_2745 var13 = var10[(int)(var19 >>> 32)];
                  if (var9 != class_11960.field_62697 || var13 == class_2745.field_12569) {
                     try {
                        class_1058 var14 = mc.method_72703().method_73030(class_4722.method_24062(var9, var13));
                        if (var14 != null && !class_1047.method_4539().equals(var14.method_45851().method_45816())) {
                           var4[var9.ordinal()][var13.ordinal()] = var14;
                           var15 += 4294967296L;
                        }
                     } catch (Throwable var21) {
                     }
                  }
               }
            }
         }

         return (int)(var15 >>> 32) == 0 ? null : new iliIiiIiIiiIiiIi(iiIlIIIlIi, var4);
      } else {
         return null;
      }
   }

   private static class_11960 iIlIlllllill(class_2248 b) {
      if (b instanceof class_2336) {
         return class_11960.field_62697;
      } else if (b instanceof class_11582 var1) {
         return switch (var1.method_72601()) {
            case field_28705 -> class_11960.field_62701;
            case field_28706 -> class_11960.field_62702;
            case field_28707 -> class_11960.field_62703;
            default -> class_11960.field_62700;
         };
      } else {
         return b instanceof class_2531 ? class_11960.field_62699 : class_11960.field_62704;
      }
   }

   private iliIiiIiIiiIiiIi(class_630[] sprites, class_1058[][] parts) {
      this.IIllIIIlIi = sprites;
      this.lIllIIIlIi = parts;
   }

   static {
      long var1 = 3423641307596661152L;

      for (long var3 = var1 ^ (0L ^ var1) & -1L << 32; (int)(var3 >>> 32) < 6; var3 += 4294967296L) {
         liIlIIIlIi[(int)(var3 >>> 32)] = iiIllIilIIlllIil.liiiIIllIl(
            iIlliIIlIllliIIl.iliIiiliiiii(16777215, iIlliIIlIllliIIl.lIiiIiIlilli((int)(var3 >>> 32)))
         );
      }
   }
}
