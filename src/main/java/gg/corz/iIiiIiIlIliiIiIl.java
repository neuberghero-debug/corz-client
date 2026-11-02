package gg.corz;

import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.RecordComponent;
import java.util.Arrays;
import net.minecraft.class_2680;
import net.minecraft.class_2826;
import net.minecraft.class_2837;
import net.minecraft.class_2841;
import net.minecraft.class_6490;

public final class iIiiIiIlIliiIiIl {
   private static volatile boolean iiIilliIll;
   private static final MethodHandle liIilliIll;
   private static final int llIilliIll = 1024;
   public static final int IlIilliIll = 4096;
   private final Reference2IntOpenHashMap<class_2680> IllilliIll;
   public class_2680[] lIlilliIll;
   public int iIlilliIll;
   private static final MethodHandle IiIilliIll;
   public final int[] IIlilliIll = new int[4096];
   private static final MethodHandle ilIilliIll;

   private void iliIiiliiiii(class_2826 section) {
      long var9 = 8163320133867583283L;
      long var11 = -418475246956827397L;
      long var13 = -1167366723769247032L;
      this.IllilliIll.clear();
      var9 ^= (0L ^ var9) & -1L << 32;
      class_2680 var3 = null;
      var9 ^= (0L ^ var9) & -1L >>> 32;
      var11 ^= (0L ^ var11) & -1L << 32;

      while ((int)(var11 >>> 32) < 16) {
         for (var11 ^= (0L ^ var11) & -1L >>> 32; (int)var11 < 16; var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32) {
            for (var13 ^= (0L ^ var13) & -1L << 32; (int)(var13 >>> 32) < 16; var13 += 4294967296L) {
               class_2680 var8 = section.method_12254((int)(var13 >>> 32), (int)(var11 >>> 32), (int)var11);
               if (var8 != var3) {
                  var3 = var8;
                  var9 ^= ((long)this.IllilliIll.getInt(var8) ^ var9) & -1L >>> 32;
                  if ((int)var9 < 0) {
                     int var10000 = (int)(var9 >>> 32);
                     long var17 = var9 + 4294967296L;
                     var9 = var17 ^ ((long)var10000 ^ var17) & -1L >>> 32;
                     this.IllilliIll.put(var8, (int)var9);
                     if (this.lIlilliIll.length < (int)(var9 >>> 32)) {
                        this.lIlilliIll = Arrays.copyOf(this.lIlilliIll, this.lIlilliIll.length * 2);
                     }

                     this.lIlilliIll[(int)var9] = var8;
                  }
               }

               this.IIlilliIll[IliIlllilIi((int)(var13 >>> 32), (int)(var11 >>> 32), (int)var11)] = (int)var9;
            }
         }

         var11 += 4294967296L;
      }

      this.iIlilliIll = (int)(var9 >>> 32);
   }

   private boolean IilliliilIIi(class_2826 section) {
      long var7 = -9121781713681371583L;

      try {
         Object var2 = (Object)ilIilliIll.invoke((class_2841)section.method_12265());
         class_6490 var3 = (class_6490)IiIilliIll.invoke((Object)var2);
         class_2837 var4 = (class_2837)liIilliIll.invoke((Object)var2);
         var7 ^= ((long)var4.method_12197() << 32 ^ var7) & -1L << 32;
         if ((int)(var7 >>> 32) > 0 && (int)(var7 >>> 32) <= 1024 && var3.method_15215() == 4096) {
            if (this.lIlilliIll.length < (int)(var7 >>> 32)) {
               this.lIlilliIll = new class_2680[Math.max((int)(var7 >>> 32), this.lIlilliIll.length * 2)];
            }

            for (var7 ^= (0L ^ var7) & -1L >>> 32; (int)var7 < (int)(var7 >>> 32); var7 ^= (var7 ^ var7 + (long)1) & -1L >>> 32) {
               this.lIlilliIll[(int)var7] = (class_2680)var4.method_12288((int)var7);
            }

            this.iIlilliIll = (int)(var7 >>> 32);
            var3.method_39892(this.IIlilliIll);
            if (this.lIiiIiIlilli(section, 0, 0, 0) && this.lIiiIiIlilli(section, 5, 9, 13) && this.lIiiIiIlilli(section, 15, 15, 15)) {
               return true;
            } else {
               iiIilliIll = false;
               return false;
            }
         } else {
            return false;
         }
      } catch (Throwable var9) {
         return false;
      }
   }

   private boolean lIiiIiIlilli(class_2826 z, int section, int x, int y) {
      long var6 = -3939222435204474496L;
      var6 ^= ((long)this.IIlilliIll[IliIlllilIi(section, x, y)] << 32 ^ var6) & -1L << 32;
      return (int)(var6 >>> 32) >= 0 && (int)(var6 >>> 32) < this.iIlilliIll && this.lIlilliIll[(int)(var6 >>> 32)] == z.method_12254(section, x, y);
   }

   public static boolean liiiIIllIl() {
      return iiIilliIll;
   }

   public iIiiIiIlIliiIiIl() {
      this.lIlilliIll = new class_2680[64];
      this.IllilliIll = new Reference2IntOpenHashMap();
      this.IllilliIll.defaultReturnValue(-1);
   }

   public static int IliIlllilIi(int x, int y, int z) {
      return y << 8 | z << 4 | x;
   }

   public void iIlIlllllill(class_2826 section) {
      if (!iiIilliIll || !this.IilliliilIIi(section)) {
         this.iliIiiliiiii(section);
      }
   }

   static {
      long var16 = -4640433831235681714L;
      long var14 = -6567863865869814273L;
      MethodHandle var0 = null;
      MethodHandle var1 = null;
      MethodHandle var2 = null;

      try {
         Lookup var3 = MethodHandles.lookup();
         Field[] var4 = class_2841.class.getDeclaredFields();
         var14 ^= ((long)var4.length << 32 ^ var14) & -1L << 32;

         for (long var20 = var14 ^ (0L ^ var14) & -1L >>> 32; (int)var20 < (int)(var20 >>> 32); var20 ^= (var20 ^ var20 + (long)1) & -1L >>> 32) {
            Field var7 = var4[(int)var20];
            if (!Modifier.isStatic(var7.getModifiers()) && var7.getType().isRecord()) {
               MethodHandle var8 = null;
               MethodHandle var9 = null;
               RecordComponent[] var10 = var7.getType().getRecordComponents();
               var16 ^= ((long)var10.length << 32 ^ var16) & -1L << 32;

               for (var16 ^= (0L ^ var16) & -1L >>> 32; (int)var16 < (int)(var16 >>> 32); var16 ^= (var16 ^ var16 + (long)1) & -1L >>> 32) {
                  RecordComponent var13 = var10[(int)var16];
                  if (class_6490.class.isAssignableFrom(var13.getType())) {
                     var13.getAccessor().setAccessible(true);
                     var8 = var3.unreflect(var13.getAccessor());
                  } else if (class_2837.class.isAssignableFrom(var13.getType())) {
                     var13.getAccessor().setAccessible(true);
                     var9 = var3.unreflect(var13.getAccessor());
                  }
               }

               if (var8 != null && var9 != null) {
                  var7.setAccessible(true);
                  var0 = var3.unreflectGetter(var7);
                  var1 = var8;
                  var2 = var9;
                  break;
               }
            }
         }
      } catch (Throwable var18) {
         var0 = null;
      }

      ilIilliIll = var0;
      IiIilliIll = var1;
      liIilliIll = var2;
      iiIilliIll = var0 != null && var1 != null && var2 != null;
   }
}
