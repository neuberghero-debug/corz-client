package gg.corz;

import com.mojang.blaze3d.textures.GpuTextureView;
import java.util.concurrent.CompletableFuture;
import net.minecraft.class_1011;
import net.minecraft.class_1043;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_332;

public final class ilIiiiiIiIiiii {
   public static final int ililllIlIl = 3;
   public static final int llilllIlIl = 2;
   private static final class_1043[] iiilllIlIl = new class_1043[4];
   public static final int IiilllIlIl = 4;
   public static final int IlilllIlIl = 1;
   private static final CompletableFuture<int[]>[] lIIillIlIl = new CompletableFuture[4];
   public static final int iIilllIlIl = 0;
   private static final long[] IIIillIlIl = new long[4];
   private static boolean iIIillIlIl;
   private static final float liilllIlIl = 220.0F;

   public static void iIlIlllllill() {
      long var3 = -1805025174525909954L;
      if (!iIIillIlIl) {
         for (long var6 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var6 >>> 32) < 4; var6 += 4294967296L) {
            if (iiilllIlIl[(int)(var6 >>> 32)] == null && lIIillIlIl[(int)(var6 >>> 32)] == null) {
               var6 ^= ((long)((int)(var6 >>> 32)) ^ var6) & -1L >>> 32;

               try {
                  lIIillIlIl[(int)(var6 >>> 32)] = CompletableFuture.supplyAsync(() -> IIIllIIliIIl(kind));
               } catch (Throwable var5) {
                  IlIlllIlilIl(var5);
                  return;
               }
            }
         }
      }
   }

   public static void IilliliilIIi(class_332 y, int w, float h, float radius, float x, float ctx, float kind) {
      long var15 = -6295998923429447228L;
      if (!(x <= 0.0F) && !(ctx <= 0.0F)) {
         w = IiIlliIliiIl(w);
         var15 ^= ((long)liiIIiiiiIIi.iIiliiiiIliliiii[w] << 32 ^ var15) & -1L << 32;
         float var8 = lIiiIiIlilli(w);
         if (var8 < 0.999F) {
            IIIiiIillIIiiIil.IlIlllIlilIl(y, h, radius, x, ctx, kind, (int)(var15 >>> 32));
         }

         if (!(var8 <= 0.001F)) {
            try {
               GpuTextureView var9 = iiilllIlIl[w].method_71659();
               float var10 = x / ctx;
               float var11 = liiIIiiiiIIi.liiiIIllIl(var10);
               float var12 = liiIIiiiiIIi.iIlIlllllill(var10);
               float var13 = (1.0F - var11) / 2.0F;
               float var14 = (1.0F - var12) / 2.0F;
               IliiIilliiIi.Iiiiliiiiiii(
                  IIIiiIillIIiiIil.liiiIIllIl().method_23760().method_23761(),
                  h,
                  radius,
                  h + x,
                  radius + ctx,
                  var13,
                  var14,
                  var13 + var11,
                  var14 + var12,
                  var9,
                  kind,
                  var8
               );
            } catch (Throwable var17) {
               IlIlllIlilIl(var17);
            }
         }
      }
   }

   static int[] IIIllIIliIIl(int kind) {
      long var6 = -4543701402160957982L;
      long var8 = -7884464499841917392L;
      var6 ^= (1099511627776L ^ var6) & -1L << 32;
      var6 ^= (160L ^ var6) & -1L >>> 32;
      int[] var3 = new int[(int)(var6 >>> 32) * (int)var6];
      var8 ^= (0L ^ var8) & -1L << 32;

      while ((int)(var8 >>> 32) < (int)var6) {
         for (var8 ^= (0L ^ var8) & -1L >>> 32; (int)var8 < (int)(var6 >>> 32); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
            var3[(int)(var8 >>> 32) * (int)(var6 >>> 32) + (int)var8] = liiIIiiiiIIi.IliIlllilIi(
               kind, (int)var8, (int)(var8 >>> 32), (int)(var6 >>> 32), (int)var6
            );
         }

         var8 += 4294967296L;
      }

      return var3;
   }

   public static int liiiIIllIl(int kind) {
      return liiIIiiiiIIi.iIiliiiiIliliiii[IiIlliIliiIl(kind)];
   }

   private static float lIiiIiIlilli(int kind) {
      if (iIIillIlIl) {
         return 0.0F;
      } else if (iiilllIlIl[kind] == null && !iliIiiliiiii(kind)) {
         return 0.0F;
      } else {
         long var1 = IIIillIlIl[kind];
         float var3 = (float)(System.nanoTime() - var1) / 1000000.0F;
         return lliiiIliliiiIl.liiiIIllIl(var3 / 220.0F);
      }
   }

   private ilIiiiiIiIiiii() {
   }

   private static int IiIlliIliiIl(int kind) {
      return kind < 0 ? 0 : (kind >= 4 ? 3 : kind);
   }

   public static String IliIlllilIi(int kind) {
      return liiIIiiiiIIi.IIiliiiilIiliiii[IiIlliIliiIl(kind)];
   }

   private static boolean iliIiiliiiii(int kind) {
      long var7 = -9220254618831020126L;
      CompletableFuture var1 = lIIillIlIl[kind];
      if (var1 == null) {
         iIlIlllllill();
         return false;
      } else if (!var1.isDone()) {
         return false;
      } else {
         lIIillIlIl[kind] = null;

         try {
            int[] var2 = (int[])var1.join();
            class_1011 var3 = new class_1011(256, 160, false);

            for (long var10 = var7 ^ (0L ^ var7) & -1L << 32; (int)(var10 >>> 32) < var2.length; var10 += 4294967296L) {
               var3.method_61941((int)(var10 >>> 32) % 256, (int)(var10 >>> 32) / 256, var2[(int)(var10 >>> 32)]);
            }

            String var4 = Iilllilliill<"Iilllilliill","/MYbZf9RbLFfWkBnAYC+IZcDGfo+guvLoLKbXR/wXUGdhjjIy+y0CT7bsufGftxQcK0=">() + kind;
            class_1043 var5 = new class_1043(() -> var4, var3);
            class_2960 var6 = class_2960.method_60655(
               Iilllilliill<"Iilllilliill","9blWLe4RoQ6GFGtpBFPpZl4v6UEMZFdJirpHV8MZ6WvZv0BrMAM=">(),
               Iilllilliill<"Iilllilliill","Mxm6yyL4vWLA4ms9GV0l7jMIvK2KQ/RHGcOF+yzaR4VlhbSUQggxG7vIpTdbfvvfmw==">() + kind
            );
            class_310.method_1551().method_1531().method_4616(var6, var5);
            iiilllIlIl[kind] = var5;
            IIIillIlIl[kind] = System.nanoTime();
            return true;
         } catch (Throwable var9) {
            IlIlllIlilIl(var9);
            return false;
         }
      }
   }

   private static void IlIlllIlilIl(Throwable t) {
      if (!iIIillIlIl) {
         iIIillIlIl = true;
      }
   }
}
