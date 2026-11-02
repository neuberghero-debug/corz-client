package gg.corz;

import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.AddressMode;
import com.mojang.blaze3d.textures.FilterMode;
import java.util.Arrays;
import java.util.Locale;
import java.util.OptionalDouble;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.minecraft.class_1011;
import net.minecraft.class_1060;
import net.minecraft.class_12137;
import net.minecraft.class_1921;
import net.minecraft.class_310;

public final class iiiIIlllIIIlIlll {
   private static final long IIlIlIIill = 500000000L;
   private static final int IiIIlIIill = 2;
   private static final int liIIlIIill = 3;
   private static long IllIlIIill;
   private static final ExecutorService lIlIlIIill = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new iilIlIliIIiIlIli(), r -> {
      Thread var1 = new Thread(r, IiIiliIiiiIi<"IiIiliIiiiIi","upBnhNRYHgnNWQ3eSW+vvOMGU6zfOSgU4+qtniKdQeGM50lFmZCLNh5q8Ap8mGo6iz/d">());
      var1.setDaemon(true);
      var1.setPriority(1);
      return var1;
   });
   private static final int ilIIlIIill = 1;
   private static final int iiIIlIIill = 8;
   private static final illIIlllIilIIlll[] IlIIlIIill = new illIIlllIilIIlll[]{
      illIIlllIilIIlll.ilIIIIIill, illIIlllIilIIlll.IiIIIIIill, illIIlllIilIIlll.liIIIIIill, illIIlllIilIIlll.iiIIIIIill
   };
   private static final ilIiiIllIiIiiIll[][] iIlIlIIill = new ilIiiIllIiIiiIll[IlIIlIIill.length][];
   private static final int llIIlIIill = 0;
   private static class_12137 illIlIIill;
   private static class_12137 lllIlIIill;

   private static ilIiiIllIiIiiIll iIlIlllllill(int finish, lIIllIiiIIllIi r) {
      ilIiiIllIiIiiIll[] var2 = iIlIlIIill[finish];
      if (var2 == null || r.iIlIlllllill() >= var2.length) {
         var2 = Arrays.copyOf(var2 == null ? new ilIiiIllIiIiiIll[0] : var2, Math.max(r.iIlIlllllill() + 1, IlIliIlllIliIl.IilliliilIIi().size()));
         iIlIlIIill[finish] = var2;
      }

      ilIiiIllIiIiiIll var3 = var2[r.iIlIlllllill()];
      if (var3 == null) {
         var3 = var2[r.iIlIlllllill()] = new ilIiiIllIiIiiIll(IlIIlIIill[finish], r);
      }

      return var3;
   }

   private iiiIIlllIIIlIlll() {
   }

   private static void IIlllIlliIll(class_1011[] imgs) {
      if (imgs != null) {
         for (class_1011 var4 : imgs) {
            if (var4 != null) {
               var4.close();
            }
         }
      }
   }

   private static void lIiiIiIlilli(ilIiiIllIiIiiIll e) {
      e.llliIiilll = 1;

      try {
         lIlIlIIill.execute(() -> IlIlllIlilIl(e));
      } catch (RuntimeException var2) {
         e.llliIiilll = 3;
      }
   }

   private static void Iilllilliill(class_1060 tm, ilIiiIllIiIiiIll keep) {
      while (true) {
         int var2 = 0;
         ilIiiIllIiIiiIll var3 = null;

         for (ilIiiIllIiIiiIll[] var7 : iIlIlIIill) {
            if (var7 != null) {
               for (ilIiiIllIiIiiIll var11 : var7) {
                  if (var11 != null && var11.llliIiilll == 2) {
                     var2++;
                     if (var11 != keep && (var3 == null || var11.iiliIiilll < var3.iiliIiilll)) {
                        var3 = var11;
                     }
                  }
               }
            }
         }

         if (var2 <= 8 || var3 == null) {
            return;
         }

         var3.illiIiilll = null;
         var3.liliIiilll = false;
         var3.llliIiilll = 0;
         tm.method_4615(var3.iIliIiilll);
         if (var3.lIliIiilll.liiiIIllIl()) {
            tm.method_4615(var3.IlliIiilll);
         }
      }
   }

   private static class_1011[] IiIlliIliiIl(int[][] w, int h, int levels) {
      class_1011[] var3 = new class_1011[w.length];

      try {
         for (int var4 = 0; var4 < w.length; var4++) {
            int var5 = h >> var4;
            int var6 = levels >> var4;
            class_1011 var7 = new class_1011(var5, var6, false);
            var3[var4] = var7;
            int[] var8 = w[var4];

            for (int var9 = 0; var9 < var6; var9++) {
               for (int var10 = 0; var10 < var5; var10++) {
                  var7.method_61941(var10, var9, var8[var9 * var5 + var10]);
               }
            }
         }

         return var3;
      } catch (RuntimeException var11) {
         IIlllIlliIll(var3);
         throw var11;
      }
   }

   public static void iliIiiliiiii(illIIlllIilIIlll finish, lIIllIiiIIllIi rig) {
      long var5 = -7192911369280226472L;
      if (finish != null && rig != null && rig.iIlIlllllill() >= 0 && !rig.IliIlllilIi()) {
         var5 ^= ((long)IilliliilIIi(finish) << 32 ^ var5) & -1L << 32;
         if ((int)(var5 >>> 32) >= 0) {
            ilIiiIllIiIiiIll var3 = iIlIlllllill((int)(var5 >>> 32), rig);
            var3.IiliIiilll = System.nanoTime();
            if (var3.llliIiilll == 0) {
               lIiiIiIlilli(var3);
            } else if (var3.llliIiilll == ((~(~(-240094832 << 27 | -240094832 >>> 5)) >>> 3 | ~(~(-240094832 << 27 | -240094832 >>> 5)) << 29) ^ -1863208848)
               && !var3.liliIiilll) {
               try {
                  lIlIlIIill.execute(() -> IlIlllIlilIl(var3));
               } catch (RuntimeException var7) {
               }
            }
         }
      }
   }

   public static lllIlIlillIlIl liiiIIllIl(illIIlllIilIIlll rig, lIIllIiiIIllIi finish) {
      if (rig != null && finish != null && finish.iIlIlllllill() >= 0 && !finish.IliIlllilIi()) {
         int var2 = IilliliilIIi(rig);
         if (var2 < 0) {
            return null;
         } else {
            ilIiiIllIiIiiIll var3 = iIlIlllllill(var2, finish);
            long var4 = System.nanoTime();
            var3.iiliIiilll = ++IllIlIIill;
            var3.IiliIiilll = var4;
            lllIlIlillIlIl var6 = var3.illiIiilll;
            if (var6 == null && var3.llliIiilll == 0) {
               lIiiIiIlilli(var3);
            }

            for (int var7 = 0; var7 < IlIIlIIill.length; var7++) {
               if (var7 != var2 && IlIIlIIill[var7] != illIIlllIilIIlll.liIIIIIill) {
                  ilIiiIllIiIiiIll var8 = iIlIlllllill(var7, finish);
                  var8.iiliIiilll = IllIlIIill;
                  var8.IiliIiilll = var4;
                  if (var6 != null && var8.illiIiilll == null && var8.llliIiilll == 0) {
                     lIiiIiIlilli(var8);
                  }
               }
            }

            return var6;
         }
      } else {
         return null;
      }
   }

   private static class_12137 IIillIiliIil(GpuDevice mips, boolean device) {
      long var4 = -8191737324638289861L;
      class_12137 var2 = device ? lllIlIIill : illIlIIill;
      if (var2 != null) {
         return var2;
      } else {
         try {
            var4 ^= (
                  (long)Math.max(1, Math.min((~235998685 * 349184333 << 11 | ~235998685 * 349184333 >>> 21) ^ -1447962715, mips.getMaxSupportedAnisotropy()))
                        << 32
                     ^ var4
               )
               & -1L << 32;
            var2 = mips.createSampler(
               AddressMode.CLAMP_TO_EDGE,
               AddressMode.CLAMP_TO_EDGE,
               FilterMode.LINEAR,
               FilterMode.LINEAR,
               (int)(var4 >>> 32),
               device ? OptionalDouble.empty() : OptionalDouble.of(0.0)
            );
         } catch (RuntimeException var6) {
            return RenderSystem.getSamplerCache()
               .method_75293(AddressMode.CLAMP_TO_EDGE, AddressMode.CLAMP_TO_EDGE, FilterMode.LINEAR, FilterMode.LINEAR, device);
         }

         if (device) {
            lllIlIIill = var2;
         } else {
            illIlIIill = var2;
         }

         return var2;
      }
   }

   private static int IilliliilIIi(illIIlllIilIIlll rig) {
      for (int var1 = 0; var1 < IlIIlIIill.length; var1++) {
         if (IlIIlIIill[var1] == rig) {
            return var1;
         }
      }

      return -1;
   }

   public static boolean IIIllIIliIIl(illIIlllIilIIlll rig, lIIllIiiIIllIi finish) {
      long var5 = 5810528926227591524L;
      if (rig != null && finish != null && finish.iIlIlllllill() >= 0 && !finish.IliIlllilIi()) {
         var5 ^= ((long)IilliliilIIi(rig) << 32 ^ var5) & -1L << 32;
         if ((int)(var5 >>> 32) < 0) {
            return false;
         } else {
            ilIiiIllIiIiiIll[] var3 = iIlIlIIill[(int)(var5 >>> 32)];
            if (var3 != null && finish.iIlIlllllill() < var3.length) {
               ilIiiIllIiIiiIll var4 = var3[finish.iIlIlllllill()];
               return var4 != null && var4.llliIiilll == ((~(~-1581692704) >>> 23 | ~(~-1581692704) << 9) ^ 1922154816);
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   private static void IlIlllIlilIl(ilIiiIllIiIiiIll e) {
      if (!e.liliIiilll && e.llliIiilll == ((-(-1793353989) ^ -109) + -41 ^ -1793354132)) {
         e.liliIiilll = true;
         if (System.nanoTime() - e.IiliIiilll > (-2899501806032313684L ^ -2899501806397012052L)) {
            e.liliIiilll = false;
            e.llliIiilll = 0;
         } else {
            class_1011[] var1 = null;
            class_1011[] var2 = null;

            try {
               iliiillIiiiill var3 = IlIliIlllIliIl.IIillIiliIil(e.IIliIiilll, e.lIliIiilll);
               if (var3 == null) {
                  e.llliIiilll = 3;
                  return;
               }

               var1 = IiIlliIliiIl(var3.lIIIillIiiIIIillIi, var3.iIiilllIiIliilllIi, var3.lliilllIiiliilllIi);
               var2 = var3.IliIlllilIi() ? IiIlliIliiIl(var3.IlIIillIillIIillIi, var3.IiiilllIiliiilllIi, var3.iiiilllIiIIIIillIi) : null;
               iIiiliIiIliiliIi[] var6 = var3.ilIIillIiIiIIillIi;
               class_310 var7 = class_310.method_1551();
               if (var7 == null) {
                  IIlllIlliIll(var1);
                  IIlllIlliIll(var2);
                  e.llliIiilll = 3;
                  return;
               }

               var7.execute(() -> Illlllllilll(e, var1, var2, var6));
            } catch (Throwable var8) {
               IIlllIlliIll(var1);
               IIlllIlliIll(var2);
               e.llliIiilll = 3;
               System.err
                  .println(
                     IiIiliIiiiIi<"IiIiliIiiiIi","Th4EzecrO0JHDxo4vqFaSv1nT6GgXEdvK/x2GkzD">()
                        + e.lIliIiilll.lIiIllIiiiIiIllIii
                        + IiIiliIiiiIi<"IiIiliIiiiIi","mnNP5vXiENHMMD9P7UN61ODTIoeHpBuPCU8ZWetUWlvi6W91GRz4KH2Qljut">()
                        + var8
                  );
            }
         }
      }
   }

   private static void Illlllllilll(ilIiiIllIiIiiIll parts, class_1011[] base, class_1011[] glow, iIiiliIiIliiliIi[] e) {
      class_1060 var4 = null;

      try {
         var4 = class_310.method_1551().method_1531();
         var4.method_4616(parts.iIliIiilll, new lliIIiIliliIIiIl(parts.iIliIiilll.toString(), base));
         class_1921 var5 = null;
         if (glow != null) {
            var4.method_4616(parts.IlliIiilll, new lliIIiIliliIIiIl(parts.IlliIiilll.toString(), glow));
            var5 = IIIiIllllIIiIlll.IIillIiliIil(parts.IlliIiilll);
         }

         parts.illiIiilll = new lllIlIlillIlIl(IIIiIllllIIiIlll.Iilllilliill(parts.iIliIiilll), var5, e);
         parts.llliIiilll = 2;
         Iilllilliill(var4, parts);
      } catch (Throwable var12) {
         parts.illiIiilll = null;
         parts.llliIiilll = 3;
         if (var4 != null) {
            try {
               var4.method_4615(parts.iIliIiilll);
               var4.method_4615(parts.IlliIiilll);
            } catch (Throwable var11) {
            }
         }

         System.err
            .println(
               IiIiliIiiiIi<"IiIiliIiiiIi","Th4EzecrO0JHDxo4vqFaSv1nT6GgXEdvK/x2GkzD">()
                  + parts.lIliIiilll.lIiIllIiiiIiIllIii
                  + IiIiliIiiiIi<"IiIiliIiiiIi","xvh5mkU7KeZnUa8AKJ29sMpOlf30HY2Xib40Saa8kynbEEy1aKcLB1KqAxL73Vw=">()
                  + var12
            );
      } finally {
         IIlllIlliIll(base);
         IIlllIlliIll(glow);
      }
   }

   static String IliIlllilIi(String s) {
      StringBuilder var1 = new StringBuilder();

      for (char var5 : s.toLowerCase(Locale.ROOT).toCharArray()) {
         var1.append((var5 < 'a' || var5 > 'z') && (var5 < '0' || var5 > '9') ? '_' : var5);
      }

      return var1.toString();
   }
}
